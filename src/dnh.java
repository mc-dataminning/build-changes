import com.mojang.serialization.MapCodec;

public class dnh extends dfy {
   public static final MapCodec<dnh> a = b(dnh::new);
   public static final int b = 2;
   public static final duc c = dts.aE;
   private static final int d = 24000;
   private static final int e = 12000;
   private static final int f = 300;
   private static final exv g = dfy.a(1.0, 0.0, 2.0, 15.0, 16.0, 14.0);

   @Override
   public MapCodec<dnh> a() {
      return a;
   }

   public dnh(dtb.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(0)));
   }

   @Override
   protected void a(dtd.a<dfy, dtc> $$0) {
      $$0.a(c);
   }

   @Override
   public exv a(dtc $$0, dcc $$1, jd $$2, exh $$3) {
      return g;
   }

   public int m(dtc $$0) {
      return $$0.c(c);
   }

   private boolean n(dtc $$0) {
      return this.m($$0) == 2;
   }

   @Override
   public void a(dtc $$0, aqu $$1, jd $$2, ayw $$3) {
      if (!this.n($$0)) {
         $$1.a(null, $$2, avp.yy, avq.e, 0.7F, 0.9F + $$3.i() * 0.2F);
         $$1.a($$2, $$0.a(c, Integer.valueOf(this.m($$0) + 1)), 2);
      } else {
         $$1.a(null, $$2, avp.yz, avq.e, 0.7F, 0.9F + $$3.i() * 0.2F);
         $$1.b($$2, false);
         chv $$4 = bsx.aR.a((dcw)$$1);
         if ($$4 != null) {
            exc $$5 = $$2.b();
            $$4.a(true);
            $$4.b($$5.a(), $$5.b(), $$5.c(), ayo.g($$1.z.i() * 360.0F), 0.0F);
            $$1.b($$4);
         }
      }
   }

   @Override
   public void b(dtc $$0, dcw $$1, jd $$2, dtc $$3, boolean $$4) {
      boolean $$5 = a($$1, $$2);
      if (!$$1.x_() && $$5) {
         $$1.c(3009, $$2, 0);
      }

      int $$6 = $$5 ? 12000 : 24000;
      int $$7 = $$6 / 3;
      $$1.a(dxz.i, $$2, dxz.a.a($$0));
      $$1.a($$2, this, $$7 + $$1.z.a(300));
   }

   @Override
   public boolean a(dtc $$0, ept $$1) {
      return false;
   }

   public static boolean a(dcc $$0, jd $$1) {
      return $$0.a_($$1.e()).a(awe.ct);
   }
}
