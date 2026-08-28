public record ajc(long b) implements zb<ajb> {
   public static final ys<vr, ajc> a = zb.a(ajc::a, ajc::new);

   private ajc(vr $$0) {
      this($$0.readLong());
   }

   private void a(vr $$0) {
      $$0.b(this.b);
   }

   @Override
   public zd<ajc> a() {
      return ajd.a;
   }

   public void a(ajb $$0) {
      $$0.a(this);
   }
}
