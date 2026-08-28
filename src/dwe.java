import javax.annotation.Nullable;

public abstract class dwe extends duq implements bto {
   @Nullable
   protected aly<ewt> l;
   protected long m = 0L;

   protected dwe(duy<?> $$0, jh $$1, dxu $$2) {
      super($$0, $$1, $$2);
   }

   @Nullable
   @Override
   public aly<ewt> ax_() {
      return this.l;
   }

   @Override
   public void a(@Nullable aly<ewt> $$0) {
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
   public cxo a(int $$0) {
      this.d_(null);
      return super.a($$0);
   }

   @Override
   public cxo a(int $$0, int $$1) {
      this.d_(null);
      return super.a($$0, $$1);
   }

   @Override
   public cxo b(int $$0) {
      this.d_(null);
      return super.b($$0);
   }

   @Override
   public void a(int $$0, cxo $$1) {
      this.d_(null);
      super.a($$0, $$1);
   }

   @Override
   public boolean d(cpw $$0) {
      return super.d($$0) && (this.l == null || !$$0.aa_());
   }

   @Nullable
   @Override
   public ctb createMenu(int $$0, cpv $$1, cpw $$2) {
      if (this.d($$2)) {
         this.d_($$1.k);
         return this.a($$0, $$1);
      } else {
         return null;
      }
   }

   @Override
   protected void a(duw.b $$0) {
      super.a($$0);
      dao $$1 = $$0.a(ku.ap);
      if ($$1 != null) {
         this.l = $$1.a();
         this.m = $$1.b();
      }
   }

   @Override
   protected void a(kq.a $$0) {
      super.a($$0);
      if (this.l != null) {
         $$0.a(ku.ap, new dao(this.l, this.m));
      }
   }

   @Override
   public void a(ux $$0) {
      super.a($$0);
      $$0.r("LootTable");
      $$0.r("LootTableSeed");
   }
}
