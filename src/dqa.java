import com.mojang.serialization.MapCodec;

public class dqa extends dmf implements dmi {
   public static final MapCodec<dqa> a = b(dqa::new);
   private static final ffk c = dmf.b(14.0, 0.0, 16.0);
   private static final ffk d = dmf.b(14.0, 2.0, 16.0);
   public static final eay b = eax.F;

   @Override
   public MapCodec<dqa> a() {
      return a;
   }

   public dqa(eag.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, Boolean.valueOf(true)));
   }

   @Override
   protected ffk a(eah $$0, dig $$1, iu $$2, fev $$3) {
      return $$0.c(b) ? d : c;
   }

   @Override
   public void a(eah $$0, dja $$1, iu $$2, azv $$3) {
      if ($$3.a(500) == 0) {
         eah $$4 = $$1.a_($$2.d());
         if ($$4.a(axc.w) || $$4.a(dmh.aR)) {
            $$1.a((double)$$2.u(), (double)$$2.v(), (double)$$2.w(), awn.tg, awo.e, 1.0F, 1.0F, false);
         }
      }
   }

   @Override
   protected boolean e_(eah $$0) {
      return true;
   }

   @Override
   protected boolean a(eah $$0, djd $$1, iu $$2) {
      return this.b($$1, $$2);
   }

   private boolean b(dig $$0, iu $$1) {
      iu $$2 = $$1.a(ja.b);
      eah $$3 = $$0.a_($$2);
      return drl.a($$0, ja.b, $$2, $$3) || $$3.a(dmh.ug);
   }

   @Override
   protected eah a(eah $$0, djd $$1, djp $$2, iu $$3, ja $$4, iu $$5, eah $$6, azv $$7) {
      if (!this.b($$1, $$3)) {
         $$2.a($$3, this, 1);
      }

      return $$0.b(b, Boolean.valueOf(!$$1.a_($$3.e()).a(this)));
   }

   @Override
   protected void a(eah $$0, arq $$1, iu $$2, azv $$3) {
      if (!this.b($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   protected void a(eai.a<dmf, eah> $$0) {
      $$0.a(b);
   }

   @Override
   public boolean a(djd $$0, iu $$1, eah $$2) {
      return this.o($$0.a_(this.a($$0, $$1).e()));
   }

   private boolean o(eah $$0) {
      return $$0.l();
   }

   public iu a(dig $$0, iu $$1) {
      iu.a $$2 = $$1.k();

      eah $$3;
      do {
         $$2.c(ja.a);
         $$3 = $$0.a_($$2);
      } while ($$3.a(this));

      return $$2.a(ja.b).j();
   }

   @Override
   public boolean a(dja $$0, azv $$1, iu $$2, eah $$3) {
      return true;
   }

   @Override
   public void a(arq $$0, azv $$1, iu $$2, eah $$3) {
      iu $$4 = this.a($$0, $$2).e();
      if (this.o($$0.a_($$4))) {
         $$0.b($$4, $$3.b(b, Boolean.valueOf(true)));
      }
   }
}
