import com.mojang.serialization.MapCodec;

public class dff extends ddv {
   public static final MapCodec<dff> b = b(dff::new);
   public static final int c = 5;
   private static final je[] d = je.values();

   @Override
   public MapCodec<dff> a() {
      return b;
   }

   public dff(drz.d $$0) {
      super($$0);
   }

   @Override
   protected void b(dsa $$0, are $$1, iz $$2, azf $$3) {
      if ($$3.a(5) == 0) {
         je $$4 = d[$$3.a(d.length)];
         iz $$5 = $$2.a($$4);
         dsa $$6 = $$1.a_($$5);
         dex $$7 = null;
         if (g($$6)) {
            $$7 = dez.qy;
         } else if ($$6.a(dez.qy) && $$6.c(ddw.d) == $$4) {
            $$7 = dez.qx;
         } else if ($$6.a(dez.qx) && $$6.c(ddw.d) == $$4) {
            $$7 = dez.qw;
         } else if ($$6.a(dez.qw) && $$6.c(ddw.d) == $$4) {
            $$7 = dez.qv;
         }

         if ($$7 != null) {
            dsa $$8 = $$7.o().a(ddw.d, $$4).a(ddw.c, Boolean.valueOf($$6.u().a() == enu.c));
            $$1.b($$5, $$8);
         }
      }
   }

   public static boolean g(dsa $$0) {
      return $$0.i() || $$0.a(dez.G) && $$0.u().e() == 8;
   }
}
