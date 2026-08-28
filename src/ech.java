import com.mojang.serialization.Codec;

public class ech extends ebe<edq> {
   private static final int a = 7;

   ech(Codec<edq> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ebg<edq> $$0) {
      dcz $$1 = $$0.b();
      aym $$2 = $$0.d();
      edq $$3 = $$0.f();
      ja $$4 = $$0.e();
      int $$5 = $$2.a($$3.c + 1);
      ja.a $$6 = new ja.a();

      for (int $$7 = 0; $$7 < $$5; $$7++) {
         this.a($$6, $$2, $$4, Math.min($$7, 7));
         dsh $$8 = $$1.a_($$6);

         for (edq.a $$9 : $$3.b) {
            if (ebz.a($$8, $$1::a_, $$2, $$3, $$9, $$6)) {
               $$1.a($$6, $$9.c, 2);
               break;
            }
         }
      }

      return true;
   }

   private void a(ja.a $$0, aym $$1, ja $$2, int $$3) {
      int $$4 = this.a($$1, $$3);
      int $$5 = this.a($$1, $$3);
      int $$6 = this.a($$1, $$3);
      $$0.a($$2, $$4, $$5, $$6);
   }

   private int a(aym $$0, int $$1) {
      return Math.round(($$0.i() - $$0.i()) * (float)$$1);
   }
}
