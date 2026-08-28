import com.mojang.serialization.MapCodec;

public class dfj extends ddz {
   public static final MapCodec<dfj> b = b(dfj::new);
   public static final int c = 5;
   private static final je[] d = je.values();

   @Override
   public MapCodec<dfj> a() {
      return b;
   }

   public dfj(dsd.d $$0) {
      super($$0);
   }

   @Override
   protected void b(dse $$0, arf $$1, iz $$2, azh $$3) {
      if ($$3.a(5) == 0) {
         je $$4 = d[$$3.a(d.length)];
         iz $$5 = $$2.a($$4);
         dse $$6 = $$1.a_($$5);
         dfb $$7 = null;
         if (g($$6)) {
            $$7 = dfd.qy;
         } else if ($$6.a(dfd.qy) && $$6.c(dea.d) == $$4) {
            $$7 = dfd.qx;
         } else if ($$6.a(dfd.qx) && $$6.c(dea.d) == $$4) {
            $$7 = dfd.qw;
         } else if ($$6.a(dfd.qw) && $$6.c(dea.d) == $$4) {
            $$7 = dfd.qv;
         }

         if ($$7 != null) {
            dse $$8 = $$7.o().a(dea.d, $$4).a(dea.c, Boolean.valueOf($$6.u().a() == eny.c));
            $$1.b($$5, $$8);
         }
      }
   }

   public static boolean g(dse $$0) {
      return $$0.i() || $$0.a(dfd.G) && $$0.u().e() == 8;
   }
}
