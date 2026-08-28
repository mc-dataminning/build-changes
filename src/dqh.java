import com.mojang.serialization.MapCodec;

public class dqh extends dmm implements dmp {
   public static final MapCodec<dqh> a = b(dqh::new);
   private static final ffr c = dmm.b(14.0, 0.0, 16.0);
   private static final ffr d = dmm.b(14.0, 2.0, 16.0);
   public static final ebf b = ebe.F;

   @Override
   public MapCodec<dqh> a() {
      return a;
   }

   public dqh(ean.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, Boolean.valueOf(true)));
   }

   @Override
   protected ffr a(eao $$0, din $$1, iv $$2, ffc $$3) {
      return $$0.c(b) ? d : c;
   }

   @Override
   public void a(eao $$0, djh $$1, iv $$2, azv $$3) {
      if ($$3.a(500) == 0) {
         eao $$4 = $$1.a_($$2.d());
         if ($$4.a(axc.w) || $$4.a(dmo.aR)) {
            $$1.a((double)$$2.u(), (double)$$2.v(), (double)$$2.w(), awn.tg, awo.i, 1.0F, 1.0F, false);
         }
      }
   }

   @Override
   protected boolean e_(eao $$0) {
      return true;
   }

   @Override
   protected boolean a(eao $$0, djk $$1, iv $$2) {
      return this.b($$1, $$2);
   }

   private boolean b(din $$0, iv $$1) {
      iv $$2 = $$1.a(jb.b);
      eao $$3 = $$0.a_($$2);
      return drs.a($$0, jb.b, $$2, $$3) || $$3.a(dmo.ug);
   }

   @Override
   protected eao a(eao $$0, djk $$1, djw $$2, iv $$3, jb $$4, iv $$5, eao $$6, azv $$7) {
      if (!this.b($$1, $$3)) {
         $$2.a($$3, this, 1);
      }

      return $$0.b(b, Boolean.valueOf(!$$1.a_($$3.e()).a(this)));
   }

   @Override
   protected void a(eao $$0, arq $$1, iv $$2, azv $$3) {
      if (!this.b($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   protected void a(eap.a<dmm, eao> $$0) {
      $$0.a(b);
   }

   @Override
   public boolean a(djk $$0, iv $$1, eao $$2) {
      return this.o($$0.a_(this.a($$0, $$1).e()));
   }

   private boolean o(eao $$0) {
      return $$0.l();
   }

   public iv a(din $$0, iv $$1) {
      iv.a $$2 = $$1.k();

      eao $$3;
      do {
         $$2.c(jb.a);
         $$3 = $$0.a_($$2);
      } while ($$3.a(this));

      return $$2.a(jb.b).j();
   }

   @Override
   public boolean a(djh $$0, azv $$1, iv $$2, eao $$3) {
      return true;
   }

   @Override
   public void a(arq $$0, azv $$1, iv $$2, eao $$3) {
      iv $$4 = this.a($$0, $$2).e();
      if (this.o($$0.a_($$4))) {
         $$0.b($$4, $$3.b(b, Boolean.valueOf(true)));
      }
   }
}
