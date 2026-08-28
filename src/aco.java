public class aco implements zd<abs> {
   public static final yu<wh, aco> a = zd.a(aco::a, aco::new);
   private final int b;
   private final int c;
   private final int d;
   private final cys e;

   public aco(int $$0, int $$1, int $$2, cys $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3.v();
   }

   private aco(wh $$0) {
      this.b = $$0.x();
      this.c = $$0.l();
      this.d = $$0.readShort();
      this.e = cys.h.decode($$0);
   }

   private void a(wh $$0) {
      $$0.f(this.b);
      $$0.c(this.c);
      $$0.m(this.d);
      cys.h.encode($$0, this.e);
   }

   @Override
   public zf<aco> a() {
      return agl.v;
   }

   public void a(abs $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public int e() {
      return this.d;
   }

   public cys f() {
      return this.e;
   }

   public int g() {
      return this.c;
   }
}
