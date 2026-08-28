import com.mojang.serialization.MapCodec;

public class djt extends dii {
   public static final MapCodec<djt> b = b(djt::new);
   public static final int c = 5;
   private static final jn[] d = jn.values();

   @Override
   public MapCodec<djt> a() {
      return b;
   }

   public djt(dwu.d $$0) {
      super($$0);
   }

   @Override
   protected void b(dwv $$0, arc $$1, ji $$2, azg $$3) {
      if ($$3.a(5) == 0) {
         jn $$4 = d[$$3.a(d.length)];
         ji $$5 = $$2.a($$4);
         dwv $$6 = $$1.a_($$5);
         djk $$7 = null;
         if (h($$6)) {
            $$7 = djm.ra;
         } else if ($$6.a(djm.ra) && $$6.c(dij.d) == $$4) {
            $$7 = djm.qZ;
         } else if ($$6.a(djm.qZ) && $$6.c(dij.d) == $$4) {
            $$7 = djm.qY;
         } else if ($$6.a(djm.qY) && $$6.c(dij.d) == $$4) {
            $$7 = djm.qX;
         }

         if ($$7 != null) {
            dwv $$8 = $$7.m().b(dij.d, $$4).b(dij.c, Boolean.valueOf($$6.y().a() == esy.c));
            $$1.b($$5, $$8);
         }
      }
   }

   public static boolean h(dwv $$0) {
      return $$0.l() || $$0.a(djm.J) && $$0.y().e() == 8;
   }
}
