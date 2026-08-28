import java.util.List;

public class fqx implements fra {
   private static final aku e = aku.b("toast/advancement");
   public static final int a = 5000;
   private final ai f;
   private boolean g;
   private fra.a h = fra.a.b;

   public fqx(ai $$0) {
      this.f = $$0;
   }

   @Override
   public fra.a a() {
      return this.h;
   }

   @Override
   public void a(frb $$0, long $$1) {
      au $$2 = this.f.b().c().orElse(null);
      if ($$2 == null) {
         this.h = fra.a.b;
      } else {
         if (!this.g && $$1 > 0L) {
            this.g = true;
            if ($$2.e() == ao.b) {
               $$0.c().ak().a(hie.a(avz.Bl, 1.0F, 1.0F));
            }
         }

         this.h = (double)$$1 >= 5000.0 * $$0.d() ? fra.a.b : fra.a.a;
      }
   }

   @Override
   public void a(fob $$0, fnz $$1, long $$2) {
      au $$3 = this.f.b().c().orElse(null);
      $$0.a(gmf::H, e, 0, 0, this.b(), this.c());
      if ($$3 != null) {
         List<ayk> $$4 = $$1.c($$3.a(), 125);
         int $$5 = $$3.e() == ao.b ? -30465 : -256;
         if ($$4.size() == 1) {
            $$0.a($$1, $$3.e().b(), 30, 7, $$5, false);
            $$0.a($$1, $$4.get(0), 30, 18, -1, false);
         } else {
            int $$6 = 1500;
            float $$7 = 300.0F;
            if ($$2 < 1500L) {
               int $$8 = ayy.d(ayy.a((float)(1500L - $$2) / 300.0F, 0.0F, 1.0F) * 255.0F) << 24 | 67108864;
               $$0.a($$1, $$3.e().b(), 30, 11, $$5 | $$8, false);
            } else {
               int $$9 = ayy.d(ayy.a((float)($$2 - 1500L) / 300.0F, 0.0F, 1.0F) * 252.0F) << 24 | 67108864;
               int $$10 = this.c() / 2 - $$4.size() * 9 / 2;

               for (ayk $$11 : $$4) {
                  $$0.a($$1, $$11, 30, $$10, 16777215 | $$9, false);
                  $$10 += 9;
               }
            }
         }

         $$0.b($$3.c(), 8, 8);
      }
   }
}
