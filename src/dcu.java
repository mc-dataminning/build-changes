public record dcu(cxk a, cxk b, cxk c) implements dce {
   @Override
   public cxk a(int $$0) {
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

   public cxk c() {
      return this.a;
   }

   public cxk d() {
      return this.b;
   }

   public cxk e() {
      return this.c;
   }
}
