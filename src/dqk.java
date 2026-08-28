import javax.annotation.Nullable;

public abstract class dqk extends doz implements bra {
   @Nullable
   protected ald<eql> l;
   protected long m = 0L;

   protected dqk(dph<?> $$0, iz $$1, dsa $$2) {
      super($$0, $$1, $$2);
   }

   @Nullable
   @Override
   public ald<eql> ax_() {
      return this.l;
   }

   @Override
   public void a(@Nullable ald<eql> $$0) {
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
   public cun a(int $$0) {
      this.e_(null);
      return super.a($$0);
   }

   @Override
   public cun a(int $$0, int $$1) {
      this.e_(null);
      return super.a($$0, $$1);
   }

   @Override
   public cun b(int $$0) {
      this.e_(null);
      return super.b($$0);
   }

   @Override
   public void a(int $$0, cun $$1) {
      this.e_(null);
      super.a($$0, $$1);
   }

   @Override
   public boolean d(cmv $$0) {
      return super.d($$0) && (this.l == null || !$$0.N_());
   }

   @Nullable
   @Override
   public cps createMenu(int $$0, cmu $$1, cmv $$2) {
      if (this.d($$2)) {
         this.e_($$1.l);
         return this.a($$0, $$1);
      } else {
         return null;
      }
   }

   @Override
   protected void a(dpf.b $$0) {
      super.a($$0);
      cxq $$1 = $$0.a(km.ad);
      if ($$1 != null) {
         this.l = $$1.a();
         this.m = $$1.b();
      }
   }

   @Override
   protected void a(ki.a $$0) {
      super.a($$0);
      if (this.l != null) {
         $$0.a(km.ad, new cxq(this.l, this.m));
      }
   }

   @Override
   public void a(ur $$0) {
      super.a($$0);
      $$0.r("LootTable");
      $$0.r("LootTableSeed");
   }
}
