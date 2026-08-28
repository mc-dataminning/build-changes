import javax.annotation.Nullable;

public abstract class dqw extends dpk implements bqp {
   @Nullable
   protected akj<erb> l;
   protected long m = 0L;

   protected dqw(dps<?> $$0, ja $$1, dsl $$2) {
      super($$0, $$1, $$2);
   }

   @Nullable
   @Override
   public akj<erb> ax_() {
      return this.l;
   }

   @Override
   public void a(@Nullable akj<erb> $$0) {
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
   public cud a(int $$0) {
      this.e_(null);
      return super.a($$0);
   }

   @Override
   public cud a(int $$0, int $$1) {
      this.e_(null);
      return super.a($$0, $$1);
   }

   @Override
   public cud b(int $$0) {
      this.e_(null);
      return super.b($$0);
   }

   @Override
   public void a(int $$0, cud $$1) {
      this.e_(null);
      super.a($$0, $$1);
   }

   @Override
   public boolean d(cml $$0) {
      return super.d($$0) && (this.l == null || !$$0.N_());
   }

   @Nullable
   @Override
   public cpi createMenu(int $$0, cmk $$1, cml $$2) {
      if (this.d($$2)) {
         this.e_($$1.l);
         return this.a($$0, $$1);
      } else {
         return null;
      }
   }

   @Override
   protected void a(dpq.b $$0) {
      super.a($$0);
      cxf $$1 = $$0.a(kn.ae);
      if ($$1 != null) {
         this.l = $$1.a();
         this.m = $$1.b();
      }
   }

   @Override
   protected void a(kj.a $$0) {
      super.a($$0);
      if (this.l != null) {
         $$0.a(kn.ae, new cxf(this.l, this.m));
      }
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);
      $$0.r("LootTable");
      $$0.r("LootTableSeed");
   }
}
