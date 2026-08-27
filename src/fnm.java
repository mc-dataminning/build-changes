import com.mojang.blaze3d.systems.RenderSystem;
import java.util.List;

public class fnm extends ffe {
   private static final ffl c = new ffl(new ajv("recipe_book/tab"), new ajv("recipe_book/tab_selected"));
   private final fch d;
   private static final float e = 15.0F;
   private float f;

   public fnm(fch $$0) {
      super(0, 0, 35, 27, false);
      this.d = $$0;
      this.a(c);
   }

   public void a(fby $$0) {
      fbl $$1 = $$0.s.m();
      List<fno> $$2 = $$1.a(this.d);
      if ($$0.s.ca instanceof coj) {
         for (fno $$3 : $$2) {
            for (cvu<?> $$4 : $$3.a($$1.a((coj<?>)$$0.s.ca))) {
               if ($$1.d($$4)) {
                  this.f = 15.0F;
                  return;
               }
            }
         }
      }
   }

   @Override
   public void b(fdl $$0, int $$1, int $$2, float $$3) {
      if (this.a != null) {
         if (this.f > 0.0F) {
            float $$4 = 1.0F + 0.1F * (float)Math.sin((double)(this.f / 15.0F * (float) Math.PI));
            $$0.c().a();
            $$0.c().a((float)(this.C() + 8), (float)(this.D() + 12), 0.0F);
            $$0.c().b(1.0F, $$4, 1.0F);
            $$0.c().a((float)(-(this.C() + 8)), (float)(-(this.D() + 12)), 0.0F);
         }

         fby $$5 = fby.Q();
         RenderSystem.disableDepthTest();
         ajv $$6 = this.a.a(true, this.b);
         int $$7 = this.C();
         if (this.b) {
            $$7 -= 2;
         }

         $$0.a($$6, $$7, this.D(), this.g, this.h);
         RenderSystem.enableDepthTest();
         this.a($$0, $$5.as());
         if (this.f > 0.0F) {
            $$0.c().b();
            this.f -= $$3;
         }
      }
   }

   private void a(fdl $$0, ggp $$1) {
      List<crs> $$2 = this.d.a();
      int $$3 = this.b ? -2 : 0;
      if ($$2.size() == 1) {
         $$0.b($$2.get(0), this.C() + 9 + $$3, this.D() + 5);
      } else if ($$2.size() == 2) {
         $$0.b($$2.get(0), this.C() + 3 + $$3, this.D() + 5);
         $$0.b($$2.get(1), this.C() + 14 + $$3, this.D() + 5);
      }
   }

   public fch b() {
      return this.d;
   }

   public boolean a(fbl $$0) {
      List<fno> $$1 = $$0.a(this.d);
      this.k = false;
      if ($$1 != null) {
         for (fno $$2 : $$1) {
            if ($$2.b() && $$2.d()) {
               this.k = true;
               break;
            }
         }
      }

      return this.k;
   }
}
