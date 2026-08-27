import java.util.List;

public class ezj implements ezm {
   private static final ahg d = new ahg("toast/advancement");
   public static final int a = 5000;
   private final af e;
   private boolean f;

   public ezj(af $$0) {
      this.e = $$0;
   }

   @Override
   public ezm.a a(ews $$0, ezn $$1, long $$2) {
      ar $$3 = this.e.b().c().orElse(null);
      $$0.a(d, 0, 0, this.a(), this.b());
      if ($$3 != null) {
         List<atz> $$4 = $$1.b().h.c($$3.a(), 125);
         int $$5 = $$3.e() == al.b ? 16746751 : 16776960;
         if ($$4.size() == 1) {
            $$0.a($$1.b().h, $$3.e().b(), 30, 7, $$5 | 0xFF000000, false);
            $$0.a($$1.b().h, $$4.get(0), 30, 18, -1, false);
         } else {
            int $$6 = 1500;
            float $$7 = 300.0F;
            if ($$2 < 1500L) {
               int $$8 = aun.d(aun.a((float)(1500L - $$2) / 300.0F, 0.0F, 1.0F) * 255.0F) << 24 | 67108864;
               $$0.a($$1.b().h, $$3.e().b(), 30, 11, $$5 | $$8, false);
            } else {
               int $$9 = aun.d(aun.a((float)($$2 - 1500L) / 300.0F, 0.0F, 1.0F) * 252.0F) << 24 | 67108864;
               int $$10 = this.b() / 2 - $$4.size() * 9 / 2;

               for (atz $$11 : $$4) {
                  $$0.a($$1.b().h, $$11, 30, $$10, 16777215 | $$9, false);
                  $$10 += 9;
               }
            }
         }

         if (!this.f && $$2 > 0L) {
            this.f = true;
            if ($$3.e() == al.b) {
               $$1.b().ai().a(ght.a(arr.zA, 1.0F, 1.0F));
            }
         }

         $$0.b($$3.c(), 8, 8);
         return (double)$$2 >= 5000.0 * $$1.c() ? ezm.a.b : ezm.a.a;
      } else {
         return ezm.a.b;
      }
   }
}
