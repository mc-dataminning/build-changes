import javax.annotation.Nullable;

public abstract class dsz extends drm implements brv {
   @Nullable
   protected alb<etm> l;
   protected long m = 0L;

   protected dsz(dru<?> $$0, je $$1, duo $$2) {
      super($$0, $$1, $$2);
   }

   @Nullable
   @Override
   public alb<etm> ax_() {
      return this.l;
   }

   @Override
   public void a(@Nullable alb<etm> $$0) {
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
   public cvp a(int $$0) {
      this.e_(null);
      return super.a($$0);
   }

   @Override
   public cvp a(int $$0, int $$1) {
      this.e_(null);
      return super.a($$0, $$1);
   }

   @Override
   public cvp b(int $$0) {
      this.e_(null);
      return super.b($$0);
   }

   @Override
   public void a(int $$0, cvp $$1) {
      this.e_(null);
      super.a($$0, $$1);
   }

   @Override
   public boolean d(cnu $$0) {
      return super.d($$0) && (this.l == null || !$$0.P_());
   }

   @Nullable
   @Override
   public cqw createMenu(int $$0, cnt $$1, cnu $$2) {
      if (this.d($$2)) {
         this.e_($$1.k);
         return this.a($$0, $$1);
      } else {
         return null;
      }
   }

   @Override
   protected void a(drs.b $$0) {
      super.a($$0);
      cyt $$1 = $$0.a(kr.ak);
      if ($$1 != null) {
         this.l = $$1.a();
         this.m = $$1.b();
      }
   }

   @Override
   protected void a(kn.a $$0) {
      super.a($$0);
      if (this.l != null) {
         $$0.a(kr.ak, new cyt(this.l, this.m));
      }
   }

   @Override
   public void a(uf $$0) {
      super.a($$0);
      $$0.r("LootTable");
      $$0.r("LootTableSeed");
   }
}
