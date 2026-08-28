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

public class fro implements mn {
   private final mp.a d;
   private final mp.a e;
   private final mp.a f;

   public fro(mp $$0) {
      this.d = $$0.a(mp.b.b, "blockstates");
      this.e = $$0.a(mp.b.b, "items");
      this.f = $$0.a(mp.b.b, "models");
   }

   @Override
   public CompletableFuture<?> a(ml $$0) {
      fro.b $$1 = new fro.b();
      fro.a $$2 = new fro.a();
      fro.c $$3 = new fro.c();
      new frk($$2, $$1, $$3).a();
      new frm($$1, $$3).a();
      $$2.a();
      $$1.a();
      return CompletableFuture.allOf($$2.a($$0, this.d), $$3.a($$0, this.f), $$1.a($$0, this.e));
   }

   @Override
   public final String a() {
      return "Model Definitions";
   }

   static class a implements Consumer<frp> {
      private final Map<dmr, frp> a = new HashMap<>();

      public void a(frp $$0) {
         dmr $$1 = $$0.a();
         frp $$2 = this.a.put($$1, $$0);
         if ($$2 != null) {
            throw new IllegalStateException("Duplicate blockstate definition for " + $$1);
         }
      }

      public void a() {
         Stream<jf.c<dmr>> $$0 = mg.e.c().filter($$0x -> true);
         List<alg> $$1 = $$0.filter($$0x -> !this.a.containsKey($$0x.a())).map($$0x -> $$0x.h().a()).toList();
         if (!$$1.isEmpty()) {
            throw new IllegalStateException("Missing blockstate definitions for: " + $$1);
         }
      }

      public CompletableFuture<?> a(ml $$0, mp.a $$1) {
         Map<dmr, gsc> $$2 = Maps.transformValues(this.a, frp::b);
         Function<dmr, Path> $$3 = $$1x -> $$1.a($$1x.p().h().a());
         return mn.a($$0, gsc.a, $$3, $$2);
      }
   }

   static class b implements frn {
      private final Map<czj, hgb> a = new HashMap<>();
      private final Map<czj, czj> b = new HashMap<>();

      @Override
      public void a(czj $$0, hgf.b $$1) {
         this.a($$0, new hgb($$1, hgb.a.a));
      }

      private void a(czj $$0, hgb $$1) {
         hgb $$2 = this.a.put($$0, $$1);
         if ($$2 != null) {
            throw new IllegalStateException("Duplicate item model definition for " + $$0);
         }
      }

      @Override
      public void a(czj $$0, czj $$1) {
         this.b.put($$1, $$0);
      }

      public void a() {
         mg.g.forEach($$0x -> {
            if (!this.b.containsKey($$0x)) {
               if ($$0x instanceof cxv $$1 && !this.a.containsKey($$1)) {
                  alg $$2 = frz.a($$1.c());
                  this.a($$1, frx.a($$2));
               }
            }
         });
         this.b.forEach(($$0x, $$1) -> {
            hgb $$2 = this.a.get($$1);
            if ($$2 == null) {
               throw new IllegalStateException("Missing donor: " + $$1 + " -> " + $$0x);
            } else {
               this.a($$0x, $$2);
            }
         });
         List<alg> $$0 = mg.g.c().filter($$0x -> !this.a.containsKey($$0x.a())).map($$0x -> $$0x.h().a()).toList();
         if (!$$0.isEmpty()) {
            throw new IllegalStateException("Missing item model definitions for: " + $$0);
         }
      }

      public CompletableFuture<?> a(ml $$0, mp.a $$1) {
         return mn.a($$0, hgb.a, $$1x -> $$1.a($$1x.e().h().a()), this.a);
      }
   }

   static class c implements BiConsumer<alg, fry> {
      private final Map<alg, fry> a = new HashMap<>();

      public void a(alg $$0, fry $$1) {
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
