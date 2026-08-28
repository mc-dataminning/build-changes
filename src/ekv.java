import com.mojang.serialization.Codec;

public class ekv extends eje<elp> {
   private static final iu a = new iu(8, 3, 8);
   private static final dic b = new dic(a);
   private static final int c = 16;
   private static final int d = 1;

   public ekv(Codec<elp> $$0) {
      super($$0);
   }

   private static int a(int $$0, int $$1, int $$2, int $$3) {
      return Math.max(Math.abs($$0 - $$2), Math.abs($$1 - $$3));
   }

   @Override
   public boolean a(ejg<elp> $$0) {
      dju $$1 = $$0.b();
      dic $$2 = new dic($$0.e());
      if (a($$2.h, $$2.i, b.h, b.i) > 1) {
         return true;
      } else {
         iu $$3 = a.h($$0.e().v() + a.v());
         iu.a $$4 = new iu.a();

         for (int $$5 = $$2.e(); $$5 <= $$2.g(); $$5++) {
            for (int $$6 = $$2.d(); $$6 <= $$2.f(); $$6++) {
               if (a($$3.u(), $$3.w(), $$6, $$5) <= 16) {
                  $$4.d($$6, $$3.v(), $$5);
                  if ($$4.equals($$3)) {
                     $$1.a($$4, dmc.m.m(), 2);
                  } else {
                     $$1.a($$4, dmc.b.m(), 2);
                  }
               }
            }
         }

         return true;
      }
   }
}
