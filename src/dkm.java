import com.mojang.serialization.MapCodec;

public class dkm extends djb {
   public static final MapCodec<dkm> b = b(dkm::new);
   public static final int c = 5;
   private static final jm[] d = jm.values();

   @Override
   public MapCodec<dkm> a() {
      return b;
   }

   public dkm(dxn.d $$0) {
      super($$0);
   }

   @Override
   protected void b(dxo $$0, arx $$1, jh $$2, bac $$3) {
      if ($$3.a(5) == 0) {
         jm $$4 = d[$$3.a(d.length)];
         jh $$5 = $$2.a($$4);
         dxo $$6 = $$1.a_($$5);
         dkd $$7 = null;
         if (h($$6)) {
            $$7 = dkf.ra;
         } else if ($$6.a(dkf.ra) && $$6.c(djc.d) == $$4) {
            $$7 = dkf.qZ;
         } else if ($$6.a(dkf.qZ) && $$6.c(djc.d) == $$4) {
            $$7 = dkf.qY;
         } else if ($$6.a(dkf.qY) && $$6.c(djc.d) == $$4) {
            $$7 = dkf.qX;
         }

         if ($$7 != null) {
            dxo $$8 = $$7.m().b(djc.d, $$4).b(djc.c, Boolean.valueOf($$6.y().a() == etr.c));
            $$1.b($$5, $$8);
         }
      }
   }

   public static boolean h(dxo $$0) {
      return $$0.l() || $$0.a(dkf.J) && $$0.y().e() == 8;
   }
}
