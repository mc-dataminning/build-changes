import com.mojang.serialization.MapCodec;

public class ddo extends czi implements ddn {
   public static final MapCodec<ddo> b = b(ddo::new);

   @Override
   public MapCodec<ddo> a() {
      return b;
   }

   public ddo(djo.d $$0) {
      super(bje.a(1), $$0);
   }

   @Override
   public int a(dds.a $$0, cty $$1, hx $$2, auw $$3, dds $$4, boolean $$5) {
      int $$6 = $$0.b();
      if ($$6 != 0 && $$3.a($$4.f()) == 0) {
         hx $$7 = $$0.a();
         boolean $$8 = $$7.a($$2, (double)$$4.e());
         if (!$$8 && a($$1, $$7)) {
            int $$9 = $$4.d();
            if ($$3.a($$9) < $$6) {
               hx $$10 = $$7.c();
               djp $$11 = this.a($$1, $$10, $$3, $$4.h());
               $$1.a($$10, $$11, 3);
               $$1.a(null, $$7, $$11.w().e(), aru.e, 1.0F, 1.0F);
            }

            return Math.max(0, $$6 - $$9);
         } else {
            return $$3.a($$4.g()) != 0 ? $$6 : $$6 - ($$8 ? 1 : a($$4, $$7, $$2, $$6));
         }
      } else {
         return $$6;
      }
   }

   private static int a(dds $$0, hx $$1, hx $$2, int $$3) {
      int $$4 = $$0.e();
      float $$5 = aup.k((float)Math.sqrt($$1.j($$2)) - (float)$$4);
      int $$6 = aup.h(24 - $$4);
      float $$7 = Math.min(1.0F, $$5 / (float)$$6);
      return Math.max(1, (int)((float)$$3 * $$7 * 0.5F));
   }

   private djp a(cty $$0, hx $$1, auw $$2, boolean $$3) {
      djp $$4;
      if ($$2.a(11) == 0) {
         $$4 = cxa.qV.o().a(ddr.d, Boolean.valueOf($$3));
      } else {
         $$4 = cxa.qQ.o();
      }

      return $$4.b(dkf.C) && !$$0.b_($$1).c() ? $$4.a(dkf.C, Boolean.valueOf(true)) : $$4;
   }

   private static boolean a(cty $$0, hx $$1) {
      djp $$2 = $$0.a_($$1.c());
      if ($$2.i() || $$2.a(cxa.G) && $$2.u().b(efa.c)) {
         int $$3 = 0;

         for (hx $$4 : hx.a($$1.b(-4, 0, -4), $$1.b(4, 2, 4))) {
            djp $$5 = $$0.a_($$4);
            if ($$5.a(cxa.qQ) || $$5.a(cxa.qV)) {
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
