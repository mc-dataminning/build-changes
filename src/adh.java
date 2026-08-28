public record adh(int b, float c) implements zj<aby> {
   public static final za<vy, adh> a = zj.a(adh::a, adh::new);

   public adh(bxw $$0) {
      this($$0.ao(), $$0.eM());
   }

   private adh(vy $$0) {
      this($$0.l(), $$0.readFloat());
   }

   private void a(vy $$0) {
      $$0.c(this.b);
      $$0.a(this.c);
   }

   @Override
   public zl<adh> a() {
      return agr.I;
   }

   public void a(aby $$0) {
      $$0.a(this);
   }

   public float e() {
      return this.c;
   }
}
