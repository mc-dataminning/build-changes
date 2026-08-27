public class aef implements zb<abm> {
   public static final ys<vu, aef> a = zb.a(aef::a, aef::new);
   private final double b;
   private final double c;

   public aef(dry $$0) {
      this.b = $$0.a();
      this.c = $$0.b();
   }

   private aef(vu $$0) {
      this.b = $$0.readDouble();
      this.c = $$0.readDouble();
   }

   private void a(vu $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
   }

   @Override
   public zd<aef> a() {
      return afx.ar;
   }

   public void a(abm $$0) {
      $$0.a(this);
   }

   public double b() {
      return this.c;
   }

   public double e() {
      return this.b;
   }
}
