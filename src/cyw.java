import com.mojang.serialization.MapCodec;

public class cyw extends cxm {
   public static final MapCodec<cyw> b = b(cyw::new);
   public static final int c = 5;
   private static final ie[] d = ie.values();

   @Override
   public MapCodec<cyw> a() {
      return b;
   }

   public cyw(dle.d $$0) {
      super($$0);
   }

   @Override
   protected void b(dlf $$0, aov $$1, hz $$2, awo $$3) {
      if ($$3.a(5) == 0) {
         ie $$4 = d[$$3.a(d.length)];
         hz $$5 = $$2.a($$4);
         dlf $$6 = $$1.a_($$5);
         cyo $$7 = null;
         if (g($$6)) {
            $$7 = cyq.qy;
         } else if ($$6.a(cyq.qy) && $$6.c(cxn.d) == $$4) {
            $$7 = cyq.qx;
         } else if ($$6.a(cyq.qx) && $$6.c(cxn.d) == $$4) {
            $$7 = cyq.qw;
         } else if ($$6.a(cyq.qw) && $$6.c(cxn.d) == $$4) {
            $$7 = cyq.qv;
         }

         if ($$7 != null) {
            dlf $$8 = $$7.o().a(cxn.d, $$4).a(cxn.c, Boolean.valueOf($$6.u().a() == egq.c));
            $$1.b($$5, $$8);
         }
      }
   }

   public static boolean g(dlf $$0) {
      return $$0.i() || $$0.a(cyq.G) && $$0.u().e() == 8;
   }
}
