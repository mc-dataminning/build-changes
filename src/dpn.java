import com.mojang.serialization.MapCodec;

public class dpn extends dlu implements dlx {
   public static final MapCodec<dpn> a = b(dpn::new);
   private static final feq c = dlu.b(14.0, 0.0, 16.0);
   private static final feq d = dlu.b(14.0, 2.0, 16.0);
   public static final eaf b = eae.F;

   @Override
   public MapCodec<dpn> a() {
      return a;
   }

   public dpn(dzn.d $$0) {
      super($$0);
      this.l(this.B.b().b(b, Boolean.valueOf(true)));
   }

   @Override
   protected feq a(dzo $$0, dhv $$1, iu $$2, feb $$3) {
      return $$0.c(b) ? d : c;
   }

   @Override
   public void a(dzo $$0, dip $$1, iu $$2, azt $$3) {
      if ($$3.a(500) == 0) {
         dzo $$4 = $$1.a_($$2.d());
         if ($$4.a(axa.w) || $$4.a(dlw.aR)) {
            $$1.a((double)$$2.u(), (double)$$2.v(), (double)$$2.w(), awl.tc, awm.e, 1.0F, 1.0F, false);
         }
      }
   }

   @Override
   protected boolean e_(dzo $$0) {
      return true;
   }

   @Override
   protected boolean a(dzo $$0, dis $$1, iu $$2) {
      return this.b($$1, $$2);
   }

   private boolean b(dhv $$0, iu $$1) {
      iu $$2 = $$1.a(ja.b);
      dzo $$3 = $$0.a_($$2);
      return dqy.a($$0, ja.b, $$2, $$3) || $$3.a(dlw.uc);
   }

   @Override
   protected dzo a(dzo $$0, dis $$1, dje $$2, iu $$3, ja $$4, iu $$5, dzo $$6, azt $$7) {
      if (!this.b($$1, $$3)) {
         $$2.a($$3, this, 1);
      }

      return $$0.b(b, Boolean.valueOf(!$$1.a_($$3.e()).a(this)));
   }

   @Override
   protected void a(dzo $$0, aro $$1, iu $$2, azt $$3) {
      if (!this.b($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   protected void a(dzp.a<dlu, dzo> $$0) {
      $$0.a(b);
   }

   @Override
   public boolean a(dis $$0, iu $$1, dzo $$2) {
      return this.o($$0.a_(this.a($$0, $$1).e()));
   }

   private boolean o(dzo $$0) {
      return $$0.l();
   }

   public iu a(dhv $$0, iu $$1) {
      iu.a $$2 = $$1.k();

      dzo $$3;
      do {
         $$2.c(ja.a);
         $$3 = $$0.a_($$2);
      } while ($$3.a(this));

      return $$2.a(ja.b).j();
   }

   @Override
   public boolean a(dip $$0, azt $$1, iu $$2, dzo $$3) {
      return true;
   }

   @Override
   public void a(aro $$0, azt $$1, iu $$2, dzo $$3) {
      iu $$4 = this.a($$0, $$2).e();
      if (this.o($$0.a_($$4))) {
         $$0.b($$4, $$3.b(b, Boolean.valueOf(true)));
      }
   }
}
