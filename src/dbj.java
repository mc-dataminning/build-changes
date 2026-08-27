import com.mojang.serialization.MapCodec;

public class dbj extends cxc implements dbi {
   public static final MapCodec<dbj> b = b(dbj::new);

   @Override
   public MapCodec<dbj> a() {
      return b;
   }

   public dbj(dgv.d $$0) {
      super(bhs.a(1), $$0);
   }

   @Override
   public int a(dbn.a $$0, crt $$1, ht $$2, ato $$3, dbn $$4, boolean $$5) {
      int $$6 = $$0.b();
      if ($$6 != 0 && $$3.a($$4.f()) == 0) {
         ht $$7 = $$0.a();
         boolean $$8 = $$7.a($$2, (double)$$4.e());
         if (!$$8 && a($$1, $$7)) {
            int $$9 = $$4.d();
            if ($$3.a($$9) < $$6) {
               ht $$10 = $$7.c();
               dgw $$11 = this.a($$1, $$10, $$3, $$4.h());
               $$1.a($$10, $$11, 3);
               $$1.a(null, $$7, $$11.w().e(), aqo.e, 1.0F, 1.0F);
            }

            return Math.max(0, $$6 - $$9);
         } else {
            return $$3.a($$4.g()) != 0 ? $$6 : $$6 - ($$8 ? 1 : a($$4, $$7, $$2, $$6));
         }
      } else {
         return $$6;
      }
   }

   private static int a(dbn $$0, ht $$1, ht $$2, int $$3) {
      int $$4 = $$0.e();
      float $$5 = ati.k((float)Math.sqrt($$1.j($$2)) - (float)$$4);
      int $$6 = ati.h(24 - $$4);
      float $$7 = Math.min(1.0F, $$5 / (float)$$6);
      return Math.max(1, (int)((float)$$3 * $$7 * 0.5F));
   }

   private dgw a(crt $$0, ht $$1, ato $$2, boolean $$3) {
      dgw $$4;
      if ($$2.a(11) == 0) {
         $$4 = cuv.qI.o().a(dbm.d, Boolean.valueOf($$3));
      } else {
         $$4 = cuv.qD.o();
      }

      return $$4.b(dhm.C) && !$$0.b_($$1).c() ? $$4.a(dhm.C, Boolean.valueOf(true)) : $$4;
   }

   private static boolean a(crt $$0, ht $$1) {
      dgw $$2 = $$0.a_($$1.c());
      if ($$2.i() || $$2.a(cuv.G) && $$2.u().b(ech.c)) {
         int $$3 = 0;

         for (ht $$4 : ht.a($$1.b(-4, 0, -4), $$1.b(4, 2, 4))) {
            dgw $$5 = $$0.a_($$4);
            if ($$5.a(cuv.qD) || $$5.a(cuv.qI)) {
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
