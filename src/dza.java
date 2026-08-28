import javax.annotation.Nullable;

public abstract class dza extends dxk implements bum {
   @Nullable
   protected alf<ezy> l;
   protected long m = 0L;

   protected dza(dxt<?> $$0, iv $$1, eat $$2) {
      super($$0, $$1, $$2);
   }

   @Nullable
   @Override
   public alf<ezy> at_() {
      return this.l;
   }

   @Override
   public void a(@Nullable alf<ezy> $$0) {
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
   public czn a(int $$0) {
      this.d_(null);
      return super.a($$0);
   }

   @Override
   public czn a(int $$0, int $$1) {
      this.d_(null);
      return super.a($$0, $$1);
   }

   @Override
   public czn b(int $$0) {
      this.d_(null);
      return super.b($$0);
   }

   @Override
   public void a(int $$0, czn $$1) {
      this.d_(null);
      super.a($$0, $$1);
   }

   @Override
   public boolean d(crm $$0) {
      return super.d($$0) && (this.l == null || !$$0.V_());
   }

   @Nullable
   @Override
   public cvf createMenu(int $$0, crl $$1, crm $$2) {
      if (this.d($$2)) {
         this.d_($$1.h);
         return this.a($$0, $$1);
      } else {
         return null;
      }
   }

   @Override
   protected void a(kf $$0) {
      super.a($$0);
      dco $$1 = $$0.a(kk.at);
      if ($$1 != null) {
         this.l = $$1.a();
         this.m = $$1.b();
      }
   }

   @Override
   protected void a(kh.a $$0) {
      super.a($$0);
      if (this.l != null) {
         $$0.a(kk.at, new dco(this.l, this.m));
      }
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      $$0.p("LootTable");
      $$0.p("LootTableSeed");
   }
}
