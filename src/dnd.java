import com.mojang.serialization.MapCodec;

public class dnd extends djl implements djo {
   public static final MapCodec<dnd> a = b(dnd::new);
   private static final int c = 1;
   private static final fbt d = djl.a(1.0, 2.0, 1.0, 15.0, 16.0, 15.0);
   private static final fbt e = djl.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);
   public static final dxn b = dxm.G;

   @Override
   public MapCodec<dnd> a() {
      return a;
   }

   public dnd(dwv.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, Boolean.valueOf(true)));
   }

   @Override
   protected fbt a(dww $$0, dfm $$1, ji $$2, fbe $$3) {
      return $$0.c(b) ? d : e;
   }

   @Override
   public void a(dww $$0, dgh $$1, ji $$2, azh $$3) {
      if ($$3.a(500) == 0) {
         dww $$4 = $$1.a_($$2.d());
         if ($$4.a(awp.w) || $$4.a(djn.aR)) {
            $$1.a((double)$$2.u(), (double)$$2.v(), (double)$$2.w(), awa.sS, awb.e, 1.0F, 1.0F, false);
         }
      }
   }

   @Override
   protected boolean e_(dww $$0) {
      return true;
   }

   @Override
   protected boolean a(dww $$0, dgk $$1, ji $$2) {
      return this.b($$1, $$2);
   }

   private boolean b(dfm $$0, ji $$1) {
      ji $$2 = $$1.a(jn.b);
      dww $$3 = $$0.a_($$2);
      return don.a($$0, jn.b, $$2, $$3) || $$3.a(djn.tY);
   }

   @Override
   protected dww a(dww $$0, dgk $$1, dgw $$2, ji $$3, jn $$4, ji $$5, dww $$6, azh $$7) {
      if (!this.b($$1, $$3)) {
         $$2.a($$3, this, 1);
      }

      return $$0.b(b, Boolean.valueOf(!$$1.a_($$3.e()).a(this)));
   }

   @Override
   protected void a(dww $$0, ard $$1, ji $$2, azh $$3) {
      if (!this.b($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   protected void a(dwx.a<djl, dww> $$0) {
      $$0.a(b);
   }

   @Override
   public boolean a(dgk $$0, ji $$1, dww $$2) {
      return this.o($$0.a_(this.a($$0, $$1).e()));
   }

   private boolean o(dww $$0) {
      return $$0.l();
   }

   public ji a(dfm $$0, ji $$1) {
      ji.a $$2 = $$1.k();

      dww $$3;
      do {
         $$2.c(jn.a);
         $$3 = $$0.a_($$2);
      } while ($$3.a(this));

      return $$2.a(jn.b).j();
   }

   @Override
   public boolean a(dgh $$0, azh $$1, ji $$2, dww $$3) {
      return true;
   }

   @Override
   public void a(ard $$0, azh $$1, ji $$2, dww $$3) {
      ji $$4 = this.a($$0, $$2).e();
      if (this.o($$0.a_($$4))) {
         $$0.b($$4, $$3.b(b, Boolean.valueOf(true)));
      }
   }
}
