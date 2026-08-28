import java.util.Map;
import java.util.Optional;

public class eib {
   public static final ale<eia> a = a("normal");
   public static final ale<eia> b = a("flat");
   public static final ale<eia> c = a("large_biomes");
   public static final ale<eia> d = a("amplified");
   public static final ale<eia> e = a("single_biome_surface");
   public static final ale<eia> f = a("debug_all_block_states");

   public static void a(rc<eia> $$0) {
      new eib.a($$0).a();
   }

   private static ale<eia> a(String $$0) {
      return ale.a(lq.aQ, new alf($$0));
   }

   public static Optional<ale<eia>> a(dyq $$0) {
      return $$0.a(dvw.b).flatMap($$0x -> {
         dua $$1 = $$0x.b();
         if ($$1 instanceof dxq) {
            return Optional.of(b);
         } else {
            return $$1 instanceof dxm ? Optional.of(f) : Optional.empty();
         }
      });
   }

   public static dyq a(jw $$0) {
      return $$0.d(lq.aQ).g(a).a().a();
   }

   public static dvw b(jw $$0) {
      return $$0.d(lq.aQ).g(a).a().b().orElseThrow();
   }

   static class a {
      private final rc<eia> a;
      private final jj<dya> b;
      private final jj<dcy> c;
      private final jj<ehp> d;
      private final jj<eir> e;
      private final jj<ddm> f;
      private final ji<dvv> g;
      private final dvw h;
      private final dvw i;

      a(rc<eia> $$0) {
         this.a = $$0;
         jj<dvv> $$1 = $$0.a(lq.aE);
         this.b = $$0.a(lq.aG);
         this.c = $$0.a(lq.az);
         this.d = $$0.a(lq.aI);
         this.e = $$0.a(lq.aL);
         this.f = $$0.a(lq.aR);
         this.g = $$1.b(dvt.a);
         ji<dvv> $$2 = $$1.b(dvt.b);
         ji<dya> $$3 = this.b.b(dya.f);
         ji.c<ddm> $$4 = this.f.b(ddn.a);
         this.h = new dvw($$2, new dxy(ddl.a($$4), $$3));
         ji<dvv> $$5 = $$1.b(dvt.c);
         ji<dya> $$6 = this.b.b(dya.g);
         this.i = new dvw($$5, new dxy(ddp.a(this.c), $$6));
      }

      private dvw a(dua $$0) {
         return new dvw(this.g, $$0);
      }

      private dvw a(ddc $$0, ji<dya> $$1) {
         return this.a(new dxy($$0, $$1));
      }

      private eia a(dvw $$0) {
         return new eia(Map.of(dvw.b, $$0, dvw.c, this.h, dvw.d, this.i));
      }

      private void a(ale<eia> $$0, dvw $$1) {
         this.a.a($$0, this.a($$1));
      }

      private void a(ddc $$0) {
         ji<dya> $$1 = this.b.b(dya.c);
         this.a(eib.a, this.a($$0, $$1));
         ji<dya> $$2 = this.b.b(dya.d);
         this.a(eib.c, this.a($$0, $$2));
         ji<dya> $$3 = this.b.b(dya.e);
         this.a(eib.d, this.a($$0, $$3));
      }

      public void a() {
         ji.c<ddm> $$0 = this.f.b(ddn.b);
         this.a(ddl.a($$0));
         ji<dya> $$1 = this.b.b(dya.c);
         ji.c<dcy> $$2 = this.c.b(ddf.b);
         this.a(eib.e, this.a(new ddj($$2), $$1));
         this.a(eib.b, this.a(new dxq(ego.a(this.c, this.e, this.d))));
         this.a(eib.f, this.a(new dxm($$2)));
      }
   }
}
