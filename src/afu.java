public class afu implements xx<aes> {
   public static final xo<uq, afu> a = xx.a(afu::a, afu::new);
   private final hz b;
   private final ie c;
   private final afu.a d;
   private final int e;

   public afu(afu.a $$0, hz $$1, ie $$2, int $$3) {
      this.d = $$0;
      this.b = $$1.i();
      this.c = $$2;
      this.e = $$3;
   }

   public afu(afu.a $$0, hz $$1, ie $$2) {
      this($$0, $$1, $$2, 0);
   }

   private afu(uq $$0) {
      this.d = $$0.b(afu.a.class);
      this.b = $$0.e();
      this.c = ie.a($$0.readUnsignedByte());
      this.e = $$0.n();
   }

   private void a(uq $$0) {
      $$0.a(this.d);
      $$0.a(this.b);
      $$0.k(this.c.d());
      $$0.c(this.e);
   }

   @Override
   public xz<afu> a() {
      return aeq.bG;
   }

   public void a(aes $$0) {
      $$0.a(this);
   }

   public hz b() {
      return this.b;
   }

   public ie e() {
      return this.c;
   }

   public afu.a f() {
      return this.d;
   }

   public int g() {
      return this.e;
   }

   public static enum a {
      a,
      b,
      c,
      d,
      e,
      f,
      g;
   }
}
