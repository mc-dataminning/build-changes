import com.mojang.serialization.MapCodec;

public class dnn extends dmc {
   public static final MapCodec<dnn> b = b(dnn::new);
   public static final int c = 5;
   private static final jc[] d = jc.values();

   @Override
   public MapCodec<dnn> a() {
      return b;
   }

   public dnn(ebf.d $$0) {
      super($$0);
   }

   @Override
   protected void b(ebg $$0, aru $$1, iw $$2, azz $$3) {
      if ($$3.a(5) == 0) {
         jc $$4 = d[$$3.a(d.length)];
         iw $$5 = $$2.a($$4);
         ebg $$6 = $$1.a_($$5);
         dne $$7 = null;
         if (h($$6)) {
            $$7 = dng.rg;
         } else if ($$6.a(dng.rg) && $$6.c(dmd.d) == $$4) {
            $$7 = dng.rf;
         } else if ($$6.a(dng.rf) && $$6.c(dmd.d) == $$4) {
            $$7 = dng.re;
         } else if ($$6.a(dng.re) && $$6.c(dmd.d) == $$4) {
            $$7 = dng.rd;
         }

         if ($$7 != null) {
            ebg $$8 = $$7.m().b(dmd.d, $$4).b(dmd.c, Boolean.valueOf($$6.y().a() == exr.c));
            $$1.b($$5, $$8);
         }
      }
   }

   public static boolean h(ebg $$0) {
      return $$0.l() || $$0.a(dng.J) && $$0.y().e() == 8;
   }
}
