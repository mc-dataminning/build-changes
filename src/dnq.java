import com.mojang.serialization.MapCodec;

public class dnq extends dij implements dim {
   public static final MapCodec<dnq> a = b(dnq::new);

   @Override
   public MapCodec<dnq> a() {
      return a;
   }

   public dnq(dvn.d $$0) {
      super($$0);
   }

   @Override
   public boolean b(dfi $$0, jh $$1, dvo $$2) {
      if (!$$0.a_($$1.d()).f()) {
         return false;
      } else {
         for (jh $$3 : jh.c($$1.b(-1, -1, -1), $$1.b(1, 1, 1))) {
            if ($$0.a_($$3).a(axd.aN)) {
               return true;
            }
         }

         return false;
      }
   }

   @Override
   public boolean a(dff $$0, azv $$1, jh $$2, dvo $$3) {
      return true;
   }

   @Override
   public void a(arq $$0, azv $$1, jh $$2, dvo $$3) {
      boolean $$4 = false;
      boolean $$5 = false;

      for (jh $$6 : jh.c($$2.b(-1, -1, -1), $$2.b(1, 1, 1))) {
         dvo $$7 = $$0.a_($$6);
         if ($$7.a(dil.on)) {
            $$5 = true;
         }

         if ($$7.a(dil.ow)) {
            $$4 = true;
         }

         if ($$5 && $$4) {
            break;
         }
      }

      if ($$5 && $$4) {
         $$0.a($$2, $$1.h() ? dil.on.m() : dil.ow.m(), 3);
      } else if ($$5) {
         $$0.a($$2, dil.on.m(), 3);
      } else if ($$4) {
         $$0.a($$2, dil.ow.m(), 3);
      }
   }

   @Override
   public dim.a ar_() {
      return dim.a.a;
   }
}
