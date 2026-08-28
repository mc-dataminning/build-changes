public record agy(int b, int c, boolean d) implements yw<agg> {
   public static final yn<vl, agy> a = yw.a(agy::a, agy::new);

   private agy(vl $$0) {
      this($$0.l(), $$0.x(), $$0.readBoolean());
   }

   private void a(vl $$0) {
      $$0.c(this.b);
      $$0.f(this.c);
      $$0.a(this.d);
   }

   @Override
   public yy<agy> a() {
      return age.bB;
   }

   public void a(agg $$0) {
      $$0.a(this);
   }

   public int e() {
      return this.c;
   }

   public boolean f() {
      return this.d;
   }
}
