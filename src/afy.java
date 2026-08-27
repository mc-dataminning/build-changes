public class afy implements yp<afn> {
   public static final yg<vi, afy> a = yp.a(afy::a, afy::new);
   private final int b;
   private final String c;

   public afy(int $$0, String $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   private afy(vi $$0) {
      this.b = $$0.l();
      this.c = $$0.d(32500);
   }

   private void a(vi $$0) {
      $$0.c(this.b);
      $$0.a(this.c, 32500);
   }

   @Override
   public yr<afy> a() {
      return afl.bn;
   }

   public void a(afn $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public String e() {
      return this.c;
   }
}
