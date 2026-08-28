public class afb implements zv<ach> {
   public static final zm<wl, afb> a = zv.a(afb::a, afb::new);
   private final double b;
   private final double c;

   public afb(dtr $$0) {
      this.b = $$0.a();
      this.c = $$0.b();
   }

   private afb(wl $$0) {
      this.b = $$0.readDouble();
      this.c = $$0.readDouble();
   }

   private void a(wl $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
   }

   @Override
   public zx<afb> a() {
      return agt.ar;
   }

   public void a(ach $$0) {
      $$0.a(this);
   }

   public double b() {
      return this.c;
   }

   public double e() {
      return this.b;
   }
}
