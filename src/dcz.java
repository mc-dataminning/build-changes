import com.mojang.serialization.MapCodec;

public class dcz extends cyt implements dcy {
   public static final MapCodec<dcz> b = b(dcz::new);

   @Override
   public MapCodec<dcz> a() {
      return b;
   }

   public dcz(diz.d $$0) {
      super(bix.a(1), $$0);
   }

   @Override
   public int a(ddd.a $$0, ctj $$1, hx $$2, aup $$3, ddd $$4, boolean $$5) {
      int $$6 = $$0.b();
      if ($$6 != 0 && $$3.a($$4.f()) == 0) {
         hx $$7 = $$0.a();
         boolean $$8 = $$7.a($$2, (double)$$4.e());
         if (!$$8 && a($$1, $$7)) {
            int $$9 = $$4.d();
            if ($$3.a($$9) < $$6) {
               hx $$10 = $$7.c();
               dja $$11 = this.a($$1, $$10, $$3, $$4.h());
               $$1.a($$10, $$11, 3);
               $$1.a(null, $$7, $$11.w().e(), arn.e, 1.0F, 1.0F);
            }

            return Math.max(0, $$6 - $$9);
         } else {
            return $$3.a($$4.g()) != 0 ? $$6 : $$6 - ($$8 ? 1 : a($$4, $$7, $$2, $$6));
         }
      } else {
         return $$6;
      }
   }

   private static int a(ddd $$0, hx $$1, hx $$2, int $$3) {
      int $$4 = $$0.e();
      float $$5 = aui.k((float)Math.sqrt($$1.j($$2)) - (float)$$4);
      int $$6 = aui.h(24 - $$4);
      float $$7 = Math.min(1.0F, $$5 / (float)$$6);
      return Math.max(1, (int)((float)$$3 * $$7 * 0.5F));
   }

   private dja a(ctj $$0, hx $$1, aup $$2, boolean $$3) {
      dja $$4;
      if ($$2.a(11) == 0) {
         $$4 = cwl.qV.o().a(ddc.d, Boolean.valueOf($$3));
      } else {
         $$4 = cwl.qQ.o();
      }

      return $$4.b(djq.C) && !$$0.b_($$1).c() ? $$4.a(djq.C, Boolean.valueOf(true)) : $$4;
   }

   private static boolean a(ctj $$0, hx $$1) {
      dja $$2 = $$0.a_($$1.c());
      if ($$2.i() || $$2.a(cwl.G) && $$2.u().b(eel.c)) {
         int $$3 = 0;

         for (hx $$4 : hx.a($$1.b(-4, 0, -4), $$1.b(4, 2, 4))) {
            dja $$5 = $$0.a_($$4);
            if ($$5.a(cwl.qQ) || $$5.a(cwl.qV)) {
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
