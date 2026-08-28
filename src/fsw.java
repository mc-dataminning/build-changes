public class fsw {
   public static void a(fwz $$0, fwz $$1, fwz $$2, boolean $$3) {
      fwz $$4 = $$3 ? $$0 : $$1;
      fwz $$5 = $$3 ? $$1 : $$0;
      $$4.f = ($$3 ? -0.3F : 0.3F) + $$2.f;
      $$5.f = ($$3 ? 0.6F : -0.6F) + $$2.f;
      $$4.e = (float) (-Math.PI / 2) + $$2.e + 0.1F;
      $$5.e = -1.5F + $$2.e;
   }

   public static void a(fwz $$0, fwz $$1, bto $$2, boolean $$3) {
      fwz $$4 = $$3 ? $$0 : $$1;
      fwz $$5 = $$3 ? $$1 : $$0;
      $$4.f = $$3 ? -0.8F : 0.8F;
      $$4.e = -0.97079635F;
      $$5.e = $$4.e;
      float $$6 = (float)ctb.l($$2.fx());
      float $$7 = ayy.a((float)$$2.fz(), 0.0F, $$6);
      float $$8 = $$7 / $$6;
      $$5.f = ayy.i($$8, 0.4F, 0.85F) * (float)($$3 ? 1 : -1);
      $$5.e = ayy.i($$8, $$5.e, (float) (-Math.PI / 2));
   }

   public static <T extends btq> void a(fwz $$0, fwz $$1, T $$2, float $$3, float $$4) {
      float $$5 = ayy.a($$3 * (float) Math.PI);
      float $$6 = ayy.a((1.0F - (1.0F - $$3) * (1.0F - $$3)) * (float) Math.PI);
      $$0.g = 0.0F;
      $$1.g = 0.0F;
      $$0.f = (float) (Math.PI / 20);
      $$1.f = (float) (-Math.PI / 20);
      if ($$2.fu() == bti.b) {
         $$0.e = -1.8849558F + ayy.b($$4 * 0.09F) * 0.15F;
         $$1.e = -0.0F + ayy.b($$4 * 0.19F) * 0.5F;
         $$0.e += $$5 * 2.2F - $$6 * 0.4F;
         $$1.e += $$5 * 1.2F - $$6 * 0.4F;
      } else {
         $$0.e = -0.0F + ayy.b($$4 * 0.19F) * 0.5F;
         $$1.e = -1.8849558F + ayy.b($$4 * 0.09F) * 0.15F;
         $$0.e += $$5 * 1.2F - $$6 * 0.4F;
         $$1.e += $$5 * 2.2F - $$6 * 0.4F;
      }

      a($$0, $$1, $$4);
   }

   public static void a(fwz $$0, float $$1, float $$2) {
      $$0.g = $$0.g + $$2 * (ayy.b($$1 * 0.09F) * 0.05F + 0.05F);
      $$0.e = $$0.e + $$2 * ayy.a($$1 * 0.067F) * 0.05F;
   }

   public static void a(fwz $$0, fwz $$1, float $$2) {
      a($$0, $$2, 1.0F);
      a($$1, $$2, -1.0F);
   }

   public static void a(fwz $$0, fwz $$1, boolean $$2, float $$3, float $$4) {
      float $$5 = ayy.a($$3 * (float) Math.PI);
      float $$6 = ayy.a((1.0F - (1.0F - $$3) * (1.0F - $$3)) * (float) Math.PI);
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
