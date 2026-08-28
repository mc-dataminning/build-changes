import com.mojang.serialization.MapCodec;

public class dfn extends ded {
   public static final MapCodec<dfn> b = b(dfn::new);
   public static final int c = 5;
   private static final jf[] d = jf.values();

   @Override
   public MapCodec<dfn> a() {
      return b;
   }

   public dfn(dsg.d $$0) {
      super($$0);
   }

   @Override
   protected void b(dsh $$0, aqk $$1, ja $$2, aym $$3) {
      if ($$3.a(5) == 0) {
         jf $$4 = d[$$3.a(d.length)];
         ja $$5 = $$2.a($$4);
         dsh $$6 = $$1.a_($$5);
         dff $$7 = null;
         if (g($$6)) {
            $$7 = dfh.qy;
         } else if ($$6.a(dfh.qy) && $$6.c(dee.d) == $$4) {
            $$7 = dfh.qx;
         } else if ($$6.a(dfh.qx) && $$6.c(dee.d) == $$4) {
            $$7 = dfh.qw;
         } else if ($$6.a(dfh.qw) && $$6.c(dee.d) == $$4) {
            $$7 = dfh.qv;
         }

         if ($$7 != null) {
            dsh $$8 = $$7.o().a(dee.d, $$4).a(dee.c, Boolean.valueOf($$6.u().a() == eoc.c));
            $$1.b($$5, $$8);
         }
      }
   }

   public static boolean g(dsh $$0) {
      return $$0.i() || $$0.a(dfh.G) && $$0.u().e() == 8;
   }
}
