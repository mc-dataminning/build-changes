public record agg(float b, boolean c) implements zl<aca> {
   public static final zc<wb, agg> a = zl.a(agg::a, agg::new);

   private agg(wb $$0) {
      this($$0.readFloat(), $$0.readBoolean());
   }

   public static agg a(bsb $$0) {
      return new agg($$0.f(), $$0.l());
   }

   private void a(wb $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
   }

   @Override
   public zn<agg> a() {
      return agp.ci;
   }

   public void a(aca $$0) {
      $$0.a(this);
   }

   public boolean e() {
      return this.c;
   }
}
