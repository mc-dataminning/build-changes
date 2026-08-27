public class fnw {
   private final fsh a;
   private final fnq b;
   private final ftd c;
   private fnw.a d = fnw.a.a;

   public fnw(fsh $$0, fnq $$1, ftd $$2) {
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
               this.d = fnw.a.c;
            }
         case a:
         case c:
      }
   }

   public boolean b() {
      return this.d == fnw.a.c;
   }

   public void c() {
      if (this.d == fnw.a.a) {
         this.d = fnw.a.b;
      }
   }

   static enum a {
      a,
      b,
      c;
   }
}
