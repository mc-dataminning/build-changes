public record dam(cvl a, cvl b, cvl c) implements czw {
   @Override
   public cvl a(int $$0) {
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

   public cvl c() {
      return this.a;
   }

   public cvl d() {
      return this.b;
   }

   public cvl e() {
      return this.c;
   }
}
