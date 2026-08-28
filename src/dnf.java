import com.mojang.serialization.MapCodec;

public class dnf extends dfw {
   public static final MapCodec<dnf> a = b(dnf::new);
   public static final int b = 2;
   public static final dua c = dtq.aE;
   private static final int d = 24000;
   private static final int e = 12000;
   private static final int f = 300;
   private static final exp g = dfw.a(1.0, 0.0, 2.0, 15.0, 16.0, 14.0);

   @Override
   public MapCodec<dnf> a() {
      return a;
   }

   public dnf(dsz.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(0)));
   }

   @Override
   protected void a(dtb.a<dfw, dta> $$0) {
      $$0.a(c);
   }

   @Override
   public exp a(dta $$0, dca $$1, jd $$2, exb $$3) {
      return g;
   }

   public int m(dta $$0) {
      return $$0.c(c);
   }

   private boolean n(dta $$0) {
      return this.m($$0) == 2;
   }

   @Override
   public void a(dta $$0, aqt $$1, jd $$2, ayv $$3) {
      if (!this.n($$0)) {
         $$1.a(null, $$2, avo.yy, avp.e, 0.7F, 0.9F + $$3.i() * 0.2F);
         $$1.a($$2, $$0.a(c, Integer.valueOf(this.m($$0) + 1)), 2);
      } else {
         $$1.a(null, $$2, avo.yz, avp.e, 0.7F, 0.9F + $$3.i() * 0.2F);
         $$1.b($$2, false);
         cht $$4 = bsw.aR.a((dcu)$$1);
         if ($$4 != null) {
            eww $$5 = $$2.b();
            $$4.a(true);
            $$4.b($$5.a(), $$5.b(), $$5.c(), ayn.g($$1.z.i() * 360.0F), 0.0F);
            $$1.b($$4);
         }
      }
   }

   @Override
   public void b(dta $$0, dcu $$1, jd $$2, dta $$3, boolean $$4) {
      boolean $$5 = a($$1, $$2);
      if (!$$1.x_() && $$5) {
         $$1.c(3009, $$2, 0);
      }

      int $$6 = $$5 ? 12000 : 24000;
      int $$7 = $$6 / 3;
      $$1.a(dxw.i, $$2, dxw.a.a($$0));
      $$1.a($$2, this, $$7 + $$1.z.a(300));
   }

   @Override
   public boolean a(dta $$0, epn $$1) {
      return false;
   }

   public static boolean a(dca $$0, jd $$1) {
      return $$0.a_($$1.d()).a(awd.cs);
   }
}
