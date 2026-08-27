import com.mojang.serialization.MapCodec;

public class ctx extends cru {
   public static final MapCodec<ctx> d = b(ctx::new);
   private static final float e = 0.05F;
   private static final float f = 0.1F;

   @Override
   public MapCodec<ctx> a() {
      return d;
   }

   public ctx(dfc.d $$0) {
      super($$0, ia.c);
   }

   @Override
   public boolean d(dfd $$0) {
      return false;
   }

   protected static boolean a(cqb $$0, cqz.c $$1) {
      if ($$1 == cqz.c.b) {
         return $$0.D_().i() < 0.05F;
      } else {
         return $$1 == cqz.c.c ? $$0.D_().i() < 0.1F : false;
      }
   }

   @Override
   public void a(dfd $$0, cqb $$1, gw $$2, cqz.c $$3) {
      if (a($$1, $$3)) {
         if ($$3 == cqz.c.b) {
            $$1.b($$2, cte.fu.o());
            $$1.a(null, djn.c, $$2);
         } else if ($$3 == cqz.c.c) {
            $$1.b($$2, cte.fw.o());
            $$1.a(null, djn.c, $$2);
         }
      }
   }

   @Override
   protected boolean a(eaf $$0) {
      return true;
   }

   @Override
   protected void a(dfd $$0, cqb $$1, gw $$2, eaf $$3) {
      if ($$3 == eah.c) {
         dfd $$4 = cte.fu.o();
         $$1.b($$2, $$4);
         $$1.a(djn.c, $$2, djn.a.a($$4));
         $$1.c(1047, $$2, 0);
      } else if ($$3 == eah.e) {
         dfd $$5 = cte.fv.o();
         $$1.b($$2, $$5);
         $$1.a(djn.c, $$2, djn.a.a($$5));
         $$1.c(1046, $$2, 0);
      }
   }
}
