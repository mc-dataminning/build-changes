public class afo implements zs<ace> {
   public static final zj<wl, afo> a = zs.a(afo::a, afo::new);
   private final float b;
   private final int c;
   private final float d;

   public afo(float $$0, int $$1, float $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   private afo(wl $$0) {
      this.b = $$0.readFloat();
      this.c = $$0.l();
      this.d = $$0.readFloat();
   }

   private void a(wl $$0) {
      $$0.a(this.b);
      $$0.c(this.c);
      $$0.a(this.d);
   }

   @Override
   public zu<afo> a() {
      return agq.aH;
   }

   public void a(ace $$0) {
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
