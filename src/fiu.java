import com.mojang.blaze3d.systems.RenderSystem;
import java.util.List;

public class fiu extends fan {
   private static final fau c = new fau(new aiy("recipe_book/tab"), new aiy("recipe_book/tab_selected"));
   private final exq d;
   private static final float e = 15.0F;
   private float f;

   public fiu(exq $$0) {
      super(0, 0, 35, 27, false);
      this.d = $$0;
      this.a(c);
   }

   public void a(exh $$0) {
      ewu $$1 = $$0.s.m();
      List<fiw> $$2 = $$1.a(this.d);
      if ($$0.s.bW instanceof clo) {
         for (fiw $$3 : $$2) {
            for (csd<?> $$4 : $$3.a($$1.a((clo<?>)$$0.s.bW))) {
               if ($$1.d($$4)) {
                  this.f = 15.0F;
                  return;
               }
            }
         }
      }
   }

   @Override
   public void b(eyu $$0, int $$1, int $$2, float $$3) {
      if (this.a != null) {
         if (this.f > 0.0F) {
            float $$4 = 1.0F + 0.1F * (float)Math.sin((double)(this.f / 15.0F * (float) Math.PI));
            $$0.c().a();
            $$0.c().a((float)(this.B() + 8), (float)(this.C() + 12), 0.0F);
            $$0.c().b(1.0F, $$4, 1.0F);
            $$0.c().a((float)(-(this.B() + 8)), (float)(-(this.C() + 12)), 0.0F);
         }

         exh $$5 = exh.O();
         RenderSystem.disableDepthTest();
         aiy $$6 = this.a.a(true, this.b);
         int $$7 = this.B();
         if (this.b) {
            $$7 -= 2;
         }

         $$0.a($$6, $$7, this.C(), this.g, this.h);
         RenderSystem.enableDepthTest();
         this.a($$0, $$5.aq());
         if (this.f > 0.0F) {
            $$0.c().b();
            this.f -= $$3;
         }
      }
   }

   private void a(eyu $$0, gbr $$1) {
      List<coz> $$2 = this.d.a();
      int $$3 = this.b ? -2 : 0;
      if ($$2.size() == 1) {
         $$0.b($$2.get(0), this.B() + 9 + $$3, this.C() + 5);
      } else if ($$2.size() == 2) {
         $$0.b($$2.get(0), this.B() + 3 + $$3, this.C() + 5);
         $$0.b($$2.get(1), this.B() + 14 + $$3, this.C() + 5);
      }
   }

   public exq b() {
      return this.d;
   }

   public boolean a(ewu $$0) {
      List<fiw> $$1 = $$0.a(this.d);
      this.k = false;
      if ($$1 != null) {
         for (fiw $$2 : $$1) {
            if ($$2.b() && $$2.d()) {
               this.k = true;
               break;
            }
         }
      }

      return this.k;
   }
}
