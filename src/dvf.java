import javax.annotation.Nullable;

public abstract class dvf extends dtr implements bso {
   @Nullable
   protected akt<evu> l;
   protected long m = 0L;

   protected dvf(dtz<?> $$0, ji $$1, dwv $$2) {
      super($$0, $$1, $$2);
   }

   @Nullable
   @Override
   public akt<evu> aw_() {
      return this.l;
   }

   @Override
   public void a(@Nullable akt<evu> $$0) {
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
   public cwn a(int $$0) {
      this.d_(null);
      return super.a($$0);
   }

   @Override
   public cwn a(int $$0, int $$1) {
      this.d_(null);
      return super.a($$0, $$1);
   }

   @Override
   public cwn b(int $$0) {
      this.d_(null);
      return super.b($$0);
   }

   @Override
   public void a(int $$0, cwn $$1) {
      this.d_(null);
      super.a($$0, $$1);
   }

   @Override
   public boolean d(cov $$0) {
      return super.d($$0) && (this.l == null || !$$0.Z_());
   }

   @Nullable
   @Override
   public csa createMenu(int $$0, cou $$1, cov $$2) {
      if (this.d($$2)) {
         this.d_($$1.k);
         return this.a($$0, $$1);
      } else {
         return null;
      }
   }

   @Override
   protected void a(dtx.b $$0) {
      super.a($$0);
      czn $$1 = $$0.a(kv.ap);
      if ($$1 != null) {
         this.l = $$1.a();
         this.m = $$1.b();
      }
   }

   @Override
   protected void a(kr.a $$0) {
      super.a($$0);
      if (this.l != null) {
         $$0.a(kv.ap, new czn(this.l, this.m));
      }
   }

   @Override
   public void a(tq $$0) {
      super.a($$0);
      $$0.r("LootTable");
      $$0.r("LootTableSeed");
   }
}
