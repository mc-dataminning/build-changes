import java.util.List;

public class fhk implements fhn {
   private static final akh d = new akh("toast/advancement");
   public static final int a = 5000;
   private final af e;
   private boolean f;

   public fhk(af $$0) {
      this.e = $$0;
   }

   @Override
   public fhn.a a(fer $$0, fho $$1, long $$2) {
      ar $$3 = this.e.b().c().orElse(null);
      $$0.a(d, 0, 0, this.a(), this.b());
      if ($$3 != null) {
         List<axl> $$4 = $$1.b().h.c($$3.a(), 125);
         int $$5 = $$3.e() == al.b ? 16746751 : 16776960;
         if ($$4.size() == 1) {
            $$0.a($$1.b().h, $$3.e().b(), 30, 7, $$5 | 0xFF000000, false);
            $$0.a($$1.b().h, $$4.get(0), 30, 18, -1, false);
         } else {
            int $$6 = 1500;
            float $$7 = 300.0F;
            if ($$2 < 1500L) {
               int $$8 = axz.d(axz.a((float)(1500L - $$2) / 300.0F, 0.0F, 1.0F) * 255.0F) << 24 | 67108864;
               $$0.a($$1.b().h, $$3.e().b(), 30, 11, $$5 | $$8, false);
            } else {
               int $$9 = axz.d(axz.a((float)($$2 - 1500L) / 300.0F, 0.0F, 1.0F) * 252.0F) << 24 | 67108864;
               int $$10 = this.b() / 2 - $$4.size() * 9 / 2;

               for (axl $$11 : $$4) {
                  $$0.a($$1.b().h, $$11, 30, $$10, 16777215 | $$9, false);
                  $$10 += 9;
               }
            }
         }

         if (!this.f && $$2 > 0L) {
            this.f = true;
            if ($$3.e() == al.b) {
               $$1.b().ak().a(gqh.a(avc.Aj, 1.0F, 1.0F));
            }
         }

         $$0.b($$3.c(), 8, 8);
         return (double)$$2 >= 5000.0 * $$1.c() ? fhn.a.b : fhn.a.a;
      } else {
         return fhn.a.b;
      }
   }
}
