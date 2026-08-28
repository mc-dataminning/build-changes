import com.mojang.serialization.MapCodec;

public class dkn extends djc {
   public static final MapCodec<dkn> b = b(dkn::new);
   public static final int c = 5;
   private static final jn[] d = jn.values();

   @Override
   public MapCodec<dkn> a() {
      return b;
   }

   public dkn(dxp.d $$0) {
      super($$0);
   }

   @Override
   protected void b(dxq $$0, ard $$1, ji $$2, azh $$3) {
      if ($$3.a(5) == 0) {
         jn $$4 = d[$$3.a(d.length)];
         ji $$5 = $$2.a($$4);
         dxq $$6 = $$1.a_($$5);
         dke $$7 = null;
         if (h($$6)) {
            $$7 = dkg.ra;
         } else if ($$6.a(dkg.ra) && $$6.c(djd.d) == $$4) {
            $$7 = dkg.qZ;
         } else if ($$6.a(dkg.qZ) && $$6.c(djd.d) == $$4) {
            $$7 = dkg.qY;
         } else if ($$6.a(dkg.qY) && $$6.c(djd.d) == $$4) {
            $$7 = dkg.qX;
         }

         if ($$7 != null) {
            dxq $$8 = $$7.m().b(djd.d, $$4).b(djd.c, Boolean.valueOf($$6.y().a() == etx.c));
            $$1.b($$5, $$8);
         }
      }
   }

   public static boolean h(dxq $$0) {
      return $$0.l() || $$0.a(dkg.J) && $$0.y().e() == 8;
   }
}
