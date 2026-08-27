public class fnx {
   private final fsi a;
   private final fnr b;
   private final fte c;
   private fnx.a d = fnx.a.a;

   public fnx(fsi $$0, fnr $$1, fte $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public void a() {
      switch (this.d) {
         case b:
            hx $$0 = this.a.dm();
            boolean $$1 = this.b.d($$0.v());
            if ($$1 || this.c.a($$0) || this.a.P_() || !this.a.bx()) {
               this.d = fnx.a.c;
            }
         case a:
         case c:
      }
   }

   public boolean b() {
      return this.d == fnx.a.c;
   }

   public void c() {
      if (this.d == fnx.a.a) {
         this.d = fnx.a.b;
      }
   }

   static enum a {
      a,
      b,
      c;
   }
}
