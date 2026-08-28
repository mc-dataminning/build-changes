import java.util.List;

public class fks implements fkv {
   private static final akr d = akr.b("toast/advancement");
   public static final int a = 5000;
   private final ag e;
   private boolean f;

   public fks(ag $$0) {
      this.e = $$0;
   }

   @Override
   public fkv.a a(fhz $$0, fkw $$1, long $$2) {
      as $$3 = this.e.b().c().orElse(null);
      $$0.a(d, 0, 0, this.a(), this.b());
      if ($$3 != null) {
         List<aya> $$4 = $$1.b().h.c($$3.a(), 125);
         int $$5 = $$3.e() == am.b ? 16746751 : 16776960;
         if ($$4.size() == 1) {
            $$0.a($$1.b().h, $$3.e().b(), 30, 7, $$5 | 0xFF000000, false);
            $$0.a($$1.b().h, $$4.get(0), 30, 18, -1, false);
         } else {
            int $$6 = 1500;
            float $$7 = 300.0F;
            if ($$2 < 1500L) {
               int $$8 = ayo.d(ayo.a((float)(1500L - $$2) / 300.0F, 0.0F, 1.0F) * 255.0F) << 24 | 67108864;
               $$0.a($$1.b().h, $$3.e().b(), 30, 11, $$5 | $$8, false);
            } else {
               int $$9 = ayo.d(ayo.a((float)($$2 - 1500L) / 300.0F, 0.0F, 1.0F) * 252.0F) << 24 | 67108864;
               int $$10 = this.b() / 2 - $$4.size() * 9 / 2;

               for (aya $$11 : $$4) {
                  $$0.a($$1.b().h, $$11, 30, $$10, 16777215 | $$9, false);
                  $$10 += 9;
               }
            }
         }

         if (!this.f && $$2 > 0L) {
            this.f = true;
            if ($$3.e() == am.b) {
               $$1.b().aj().a(gtv.a(avp.Ax, 1.0F, 1.0F));
            }
         }

         $$0.b($$3.c(), 8, 8);
         return (double)$$2 >= 5000.0 * $$1.c() ? fkv.a.b : fkv.a.a;
      } else {
         return fkv.a.b;
      }
   }
}
