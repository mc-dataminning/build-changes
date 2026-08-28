public record dfl(czy a, czy b, czy c) implements dev {
   @Override
   public czy a(int $$0) {
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

   public czy c() {
      return this.a;
   }

   public czy d() {
      return this.b;
   }

   public czy e() {
      return this.c;
   }
}
