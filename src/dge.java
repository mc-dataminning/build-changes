import com.mojang.serialization.MapCodec;

public class dge extends deu {
   public static final MapCodec<dge> b = b(dge::new);
   public static final int c = 5;
   private static final ji[] d = ji.values();

   @Override
   public MapCodec<dge> a() {
      return b;
   }

   public dge(dsz.d $$0) {
      super($$0);
   }

   @Override
   protected void b(dta $$0, aqt $$1, jd $$2, ayv $$3) {
      if ($$3.a(5) == 0) {
         ji $$4 = d[$$3.a(d.length)];
         jd $$5 = $$2.a($$4);
         dta $$6 = $$1.a_($$5);
         dfw $$7 = null;
         if (g($$6)) {
            $$7 = dfy.qy;
         } else if ($$6.a(dfy.qy) && $$6.c(dev.d) == $$4) {
            $$7 = dfy.qx;
         } else if ($$6.a(dfy.qx) && $$6.c(dev.d) == $$4) {
            $$7 = dfy.qw;
         } else if ($$6.a(dfy.qw) && $$6.c(dev.d) == $$4) {
            $$7 = dfy.qv;
         }

         if ($$7 != null) {
            dta $$8 = $$7.o().a(dev.d, $$4).a(dev.c, Boolean.valueOf($$6.u().a() == eoz.c));
            $$1.b($$5, $$8);
         }
      }
   }

   public static boolean g(dta $$0) {
      return $$0.i() || $$0.a(dfy.G) && $$0.u().e() == 8;
   }
}
