import com.mojang.blaze3d.systems.RenderSystem;
import java.util.List;

public class fkv extends fcm {
   private static final fct c = new fct(new ajh("recipe_book/tab"), new ajh("recipe_book/tab_selected"));
   private final ezp d;
   private static final float e = 15.0F;
   private float f;

   public fkv(ezp $$0) {
      super(0, 0, 35, 27, false);
      this.d = $$0;
      this.a(c);
   }

   public void a(ezg $$0) {
      eyt $$1 = $$0.s.m();
      List<fkx> $$2 = $$1.a(this.d);
      if ($$0.s.bZ instanceof cnb) {
         for (fkx $$3 : $$2) {
            for (ctp<?> $$4 : $$3.a($$1.a((cnb<?>)$$0.s.bZ))) {
               if ($$1.d($$4)) {
                  this.f = 15.0F;
                  return;
               }
            }
         }
      }
   }

   @Override
   public void b(fat $$0, int $$1, int $$2, float $$3) {
      if (this.a != null) {
         if (this.f > 0.0F) {
            float $$4 = 1.0F + 0.1F * (float)Math.sin((double)(this.f / 15.0F * (float) Math.PI));
            $$0.c().a();
            $$0.c().a((float)(this.B() + 8), (float)(this.C() + 12), 0.0F);
            $$0.c().b(1.0F, $$4, 1.0F);
            $$0.c().a((float)(-(this.B() + 8)), (float)(-(this.C() + 12)), 0.0F);
         }

         ezg $$5 = ezg.Q();
         RenderSystem.disableDepthTest();
         ajh $$6 = this.a.a(true, this.b);
         int $$7 = this.B();
         if (this.b) {
            $$7 -= 2;
         }

         $$0.a($$6, $$7, this.C(), this.g, this.h);
         RenderSystem.enableDepthTest();
         this.a($$0, $$5.as());
         if (this.f > 0.0F) {
            $$0.c().b();
            this.f -= $$3;
         }
      }
   }

   private void a(fat $$0, gdw $$1) {
      List<cqk> $$2 = this.d.a();
      int $$3 = this.b ? -2 : 0;
      if ($$2.size() == 1) {
         $$0.b($$2.get(0), this.B() + 9 + $$3, this.C() + 5);
      } else if ($$2.size() == 2) {
         $$0.b($$2.get(0), this.B() + 3 + $$3, this.C() + 5);
         $$0.b($$2.get(1), this.B() + 14 + $$3, this.C() + 5);
      }
   }

   public ezp b() {
      return this.d;
   }

   public boolean a(eyt $$0) {
      List<fkx> $$1 = $$0.a(this.d);
      this.k = false;
      if ($$1 != null) {
         for (fkx $$2 : $$1) {
            if ($$2.b() && $$2.d()) {
               this.k = true;
               break;
            }
         }
      }

      return this.k;
   }
}
