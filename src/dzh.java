import com.mojang.serialization.Codec;

public class dzh extends dye<eaq> {
   private static final int a = 7;

   dzh(Codec<eaq> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dyg<eaq> $$0) {
      dab $$1 = $$0.b();
      axt $$2 = $$0.d();
      eaq $$3 = $$0.f();
      id $$4 = $$0.e();
      int $$5 = $$2.a($$3.c + 1);
      id.a $$6 = new id.a();

      for (int $$7 = 0; $$7 < $$5; $$7++) {
         this.a($$6, $$2, $$4, Math.min($$7, 7));
         dpi $$8 = $$1.a_($$6);

         for (eaq.a $$9 : $$3.b) {
            if (dyz.a($$8, $$1::a_, $$2, $$3, $$9, $$6)) {
               $$1.a($$6, $$9.c, 2);
               break;
            }
         }
      }

      return true;
   }

   private void a(id.a $$0, axt $$1, id $$2, int $$3) {
      int $$4 = this.a($$1, $$3);
      int $$5 = this.a($$1, $$3);
      int $$6 = this.a($$1, $$3);
      $$0.a($$2, $$4, $$5, $$6);
   }

   private int a(axt $$0, int $$1) {
      return Math.round(($$0.i() - $$0.i()) * (float)$$1);
   }
}
