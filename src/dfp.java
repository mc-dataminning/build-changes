import com.mojang.serialization.MapCodec;

public class dfp extends def {
   public static final MapCodec<dfp> b = b(dfp::new);
   public static final int c = 5;
   private static final jf[] d = jf.values();

   @Override
   public MapCodec<dfp> a() {
      return b;
   }

   public dfp(dsj.d $$0) {
      super($$0);
   }

   @Override
   protected void b(dsk $$0, aqm $$1, ja $$2, ayo $$3) {
      if ($$3.a(5) == 0) {
         jf $$4 = d[$$3.a(d.length)];
         ja $$5 = $$2.a($$4);
         dsk $$6 = $$1.a_($$5);
         dfh $$7 = null;
         if (g($$6)) {
            $$7 = dfj.qy;
         } else if ($$6.a(dfj.qy) && $$6.c(deg.d) == $$4) {
            $$7 = dfj.qx;
         } else if ($$6.a(dfj.qx) && $$6.c(deg.d) == $$4) {
            $$7 = dfj.qw;
         } else if ($$6.a(dfj.qw) && $$6.c(deg.d) == $$4) {
            $$7 = dfj.qv;
         }

         if ($$7 != null) {
            dsk $$8 = $$7.o().a(deg.d, $$4).a(deg.c, Boolean.valueOf($$6.u().a() == eoi.c));
            $$1.b($$5, $$8);
         }
      }
   }

   public static boolean g(dsk $$0) {
      return $$0.i() || $$0.a(dfj.G) && $$0.u().e() == 8;
   }
}
