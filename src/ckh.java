import javax.annotation.Nullable;

public class ckh extends ciy {
   public ckh(bsm<? extends ckh> $$0, dcf $$1) {
      super($$0, $$1);
      this.a(eoy.i, 8.0F);
   }

   @Override
   protected void z() {
      this.bV.a(3, new cbs<>(this, ckz.class, true));
      super.z();
   }

   @Override
   protected avg v() {
      return avh.CC;
   }

   @Override
   protected avg d(bqz $$0) {
      return avh.CE;
   }

   @Override
   protected avg o_() {
      return avh.CD;
   }

   @Override
   avg u() {
      return avh.CF;
   }

   @Override
   protected void a(bqz $$0, boolean $$1) {
      super.a($$0, $$1);
      if ($$0.d() instanceof cjc $$3 && $$3.gp()) {
         $$3.gq();
         this.a((dce)cuf.um);
      }
   }

   @Override
   protected void a(ayo $$0, bqe $$1) {
      this.a(bsn.a, new cuc(cuf.oR));
   }

   @Override
   protected void b(ayo $$0, bqe $$1) {
   }

   @Nullable
   @Override
   public btu a(dcu $$0, bqe $$1, btf $$2, @Nullable btu $$3) {
      btu $$4 = super.a($$0, $$1, $$2, $$3);
      this.f(buj.c).a(4.0);
      this.y();
      return $$4;
   }

   @Override
   public boolean D(bsg $$0) {
      if (!super.D($$0)) {
         return false;
      } else {
         if ($$0 instanceof btb) {
            ((btb)$$0).b(new bro(brq.t, 200), this);
         }

         return true;
      }
   }

   @Override
   protected cmq a(cuc $$0, float $$1, @Nullable cuc $$2) {
      cmq $$3 = super.a($$0, $$1, $$2);
      $$3.d(100.0F);
      return $$3;
   }

   @Override
   public boolean c(bro $$0) {
      return $$0.a(brq.t) ? false : super.c($$0);
   }
}
