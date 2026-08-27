public record act(int b, float c) implements yz<abk> {
   public static final yq<vs, act> a = yz.a(act::a, act::new);

   public act(bre $$0) {
      this($$0.aj(), $$0.eH());
   }

   private act(vs $$0) {
      this($$0.l(), $$0.readFloat());
   }

   private void a(vs $$0) {
      $$0.c(this.b);
      $$0.a(this.c);
   }

   @Override
   public zb<act> a() {
      return afv.I;
   }

   public void a(abk $$0) {
      $$0.a(this);
   }

   public float e() {
      return this.c;
   }
}
