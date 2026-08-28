import javax.annotation.Nullable;

public abstract class dzn extends dxx implements buz {
   @Nullable
   protected alj<fao> l;
   protected long m = 0L;

   protected dzn(dyg<?> $$0, iw $$1, ebg $$2) {
      super($$0, $$1, $$2);
   }

   @Nullable
   @Override
   public alj<fao> ax_() {
      return this.l;
   }

   @Override
   public void a(@Nullable alj<fao> $$0) {
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
      this.d_(null);
      return super.c();
   }

   @Override
   public daa a(int $$0) {
      this.d_(null);
      return super.a($$0);
   }

   @Override
   public daa a(int $$0, int $$1) {
      this.d_(null);
      return super.a($$0, $$1);
   }

   @Override
   public daa b(int $$0) {
      this.d_(null);
      return super.b($$0);
   }

   @Override
   public void a(int $$0, daa $$1) {
      this.d_(null);
      super.a($$0, $$1);
   }

   @Override
   public boolean d(crz $$0) {
      return super.d($$0) && (this.l == null || !$$0.Z_());
   }

   @Nullable
   @Override
   public cvs createMenu(int $$0, cry $$1, crz $$2) {
      if (this.d($$2)) {
         this.d_($$1.h);
         return this.a($$0, $$1);
      } else {
         return null;
      }
   }

   @Override
   protected void a(kg $$0) {
      super.a($$0);
      ddb $$1 = $$0.a(kl.at);
      if ($$1 != null) {
         this.l = $$1.a();
         this.m = $$1.b();
      }
   }

   @Override
   protected void a(ki.a $$0) {
      super.a($$0);
      if (this.l != null) {
         $$0.a(kl.at, new ddb(this.l, this.m));
      }
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      $$0.r("LootTable");
      $$0.r("LootTableSeed");
   }
}
