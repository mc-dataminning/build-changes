import com.mojang.serialization.MapCodec;

public class dfi extends ddy {
   public static final MapCodec<dfi> b = b(dfi::new);
   public static final int c = 5;
   private static final je[] d = je.values();

   @Override
   public MapCodec<dfi> a() {
      return b;
   }

   public dfi(dsc.d $$0) {
      super($$0);
   }

   @Override
   protected void b(dsd $$0, arf $$1, iz $$2, azh $$3) {
      if ($$3.a(5) == 0) {
         je $$4 = d[$$3.a(d.length)];
         iz $$5 = $$2.a($$4);
         dsd $$6 = $$1.a_($$5);
         dfa $$7 = null;
         if (g($$6)) {
            $$7 = dfc.qy;
         } else if ($$6.a(dfc.qy) && $$6.c(ddz.d) == $$4) {
            $$7 = dfc.qx;
         } else if ($$6.a(dfc.qx) && $$6.c(ddz.d) == $$4) {
            $$7 = dfc.qw;
         } else if ($$6.a(dfc.qw) && $$6.c(ddz.d) == $$4) {
            $$7 = dfc.qv;
         }

         if ($$7 != null) {
            dsd $$8 = $$7.o().a(ddz.d, $$4).a(ddz.c, Boolean.valueOf($$6.u().a() == enx.c));
            $$1.b($$5, $$8);
         }
      }
   }

   public static boolean g(dsd $$0) {
      return $$0.i() || $$0.a(dfc.G) && $$0.u().e() == 8;
   }
}
