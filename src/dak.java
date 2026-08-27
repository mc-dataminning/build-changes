import com.mojang.serialization.MapCodec;

public class dak extends cza {
   public static final MapCodec<dak> b = b(dak::new);
   public static final int c = 5;
   private static final ih[] d = ih.values();

   @Override
   public MapCodec<dak> a() {
      return b;
   }

   public dak(dna.d $$0) {
      super($$0);
   }

   @Override
   protected void b(dnb $$0, apf $$1, ib $$2, axd $$3) {
      if ($$3.a(5) == 0) {
         ih $$4 = d[$$3.a(d.length)];
         ib $$5 = $$2.a($$4);
         dnb $$6 = $$1.a_($$5);
         dac $$7 = null;
         if (g($$6)) {
            $$7 = dae.qy;
         } else if ($$6.a(dae.qy) && $$6.c(czb.d) == $$4) {
            $$7 = dae.qx;
         } else if ($$6.a(dae.qx) && $$6.c(czb.d) == $$4) {
            $$7 = dae.qw;
         } else if ($$6.a(dae.qw) && $$6.c(czb.d) == $$4) {
            $$7 = dae.qv;
         }

         if ($$7 != null) {
            dnb $$8 = $$7.o().a(czb.d, $$4).a(czb.c, Boolean.valueOf($$6.u().a() == eiq.c));
            $$1.b($$5, $$8);
         }
      }
   }

   public static boolean g(dnb $$0) {
      return $$0.i() || $$0.a(dae.G) && $$0.u().e() == 8;
   }
}
