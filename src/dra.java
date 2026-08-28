import com.mojang.serialization.MapCodec;

public class dra extends djn {
   public static final MapCodec<dra> a = b(dra::new);
   public static final int b = 2;
   public static final dxx c = dxo.aH;
   private static final int d = 24000;
   private static final int e = 12000;
   private static final int f = 300;
   private static final fbv g = djn.a(1.0, 0.0, 2.0, 15.0, 16.0, 14.0);

   @Override
   public MapCodec<dra> a() {
      return a;
   }

   public dra(dwx.d $$0) {
      super($$0);
      this.l(this.F.b().b(c, Integer.valueOf(0)));
   }

   @Override
   protected void a(dwz.a<djn, dwy> $$0) {
      $$0.a(c);
   }

   @Override
   public fbv a(dwy $$0, dfo $$1, ji $$2, fbg $$3) {
      return g;
   }

   public int o(dwy $$0) {
      return $$0.c(c);
   }

   private boolean q(dwy $$0) {
      return this.o($$0) == 2;
   }

   @Override
   public void a(dwy $$0, ard $$1, ji $$2, azh $$3) {
      if (!this.q($$0)) {
         $$1.a(null, $$2, awa.zm, awb.e, 0.7F, 0.9F + $$3.i() * 0.2F);
         $$1.a($$2, $$0.b(c, Integer.valueOf(this.o($$0) + 1)), 2);
      } else {
         $$1.a(null, $$2, awa.zn, awb.e, 0.7F, 0.9F + $$3.i() * 0.2F);
         $$1.b($$2, false);
         cjq $$4 = but.bi.a($$1, bus.e);
         if ($$4 != null) {
            fbb $$5 = $$2.b();
            $$4.a(true);
            $$4.b($$5.a(), $$5.b(), $$5.c(), ayz.h($$1.A.i() * 360.0F), 0.0F);
            $$1.b($$4);
         }
      }
   }

   @Override
   public void b(dwy $$0, dgj $$1, ji $$2, dwy $$3, boolean $$4) {
      boolean $$5 = a($$1, $$2);
      if (!$$1.B_() && $$5) {
         $$1.c(3009, $$2, 0);
      }

      int $$6 = $$5 ? 12000 : 24000;
      int $$7 = $$6 / 3;
      $$1.a(ebu.i, $$2, ebu.a.a($$0));
      $$1.a($$2, this, $$7 + $$1.A.a(300));
   }

   @Override
   public boolean a(dwy $$0, etp $$1) {
      return false;
   }

   public static boolean a(dfo $$0, ji $$1) {
      return $$0.a_($$1.e()).a(awp.cv);
   }
}
