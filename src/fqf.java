import java.util.Arrays;

public class fqf<T extends bow> extends fol<T> {
   private final frd[] a = new frd[8];
   private final frd b;

   public fqf(frd $$0) {
      this.b = $$0;
      Arrays.setAll(this.a, $$1 -> $$0.b(a($$1)));
   }

   private static String a(int $$0) {
      return "tentacle" + $$0;
   }

   public static frj b() {
      frl $$0 = new frl();
      frm $$1 = $$0.a();
      frh $$2 = new frh(0.02F);
      int $$3 = -16;
      $$1.a("body", fri.c().a(0, 0).a(-6.0F, -8.0F, -6.0F, 12.0F, 16.0F, 12.0F, $$2), frf.a(0.0F, 8.0F, 0.0F));
      int $$4 = 8;
      fri $$5 = fri.c().a(48, 0).a(-1.0F, 0.0F, -1.0F, 2.0F, 18.0F, 2.0F);

      for (int $$6 = 0; $$6 < 8; $$6++) {
         double $$7 = (double)$$6 * Math.PI * 2.0 / 8.0;
         float $$8 = (float)Math.cos($$7) * 5.0F;
         float $$9 = 15.0F;
         float $$10 = (float)Math.sin($$7) * 5.0F;
         $$7 = (double)$$6 * Math.PI * -2.0 / 8.0 + (Math.PI / 2);
         float $$11 = (float)$$7;
         $$1.a(a($$6), $$5, frf.a($$8, 15.0F, $$10, 0.0F, $$11, 0.0F));
      }

      return frj.a($$0, 64, 32);
   }

   @Override
   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      for (frd $$6 : this.a) {
         $$6.e = $$3;
      }
   }

   @Override
   public frd a() {
      return this.b;
   }
}
