import javax.annotation.Nullable;

public class cpq extends coy {
   private int f = 200;

   public cpq(bup<? extends cpq> $$0, dff $$1) {
      super($$0, $$1);
   }

   public cpq(dff $$0, bve $$1, cwf $$2, @Nullable cwf $$3) {
      super(bup.aV, $$1, $$0, $$2, $$3);
   }

   public cpq(dff $$0, double $$1, double $$2, double $$3, cwf $$4, @Nullable cwf $$5) {
      super(bup.aV, $$1, $$2, $$3, $$0, $$4, $$5);
   }

   @Override
   public void l() {
      super.l();
      if (this.dY().C && !this.b) {
         this.dY().a(ls.R, this.dD(), this.dF(), this.dJ(), 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected void a(bve $$0) {
      super.a($$0);
      btn $$1 = new btn(btp.x, this.f, 0);
      $$0.b($$1, this.E());
   }

   @Override
   public void a(un $$0) {
      super.a($$0);
      if ($$0.e("Duration")) {
         this.f = $$0.h("Duration");
      }
   }

   @Override
   public void b(un $$0) {
      super.b($$0);
      $$0.a("Duration", this.f);
   }

   @Override
   protected cwf v() {
      return new cwf(cwj.vH);
   }
}
