import javax.annotation.Nullable;

public abstract class dlk extends dka implements bnk {
   @Nullable
   protected ajh m;
   protected long n;

   protected dlk(dki<?> $$0, ib $$1, dmz $$2) {
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

      for (cqk $$0 : this.j()) {
         if (!$$0.b()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public cqk a(int $$0) {
      this.e_(null);
      return this.j().get($$0);
   }

   @Override
   public cqk a(int $$0, int $$1) {
      this.e_(null);
      cqk $$2 = bmw.a(this.j(), $$0, $$1);
      if (!$$2.b()) {
         this.e();
      }

      return $$2;
   }

   @Override
   public cqk b(int $$0) {
      this.e_(null);
      return bmw.a(this.j(), $$0);
   }

   @Override
   public void a(int $$0, cqk $$1) {
      this.e_(null);
      this.j().set($$0, $$1);
      if ($$1.M() > this.ak_()) {
         $$1.f(this.ak_());
      }

      this.e();
   }

   @Override
   public boolean a(cis $$0) {
      return bmv.a(this, $$0);
   }

   @Override
   public void a() {
      this.j().clear();
   }

   protected abstract iu<cqk> j();

   protected abstract void a(iu<cqk> var1);

   @Override
   public boolean d(cis $$0) {
      return super.d($$0) && (this.m == null || !$$0.N_());
   }

   @Nullable
   @Override
   public clo createMenu(int $$0, cir $$1, cis $$2) {
      if (this.d($$2)) {
         this.e_($$1.m);
         return this.a($$0, $$1);
      } else {
         return null;
      }
   }
}
