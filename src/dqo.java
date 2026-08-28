import javax.annotation.Nullable;

public abstract class dqo extends dpd implements bre {
   @Nullable
   protected ale<eqp> l;
   protected long m = 0L;

   protected dqo(dpl<?> $$0, iz $$1, dse $$2) {
      super($$0, $$1, $$2);
   }

   @Nullable
   @Override
   public ale<eqp> aw_() {
      return this.l;
   }

   @Override
   public void a(@Nullable ale<eqp> $$0) {
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
   public cur a(int $$0) {
      this.e_(null);
      return super.a($$0);
   }

   @Override
   public cur a(int $$0, int $$1) {
      this.e_(null);
      return super.a($$0, $$1);
   }

   @Override
   public cur b(int $$0) {
      this.e_(null);
      return super.b($$0);
   }

   @Override
   public void a(int $$0, cur $$1) {
      this.e_(null);
      super.a($$0, $$1);
   }

   @Override
   public boolean d(cmz $$0) {
      return super.d($$0) && (this.l == null || !$$0.N_());
   }

   @Nullable
   @Override
   public cpw createMenu(int $$0, cmy $$1, cmz $$2) {
      if (this.d($$2)) {
         this.e_($$1.l);
         return this.a($$0, $$1);
      } else {
         return null;
      }
   }

   @Override
   protected void a(dpj.b $$0) {
      super.a($$0);
      cxu $$1 = $$0.a(km.ae);
      if ($$1 != null) {
         this.l = $$1.a();
         this.m = $$1.b();
      }
   }

   @Override
   protected void a(ki.a $$0) {
      super.a($$0);
      if (this.l != null) {
         $$0.a(km.ae, new cxu(this.l, this.m));
      }
   }

   @Override
   public void a(us $$0) {
      super.a($$0);
      $$0.r("LootTable");
      $$0.r("LootTableSeed");
   }
}
