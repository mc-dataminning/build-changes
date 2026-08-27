import com.mojang.serialization.MapCodec;

public class dem extends czf implements czi {
   public static final MapCodec<dem> a = b(dem::new);

   @Override
   public MapCodec<dem> a() {
      return a;
   }

   public dem(dmd.d $$0) {
      super($$0);
   }

   @Override
   public boolean b(cwh $$0, ib $$1, dme $$2) {
      if (!$$0.a_($$1.c()).a((cvk)$$0, $$1)) {
         return false;
      } else {
         for (ib $$3 : ib.a($$1.b(-1, -1, -1), $$1.b(1, 1, 1))) {
            if ($$0.a_($$3).a(aue.aK)) {
               return true;
            }
         }

         return false;
      }
   }

   @Override
   public boolean a(cwe $$0, awt $$1, ib $$2, dme $$3) {
      return true;
   }

   @Override
   public void a(apa $$0, awt $$1, ib $$2, dme $$3) {
      boolean $$4 = false;
      boolean $$5 = false;

      for (ib $$6 : ib.a($$2.b(-1, -1, -1), $$2.b(1, 1, 1))) {
         dme $$7 = $$0.a_($$6);
         if ($$7.a(czh.on)) {
            $$5 = true;
         }

         if ($$7.a(czh.ow)) {
            $$4 = true;
         }

         if ($$5 && $$4) {
            break;
         }
      }

      if ($$5 && $$4) {
         $$0.a($$2, $$1.h() ? czh.on.o() : czh.ow.o(), 3);
      } else if ($$5) {
         $$0.a($$2, czh.on.o(), 3);
      } else if ($$4) {
         $$0.a($$2, czh.ow.o(), 3);
      }
   }

   @Override
   public czi.a au_() {
      return czi.a.a;
   }
}
