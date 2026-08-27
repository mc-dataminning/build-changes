import java.util.List;

public interface cpf {
   String a = "color";
   String b = "display";
   int c = 10511680;

   static boolean a(cqm $$0) {
      ta $$1 = $$0.c("display");
      return $$1 != null && $$1.b("color", 99);
   }

   static int b(cqm $$0) {
      ta $$1 = $$0.c("display");
      return $$1 != null && $$1.b("color", 99) ? $$1.h("color") : 10511680;
   }

   static void c(cqm $$0) {
      ta $$1 = $$0.c("display");
      if ($$1 != null && $$1.e("color")) {
         $$1.r("color");
      }
   }

   static void a(cqm $$0, int $$1) {
      $$0.b("display").a("color", $$1);
   }

   static cqm a(cqm $$0, List<cpe> $$1) {
      if (!$$0.a(auv.ba)) {
         return cqm.h;
      } else {
         int[] $$2 = new int[3];
         int $$3 = 0;
         int $$4 = 0;
         cqm $$5 = $$0.c(1);
         if (a($$0)) {
            int $$6 = b($$5);
            float $$7 = (float)($$6 >> 16 & 0xFF) / 255.0F;
            float $$8 = (float)($$6 >> 8 & 0xFF) / 255.0F;
            float $$9 = (float)($$6 & 0xFF) / 255.0F;
            $$3 += (int)(Math.max($$7, Math.max($$8, $$9)) * 255.0F);
            $$2[0] += (int)($$7 * 255.0F);
            $$2[1] += (int)($$8 * 255.0F);
            $$2[2] += (int)($$9 * 255.0F);
            $$4++;
         }

         for (cpe $$10 : $$1) {
            float[] $$11 = $$10.c().d();
            int $$12 = (int)($$11[0] * 255.0F);
            int $$13 = (int)($$11[1] * 255.0F);
            int $$14 = (int)($$11[2] * 255.0F);
            $$3 += Math.max($$12, Math.max($$13, $$14));
            $$2[0] += $$12;
            $$2[1] += $$13;
            $$2[2] += $$14;
            $$4++;
         }

         int $$15 = $$2[0] / $$4;
         int $$16 = $$2[1] / $$4;
         int $$17 = $$2[2] / $$4;
         float $$18 = (float)$$3 / (float)$$4;
         float $$19 = (float)Math.max($$15, Math.max($$16, $$17));
         $$15 = (int)((float)$$15 * $$18 / $$19);
         $$16 = (int)((float)$$16 * $$18 / $$19);
         $$17 = (int)((float)$$17 * $$18 / $$19);
         int var24 = ($$15 << 8) + $$16;
         var24 = (var24 << 8) + $$17;
         a($$5, var24);
         return $$5;
      }
   }
}
