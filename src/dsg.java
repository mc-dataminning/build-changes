import com.mojang.serialization.MapCodec;

public class dsg extends dmr implements dmu {
   public static final MapCodec<dsg> a = b(dsg::new);

   @Override
   public MapCodec<dsg> a() {
      return a;
   }

   public dsg(eas.d $$0) {
      super($$0);
   }

   @Override
   public boolean a(djp $$0, iv $$1, eat $$2) {
      if (!$$0.a_($$1.d()).f()) {
         return false;
      } else {
         for (iv $$3 : iv.c($$1.b(-1, -1, -1), $$1.b(1, 1, 1))) {
            if ($$0.a_($$3).a(axc.aO)) {
               return true;
            }
         }

         return false;
      }
   }

   @Override
   public boolean a(djm $$0, azv $$1, iv $$2, eat $$3) {
      return true;
   }

   @Override
   public void a(arq $$0, azv $$1, iv $$2, eat $$3) {
      boolean $$4 = false;
      boolean $$5 = false;

      for (iv $$6 : iv.c($$2.b(-1, -1, -1), $$2.b(1, 1, 1))) {
         eat $$7 = $$0.a_($$6);
         if ($$7.a(dmt.oT)) {
            $$5 = true;
         }

         if ($$7.a(dmt.pc)) {
            $$4 = true;
         }

         if ($$5 && $$4) {
            break;
         }
      }

      if ($$5 && $$4) {
         $$0.a($$2, $$1.h() ? dmt.oT.m() : dmt.pc.m(), 3);
      } else if ($$5) {
         $$0.a($$2, dmt.oT.m(), 3);
      } else if ($$4) {
         $$0.a($$2, dmt.pc.m(), 3);
      }
   }

   @Override
   public dmu.a an_() {
      return dmu.a.a;
   }
}
