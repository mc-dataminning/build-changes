import com.mojang.serialization.MapCodec;

public class dfh extends ddx {
   public static final MapCodec<dfh> b = b(dfh::new);
   public static final int c = 5;
   private static final je[] d = je.values();

   @Override
   public MapCodec<dfh> a() {
      return b;
   }

   public dfh(dsb.d $$0) {
      super($$0);
   }

   @Override
   protected void b(dsc $$0, arf $$1, iz $$2, azh $$3) {
      if ($$3.a(5) == 0) {
         je $$4 = d[$$3.a(d.length)];
         iz $$5 = $$2.a($$4);
         dsc $$6 = $$1.a_($$5);
         dez $$7 = null;
         if (g($$6)) {
            $$7 = dfb.qy;
         } else if ($$6.a(dfb.qy) && $$6.c(ddy.d) == $$4) {
            $$7 = dfb.qx;
         } else if ($$6.a(dfb.qx) && $$6.c(ddy.d) == $$4) {
            $$7 = dfb.qw;
         } else if ($$6.a(dfb.qw) && $$6.c(ddy.d) == $$4) {
            $$7 = dfb.qv;
         }

         if ($$7 != null) {
            dsc $$8 = $$7.o().a(ddy.d, $$4).a(ddy.c, Boolean.valueOf($$6.u().a() == enw.c));
            $$1.b($$5, $$8);
         }
      }
   }

   public static boolean g(dsc $$0) {
      return $$0.i() || $$0.a(dfb.G) && $$0.u().e() == 8;
   }
}
