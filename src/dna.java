import com.mojang.serialization.MapCodec;

public class dna extends dlp {
   public static final MapCodec<dna> b = b(dna::new);
   public static final int c = 5;
   private static final jb[] d = jb.values();

   @Override
   public MapCodec<dna> a() {
      return b;
   }

   public dna(eas.d $$0) {
      super($$0);
   }

   @Override
   protected void b(eat $$0, arq $$1, iv $$2, azv $$3) {
      if ($$3.a(5) == 0) {
         jb $$4 = d[$$3.a(d.length)];
         iv $$5 = $$2.a($$4);
         eat $$6 = $$1.a_($$5);
         dmr $$7 = null;
         if (h($$6)) {
            $$7 = dmt.rg;
         } else if ($$6.a(dmt.rg) && $$6.c(dlq.d) == $$4) {
            $$7 = dmt.rf;
         } else if ($$6.a(dmt.rf) && $$6.c(dlq.d) == $$4) {
            $$7 = dmt.re;
         } else if ($$6.a(dmt.re) && $$6.c(dlq.d) == $$4) {
            $$7 = dmt.rd;
         }

         if ($$7 != null) {
            eat $$8 = $$7.m().b(dlq.d, $$4).b(dlq.c, Boolean.valueOf($$6.y().a() == exb.c));
            $$1.b($$5, $$8);
         }
      }
   }

   public static boolean h(eat $$0) {
      return $$0.l() || $$0.a(dmt.J) && $$0.y().e() == 8;
   }
}
