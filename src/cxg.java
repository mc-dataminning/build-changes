import com.mojang.serialization.MapCodec;

public class cxg extends cvw {
   public static final MapCodec<cxg> b = b(cxg::new);
   public static final int c = 5;
   private static final ic[] d = ic.values();

   @Override
   public MapCodec<cxg> a() {
      return b;
   }

   public cxg(djo.d $$0) {
      super($$0);
   }

   @Override
   public void b(djp $$0, ane $$1, hx $$2, auw $$3) {
      if ($$3.a(5) == 0) {
         ic $$4 = d[$$3.a(d.length)];
         hx $$5 = $$2.a($$4);
         djp $$6 = $$1.a_($$5);
         cwy $$7 = null;
         if (g($$6)) {
            $$7 = cxa.qy;
         } else if ($$6.a(cxa.qy) && $$6.c(cvx.d) == $$4) {
            $$7 = cxa.qx;
         } else if ($$6.a(cxa.qx) && $$6.c(cvx.d) == $$4) {
            $$7 = cxa.qw;
         } else if ($$6.a(cxa.qw) && $$6.c(cvx.d) == $$4) {
            $$7 = cxa.qv;
         }

         if ($$7 != null) {
            djp $$8 = $$7.o().a(cvx.d, $$4).a(cvx.c, Boolean.valueOf($$6.u().a() == efa.c));
            $$1.b($$5, $$8);
         }
      }
   }

   public static boolean g(djp $$0) {
      return $$0.i() || $$0.a(cxa.G) && $$0.u().e() == 8;
   }
}
