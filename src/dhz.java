import javax.annotation.Nullable;

public abstract class dhz extends dgp implements bki {
   @Nullable
   protected ahg m;
   protected long n;

   protected dhz(dgx<?> $$0, hx $$1, djh $$2) {
      super($$0, $$1, $$2);
   }

   @Nullable
   @Override
   public ahg az_() {
      return this.m;
   }

   @Override
   public void a(@Nullable ahg $$0) {
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
      return this.k().stream().allMatch(cmy::b);
   }

   @Override
   public cmy a(int $$0) {
      this.e_(null);
      return this.k().get($$0);
   }

   @Override
   public cmy a(int $$0, int $$1) {
      this.e_(null);
      cmy $$2 = bjv.a(this.k(), $$0, $$1);
      if (!$$2.b()) {
         this.e();
      }

      return $$2;
   }

   @Override
   public cmy b(int $$0) {
      this.e_(null);
      return bjv.a(this.k(), $$0);
   }

   @Override
   public void a(int $$0, cmy $$1) {
      this.e_(null);
      this.k().set($$0, $$1);
      if ($$1.L() > this.ak_()) {
         $$1.f(this.ak_());
      }

      this.e();
   }

   @Override
   public boolean a(cfi $$0) {
      return bju.a(this, $$0);
   }

   @Override
   public void a() {
      this.k().clear();
   }

   protected abstract iq<cmy> k();

   protected abstract void a(iq<cmy> var1);

   @Override
   public boolean d(cfi $$0) {
      return super.d($$0) && (this.m == null || !$$0.P_());
   }

   @Nullable
   @Override
   public cib createMenu(int $$0, cfh $$1, cfi $$2) {
      if (this.d($$2)) {
         this.e_($$1.m);
         return this.a($$0, $$1);
      } else {
         return null;
      }
   }
}
