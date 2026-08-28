public record adu(ffs b, float c, float d) implements zj<aby> {
   public static final za<vy, adu> a = za.a(ffs.b, adu::b, yy.l, adu::e, yy.l, adu::f, adu::new);

   public static adu a(bwv $$0) {
      return new adu($$0.dt(), $$0.dL(), $$0.dN());
   }

   @Override
   public zl<adu> a() {
      return agr.V;
   }

   public void a(aby $$0) {
      $$0.a(this);
   }

   public float e() {
      return this.c;
   }

   public float f() {
      return this.d;
   }
}
