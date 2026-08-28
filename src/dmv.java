import com.mojang.serialization.MapCodec;

public class dmv extends dlk {
   public static final MapCodec<dmv> b = b(dmv::new);
   public static final int c = 5;
   private static final jb[] d = jb.values();

   @Override
   public MapCodec<dmv> a() {
      return b;
   }

   public dmv(ean.d $$0) {
      super($$0);
   }

   @Override
   protected void b(eao $$0, arq $$1, iv $$2, azv $$3) {
      if ($$3.a(5) == 0) {
         jb $$4 = d[$$3.a(d.length)];
         iv $$5 = $$2.a($$4);
         eao $$6 = $$1.a_($$5);
         dmm $$7 = null;
         if (h($$6)) {
            $$7 = dmo.rg;
         } else if ($$6.a(dmo.rg) && $$6.c(dll.d) == $$4) {
            $$7 = dmo.rf;
         } else if ($$6.a(dmo.rf) && $$6.c(dll.d) == $$4) {
            $$7 = dmo.re;
         } else if ($$6.a(dmo.re) && $$6.c(dll.d) == $$4) {
            $$7 = dmo.rd;
         }

         if ($$7 != null) {
            eao $$8 = $$7.m().b(dll.d, $$4).b(dll.c, Boolean.valueOf($$6.y().a() == eww.c));
            $$1.b($$5, $$8);
         }
      }
   }

   public static boolean h(eao $$0) {
      return $$0.l() || $$0.a(dmo.J) && $$0.y().e() == 8;
   }
}
