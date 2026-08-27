import com.mojang.serialization.MapCodec;

public class cwh extends cux {
   public static final MapCodec<cwh> b = b(cwh::new);
   public static final int c = 5;
   private static final ia[] d = ia.values();

   @Override
   public MapCodec<cwh> a() {
      return b;
   }

   public cwh(dio.d $$0) {
      super($$0);
   }

   @Override
   public void b(dip $$0, amp $$1, hv $$2, auf $$3) {
      if ($$3.a(5) == 0) {
         ia $$4 = d[$$3.a(d.length)];
         hv $$5 = $$2.a($$4);
         dip $$6 = $$1.a_($$5);
         cvz $$7 = null;
         if (g($$6)) {
            $$7 = cwb.qy;
         } else if ($$6.a(cwb.qy) && $$6.c(cuy.d) == $$4) {
            $$7 = cwb.qx;
         } else if ($$6.a(cwb.qx) && $$6.c(cuy.d) == $$4) {
            $$7 = cwb.qw;
         } else if ($$6.a(cwb.qw) && $$6.c(cuy.d) == $$4) {
            $$7 = cwb.qv;
         }

         if ($$7 != null) {
            dip $$8 = $$7.o().a(cuy.d, $$4).a(cuy.c, Boolean.valueOf($$6.u().a() == eea.c));
            $$1.b($$5, $$8);
         }
      }
   }

   public static boolean g(dip $$0) {
      return $$0.i() || $$0.a(cwb.G) && $$0.u().e() == 8;
   }
}
