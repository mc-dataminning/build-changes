import com.mojang.serialization.MapCodec;

public class dti extends dlu {
   public static final MapCodec<dti> a = b(dti::new);
   public static final int b = 2;
   public static final eao c = eae.aH;
   private static final int d = 24000;
   private static final int e = 12000;
   private static final int f = 300;
   private static final feq g = dlu.a(14.0, 12.0, 0.0, 16.0);

   @Override
   public MapCodec<dti> a() {
      return a;
   }

   public dti(dzn.d $$0) {
      super($$0);
      this.l(this.B.b().b(c, Integer.valueOf(0)));
   }

   @Override
   protected void a(dzp.a<dlu, dzo> $$0) {
      $$0.a(c);
   }

   @Override
   public feq a(dzo $$0, dhv $$1, iu $$2, feb $$3) {
      return g;
   }

   public int o(dzo $$0) {
      return $$0.c(c);
   }

   private boolean q(dzo $$0) {
      return this.o($$0) == 2;
   }

   @Override
   public void a(dzo $$0, aro $$1, iu $$2, azt $$3) {
      if (!this.q($$0)) {
         $$1.a(null, $$2, awl.zw, awm.e, 0.7F, 0.9F + $$3.i() * 0.2F);
         $$1.a($$2, $$0.b(c, Integer.valueOf(this.o($$0) + 1)), 2);
      } else {
         $$1.a(null, $$2, awl.zx, awm.e, 0.7F, 0.9F + $$3.i() * 0.2F);
         $$1.b($$2, false);
         clk $$4 = bwj.bj.a($$1, bwi.e);
         if ($$4 != null) {
            fdw $$5 = $$2.b();
            $$4.a(true);
            $$4.b($$5.a(), $$5.b(), $$5.c(), azk.h($$1.A.i() * 360.0F), 0.0F);
            $$1.b($$4);
         }
      }
   }

   @Override
   public void a(dzo $$0, dip $$1, iu $$2, dzo $$3, boolean $$4) {
      boolean $$5 = a($$1, $$2);
      if (!$$1.w_() && $$5) {
         $$1.c(3009, $$2, 0);
      }

      int $$6 = $$5 ? 12000 : 24000;
      int $$7 = $$6 / 3;
      $$1.a(eeo.i, $$2, eeo.a.a($$0));
      $$1.a($$2, this, $$7 + $$1.A.a(300));
   }

   @Override
   public boolean a(dzo $$0, ewk $$1) {
      return false;
   }

   public static boolean a(dhv $$0, iu $$1) {
      return $$0.a_($$1.e()).a(axa.cx);
   }
}
