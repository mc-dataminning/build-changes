public record dcz(cxo a, cxo b, cxo c) implements dcj {
   @Override
   public cxo a(int $$0) {
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

   public cxo c() {
      return this.a;
   }

   public cxo d() {
      return this.b;
   }

   public cxo e() {
      return this.c;
   }
}
