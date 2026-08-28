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

public class foy implements mk {
   private final mm.a d;
   private final mm.a e;
   private final mm.a f;

   public foy(mm $$0) {
      this.d = $$0.a(mm.b.b, "blockstates");
      this.e = $$0.a(mm.b.b, "items");
      this.f = $$0.a(mm.b.b, "models");
   }

   @Override
   public CompletableFuture<?> a(mi $$0) {
      foy.b $$1 = new foy.b();
      foy.a $$2 = new foy.a();
      foy.c $$3 = new foy.c();
      new fou($$2, $$1, $$3).a();
      new fow($$1, $$3).a();
      $$2.a();
      $$1.a();
      return CompletableFuture.allOf($$2.a($$0, this.d), $$3.a($$0, this.f), $$1.a($$0, this.e));
   }

   static <T> CompletableFuture<?> a(mi $$0, Function<T, Path> $$1, Map<T, ? extends Supplier<JsonElement>> $$2) {
      return mk.a($$0, Supplier::get, $$1, $$2);
   }

   @Override
   public final String a() {
      return "Model Definitions";
   }

   static class a implements Consumer<foz> {
      private final Map<dku, foz> a = new HashMap<>();

      public void a(foz $$0) {
         dku $$1 = $$0.a();
         foz $$2 = this.a.put($$1, $$0);
         if ($$2 != null) {
            throw new IllegalStateException("Duplicate blockstate definition for " + $$1);
         }
      }

      public void a() {
         Stream<js.c<dku>> $$0 = md.e.c().filter($$0x -> true);
         List<ald> $$1 = $$0.filter($$0x -> !this.a.containsKey($$0x.a())).map($$0x -> $$0x.h().a()).toList();
         if (!$$1.isEmpty()) {
            throw new IllegalStateException("Missing blockstate definitions for: " + $$1);
         }
      }

      public CompletableFuture<?> a(mi $$0, mm.a $$1) {
         return foy.a($$0, $$1x -> $$1.a($$1x.p().h().a()), this.a);
      }
   }

   static class b implements fox {
      private final Map<cxu, hdg> a = new HashMap<>();
      private final Map<cxu, cxu> b = new HashMap<>();

      @Override
      public void a(cxu $$0, hdk.b $$1) {
         this.a($$0, new hdg($$1, hdg.a.a));
      }

      private void a(cxu $$0, hdg $$1) {
         hdg $$2 = this.a.put($$0, $$1);
         if ($$2 != null) {
            throw new IllegalStateException("Duplicate item model definition for " + $$0);
         }
      }

      @Override
      public void a(cxu $$0, cxu $$1) {
         this.b.put($$1, $$0);
      }

      public void a() {
         md.g.forEach($$0x -> {
            if (!this.b.containsKey($$0x)) {
               if ($$0x instanceof cwf $$1 && !this.a.containsKey($$1)) {
                  ald $$2 = fpm.a($$1.d());
                  this.a($$1, fpk.a($$2));
               }
            }
         });
         this.b.forEach(($$0x, $$1) -> {
            hdg $$2 = this.a.get($$1);
            if ($$2 == null) {
               throw new IllegalStateException("Missing donor: " + $$1 + " -> " + $$0x);
            } else {
               this.a($$0x, $$2);
            }
         });
         List<ald> $$0 = md.g.c().filter($$0x -> !this.a.containsKey($$0x.a())).map($$0x -> $$0x.h().a()).toList();
         if (!$$0.isEmpty()) {
            throw new IllegalStateException("Missing item model definitions for: " + $$0);
         }
      }

      public CompletableFuture<?> a(mi $$0, mm.a $$1) {
         return mk.a($$0, hdg.a, $$1x -> $$1.a($$1x.f().h().a()), this.a);
      }
   }

   static class c implements BiConsumer<ald, fpl> {
      private final Map<ald, fpl> a = new HashMap<>();

      public void a(ald $$0, fpl $$1) {
         Supplier<JsonElement> $$2 = this.a.put($$0, $$1);
         if ($$2 != null) {
            throw new IllegalStateException("Duplicate model definition for " + $$0);
         }
      }

      public CompletableFuture<?> a(mi $$0, mm.a $$1) {
         return foy.a($$0, $$1::a, this.a);
      }
   }
}
