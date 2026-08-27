import javax.annotation.Nullable;

public abstract class dih extends dgx implements bkk {
   @Nullable
   protected ahh m;
   protected long n;

   protected dih(dhf<?> $$0, hx $$1, djp $$2) {
      super($$0, $$1, $$2);
   }

   @Nullable
   @Override
   public ahh aC_() {
      return this.m;
   }

   @Override
   public void a(@Nullable ahh $$0) {
      this.m = $$0;
   }

   @Override
   public long aD_() {
      return this.n;
   }

   @Override
   public void a(long $$0) {
      this.n = $$0;
   }

   @Override
   public boolean aj_() {
      this.e_(null);
      return this.k().stream().allMatch(cng::b);
   }

   @Override
   public cng a(int $$0) {
      this.e_(null);
      return this.k().get($$0);
   }

   @Override
   public cng a(int $$0, int $$1) {
      this.e_(null);
      cng $$2 = bjw.a(this.k(), $$0, $$1);
      if (!$$2.b()) {
         this.e();
      }

      return $$2;
   }

   @Override
   public cng b(int $$0) {
      this.e_(null);
      return bjw.a(this.k(), $$0);
   }

   @Override
   public void a(int $$0, cng $$1) {
      this.e_(null);
      this.k().set($$0, $$1);
      if ($$1.L() > this.al_()) {
         $$1.f(this.al_());
      }

      this.e();
   }

   @Override
   public boolean a(cfq $$0) {
      return bjv.a(this, $$0);
   }

   @Override
   public void a() {
      this.k().clear();
   }

   protected abstract iq<cng> k();

   protected abstract void a(iq<cng> var1);

   @Override
   public boolean d(cfq $$0) {
      return super.d($$0) && (this.m == null || !$$0.P_());
   }

   @Nullable
   @Override
   public cij createMenu(int $$0, cfp $$1, cfq $$2) {
      if (this.d($$2)) {
         this.e_($$1.m);
         return this.a($$0, $$1);
      } else {
         return null;
      }
   }
}
