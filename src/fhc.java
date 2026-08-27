import com.mojang.blaze3d.systems.RenderSystem;
import java.util.List;

public class fhc extends eyx {
   private static final eze c = new eze(new ahh("recipe_book/tab"), new ahh("recipe_book/tab_selected"));
   private final ewa d;
   private static final float e = 15.0F;
   private float f;

   public fhc(ewa $$0) {
      super(0, 0, 35, 27, false);
      this.d = $$0;
      this.a(c);
   }

   public void a(evr $$0) {
      eve $$1 = $$0.s.m();
      List<fhe> $$2 = $$1.a(this.d);
      if ($$0.s.bW instanceof cjw) {
         for (fhe $$3 : $$2) {
            for (cqm<?> $$4 : $$3.a($$1.a((cjw<?>)$$0.s.bW))) {
               if ($$1.d($$4)) {
                  this.f = 15.0F;
                  return;
               }
            }
         }
      }
   }

   @Override
   public void b(exe $$0, int $$1, int $$2, float $$3) {
      if (this.a != null) {
         if (this.f > 0.0F) {
            float $$4 = 1.0F + 0.1F * (float)Math.sin((double)(this.f / 15.0F * (float) Math.PI));
            $$0.c().a();
            $$0.c().a((float)(this.B() + 8), (float)(this.C() + 12), 0.0F);
            $$0.c().b(1.0F, $$4, 1.0F);
            $$0.c().a((float)(-(this.B() + 8)), (float)(-(this.C() + 12)), 0.0F);
         }

         evr $$5 = evr.O();
         RenderSystem.disableDepthTest();
         ahh $$6 = this.a.a(true, this.b);
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

   private void a(exe $$0, fzy $$1) {
      List<cng> $$2 = this.d.a();
      int $$3 = this.b ? -2 : 0;
      if ($$2.size() == 1) {
         $$0.b($$2.get(0), this.B() + 9 + $$3, this.C() + 5);
      } else if ($$2.size() == 2) {
         $$0.b($$2.get(0), this.B() + 3 + $$3, this.C() + 5);
         $$0.b($$2.get(1), this.B() + 14 + $$3, this.C() + 5);
      }
   }

   public ewa b() {
      return this.d;
   }

   public boolean a(eve $$0) {
      List<fhe> $$1 = $$0.a(this.d);
      this.k = false;
      if ($$1 != null) {
         for (fhe $$2 : $$1) {
            if ($$2.b() && $$2.d()) {
               this.k = true;
               break;
            }
         }
      }

      return this.k;
   }
}
