import javax.annotation.Nullable;

public abstract class dkp extends djf implements bmt {
   @Nullable
   protected ajc m;
   protected long n;

   protected dkp(djn<?> $$0, ib $$1, dme $$2) {
      super($$0, $$1, $$2);
   }

   @Nullable
   @Override
   public ajc aB_() {
      return this.m;
   }

   @Override
   public void a(@Nullable ajc $$0) {
      this.m = $$0;
   }

   @Override
   public long aC_() {
      return this.n;
   }

   @Override
   public void a(long $$0) {
      this.n = $$0;
   }

   @Override
   public boolean aj_() {
      this.e_(null);
      return this.j().stream().allMatch(cpq::b);
   }

   @Override
   public cpq a(int $$0) {
      this.e_(null);
      return this.j().get($$0);
   }

   @Override
   public cpq a(int $$0, int $$1) {
      this.e_(null);
      cpq $$2 = bmf.a(this.j(), $$0, $$1);
      if (!$$2.b()) {
         this.e();
      }

      return $$2;
   }

   @Override
   public cpq b(int $$0) {
      this.e_(null);
      return bmf.a(this.j(), $$0);
   }

   @Override
   public void a(int $$0, cpq $$1) {
      this.e_(null);
      this.j().set($$0, $$1);
      if ($$1.M() > this.al_()) {
         $$1.f(this.al_());
      }

      this.e();
   }

   @Override
   public boolean a(cia $$0) {
      return bme.a(this, $$0);
   }

   @Override
   public void a() {
      this.j().clear();
   }

   protected abstract iu<cpq> j();

   protected abstract void a(iu<cpq> var1);

   @Override
   public boolean d(cia $$0) {
      return super.d($$0) && (this.m == null || !$$0.P_());
   }

   @Nullable
   @Override
   public cku createMenu(int $$0, chz $$1, cia $$2) {
      if (this.d($$2)) {
         this.e_($$1.m);
         return this.a($$0, $$1);
      } else {
         return null;
      }
   }
}
