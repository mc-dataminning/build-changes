public class flp {
   private final fpw a;
   private final flj b;
   private final fqs c;
   private flp.a d = flp.a.a;

   public flp(fpw $$0, flj $$1, fqs $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public void a() {
      switch (this.d) {
         case b:
            ht $$0 = this.a.dn();
            boolean $$1 = this.b.d($$0.v());
            if ($$1 || this.c.a($$0) || this.a.O_() || !this.a.bx()) {
               this.d = flp.a.c;
            }
         case a:
         case c:
      }
   }

   public boolean b() {
      return this.d == flp.a.c;
   }

   public void c() {
      if (this.d == flp.a.a) {
         this.d = flp.a.b;
      }
   }

   static enum a {
      a,
      b,
      c;
   }
}
