import com.mojang.serialization.MapCodec;

public class dfc extends dds {
   public static final MapCodec<dfc> b = b(dfc::new);
   public static final int c = 5;
   private static final je[] d = je.values();

   @Override
   public MapCodec<dfc> a() {
      return b;
   }

   public dfc(drw.d $$0) {
      super($$0);
   }

   @Override
   protected void b(drx $$0, arb $$1, iz $$2, azc $$3) {
      if ($$3.a(5) == 0) {
         je $$4 = d[$$3.a(d.length)];
         iz $$5 = $$2.a($$4);
         drx $$6 = $$1.a_($$5);
         deu $$7 = null;
         if (g($$6)) {
            $$7 = dew.qy;
         } else if ($$6.a(dew.qy) && $$6.c(ddt.d) == $$4) {
            $$7 = dew.qx;
         } else if ($$6.a(dew.qx) && $$6.c(ddt.d) == $$4) {
            $$7 = dew.qw;
         } else if ($$6.a(dew.qw) && $$6.c(ddt.d) == $$4) {
            $$7 = dew.qv;
         }

         if ($$7 != null) {
            drx $$8 = $$7.n().a(ddt.d, $$4).a(ddt.c, Boolean.valueOf($$6.u().a() == enr.c));
            $$1.b($$5, $$8);
         }
      }
   }

   public static boolean g(drx $$0) {
      return $$0.i() || $$0.a(dew.G) && $$0.u().e() == 8;
   }
}
