public record dcb(cwq a, cwq b, cwq c) implements dbl {
   @Override
   public cwq a(int $$0) {
      return switch ($$0) {
         case 0 -> this.a;
         case 1 -> this.b;
         case 2 -> this.c;
         default -> throw new IllegalArgumentException("Recipe does not contain slot " + $$0);
      };
   }

   @Override
   public int a() {
      return 3;
   }

   @Override
   public boolean b() {
      return this.a.f() && this.b.f() && this.c.f();
   }

   public cwq c() {
      return this.a;
   }

   public cwq d() {
      return this.b;
   }

   public cwq e() {
      return this.c;
   }
}
