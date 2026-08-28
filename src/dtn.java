import javax.annotation.Nullable;

public abstract class dtn extends dsa implements bse {
   @Nullable
   protected alg<eub> l;
   protected long m = 0L;

   protected dtn(dsi<?> $$0, jg $$1, dvd $$2) {
      super($$0, $$1, $$2);
   }

   @Nullable
   @Override
   public alg<eub> ay_() {
      return this.l;
   }

   @Override
   public void a(@Nullable alg<eub> $$0) {
      this.l = $$0;
   }

   @Override
   public long aB_() {
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
   public cvx a(int $$0) {
      this.e_(null);
      return super.a($$0);
   }

   @Override
   public cvx a(int $$0, int $$1) {
      this.e_(null);
      return super.a($$0, $$1);
   }

   @Override
   public cvx b(int $$0) {
      this.e_(null);
      return super.b($$0);
   }

   @Override
   public void a(int $$0, cvx $$1) {
      this.e_(null);
      super.a($$0, $$1);
   }

   @Override
   public boolean d(coh $$0) {
      return super.d($$0) && (this.l == null || !$$0.R_());
   }

   @Nullable
   @Override
   public crj createMenu(int $$0, cog $$1, coh $$2) {
      if (this.d($$2)) {
         this.e_($$1.k);
         return this.a($$0, $$1);
      } else {
         return null;
      }
   }

   @Override
   protected void a(dsg.b $$0) {
      super.a($$0);
      cyv $$1 = $$0.a(kt.ao);
      if ($$1 != null) {
         this.l = $$1.a();
         this.m = $$1.b();
      }
   }

   @Override
   protected void a(kp.a $$0) {
      super.a($$0);
      if (this.l != null) {
         $$0.a(kt.ao, new cyv(this.l, this.m));
      }
   }

   @Override
   public void a(uj $$0) {
      super.a($$0);
      $$0.r("LootTable");
      $$0.r("LootTableSeed");
   }
}
