public class abz implements zf<abt> {
   public static final yw<vv, abz> a = zf.a(abz::a, abz::new);
   private final int b;
   private final jd c;
   private final int d;

   public abz(int $$0, jd $$1, int $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   private abz(vv $$0) {
      this.b = $$0.l();
      this.c = $$0.e();
      this.d = $$0.readUnsignedByte();
   }

   private void a(vv $$0) {
      $$0.c(this.b);
      $$0.a(this.c);
      $$0.k(this.d);
   }

   @Override
   public zh<abz> a() {
      return agf.h;
   }

   public void a(abt $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public jd e() {
      return this.c;
   }

   public int f() {
      return this.d;
   }
}
