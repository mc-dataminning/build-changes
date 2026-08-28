import javax.annotation.Nullable;

public abstract class dqv extends dpj implements bqo {
   @Nullable
   protected akj<eqz> l;
   protected long m = 0L;

   protected dqv(dpr<?> $$0, ja $$1, dsk $$2) {
      super($$0, $$1, $$2);
   }

   @Nullable
   @Override
   public akj<eqz> ax_() {
      return this.l;
   }

   @Override
   public void a(@Nullable akj<eqz> $$0) {
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
   public cuc a(int $$0) {
      this.e_(null);
      return super.a($$0);
   }

   @Override
   public cuc a(int $$0, int $$1) {
      this.e_(null);
      return super.a($$0, $$1);
   }

   @Override
   public cuc b(int $$0) {
      this.e_(null);
      return super.b($$0);
   }

   @Override
   public void a(int $$0, cuc $$1) {
      this.e_(null);
      super.a($$0, $$1);
   }

   @Override
   public boolean d(cmk $$0) {
      return super.d($$0) && (this.l == null || !$$0.N_());
   }

   @Nullable
   @Override
   public cph createMenu(int $$0, cmj $$1, cmk $$2) {
      if (this.d($$2)) {
         this.e_($$1.l);
         return this.a($$0, $$1);
      } else {
         return null;
      }
   }

   @Override
   protected void a(dpp.b $$0) {
      super.a($$0);
      cxe $$1 = $$0.a(kn.ae);
      if ($$1 != null) {
         this.l = $$1.a();
         this.m = $$1.b();
      }
   }

   @Override
   protected void a(kj.a $$0) {
      super.a($$0);
      if (this.l != null) {
         $$0.a(kn.ae, new cxe(this.l, this.m));
      }
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);
      $$0.r("LootTable");
      $$0.r("LootTableSeed");
   }
}
