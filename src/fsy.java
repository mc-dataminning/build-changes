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

public class fsy implements mn {
   private final mp.a d;
   private final mp.a e;
   private final mp.a f;

   public fsy(mp $$0) {
      this.d = $$0.a(mp.b.b, "blockstates");
      this.e = $$0.a(mp.b.b, "items");
      this.f = $$0.a(mp.b.b, "models");
   }

   @Override
   public CompletableFuture<?> a(ml $$0) {
      fsy.b $$1 = new fsy.b();
      fsy.a $$2 = new fsy.a();
      fsy.c $$3 = new fsy.c();
      new fsu($$2, $$1, $$3).a();
      new fsw($$1, $$3).a();
      $$2.a();
      $$1.a();
      return CompletableFuture.allOf($$2.a($$0, this.d), $$3.a($$0, this.f), $$1.a($$0, this.e));
   }

   @Override
   public final String a() {
      return "Model Definitions";
   }

   static class a implements Consumer<fta> {
      private final Map<dnc, fta> a = new HashMap<>();

      public void a(fta $$0) {
         dnc $$1 = $$0.a();
         fta $$2 = this.a.put($$1, $$0);
         if ($$2 != null) {
            throw new IllegalStateException("Duplicate blockstate definition for " + $$1);
         }
      }

      public void a() {
         Stream<jf.c<dnc>> $$0 = mg.e.c().filter($$0x -> true);
         List<ali> $$1 = $$0.filter($$0x -> !this.a.containsKey($$0x.a())).map($$0x -> $$0x.h().a()).toList();
         if (!$$1.isEmpty()) {
            throw new IllegalStateException("Missing blockstate definitions for: " + $$1);
         }
      }

      public CompletableFuture<?> a(ml $$0, mp.a $$1) {
         Map<dnc, gtl> $$2 = Maps.transformValues(this.a, fta::b);
         Function<dnc, Path> $$3 = $$1x -> $$1.a($$1x.p().h().a());
         return mn.a($$0, gtl.a, $$3, $$2);
      }
   }

   static class b implements fsx {
      private final Map<czu, hhl> a = new HashMap<>();
      private final Map<czu, czu> b = new HashMap<>();

      @Override
      public void a(czu $$0, hhp.b $$1) {
         this.a($$0, new hhl($$1, hhl.a.a));
      }

      private void a(czu $$0, hhl $$1) {
         hhl $$2 = this.a.put($$0, $$1);
         if ($$2 != null) {
            throw new IllegalStateException("Duplicate item model definition for " + $$0);
         }
      }

      @Override
      public void a(czu $$0, czu $$1) {
         this.b.put($$1, $$0);
      }

      public void a() {
         mg.g.forEach($$0x -> {
            if (!this.b.containsKey($$0x)) {
               if ($$0x instanceof cyg $$1 && !this.a.containsKey($$1)) {
                  ali $$2 = ftk.a($$1.c());
                  this.a($$1, fti.a($$2));
               }
            }
         });
         this.b.forEach(($$0x, $$1) -> {
            hhl $$2 = this.a.get($$1);
            if ($$2 == null) {
               throw new IllegalStateException("Missing donor: " + $$1 + " -> " + $$0x);
            } else {
               this.a($$0x, $$2);
            }
         });
         List<ali> $$0 = mg.g.c().filter($$0x -> !this.a.containsKey($$0x.a())).map($$0x -> $$0x.h().a()).toList();
         if (!$$0.isEmpty()) {
            throw new IllegalStateException("Missing item model definitions for: " + $$0);
         }
      }

      public CompletableFuture<?> a(ml $$0, mp.a $$1) {
         return mn.a($$0, hhl.a, $$1x -> $$1.a($$1x.e().h().a()), this.a);
      }
   }

   static class c implements BiConsumer<ali, ftj> {
      private final Map<ali, ftj> a = new HashMap<>();

      public void a(ali $$0, ftj $$1) {
         Supplier<JsonElement> $$2 = this.a.put($$0, $$1);
         if ($$2 != null) {
            throw new IllegalStateException("Duplicate model definition for " + $$0);
         }
      }

      public CompletableFuture<?> a(ml $$0, mp.a $$1) {
         return mn.a($$0, Supplier::get, $$1::a, this.a);
      }
   }
}
