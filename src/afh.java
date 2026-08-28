public class afh implements zs<ace> {
   public static final zj<wl, afh> a = zs.a(afh::a, afh::new);
   private final iz b;
   private final float c;

   public afh(iz $$0, float $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   private afh(wl $$0) {
      this.b = $$0.e();
      this.c = $$0.readFloat();
   }

   private void a(wl $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
   }

   @Override
   public zu<afh> a() {
      return agq.aA;
   }

   public void a(ace $$0) {
      $$0.a(this);
   }

   public iz b() {
      return this.b;
   }

   public float e() {
      return this.c;
   }
}
