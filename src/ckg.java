public abstract class ckg extends bof {
   protected static final aii<Integer> f = ail.a(ckg.class, aik.b);
   protected static final aii<Integer> g = ail.a(ckg.class, aik.b);
   protected static final aii<Float> h = ail.a(ckg.class, aik.d);

   public ckg(bol<?> $$0, cwe $$1) {
      super($$0, $$1);
   }

   @Override
   public boolean a(bne $$0, float $$1) {
      if (this.dJ().B || this.dE()) {
         return true;
      } else if (this.b($$0)) {
         return false;
      } else {
         this.n(-this.P());
         this.d(10);
         this.bq();
         this.b(this.N() + $$1 * 10.0F);
         this.a(dqr.o, $$0.d());
         boolean $$2 = $$0.d() instanceof cia && ((cia)$$0.d()).fW().d;
         if (($$2 || !(this.N() > 40.0F)) && !this.d($$0)) {
            if ($$2) {
               this.am();
            }
         } else {
            this.a($$0);
         }

         return true;
      }
   }

   boolean d(bne $$0) {
      return false;
   }

   public void b(cpl $$0) {
      this.al();
      if (this.dJ().Z().b(cwa.i)) {
         cpq $$1 = new cpq($$0);
         if (this.ae()) {
            $$1.a(this.af());
         }

         this.b($$1);
      }
   }

   @Override
   protected void c_() {
      this.am.a(f, 0);
      this.am.a(g, 1);
      this.am.a(h, 0.0F);
   }

   public void d(int $$0) {
      this.am.b(f, $$0);
   }

   public void n(int $$0) {
      this.am.b(g, $$0);
   }

   public void b(float $$0) {
      this.am.b(h, $$0);
   }

   public float N() {
      return this.am.b(h);
   }

   public int O() {
      return this.am.b(f);
   }

   public int P() {
      return this.am.b(g);
   }

   protected void a(bne $$0) {
      this.b(this.ai_());
   }

   abstract cpl ai_();
}
