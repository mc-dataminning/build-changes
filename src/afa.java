public record afa(float b, boolean c) implements yn<aay> {
   public static final ye<vg, afa> a = yn.a(afa::a, afa::new);

   private afa(vg $$0) {
      this($$0.readFloat(), $$0.readBoolean());
   }

   public static afa a(bol $$0) {
      return new afa($$0.f(), $$0.l());
   }

   private void a(vg $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
   }

   @Override
   public yp<afa> a() {
      return afj.cd;
   }

   public void a(aay $$0) {
      $$0.a(this);
   }

   public boolean e() {
      return this.c;
   }
}
