import com.mojang.serialization.MapCodec;

public class dnl extends dma {
   public static final MapCodec<dnl> b = b(dnl::new);
   public static final int c = 5;
   private static final jb[] d = jb.values();

   @Override
   public MapCodec<dnl> a() {
      return b;
   }

   public dnl(ebd.d $$0) {
      super($$0);
   }

   @Override
   protected void b(ebe $$0, ars $$1, iv $$2, azx $$3) {
      if ($$3.a(5) == 0) {
         jb $$4 = d[$$3.a(d.length)];
         iv $$5 = $$2.a($$4);
         ebe $$6 = $$1.a_($$5);
         dnc $$7 = null;
         if (h($$6)) {
            $$7 = dne.rg;
         } else if ($$6.a(dne.rg) && $$6.c(dmb.d) == $$4) {
            $$7 = dne.rf;
         } else if ($$6.a(dne.rf) && $$6.c(dmb.d) == $$4) {
            $$7 = dne.re;
         } else if ($$6.a(dne.re) && $$6.c(dmb.d) == $$4) {
            $$7 = dne.rd;
         }

         if ($$7 != null) {
            ebe $$8 = $$7.m().b(dmb.d, $$4).b(dmb.c, Boolean.valueOf($$6.y().a() == exp.c));
            $$1.b($$5, $$8);
         }
      }
   }

   public static boolean h(ebe $$0) {
      return $$0.l() || $$0.a(dne.J) && $$0.y().e() == 8;
   }
}
