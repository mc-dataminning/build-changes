import com.mojang.serialization.Codec;

public class ecr extends eba<edl> {
   private static final iz a = new iz(8, 3, 8);
   private static final dbh b = new dbh(a);
   private static final int c = 16;
   private static final int d = 1;

   public ecr(Codec<edl> $$0) {
      super($$0);
   }

   private static int a(int $$0, int $$1, int $$2, int $$3) {
      return Math.max(Math.abs($$0 - $$2), Math.abs($$1 - $$3));
   }

   @Override
   public boolean a(ebc<edl> $$0) {
      dcv $$1 = $$0.b();
      dbh $$2 = new dbh($$0.e());
      if (a($$2.e, $$2.f, b.e, b.f) > 1) {
         return true;
      } else {
         iz $$3 = a.h($$0.e().v() + a.v());
         iz.a $$4 = new iz.a();

         for (int $$5 = $$2.e(); $$5 <= $$2.g(); $$5++) {
            for (int $$6 = $$2.d(); $$6 <= $$2.f(); $$6++) {
               if (a($$3.u(), $$3.w(), $$6, $$5) <= 16) {
                  $$4.d($$6, $$3.v(), $$5);
                  if ($$4.equals($$3)) {
                     $$1.a($$4, dfd.m.o(), 2);
                  } else {
                     $$1.a($$4, dfd.b.o(), 2);
                  }
               }
            }
         }

         return true;
      }
   }
}
