import javax.annotation.Nullable;

public abstract class drl extends dpz implements bqy {
   @Nullable
   protected akp<erq> l;
   protected long m = 0L;

   protected drl(dqh<?> $$0, jd $$1, dta $$2) {
      super($$0, $$1, $$2);
   }

   @Nullable
   @Override
   public akp<erq> ax_() {
      return this.l;
   }

   @Override
   public void a(@Nullable akp<erq> $$0) {
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
   public cuo a(int $$0) {
      this.e_(null);
      return super.a($$0);
   }

   @Override
   public cuo a(int $$0, int $$1) {
      this.e_(null);
      return super.a($$0, $$1);
   }

   @Override
   public cuo b(int $$0) {
      this.e_(null);
      return super.b($$0);
   }

   @Override
   public void a(int $$0, cuo $$1) {
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
   protected void a(dqf.b $$0) {
      super.a($$0);
      cxt $$1 = $$0.a(kq.af);
      if ($$1 != null) {
         this.l = $$1.a();
         this.m = $$1.b();
      }
   }

   @Override
   protected void a(km.a $$0) {
      super.a($$0);
      if (this.l != null) {
         $$0.a(kq.af, new cxt(this.l, this.m));
      }
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      $$0.r("LootTable");
      $$0.r("LootTableSeed");
   }
}
