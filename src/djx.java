import javax.annotation.Nullable;

public abstract class djx extends din implements bmc {
   @Nullable
   protected aiy m;
   protected long n;

   protected djx(div<?> $$0, hz $$1, dlf $$2) {
      super($$0, $$1, $$2);
   }

   @Nullable
   @Override
   public aiy aC_() {
      return this.m;
   }

   @Override
   public void a(@Nullable aiy $$0) {
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
      return this.k().stream().allMatch(coz::b);
   }

   @Override
   public coz a(int $$0) {
      this.e_(null);
      return this.k().get($$0);
   }

   @Override
   public coz a(int $$0, int $$1) {
      this.e_(null);
      coz $$2 = blo.a(this.k(), $$0, $$1);
      if (!$$2.b()) {
         this.e();
      }

      return $$2;
   }

   @Override
   public coz b(int $$0) {
      this.e_(null);
      return blo.a(this.k(), $$0);
   }

   @Override
   public void a(int $$0, coz $$1) {
      this.e_(null);
      this.k().set($$0, $$1);
      if ($$1.M() > this.al_()) {
         $$1.f(this.al_());
      }

      this.e();
   }

   @Override
   public boolean a(chh $$0) {
      return bln.a(this, $$0);
   }

   @Override
   public void a() {
      this.k().clear();
   }

   protected abstract is<coz> k();

   protected abstract void a(is<coz> var1);

   @Override
   public boolean d(chh $$0) {
      return super.d($$0) && (this.m == null || !$$0.P_());
   }

   @Nullable
   @Override
   public ckb createMenu(int $$0, chg $$1, chh $$2) {
      if (this.d($$2)) {
         this.e_($$1.m);
         return this.a($$0, $$1);
      } else {
         return null;
      }
   }
}
