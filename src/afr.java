public class afr implements aac<acr> {
   public static final zt<ws, afr> a = aac.a(afr::a, afr::new);
   private final double b;
   private final double c;
   private final long d;

   public afr(dzk $$0) {
      this.b = $$0.i();
      this.c = $$0.k();
      this.d = $$0.j();
   }

   private afr(ws $$0) {
      this.b = $$0.readDouble();
      this.c = $$0.readDouble();
      this.d = $$0.m();
   }

   private void a(ws $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
      $$0.a(this.d);
   }

   @Override
   public aae<afr> a() {
      return ahk.aw;
   }

   public void a(acr $$0) {
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
