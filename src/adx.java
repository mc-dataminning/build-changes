public record adx(int a, int b, boolean c) implements xd<adg> {
   public adx(ug $$0) {
      this($$0.n(), $$0.n(), $$0.readBoolean());
   }

   @Override
   public void a(ug $$0) {
      $$0.c(this.a);
      $$0.c(this.b);
      $$0.a(this.c);
   }

   public void a(adg $$0) {
      $$0.a(this);
   }

   public int d() {
      return this.b;
   }

   public boolean e() {
      return this.c;
   }
}
