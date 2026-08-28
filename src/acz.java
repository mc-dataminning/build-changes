public class acz implements zo<acd> {
   public static final zf<we, acz> a = zo.a(acz::a, acz::new);
   private final int b;
   private final int c;
   private final int d;

   public acz(int $$0, int $$1, int $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   private acz(we $$0) {
      this.b = $$0.x();
      this.c = $$0.readShort();
      this.d = $$0.readShort();
   }

   private void a(we $$0) {
      $$0.f(this.b);
      $$0.m(this.c);
      $$0.m(this.d);
   }

   @Override
   public zq<acz> a() {
      return ags.v;
   }

   public void a(acd $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public int e() {
      return this.c;
   }

   public int f() {
      return this.d;
   }
}
