import com.mojang.serialization.MapCodec;

public class dir extends dhh {
   public static final MapCodec<dir> b = b(dir::new);
   public static final int c = 5;
   private static final jm[] d = jm.values();

   @Override
   public MapCodec<dir> a() {
      return b;
   }

   public dir(dvn.d $$0) {
      super($$0);
   }

   @Override
   protected void b(dvo $$0, arq $$1, jh $$2, azv $$3) {
      if ($$3.a(5) == 0) {
         jm $$4 = d[$$3.a(d.length)];
         jh $$5 = $$2.a($$4);
         dvo $$6 = $$1.a_($$5);
         dij $$7 = null;
         if (h($$6)) {
            $$7 = dil.qy;
         } else if ($$6.a(dil.qy) && $$6.c(dhi.d) == $$4) {
            $$7 = dil.qx;
         } else if ($$6.a(dil.qx) && $$6.c(dhi.d) == $$4) {
            $$7 = dil.qw;
         } else if ($$6.a(dil.qw) && $$6.c(dhi.d) == $$4) {
            $$7 = dil.qv;
         }

         if ($$7 != null) {
            dvo $$8 = $$7.m().b(dhi.d, $$4).b(dhi.c, Boolean.valueOf($$6.y().a() == erp.c));
            $$1.b($$5, $$8);
         }
      }
   }

   public static boolean h(dvo $$0) {
      return $$0.l() || $$0.a(dil.G) && $$0.y().e() == 8;
   }
}
