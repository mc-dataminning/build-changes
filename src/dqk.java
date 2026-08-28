import com.mojang.serialization.MapCodec;

public class dqk extends dmy {
   public static final MapCodec<dqk> b = b(dqk::new);
   public static final dzd c = dzc.A;

   @Override
   public MapCodec<dqk> a() {
      return b;
   }

   public dqk(dyl.d $$0) {
      super($$0);
      this.l(this.B.b().b(a, jo.d).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dyn.a<dku, dym> $$0) {
      $$0.a(a, c);
   }

   @Override
   protected dym a(dym $$0, drm $$1) {
      return $$0.b(a, $$1.a($$0.c(a)));
   }

   @Override
   protected dym a(dym $$0, dpv $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(dym $$0, arn $$1, jj $$2, azs $$3) {
      if ($$0.c(c)) {
         $$1.a($$2, $$0.b(c, Boolean.valueOf(false)), 2);
      } else {
         $$1.a($$2, $$0.b(c, Boolean.valueOf(true)), 2);
         $$1.a($$2, this, 2);
      }

      this.a($$1, $$2, $$0);
   }

   @Override
   protected dym a(dym $$0, dhs $$1, die $$2, jj $$3, jo $$4, jj $$5, dym $$6, azs $$7) {
      if ($$0.c(a) == $$4 && !$$0.c(c)) {
         this.a($$1, $$2, $$3);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   private void a(dhs $$0, die $$1, jj $$2) {
      if (!$$0.w_() && !$$1.U().a($$2, this)) {
         $$1.a($$2, this, 2);
      }
   }

   protected void a(dhp $$0, jj $$1, dym $$2) {
      jo $$3 = $$2.c(a);
      jj $$4 = $$1.a($$3.g());
      ewb $$5 = evx.a($$0, $$3.g(), null);
      $$0.b($$4, this, $$5);
      $$0.a($$4, this, $$3, $$5);
   }

   @Override
   protected boolean f_(dym $$0) {
      return true;
   }

   @Override
   protected int b(dym $$0, dgv $$1, jj $$2, jo $$3) {
      return $$0.a($$1, $$2, $$3);
   }

   @Override
   protected int a(dym $$0, dgv $$1, jj $$2, jo $$3) {
      return $$0.c(c) && $$0.c(a) == $$3 ? 15 : 0;
   }

   @Override
   protected void a(dym $$0, dhp $$1, jj $$2, dym $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if (!$$1.w_() && $$0.c(c) && !$$1.U().a($$2, this)) {
            dym $$5 = $$0.b(c, Boolean.valueOf(false));
            $$1.a($$2, $$5, 18);
            this.a($$1, $$2, $$5);
         }
      }
   }

   @Override
   protected void a(dym $$0, arn $$1, jj $$2, boolean $$3) {
      if ($$0.c(c) && $$1.n().a($$2, this)) {
         this.a($$1, $$2, $$0.b(c, Boolean.valueOf(false)));
      }
   }

   @Override
   public dym a(dbn $$0) {
      return this.m().b(a, $$0.d().g().g());
   }
}
