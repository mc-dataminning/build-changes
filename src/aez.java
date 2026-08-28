public class aez implements zp<ace> {
   public static final zg<wf, aez> a = zp.a(aez::a, aez::new);
   private final double b;
   private final double c;

   public aez(dxa $$0) {
      this.b = $$0.a();
      this.c = $$0.b();
   }

   private aez(wf $$0) {
      this.b = $$0.readDouble();
      this.c = $$0.readDouble();
   }

   private void a(wf $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
   }

   @Override
   public zr<aez> a() {
      return agt.as;
   }

   public void a(ace $$0) {
      $$0.a(this);
   }

   public double b() {
      return this.c;
   }

   public double e() {
      return this.b;
   }
}
