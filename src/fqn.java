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

public class fqn implements mm {
   private final mo.a d;
   private final mo.a e;
   private final mo.a f;

   public fqn(mo $$0) {
      this.d = $$0.a(mo.b.b, "blockstates");
      this.e = $$0.a(mo.b.b, "items");
      this.f = $$0.a(mo.b.b, "models");
   }

   @Override
   public CompletableFuture<?> a(mk $$0) {
      fqn.b $$1 = new fqn.b();
      fqn.a $$2 = new fqn.a();
      fqn.c $$3 = new fqn.c();
      new fqj($$2, $$1, $$3).a();
      new fql($$1, $$3).a();
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

   static class a implements Consumer<fqo> {
      private final Map<dma, fqo> a = new HashMap<>();

      public void a(fqo $$0) {
         dma $$1 = $$0.a();
         fqo $$2 = this.a.put($$1, $$0);
         if ($$2 != null) {
            throw new IllegalStateException("Duplicate blockstate definition for " + $$1);
         }
      }

      public void a() {
         Stream<je.c<dma>> $$0 = mf.e.c().filter($$0x -> true);
         List<alg> $$1 = $$0.filter($$0x -> !this.a.containsKey($$0x.a())).map($$0x -> $$0x.h().a()).toList();
         if (!$$1.isEmpty()) {
            throw new IllegalStateException("Missing blockstate definitions for: " + $$1);
         }
      }

      public CompletableFuture<?> a(mk $$0, mo.a $$1) {
         return fqn.a($$0, $$1x -> $$1.a($$1x.p().h().a()), this.a);
      }
   }

   static class b implements fqm {
      private final Map<cyu, hfb> a = new HashMap<>();
      private final Map<cyu, cyu> b = new HashMap<>();

      @Override
      public void a(cyu $$0, hff.b $$1) {
         this.a($$0, new hfb($$1, hfb.a.a));
      }

      private void a(cyu $$0, hfb $$1) {
         hfb $$2 = this.a.put($$0, $$1);
         if ($$2 != null) {
            throw new IllegalStateException("Duplicate item model definition for " + $$0);
         }
      }

      @Override
      public void a(cyu $$0, cyu $$1) {
         this.b.put($$1, $$0);
      }

      public void a() {
         mf.g.forEach($$0x -> {
            if (!this.b.containsKey($$0x)) {
               if ($$0x instanceof cxg $$1 && !this.a.containsKey($$1)) {
                  alg $$2 = frb.a($$1.c());
                  this.a($$1, fqz.a($$2));
               }
            }
         });
         this.b.forEach(($$0x, $$1) -> {
            hfb $$2 = this.a.get($$1);
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
         return mm.a($$0, hfb.a, $$1x -> $$1.a($$1x.e().h().a()), this.a);
      }
   }

   static class c implements BiConsumer<alg, fra> {
      private final Map<alg, fra> a = new HashMap<>();

      public void a(alg $$0, fra $$1) {
         Supplier<JsonElement> $$2 = this.a.put($$0, $$1);
         if ($$2 != null) {
            throw new IllegalStateException("Duplicate model definition for " + $$0);
         }
      }

      public CompletableFuture<?> a(mk $$0, mo.a $$1) {
         return fqn.a($$0, $$1::a, this.a);
      }
   }
}
