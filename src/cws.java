public class cws<T extends bva & bvv> extends cxd {
   private final bvi<T> a;
   private final int b;

   public cws(bvi<T> $$0, int $$1, cxd.a $$2) {
      super($$2);
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public bsy a(dgz $$0, cpr $$1, bsx $$2) {
      cxh $$3 = $$1.b($$2);
      if ($$0.C) {
         return bsy.e;
      } else {
         bva $$4 = $$1.dk();
         if ($$1.bY() && $$4 instanceof bvv $$5 && $$4.aq() == this.a && $$5.a()) {
            bvj $$6 = bvy.d($$2);
            cxh $$7 = $$3.a(this.b, cxl.rU, $$1, $$6);
            return bsy.b.a($$7);
         }

         $$1.b(awk.c.b(this));
         return bsy.e;
      }
   }
}
