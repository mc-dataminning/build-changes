import java.util.Map;
import java.util.Optional;

public class ehy {
   public static final ald<ehx> a = a("normal");
   public static final ald<ehx> b = a("flat");
   public static final ald<ehx> c = a("large_biomes");
   public static final ald<ehx> d = a("amplified");
   public static final ald<ehx> e = a("single_biome_surface");
   public static final ald<ehx> f = a("debug_all_block_states");

   public static void a(rc<ehx> $$0) {
      new ehy.a($$0).a();
   }

   private static ald<ehx> a(String $$0) {
      return ald.a(lq.aQ, new ale($$0));
   }

   public static Optional<ald<ehx>> a(dyn $$0) {
      return $$0.a(dvt.b).flatMap($$0x -> {
         dtx $$1 = $$0x.b();
         if ($$1 instanceof dxn) {
            return Optional.of(b);
         } else {
            return $$1 instanceof dxj ? Optional.of(f) : Optional.empty();
         }
      });
   }

   public static dyn a(jw $$0) {
      return $$0.d(lq.aQ).g(a).a().a();
   }

   public static dvt b(jw $$0) {
      return $$0.d(lq.aQ).g(a).a().b().orElseThrow();
   }

   static class a {
      private final rc<ehx> a;
      private final jj<dxx> b;
      private final jj<dcv> c;
      private final jj<ehm> d;
      private final jj<eio> e;
      private final jj<ddj> f;
      private final ji<dvs> g;
      private final dvt h;
      private final dvt i;

      a(rc<ehx> $$0) {
         this.a = $$0;
         jj<dvs> $$1 = $$0.a(lq.aE);
         this.b = $$0.a(lq.aG);
         this.c = $$0.a(lq.az);
         this.d = $$0.a(lq.aI);
         this.e = $$0.a(lq.aL);
         this.f = $$0.a(lq.aR);
         this.g = $$1.b(dvq.a);
         ji<dvs> $$2 = $$1.b(dvq.b);
         ji<dxx> $$3 = this.b.b(dxx.f);
         ji.c<ddj> $$4 = this.f.b(ddk.a);
         this.h = new dvt($$2, new dxv(ddi.a($$4), $$3));
         ji<dvs> $$5 = $$1.b(dvq.c);
         ji<dxx> $$6 = this.b.b(dxx.g);
         this.i = new dvt($$5, new dxv(ddm.a(this.c), $$6));
      }

      private dvt a(dtx $$0) {
         return new dvt(this.g, $$0);
      }

      private dvt a(dcz $$0, ji<dxx> $$1) {
         return this.a(new dxv($$0, $$1));
      }

      private ehx a(dvt $$0) {
         return new ehx(Map.of(dvt.b, $$0, dvt.c, this.h, dvt.d, this.i));
      }

      private void a(ald<ehx> $$0, dvt $$1) {
         this.a.a($$0, this.a($$1));
      }

      private void a(dcz $$0) {
         ji<dxx> $$1 = this.b.b(dxx.c);
         this.a(ehy.a, this.a($$0, $$1));
         ji<dxx> $$2 = this.b.b(dxx.d);
         this.a(ehy.c, this.a($$0, $$2));
         ji<dxx> $$3 = this.b.b(dxx.e);
         this.a(ehy.d, this.a($$0, $$3));
      }

      public void a() {
         ji.c<ddj> $$0 = this.f.b(ddk.b);
         this.a(ddi.a($$0));
         ji<dxx> $$1 = this.b.b(dxx.c);
         ji.c<dcv> $$2 = this.c.b(ddc.b);
         this.a(ehy.e, this.a(new ddg($$2), $$1));
         this.a(ehy.b, this.a(new dxn(egl.a(this.c, this.e, this.d))));
         this.a(ehy.f, this.a(new dxj($$2)));
      }
   }
}
