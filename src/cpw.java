import javax.annotation.Nullable;

public abstract class cpw extends cpv implements cpz {
   private jx<cvs> c = jx.a(36, cvs.k);
   @Nullable
   private ald<etq> d;
   private long e;

   protected cpw(bty<?> $$0, dej $$1) {
      super($$0, $$1);
   }

   protected cpw(bty<?> $$0, double $$1, double $$2, double $$3, dej $$4) {
      super($$0, $$4, $$1, $$2, $$3);
   }

   @Override
   public void a(bsj $$0) {
      super.a($$0);
      this.a($$0, this.dS(), this);
   }

   @Override
   public cvs a(int $$0) {
      return this.f_($$0);
   }

   @Override
   public cvs a(int $$0, int $$1) {
      return this.b($$0, $$1);
   }

   @Override
   public cvs b(int $$0) {
      return this.e_($$0);
   }

   @Override
   public void a(int $$0, cvs $$1) {
      this.c($$0, $$1);
   }

   @Override
   public bve a_(int $$0) {
      return this.g_($$0);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(cnx $$0) {
      return this.g($$0);
   }

   @Override
   public void a(btr.c $$0) {
      if (!this.dS().B && $$0.a()) {
         bro.a(this.dS(), this, this);
      }

      super.a($$0);
   }

   @Override
   protected void b(ug $$0) {
      super.b($$0);
      this.a($$0, this.dU());
   }

   @Override
   protected void a(ug $$0) {
      super.a($$0);
      this.b($$0, this.dU());
   }

   @Override
   public brs a(cnx $$0, brr $$1) {
      return this.c_($$0);
   }

   @Override
   protected eyw a(eyw $$0) {
      float $$1 = 0.98F;
      if (this.d == null) {
         int $$2 = 15 - cqz.b(this);
         $$1 += (float)$$2 * 0.001F;
      }

      if (this.bi()) {
         $$1 *= 0.95F;
      }

      return $$0.d((double)$$1, 0.0, (double)$$1);
   }

   @Override
   public void a() {
      this.f();
   }

   public void a(ald<etq> $$0, long $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   @Nullable
   @Override
   public cqz createMenu(int $$0, cnw $$1, cnx $$2) {
      if (this.d != null && $$2.Q_()) {
         return null;
      } else {
         this.f($$1.k);
         return this.a($$0, $$1);
      }
   }

   protected abstract cqz a(int var1, cnw var2);

   @Nullable
   @Override
   public ald<etq> F() {
      return this.d;
   }

   @Override
   public void a(@Nullable ald<etq> $$0) {
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
   public jx<cvs> I() {
      return this.c;
   }

   @Override
   public void J() {
      this.c = jx.a(this.b(), cvs.k);
   }
}
