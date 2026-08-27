import com.mojang.blaze3d.systems.RenderSystem;
import java.util.List;

public class fbj extends etm {
   private static final ett c = new ett(new aep("recipe_book/tab"), new aep("recipe_book/tab_selected"));
   private final eqw d;
   private static final float e = 15.0F;
   private float l;

   public fbj(eqw $$0) {
      super(0, 0, 35, 27, false);
      this.d = $$0;
      this.a(c);
   }

   public void a(eqn $$0) {
      eqa $$1 = $$0.t.m();
      List<fbl> $$2 = $$1.a(this.d);
      if ($$0.t.bQ instanceof cfm) {
         for (fbl $$3 : $$2) {
            for (clz<?> $$4 : $$3.a($$1.a((cfm<?>)$$0.t.bQ))) {
               if ($$1.d($$4)) {
                  this.l = 15.0F;
                  return;
               }
            }
         }
      }
   }

   @Override
   public void b(erx $$0, int $$1, int $$2, float $$3) {
      if (this.a != null) {
         if (this.l > 0.0F) {
            float $$4 = 1.0F + 0.1F * (float)Math.sin((double)(this.l / 15.0F * (float) Math.PI));
            $$0.c().a();
            $$0.c().a((float)(this.p() + 8), (float)(this.r() + 12), 0.0F);
            $$0.c().b(1.0F, $$4, 1.0F);
            $$0.c().a((float)(-(this.p() + 8)), (float)(-(this.r() + 12)), 0.0F);
         }

         eqn $$5 = eqn.N();
         RenderSystem.disableDepthTest();
         aep $$6 = this.a.a(true, this.b);
         int $$7 = this.p();
         if (this.b) {
            $$7 -= 2;
         }

         $$0.a($$6, $$7, this.r(), this.f, this.g);
         RenderSystem.enableDepthTest();
         this.a($$0, $$5.ap());
         if (this.l > 0.0F) {
            $$0.c().b();
            this.l -= $$3;
         }
      }
   }

   private void a(erx $$0, fth $$1) {
      List<ciw> $$2 = this.d.a();
      int $$3 = this.b ? -2 : 0;
      if ($$2.size() == 1) {
         $$0.b($$2.get(0), this.p() + 9 + $$3, this.r() + 5);
      } else if ($$2.size() == 2) {
         $$0.b($$2.get(0), this.p() + 3 + $$3, this.r() + 5);
         $$0.b($$2.get(1), this.p() + 14 + $$3, this.r() + 5);
      }
   }

   public eqw b() {
      return this.d;
   }

   public boolean a(eqa $$0) {
      List<fbl> $$1 = $$0.a(this.d);
      this.j = false;
      if ($$1 != null) {
         for (fbl $$2 : $$1) {
            if ($$2.b() && $$2.d()) {
               this.j = true;
               break;
            }
         }
      }

      return this.j;
   }
}
