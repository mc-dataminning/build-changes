import com.mojang.serialization.MapCodec;

public class cvi extends cty {
   public static final MapCodec<cvi> b = b(cvi::new);
   public static final int c = 5;
   private static final hx[] d = hx.values();

   @Override
   public MapCodec<cvi> a() {
      return b;
   }

   public cvi(dhh.d $$0) {
      super($$0);
   }

   @Override
   public void b(dhi $$0, ame $$1, ht $$2, ats $$3) {
      if ($$3.a(5) == 0) {
         hx $$4 = d[$$3.a(d.length)];
         ht $$5 = $$2.a($$4);
         dhi $$6 = $$1.a_($$5);
         cva $$7 = null;
         if (g($$6)) {
            $$7 = cvc.qy;
         } else if ($$6.a(cvc.qy) && $$6.c(ctz.d) == $$4) {
            $$7 = cvc.qx;
         } else if ($$6.a(cvc.qx) && $$6.c(ctz.d) == $$4) {
            $$7 = cvc.qw;
         } else if ($$6.a(cvc.qw) && $$6.c(ctz.d) == $$4) {
            $$7 = cvc.qv;
         }

         if ($$7 != null) {
            dhi $$8 = $$7.o().a(ctz.d, $$4).a(ctz.c, Boolean.valueOf($$6.u().a() == ect.c));
            $$1.b($$5, $$8);
         }
      }
   }

   public static boolean g(dhi $$0) {
      return $$0.i() || $$0.a(cvc.G) && $$0.u().e() == 8;
   }
}
