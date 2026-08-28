import com.mojang.blaze3d.systems.RenderSystem;
import java.util.List;

public class fqn extends fif {
   private static final fim c = new fim(new alb("recipe_book/tab"), new alb("recipe_book/tab_selected"));
   private final ffi d;
   private static final float e = 15.0F;
   private float f;

   public fqn(ffi $$0) {
      super(0, 0, 35, 27, false);
      this.d = $$0;
      this.a(c);
   }

   public void a(ffa $$0) {
      fen $$1 = $$0.s.m();
      List<fqp> $$2 = $$1.a(this.d);
      if ($$0.s.cb instanceof crc) {
         for (fqp $$3 : $$2) {
            for (cys<?> $$4 : $$3.a($$1.a((crc<?>)$$0.s.cb))) {
               if ($$1.d($$4)) {
                  this.f = 15.0F;
                  return;
               }
            }
         }
      }
   }

   @Override
   public void b(fgm $$0, int $$1, int $$2, float $$3) {
      if (this.a != null) {
         if (this.f > 0.0F) {
            float $$4 = 1.0F + 0.1F * (float)Math.sin((double)(this.f / 15.0F * (float) Math.PI));
            $$0.c().a();
            $$0.c().a((float)(this.C() + 8), (float)(this.D() + 12), 0.0F);
            $$0.c().b(1.0F, $$4, 1.0F);
            $$0.c().a((float)(-(this.C() + 8)), (float)(-(this.D() + 12)), 0.0F);
         }

         ffa $$5 = ffa.Q();
         RenderSystem.disableDepthTest();
         alb $$6 = this.a.a(true, this.b);
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

   private void a(fgm $$0, gjq $$1) {
      List<cuk> $$2 = this.d.a();
      int $$3 = this.b ? -2 : 0;
      if ($$2.size() == 1) {
         $$0.b($$2.get(0), this.C() + 9 + $$3, this.D() + 5);
      } else if ($$2.size() == 2) {
         $$0.b($$2.get(0), this.C() + 3 + $$3, this.D() + 5);
         $$0.b($$2.get(1), this.C() + 14 + $$3, this.D() + 5);
      }
   }

   public ffi b() {
      return this.d;
   }

   public boolean a(fen $$0) {
      List<fqp> $$1 = $$0.a(this.d);
      this.k = false;
      if ($$1 != null) {
         for (fqp $$2 : $$1) {
            if ($$2.b() && $$2.d()) {
               this.k = true;
               break;
            }
         }
      }

      return this.k;
   }
}
