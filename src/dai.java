import com.mojang.serialization.MapCodec;

public class dai extends cyy {
   public static final MapCodec<dai> b = b(dai::new);
   public static final int c = 5;
   private static final ih[] d = ih.values();

   @Override
   public MapCodec<dai> a() {
      return b;
   }

   public dai(dmy.d $$0) {
      super($$0);
   }

   @Override
   protected void b(dmz $$0, apf $$1, ib $$2, axd $$3) {
      if ($$3.a(5) == 0) {
         ih $$4 = d[$$3.a(d.length)];
         ib $$5 = $$2.a($$4);
         dmz $$6 = $$1.a_($$5);
         daa $$7 = null;
         if (g($$6)) {
            $$7 = dac.qy;
         } else if ($$6.a(dac.qy) && $$6.c(cyz.d) == $$4) {
            $$7 = dac.qx;
         } else if ($$6.a(dac.qx) && $$6.c(cyz.d) == $$4) {
            $$7 = dac.qw;
         } else if ($$6.a(dac.qw) && $$6.c(cyz.d) == $$4) {
            $$7 = dac.qv;
         }

         if ($$7 != null) {
            dmz $$8 = $$7.o().a(cyz.d, $$4).a(cyz.c, Boolean.valueOf($$6.u().a() == eio.c));
            $$1.b($$5, $$8);
         }
      }
   }

   public static boolean g(dmz $$0) {
      return $$0.i() || $$0.a(dac.G) && $$0.u().e() == 8;
   }
}
