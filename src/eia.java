import java.util.Map;
import java.util.Optional;

public class eia {
   public static final ale<ehz> a = a("normal");
   public static final ale<ehz> b = a("flat");
   public static final ale<ehz> c = a("large_biomes");
   public static final ale<ehz> d = a("amplified");
   public static final ale<ehz> e = a("single_biome_surface");
   public static final ale<ehz> f = a("debug_all_block_states");

   public static void a(rc<ehz> $$0) {
      new eia.a($$0).a();
   }

   private static ale<ehz> a(String $$0) {
      return ale.a(lq.aQ, new alf($$0));
   }

   public static Optional<ale<ehz>> a(dyp $$0) {
      return $$0.a(dvv.b).flatMap($$0x -> {
         dtz $$1 = $$0x.b();
         if ($$1 instanceof dxp) {
            return Optional.of(b);
         } else {
            return $$1 instanceof dxl ? Optional.of(f) : Optional.empty();
         }
      });
   }

   public static dyp a(jw $$0) {
      return $$0.d(lq.aQ).g(a).a().a();
   }

   public static dvv b(jw $$0) {
      return $$0.d(lq.aQ).g(a).a().b().orElseThrow();
   }

   static class a {
      private final rc<ehz> a;
      private final jj<dxz> b;
      private final jj<dcx> c;
      private final jj<eho> d;
      private final jj<eiq> e;
      private final jj<ddl> f;
      private final ji<dvu> g;
      private final dvv h;
      private final dvv i;

      a(rc<ehz> $$0) {
         this.a = $$0;
         jj<dvu> $$1 = $$0.a(lq.aE);
         this.b = $$0.a(lq.aG);
         this.c = $$0.a(lq.az);
         this.d = $$0.a(lq.aI);
         this.e = $$0.a(lq.aL);
         this.f = $$0.a(lq.aR);
         this.g = $$1.b(dvs.a);
         ji<dvu> $$2 = $$1.b(dvs.b);
         ji<dxz> $$3 = this.b.b(dxz.f);
         ji.c<ddl> $$4 = this.f.b(ddm.a);
         this.h = new dvv($$2, new dxx(ddk.a($$4), $$3));
         ji<dvu> $$5 = $$1.b(dvs.c);
         ji<dxz> $$6 = this.b.b(dxz.g);
         this.i = new dvv($$5, new dxx(ddo.a(this.c), $$6));
      }

      private dvv a(dtz $$0) {
         return new dvv(this.g, $$0);
      }

      private dvv a(ddb $$0, ji<dxz> $$1) {
         return this.a(new dxx($$0, $$1));
      }

      private ehz a(dvv $$0) {
         return new ehz(Map.of(dvv.b, $$0, dvv.c, this.h, dvv.d, this.i));
      }

      private void a(ale<ehz> $$0, dvv $$1) {
         this.a.a($$0, this.a($$1));
      }

      private void a(ddb $$0) {
         ji<dxz> $$1 = this.b.b(dxz.c);
         this.a(eia.a, this.a($$0, $$1));
         ji<dxz> $$2 = this.b.b(dxz.d);
         this.a(eia.c, this.a($$0, $$2));
         ji<dxz> $$3 = this.b.b(dxz.e);
         this.a(eia.d, this.a($$0, $$3));
      }

      public void a() {
         ji.c<ddl> $$0 = this.f.b(ddm.b);
         this.a(ddk.a($$0));
         ji<dxz> $$1 = this.b.b(dxz.c);
         ji.c<dcx> $$2 = this.c.b(dde.b);
         this.a(eia.e, this.a(new ddi($$2), $$1));
         this.a(eia.b, this.a(new dxp(egn.a(this.c, this.e, this.d))));
         this.a(eia.f, this.a(new dxl($$2)));
      }
   }
}
