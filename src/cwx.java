import com.mojang.serialization.MapCodec;

public class cwx extends cvn {
   public static final MapCodec<cwx> b = b(cwx::new);
   public static final int c = 5;
   private static final ic[] d = ic.values();

   @Override
   public MapCodec<cwx> a() {
      return b;
   }

   public cwx(djf.d $$0) {
      super($$0);
   }

   @Override
   public void b(djg $$0, and $$1, hx $$2, auu $$3) {
      if ($$3.a(5) == 0) {
         ic $$4 = d[$$3.a(d.length)];
         hx $$5 = $$2.a($$4);
         djg $$6 = $$1.a_($$5);
         cwp $$7 = null;
         if (g($$6)) {
            $$7 = cwr.qy;
         } else if ($$6.a(cwr.qy) && $$6.c(cvo.d) == $$4) {
            $$7 = cwr.qx;
         } else if ($$6.a(cwr.qx) && $$6.c(cvo.d) == $$4) {
            $$7 = cwr.qw;
         } else if ($$6.a(cwr.qw) && $$6.c(cvo.d) == $$4) {
            $$7 = cwr.qv;
         }

         if ($$7 != null) {
            djg $$8 = $$7.o().a(cvo.d, $$4).a(cvo.c, Boolean.valueOf($$6.u().a() == eer.c));
            $$1.b($$5, $$8);
         }
      }
   }

   public static boolean g(djg $$0) {
      return $$0.i() || $$0.a(cwr.G) && $$0.u().e() == 8;
   }
}
