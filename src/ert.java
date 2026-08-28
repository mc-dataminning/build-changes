import java.util.Map;
import java.util.Objects;
import java.util.Optional;

public class ert {
   public static final alj<ers> a = a("normal");
   public static final alj<ers> b = a("flat");
   public static final alj<ers> c = a("large_biomes");
   public static final alj<ers> d = a("amplified");
   public static final alj<ers> e = a("single_biome_surface");
   public static final alj<ers> f = a("debug_all_block_states");

   public static void a(qi<ers> $$0) {
      new ert.a($$0).a();
   }

   private static alj<ers> a(String $$0) {
      return alj.a(mi.bo, alk.b($$0));
   }

   public static Optional<alj<ers>> a(eia $$0) {
      return $$0.a(efe.b).flatMap($$0x -> {
         Object var10000;
         Objects.requireNonNull(var10000);
         ede $$1 = (ede)var10000;

         $$0x.b();
         return switch ($$1) {
            case eha $$3 -> Optional.of(b);
            case egw $$4 -> Optional.of(f);
            case ehi $$5 -> Optional.of(a);
            default -> Optional.empty();
         };
      });
   }

   public static eia a(ji.a $$0) {
      return $$0.e(mi.bo).b(a).a().a();
   }

   public static efe b(ji.a $$0) {
      return $$0.e(mi.bo).b(a).a().b().orElseThrow();
   }

   public static eia c(ji.a $$0) {
      return $$0.e(mi.bo).b(b).a().a();
   }

   static class a {
      private final qi<ers> a;
      private final jh<ehk> b;
      private final jh<dlc> c;
      private final jh<erh> d;
      private final jh<esj> e;
      private final jh<dlq> f;
      private final jg<efd> g;
      private final efe h;
      private final efe i;

      a(qi<ers> $$0) {
         this.a = $$0;
         jh<efd> $$1 = $$0.a(mi.aP);
         this.b = $$0.a(mi.aX);
         this.c = $$0.a(mi.aG);
         this.d = $$0.a(mi.bb);
         this.e = $$0.a(mi.bd);
         this.f = $$0.a(mi.aW);
         this.g = $$1.b(efb.a);
         jg<efd> $$2 = $$1.b(efb.b);
         jg<ehk> $$3 = this.b.b(ehk.f);
         jg.c<dlq> $$4 = this.f.b(dlr.a);
         this.h = new efe($$2, new ehi(dlp.a($$4), $$3));
         jg<efd> $$5 = $$1.b(efb.c);
         jg<ehk> $$6 = this.b.b(ehk.g);
         this.i = new efe($$5, new ehi(dlt.a(this.c), $$6));
      }

      private efe a(ede $$0) {
         return new efe(this.g, $$0);
      }

      private efe a(dlg $$0, jg<ehk> $$1) {
         return this.a(new ehi($$0, $$1));
      }

      private ers a(efe $$0) {
         return new ers(Map.of(efe.b, $$0, efe.c, this.h, efe.d, this.i));
      }

      private void a(alj<ers> $$0, efe $$1) {
         this.a.a($$0, this.a($$1));
      }

      private void a(dlg $$0) {
         jg<ehk> $$1 = this.b.b(ehk.c);
         this.a(ert.a, this.a($$0, $$1));
         jg<ehk> $$2 = this.b.b(ehk.d);
         this.a(ert.c, this.a($$0, $$2));
         jg<ehk> $$3 = this.b.b(ehk.e);
         this.a(ert.d, this.a($$0, $$3));
      }

      public void a() {
         jg.c<dlq> $$0 = this.f.b(dlr.b);
         this.a(dlp.a($$0));
         jg<ehk> $$1 = this.b.b(ehk.c);
         jg.c<dlc> $$2 = this.c.b(dlj.b);
         this.a(ert.e, this.a(new dln($$2), $$1));
         this.a(ert.b, this.a(new eha(eqg.a(this.c, this.e, this.d))));
         this.a(ert.f, this.a(new egw($$2)));
      }
   }
}
