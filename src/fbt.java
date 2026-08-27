import com.mojang.blaze3d.systems.RenderSystem;
import java.util.List;

public class fbt extends etq {
   private static final etx c = new etx(new aeu("recipe_book/tab"), new aeu("recipe_book/tab_selected"));
   private final eqz d;
   private static final float e = 15.0F;
   private float l;

   public fbt(eqz $$0) {
      super(0, 0, 35, 27, false);
      this.d = $$0;
      this.a(c);
   }

   public void a(eqq $$0) {
      eqd $$1 = $$0.s.m();
      List<fbv> $$2 = $$1.a(this.d);
      if ($$0.s.bQ instanceof cfq) {
         for (fbv $$3 : $$2) {
            for (cmf<?> $$4 : $$3.a($$1.a((cfq<?>)$$0.s.bQ))) {
               if ($$1.d($$4)) {
                  this.l = 15.0F;
                  return;
               }
            }
         }
      }
   }

   @Override
   public void b(esa $$0, int $$1, int $$2, float $$3) {
      if (this.a != null) {
         if (this.l > 0.0F) {
            float $$4 = 1.0F + 0.1F * (float)Math.sin((double)(this.l / 15.0F * (float) Math.PI));
            $$0.c().a();
            $$0.c().a((float)(this.r() + 8), (float)(this.t() + 12), 0.0F);
            $$0.c().b(1.0F, $$4, 1.0F);
            $$0.c().a((float)(-(this.r() + 8)), (float)(-(this.t() + 12)), 0.0F);
         }

         eqq $$5 = eqq.O();
         RenderSystem.disableDepthTest();
         aeu $$6 = this.a.a(true, this.b);
         int $$7 = this.r();
         if (this.b) {
            $$7 -= 2;
         }

         $$0.a($$6, $$7, this.t(), this.f, this.g);
         RenderSystem.enableDepthTest();
         this.a($$0, $$5.aq());
         if (this.l > 0.0F) {
            $$0.c().b();
            this.l -= $$3;
         }
      }
   }

   private void a(esa $$0, fua $$1) {
      List<cja> $$2 = this.d.a();
      int $$3 = this.b ? -2 : 0;
      if ($$2.size() == 1) {
         $$0.b($$2.get(0), this.r() + 9 + $$3, this.t() + 5);
      } else if ($$2.size() == 2) {
         $$0.b($$2.get(0), this.r() + 3 + $$3, this.t() + 5);
         $$0.b($$2.get(1), this.r() + 14 + $$3, this.t() + 5);
      }
   }

   public eqz b() {
      return this.d;
   }

   public boolean a(eqd $$0) {
      List<fbv> $$1 = $$0.a(this.d);
      this.j = false;
      if ($$1 != null) {
         for (fbv $$2 : $$1) {
            if ($$2.b() && $$2.d()) {
               this.j = true;
               break;
            }
         }
      }

      return this.j;
   }
}
