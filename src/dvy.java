import javax.annotation.Nullable;

public abstract class dvy extends duk implements btg {
   @Nullable
   protected alo<ewn> l;
   protected long m = 0L;

   protected dvy(dus<?> $$0, jh $$1, dxo $$2) {
      super($$0, $$1, $$2);
   }

   @Nullable
   @Override
   public alo<ewn> ax_() {
      return this.l;
   }

   @Override
   public void a(@Nullable alo<ewn> $$0) {
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
      this.d_(null);
      return super.c();
   }

   @Override
   public cxg a(int $$0) {
      this.d_(null);
      return super.a($$0);
   }

   @Override
   public cxg a(int $$0, int $$1) {
      this.d_(null);
      return super.a($$0, $$1);
   }

   @Override
   public cxg b(int $$0) {
      this.d_(null);
      return super.b($$0);
   }

   @Override
   public void a(int $$0, cxg $$1) {
      this.d_(null);
      super.a($$0, $$1);
   }

   @Override
   public boolean d(cpo $$0) {
      return super.d($$0) && (this.l == null || !$$0.aa_());
   }

   @Nullable
   @Override
   public cst createMenu(int $$0, cpn $$1, cpo $$2) {
      if (this.d($$2)) {
         this.d_($$1.k);
         return this.a($$0, $$1);
      } else {
         return null;
      }
   }

   @Override
   protected void a(duq.b $$0) {
      super.a($$0);
      dag $$1 = $$0.a(ku.ap);
      if ($$1 != null) {
         this.l = $$1.a();
         this.m = $$1.b();
      }
   }

   @Override
   protected void a(kq.a $$0) {
      super.a($$0);
      if (this.l != null) {
         $$0.a(ku.ap, new dag(this.l, this.m));
      }
   }

   @Override
   public void a(um $$0) {
      super.a($$0);
      $$0.r("LootTable");
      $$0.r("LootTableSeed");
   }
}
