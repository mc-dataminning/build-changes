import com.mojang.serialization.MapCodec;

public class drh extends dlu implements dlx {
   public static final MapCodec<drh> a = b(drh::new);

   @Override
   public MapCodec<drh> a() {
      return a;
   }

   public drh(dzn.d $$0) {
      super($$0);
   }

   @Override
   public boolean a(dis $$0, iu $$1, dzo $$2) {
      if (!$$0.a_($$1.d()).f()) {
         return false;
      } else {
         for (iu $$3 : iu.c($$1.b(-1, -1, -1), $$1.b(1, 1, 1))) {
            if ($$0.a_($$3).a(axa.aO)) {
               return true;
            }
         }

         return false;
      }
   }

   @Override
   public boolean a(dip $$0, azt $$1, iu $$2, dzo $$3) {
      return true;
   }

   @Override
   public void a(aro $$0, azt $$1, iu $$2, dzo $$3) {
      boolean $$4 = false;
      boolean $$5 = false;

      for (iu $$6 : iu.c($$2.b(-1, -1, -1), $$2.b(1, 1, 1))) {
         dzo $$7 = $$0.a_($$6);
         if ($$7.a(dlw.oP)) {
            $$5 = true;
         }

         if ($$7.a(dlw.oY)) {
            $$4 = true;
         }

         if ($$5 && $$4) {
            break;
         }
      }

      if ($$5 && $$4) {
         $$0.a($$2, $$1.h() ? dlw.oP.m() : dlw.oY.m(), 3);
      } else if ($$5) {
         $$0.a($$2, dlw.oP.m(), 3);
      } else if ($$4) {
         $$0.a($$2, dlw.oY.m(), 3);
      }
   }

   @Override
   public dlx.a am_() {
      return dlx.a.a;
   }
}
