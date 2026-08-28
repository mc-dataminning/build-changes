public class acn implements zd<abs> {
   public static final yu<vs, acn> a = zd.a(acn::a, acn::new);
   private final int b;
   private final int c;
   private final int d;

   public acn(int $$0, int $$1, int $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   private acn(vs $$0) {
      this.b = $$0.x();
      this.c = $$0.readShort();
      this.d = $$0.readShort();
   }

   private void a(vs $$0) {
      $$0.f(this.b);
      $$0.m(this.c);
      $$0.m(this.d);
   }

   @Override
   public zf<acn> a() {
      return agl.u;
   }

   public void a(abs $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public int e() {
      return this.c;
   }

   public int f() {
      return this.d;
   }
}
