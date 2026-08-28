import com.mojang.blaze3d.systems.RenderSystem;
import java.util.List;

public class fri extends fja {
   private static final fjh c = new fjh(new akk("recipe_book/tab"), new akk("recipe_book/tab_selected"));
   private final fge d;
   private static final float e = 15.0F;
   private float f;

   public fri(fge $$0) {
      super(0, 0, 35, 27, false);
      this.d = $$0;
      this.a(c);
   }

   public void a(ffw $$0) {
      ffi $$1 = $$0.s.m();
      List<frk> $$2 = $$1.a(this.d);
      if ($$0.s.ce instanceof cqw) {
         for (frk $$3 : $$2) {
            for (cyl<?> $$4 : $$3.a($$1.a((cqw<?, ?>)$$0.s.ce))) {
               if ($$1.d($$4)) {
                  this.f = 15.0F;
                  return;
               }
            }
         }
      }
   }

   @Override
   public void b(fhh $$0, int $$1, int $$2, float $$3) {
      if (this.a != null) {
         if (this.f > 0.0F) {
            float $$4 = 1.0F + 0.1F * (float)Math.sin((double)(this.f / 15.0F * (float) Math.PI));
            $$0.c().a();
            $$0.c().a((float)(this.D() + 8), (float)(this.E() + 12), 0.0F);
            $$0.c().b(1.0F, $$4, 1.0F);
            $$0.c().a((float)(-(this.D() + 8)), (float)(-(this.E() + 12)), 0.0F);
         }

         ffw $$5 = ffw.Q();
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

   private void a(fhh $$0, gkm $$1) {
      List<cud> $$2 = this.d.a();
      int $$3 = this.b ? -2 : 0;
      if ($$2.size() == 1) {
         $$0.b($$2.get(0), this.D() + 9 + $$3, this.E() + 5);
      } else if ($$2.size() == 2) {
         $$0.b($$2.get(0), this.D() + 3 + $$3, this.E() + 5);
         $$0.b($$2.get(1), this.D() + 14 + $$3, this.E() + 5);
      }
   }

   public fge b() {
      return this.d;
   }

   public boolean a(ffi $$0) {
      List<frk> $$1 = $$0.a(this.d);
      this.k = false;
      if ($$1 != null) {
         for (frk $$2 : $$1) {
            if ($$2.b() && $$2.d()) {
               this.k = true;
               break;
            }
         }
      }

      return this.k;
   }
}
