public class afd implements zw<aci> {
   public static final zn<wm, afd> a = zw.a(afd::a, afd::new);
   private final double b;
   private final double c;
   private final long d;

   public afd(dtt $$0) {
      this.b = $$0.i();
      this.c = $$0.k();
      this.d = $$0.j();
   }

   private afd(wm $$0) {
      this.b = $$0.readDouble();
      this.c = $$0.readDouble();
      this.d = $$0.m();
   }

   private void a(wm $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
      $$0.a(this.d);
   }

   @Override
   public zy<afd> a() {
      return agu.as;
   }

   public void a(aci $$0) {
      $$0.a(this);
   }

   public double b() {
      return this.b;
   }

   public double e() {
      return this.c;
   }

   public long f() {
      return this.d;
   }
}
