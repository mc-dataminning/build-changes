public record dby(cwn a, cwn b, cwn c) implements dbi {
   @Override
   public cwn a(int $$0) {
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

   public cwn c() {
      return this.a;
   }

   public cwn d() {
      return this.b;
   }

   public cwn e() {
      return this.c;
   }
}
