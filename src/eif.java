import com.mojang.serialization.Codec;

public class eif extends ego<eiz> {
   private static final jh a = new jh(8, 3, 8);
   private static final dgg b = new dgg(a);
   private static final int c = 16;
   private static final int d = 1;

   public eif(Codec<eiz> $$0) {
      super($$0);
   }

   private static int a(int $$0, int $$1, int $$2, int $$3) {
      return Math.max(Math.abs($$0 - $$2), Math.abs($$1 - $$3));
   }

   @Override
   public boolean a(egq<eiz> $$0) {
      dhy $$1 = $$0.b();
      dgg $$2 = new dgg($$0.e());
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
                     $$1.a($$4, dkg.m.m(), 2);
                  } else {
                     $$1.a($$4, dkg.b.m(), 2);
                  }
               }
            }
         }

         return true;
      }
   }
}
