import javax.annotation.Nullable;

public abstract class drm extends dpv implements bqi {
   @Nullable
   protected aks<eru> l;
   protected long m = 0L;

   protected drm(dqe<?> $$0, ir $$1, dtc $$2) {
      super($$0, $$1, $$2);
   }

   @Nullable
   @Override
   public aks<eru> ax_() {
      return this.l;
   }

   @Override
   public void a(@Nullable aks<eru> $$0) {
      this.l = $$0;
   }

   @Override
   public long ay_() {
      return this.m;
   }

   @Override
   public void a(long $$0) {
      this.m = $$0;
   }

   @Override
   public boolean c() {
      this.e_(null);
      return super.c();
   }

   @Override
   public cuh a(int $$0) {
      this.e_(null);
      return super.a($$0);
   }

   @Override
   public cuh a(int $$0, int $$1) {
      this.e_(null);
      return super.a($$0, $$1);
   }

   @Override
   public cuh b(int $$0) {
      this.e_(null);
      return super.b($$0);
   }

   @Override
   public void a(int $$0, cuh $$1) {
      this.e_(null);
      super.a($$0, $$1);
   }

   @Override
   public boolean d(cly $$0) {
      return super.d($$0) && (this.l == null || !$$0.O_());
   }

   @Nullable
   @Override
   public cpg createMenu(int $$0, clx $$1, cly $$2) {
      if (this.d($$2)) {
         this.e_($$1.l);
         return this.a($$0, $$1);
      } else {
         return null;
      }
   }

   @Override
   public void a(ka $$0) {
      super.a($$0);
      cxt $$1 = $$0.a(ke.ad);
      if ($$1 != null) {
         this.l = $$1.a();
         this.m = $$1.b();
      }
   }

   @Override
   public void a(ka.a $$0) {
      super.a($$0);
      if (this.l != null) {
         $$0.a(ke.ad, new cxt(this.l, this.m));
      }
   }

   @Override
   public void a(uk $$0) {
      super.a($$0);
      $$0.r("LootTable");
      $$0.r("LootTableSeed");
   }
}
