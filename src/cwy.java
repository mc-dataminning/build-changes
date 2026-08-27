import com.mojang.serialization.MapCodec;

public class cwy extends cvo {
   public static final MapCodec<cwy> b = b(cwy::new);
   public static final int c = 5;
   private static final ic[] d = ic.values();

   @Override
   public MapCodec<cwy> a() {
      return b;
   }

   public cwy(djg.d $$0) {
      super($$0);
   }

   @Override
   public void b(djh $$0, and $$1, hx $$2, auv $$3) {
      if ($$3.a(5) == 0) {
         ic $$4 = d[$$3.a(d.length)];
         hx $$5 = $$2.a($$4);
         djh $$6 = $$1.a_($$5);
         cwq $$7 = null;
         if (g($$6)) {
            $$7 = cws.qy;
         } else if ($$6.a(cws.qy) && $$6.c(cvp.d) == $$4) {
            $$7 = cws.qx;
         } else if ($$6.a(cws.qx) && $$6.c(cvp.d) == $$4) {
            $$7 = cws.qw;
         } else if ($$6.a(cws.qw) && $$6.c(cvp.d) == $$4) {
            $$7 = cws.qv;
         }

         if ($$7 != null) {
            djh $$8 = $$7.o().a(cvp.d, $$4).a(cvp.c, Boolean.valueOf($$6.u().a() == ees.c));
            $$1.b($$5, $$8);
         }
      }
   }

   public static boolean g(djh $$0) {
      return $$0.i() || $$0.a(cws.G) && $$0.u().e() == 8;
   }
}
