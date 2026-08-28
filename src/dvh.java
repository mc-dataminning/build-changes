import javax.annotation.Nullable;

public abstract class dvh extends dtt implements bsp {
   @Nullable
   protected akt<evw> l;
   protected long m = 0L;

   protected dvh(dub<?> $$0, ji $$1, dwx $$2) {
      super($$0, $$1, $$2);
   }

   @Nullable
   @Override
   public akt<evw> aw_() {
      return this.l;
   }

   @Override
   public void a(@Nullable akt<evw> $$0) {
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
   public cwp a(int $$0) {
      this.d_(null);
      return super.a($$0);
   }

   @Override
   public cwp a(int $$0, int $$1) {
      this.d_(null);
      return super.a($$0, $$1);
   }

   @Override
   public cwp b(int $$0) {
      this.d_(null);
      return super.b($$0);
   }

   @Override
   public void a(int $$0, cwp $$1) {
      this.d_(null);
      super.a($$0, $$1);
   }

   @Override
   public boolean d(cox $$0) {
      return super.d($$0) && (this.l == null || !$$0.Z_());
   }

   @Nullable
   @Override
   public csc createMenu(int $$0, cow $$1, cox $$2) {
      if (this.d($$2)) {
         this.d_($$1.k);
         return this.a($$0, $$1);
      } else {
         return null;
      }
   }

   @Override
   protected void a(dtz.b $$0) {
      super.a($$0);
      czp $$1 = $$0.a(kv.ap);
      if ($$1 != null) {
         this.l = $$1.a();
         this.m = $$1.b();
      }
   }

   @Override
   protected void a(kr.a $$0) {
      super.a($$0);
      if (this.l != null) {
         $$0.a(kv.ap, new czp(this.l, this.m));
      }
   }

   @Override
   public void a(tq $$0) {
      super.a($$0);
      $$0.r("LootTable");
      $$0.r("LootTableSeed");
   }
}
