public record def(cys a, cys b, cys c) implements ddp {
   @Override
   public cys a(int $$0) {
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

   public cys c() {
      return this.a;
   }

   public cys d() {
      return this.b;
   }

   public cys e() {
      return this.c;
   }
}
