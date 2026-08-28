import javax.annotation.Nullable;

public abstract class cun extends cum implements cur {
   private jp<daa> b = jp.a(36, daa.k);
   @Nullable
   private alj<fao> c;
   private long d;

   protected cun(bxe<?> $$0, djz $$1) {
      super($$0, $$1);
   }

   @Override
   public void a(aru $$0, bvk $$1) {
      super.a($$0, $$1);
      this.a($$1, $$0, this);
   }

   @Override
   public daa a(int $$0) {
      return this.g_($$0);
   }

   @Override
   public daa a(int $$0, int $$1) {
      return this.b($$0, $$1);
   }

   @Override
   public daa b(int $$0) {
      return this.f_($$0);
   }

   @Override
   public void a(int $$0, daa $$1) {
      this.c($$0, $$1);
   }

   @Override
   public byn a_(int $$0) {
      return this.h_($$0);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(crz $$0) {
      return this.g($$0);
   }

   @Override
   public void a(bwv.d $$0) {
      if (!this.dV().C && $$0.a()) {
         bup.a(this.dV(), this, this);
      }

      super.a($$0);
   }

   @Override
   protected void b(ua $$0) {
      super.b($$0);
      this.a($$0, this.dX());
   }

   @Override
   protected void a(ua $$0) {
      super.a($$0);
      this.b($$0, this.dX());
   }

   @Override
   public but a(crz $$0, bus $$1) {
      return this.b_($$0);
   }

   @Override
   protected ffs a(ffs $$0) {
      float $$1 = 0.98F;
      if (this.c == null) {
         int $$2 = 15 - cvs.b(this);
         $$1 += (float)$$2 * 0.001F;
      }

      if (this.bi()) {
         $$1 *= 0.95F;
      }

      return $$0.d((double)$$1, 0.0, (double)$$1);
   }

   @Override
   public void a() {
      this.ak_();
   }

   public void a(alj<fao> $$0, long $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Nullable
   @Override
   public cvs createMenu(int $$0, cry $$1, crz $$2) {
      if (this.c != null && $$2.Z_()) {
         return null;
      } else {
         this.f($$1.h);
         return this.a($$0, $$1);
      }
   }

   protected abstract cvs a(int var1, cry var2);

   @Nullable
   @Override
   public alj<fao> q() {
      return this.c;
   }

   @Override
   public void a(@Nullable alj<fao> $$0) {
      this.c = $$0;
   }

   @Override
   public long s() {
      return this.d;
   }

   @Override
   public void a(long $$0) {
      this.d = $$0;
   }

   @Override
   public jp<daa> t() {
      return this.b;
   }

   @Override
   public void u() {
      this.b = jp.a(this.b(), daa.k);
   }
}
