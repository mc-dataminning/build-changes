import javax.annotation.Nullable;

public abstract class dvx extends duj implements btk {
   @Nullable
   protected aly<ewm> l;
   protected long m = 0L;

   protected dvx(dur<?> $$0, jh $$1, dxn $$2) {
      super($$0, $$1, $$2);
   }

   @Nullable
   @Override
   public aly<ewm> ax_() {
      return this.l;
   }

   @Override
   public void a(@Nullable aly<ewm> $$0) {
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
   public cxk a(int $$0) {
      this.d_(null);
      return super.a($$0);
   }

   @Override
   public cxk a(int $$0, int $$1) {
      this.d_(null);
      return super.a($$0, $$1);
   }

   @Override
   public cxk b(int $$0) {
      this.d_(null);
      return super.b($$0);
   }

   @Override
   public void a(int $$0, cxk $$1) {
      this.d_(null);
      super.a($$0, $$1);
   }

   @Override
   public boolean d(cps $$0) {
      return super.d($$0) && (this.l == null || !$$0.aa_());
   }

   @Nullable
   @Override
   public csx createMenu(int $$0, cpr $$1, cps $$2) {
      if (this.d($$2)) {
         this.d_($$1.k);
         return this.a($$0, $$1);
      } else {
         return null;
      }
   }

   @Override
   protected void a(dup.b $$0) {
      super.a($$0);
      dak $$1 = $$0.a(ku.ap);
      if ($$1 != null) {
         this.l = $$1.a();
         this.m = $$1.b();
      }
   }

   @Override
   protected void a(kq.a $$0) {
      super.a($$0);
      if (this.l != null) {
         $$0.a(ku.ap, new dak(this.l, this.m));
      }
   }

   @Override
   public void a(ux $$0) {
      super.a($$0);
      $$0.r("LootTable");
      $$0.r("LootTableSeed");
   }
}
