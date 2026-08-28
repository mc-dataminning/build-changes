import javax.annotation.Nullable;

public class ckf extends cjq {
   private static final aku<jg<ckg>> bI = aky.a(ckf.class, akw.z);

   public ckf(bxn<? extends ckf> $$0, dkj $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(aky.a $$0) {
      super.a($$0);
      $$0.a(bI, cur.a(this.dX(), ckh.a));
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      cur.a($$0, this.p());
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      cur.a($$0, this.dX(), mi.aM).ifPresent(this::j);
   }

   @Nullable
   public ckf b(asb $$0, bwu $$1) {
      ckf $$2 = bxn.D.a($$0, bxm.e);
      if ($$2 != null && $$1 instanceof ckf $$3) {
         $$2.j(this.ae.h() ? this.p() : $$3.p());
      }

      return $$2;
   }

   @Override
   public byx a(dla $$0, bva $$1, bxm $$2, @Nullable byx $$3) {
      ckh.a(this.ae, this.dX(), cuo.a($$0, this.dv())).ifPresent(this::j);
      return super.a($$0, $$1, $$2, $$3);
   }

   public void j(jg<ckg> $$0) {
      this.al.a(bI, $$0);
   }

   public jg<ckg> p() {
      return this.al.a(bI);
   }

   @Nullable
   @Override
   public <T> T a(kk<? extends T> $$0) {
      return $$0 == kl.aI ? c((kk<T>)$$0, this.p()) : super.a($$0);
   }

   @Override
   protected void a(kg $$0) {
      this.a($$0, kl.aI);
      super.a($$0);
   }

   @Override
   protected <T> boolean b(kk<T> $$0, T $$1) {
      if ($$0 == kl.aI) {
         this.j(c(kl.aI, $$1));
         return true;
      } else {
         return super.b($$0, $$1);
      }
   }
}
