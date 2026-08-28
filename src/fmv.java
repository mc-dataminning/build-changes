import java.util.List;

public class fmv implements fmy {
   private static final ale e = ale.b("toast/advancement");
   public static final int a = 5000;
   private final ag f;
   private boolean g;
   private fmy.a h = fmy.a.b;

   public fmv(ag $$0) {
      this.f = $$0;
   }

   @Override
   public fmy.a a() {
      return this.h;
   }

   @Override
   public void a(fmz $$0, long $$1) {
      as $$2 = this.f.b().c().orElse(null);
      if ($$2 == null) {
         this.h = fmy.a.b;
      } else {
         if (!this.g && $$1 > 0L) {
            this.g = true;
            if ($$2.e() == am.b) {
               $$0.c().ak().a(hav.a(awg.AD, 1.0F, 1.0F));
            }
         }

         this.h = (double)$$1 >= 5000.0 * $$0.d() ? fmy.a.b : fmy.a.a;
      }
   }

   @Override
   public void a(fkb $$0, fjz $$1, long $$2) {
      as $$3 = this.f.b().c().orElse(null);
      $$0.a(ghv::B, e, 0, 0, this.b(), this.c());
      if ($$3 != null) {
         List<ayr> $$4 = $$1.c($$3.a(), 125);
         int $$5 = $$3.e() == am.b ? -30465 : -256;
         if ($$4.size() == 1) {
            $$0.a($$1, $$3.e().b(), 30, 7, $$5, false);
            $$0.a($$1, $$4.get(0), 30, 18, -1, false);
         } else {
            int $$6 = 1500;
            float $$7 = 300.0F;
            if ($$2 < 1500L) {
               int $$8 = azf.d(azf.a((float)(1500L - $$2) / 300.0F, 0.0F, 1.0F) * 255.0F) << 24 | 67108864;
               $$0.a($$1, $$3.e().b(), 30, 11, $$5 | $$8, false);
            } else {
               int $$9 = azf.d(azf.a((float)($$2 - 1500L) / 300.0F, 0.0F, 1.0F) * 252.0F) << 24 | 67108864;
               int $$10 = this.c() / 2 - $$4.size() * 9 / 2;

               for (ayr $$11 : $$4) {
                  $$0.a($$1, $$11, 30, $$10, 16777215 | $$9, false);
                  $$10 += 9;
               }
            }
         }

         $$0.b($$3.c(), 8, 8);
      }
   }
}
