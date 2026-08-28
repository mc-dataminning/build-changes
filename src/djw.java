import com.mojang.serialization.MapCodec;

public class djw extends dil {
   public static final MapCodec<djw> b = b(djw::new);
   public static final int c = 5;
   private static final jn[] d = jn.values();

   @Override
   public MapCodec<djw> a() {
      return b;
   }

   public djw(dwx.d $$0) {
      super($$0);
   }

   @Override
   protected void b(dwy $$0, ard $$1, ji $$2, azh $$3) {
      if ($$3.a(5) == 0) {
         jn $$4 = d[$$3.a(d.length)];
         ji $$5 = $$2.a($$4);
         dwy $$6 = $$1.a_($$5);
         djn $$7 = null;
         if (h($$6)) {
            $$7 = djp.ra;
         } else if ($$6.a(djp.ra) && $$6.c(dim.d) == $$4) {
            $$7 = djp.qZ;
         } else if ($$6.a(djp.qZ) && $$6.c(dim.d) == $$4) {
            $$7 = djp.qY;
         } else if ($$6.a(djp.qY) && $$6.c(dim.d) == $$4) {
            $$7 = djp.qX;
         }

         if ($$7 != null) {
            dwy $$8 = $$7.m().b(dim.d, $$4).b(dim.c, Boolean.valueOf($$6.y().a() == etb.c));
            $$1.b($$5, $$8);
         }
      }
   }

   public static boolean h(dwy $$0) {
      return $$0.l() || $$0.a(djp.J) && $$0.y().e() == 8;
   }
}
