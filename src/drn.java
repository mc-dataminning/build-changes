import javax.annotation.Nullable;

public abstract class drn extends dqb implements bqz {
   @Nullable
   protected akq<eru> l;
   protected long m = 0L;

   protected drn(dqj<?> $$0, jd $$1, dtc $$2) {
      super($$0, $$1, $$2);
   }

   @Nullable
   @Override
   public akq<eru> aB_() {
      return this.l;
   }

   @Override
   public void a(@Nullable akq<eru> $$0) {
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
   public boolean d(cmx $$0) {
      return super.d($$0) && (this.l == null || !$$0.R_());
   }

   @Nullable
   @Override
   public cpu createMenu(int $$0, cmw $$1, cmx $$2) {
      if (this.d($$2)) {
         this.e_($$1.l);
         return this.a($$0, $$1);
      } else {
         return null;
      }
   }

   @Override
   protected void a(dqh.b $$0) {
      super.a($$0);
      cxv $$1 = $$0.a(kq.af);
      if ($$1 != null) {
         this.l = $$1.a();
         this.m = $$1.b();
      }
   }

   @Override
   protected void a(km.a $$0) {
      super.a($$0);
      if (this.l != null) {
         $$0.a(kq.af, new cxv(this.l, this.m));
      }
   }

   @Override
   public void a(ub $$0) {
      super.a($$0);
      $$0.r("LootTable");
      $$0.r("LootTableSeed");
   }
}
