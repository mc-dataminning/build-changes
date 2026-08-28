import javax.annotation.Nullable;

public abstract class dwf extends dur implements btp {
   @Nullable
   protected aly<ewu> l;
   protected long m = 0L;

   protected dwf(duz<?> $$0, jh $$1, dxv $$2) {
      super($$0, $$1, $$2);
   }

   @Nullable
   @Override
   public aly<ewu> ax_() {
      return this.l;
   }

   @Override
   public void a(@Nullable aly<ewu> $$0) {
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
   public cxp a(int $$0) {
      this.d_(null);
      return super.a($$0);
   }

   @Override
   public cxp a(int $$0, int $$1) {
      this.d_(null);
      return super.a($$0, $$1);
   }

   @Override
   public cxp b(int $$0) {
      this.d_(null);
      return super.b($$0);
   }

   @Override
   public void a(int $$0, cxp $$1) {
      this.d_(null);
      super.a($$0, $$1);
   }

   @Override
   public boolean d(cpx $$0) {
      return super.d($$0) && (this.l == null || !$$0.aa_());
   }

   @Nullable
   @Override
   public ctc createMenu(int $$0, cpw $$1, cpx $$2) {
      if (this.d($$2)) {
         this.d_($$1.k);
         return this.a($$0, $$1);
      } else {
         return null;
      }
   }

   @Override
   protected void a(dux.b $$0) {
      super.a($$0);
      dap $$1 = $$0.a(ku.ap);
      if ($$1 != null) {
         this.l = $$1.a();
         this.m = $$1.b();
      }
   }

   @Override
   protected void a(kq.a $$0) {
      super.a($$0);
      if (this.l != null) {
         $$0.a(ku.ap, new dap(this.l, this.m));
      }
   }

   @Override
   public void a(ux $$0) {
      super.a($$0);
      $$0.r("LootTable");
      $$0.r("LootTableSeed");
   }
}
