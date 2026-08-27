import com.mojang.serialization.MapCodec;

public class deg extends dcw {
   public static final MapCodec<deg> b = b(deg::new);
   public static final int c = 5;
   private static final it[] d = it.values();

   @Override
   public MapCodec<deg> a() {
      return b;
   }

   public deg(dra.d $$0) {
      super($$0);
   }

   @Override
   protected void b(drb $$0, aqm $$1, io $$2, ayk $$3) {
      if ($$3.a(5) == 0) {
         it $$4 = d[$$3.a(d.length)];
         io $$5 = $$2.a($$4);
         drb $$6 = $$1.a_($$5);
         ddy $$7 = null;
         if (g($$6)) {
            $$7 = dea.qy;
         } else if ($$6.a(dea.qy) && $$6.c(dcx.d) == $$4) {
            $$7 = dea.qx;
         } else if ($$6.a(dea.qx) && $$6.c(dcx.d) == $$4) {
            $$7 = dea.qw;
         } else if ($$6.a(dea.qw) && $$6.c(dcx.d) == $$4) {
            $$7 = dea.qv;
         }

         if ($$7 != null) {
            drb $$8 = $$7.n().a(dcx.d, $$4).a(dcx.c, Boolean.valueOf($$6.u().a() == emv.c));
            $$1.b($$5, $$8);
         }
      }
   }

   public static boolean g(drb $$0) {
      return $$0.i() || $$0.a(dea.G) && $$0.u().e() == 8;
   }
}
