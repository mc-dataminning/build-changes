import com.mojang.serialization.Codec;

public class dwl extends duu<dxf> {
   private static final ib a = new ib(8, 3, 8);
   private static final cvl b = new cvl(a);
   private static final int c = 16;
   private static final int d = 1;

   public dwl(Codec<dxf> $$0) {
      super($$0);
   }

   private static int a(int $$0, int $$1, int $$2, int $$3) {
      return Math.max(Math.abs($$0 - $$2), Math.abs($$1 - $$3));
   }

   @Override
   public boolean a(duw<dxf> $$0) {
      cwz $$1 = $$0.b();
      cvl $$2 = new cvl($$0.e());
      if (a($$2.e, $$2.f, b.e, b.f) > 1) {
         return true;
      } else {
         ib $$3 = a.h($$0.e().v() + a.v());
         ib.a $$4 = new ib.a();

         for (int $$5 = $$2.e(); $$5 <= $$2.g(); $$5++) {
            for (int $$6 = $$2.d(); $$6 <= $$2.f(); $$6++) {
               if (a($$3.u(), $$3.w(), $$6, $$5) <= 16) {
                  $$4.d($$6, $$3.v(), $$5);
                  if ($$4.equals($$3)) {
                     $$1.a($$4, czh.m.o(), 2);
                  } else {
                     $$1.a($$4, czh.b.o(), 2);
                  }
               }
            }
         }

         return true;
      }
   }
}
