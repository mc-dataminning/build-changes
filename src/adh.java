public record adh(fbx b, float c, float d) implements yw<abl> {
   public static final yn<vl, adh> a = yn.a(fbx.b, adh::b, yl.l, adh::e, yl.l, adh::f, adh::new);

   public static adh a(bva $$0) {
      return new adh($$0.ds(), $$0.dK(), $$0.dM());
   }

   @Override
   public yy<adh> a() {
      return agd.U;
   }

   public void a(abl $$0) {
      $$0.a(this);
   }

   public float e() {
      return this.c;
   }

   public float f() {
      return this.d;
   }
}
