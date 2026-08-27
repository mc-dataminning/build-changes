public class adt implements yp<aba> {
   public static final yg<vi, adt> a = yp.a(adt::a, adt::new);
   private final double b;
   private final double c;

   public adt(dqz $$0) {
      this.b = $$0.a();
      this.c = $$0.b();
   }

   private adt(vi $$0) {
      this.b = $$0.readDouble();
      this.c = $$0.readDouble();
   }

   private void a(vi $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
   }

   @Override
   public yr<adt> a() {
      return afl.ar;
   }

   public void a(aba $$0) {
      $$0.a(this);
   }

   public double b() {
      return this.c;
   }

   public double e() {
      return this.b;
   }
}
