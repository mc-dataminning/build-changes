import javax.annotation.Nullable;

public abstract class dzx extends dyh implements bvi {
   @Nullable
   protected alq<fay> l;
   protected long m = 0L;

   protected dzx(dyq<?> $$0, iw $$1, ebq $$2) {
      super($$0, $$1, $$2);
   }

   @Nullable
   @Override
   public alq<fay> ay_() {
      return this.l;
   }

   @Override
   public void a(@Nullable alq<fay> $$0) {
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
      this.d_(null);
      return super.c();
   }

   @Override
   public dak a(int $$0) {
      this.d_(null);
      return super.a($$0);
   }

   @Override
   public dak a(int $$0, int $$1) {
      this.d_(null);
      return super.a($$0, $$1);
   }

   @Override
   public dak b(int $$0) {
      this.d_(null);
      return super.b($$0);
   }

   @Override
   public void a(int $$0, dak $$1) {
      this.d_(null);
      super.a($$0, $$1);
   }

   @Override
   public boolean d(csi $$0) {
      return super.d($$0) && (this.l == null || !$$0.aa_());
   }

   @Nullable
   @Override
   public cwb createMenu(int $$0, csh $$1, csi $$2) {
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
      ddl $$1 = $$0.a(kl.at);
      if ($$1 != null) {
         this.l = $$1.a();
         this.m = $$1.b();
      }
   }

   @Override
   protected void a(ki.a $$0) {
      super.a($$0);
      if (this.l != null) {
         $$0.a(kl.at, new ddl(this.l, this.m));
      }
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      $$0.r("LootTable");
      $$0.r("LootTableSeed");
   }
}
