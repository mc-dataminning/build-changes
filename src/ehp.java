import com.mojang.serialization.Codec;

public class ehp extends efw<eih> {
   private static final jn[] a = jn.values();

   public ehp(Codec<eih> $$0) {
      super($$0);
   }

   @Override
   public boolean a(efy<eih> $$0) {
      dhe $$1 = $$0.b();
      ji $$2 = $$0.e();
      azg $$3 = $$0.d();
      if (!$$1.u($$2)) {
         return false;
      } else {
         dwv $$4 = $$1.a_($$2.d());
         if (!$$4.a(djm.ei) && !$$4.a(djm.lm)) {
            return false;
         } else {
            this.a($$1, $$3, $$2);
            this.b($$1, $$3, $$2);
            return true;
         }
      }
   }

   private void a(dgh $$0, azg $$1, ji $$2) {
      $$0.a($$2, djm.lm.m(), 2);
      ji.a $$3 = new ji.a();
      ji.a $$4 = new ji.a();

      for (int $$5 = 0; $$5 < 200; $$5++) {
         $$3.a($$2, $$1.a(6) - $$1.a(6), $$1.a(2) - $$1.a(5), $$1.a(6) - $$1.a(6));
         if ($$0.u($$3)) {
            int $$6 = 0;

            for (jn $$7 : a) {
               dwv $$8 = $$0.a_($$4.a($$3, $$7));
               if ($$8.a(djm.ei) || $$8.a(djm.lm)) {
                  $$6++;
               }

               if ($$6 > 1) {
                  break;
               }
            }

            if ($$6 == 1) {
               $$0.a($$3, djm.lm.m(), 2);
            }
         }
      }
   }

   private void b(dgh $$0, azg $$1, ji $$2) {
      ji.a $$3 = new ji.a();

      for (int $$4 = 0; $$4 < 100; $$4++) {
         $$3.a($$2, $$1.a(8) - $$1.a(8), $$1.a(2) - $$1.a(7), $$1.a(8) - $$1.a(8));
         if ($$0.u($$3)) {
            dwv $$5 = $$0.a_($$3.d());
            if ($$5.a(djm.ei) || $$5.a(djm.lm)) {
               int $$6 = ayy.a($$1, 1, 8);
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

   public static void a(dgh $$0, azg $$1, ji.a $$2, int $$3, int $$4, int $$5) {
      for (int $$6 = 0; $$6 <= $$3; $$6++) {
         if ($$0.u($$2)) {
            if ($$6 == $$3 || !$$0.u($$2.e())) {
               $$0.a($$2, djm.pb.m().b(dna.e, Integer.valueOf(ayy.a($$1, $$4, $$5))), 2);
               break;
            }

            $$0.a($$2, djm.pc.m(), 2);
         }

         $$2.c(jn.a);
      }
   }
}
