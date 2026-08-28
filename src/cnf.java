import javax.annotation.Nullable;

public class cnf extends clw {
   public cnf(bvi<? extends cnf> $$0, dgz $$1) {
      super($$0, $$1);
      this.a(euh.i, 8.0F);
   }

   @Override
   protected void B() {
      this.bU.a(3, new ceo<>(this, cob.class, true));
      super.B();
   }

   @Override
   protected awu u() {
      return awv.Ds;
   }

   @Override
   protected awu e(btr $$0) {
      return awv.Du;
   }

   @Override
   protected awu o_() {
      return awv.Dt;
   }

   @Override
   awu p() {
      return awv.Dv;
   }

   @Override
   protected void a(arx $$0, btr $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      if ($$1.d() instanceof cma $$4 && $$4.gp()) {
         $$4.gq();
         this.a($$0, cxk.vl);
      }
   }

   @Override
   protected void a(bac $$0, bsy $$1) {
      this.a(bvj.a, new cxg(cxk.pw));
   }

   @Override
   protected void a(dhq $$0, bac $$1, bsy $$2) {
   }

   @Nullable
   @Override
   public bwq a(dhq $$0, bsy $$1, bvh $$2, @Nullable bwq $$3) {
      bwq $$4 = super.a($$0, $$1, $$2, $$3);
      this.g(bxf.c).a(4.0);
      this.t();
      return $$4;
   }

   @Override
   public boolean c(arx $$0, bvb $$1) {
      if (!super.c($$0, $$1)) {
         return false;
      } else {
         if ($$1 instanceof bvx) {
            ((bvx)$$1).b(new bug(bui.t, 200), this);
         }

         return true;
      }
   }

   @Override
   protected cpv a(cxg $$0, float $$1, @Nullable cxg $$2) {
      cpv $$3 = super.a($$0, $$1, $$2);
      $$3.d(100.0F);
      return $$3;
   }

   @Override
   public boolean b(bug $$0) {
      return $$0.a(bui.t) ? false : super.b($$0);
   }
}
