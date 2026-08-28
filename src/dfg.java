import com.mojang.serialization.MapCodec;

public class dfg extends ddw {
   public static final MapCodec<dfg> b = b(dfg::new);
   public static final int c = 5;
   private static final je[] d = je.values();

   @Override
   public MapCodec<dfg> a() {
      return b;
   }

   public dfg(dsa.d $$0) {
      super($$0);
   }

   @Override
   protected void b(dsb $$0, are $$1, iz $$2, azg $$3) {
      if ($$3.a(5) == 0) {
         je $$4 = d[$$3.a(d.length)];
         iz $$5 = $$2.a($$4);
         dsb $$6 = $$1.a_($$5);
         dey $$7 = null;
         if (g($$6)) {
            $$7 = dfa.qy;
         } else if ($$6.a(dfa.qy) && $$6.c(ddx.d) == $$4) {
            $$7 = dfa.qx;
         } else if ($$6.a(dfa.qx) && $$6.c(ddx.d) == $$4) {
            $$7 = dfa.qw;
         } else if ($$6.a(dfa.qw) && $$6.c(ddx.d) == $$4) {
            $$7 = dfa.qv;
         }

         if ($$7 != null) {
            dsb $$8 = $$7.o().a(ddx.d, $$4).a(ddx.c, Boolean.valueOf($$6.u().a() == env.c));
            $$1.b($$5, $$8);
         }
      }
   }

   public static boolean g(dsb $$0) {
      return $$0.i() || $$0.a(dfa.G) && $$0.u().e() == 8;
   }
}
