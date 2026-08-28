import com.mojang.serialization.MapCodec;

public class diz extends dgx {
   public static final MapCodec<diz> d = b(diz::new);
   private static final float e = 0.05F;
   private static final float f = 0.1F;

   @Override
   public MapCodec<diz> a() {
      return d;
   }

   public diz(dvi.d $$0) {
      super($$0, kn.c);
   }

   @Override
   public boolean d(dvj $$0) {
      return false;
   }

   protected static boolean a(dfb $$0, dgc.c $$1) {
      if ($$1 == dgc.c.b) {
         return $$0.E_().i() < 0.05F;
      } else {
         return $$1 == dgc.c.c ? $$0.E_().i() < 0.1F : false;
      }
   }

   @Override
   public void a(dvj $$0, dfb $$1, jh $$2, dgc.c $$3) {
      if (a($$1, $$3)) {
         if ($$3 == dgc.c.b) {
            $$1.b($$2, dig.fu.m());
            $$1.a(null, eag.c, $$2);
         } else if ($$3 == dgc.c.c) {
            $$1.b($$2, dig.fw.m());
            $$1.a(null, eag.c, $$2);
         }
      }
   }

   @Override
   protected boolean a(erj $$0) {
      return true;
   }

   @Override
   protected void a(dvj $$0, dfb $$1, jh $$2, erj $$3) {
      if ($$3 == erl.c) {
         dvj $$4 = dig.fu.m();
         $$1.b($$2, $$4);
         $$1.a(eag.c, $$2, eag.a.a($$4));
         $$1.c(1047, $$2, 0);
      } else if ($$3 == erl.e) {
         dvj $$5 = dig.fv.m();
         $$1.b($$2, $$5);
         $$1.a(eag.c, $$2, eag.a.a($$5));
         $$1.c(1046, $$2, 0);
      }
   }
}
