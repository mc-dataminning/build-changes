public record adr(int b, float c) implements zw<aci> {
   public static final zn<wm, adr> a = zw.a(adr::a, adr::new);

   public adr(btr $$0) {
      this($$0.al(), $$0.eJ());
   }

   private adr(wm $$0) {
      this($$0.l(), $$0.readFloat());
   }

   private void a(wm $$0) {
      $$0.c(this.b);
      $$0.a(this.c);
   }

   @Override
   public zy<adr> a() {
      return agu.I;
   }

   public void a(aci $$0) {
      $$0.a(this);
   }

   public float e() {
      return this.c;
   }
}
