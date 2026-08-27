import javax.annotation.Nullable;

public abstract class dlm extends dkc implements bnl {
   @Nullable
   protected ajh m;
   protected long n;

   protected dlm(dkk<?> $$0, ib $$1, dnb $$2) {
      super($$0, $$1, $$2);
   }

   @Nullable
   @Override
   public ajh aA_() {
      return this.m;
   }

   @Override
   public void a(@Nullable ajh $$0) {
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
   public boolean ai_() {
      this.e_(null);

      for (cqm $$0 : this.j()) {
         if (!$$0.b()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public cqm a(int $$0) {
      this.e_(null);
      return this.j().get($$0);
   }

   @Override
   public cqm a(int $$0, int $$1) {
      this.e_(null);
      cqm $$2 = bmx.a(this.j(), $$0, $$1);
      if (!$$2.b()) {
         this.e();
      }

      return $$2;
   }

   @Override
   public cqm b(int $$0) {
      this.e_(null);
      return bmx.a(this.j(), $$0);
   }

   @Override
   public void a(int $$0, cqm $$1) {
      this.e_(null);
      this.j().set($$0, $$1);
      if ($$1.M() > this.ak_()) {
         $$1.f(this.ak_());
      }

      this.e();
   }

   @Override
   public boolean a(ciu $$0) {
      return bmw.a(this, $$0);
   }

   @Override
   public void a() {
      this.j().clear();
   }

   protected abstract iu<cqm> j();

   protected abstract void a(iu<cqm> var1);

   @Override
   public boolean d(ciu $$0) {
      return super.d($$0) && (this.m == null || !$$0.N_());
   }

   @Nullable
   @Override
   public clq createMenu(int $$0, cit $$1, ciu $$2) {
      if (this.d($$2)) {
         this.e_($$1.m);
         return this.a($$0, $$1);
      } else {
         return null;
      }
   }
}
