import com.mojang.serialization.MapCodec;

public class dqm extends dmr implements dmu {
   public static final MapCodec<dqm> a = b(dqm::new);
   private static final ffw c = dmr.b(14.0, 0.0, 16.0);
   private static final ffw d = dmr.b(14.0, 2.0, 16.0);
   public static final ebk b = ebj.F;

   @Override
   public MapCodec<dqm> a() {
      return a;
   }

   public dqm(eas.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, Boolean.valueOf(true)));
   }

   @Override
   protected ffw a(eat $$0, diq $$1, iv $$2, ffh $$3) {
      return $$0.c(b) ? d : c;
   }

   @Override
   public void a(eat $$0, djm $$1, iv $$2, azv $$3) {
      if ($$3.a(500) == 0) {
         eat $$4 = $$1.a_($$2.d());
         if ($$4.a(axc.w) || $$4.a(dmt.aR)) {
            $$1.a((double)$$2.u(), (double)$$2.v(), (double)$$2.w(), awn.tg, awo.i, 1.0F, 1.0F, false);
         }
      }
   }

   @Override
   protected boolean e_(eat $$0) {
      return true;
   }

   @Override
   protected boolean a(eat $$0, djp $$1, iv $$2) {
      return this.b($$1, $$2);
   }

   private boolean b(diq $$0, iv $$1) {
      iv $$2 = $$1.a(jb.b);
      eat $$3 = $$0.a_($$2);
      return drx.a($$0, jb.b, $$2, $$3) || $$3.a(dmt.ug);
   }

   @Override
   protected eat a(eat $$0, djp $$1, dkb $$2, iv $$3, jb $$4, iv $$5, eat $$6, azv $$7) {
      if (!this.b($$1, $$3)) {
         $$2.a($$3, this, 1);
      }

      return $$0.b(b, Boolean.valueOf(!$$1.a_($$3.e()).a(this)));
   }

   @Override
   protected void a(eat $$0, arq $$1, iv $$2, azv $$3) {
      if (!this.b($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   protected void a(eau.a<dmr, eat> $$0) {
      $$0.a(b);
   }

   @Override
   public boolean a(djp $$0, iv $$1, eat $$2) {
      return this.o($$0.a_(this.a($$0, $$1).e()));
   }

   private boolean o(eat $$0) {
      return $$0.l();
   }

   public iv a(diq $$0, iv $$1) {
      iv.a $$2 = $$1.k();

      eat $$3;
      do {
         $$2.c(jb.a);
         $$3 = $$0.a_($$2);
      } while ($$3.a(this));

      return $$2.a(jb.b).j();
   }

   @Override
   public boolean a(djm $$0, azv $$1, iv $$2, eat $$3) {
      return true;
   }

   @Override
   public void a(arq $$0, azv $$1, iv $$2, eat $$3) {
      iv $$4 = this.a($$0, $$2).e();
      if (this.o($$0.a_($$4))) {
         $$0.b($$4, $$3.b(b, Boolean.valueOf(true)));
      }
   }
}
