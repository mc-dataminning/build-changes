import com.mojang.serialization.MapCodec;

public class dnx extends dmm {
   public static final MapCodec<dnx> b = b(dnx::new);
   public static final int c = 5;
   private static final jc[] d = jc.values();

   @Override
   public MapCodec<dnx> a() {
      return b;
   }

   public dnx(ebp.d $$0) {
      super($$0);
   }

   @Override
   protected void b(ebq $$0, asb $$1, iw $$2, bai $$3) {
      if ($$3.a(5) == 0) {
         jc $$4 = d[$$3.a(d.length)];
         iw $$5 = $$2.a($$4);
         ebq $$6 = $$1.a_($$5);
         dno $$7 = null;
         if (h($$6)) {
            $$7 = dnq.rg;
         } else if ($$6.a(dnq.rg) && $$6.c(dmn.d) == $$4) {
            $$7 = dnq.rf;
         } else if ($$6.a(dnq.rf) && $$6.c(dmn.d) == $$4) {
            $$7 = dnq.re;
         } else if ($$6.a(dnq.re) && $$6.c(dmn.d) == $$4) {
            $$7 = dnq.rd;
         }

         if ($$7 != null) {
            ebq $$8 = $$7.m().b(dmn.d, $$4).b(dmn.c, Boolean.valueOf($$6.y().a() == eyb.c));
            $$1.b($$5, $$8);
         }
      }
   }

   public static boolean h(ebq $$0) {
      return $$0.l() || $$0.a(dnq.J) && $$0.y().e() == 8;
   }
}
