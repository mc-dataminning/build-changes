public class aeq implements zd<abs> {
   public static final yu<vs, aeq> a = zd.a(aeq::a, aeq::new);
   private final double b;
   private final double c;

   public aeq(ebg $$0) {
      this.b = $$0.a();
      this.c = $$0.b();
   }

   private aeq(vs $$0) {
      this.b = $$0.readDouble();
      this.c = $$0.readDouble();
   }

   private void a(vs $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
   }

   @Override
   public zf<aeq> a() {
      return agl.av;
   }

   public void a(abs $$0) {
      $$0.a(this);
   }

   public double b() {
      return this.c;
   }

   public double e() {
      return this.b;
   }
}
