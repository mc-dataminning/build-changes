import javax.annotation.Nullable;

public abstract class dhh extends dfx implements bjs {
   @Nullable
   protected agt m;
   protected long n;

   protected dhh(dgf<?> $$0, hv $$1, dip $$2) {
      super($$0, $$1, $$2);
   }

   @Nullable
   @Override
   public agt az_() {
      return this.m;
   }

   @Override
   public void a(@Nullable agt $$0) {
      this.m = $$0;
   }

   @Override
   public long aA_() {
      return this.n;
   }

   @Override
   public void a(long $$0) {
      this.n = $$0;
   }

   @Override
   public boolean ai_() {
      this.e_(null);
      return this.k().stream().allMatch(cmh::b);
   }

   @Override
   public cmh a(int $$0) {
      this.e_(null);
      return this.k().get($$0);
   }

   @Override
   public cmh a(int $$0, int $$1) {
      this.e_(null);
      cmh $$2 = bjf.a(this.k(), $$0, $$1);
      if (!$$2.b()) {
         this.e();
      }

      return $$2;
   }

   @Override
   public cmh b(int $$0) {
      this.e_(null);
      return bjf.a(this.k(), $$0);
   }

   @Override
   public void a(int $$0, cmh $$1) {
      this.e_(null);
      this.k().set($$0, $$1);
      if ($$1.L() > this.ak_()) {
         $$1.f(this.ak_());
      }

      this.e();
   }

   @Override
   public boolean a(cer $$0) {
      return bje.a(this, $$0);
   }

   @Override
   public void a() {
      this.k().clear();
   }

   protected abstract io<cmh> k();

   protected abstract void a(io<cmh> var1);

   @Override
   public boolean d(cer $$0) {
      return super.d($$0) && (this.m == null || !$$0.P_());
   }

   @Nullable
   @Override
   public chk createMenu(int $$0, ceq $$1, cer $$2) {
      if (this.d($$2)) {
         this.e_($$1.m);
         return this.a($$0, $$1);
      } else {
         return null;
      }
   }
}
