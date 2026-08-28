import javax.annotation.Nullable;

public abstract class dql extends dpa implements brb {
   @Nullable
   protected ald<eqm> l;
   protected long m = 0L;

   protected dql(dpi<?> $$0, iz $$1, dsb $$2) {
      super($$0, $$1, $$2);
   }

   @Nullable
   @Override
   public ald<eqm> aw_() {
      return this.l;
   }

   @Override
   public void a(@Nullable ald<eqm> $$0) {
      this.l = $$0;
   }

   @Override
   public long ax_() {
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
   public boolean d(cmw $$0) {
      return super.d($$0) && (this.l == null || !$$0.N_());
   }

   @Nullable
   @Override
   public cpt createMenu(int $$0, cmv $$1, cmw $$2) {
      if (this.d($$2)) {
         this.e_($$1.l);
         return this.a($$0, $$1);
      } else {
         return null;
      }
   }

   @Override
   protected void a(dpg.b $$0) {
      super.a($$0);
      cxr $$1 = $$0.a(km.ae);
      if ($$1 != null) {
         this.l = $$1.a();
         this.m = $$1.b();
      }
   }

   @Override
   protected void a(ki.a $$0) {
      super.a($$0);
      if (this.l != null) {
         $$0.a(km.ae, new cxr(this.l, this.m));
      }
   }

   @Override
   public void a(ur $$0) {
      super.a($$0);
      $$0.r("LootTable");
      $$0.r("LootTableSeed");
   }
}
