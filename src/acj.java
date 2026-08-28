public class acj implements zv<ach> {
   public static final zm<wl, acj> a = zv.a(acj::a, acj::new);
   private final int b;
   private final double c;
   private final double d;
   private final double e;
   private final int f;

   public acj(bte $$0) {
      this.b = $$0.al();
      this.c = $$0.du();
      this.d = $$0.dw();
      this.e = $$0.dA();
      this.f = $$0.p();
   }

   private acj(wl $$0) {
      this.b = $$0.l();
      this.c = $$0.readDouble();
      this.d = $$0.readDouble();
      this.e = $$0.readDouble();
      this.f = $$0.readShort();
   }

   private void a(wl $$0) {
      $$0.c(this.b);
      $$0.a(this.c);
      $$0.a(this.d);
      $$0.a(this.e);
      $$0.l(this.f);
   }

   @Override
   public zx<acj> a() {
      return agt.d;
   }

   public void a(ach $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public double e() {
      return this.c;
   }

   public double f() {
      return this.d;
   }

   public double g() {
      return this.e;
   }

   public int h() {
      return this.f;
   }
}
