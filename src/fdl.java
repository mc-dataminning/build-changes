public record fdl(int a, int b, boolean c) implements fdm<fcl> {
   public fcl a() {
      return new fcm(this.a, this.b, this.c);
   }

   public void a(fcl $$0) {
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
