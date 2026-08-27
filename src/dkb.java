import javax.annotation.Nullable;

public abstract class dkb extends dir implements bme {
   @Nullable
   protected aiy m;
   protected long n;

   protected dkb(diz<?> $$0, hz $$1, dlj $$2) {
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
      return this.k().stream().allMatch(cpd::b);
   }

   @Override
   public cpd a(int $$0) {
      this.e_(null);
      return this.k().get($$0);
   }

   @Override
   public cpd a(int $$0, int $$1) {
      this.e_(null);
      cpd $$2 = blq.a(this.k(), $$0, $$1);
      if (!$$2.b()) {
         this.e();
      }

      return $$2;
   }

   @Override
   public cpd b(int $$0) {
      this.e_(null);
      return blq.a(this.k(), $$0);
   }

   @Override
   public void a(int $$0, cpd $$1) {
      this.e_(null);
      this.k().set($$0, $$1);
      if ($$1.M() > this.al_()) {
         $$1.f(this.al_());
      }

      this.e();
   }

   @Override
   public boolean a(chl $$0) {
      return blp.a(this, $$0);
   }

   @Override
   public void a() {
      this.k().clear();
   }

   protected abstract is<cpd> k();

   protected abstract void a(is<cpd> var1);

   @Override
   public boolean d(chl $$0) {
      return super.d($$0) && (this.m == null || !$$0.P_());
   }

   @Nullable
   @Override
   public ckf createMenu(int $$0, chk $$1, chl $$2) {
      if (this.d($$2)) {
         this.e_($$1.m);
         return this.a($$0, $$1);
      } else {
         return null;
      }
   }
}
