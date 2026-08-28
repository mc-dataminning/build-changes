public class afo implements zo<acd> {
   public static final zf<we, afo> a = zo.a(afo::a, afo::new);
   private final float b;
   private final int c;
   private final float d;

   public afo(float $$0, int $$1, float $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   private afo(we $$0) {
      this.b = $$0.readFloat();
      this.c = $$0.l();
      this.d = $$0.readFloat();
   }

   private void a(we $$0) {
      $$0.a(this.b);
      $$0.c(this.c);
      $$0.a(this.d);
   }

   @Override
   public zq<afo> a() {
      return ags.aH;
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

   public float f() {
      return this.d;
   }
}
