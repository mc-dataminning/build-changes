public record dex(czk a, czk b, czk c) implements deh {
   @Override
   public czk a(int $$0) {
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

   public czk c() {
      return this.a;
   }

   public czk d() {
      return this.b;
   }

   public czk e() {
      return this.c;
   }
}
