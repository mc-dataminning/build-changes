import javax.annotation.Nullable;

public abstract class dyg extends dwq implements buh {
   @Nullable
   protected alf<eze> l;
   protected long m = 0L;

   protected dyg(dwz<?> $$0, iu $$1, dzz $$2) {
      super($$0, $$1, $$2);
   }

   @Nullable
   @Override
   public alf<eze> as_() {
      return this.l;
   }

   @Override
   public void a(@Nullable alf<eze> $$0) {
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
   public cyy a(int $$0) {
      this.d_(null);
      return super.a($$0);
   }

   @Override
   public cyy a(int $$0, int $$1) {
      this.d_(null);
      return super.a($$0, $$1);
   }

   @Override
   public cyy b(int $$0) {
      this.d_(null);
      return super.b($$0);
   }

   @Override
   public void a(int $$0, cyy $$1) {
      this.d_(null);
      super.a($$0, $$1);
   }

   @Override
   public boolean d(cqy $$0) {
      return super.d($$0) && (this.l == null || !$$0.U_());
   }

   @Nullable
   @Override
   public cuq createMenu(int $$0, cqx $$1, cqy $$2) {
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
      dbz $$1 = $$0.a(kj.at);
      if ($$1 != null) {
         this.l = $$1.a();
         this.m = $$1.b();
      }
   }

   @Override
   protected void a(kg.a $$0) {
      super.a($$0);
      if (this.l != null) {
         $$0.a(kj.at, new dbz(this.l, this.m));
      }
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      $$0.r("LootTable");
      $$0.r("LootTableSeed");
   }
}
