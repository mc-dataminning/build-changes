import com.mojang.serialization.MapCodec;

public class dlp extends dhi implements dlo {
   public static final MapCodec<dlp> b = b(dlp::new);

   @Override
   public MapCodec<dlp> a() {
      return b;
   }

   public dlp(dsa.d $$0) {
      super(bpv.a(1), $$0);
   }

   @Override
   public int a(dlt.a $$0, dby $$1, iz $$2, azg $$3, dlt $$4, boolean $$5) {
      int $$6 = $$0.b();
      if ($$6 != 0 && $$3.a($$4.f()) == 0) {
         iz $$7 = $$0.a();
         boolean $$8 = $$7.a($$2, (double)$$4.e());
         if (!$$8 && a($$1, $$7)) {
            int $$9 = $$4.d();
            if ($$3.a($$9) < $$6) {
               iz $$10 = $$7.c();
               dsb $$11 = this.a($$1, $$10, $$3, $$4.h());
               $$1.a($$10, $$11, 3);
               $$1.a(null, $$7, $$11.w().e(), awa.e, 1.0F, 1.0F);
            }

            return Math.max(0, $$6 - $$9);
         } else {
            return $$3.a($$4.g()) != 0 ? $$6 : $$6 - ($$8 ? 1 : a($$4, $$7, $$2, $$6));
         }
      } else {
         return $$6;
      }
   }

   private static int a(dlt $$0, iz $$1, iz $$2, int $$3) {
      int $$4 = $$0.e();
      float $$5 = ayy.k((float)Math.sqrt($$1.j($$2)) - (float)$$4);
      int $$6 = ayy.h(24 - $$4);
      float $$7 = Math.min(1.0F, $$5 / (float)$$6);
      return Math.max(1, (int)((float)$$3 * $$7 * 0.5F));
   }

   private dsb a(dby $$0, iz $$1, azg $$2, boolean $$3) {
      dsb $$4;
      if ($$2.a(11) == 0) {
         $$4 = dfa.qV.o().a(dls.d, Boolean.valueOf($$3));
      } else {
         $$4 = dfa.qQ.o();
      }

      return $$4.b(dsr.C) && !$$0.b_($$1).c() ? $$4.a(dsr.C, Boolean.valueOf(true)) : $$4;
   }

   private static boolean a(dby $$0, iz $$1) {
      dsb $$2 = $$0.a_($$1.c());
      if ($$2.i() || $$2.a(dfa.G) && $$2.u().b(env.c)) {
         int $$3 = 0;

         for (iz $$4 : iz.c($$1.b(-4, 0, -4), $$1.b(4, 2, 4))) {
            dsb $$5 = $$0.a_($$4);
            if ($$5.a(dfa.qQ) || $$5.a(dfa.qV)) {
               $$3++;
            }

            if ($$3 > 2) {
               return false;
            }
         }

         return true;
      } else {
         return false;
      }
   }

   @Override
   public boolean d() {
      return false;
   }
}
