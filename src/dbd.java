public record dbd(cvs a, cvs b, cvs c) implements dan {
   @Override
   public cvs a(int $$0) {
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

   public cvs c() {
      return this.a;
   }

   public cvs d() {
      return this.b;
   }

   public cvs e() {
      return this.c;
   }
}
