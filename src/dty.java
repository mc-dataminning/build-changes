import javax.annotation.Nullable;

public abstract class dty extends dsl implements bsn {
   @Nullable
   protected alk<eul> l;
   protected long m = 0L;

   protected dty(dst<?> $$0, jh $$1, dvo $$2) {
      super($$0, $$1, $$2);
   }

   @Nullable
   @Override
   public alk<eul> ax_() {
      return this.l;
   }

   @Override
   public void a(@Nullable alk<eul> $$0) {
      this.l = $$0;
   }

   @Override
   public long aA_() {
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
   public cwf a(int $$0) {
      this.e_(null);
      return super.a($$0);
   }

   @Override
   public cwf a(int $$0, int $$1) {
      this.e_(null);
      return super.a($$0, $$1);
   }

   @Override
   public cwf b(int $$0) {
      this.e_(null);
      return super.b($$0);
   }

   @Override
   public void a(int $$0, cwf $$1) {
      this.e_(null);
      super.a($$0, $$1);
   }

   @Override
   public boolean d(cor $$0) {
      return super.d($$0) && (this.l == null || !$$0.R_());
   }

   @Nullable
   @Override
   public crs createMenu(int $$0, coq $$1, cor $$2) {
      if (this.d($$2)) {
         this.e_($$1.k);
         return this.a($$0, $$1);
      } else {
         return null;
      }
   }

   @Override
   protected void a(dsr.b $$0) {
      super.a($$0);
      czf $$1 = $$0.a(ku.ap);
      if ($$1 != null) {
         this.l = $$1.a();
         this.m = $$1.b();
      }
   }

   @Override
   protected void a(kq.a $$0) {
      super.a($$0);
      if (this.l != null) {
         $$0.a(ku.ap, new czf(this.l, this.m));
      }
   }

   @Override
   public void a(un $$0) {
      super.a($$0);
      $$0.r("LootTable");
      $$0.r("LootTableSeed");
   }
}
