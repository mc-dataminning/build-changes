import java.util.List;

public class fng implements fnj {
   private static final alh e = alh.b("toast/advancement");
   public static final int a = 5000;
   private final ag f;
   private boolean g;
   private fnj.a h = fnj.a.b;

   public fng(ag $$0) {
      this.f = $$0;
   }

   @Override
   public fnj.a a() {
      return this.h;
   }

   @Override
   public void a(fnk $$0, long $$1) {
      as $$2 = this.f.b().c().orElse(null);
      if ($$2 == null) {
         this.h = fnj.a.b;
      } else {
         if (!this.g && $$1 > 0L) {
            this.g = true;
            if ($$2.e() == am.b) {
               $$0.c().ak().a(hbk.a(awk.AB, 1.0F, 1.0F));
            }
         }

         this.h = (double)$$1 >= 5000.0 * $$0.d() ? fnj.a.b : fnj.a.a;
      }
   }

   @Override
   public void a(fkm $$0, fkk $$1, long $$2) {
      as $$3 = this.f.b().c().orElse(null);
      $$0.a(gig::B, e, 0, 0, this.b(), this.c());
      if ($$3 != null) {
         List<ayv> $$4 = $$1.c($$3.a(), 125);
         int $$5 = $$3.e() == am.b ? -30465 : -256;
         if ($$4.size() == 1) {
            $$0.a($$1, $$3.e().b(), 30, 7, $$5, false);
            $$0.a($$1, $$4.get(0), 30, 18, -1, false);
         } else {
            int $$6 = 1500;
            float $$7 = 300.0F;
            if ($$2 < 1500L) {
               int $$8 = azj.d(azj.a((float)(1500L - $$2) / 300.0F, 0.0F, 1.0F) * 255.0F) << 24 | 67108864;
               $$0.a($$1, $$3.e().b(), 30, 11, $$5 | $$8, false);
            } else {
               int $$9 = azj.d(azj.a((float)($$2 - 1500L) / 300.0F, 0.0F, 1.0F) * 252.0F) << 24 | 67108864;
               int $$10 = this.c() / 2 - $$4.size() * 9 / 2;

               for (ayv $$11 : $$4) {
                  $$0.a($$1, $$11, 30, $$10, 16777215 | $$9, false);
                  $$10 += 9;
               }
            }
         }

         $$0.b($$3.c(), 8, 8);
      }
   }
}
