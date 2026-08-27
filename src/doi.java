import javax.annotation.Nullable;

public abstract class doi extends dmx implements boy {
   @Nullable
   protected akf m;
   protected long n = 0L;

   protected doi(dnf<?> $$0, im $$1, dpy $$2) {
      super($$0, $$1, $$2);
   }

   @Nullable
   @Override
   public akf ax_() {
      return this.m;
   }

   @Override
   public void a(@Nullable akf $$0) {
      this.m = $$0;
   }

   @Override
   public long ay_() {
      return this.n;
   }

   @Override
   public void a(long $$0) {
      this.n = $$0;
   }

   @Override
   public boolean c() {
      this.e_(null);
      return super.c();
   }

   @Override
   public csd a(int $$0) {
      this.e_(null);
      return super.a($$0);
   }

   @Override
   public csd a(int $$0, int $$1) {
      this.e_(null);
      return super.a($$0, $$1);
   }

   @Override
   public csd b(int $$0) {
      this.e_(null);
      return super.b($$0);
   }

   @Override
   public void a(int $$0, csd $$1) {
      this.e_(null);
      super.a($$0, $$1);
   }

   @Override
   public boolean d(ckl $$0) {
      return super.d($$0) && (this.m == null || !$$0.N_());
   }

   @Nullable
   @Override
   public cnh createMenu(int $$0, ckk $$1, ckl $$2) {
      if (this.d($$2)) {
         this.e_($$1.m);
         return this.a($$0, $$1);
      } else {
         return null;
      }
   }

   @Override
   public void a(jv $$0) {
      super.a($$0);
      cve $$1 = $$0.a(jz.U);
      if ($$1 != null) {
         this.m = $$1.a();
         this.n = $$1.b();
      }
   }

   @Override
   public void a(jv.a $$0) {
      super.a($$0);
      if (this.m != null) {
         $$0.a(jz.U, new cve(this.m, this.n));
      }
   }

   @Override
   public void a(ty $$0) {
      super.a($$0);
      $$0.r("LootTable");
      $$0.r("LootTableSeed");
   }
}
