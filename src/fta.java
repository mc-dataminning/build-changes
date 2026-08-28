import com.google.common.collect.Maps;
import com.google.gson.JsonElement;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class fta implements mo {
   private final mq.a d;
   private final mq.a e;
   private final mq.a f;

   public fta(mq $$0) {
      this.d = $$0.a(mq.b.b, "blockstates");
      this.e = $$0.a(mq.b.b, "items");
      this.f = $$0.a(mq.b.b, "models");
   }

   @Override
   public CompletableFuture<?> a(mm $$0) {
      fta.b $$1 = new fta.b();
      fta.a $$2 = new fta.a();
      fta.c $$3 = new fta.c();
      new fsw($$2, $$1, $$3).a();
      new fsy($$1, $$3).a();
      $$2.a();
      $$1.a();
      return CompletableFuture.allOf($$2.a($$0, this.d), $$3.a($$0, this.f), $$1.a($$0, this.e));
   }

   @Override
   public final String a() {
      return "Model Definitions";
   }

   static class a implements Consumer<ftc> {
      private final Map<dne, ftc> a = new HashMap<>();

      public void a(ftc $$0) {
         dne $$1 = $$0.a();
         ftc $$2 = this.a.put($$1, $$0);
         if ($$2 != null) {
            throw new IllegalStateException("Duplicate blockstate definition for " + $$1);
         }
      }

      public void a() {
         Stream<jg.c<dne>> $$0 = mh.e.c().filter($$0x -> true);
         List<alk> $$1 = $$0.filter($$0x -> !this.a.containsKey($$0x.a())).map($$0x -> $$0x.h().a()).toList();
         if (!$$1.isEmpty()) {
            throw new IllegalStateException("Missing blockstate definitions for: " + $$1);
         }
      }

      public CompletableFuture<?> a(mm $$0, mq.a $$1) {
         Map<dne, gtn> $$2 = Maps.transformValues(this.a, ftc::b);
         Function<dne, Path> $$3 = $$1x -> $$1.a($$1x.p().h().a());
         return mo.a($$0, gtn.a, $$3, $$2);
      }
   }

   static class b implements fsz {
      private final Map<czw, hhn> a = new HashMap<>();
      private final Map<czw, czw> b = new HashMap<>();

      @Override
      public void a(czw $$0, hhr.b $$1) {
         this.a($$0, new hhn($$1, hhn.a.a));
      }

      private void a(czw $$0, hhn $$1) {
         hhn $$2 = this.a.put($$0, $$1);
         if ($$2 != null) {
            throw new IllegalStateException("Duplicate item model definition for " + $$0);
         }
      }

      @Override
      public void a(czw $$0, czw $$1) {
         this.b.put($$1, $$0);
      }

      public void a() {
         mh.g.forEach($$0x -> {
            if (!this.b.containsKey($$0x)) {
               if ($$0x instanceof cyi $$1 && !this.a.containsKey($$1)) {
                  alk $$2 = ftm.a($$1.c());
                  this.a($$1, ftk.a($$2));
               }
            }
         });
         this.b.forEach(($$0x, $$1) -> {
            hhn $$2 = this.a.get($$1);
            if ($$2 == null) {
               throw new IllegalStateException("Missing donor: " + $$1 + " -> " + $$0x);
            } else {
               this.a($$0x, $$2);
            }
         });
         List<alk> $$0 = mh.g.c().filter($$0x -> !this.a.containsKey($$0x.a())).map($$0x -> $$0x.h().a()).toList();
         if (!$$0.isEmpty()) {
            throw new IllegalStateException("Missing item model definitions for: " + $$0);
         }
      }

      public CompletableFuture<?> a(mm $$0, mq.a $$1) {
         return mo.a($$0, hhn.a, $$1x -> $$1.a($$1x.e().h().a()), this.a);
      }
   }

   static class c implements BiConsumer<alk, ftl> {
      private final Map<alk, ftl> a = new HashMap<>();

      public void a(alk $$0, ftl $$1) {
         Supplier<JsonElement> $$2 = this.a.put($$0, $$1);
         if ($$2 != null) {
            throw new IllegalStateException("Duplicate model definition for " + $$0);
         }
      }

      public CompletableFuture<?> a(mm $$0, mq.a $$1) {
         return mo.a($$0, Supplier::get, $$1::a, this.a);
      }
   }
}
