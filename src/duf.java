import javax.annotation.Nullable;

public abstract class duf extends dss implements bsq {
   @Nullable
   protected ali<eus> l;
   protected long m = 0L;

   protected duf(dta<?> $$0, jh $$1, dvv $$2) {
      super($$0, $$1, $$2);
   }

   @Nullable
   @Override
   public ali<eus> aw_() {
      return this.l;
   }

   @Override
   public void a(@Nullable ali<eus> $$0) {
      this.l = $$0;
   }

   @Override
   public long az_() {
      return this.m;
   }

   @Override
   public void a(long $$0) {
      this.m = $$0;
   }

   @Override
   public boolean c() {
      this.d_(null);
      return super.c();
   }

   @Override
   public cwm a(int $$0) {
      this.d_(null);
      return super.a($$0);
   }

   @Override
   public cwm a(int $$0, int $$1) {
      this.d_(null);
      return super.a($$0, $$1);
   }

   @Override
   public cwm b(int $$0) {
      this.d_(null);
      return super.b($$0);
   }

   @Override
   public void a(int $$0, cwm $$1) {
      this.d_(null);
      super.a($$0, $$1);
   }

   @Override
   public boolean d(cou $$0) {
      return super.d($$0) && (this.l == null || !$$0.Y_());
   }

   @Nullable
   @Override
   public crz createMenu(int $$0, cot $$1, cou $$2) {
      if (this.d($$2)) {
         this.d_($$1.k);
         return this.a($$0, $$1);
      } else {
         return null;
      }
   }

   @Override
   protected void a(dsy.b $$0) {
      super.a($$0);
      czm $$1 = $$0.a(ku.ap);
      if ($$1 != null) {
         this.l = $$1.a();
         this.m = $$1.b();
      }
   }

   @Override
   protected void a(kq.a $$0) {
      super.a($$0);
      if (this.l != null) {
         $$0.a(ku.ap, new czm(this.l, this.m));
      }
   }

   @Override
   public void a(ul $$0) {
      super.a($$0);
      $$0.r("LootTable");
      $$0.r("LootTableSeed");
   }
}
