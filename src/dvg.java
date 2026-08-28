import javax.annotation.Nullable;

public abstract class dvg extends dts implements bsp {
   @Nullable
   protected aku<evv> l;
   protected long m = 0L;

   protected dvg(dua<?> $$0, ji $$1, dww $$2) {
      super($$0, $$1, $$2);
   }

   @Nullable
   @Override
   public aku<evv> aw_() {
      return this.l;
   }

   @Override
   public void a(@Nullable aku<evv> $$0) {
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
   public cwo a(int $$0) {
      this.d_(null);
      return super.a($$0);
   }

   @Override
   public cwo a(int $$0, int $$1) {
      this.d_(null);
      return super.a($$0, $$1);
   }

   @Override
   public cwo b(int $$0) {
      this.d_(null);
      return super.b($$0);
   }

   @Override
   public void a(int $$0, cwo $$1) {
      this.d_(null);
      super.a($$0, $$1);
   }

   @Override
   public boolean d(cow $$0) {
      return super.d($$0) && (this.l == null || !$$0.Z_());
   }

   @Nullable
   @Override
   public csb createMenu(int $$0, cov $$1, cow $$2) {
      if (this.d($$2)) {
         this.d_($$1.k);
         return this.a($$0, $$1);
      } else {
         return null;
      }
   }

   @Override
   protected void a(dty.b $$0) {
      super.a($$0);
      czo $$1 = $$0.a(kv.ap);
      if ($$1 != null) {
         this.l = $$1.a();
         this.m = $$1.b();
      }
   }

   @Override
   protected void a(kr.a $$0) {
      super.a($$0);
      if (this.l != null) {
         $$0.a(kv.ap, new czo(this.l, this.m));
      }
   }

   @Override
   public void a(tq $$0) {
      super.a($$0);
      $$0.r("LootTable");
      $$0.r("LootTableSeed");
   }
}
