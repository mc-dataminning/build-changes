import com.mojang.serialization.MapCodec;

public class dnc extends djk implements djn {
   public static final MapCodec<dnc> a = b(dnc::new);
   private static final int c = 1;
   private static final fbs d = djk.a(1.0, 2.0, 1.0, 15.0, 16.0, 15.0);
   private static final fbs e = djk.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);
   public static final dxm b = dxl.G;

   @Override
   public MapCodec<dnc> a() {
      return a;
   }

   public dnc(dwu.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, Boolean.valueOf(true)));
   }

   @Override
   protected fbs a(dwv $$0, dfl $$1, ji $$2, fbd $$3) {
      return $$0.c(b) ? d : e;
   }

   @Override
   public void a(dwv $$0, dgg $$1, ji $$2, azg $$3) {
      if ($$3.a(500) == 0) {
         dwv $$4 = $$1.a_($$2.d());
         if ($$4.a(awo.w) || $$4.a(djm.aR)) {
            $$1.a((double)$$2.u(), (double)$$2.v(), (double)$$2.w(), avz.sS, awa.e, 1.0F, 1.0F, false);
         }
      }
   }

   @Override
   protected boolean e_(dwv $$0) {
      return true;
   }

   @Override
   protected boolean a(dwv $$0, dgj $$1, ji $$2) {
      return this.b($$1, $$2);
   }

   private boolean b(dfl $$0, ji $$1) {
      ji $$2 = $$1.a(jn.b);
      dwv $$3 = $$0.a_($$2);
      return dom.a($$0, jn.b, $$2, $$3) || $$3.a(djm.tY);
   }

   @Override
   protected dwv a(dwv $$0, dgj $$1, dgv $$2, ji $$3, jn $$4, ji $$5, dwv $$6, azg $$7) {
      if (!this.b($$1, $$3)) {
         $$2.a($$3, this, 1);
      }

      return $$0.b(b, Boolean.valueOf(!$$1.a_($$3.e()).a(this)));
   }

   @Override
   protected void a(dwv $$0, arc $$1, ji $$2, azg $$3) {
      if (!this.b($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   protected void a(dww.a<djk, dwv> $$0) {
      $$0.a(b);
   }

   @Override
   public boolean a(dgj $$0, ji $$1, dwv $$2) {
      return this.o($$0.a_(this.a($$0, $$1).e()));
   }

   private boolean o(dwv $$0) {
      return $$0.l();
   }

   public ji a(dfl $$0, ji $$1) {
      ji.a $$2 = $$1.k();

      dwv $$3;
      do {
         $$2.c(jn.a);
         $$3 = $$0.a_($$2);
      } while ($$3.a(this));

      return $$2.a(jn.b).j();
   }

   @Override
   public boolean a(dgg $$0, azg $$1, ji $$2, dwv $$3) {
      return true;
   }

   @Override
   public void a(arc $$0, azg $$1, ji $$2, dwv $$3) {
      ji $$4 = this.a($$0, $$2).e();
      if (this.o($$0.a_($$4))) {
         $$0.b($$4, $$3.b(b, Boolean.valueOf(true)));
      }
   }
}
