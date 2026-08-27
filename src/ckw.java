public class ckw<T extends bkv & bli> extends clj {
   private final bkz<T> a;
   private final int b;

   public ckw(clj.a $$0, bkz<T> $$1, int $$2) {
      super($$0);
      this.a = $$1;
      this.b = $$2;
   }

   @Override
   public bjc<clo> a(csf $$0, cdz $$1, bja $$2) {
      clo $$3 = $$1.b($$2);
      if ($$0.B) {
         return bjc.c($$3);
      } else {
         bkv $$4 = $$1.db();
         if ($$1.bO() && $$4 instanceof bli $$5 && $$4.ai() == this.a && $$5.a()) {
            $$3.a(this.b, $$1, $$1x -> $$1x.d($$2));
            if ($$3.b()) {
               clo $$6 = new clo(clr.qS);
               $$6.c($$3.v());
               return bjc.a($$6);
            }

            return bjc.a($$3);
         }

         $$1.b(arf.c.b(this));
         return bjc.c($$3);
      }
   }
}
