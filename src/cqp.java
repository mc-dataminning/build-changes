import javax.annotation.Nullable;

public abstract class cqp extends cqo implements cqs {
   private jz<cwf> c = jz.a(36, cwf.k);
   @Nullable
   private alk<eul> d;
   private long e;

   protected cqp(bup<?> $$0, dff $$1) {
      super($$0, $$1);
   }

   @Override
   public void a(bsy $$0) {
      super.a($$0);
      this.a($$0, this.dY(), this);
   }

   @Override
   public cwf a(int $$0) {
      return this.f_($$0);
   }

   @Override
   public cwf a(int $$0, int $$1) {
      return this.b($$0, $$1);
   }

   @Override
   public cwf b(int $$0) {
      return this.e_($$0);
   }

   @Override
   public void a(int $$0, cwf $$1) {
      this.c($$0, $$1);
   }

   @Override
   public bvw a_(int $$0) {
      return this.g_($$0);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(cor $$0) {
      return this.g($$0);
   }

   @Override
   public void a(bui.c $$0) {
      if (!this.dY().C && $$0.a()) {
         bsd.a(this.dY(), this, this);
      }

      super.a($$0);
   }

   @Override
   protected void b(un $$0) {
      super.b($$0);
      this.a($$0, this.ea());
   }

   @Override
   protected void a(un $$0) {
      super.a($$0);
      this.b($$0, this.ea());
   }

   @Override
   public bsh a(cor $$0, bsg $$1) {
      return this.c_($$0);
   }

   @Override
   protected ezr a(ezr $$0) {
      float $$1 = 0.98F;
      if (this.d == null) {
         int $$2 = 15 - crs.b(this);
         $$1 += (float)$$2 * 0.001F;
      }

      if (this.bl()) {
         $$1 *= 0.95F;
      }

      return $$0.d((double)$$1, 0.0, (double)$$1);
   }

   @Override
   public void a() {
      this.f();
   }

   public void a(alk<eul> $$0, long $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   @Nullable
   @Override
   public crs createMenu(int $$0, coq $$1, cor $$2) {
      if (this.d != null && $$2.R_()) {
         return null;
      } else {
         this.f($$1.k);
         return this.a($$0, $$1);
      }
   }

   protected abstract crs a(int var1, coq var2);

   @Nullable
   @Override
   public alk<eul> F() {
      return this.d;
   }

   @Override
   public void a(@Nullable alk<eul> $$0) {
      this.d = $$0;
   }

   @Override
   public long G() {
      return this.e;
   }

   @Override
   public void a(long $$0) {
      this.e = $$0;
   }

   @Override
   public jz<cwf> I() {
      return this.c;
   }

   @Override
   public void J() {
      this.c = jz.a(this.b(), cwf.k);
   }
}
