import javax.annotation.Nullable;

public abstract class dqh extends dow implements bqx {
   @Nullable
   protected ala<eqi> l;
   protected long m = 0L;

   protected dqh(dpe<?> $$0, iz $$1, drx $$2) {
      super($$0, $$1, $$2);
   }

   @Nullable
   @Override
   public ala<eqi> ay_() {
      return this.l;
   }

   @Override
   public void a(@Nullable ala<eqi> $$0) {
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
      this.e_(null);
      return super.c();
   }

   @Override
   public cuk a(int $$0) {
      this.e_(null);
      return super.a($$0);
   }

   @Override
   public cuk a(int $$0, int $$1) {
      this.e_(null);
      return super.a($$0, $$1);
   }

   @Override
   public cuk b(int $$0) {
      this.e_(null);
      return super.b($$0);
   }

   @Override
   public void a(int $$0, cuk $$1) {
      this.e_(null);
      super.a($$0, $$1);
   }

   @Override
   public boolean d(cms $$0) {
      return super.d($$0) && (this.l == null || !$$0.N_());
   }

   @Nullable
   @Override
   public cpp createMenu(int $$0, cmr $$1, cms $$2) {
      if (this.d($$2)) {
         this.e_($$1.l);
         return this.a($$0, $$1);
      } else {
         return null;
      }
   }

   @Override
   protected void a(dpc.b $$0) {
      super.a($$0);
      cxn $$1 = $$0.a(km.ad);
      if ($$1 != null) {
         this.l = $$1.a();
         this.m = $$1.b();
      }
   }

   @Override
   protected void a(ki.a $$0) {
      super.a($$0);
      if (this.l != null) {
         $$0.a(km.ad, new cxn(this.l, this.m));
      }
   }

   @Override
   public void a(ur $$0) {
      super.a($$0);
      $$0.r("LootTable");
      $$0.r("LootTableSeed");
   }
}
