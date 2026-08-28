import com.mojang.serialization.MapCodec;

public class dhd extends dft {
   public static final MapCodec<dhd> b = b(dhd::new);
   public static final int c = 5;
   private static final jj[] d = jj.values();

   @Override
   public MapCodec<dhd> a() {
      return b;
   }

   public dhd(dtz.d $$0) {
      super($$0);
   }

   @Override
   protected void b(dua $$0, arg $$1, je $$2, azk $$3) {
      if ($$3.a(5) == 0) {
         jj $$4 = d[$$3.a(d.length)];
         je $$5 = $$2.a($$4);
         dua $$6 = $$1.a_($$5);
         dgv $$7 = null;
         if (h($$6)) {
            $$7 = dgx.qy;
         } else if ($$6.a(dgx.qy) && $$6.c(dfu.d) == $$4) {
            $$7 = dgx.qx;
         } else if ($$6.a(dgx.qx) && $$6.c(dfu.d) == $$4) {
            $$7 = dgx.qw;
         } else if ($$6.a(dgx.qw) && $$6.c(dfu.d) == $$4) {
            $$7 = dgx.qv;
         }

         if ($$7 != null) {
            dua $$8 = $$7.o().b(dfu.d, $$4).b(dfu.c, Boolean.valueOf($$6.y().a() == eqc.c));
            $$1.b($$5, $$8);
         }
      }
   }

   public static boolean h(dua $$0) {
      return $$0.l() || $$0.a(dgx.G) && $$0.y().e() == 8;
   }
}
