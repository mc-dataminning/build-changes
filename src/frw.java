import com.mojang.blaze3d.systems.RenderSystem;
import java.util.List;

public class frw extends fjm {
   private static final fjt c = new fjt(akq.b("recipe_book/tab"), akq.b("recipe_book/tab_selected"));
   private final fgq d;
   private static final float e = 15.0F;
   private float f;

   public frw(fgq $$0) {
      super(0, 0, 35, 27, false);
      this.d = $$0;
      this.a(c);
   }

   public void a(fgi $$0) {
      ffu $$1 = $$0.s.m();
      List<fry> $$2 = $$1.a(this.d);
      if ($$0.s.cd instanceof crg) {
         for (fry $$3 : $$2) {
            for (cyz<?> $$4 : $$3.a($$1.a((crg<?, ?>)$$0.s.cd))) {
               if ($$1.d($$4)) {
                  this.f = 15.0F;
                  return;
               }
            }
         }
      }
   }

   @Override
   public void b(fht $$0, int $$1, int $$2, float $$3) {
      if (this.a != null) {
         if (this.f > 0.0F) {
            float $$4 = 1.0F + 0.1F * (float)Math.sin((double)(this.f / 15.0F * (float) Math.PI));
            $$0.c().a();
            $$0.c().a((float)(this.D() + 8), (float)(this.E() + 12), 0.0F);
            $$0.c().b(1.0F, $$4, 1.0F);
            $$0.c().a((float)(-(this.D() + 8)), (float)(-(this.E() + 12)), 0.0F);
         }

         fgi $$5 = fgi.Q();
         RenderSystem.disableDepthTest();
         akq $$6 = this.a.a(true, this.b);
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

   private void a(fht $$0, glb $$1) {
      List<cuo> $$2 = this.d.a();
      int $$3 = this.b ? -2 : 0;
      if ($$2.size() == 1) {
         $$0.b($$2.get(0), this.D() + 9 + $$3, this.E() + 5);
      } else if ($$2.size() == 2) {
         $$0.b($$2.get(0), this.D() + 3 + $$3, this.E() + 5);
         $$0.b($$2.get(1), this.D() + 14 + $$3, this.E() + 5);
      }
   }

   public fgq b() {
      return this.d;
   }

   public boolean a(ffu $$0) {
      List<fry> $$1 = $$0.a(this.d);
      this.k = false;
      if ($$1 != null) {
         for (fry $$2 : $$1) {
            if ($$2.b() && $$2.d()) {
               this.k = true;
               break;
            }
         }
      }

      return this.k;
   }
}
