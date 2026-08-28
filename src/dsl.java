import javax.annotation.Nullable;

public abstract class dsl extends dqy implements brq {
   @Nullable
   protected ala<esy> l;
   protected long m = 0L;

   protected dsl(drg<?> $$0, je $$1, dua $$2) {
      super($$0, $$1, $$2);
   }

   @Nullable
   @Override
   public ala<esy> az_() {
      return this.l;
   }

   @Override
   public void a(@Nullable ala<esy> $$0) {
      this.l = $$0;
   }

   @Override
   public long aC_() {
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
   public cvl a(int $$0) {
      this.e_(null);
      return super.a($$0);
   }

   @Override
   public cvl a(int $$0, int $$1) {
      this.e_(null);
      return super.a($$0, $$1);
   }

   @Override
   public cvl b(int $$0) {
      this.e_(null);
      return super.b($$0);
   }

   @Override
   public void a(int $$0, cvl $$1) {
      this.e_(null);
      super.a($$0, $$1);
   }

   @Override
   public boolean d(cnp $$0) {
      return super.d($$0) && (this.l == null || !$$0.P_());
   }

   @Nullable
   @Override
   public cqq createMenu(int $$0, cno $$1, cnp $$2) {
      if (this.d($$2)) {
         this.e_($$1.k);
         return this.a($$0, $$1);
      } else {
         return null;
      }
   }

   @Override
   protected void a(dre.b $$0) {
      super.a($$0);
      cyo $$1 = $$0.a(kr.ah);
      if ($$1 != null) {
         this.l = $$1.a();
         this.m = $$1.b();
      }
   }

   @Override
   protected void a(kn.a $$0) {
      super.a($$0);
      if (this.l != null) {
         $$0.a(kr.ah, new cyo(this.l, this.m));
      }
   }

   @Override
   public void a(uf $$0) {
      super.a($$0);
      $$0.r("LootTable");
      $$0.r("LootTableSeed");
   }
}
