import com.mojang.serialization.MapCodec;

public class dsq extends dof implements dsp {
   public static final MapCodec<dsq> b = b(dsq::new);

   @Override
   public MapCodec<dsq> a() {
      return b;
   }

   public dsq(dzn.d $$0) {
      super(bta.a(1), $$0);
   }

   @Override
   public int a(dsu.a $$0, diq $$1, iu $$2, azt $$3, dsu $$4, boolean $$5) {
      int $$6 = $$0.b();
      if ($$6 != 0 && $$3.a($$4.f()) == 0) {
         iu $$7 = $$0.a();
         boolean $$8 = $$7.a($$2, (double)$$4.e());
         if (!$$8 && a($$1, $$7)) {
            int $$9 = $$4.d();
            if ($$3.a($$9) < $$6) {
               iu $$10 = $$7.d();
               dzo $$11 = this.a($$1, $$10, $$3, $$4.h());
               $$1.a($$10, $$11, 3);
               $$1.a(null, $$7, $$11.A().e(), awm.e, 1.0F, 1.0F);
            }

            return Math.max(0, $$6 - $$9);
         } else {
            return $$3.a($$4.g()) != 0 ? $$6 : $$6 - ($$8 ? 1 : a($$4, $$7, $$2, $$6));
         }
      } else {
         return $$6;
      }
   }

   private static int a(dsu $$0, iu $$1, iu $$2, int $$3) {
      int $$4 = $$0.e();
      float $$5 = azk.l((float)Math.sqrt($$1.j($$2)) - (float)$$4);
      int $$6 = azk.h(24 - $$4);
      float $$7 = Math.min(1.0F, $$5 / (float)$$6);
      return Math.max(1, (int)((float)$$3 * $$7 * 0.5F));
   }

   private dzo a(diq $$0, iu $$1, azt $$2, boolean $$3) {
      dzo $$4;
      if ($$2.a(11) == 0) {
         $$4 = dlw.rz.m().b(dst.d, Boolean.valueOf($$3));
      } else {
         $$4 = dlw.ru.m();
      }

      return $$4.b(eae.I) && !$$0.b_($$1).c() ? $$4.b(eae.I, Boolean.valueOf(true)) : $$4;
   }

   private static boolean a(diq $$0, iu $$1) {
      dzo $$2 = $$0.a_($$1.d());
      if ($$2.l() || $$2.a(dlw.J) && $$2.y().b(evw.c)) {
         int $$3 = 0;

         for (iu $$4 : iu.c($$1.b(-4, 0, -4), $$1.b(4, 2, 4))) {
            dzo $$5 = $$0.a_($$4);
            if ($$5.a(dlw.ru) || $$5.a(dlw.rz)) {
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
