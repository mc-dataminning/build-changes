import javax.annotation.Nullable;

public abstract class dxw extends dwg implements bue {
   @Nullable
   protected ald<eys> l;
   protected long m = 0L;

   protected dxw(dwp<?> $$0, iu $$1, dzo $$2) {
      super($$0, $$1, $$2);
   }

   @Nullable
   @Override
   public ald<eys> as_() {
      return this.l;
   }

   @Override
   public void a(@Nullable ald<eys> $$0) {
      this.l = $$0;
   }

   @Override
   public long av_() {
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
   public cys a(int $$0) {
      this.d_(null);
      return super.a($$0);
   }

   @Override
   public cys a(int $$0, int $$1) {
      this.d_(null);
      return super.a($$0, $$1);
   }

   @Override
   public cys b(int $$0) {
      this.d_(null);
      return super.b($$0);
   }

   @Override
   public void a(int $$0, cys $$1) {
      this.d_(null);
      super.a($$0, $$1);
   }

   @Override
   public boolean d(cqs $$0) {
      return super.d($$0) && (this.l == null || !$$0.U_());
   }

   @Nullable
   @Override
   public cuk createMenu(int $$0, cqr $$1, cqs $$2) {
      if (this.d($$2)) {
         this.d_($$1.k);
         return this.a($$0, $$1);
      } else {
         return null;
      }
   }

   @Override
   protected void a(ke $$0) {
      super.a($$0);
      dbt $$1 = $$0.a(kj.at);
      if ($$1 != null) {
         this.l = $$1.a();
         this.m = $$1.b();
      }
   }

   @Override
   protected void a(kg.a $$0) {
      super.a($$0);
      if (this.l != null) {
         $$0.a(kj.at, new dbt(this.l, this.m));
      }
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);
      $$0.r("LootTable");
      $$0.r("LootTableSeed");
   }
}
