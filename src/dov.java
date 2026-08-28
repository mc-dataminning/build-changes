import com.mojang.serialization.MapCodec;

public class dov extends dhm {
   public static final MapCodec<dov> a = b(dov::new);
   public static final int b = 2;
   public static final dvs c = dvi.aE;
   private static final int d = 24000;
   private static final int e = 12000;
   private static final int f = 300;
   private static final ezq g = dhm.a(1.0, 0.0, 2.0, 15.0, 16.0, 14.0);

   @Override
   public MapCodec<dov> a() {
      return a;
   }

   public dov(dur.d $$0) {
      super($$0);
      this.l(this.F.b().b(c, Integer.valueOf(0)));
   }

   @Override
   protected void a(dut.a<dhm, dus> $$0) {
      $$0.a(c);
   }

   @Override
   public ezq a(dus $$0, ddo $$1, jf $$2, ezb $$3) {
      return g;
   }

   public int o(dus $$0) {
      return $$0.c(c);
   }

   private boolean q(dus $$0) {
      return this.o($$0) == 2;
   }

   @Override
   public void a(dus $$0, arj $$1, jf $$2, azn $$3) {
      if (!this.q($$0)) {
         $$1.a(null, $$2, awg.yE, awh.e, 0.7F, 0.9F + $$3.i() * 0.2F);
         $$1.a($$2, $$0.b(c, Integer.valueOf(this.o($$0) + 1)), 2);
      } else {
         $$1.a(null, $$2, awg.yF, awh.e, 0.7F, 0.9F + $$3.i() * 0.2F);
         $$1.b($$2, false);
         ciu $$4 = bty.aR.a($$1, btx.e);
         if ($$4 != null) {
            eyw $$5 = $$2.b();
            $$4.a(true);
            $$4.b($$5.a(), $$5.b(), $$5.c(), azf.h($$1.z.i() * 360.0F), 0.0F);
            $$1.b($$4);
         }
      }
   }

   @Override
   public void b(dus $$0, dej $$1, jf $$2, dus $$3, boolean $$4) {
      boolean $$5 = a($$1, $$2);
      if (!$$1.x_() && $$5) {
         $$1.c(3009, $$2, 0);
      }

      int $$6 = $$5 ? 12000 : 24000;
      int $$7 = $$6 / 3;
      $$1.a(dzp.i, $$2, dzp.a.a($$0));
      $$1.a($$2, this, $$7 + $$1.z.a(300));
   }

   @Override
   public boolean a(dus $$0, eri $$1) {
      return false;
   }

   public static boolean a(ddo $$0, jf $$1) {
      return $$0.a_($$1.e()).a(awv.ct);
   }
}
