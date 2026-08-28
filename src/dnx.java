import com.mojang.serialization.MapCodec;

public class dnx extends diq implements dit {
   public static final MapCodec<dnx> a = b(dnx::new);

   @Override
   public MapCodec<dnx> a() {
      return a;
   }

   public dnx(dvu.d $$0) {
      super($$0);
   }

   @Override
   public boolean b(dfp $$0, jh $$1, dvv $$2) {
      if (!$$0.a_($$1.d()).f()) {
         return false;
      } else {
         for (jh $$3 : jh.c($$1.b(-1, -1, -1), $$1.b(1, 1, 1))) {
            if ($$0.a_($$3).a(axc.aN)) {
               return true;
            }
         }

         return false;
      }
   }

   @Override
   public boolean a(dfm $$0, azu $$1, jh $$2, dvv $$3) {
      return true;
   }

   @Override
   public void a(arp $$0, azu $$1, jh $$2, dvv $$3) {
      boolean $$4 = false;
      boolean $$5 = false;

      for (jh $$6 : jh.c($$2.b(-1, -1, -1), $$2.b(1, 1, 1))) {
         dvv $$7 = $$0.a_($$6);
         if ($$7.a(dis.on)) {
            $$5 = true;
         }

         if ($$7.a(dis.ow)) {
            $$4 = true;
         }

         if ($$5 && $$4) {
            break;
         }
      }

      if ($$5 && $$4) {
         $$0.a($$2, $$1.h() ? dis.on.m() : dis.ow.m(), 3);
      } else if ($$5) {
         $$0.a($$2, dis.on.m(), 3);
      } else if ($$4) {
         $$0.a($$2, dis.ow.m(), 3);
      }
   }

   @Override
   public dit.a aq_() {
      return dit.a.a;
   }
}
