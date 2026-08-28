public class aca implements zg<abu> {
   public static final yx<vw, aca> a = zg.a(aca::a, aca::new);
   private final int b;
   private final jd c;
   private final int d;

   public aca(int $$0, jd $$1, int $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   private aca(vw $$0) {
      this.b = $$0.l();
      this.c = $$0.e();
      this.d = $$0.readUnsignedByte();
   }

   private void a(vw $$0) {
      $$0.c(this.b);
      $$0.a(this.c);
      $$0.k(this.d);
   }

   @Override
   public zi<aca> a() {
      return agg.h;
   }

   public void a(abu $$0) {
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
