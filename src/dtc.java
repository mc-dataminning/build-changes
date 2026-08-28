import javax.annotation.Nullable;

public abstract class dtc extends drp implements bry {
   @Nullable
   protected ald<etq> l;
   protected long m = 0L;

   protected dtc(drx<?> $$0, jf $$1, dus $$2) {
      super($$0, $$1, $$2);
   }

   @Nullable
   @Override
   public ald<etq> ay_() {
      return this.l;
   }

   @Override
   public void a(@Nullable ald<etq> $$0) {
      this.l = $$0;
   }

   @Override
   public long aB_() {
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
   public cvs a(int $$0) {
      this.e_(null);
      return super.a($$0);
   }

   @Override
   public cvs a(int $$0, int $$1) {
      this.e_(null);
      return super.a($$0, $$1);
   }

   @Override
   public cvs b(int $$0) {
      this.e_(null);
      return super.b($$0);
   }

   @Override
   public void a(int $$0, cvs $$1) {
      this.e_(null);
      super.a($$0, $$1);
   }

   @Override
   public boolean d(cnx $$0) {
      return super.d($$0) && (this.l == null || !$$0.Q_());
   }

   @Nullable
   @Override
   public cqz createMenu(int $$0, cnw $$1, cnx $$2) {
      if (this.d($$2)) {
         this.e_($$1.k);
         return this.a($$0, $$1);
      } else {
         return null;
      }
   }

   @Override
   protected void a(drv.b $$0) {
      super.a($$0);
      cyw $$1 = $$0.a(ks.ak);
      if ($$1 != null) {
         this.l = $$1.a();
         this.m = $$1.b();
      }
   }

   @Override
   protected void a(ko.a $$0) {
      super.a($$0);
      if (this.l != null) {
         $$0.a(ks.ak, new cyw(this.l, this.m));
      }
   }

   @Override
   public void a(ug $$0) {
      super.a($$0);
      $$0.r("LootTable");
      $$0.r("LootTableSeed");
   }
}
