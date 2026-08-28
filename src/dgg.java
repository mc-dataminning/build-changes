import com.mojang.serialization.MapCodec;

public class dgg extends dew {
   public static final MapCodec<dgg> b = b(dgg::new);
   public static final int c = 5;
   private static final ji[] d = ji.values();

   @Override
   public MapCodec<dgg> a() {
      return b;
   }

   public dgg(dtb.d $$0) {
      super($$0);
   }

   @Override
   protected void b(dtc $$0, aqu $$1, jd $$2, ayw $$3) {
      if ($$3.a(5) == 0) {
         ji $$4 = d[$$3.a(d.length)];
         jd $$5 = $$2.a($$4);
         dtc $$6 = $$1.a_($$5);
         dfy $$7 = null;
         if (g($$6)) {
            $$7 = dga.qy;
         } else if ($$6.a(dga.qy) && $$6.c(dex.d) == $$4) {
            $$7 = dga.qx;
         } else if ($$6.a(dga.qx) && $$6.c(dex.d) == $$4) {
            $$7 = dga.qw;
         } else if ($$6.a(dga.qw) && $$6.c(dex.d) == $$4) {
            $$7 = dga.qv;
         }

         if ($$7 != null) {
            dtc $$8 = $$7.o().a(dex.d, $$4).a(dex.c, Boolean.valueOf($$6.u().a() == epf.c));
            $$1.b($$5, $$8);
         }
      }
   }

   public static boolean g(dtc $$0) {
      return $$0.i() || $$0.a(dga.G) && $$0.u().e() == 8;
   }
}
