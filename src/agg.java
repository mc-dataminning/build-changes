public record agg(float b, boolean c) implements zh<abw> {
   public static final yy<vw, agg> a = zh.a(agg::a, agg::new);

   private agg(vw $$0) {
      this($$0.readFloat(), $$0.readBoolean());
   }

   public static agg a(bva $$0) {
      return new agg($$0.f(), $$0.l());
   }

   private void a(vw $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
   }

   @Override
   public zj<agg> a() {
      return agp.cq;
   }

   public void a(abw $$0) {
      $$0.a(this);
   }

   public boolean e() {
      return this.c;
   }
}
