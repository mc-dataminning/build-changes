public record dfx(dak a, dak b, dak c) implements dfh {
   @Override
   public dak a(int $$0) {
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

   public dak c() {
      return this.a;
   }

   public dak d() {
      return this.b;
   }

   public dak e() {
      return this.c;
   }
}
