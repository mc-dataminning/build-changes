import javax.annotation.Nullable;

public abstract class cmh extends cmg implements cmk {
   private je<csd> c = je.a(36, csd.i);
   @Nullable
   private akf d;
   private long e;

   protected cmh(bqr<?> $$0, czu $$1) {
      super($$0, $$1);
   }

   protected cmh(bqr<?> $$0, double $$1, double $$2, double $$3, czu $$4) {
      super($$0, $$4, $$1, $$2, $$3);
   }

   @Override
   public void a(bpj $$0) {
      super.a($$0);
      this.a($$0, this.dN(), this);
   }

   @Override
   public csd a(int $$0) {
      return this.f_($$0);
   }

   @Override
   public csd a(int $$0, int $$1) {
      return this.b($$0, $$1);
   }

   @Override
   public csd b(int $$0) {
      return this.e_($$0);
   }

   @Override
   public void a(int $$0, csd $$1) {
      this.c($$0, $$1);
   }

   @Override
   public brv a_(int $$0) {
      return this.g_($$0);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(ckl $$0) {
      return this.g($$0);
   }

   @Override
   public void a(bql.c $$0) {
      if (!this.dN().B && $$0.a()) {
         bom.a(this.dN(), this, this);
      }

      super.a($$0);
   }

   @Override
   protected void b(ty $$0) {
      super.b($$0);
      this.a($$0, this.dP());
   }

   @Override
   protected void a(ty $$0) {
      super.a($$0);
      this.b($$0, this.dP());
   }

   @Override
   public boq a(ckl $$0, bop $$1) {
      return this.c_($$0);
   }

   @Override
   protected void u() {
      float $$0 = 0.98F;
      if (this.d == null) {
         int $$1 = 15 - cnh.b(this);
         $$0 += (float)$$1 * 0.001F;
      }

      if (this.bc()) {
         $$0 *= 0.95F;
      }

      this.g(this.dq().d((double)$$0, 0.0, (double)$$0));
   }

   @Override
   public void a() {
      this.f();
   }

   public void a(akf $$0, long $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   @Nullable
   @Override
   public cnh createMenu(int $$0, ckk $$1, ckl $$2) {
      if (this.d != null && $$2.N_()) {
         return null;
      } else {
         this.f($$1.m);
         return this.a($$0, $$1);
      }
   }

   protected abstract cnh a(int var1, ckk var2);

   @Nullable
   @Override
   public akf B() {
      return this.d;
   }

   @Override
   public void a(@Nullable akf $$0) {
      this.d = $$0;
   }

   @Override
   public long C() {
      return this.e;
   }

   @Override
   public void a(long $$0) {
      this.e = $$0;
   }

   @Override
   public je<csd> D() {
      return this.c;
   }

   @Override
   public void E() {
      this.c = je.a(this.b(), csd.i);
   }
}
