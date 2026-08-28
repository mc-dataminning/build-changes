import com.mojang.serialization.MapCodec;

public class dfq extends deg {
   public static final MapCodec<dfq> b = b(dfq::new);
   public static final int c = 5;
   private static final jf[] d = jf.values();

   @Override
   public MapCodec<dfq> a() {
      return b;
   }

   public dfq(dsk.d $$0) {
      super($$0);
   }

   @Override
   protected void b(dsl $$0, aqm $$1, ja $$2, ayo $$3) {
      if ($$3.a(5) == 0) {
         jf $$4 = d[$$3.a(d.length)];
         ja $$5 = $$2.a($$4);
         dsl $$6 = $$1.a_($$5);
         dfi $$7 = null;
         if (g($$6)) {
            $$7 = dfk.qy;
         } else if ($$6.a(dfk.qy) && $$6.c(deh.d) == $$4) {
            $$7 = dfk.qx;
         } else if ($$6.a(dfk.qx) && $$6.c(deh.d) == $$4) {
            $$7 = dfk.qw;
         } else if ($$6.a(dfk.qw) && $$6.c(deh.d) == $$4) {
            $$7 = dfk.qv;
         }

         if ($$7 != null) {
            dsl $$8 = $$7.o().a(deh.d, $$4).a(deh.c, Boolean.valueOf($$6.u().a() == eok.c));
            $$1.b($$5, $$8);
         }
      }
   }

   public static boolean g(dsl $$0) {
      return $$0.i() || $$0.a(dfk.G) && $$0.u().e() == 8;
   }
}
