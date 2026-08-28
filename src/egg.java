import com.mojang.serialization.Codec;

public class egg extends eep<eha> {
   private static final jh a = new jh(8, 3, 8);
   private static final del b = new del(a);
   private static final int c = 16;
   private static final int d = 1;

   public egg(Codec<eha> $$0) {
      super($$0);
   }

   private static int a(int $$0, int $$1, int $$2, int $$3) {
      return Math.max(Math.abs($$0 - $$2), Math.abs($$1 - $$3));
   }

   @Override
   public boolean a(eer<eha> $$0) {
      dgd $$1 = $$0.b();
      del $$2 = new del($$0.e());
      if (a($$2.g, $$2.h, b.g, b.h) > 1) {
         return true;
      } else {
         jh $$3 = a.h($$0.e().v() + a.v());
         jh.a $$4 = new jh.a();

         for (int $$5 = $$2.e(); $$5 <= $$2.g(); $$5++) {
            for (int $$6 = $$2.d(); $$6 <= $$2.f(); $$6++) {
               if (a($$3.u(), $$3.w(), $$6, $$5) <= 16) {
                  $$4.d($$6, $$3.v(), $$5);
                  if ($$4.equals($$3)) {
                     $$1.a($$4, dil.m.m(), 2);
                  } else {
                     $$1.a($$4, dil.b.m(), 2);
                  }
               }
            }
         }

         return true;
      }
   }
}
