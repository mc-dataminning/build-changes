public record czs(cuq a, cuq b, cuq c) implements czc {
   @Override
   public cuq a(int $$0) {
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

   public cuq c() {
      return this.a;
   }

   public cuq d() {
      return this.b;
   }

   public cuq e() {
      return this.c;
   }
}
