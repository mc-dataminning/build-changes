import javax.annotation.Nullable;

public abstract class dnk extends dlz implements boi {
   @Nullable
   protected ajt m;
   protected long n = 0L;

   protected dnk(dmh<?> $$0, ib $$1, doz $$2) {
      super($$0, $$1, $$2);
   }

   @Nullable
   @Override
   public ajt ay_() {
      return this.m;
   }

   @Override
   public void a(@Nullable ajt $$0) {
      this.m = $$0;
   }

   @Override
   public long az_() {
      return this.n;
   }

   @Override
   public void a(long $$0) {
      this.n = $$0;
   }

   @Override
   public boolean ah_() {
      this.e_(null);

      for (crj $$0 : this.j()) {
         if (!$$0.d()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public crj a(int $$0) {
      this.e_(null);
      return this.j().get($$0);
   }

   @Override
   public crj a(int $$0, int $$1) {
      this.e_(null);
      crj $$2 = bnu.a(this.j(), $$0, $$1);
      if (!$$2.d()) {
         this.e();
      }

      return $$2;
   }

   @Override
   public crj b(int $$0) {
      this.e_(null);
      return bnu.a(this.j(), $$0);
   }

   @Override
   public void a(int $$0, crj $$1) {
      this.e_(null);
      this.j().set($$0, $$1);
      if ($$1.G() > this.aj_()) {
         $$1.e(this.aj_());
      }

      this.e();
   }

   @Override
   public boolean a(cjt $$0) {
      return bnt.a(this, $$0);
   }

   @Override
   public void a() {
      this.j().clear();
   }

   protected abstract iu<crj> j();

   protected abstract void a(iu<crj> var1);

   @Override
   public boolean d(cjt $$0) {
      return super.d($$0) && (this.m == null || !$$0.N_());
   }

   @Nullable
   @Override
   public cmp createMenu(int $$0, cjs $$1, cjt $$2) {
      if (this.d($$2)) {
         this.e_($$1.m);
         return this.a($$0, $$1);
      } else {
         return null;
      }
   }

   @Override
   public void a(jl $$0) {
      super.a($$0);
      cuh $$1 = $$0.a(jp.U);
      if ($$1 != null) {
         this.m = $$1.a();
         this.n = $$1.b();
      }
   }

   @Override
   public void a(jl.a $$0) {
      super.a($$0);
      if (this.m != null) {
         $$0.a(jp.U, new cuh(this.m, this.n));
      }
   }

   @Override
   public void a(tm $$0) {
      super.a($$0);
      $$0.r("LootTable");
      $$0.r("LootTableSeed");
   }
}
