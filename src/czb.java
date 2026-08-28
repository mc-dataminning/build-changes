public record czb(cuc a, cuc b, cuc c) implements cyl {
   @Override
   public cuc a(int $$0) {
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

   public cuc c() {
      return this.a;
   }

   public cuc d() {
      return this.b;
   }

   public cuc e() {
      return this.c;
   }
}
