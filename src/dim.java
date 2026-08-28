import com.mojang.serialization.MapCodec;

public class dim extends dhc {
   public static final MapCodec<dim> b = b(dim::new);
   public static final int c = 5;
   private static final jm[] d = jm.values();

   @Override
   public MapCodec<dim> a() {
      return b;
   }

   public dim(dvi.d $$0) {
      super($$0);
   }

   @Override
   protected void b(dvj $$0, arn $$1, jh $$2, azs $$3) {
      if ($$3.a(5) == 0) {
         jm $$4 = d[$$3.a(d.length)];
         jh $$5 = $$2.a($$4);
         dvj $$6 = $$1.a_($$5);
         die $$7 = null;
         if (h($$6)) {
            $$7 = dig.qy;
         } else if ($$6.a(dig.qy) && $$6.c(dhd.d) == $$4) {
            $$7 = dig.qx;
         } else if ($$6.a(dig.qx) && $$6.c(dhd.d) == $$4) {
            $$7 = dig.qw;
         } else if ($$6.a(dig.qw) && $$6.c(dhd.d) == $$4) {
            $$7 = dig.qv;
         }

         if ($$7 != null) {
            dvj $$8 = $$7.m().b(dhd.d, $$4).b(dhd.c, Boolean.valueOf($$6.y().a() == erl.c));
            $$1.b($$5, $$8);
         }
      }
   }

   public static boolean h(dvj $$0) {
      return $$0.l() || $$0.a(dig.G) && $$0.y().e() == 8;
   }
}
