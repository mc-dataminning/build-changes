import com.mojang.serialization.MapCodec;

public class die extends dgc {
   public static final MapCodec<die> d = b(die::new);
   private static final float e = 0.05F;
   private static final float f = 0.1F;

   @Override
   public MapCodec<die> a() {
      return d;
   }

   public die(dun.d $$0) {
      super($$0, kk.c);
   }

   @Override
   public boolean d(duo $$0) {
      return false;
   }

   protected static boolean a(deg $$0, dfh.c $$1) {
      if ($$1 == dfh.c.b) {
         return $$0.C_().i() < 0.05F;
      } else {
         return $$1 == dfh.c.c ? $$0.C_().i() < 0.1F : false;
      }
   }

   @Override
   public void a(duo $$0, deg $$1, je $$2, dfh.c $$3) {
      if (a($$1, $$3)) {
         if ($$3 == dfh.c.b) {
            $$1.b($$2, dhl.fu.o());
            $$1.a(null, dzl.c, $$2);
         } else if ($$3 == dfh.c.c) {
            $$1.b($$2, dhl.fw.o());
            $$1.a(null, dzl.c, $$2);
         }
      }
   }

   @Override
   protected boolean a(eqo $$0) {
      return true;
   }

   @Override
   protected void a(duo $$0, deg $$1, je $$2, eqo $$3) {
      if ($$3 == eqq.c) {
         duo $$4 = dhl.fu.o();
         $$1.b($$2, $$4);
         $$1.a(dzl.c, $$2, dzl.a.a($$4));
         $$1.c(1047, $$2, 0);
      } else if ($$3 == eqq.e) {
         duo $$5 = dhl.fv.o();
         $$1.b($$2, $$5);
         $$1.a(dzl.c, $$2, dzl.a.a($$5));
         $$1.c(1046, $$2, 0);
      }
   }
}
