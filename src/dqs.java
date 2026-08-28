import javax.annotation.Nullable;

public abstract class dqs extends dph implements bql {
   @Nullable
   protected akj<eqt> l;
   protected long m = 0L;

   protected dqs(dpp<?> $$0, ja $$1, dsh $$2) {
      super($$0, $$1, $$2);
   }

   @Nullable
   @Override
   public akj<eqt> ax_() {
      return this.l;
   }

   @Override
   public void a(@Nullable akj<eqt> $$0) {
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
   public cua a(int $$0) {
      this.e_(null);
      return super.a($$0);
   }

   @Override
   public cua a(int $$0, int $$1) {
      this.e_(null);
      return super.a($$0, $$1);
   }

   @Override
   public cua b(int $$0) {
      this.e_(null);
      return super.b($$0);
   }

   @Override
   public void a(int $$0, cua $$1) {
      this.e_(null);
      super.a($$0, $$1);
   }

   @Override
   public boolean d(cmh $$0) {
      return super.d($$0) && (this.l == null || !$$0.N_());
   }

   @Nullable
   @Override
   public cpe createMenu(int $$0, cmg $$1, cmh $$2) {
      if (this.d($$2)) {
         this.e_($$1.l);
         return this.a($$0, $$1);
      } else {
         return null;
      }
   }

   @Override
   protected void a(dpn.b $$0) {
      super.a($$0);
      cxc $$1 = $$0.a(kn.ae);
      if ($$1 != null) {
         this.l = $$1.a();
         this.m = $$1.b();
      }
   }

   @Override
   protected void a(kj.a $$0) {
      super.a($$0);
      if (this.l != null) {
         $$0.a(kn.ae, new cxc(this.l, this.m));
      }
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);
      $$0.r("LootTable");
      $$0.r("LootTableSeed");
   }
}
