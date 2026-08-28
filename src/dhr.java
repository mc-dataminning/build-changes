import com.mojang.serialization.MapCodec;

public class dhr extends dgh {
   public static final MapCodec<dhr> b = b(dhr::new);
   public static final int c = 5;
   private static final jj[] d = jj.values();

   @Override
   public MapCodec<dhr> a() {
      return b;
   }

   public dhr(dun.d $$0) {
      super($$0);
   }

   @Override
   protected void b(duo $$0, arh $$1, je $$2, azl $$3) {
      if ($$3.a(5) == 0) {
         jj $$4 = d[$$3.a(d.length)];
         je $$5 = $$2.a($$4);
         duo $$6 = $$1.a_($$5);
         dhj $$7 = null;
         if (h($$6)) {
            $$7 = dhl.qy;
         } else if ($$6.a(dhl.qy) && $$6.c(dgi.d) == $$4) {
            $$7 = dhl.qx;
         } else if ($$6.a(dhl.qx) && $$6.c(dgi.d) == $$4) {
            $$7 = dhl.qw;
         } else if ($$6.a(dhl.qw) && $$6.c(dgi.d) == $$4) {
            $$7 = dhl.qv;
         }

         if ($$7 != null) {
            duo $$8 = $$7.o().b(dgi.d, $$4).b(dgi.c, Boolean.valueOf($$6.y().a() == eqq.c));
            $$1.b($$5, $$8);
         }
      }
   }

   public static boolean h(duo $$0) {
      return $$0.l() || $$0.a(dhl.G) && $$0.y().e() == 8;
   }
}
