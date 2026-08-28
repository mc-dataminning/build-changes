import javax.annotation.Nullable;

public abstract class dtt extends dsg implements bsj {
   @Nullable
   protected alh<euh> l;
   protected long m = 0L;

   protected dtt(dso<?> $$0, jh $$1, dvj $$2) {
      super($$0, $$1, $$2);
   }

   @Nullable
   @Override
   public alh<euh> ax_() {
      return this.l;
   }

   @Override
   public void a(@Nullable alh<euh> $$0) {
      this.l = $$0;
   }

   @Override
   public long aA_() {
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
   public cwb a(int $$0) {
      this.e_(null);
      return super.a($$0);
   }

   @Override
   public cwb a(int $$0, int $$1) {
      this.e_(null);
      return super.a($$0, $$1);
   }

   @Override
   public cwb b(int $$0) {
      this.e_(null);
      return super.b($$0);
   }

   @Override
   public void a(int $$0, cwb $$1) {
      this.e_(null);
      super.a($$0, $$1);
   }

   @Override
   public boolean d(com $$0) {
      return super.d($$0) && (this.l == null || !$$0.R_());
   }

   @Nullable
   @Override
   public cro createMenu(int $$0, col $$1, com $$2) {
      if (this.d($$2)) {
         this.e_($$1.k);
         return this.a($$0, $$1);
      } else {
         return null;
      }
   }

   @Override
   protected void a(dsm.b $$0) {
      super.a($$0);
      czb $$1 = $$0.a(ku.ap);
      if ($$1 != null) {
         this.l = $$1.a();
         this.m = $$1.b();
      }
   }

   @Override
   protected void a(kq.a $$0) {
      super.a($$0);
      if (this.l != null) {
         $$0.a(ku.ap, new czb(this.l, this.m));
      }
   }

   @Override
   public void a(uk $$0) {
      super.a($$0);
      $$0.r("LootTable");
      $$0.r("LootTableSeed");
   }
}
