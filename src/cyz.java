public record cyz(cua a, cua b, cua c) implements cyj {
   @Override
   public cua a(int $$0) {
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
      return this.a.e() && this.b.e() && this.c.e();
   }

   public cua c() {
      return this.a;
   }

   public cua d() {
      return this.b;
   }

   public cua e() {
      return this.c;
   }
}
