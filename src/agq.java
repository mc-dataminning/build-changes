public class agq implements yn<afl> {
   public static final ye<vg, agq> a = yn.a(agq::a, agq::new);
   private static final int b = 1;
   private static final int c = 2;
   private final float d;
   private final float e;
   private final boolean f;
   private final boolean g;

   public agq(float $$0, float $$1, boolean $$2, boolean $$3) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
   }

   private agq(vg $$0) {
      this.d = $$0.readFloat();
      this.e = $$0.readFloat();
      byte $$1 = $$0.readByte();
      this.f = ($$1 & 1) > 0;
      this.g = ($$1 & 2) > 0;
   }

   private void a(vg $$0) {
      $$0.a(this.d);
      $$0.a(this.e);
      byte $$1 = 0;
      if (this.f) {
         $$1 = (byte)($$1 | 1);
      }

      if (this.g) {
         $$1 = (byte)($$1 | 2);
      }

      $$0.k($$1);
   }

   @Override
   public yp<agq> a() {
      return afj.bK;
   }

   public void a(afl $$0) {
      $$0.a(this);
   }

   public float b() {
      return this.d;
   }

   public float e() {
      return this.e;
   }

   public boolean f() {
      return this.f;
   }

   public boolean g() {
      return this.g;
   }
}
