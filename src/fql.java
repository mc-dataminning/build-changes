import java.util.List;

public class fql implements fqo {
   private static final alz e = alz.b("toast/advancement");
   public static final int a = 5000;
   private final ah f;
   private boolean g;
   private fqo.a h = fqo.a.b;

   public fql(ah $$0) {
      this.f = $$0;
   }

   @Override
   public fqo.a a() {
      return this.h;
   }

   @Override
   public void a(fqp $$0, long $$1) {
      at $$2 = this.f.b().c().orElse(null);
      if ($$2 == null) {
         this.h = fqo.a.b;
      } else {
         if (!this.g && $$1 > 0L) {
            this.g = true;
            if ($$2.e() == an.b) {
               $$0.c().ak().a(hfb.a(axf.AW, 1.0F, 1.0F));
            }
         }

         this.h = (double)$$1 >= 5000.0 * $$0.d() ? fqo.a.b : fqo.a.a;
      }
   }

   @Override
   public void a(fnq $$0, fno $$1, long $$2) {
      at $$3 = this.f.b().c().orElse(null);
      $$0.a(glt::B, e, 0, 0, this.b(), this.c());
      if ($$3 != null) {
         List<azq> $$4 = $$1.c($$3.a(), 125);
         int $$5 = $$3.e() == an.b ? -30465 : -256;
         if ($$4.size() == 1) {
            $$0.a($$1, $$3.e().b(), 30, 7, $$5, false);
            $$0.a($$1, $$4.get(0), 30, 18, -1, false);
         } else {
            int $$6 = 1500;
            float $$7 = 300.0F;
            if ($$2 < 1500L) {
               int $$8 = bae.d(bae.a((float)(1500L - $$2) / 300.0F, 0.0F, 1.0F) * 255.0F) << 24 | 67108864;
               $$0.a($$1, $$3.e().b(), 30, 11, $$5 | $$8, false);
            } else {
               int $$9 = bae.d(bae.a((float)($$2 - 1500L) / 300.0F, 0.0F, 1.0F) * 252.0F) << 24 | 67108864;
               int $$10 = this.c() / 2 - $$4.size() * 9 / 2;

               for (azq $$11 : $$4) {
                  $$0.a($$1, $$11, 30, $$10, 16777215 | $$9, false);
                  $$10 += 9;
               }
            }
         }

         $$0.b($$3.c(), 8, 8);
      }
   }
}
