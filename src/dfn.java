public record dfn(daa a, daa b, daa c) implements dex {
   @Override
   public daa a(int $$0) {
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

   public daa c() {
      return this.a;
   }

   public daa d() {
      return this.b;
   }

   public daa e() {
      return this.c;
   }
}
