import com.mojang.serialization.MapCodec;

public class dnl extends die implements dih {
   public static final MapCodec<dnl> a = b(dnl::new);

   @Override
   public MapCodec<dnl> a() {
      return a;
   }

   public dnl(dvi.d $$0) {
      super($$0);
   }

   @Override
   public boolean b(dfe $$0, jh $$1, dvj $$2) {
      if (!$$0.a_($$1.d()).f()) {
         return false;
      } else {
         for (jh $$3 : jh.c($$1.b(-1, -1, -1), $$1.b(1, 1, 1))) {
            if ($$0.a_($$3).a(axa.aM)) {
               return true;
            }
         }

         return false;
      }
   }

   @Override
   public boolean a(dfb $$0, azs $$1, jh $$2, dvj $$3) {
      return true;
   }

   @Override
   public void a(arn $$0, azs $$1, jh $$2, dvj $$3) {
      boolean $$4 = false;
      boolean $$5 = false;

      for (jh $$6 : jh.c($$2.b(-1, -1, -1), $$2.b(1, 1, 1))) {
         dvj $$7 = $$0.a_($$6);
         if ($$7.a(dig.on)) {
            $$5 = true;
         }

         if ($$7.a(dig.ow)) {
            $$4 = true;
         }

         if ($$5 && $$4) {
            break;
         }
      }

      if ($$5 && $$4) {
         $$0.a($$2, $$1.h() ? dig.on.m() : dig.ow.m(), 3);
      } else if ($$5) {
         $$0.a($$2, dig.on.m(), 3);
      } else if ($$4) {
         $$0.a($$2, dig.ow.m(), 3);
      }
   }

   @Override
   public dih.a ar_() {
      return dih.a.a;
   }
}
