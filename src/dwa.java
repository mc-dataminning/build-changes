import javax.annotation.Nullable;

public abstract class dwa extends dum implements bte {
   @Nullable
   protected akt<ewt> l;
   protected long m = 0L;

   protected dwa(duu<?> $$0, ji $$1, dxq $$2) {
      super($$0, $$1, $$2);
   }

   @Nullable
   @Override
   public akt<ewt> aw_() {
      return this.l;
   }

   @Override
   public void a(@Nullable akt<ewt> $$0) {
      this.l = $$0;
   }

   @Override
   public long az_() {
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
   public cxh a(int $$0) {
      this.d_(null);
      return super.a($$0);
   }

   @Override
   public cxh a(int $$0, int $$1) {
      this.d_(null);
      return super.a($$0, $$1);
   }

   @Override
   public cxh b(int $$0) {
      this.d_(null);
      return super.b($$0);
   }

   @Override
   public void a(int $$0, cxh $$1) {
      this.d_(null);
      super.a($$0, $$1);
   }

   @Override
   public boolean d(cpr $$0) {
      return super.d($$0) && (this.l == null || !$$0.U_());
   }

   @Nullable
   @Override
   public csw createMenu(int $$0, cpq $$1, cpr $$2) {
      if (this.d($$2)) {
         this.d_($$1.k);
         return this.a($$0, $$1);
      } else {
         return null;
      }
   }

   @Override
   protected void a(dus.b $$0) {
      super.a($$0);
      daf $$1 = $$0.a(kv.ar);
      if ($$1 != null) {
         this.l = $$1.a();
         this.m = $$1.b();
      }
   }

   @Override
   protected void a(kr.a $$0) {
      super.a($$0);
      if (this.l != null) {
         $$0.a(kv.ar, new daf(this.l, this.m));
      }
   }

   @Override
   public void a(tq $$0) {
      super.a($$0);
      $$0.r("LootTable");
      $$0.r("LootTableSeed");
   }
}
