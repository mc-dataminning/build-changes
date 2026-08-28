import com.mojang.blaze3d.systems.RenderSystem;
import java.util.List;

public class fra extends fis {
   private static final fiz c = new fiz(new akk("recipe_book/tab"), new akk("recipe_book/tab_selected"));
   private final ffv d;
   private static final float e = 15.0F;
   private float f;

   public fra(ffv $$0) {
      super(0, 0, 35, 27, false);
      this.d = $$0;
      this.a(c);
   }

   public void a(ffn $$0) {
      ffa $$1 = $$0.s.m();
      List<frc> $$2 = $$1.a(this.d);
      if ($$0.s.cd instanceof cqs) {
         for (frc $$3 : $$2) {
            for (cyi<?> $$4 : $$3.a($$1.a((cqs<?, ?>)$$0.s.cd))) {
               if ($$1.d($$4)) {
                  this.f = 15.0F;
                  return;
               }
            }
         }
      }
   }

   @Override
   public void b(fgz $$0, int $$1, int $$2, float $$3) {
      if (this.a != null) {
         if (this.f > 0.0F) {
            float $$4 = 1.0F + 0.1F * (float)Math.sin((double)(this.f / 15.0F * (float) Math.PI));
            $$0.c().a();
            $$0.c().a((float)(this.D() + 8), (float)(this.E() + 12), 0.0F);
            $$0.c().b(1.0F, $$4, 1.0F);
            $$0.c().a((float)(-(this.D() + 8)), (float)(-(this.E() + 12)), 0.0F);
         }

         ffn $$5 = ffn.Q();
         RenderSystem.disableDepthTest();
         akk $$6 = this.a.a(true, this.b);
         int $$7 = this.D();
         if (this.b) {
            $$7 -= 2;
         }

         $$0.a($$6, $$7, this.E(), this.g, this.h);
         RenderSystem.enableDepthTest();
         this.a($$0, $$5.ar());
         if (this.f > 0.0F) {
            $$0.c().b();
            this.f -= $$3;
         }
      }
   }

   private void a(fgz $$0, gke $$1) {
      List<cua> $$2 = this.d.a();
      int $$3 = this.b ? -2 : 0;
      if ($$2.size() == 1) {
         $$0.b($$2.get(0), this.D() + 9 + $$3, this.E() + 5);
      } else if ($$2.size() == 2) {
         $$0.b($$2.get(0), this.D() + 3 + $$3, this.E() + 5);
         $$0.b($$2.get(1), this.D() + 14 + $$3, this.E() + 5);
      }
   }

   public ffv b() {
      return this.d;
   }

   public boolean a(ffa $$0) {
      List<frc> $$1 = $$0.a(this.d);
      this.k = false;
      if ($$1 != null) {
         for (frc $$2 : $$1) {
            if ($$2.b() && $$2.d()) {
               this.k = true;
               break;
            }
         }
      }

      return this.k;
   }
}
