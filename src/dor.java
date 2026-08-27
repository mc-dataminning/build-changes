import javax.annotation.Nullable;

public abstract class dor extends dng implements bpu {
   @Nullable
   protected akg<eoq> l;
   protected long m = 0L;

   protected dor(dno<?> $$0, in $$1, dqh $$2) {
      super($$0, $$1, $$2);
   }

   @Nullable
   @Override
   public akg<eoq> ax_() {
      return this.l;
   }

   @Override
   public void a(@Nullable akg<eoq> $$0) {
      this.l = $$0;
   }

   @Override
   public long ay_() {
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
   public csz a(int $$0) {
      this.e_(null);
      return super.a($$0);
   }

   @Override
   public csz a(int $$0, int $$1) {
      this.e_(null);
      return super.a($$0, $$1);
   }

   @Override
   public csz b(int $$0) {
      this.e_(null);
      return super.b($$0);
   }

   @Override
   public void a(int $$0, csz $$1) {
      this.e_(null);
      super.a($$0, $$1);
   }

   @Override
   public boolean d(clh $$0) {
      return super.d($$0) && (this.l == null || !$$0.N_());
   }

   @Nullable
   @Override
   public cod createMenu(int $$0, clg $$1, clh $$2) {
      if (this.d($$2)) {
         this.e_($$1.l);
         return this.a($$0, $$1);
      } else {
         return null;
      }
   }

   @Override
   public void a(jw $$0) {
      super.a($$0);
      cwa $$1 = $$0.a(ka.ab);
      if ($$1 != null) {
         this.l = $$1.a();
         this.m = $$1.b();
      }
   }

   @Override
   public void a(jw.a $$0) {
      super.a($$0);
      if (this.l != null) {
         $$0.a(ka.ab, new cwa(this.l, this.m));
      }
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      $$0.r("LootTable");
      $$0.r("LootTableSeed");
   }
}
