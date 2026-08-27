import com.mojang.serialization.MapCodec;

public class czn extends cyd {
   public static final MapCodec<czn> b = b(czn::new);
   public static final int c = 5;
   private static final ih[] d = ih.values();

   @Override
   public MapCodec<czn> a() {
      return b;
   }

   public czn(dmd.d $$0) {
      super($$0);
   }

   @Override
   protected void b(dme $$0, apa $$1, ib $$2, awt $$3) {
      if ($$3.a(5) == 0) {
         ih $$4 = d[$$3.a(d.length)];
         ib $$5 = $$2.a($$4);
         dme $$6 = $$1.a_($$5);
         czf $$7 = null;
         if (g($$6)) {
            $$7 = czh.qy;
         } else if ($$6.a(czh.qy) && $$6.c(cye.d) == $$4) {
            $$7 = czh.qx;
         } else if ($$6.a(czh.qx) && $$6.c(cye.d) == $$4) {
            $$7 = czh.qw;
         } else if ($$6.a(czh.qw) && $$6.c(cye.d) == $$4) {
            $$7 = czh.qv;
         }

         if ($$7 != null) {
            dme $$8 = $$7.o().a(cye.d, $$4).a(cye.c, Boolean.valueOf($$6.u().a() == ehs.c));
            $$1.b($$5, $$8);
         }
      }
   }

   public static boolean g(dme $$0) {
      return $$0.i() || $$0.a(czh.G) && $$0.u().e() == 8;
   }
}
