public class fsg {
   private final fws a;
   private final fry b;
   private final fxo c;
   private fsg.a d = fsg.a.a;

   public fsg(fws $$0, fry $$1, fxo $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public void a() {
      switch (this.d) {
         case b:
            ib $$0 = this.a.dm();
            boolean $$1 = this.b.d($$0.v());
            if ($$1 || this.c.a($$0) || this.a.N_() || !this.a.bA()) {
               this.d = fsg.a.c;
            }
         case a:
         case c:
      }
   }

   public boolean b() {
      return this.d == fsg.a.c;
   }

   public void c() {
      if (this.d == fsg.a.a) {
         this.d = fsg.a.b;
      }
   }

   static enum a {
      a,
      b,
      c;
   }
}
