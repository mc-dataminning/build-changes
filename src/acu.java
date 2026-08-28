public class acu implements zj<aby> {
   public static final za<wn, acu> a = zj.a(acu::a, acu::new);
   private final int b;
   private final int c;
   private final int d;
   private final daa e;

   public acu(int $$0, int $$1, int $$2, daa $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3.v();
   }

   private acu(wn $$0) {
      this.b = $$0.x();
      this.c = $$0.l();
      this.d = $$0.readShort();
      this.e = daa.h.decode($$0);
   }

   private void a(wn $$0) {
      $$0.f(this.b);
      $$0.c(this.c);
      $$0.m(this.d);
      daa.h.encode($$0, this.e);
   }

   @Override
   public zl<acu> a() {
      return agr.v;
   }

   public void a(aby $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public int e() {
      return this.d;
   }

   public daa f() {
      return this.e;
   }

   public int g() {
      return this.c;
   }
}
