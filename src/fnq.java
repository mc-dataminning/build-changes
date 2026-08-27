public class fnq {
   private final fsb a;
   private final fnk b;
   private final fsx c;
   private fnq.a d = fnq.a.a;

   public fnq(fsb $$0, fnk $$1, fsx $$2) {
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
               this.d = fnq.a.c;
            }
         case a:
         case c:
      }
   }

   public boolean b() {
      return this.d == fnq.a.c;
   }

   public void c() {
      if (this.d == fnq.a.a) {
         this.d = fnq.a.b;
      }
   }

   static enum a {
      a,
      b,
      c;
   }
}
