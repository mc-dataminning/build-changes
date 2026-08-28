import javax.annotation.Nullable;

public abstract class dqn extends dpc implements brd {
   @Nullable
   protected ale<eqo> l;
   protected long m = 0L;

   protected dqn(dpk<?> $$0, iz $$1, dsd $$2) {
      super($$0, $$1, $$2);
   }

   @Nullable
   @Override
   public ale<eqo> aw_() {
      return this.l;
   }

   @Override
   public void a(@Nullable ale<eqo> $$0) {
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
   public cuq a(int $$0) {
      this.e_(null);
      return super.a($$0);
   }

   @Override
   public cuq a(int $$0, int $$1) {
      this.e_(null);
      return super.a($$0, $$1);
   }

   @Override
   public cuq b(int $$0) {
      this.e_(null);
      return super.b($$0);
   }

   @Override
   public void a(int $$0, cuq $$1) {
      this.e_(null);
      super.a($$0, $$1);
   }

   @Override
   public boolean d(cmy $$0) {
      return super.d($$0) && (this.l == null || !$$0.N_());
   }

   @Nullable
   @Override
   public cpv createMenu(int $$0, cmx $$1, cmy $$2) {
      if (this.d($$2)) {
         this.e_($$1.l);
         return this.a($$0, $$1);
      } else {
         return null;
      }
   }

   @Override
   protected void a(dpi.b $$0) {
      super.a($$0);
      cxt $$1 = $$0.a(km.ae);
      if ($$1 != null) {
         this.l = $$1.a();
         this.m = $$1.b();
      }
   }

   @Override
   protected void a(ki.a $$0) {
      super.a($$0);
      if (this.l != null) {
         $$0.a(km.ae, new cxt(this.l, this.m));
      }
   }

   @Override
   public void a(us $$0) {
      super.a($$0);
      $$0.r("LootTable");
      $$0.r("LootTableSeed");
   }
}
