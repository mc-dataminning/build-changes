import javax.annotation.Nullable;

public abstract class cdh extends cdg implements cdk {
   private hp<cja> c = hp.a(36, cja.b);
   @Nullable
   private aeu d;
   private long e;

   protected cdh(bip<?> $$0, cpq $$1) {
      super($$0, $$1);
   }

   protected cdh(bip<?> $$0, double $$1, double $$2, double $$3, cpq $$4) {
      super($$0, $$4, $$1, $$2, $$3);
   }

   @Override
   public void a(bhj $$0) {
      super.a($$0);
      this.a($$0, this.dK(), this);
   }

   @Override
   public cja a(int $$0) {
      return this.f_($$0);
   }

   @Override
   public cja a(int $$0, int $$1) {
      return this.b($$0, $$1);
   }

   @Override
   public cja b(int $$0) {
      return this.e_($$0);
   }

   @Override
   public void a(int $$0, cja $$1) {
      this.c($$0, $$1);
   }

   @Override
   public bjt a_(int $$0) {
      return this.g_($$0);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(cbp $$0) {
      return this.g($$0);
   }

   @Override
   public void a(bil.c $$0) {
      if (!this.dK().B && $$0.a()) {
         bgp.a(this.dK(), this, this);
      }

      super.a($$0);
   }

   @Override
   protected void b(qu $$0) {
      super.b($$0);
      this.c($$0);
   }

   @Override
   protected void a(qu $$0) {
      super.a($$0);
      this.b_($$0);
   }

   @Override
   public bgt a(cbp $$0, bgs $$1) {
      return this.c_($$0);
   }

   @Override
   protected void p() {
      float $$0 = 0.98F;
      if (this.d == null) {
         int $$1 = 15 - ceg.b(this);
         $$0 += (float)$$1 * 0.001F;
      }

      if (this.aX()) {
         $$0 *= 0.95F;
      }

      this.f(this.dn().d((double)$$0, 0.0, (double)$$0));
   }

   @Override
   public void a() {
      this.f();
   }

   public void a(aeu $$0, long $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   @Nullable
   @Override
   public ceg createMenu(int $$0, cbo $$1, cbp $$2) {
      if (this.d != null && $$2.G_()) {
         return null;
      } else {
         this.f($$1.m);
         return this.a($$0, $$1);
      }
   }

   protected abstract ceg a(int var1, cbo var2);

   @Nullable
   @Override
   public aeu A() {
      return this.d;
   }

   @Override
   public void a(@Nullable aeu $$0) {
      this.d = $$0;
   }

   @Override
   public long B() {
      return this.e;
   }

   @Override
   public void a(long $$0) {
      this.e = $$0;
   }

   @Override
   public hp<cja> D() {
      return this.c;
   }

   @Override
   public void E() {
      this.c = hp.a(this.b(), cja.b);
   }
}
