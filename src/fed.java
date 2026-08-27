public class fed {
   public static void a(fic $$0, fic $$1, fic $$2, boolean $$3) {
      fic $$4 = $$3 ? $$0 : $$1;
      fic $$5 = $$3 ? $$1 : $$0;
      $$4.f = ($$3 ? -0.3F : 0.3F) + $$2.f;
      $$5.f = ($$3 ? 0.6F : -0.6F) + $$2.f;
      $$4.e = (float) (-Math.PI / 2) + $$2.e + 0.1F;
      $$5.e = -1.5F + $$2.e;
   }

   public static void a(fic $$0, fic $$1, bjg $$2, boolean $$3) {
      fic $$4 = $$3 ? $$0 : $$1;
      fic $$5 = $$3 ? $$1 : $$0;
      $$4.f = $$3 ? -0.8F : 0.8F;
      $$4.e = -0.97079635F;
      $$5.e = $$4.e;
      float $$6 = (float)chn.k($$2.fo());
      float $$7 = arw.a((float)$$2.fq(), 0.0F, $$6);
      float $$8 = $$7 / $$6;
      $$5.f = arw.i($$8, 0.4F, 0.85F) * (float)($$3 ? 1 : -1);
      $$5.e = arw.i($$8, $$5.e, (float) (-Math.PI / 2));
   }

   public static <T extends bji> void a(fic $$0, fic $$1, T $$2, float $$3, float $$4) {
      float $$5 = arw.a($$3 * (float) Math.PI);
      float $$6 = arw.a((1.0F - (1.0F - $$3) * (1.0F - $$3)) * (float) Math.PI);
      $$0.g = 0.0F;
      $$1.g = 0.0F;
      $$0.f = (float) (Math.PI / 20);
      $$1.f = (float) (-Math.PI / 20);
      if ($$2.fl() == bja.b) {
         $$0.e = -1.8849558F + arw.b($$4 * 0.09F) * 0.15F;
         $$1.e = -0.0F + arw.b($$4 * 0.19F) * 0.5F;
         $$0.e += $$5 * 2.2F - $$6 * 0.4F;
         $$1.e += $$5 * 1.2F - $$6 * 0.4F;
      } else {
         $$0.e = -0.0F + arw.b($$4 * 0.19F) * 0.5F;
         $$1.e = -1.8849558F + arw.b($$4 * 0.09F) * 0.15F;
         $$0.e += $$5 * 1.2F - $$6 * 0.4F;
         $$1.e += $$5 * 2.2F - $$6 * 0.4F;
      }

      a($$0, $$1, $$4);
   }

   public static void a(fic $$0, float $$1, float $$2) {
      $$0.g = $$0.g + $$2 * (arw.b($$1 * 0.09F) * 0.05F + 0.05F);
      $$0.e = $$0.e + $$2 * arw.a($$1 * 0.067F) * 0.05F;
   }

   public static void a(fic $$0, fic $$1, float $$2) {
      a($$0, $$2, 1.0F);
      a($$1, $$2, -1.0F);
   }

   public static void a(fic $$0, fic $$1, boolean $$2, float $$3, float $$4) {
      float $$5 = arw.a($$3 * (float) Math.PI);
      float $$6 = arw.a((1.0F - (1.0F - $$3) * (1.0F - $$3)) * (float) Math.PI);
      $$1.g = 0.0F;
      $$0.g = 0.0F;
      $$1.f = -(0.1F - $$5 * 0.6F);
      $$0.f = 0.1F - $$5 * 0.6F;
      float $$7 = (float) -Math.PI / ($$2 ? 1.5F : 2.25F);
      $$1.e = $$7;
      $$0.e = $$7;
      $$1.e += $$5 * 1.2F - $$6 * 0.4F;
      $$0.e += $$5 * 1.2F - $$6 * 0.4F;
      a($$1, $$0, $$4);
   }
}
