public class adu implements yp<aba> {
   public static final yg<vi, adu> a = yp.a(adu::a, adu::new);
   private final double b;
   private final double c;
   private final long d;

   public adu(dqz $$0) {
      this.b = $$0.i();
      this.c = $$0.k();
      this.d = $$0.j();
   }

   private adu(vi $$0) {
      this.b = $$0.readDouble();
      this.c = $$0.readDouble();
      this.d = $$0.m();
   }

   private void a(vi $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
      $$0.a(this.d);
   }

   @Override
   public yr<adu> a() {
      return afl.as;
   }

   public void a(aba $$0) {
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
