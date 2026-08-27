public record aeb(int a, int b, boolean c) implements xg<adk> {
   public aeb(uj $$0) {
      this($$0.n(), $$0.n(), $$0.readBoolean());
   }

   @Override
   public void a(uj $$0) {
      $$0.c(this.a);
      $$0.c(this.b);
      $$0.a(this.c);
   }

   public void a(adk $$0) {
      $$0.a(this);
   }

   public int d() {
      return this.b;
   }

   public boolean e() {
      return this.c;
   }
}
