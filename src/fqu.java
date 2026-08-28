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

public class fqu implements mm {
   private final mo.a d;
   private final mo.a e;
   private final mo.a f;

   public fqu(mo $$0) {
      this.d = $$0.a(mo.b.b, "blockstates");
      this.e = $$0.a(mo.b.b, "items");
      this.f = $$0.a(mo.b.b, "models");
   }

   @Override
   public CompletableFuture<?> a(mk $$0) {
      fqu.b $$1 = new fqu.b();
      fqu.a $$2 = new fqu.a();
      fqu.c $$3 = new fqu.c();
      new fqq($$2, $$1, $$3).a();
      new fqs($$1, $$3).a();
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

   static class a implements Consumer<fqv> {
      private final Map<dmf, fqv> a = new HashMap<>();

      public void a(fqv $$0) {
         dmf $$1 = $$0.a();
         fqv $$2 = this.a.put($$1, $$0);
         if ($$2 != null) {
            throw new IllegalStateException("Duplicate blockstate definition for " + $$1);
         }
      }

      public void a() {
         Stream<je.c<dmf>> $$0 = mf.e.c().filter($$0x -> true);
         List<alg> $$1 = $$0.filter($$0x -> !this.a.containsKey($$0x.a())).map($$0x -> $$0x.h().a()).toList();
         if (!$$1.isEmpty()) {
            throw new IllegalStateException("Missing blockstate definitions for: " + $$1);
         }
      }

      public CompletableFuture<?> a(mk $$0, mo.a $$1) {
         return fqu.a($$0, $$1x -> $$1.a($$1x.p().h().a()), this.a);
      }
   }

   static class b implements fqt {
      private final Map<cyz, hfj> a = new HashMap<>();
      private final Map<cyz, cyz> b = new HashMap<>();

      @Override
      public void a(cyz $$0, hfn.b $$1) {
         this.a($$0, new hfj($$1, hfj.a.a));
      }

      private void a(cyz $$0, hfj $$1) {
         hfj $$2 = this.a.put($$0, $$1);
         if ($$2 != null) {
            throw new IllegalStateException("Duplicate item model definition for " + $$0);
         }
      }

      @Override
      public void a(cyz $$0, cyz $$1) {
         this.b.put($$1, $$0);
      }

      public void a() {
         mf.g.forEach($$0x -> {
            if (!this.b.containsKey($$0x)) {
               if ($$0x instanceof cxl $$1 && !this.a.containsKey($$1)) {
                  alg $$2 = fri.a($$1.c());
                  this.a($$1, frg.a($$2));
               }
            }
         });
         this.b.forEach(($$0x, $$1) -> {
            hfj $$2 = this.a.get($$1);
            if ($$2 == null) {
               throw new IllegalStateException("Missing donor: " + $$1 + " -> " + $$0x);
            } else {
               this.a($$0x, $$2);
            }
         });
         List<alg> $$0 = mf.g.c().filter($$0x -> !this.a.containsKey($$0x.a())).map($$0x -> $$0x.h().a()).toList();
         if (!$$0.isEmpty()) {
            throw new IllegalStateException("Missing item model definitions for: " + $$0);
         }
      }

      public CompletableFuture<?> a(mk $$0, mo.a $$1) {
         return mm.a($$0, hfj.a, $$1x -> $$1.a($$1x.e().h().a()), this.a);
      }
   }

   static class c implements BiConsumer<alg, frh> {
      private final Map<alg, frh> a = new HashMap<>();

      public void a(alg $$0, frh $$1) {
         Supplier<JsonElement> $$2 = this.a.put($$0, $$1);
         if ($$2 != null) {
            throw new IllegalStateException("Duplicate model definition for " + $$0);
         }
      }

      public CompletableFuture<?> a(mk $$0, mo.a $$1) {
         return fqu.a($$0, $$1::a, this.a);
      }
   }
}
