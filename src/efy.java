import com.mojang.serialization.Codec;

public class efy extends eef<egq> {
   private static final jl[] a = jl.values();

   public efy(Codec<egq> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eeh<egq> $$0) {
      dfs $$1 = $$0.b();
      jg $$2 = $$0.e();
      azr $$3 = $$0.d();
      if (!$$1.u($$2)) {
         return false;
      } else {
         dvd $$4 = $$1.a_($$2.d());
         if (!$$4.a(dia.dV) && !$$4.a(dia.kK)) {
            return false;
         } else {
            this.a($$1, $$3, $$2);
            this.b($$1, $$3, $$2);
            return true;
         }
      }
   }

   private void a(dew $$0, azr $$1, jg $$2) {
      $$0.a($$2, dia.kK.m(), 2);
      jg.a $$3 = new jg.a();
      jg.a $$4 = new jg.a();

      for (int $$5 = 0; $$5 < 200; $$5++) {
         $$3.a($$2, $$1.a(6) - $$1.a(6), $$1.a(2) - $$1.a(5), $$1.a(6) - $$1.a(6));
         if ($$0.u($$3)) {
            int $$6 = 0;

            for (jl $$7 : a) {
               dvd $$8 = $$0.a_($$4.a($$3, $$7));
               if ($$8.a(dia.dV) || $$8.a(dia.kK)) {
                  $$6++;
               }

               if ($$6 > 1) {
                  break;
               }
            }

            if ($$6 == 1) {
               $$0.a($$3, dia.kK.m(), 2);
            }
         }
      }
   }

   private void b(dew $$0, azr $$1, jg $$2) {
      jg.a $$3 = new jg.a();

      for (int $$4 = 0; $$4 < 100; $$4++) {
         $$3.a($$2, $$1.a(8) - $$1.a(8), $$1.a(2) - $$1.a(7), $$1.a(8) - $$1.a(8));
         if ($$0.u($$3)) {
            dvd $$5 = $$0.a_($$3.d());
            if ($$5.a(dia.dV) || $$5.a(dia.kK)) {
               int $$6 = azj.a($$1, 1, 8);
               if ($$1.a(6) == 0) {
                  $$6 *= 2;
               }

               if ($$1.a(5) == 0) {
                  $$6 = 1;
               }

               int $$7 = 17;
               int $$8 = 25;
               a($$0, $$1, $$3, $$6, 17, 25);
            }
         }
      }
   }

   public static void a(dew $$0, azr $$1, jg.a $$2, int $$3, int $$4, int $$5) {
      for (int $$6 = 0; $$6 <= $$3; $$6++) {
         if ($$0.u($$2)) {
            if ($$6 == $$3 || !$$0.u($$2.e())) {
               $$0.a($$2, dia.oz.m().b(dlm.e, Integer.valueOf(azj.a($$1, $$4, $$5))), 2);
               break;
            }

            $$0.a($$2, dia.oA.m(), 2);
         }

         $$2.c(jl.a);
      }
   }
}
