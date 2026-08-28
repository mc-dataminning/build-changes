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

public class fqb implements mm {
   private final mo.a d;
   private final mo.a e;
   private final mo.a f;

   public fqb(mo $$0) {
      this.d = $$0.a(mo.b.b, "blockstates");
      this.e = $$0.a(mo.b.b, "items");
      this.f = $$0.a(mo.b.b, "models");
   }

   @Override
   public CompletableFuture<?> a(mk $$0) {
      fqb.b $$1 = new fqb.b();
      fqb.a $$2 = new fqb.a();
      fqb.c $$3 = new fqb.c();
      new fpx($$2, $$1, $$3).a();
      new fpz($$1, $$3).a();
      $$2.a();
      $$1.a();
      return CompletableFuture.allOf($$2.a($$0, this.d), $$3.a($$0, this.f), $$1.a($$0, this.e));
   }

   static <T> CompletableFuture<?> a(mk $$0, Function<T, Path> $$1, Map<T, ? extends Supplier<JsonElement>> $$2) {
      return mm.a($$0, Supplier::get, $$1, $$2);
   }

   @Override
   public final String a() {
      return "Model Definitions";
   }

   static class a implements Consumer<fqc> {
      private final Map<dlu, fqc> a = new HashMap<>();

      public void a(fqc $$0) {
         dlu $$1 = $$0.a();
         fqc $$2 = this.a.put($$1, $$0);
         if ($$2 != null) {
            throw new IllegalStateException("Duplicate blockstate definition for " + $$1);
         }
      }

      public void a() {
         Stream<je.c<dlu>> $$0 = mf.e.c().filter($$0x -> true);
         List<ale> $$1 = $$0.filter($$0x -> !this.a.containsKey($$0x.a())).map($$0x -> $$0x.h().a()).toList();
         if (!$$1.isEmpty()) {
            throw new IllegalStateException("Missing blockstate definitions for: " + $$1);
         }
      }

      public CompletableFuture<?> a(mk $$0, mo.a $$1) {
         return fqb.a($$0, $$1x -> $$1.a($$1x.p().h().a()), this.a);
      }
   }

   static class b implements fqa {
      private final Map<cyo, hel> a = new HashMap<>();
      private final Map<cyo, cyo> b = new HashMap<>();

      @Override
      public void a(cyo $$0, hep.b $$1) {
         this.a($$0, new hel($$1, hel.a.a));
      }

      private void a(cyo $$0, hel $$1) {
         hel $$2 = this.a.put($$0, $$1);
         if ($$2 != null) {
            throw new IllegalStateException("Duplicate item model definition for " + $$0);
         }
      }

      @Override
      public void a(cyo $$0, cyo $$1) {
         this.b.put($$1, $$0);
      }

      public void a() {
         mf.g.forEach($$0x -> {
            if (!this.b.containsKey($$0x)) {
               if ($$0x instanceof cxa $$1 && !this.a.containsKey($$1)) {
                  ale $$2 = fqp.a($$1.c());
                  this.a($$1, fqn.a($$2));
               }
            }
         });
         this.b.forEach(($$0x, $$1) -> {
            hel $$2 = this.a.get($$1);
            if ($$2 == null) {
               throw new IllegalStateException("Missing donor: " + $$1 + " -> " + $$0x);
            } else {
               this.a($$0x, $$2);
            }
         });
         List<ale> $$0 = mf.g.c().filter($$0x -> !this.a.containsKey($$0x.a())).map($$0x -> $$0x.h().a()).toList();
         if (!$$0.isEmpty()) {
            throw new IllegalStateException("Missing item model definitions for: " + $$0);
         }
      }

      public CompletableFuture<?> a(mk $$0, mo.a $$1) {
         return mm.a($$0, hel.a, $$1x -> $$1.a($$1x.e().h().a()), this.a);
      }
   }

   static class c implements BiConsumer<ale, fqo> {
      private final Map<ale, fqo> a = new HashMap<>();

      public void a(ale $$0, fqo $$1) {
         Supplier<JsonElement> $$2 = this.a.put($$0, $$1);
         if ($$2 != null) {
            throw new IllegalStateException("Duplicate model definition for " + $$0);
         }
      }

      public CompletableFuture<?> a(mk $$0, mo.a $$1) {
         return fqb.a($$0, $$1::a, this.a);
      }
   }
}
