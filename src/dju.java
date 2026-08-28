import com.mojang.serialization.MapCodec;

public class dju extends dij {
   public static final MapCodec<dju> b = b(dju::new);
   public static final int c = 5;
   private static final jn[] d = jn.values();

   @Override
   public MapCodec<dju> a() {
      return b;
   }

   public dju(dwv.d $$0) {
      super($$0);
   }

   @Override
   protected void b(dww $$0, ard $$1, ji $$2, azh $$3) {
      if ($$3.a(5) == 0) {
         jn $$4 = d[$$3.a(d.length)];
         ji $$5 = $$2.a($$4);
         dww $$6 = $$1.a_($$5);
         djl $$7 = null;
         if (h($$6)) {
            $$7 = djn.ra;
         } else if ($$6.a(djn.ra) && $$6.c(dik.d) == $$4) {
            $$7 = djn.qZ;
         } else if ($$6.a(djn.qZ) && $$6.c(dik.d) == $$4) {
            $$7 = djn.qY;
         } else if ($$6.a(djn.qY) && $$6.c(dik.d) == $$4) {
            $$7 = djn.qX;
         }

         if ($$7 != null) {
            dww $$8 = $$7.m().b(dik.d, $$4).b(dik.c, Boolean.valueOf($$6.y().a() == esz.c));
            $$1.b($$5, $$8);
         }
      }
   }

   public static boolean h(dww $$0) {
      return $$0.l() || $$0.a(djn.J) && $$0.y().e() == 8;
   }
}
