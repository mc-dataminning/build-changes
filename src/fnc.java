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

public class fnc implements mi {
   private final mk.a d;
   private final mk.a e;
   private final mk.a f;

   public fnc(mk $$0) {
      this.d = $$0.a(mk.b.b, "blockstates");
      this.e = $$0.a(mk.b.b, "items");
      this.f = $$0.a(mk.b.b, "models");
   }

   @Override
   public CompletableFuture<?> a(mg $$0) {
      fnc.b $$1 = new fnc.b();
      fnc.a $$2 = new fnc.a();
      fnc.c $$3 = new fnc.c();
      new fmy($$2, $$1, $$3).a();
      new fna($$1, $$3).a();
      $$2.a();
      $$1.a();
      return CompletableFuture.allOf($$2.a($$0, this.d), $$3.a($$0, this.f), $$1.a($$0, this.e));
   }

   static <T> CompletableFuture<?> a(mg $$0, Function<T, Path> $$1, Map<T, ? extends Supplier<JsonElement>> $$2) {
      return mi.a($$0, Supplier::get, $$1, $$2);
   }

   @Override
   public final String a() {
      return "Model Definitions";
   }

   static class a implements Consumer<fnd> {
      private final Map<djl, fnd> a = new HashMap<>();

      public void a(fnd $$0) {
         djl $$1 = $$0.a();
         fnd $$2 = this.a.put($$1, $$0);
         if ($$2 != null) {
            throw new IllegalStateException("Duplicate blockstate definition for " + $$1);
         }
      }

      public void a() {
         Stream<jr.c<djl>> $$0 = mb.e.c().filter($$0x -> true);
         List<akv> $$1 = $$0.filter($$0x -> !this.a.containsKey($$0x.a())).map($$0x -> $$0x.h().a()).toList();
         if (!$$1.isEmpty()) {
            throw new IllegalStateException("Missing blockstate definitions for: " + $$1);
         }
      }

      public CompletableFuture<?> a(mg $$0, mk.a $$1) {
         return fnc.a($$0, $$1x -> $$1.a($$1x.p().h().a()), this.a);
      }
   }

   static class b implements fnb {
      private final Map<cwk, hbg> a = new HashMap<>();
      private final Map<cwk, cwk> b = new HashMap<>();

      @Override
      public void a(cwk $$0, hbk.b $$1) {
         this.a($$0, new hbg($$1, hbg.a.a));
      }

      private void a(cwk $$0, hbg $$1) {
         hbg $$2 = this.a.put($$0, $$1);
         if ($$2 != null) {
            throw new IllegalStateException("Duplicate item model definition for " + $$0);
         }
      }

      @Override
      public void a(cwk $$0, cwk $$1) {
         this.b.put($$1, $$0);
      }

      public void a() {
         mb.g.forEach($$0x -> {
            if (!this.b.containsKey($$0x)) {
               if ($$0x instanceof cuu $$1 && !this.a.containsKey($$1)) {
                  akv $$2 = fnq.a($$1.d());
                  this.a($$1, fno.a($$2));
               }
            }
         });
         this.b.forEach(($$0x, $$1) -> {
            hbg $$2 = this.a.get($$1);
            if ($$2 == null) {
               throw new IllegalStateException("Missing donor: " + $$1 + " -> " + $$0x);
            } else {
               this.a($$0x, $$2);
            }
         });
         List<akv> $$0 = mb.g.c().filter($$0x -> !this.a.containsKey($$0x.a())).map($$0x -> $$0x.h().a()).toList();
         if (!$$0.isEmpty()) {
            throw new IllegalStateException("Missing item model definitions for: " + $$0);
         }
      }

      public CompletableFuture<?> a(mg $$0, mk.a $$1) {
         return mi.a($$0, hbg.a, $$1x -> $$1.a($$1x.f().h().a()), this.a);
      }
   }

   static class c implements BiConsumer<akv, fnp> {
      private final Map<akv, fnp> a = new HashMap<>();

      public void a(akv $$0, fnp $$1) {
         Supplier<JsonElement> $$2 = this.a.put($$0, $$1);
         if ($$2 != null) {
            throw new IllegalStateException("Duplicate model definition for " + $$0);
         }
      }

      public CompletableFuture<?> a(mg $$0, mk.a $$1) {
         return fnc.a($$0, $$1::a, this.a);
      }
   }
}
