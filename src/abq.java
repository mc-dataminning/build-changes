public class abq implements yv<abk> {
   public static final ym<vl, abq> a = yv.a(abq::a, abq::new);
   private final int b;
   private final ji c;
   private final int d;

   public abq(int $$0, ji $$1, int $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   private abq(vl $$0) {
      this.b = $$0.l();
      this.c = $$0.e();
      this.d = $$0.readUnsignedByte();
   }

   private void a(vl $$0) {
      $$0.c(this.b);
      $$0.a(this.c);
      $$0.l(this.d);
   }

   @Override
   public yx<abq> a() {
      return agd.h;
   }

   public void a(abk $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public ji e() {
      return this.c;
   }

   public int f() {
      return this.d;
   }
}
