import com.mojang.serialization.MapCodec;

public class dru extends dmf implements dmi {
   public static final MapCodec<dru> a = b(dru::new);

   @Override
   public MapCodec<dru> a() {
      return a;
   }

   public dru(eag.d $$0) {
      super($$0);
   }

   @Override
   public boolean a(djd $$0, iu $$1, eah $$2) {
      if (!$$0.a_($$1.d()).f()) {
         return false;
      } else {
         for (iu $$3 : iu.c($$1.b(-1, -1, -1), $$1.b(1, 1, 1))) {
            if ($$0.a_($$3).a(axc.aO)) {
               return true;
            }
         }

         return false;
      }
   }

   @Override
   public boolean a(dja $$0, azv $$1, iu $$2, eah $$3) {
      return true;
   }

   @Override
   public void a(arq $$0, azv $$1, iu $$2, eah $$3) {
      boolean $$4 = false;
      boolean $$5 = false;

      for (iu $$6 : iu.c($$2.b(-1, -1, -1), $$2.b(1, 1, 1))) {
         eah $$7 = $$0.a_($$6);
         if ($$7.a(dmh.oT)) {
            $$5 = true;
         }

         if ($$7.a(dmh.pc)) {
            $$4 = true;
         }

         if ($$5 && $$4) {
            break;
         }
      }

      if ($$5 && $$4) {
         $$0.a($$2, $$1.h() ? dmh.oT.m() : dmh.pc.m(), 3);
      } else if ($$5) {
         $$0.a($$2, dmh.oT.m(), 3);
      } else if ($$4) {
         $$0.a($$2, dmh.pc.m(), 3);
      }
   }

   @Override
   public dmi.a an_() {
      return dmi.a.a;
   }
}
