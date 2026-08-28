import com.mojang.serialization.MapCodec;

public class dkn extends djc {
   public static final MapCodec<dkn> b = b(dkn::new);
   public static final int c = 5;
   private static final jm[] d = jm.values();

   @Override
   public MapCodec<dkn> a() {
      return b;
   }

   public dkn(dxm.d $$0) {
      super($$0);
   }

   @Override
   protected void b(dxn $$0, ash $$1, jh $$2, bam $$3) {
      if ($$3.a(5) == 0) {
         jm $$4 = d[$$3.a(d.length)];
         jh $$5 = $$2.a($$4);
         dxn $$6 = $$1.a_($$5);
         dke $$7 = null;
         if (h($$6)) {
            $$7 = dkg.qT;
         } else if ($$6.a(dkg.qT) && $$6.c(djd.d) == $$4) {
            $$7 = dkg.qS;
         } else if ($$6.a(dkg.qS) && $$6.c(djd.d) == $$4) {
            $$7 = dkg.qR;
         } else if ($$6.a(dkg.qR) && $$6.c(djd.d) == $$4) {
            $$7 = dkg.qQ;
         }

         if ($$7 != null) {
            dxn $$8 = $$7.m().b(djd.d, $$4).b(djd.c, Boolean.valueOf($$6.y().a() == etq.c));
            $$1.b($$5, $$8);
         }
      }
   }

   public static boolean h(dxn $$0) {
      return $$0.l() || $$0.a(dkg.J) && $$0.y().e() == 8;
   }
}
