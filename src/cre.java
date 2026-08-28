public class cre extends crp {
   private final crc a;
   private final cmx b;
   private int g;
   private final dav h;

   public cre(cmx $$0, dav $$1, crc $$2, int $$3, int $$4, int $$5) {
      super($$2, $$3, $$4, $$5);
      this.b = $$0;
      this.h = $$1;
      this.a = $$2;
   }

   @Override
   public boolean a(cup $$0) {
      return false;
   }

   @Override
   public cup a(int $$0) {
      if (this.h()) {
         this.g = this.g + Math.min($$0, this.g().I());
      }

      return super.a($$0);
   }

   @Override
   protected void a(cup $$0, int $$1) {
      this.g += $$1;
      this.b_($$0);
   }

   @Override
   protected void b_(cup $$0) {
      $$0.a(this.b.dP(), this.b, this.g);
      this.g = 0;
   }

   @Override
   public void a(cmx $$0, cup $$1) {
      this.b_($$1);
      daw $$2 = this.a.g();
      if ($$2 != null) {
         cup $$3 = this.a.a(0);
         cup $$4 = this.a.a(1);
         if ($$2.b($$3, $$4) || $$2.b($$4, $$3)) {
            this.h.a($$2);
            $$0.a(awk.T);
            this.a.a(0, $$3);
            this.a.a(1, $$4);
         }

         this.h.u(this.h.u() + $$2.q());
      }
   }
}
