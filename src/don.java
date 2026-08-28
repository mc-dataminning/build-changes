import com.mojang.serialization.MapCodec;

public class don extends dku implements dkx {
   public static final MapCodec<don> a = b(don::new);
   private static final fdo c = dku.b(14.0, 0.0, 16.0);
   private static final fdo d = dku.b(14.0, 2.0, 16.0);
   public static final dzd b = dzc.F;

   @Override
   public MapCodec<don> a() {
      return a;
   }

   public don(dyl.d $$0) {
      super($$0);
      this.l(this.B.b().b(b, Boolean.valueOf(true)));
   }

   @Override
   protected fdo a(dym $$0, dgv $$1, jj $$2, fcz $$3) {
      return $$0.c(b) ? d : c;
   }

   @Override
   public void a(dym $$0, dhp $$1, jj $$2, azs $$3) {
      if ($$3.a(500) == 0) {
         dym $$4 = $$1.a_($$2.d());
         if ($$4.a(awz.w) || $$4.a(dkw.aR)) {
            $$1.a((double)$$2.u(), (double)$$2.v(), (double)$$2.w(), awk.tc, awl.e, 1.0F, 1.0F, false);
         }
      }
   }

   @Override
   protected boolean e_(dym $$0) {
      return true;
   }

   @Override
   protected boolean a(dym $$0, dhs $$1, jj $$2) {
      return this.b($$1, $$2);
   }

   private boolean b(dgv $$0, jj $$1) {
      jj $$2 = $$1.a(jo.b);
      dym $$3 = $$0.a_($$2);
      return dpy.a($$0, jo.b, $$2, $$3) || $$3.a(dkw.uc);
   }

   @Override
   protected dym a(dym $$0, dhs $$1, die $$2, jj $$3, jo $$4, jj $$5, dym $$6, azs $$7) {
      if (!this.b($$1, $$3)) {
         $$2.a($$3, this, 1);
      }

      return $$0.b(b, Boolean.valueOf(!$$1.a_($$3.e()).a(this)));
   }

   @Override
   protected void a(dym $$0, arn $$1, jj $$2, azs $$3) {
      if (!this.b($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   protected void a(dyn.a<dku, dym> $$0) {
      $$0.a(b);
   }

   @Override
   public boolean a(dhs $$0, jj $$1, dym $$2) {
      return this.o($$0.a_(this.a($$0, $$1).e()));
   }

   private boolean o(dym $$0) {
      return $$0.l();
   }

   public jj a(dgv $$0, jj $$1) {
      jj.a $$2 = $$1.k();

      dym $$3;
      do {
         $$2.c(jo.a);
         $$3 = $$0.a_($$2);
      } while ($$3.a(this));

      return $$2.a(jo.b).j();
   }

   @Override
   public boolean a(dhp $$0, azs $$1, jj $$2, dym $$3) {
      return true;
   }

   @Override
   public void a(arn $$0, azs $$1, jj $$2, dym $$3) {
      jj $$4 = this.a($$0, $$2).e();
      if (this.o($$0.a_($$4))) {
         $$0.b($$4, $$3.b(b, Boolean.valueOf(true)));
      }
   }
}
