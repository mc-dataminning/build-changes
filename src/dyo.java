import javax.annotation.Nullable;

public abstract class dyo extends dwy implements buj {
   @Nullable
   protected alf<ezm> l;
   protected long m = 0L;

   protected dyo(dxh<?> $$0, iu $$1, eah $$2) {
      super($$0, $$1, $$2);
   }

   @Nullable
   @Override
   public alf<ezm> at_() {
      return this.l;
   }

   @Override
   public void a(@Nullable alf<ezm> $$0) {
      this.l = $$0;
   }

   @Override
   public long aw_() {
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
   public czd a(int $$0) {
      this.d_(null);
      return super.a($$0);
   }

   @Override
   public czd a(int $$0, int $$1) {
      this.d_(null);
      return super.a($$0, $$1);
   }

   @Override
   public czd b(int $$0) {
      this.d_(null);
      return super.b($$0);
   }

   @Override
   public void a(int $$0, czd $$1) {
      this.d_(null);
      super.a($$0, $$1);
   }

   @Override
   public boolean d(crc $$0) {
      return super.d($$0) && (this.l == null || !$$0.V_());
   }

   @Nullable
   @Override
   public cuv createMenu(int $$0, crb $$1, crc $$2) {
      if (this.d($$2)) {
         this.d_($$1.h);
         return this.a($$0, $$1);
      } else {
         return null;
      }
   }

   @Override
   protected void a(ke $$0) {
      super.a($$0);
      dce $$1 = $$0.a(kj.at);
      if ($$1 != null) {
         this.l = $$1.a();
         this.m = $$1.b();
      }
   }

   @Override
   protected void a(kg.a $$0) {
      super.a($$0);
      if (this.l != null) {
         $$0.a(kj.at, new dce(this.l, this.m));
      }
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      $$0.r("LootTable");
      $$0.r("LootTableSeed");
   }
}
