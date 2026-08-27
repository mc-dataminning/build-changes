public class abb implements uo<abc> {
   private static final int a = 255;
   private final int b;
   private final String c;
   private final int d;
   private final se e;

   public abb(String $$0, int $$1, se $$2) {
      this.b = aa.b().e();
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
   }

   public abb(sf $$0) {
      this.b = $$0.m();
      this.c = $$0.e(255);
      this.d = $$0.readUnsignedShort();
      this.e = se.a($$0.m());
   }

   @Override
   public void a(sf $$0) {
      $$0.d(this.b);
      $$0.a(this.c);
      $$0.writeShort(this.d);
      $$0.d(this.e.a());
   }

   public void a(abc $$0) {
      $$0.a(this);
   }

   public se a() {
      return this.e;
   }

   public int c() {
      return this.b;
   }

   public String d() {
      return this.c;
   }

   public int e() {
      return this.d;
   }
}
