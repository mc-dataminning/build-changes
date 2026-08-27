import java.util.List;

public class euk implements eun {
   private static final aer d = new aer("toast/advancement");
   public static final int a = 5000;
   private final ae e;
   private boolean f;

   public euk(ae $$0) {
      this.e = $$0;
   }

   @Override
   public eun.a a(erw $$0, euo $$1, long $$2) {
      an $$3 = this.e.d();
      $$0.a(d, 0, 0, this.a(), this.b());
      if ($$3 != null) {
         List<arc> $$4 = $$1.b().h.c($$3.a(), 125);
         int $$5 = $$3.e() == ao.b ? 16746751 : 16776960;
         if ($$4.size() == 1) {
            $$0.a($$1.b().h, $$3.e().c(), 30, 7, $$5 | 0xFF000000, false);
            $$0.a($$1.b().h, $$4.get(0), 30, 18, -1, false);
         } else {
            int $$6 = 1500;
            float $$7 = 300.0F;
            if ($$2 < 1500L) {
               int $$8 = arp.d(arp.a((float)(1500L - $$2) / 300.0F, 0.0F, 1.0F) * 255.0F) << 24 | 67108864;
               $$0.a($$1.b().h, $$3.e().c(), 30, 11, $$5 | $$8, false);
            } else {
               int $$9 = arp.d(arp.a((float)($$2 - 1500L) / 300.0F, 0.0F, 1.0F) * 252.0F) << 24 | 67108864;
               int $$10 = this.b() / 2 - $$4.size() * 9 / 2;

               for (arc $$11 : $$4) {
                  $$0.a($$1.b().h, $$11, 30, $$10, 16777215 | $$9, false);
                  $$10 += 9;
               }
            }
         }

         if (!this.f && $$2 > 0L) {
            this.f = true;
            if ($$3.e() == ao.b) {
               $$1.b().ai().a(gbo.a(aow.yv, 1.0F, 1.0F));
            }
         }

         $$0.b($$3.c(), 8, 8);
         return (double)$$2 >= 5000.0 * $$1.c() ? eun.a.b : eun.a.a;
      } else {
         return eun.a.b;
      }
   }
}
