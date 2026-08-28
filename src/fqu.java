import com.mojang.blaze3d.systems.RenderSystem;
import java.util.List;

public class fqu extends fim {
   private static final fit c = new fit(new alf("recipe_book/tab"), new alf("recipe_book/tab_selected"));
   private final ffp d;
   private static final float e = 15.0F;
   private float f;

   public fqu(ffp $$0) {
      super(0, 0, 35, 27, false);
      this.d = $$0;
      this.a(c);
   }

   public void a(ffh $$0) {
      feu $$1 = $$0.s.m();
      List<fqw> $$2 = $$1.a(this.d);
      if ($$0.s.cb instanceof crj) {
         for (fqw $$3 : $$2) {
            for (cyz<?> $$4 : $$3.a($$1.a((crj<?>)$$0.s.cb))) {
               if ($$1.d($$4)) {
                  this.f = 15.0F;
                  return;
               }
            }
         }
      }
   }

   @Override
   public void b(fgt $$0, int $$1, int $$2, float $$3) {
      if (this.a != null) {
         if (this.f > 0.0F) {
            float $$4 = 1.0F + 0.1F * (float)Math.sin((double)(this.f / 15.0F * (float) Math.PI));
            $$0.c().a();
            $$0.c().a((float)(this.C() + 8), (float)(this.D() + 12), 0.0F);
            $$0.c().b(1.0F, $$4, 1.0F);
            $$0.c().a((float)(-(this.C() + 8)), (float)(-(this.D() + 12)), 0.0F);
         }

         ffh $$5 = ffh.Q();
         RenderSystem.disableDepthTest();
         alf $$6 = this.a.a(true, this.b);
         int $$7 = this.C();
         if (this.b) {
            $$7 -= 2;
         }

         $$0.a($$6, $$7, this.D(), this.g, this.h);
         RenderSystem.enableDepthTest();
         this.a($$0, $$5.ar());
         if (this.f > 0.0F) {
            $$0.c().b();
            this.f -= $$3;
         }
      }
   }

   private void a(fgt $$0, gjx $$1) {
      List<cur> $$2 = this.d.a();
      int $$3 = this.b ? -2 : 0;
      if ($$2.size() == 1) {
         $$0.b($$2.get(0), this.C() + 9 + $$3, this.D() + 5);
      } else if ($$2.size() == 2) {
         $$0.b($$2.get(0), this.C() + 3 + $$3, this.D() + 5);
         $$0.b($$2.get(1), this.C() + 14 + $$3, this.D() + 5);
      }
   }

   public ffp b() {
      return this.d;
   }

   public boolean a(feu $$0) {
      List<fqw> $$1 = $$0.a(this.d);
      this.k = false;
      if ($$1 != null) {
         for (fqw $$2 : $$1) {
            if ($$2.b() && $$2.d()) {
               this.k = true;
               break;
            }
         }
      }

      return this.k;
   }
}
