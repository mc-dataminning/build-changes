import java.util.List;

public class fra implements frd {
   private static final akv e = akv.b("toast/advancement");
   public static final int a = 5000;
   private final ai f;
   private boolean g;
   private frd.a h = frd.a.b;

   public fra(ai $$0) {
      this.f = $$0;
   }

   @Override
   public frd.a a() {
      return this.h;
   }

   @Override
   public void a(fre $$0, long $$1) {
      au $$2 = this.f.b().c().orElse(null);
      if ($$2 == null) {
         this.h = frd.a.b;
      } else {
         if (!this.g && $$1 > 0L) {
            this.g = true;
            if ($$2.e() == ao.b) {
               $$0.c().ak().a(hik.a(awa.Bl, 1.0F, 1.0F));
            }
         }

         this.h = (double)$$1 >= 5000.0 * $$0.d() ? frd.a.b : frd.a.a;
      }
   }

   @Override
   public void a(foe $$0, foc $$1, long $$2) {
      au $$3 = this.f.b().c().orElse(null);
      $$0.a(gmi::H, e, 0, 0, this.b(), this.c());
      if ($$3 != null) {
         List<ayl> $$4 = $$1.c($$3.a(), 125);
         int $$5 = $$3.e() == ao.b ? -30465 : -256;
         if ($$4.size() == 1) {
            $$0.a($$1, $$3.e().b(), 30, 7, $$5, false);
            $$0.a($$1, $$4.get(0), 30, 18, -1, false);
         } else {
            int $$6 = 1500;
            float $$7 = 300.0F;
            if ($$2 < 1500L) {
               int $$8 = ayz.d(ayz.a((float)(1500L - $$2) / 300.0F, 0.0F, 1.0F) * 255.0F) << 24 | 67108864;
               $$0.a($$1, $$3.e().b(), 30, 11, $$5 | $$8, false);
            } else {
               int $$9 = ayz.d(ayz.a((float)($$2 - 1500L) / 300.0F, 0.0F, 1.0F) * 252.0F) << 24 | 67108864;
               int $$10 = this.c() / 2 - $$4.size() * 9 / 2;

               for (ayl $$11 : $$4) {
                  $$0.a($$1, $$11, 30, $$10, 16777215 | $$9, false);
                  $$10 += 9;
               }
            }
         }

         $$0.b($$3.c(), 8, 8);
      }
   }
}
