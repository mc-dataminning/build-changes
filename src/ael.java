public class ael implements yw<abl> {
   public static final yn<vl, ael> a = yw.a(ael::a, ael::new);
   private final double b;
   private final double c;
   private final long d;

   public ael(dyo $$0) {
      this.b = $$0.i();
      this.c = $$0.k();
      this.d = $$0.j();
   }

   private ael(vl $$0) {
      this.b = $$0.readDouble();
      this.c = $$0.readDouble();
      this.d = $$0.m();
   }

   private void a(vl $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
      $$0.a(this.d);
   }

   @Override
   public yy<ael> a() {
      return age.aw;
   }

   public void a(abl $$0) {
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
