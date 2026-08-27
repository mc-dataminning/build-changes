import javax.annotation.Nullable;

public abstract class dnt extends dmi implements bon {
   @Nullable
   protected ajv m;
   protected long n = 0L;

   protected dnt(dmq<?> $$0, id $$1, dpi $$2) {
      super($$0, $$1, $$2);
   }

   @Nullable
   @Override
   public ajv ax_() {
      return this.m;
   }

   @Override
   public void a(@Nullable ajv $$0) {
      this.m = $$0;
   }

   @Override
   public long ay_() {
      return this.n;
   }

   @Override
   public void a(long $$0) {
      this.n = $$0;
   }

   @Override
   public boolean c() {
      this.e_(null);
      return super.c();
   }

   @Override
   public crs a(int $$0) {
      this.e_(null);
      return super.a($$0);
   }

   @Override
   public crs a(int $$0, int $$1) {
      this.e_(null);
      return super.a($$0, $$1);
   }

   @Override
   public crs b(int $$0) {
      this.e_(null);
      return super.b($$0);
   }

   @Override
   public void a(int $$0, crs $$1) {
      this.e_(null);
      super.a($$0, $$1);
   }

   @Override
   public boolean d(cka $$0) {
      return super.d($$0) && (this.m == null || !$$0.N_());
   }

   @Nullable
   @Override
   public cmw createMenu(int $$0, cjz $$1, cka $$2) {
      if (this.d($$2)) {
         this.e_($$1.m);
         return this.a($$0, $$1);
      } else {
         return null;
      }
   }

   @Override
   public void a(jn $$0) {
      super.a($$0);
      cuq $$1 = $$0.a(jr.U);
      if ($$1 != null) {
         this.m = $$1.a();
         this.n = $$1.b();
      }
   }

   @Override
   public void a(jn.a $$0) {
      super.a($$0);
      if (this.m != null) {
         $$0.a(jr.U, new cuq(this.m, this.n));
      }
   }

   @Override
   public void a(to $$0) {
      super.a($$0);
      $$0.r("LootTable");
      $$0.r("LootTableSeed");
   }
}
