import javax.annotation.Nullable;

public abstract class dgm extends dfc implements bji {
   @Nullable
   protected agm m;
   protected long n;

   protected dgm(dfk<?> $$0, hx $$1, dhn $$2) {
      super($$0, $$1, $$2);
   }

   @Nullable
   @Override
   public agm aA_() {
      return this.m;
   }

   @Override
   public void a(@Nullable agm $$0) {
      this.m = $$0;
   }

   @Override
   public long aB_() {
      return this.n;
   }

   @Override
   public void a(long $$0) {
      this.n = $$0;
   }

   @Override
   public boolean aj_() {
      this.e_(null);
      return this.k().stream().allMatch(clo::b);
   }

   @Override
   public clo a(int $$0) {
      this.e_(null);
      return this.k().get($$0);
   }

   @Override
   public clo a(int $$0, int $$1) {
      this.e_(null);
      clo $$2 = biv.a(this.k(), $$0, $$1);
      if (!$$2.b()) {
         this.e();
      }

      return $$2;
   }

   @Override
   public clo b(int $$0) {
      this.e_(null);
      return biv.a(this.k(), $$0);
   }

   @Override
   public void a(int $$0, clo $$1) {
      this.e_(null);
      this.k().set($$0, $$1);
      if ($$1.L() > this.al_()) {
         $$1.f(this.al_());
      }

      this.e();
   }

   @Override
   public boolean a(cdz $$0) {
      return biu.a(this, $$0);
   }

   @Override
   public void a() {
      this.k().clear();
   }

   protected abstract ip<clo> k();

   protected abstract void a(ip<clo> var1);

   @Override
   public boolean d(cdz $$0) {
      return super.d($$0) && (this.m == null || !$$0.P_());
   }

   @Nullable
   @Override
   public cgr createMenu(int $$0, cdy $$1, cdz $$2) {
      if (this.d($$2)) {
         this.e_($$1.m);
         return this.a($$0, $$1);
      } else {
         return null;
      }
   }
}
