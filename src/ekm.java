import com.mojang.serialization.Codec;

public class ekm extends eit<ele> {
   private static final ja[] a = ja.values();

   public ekm(Codec<ele> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eiv<ele> $$0) {
      djo $$1 = $$0.b();
      iu $$2 = $$0.e();
      azt $$3 = $$0.d();
      if (!$$1.v($$2)) {
         return false;
      } else {
         dzo $$4 = $$1.a_($$2.d());
         if (!$$4.a(dlw.ei) && !$$4.a(dlw.lm)) {
            return false;
         } else {
            this.a($$1, $$3, $$2);
            this.b($$1, $$3, $$2);
            return true;
         }
      }
   }

   private void a(diq $$0, azt $$1, iu $$2) {
      $$0.a($$2, dlw.lm.m(), 2);
      iu.a $$3 = new iu.a();
      iu.a $$4 = new iu.a();

      for (int $$5 = 0; $$5 < 200; $$5++) {
         $$3.a($$2, $$1.a(6) - $$1.a(6), $$1.a(2) - $$1.a(5), $$1.a(6) - $$1.a(6));
         if ($$0.v($$3)) {
            int $$6 = 0;

            for (ja $$7 : a) {
               dzo $$8 = $$0.a_($$4.a($$3, $$7));
               if ($$8.a(dlw.ei) || $$8.a(dlw.lm)) {
                  $$6++;
               }

               if ($$6 > 1) {
                  break;
               }
            }

            if ($$6 == 1) {
               $$0.a($$3, dlw.lm.m(), 2);
            }
         }
      }
   }

   private void b(diq $$0, azt $$1, iu $$2) {
      iu.a $$3 = new iu.a();

      for (int $$4 = 0; $$4 < 100; $$4++) {
         $$3.a($$2, $$1.a(8) - $$1.a(8), $$1.a(2) - $$1.a(7), $$1.a(8) - $$1.a(8));
         if ($$0.v($$3)) {
            dzo $$5 = $$0.a_($$3.d());
            if ($$5.a(dlw.ei) || $$5.a(dlw.lm)) {
               int $$6 = azk.a($$1, 1, 8);
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

   public static void a(diq $$0, azt $$1, iu.a $$2, int $$3, int $$4, int $$5) {
      for (int $$6 = 0; $$6 <= $$3; $$6++) {
         if ($$0.v($$2)) {
            if ($$6 == $$3 || !$$0.v($$2.e())) {
               $$0.a($$2, dlw.pb.m().b(dpl.e, Integer.valueOf(azk.a($$1, $$4, $$5))), 2);
               break;
            }

            $$0.a($$2, dlw.pc.m(), 2);
         }

         $$2.c(ja.a);
      }
   }
}
