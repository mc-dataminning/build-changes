public record afm(float b, boolean c) implements yz<abk> {
   public static final yq<vs, afm> a = yz.a(afm::a, afm::new);

   private afm(vs $$0) {
      this($$0.readFloat(), $$0.readBoolean());
   }

   public static afm a(bpb $$0) {
      return new afm($$0.f(), $$0.l());
   }

   private void a(vs $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
   }

   @Override
   public zb<afm> a() {
      return afv.cd;
   }

   public void a(abk $$0) {
      $$0.a(this);
   }

   public boolean e() {
      return this.c;
   }
}
