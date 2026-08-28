public record fdu(int a, int b, boolean c) implements fdv<fcu> {
   public fcu a() {
      return new fcv(this.a, this.b, this.c);
   }

   public void a(fcu $$0) {
      $$0.a();
   }

   public int b() {
      return this.a;
   }

   public int c() {
      return this.b;
   }

   public boolean d() {
      return this.c;
   }
}
