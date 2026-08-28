import com.mojang.serialization.MapCodec;

public class dmo extends dld {
   public static final MapCodec<dmo> b = b(dmo::new);
   public static final int c = 5;
   private static final ja[] d = ja.values();

   @Override
   public MapCodec<dmo> a() {
      return b;
   }

   public dmo(eag.d $$0) {
      super($$0);
   }

   @Override
   protected void b(eah $$0, arq $$1, iu $$2, azv $$3) {
      if ($$3.a(5) == 0) {
         ja $$4 = d[$$3.a(d.length)];
         iu $$5 = $$2.a($$4);
         eah $$6 = $$1.a_($$5);
         dmf $$7 = null;
         if (h($$6)) {
            $$7 = dmh.rg;
         } else if ($$6.a(dmh.rg) && $$6.c(dle.d) == $$4) {
            $$7 = dmh.rf;
         } else if ($$6.a(dmh.rf) && $$6.c(dle.d) == $$4) {
            $$7 = dmh.re;
         } else if ($$6.a(dmh.re) && $$6.c(dle.d) == $$4) {
            $$7 = dmh.rd;
         }

         if ($$7 != null) {
            eah $$8 = $$7.m().b(dle.d, $$4).b(dle.c, Boolean.valueOf($$6.y().a() == ewp.c));
            $$1.b($$5, $$8);
         }
      }
   }

   public static boolean h(eah $$0) {
      return $$0.l() || $$0.a(dmh.J) && $$0.y().e() == 8;
   }
}
