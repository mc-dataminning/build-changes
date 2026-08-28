public class afn implements zo<acd> {
   public static final zf<we, afn> a = zo.a(afn::a, afn::new);
   private final float b;
   private final int c;
   private final int d;

   public afn(float $$0, int $$1, int $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   private afn(we $$0) {
      this.b = $$0.readFloat();
      this.d = $$0.l();
      this.c = $$0.l();
   }

   private void a(we $$0) {
      $$0.a(this.b);
      $$0.c(this.d);
      $$0.c(this.c);
   }

   @Override
   public zq<afn> a() {
      return ags.aG;
   }

   public void a(acd $$0) {
      $$0.a(this);
   }

   public float b() {
      return this.b;
   }

   public int e() {
      return this.c;
   }

   public int f() {
      return this.d;
   }
}
