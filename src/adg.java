public record adg(int a, int b, boolean c) implements wo<acp> {
   public adg(ty $$0) {
      this($$0.n(), $$0.n(), $$0.readBoolean());
   }

   @Override
   public void a(ty $$0) {
      $$0.c(this.a);
      $$0.c(this.b);
      $$0.a(this.c);
   }

   public void a(acp $$0) {
      $$0.a(this);
   }

   public int d() {
      return this.b;
   }

   public boolean e() {
      return this.c;
   }
}
