import com.mojang.serialization.MapCodec;

public class dfk extends ddz {
   public static final MapCodec<dfk> b = b(dfk::new);
   public static final int c = 5;
   private static final iw[] d = iw.values();

   @Override
   public MapCodec<dfk> a() {
      return b;
   }

   public dfk(dtb.d $$0) {
      super($$0);
   }

   @Override
   protected void b(dtc $$0, aqt $$1, ir $$2, ayt $$3) {
      if ($$3.a(5) == 0) {
         iw $$4 = d[$$3.a(d.length)];
         ir $$5 = $$2.a($$4);
         dtc $$6 = $$1.a_($$5);
         dfc $$7 = null;
         if (g($$6)) {
            $$7 = dfe.rJ;
         } else if ($$6.a(dfe.rJ) && $$6.c(dea.d) == $$4) {
            $$7 = dfe.rI;
         } else if ($$6.a(dfe.rI) && $$6.c(dea.d) == $$4) {
            $$7 = dfe.rH;
         } else if ($$6.a(dfe.rH) && $$6.c(dea.d) == $$4) {
            $$7 = dfe.rG;
         }

         if ($$7 != null) {
            dtc $$8 = $$7.n().a(dea.d, $$4).a(dea.c, Boolean.valueOf($$6.u().a() == epf.c));
            $$1.b($$5, $$8);
         }
      }
   }

   public static boolean g(dtc $$0) {
      return $$0.i() || $$0.a(dfe.al) && $$0.u().e() == 8;
   }
}
