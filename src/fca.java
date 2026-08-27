import com.mojang.blaze3d.systems.RenderSystem;
import java.util.List;

public class fca extends etx {
   private static final eue c = new eue(new aey("recipe_book/tab"), new aey("recipe_book/tab_selected"));
   private final erg d;
   private static final float e = 15.0F;
   private float l;

   public fca(erg $$0) {
      super(0, 0, 35, 27, false);
      this.d = $$0;
      this.a(c);
   }

   public void a(eqx $$0) {
      eqk $$1 = $$0.s.m();
      List<fcc> $$2 = $$1.a(this.d);
      if ($$0.s.bS instanceof cfx) {
         for (fcc $$3 : $$2) {
            for (cmm<?> $$4 : $$3.a($$1.a((cfx<?>)$$0.s.bS))) {
               if ($$1.d($$4)) {
                  this.l = 15.0F;
                  return;
               }
            }
         }
      }
   }

   @Override
   public void b(esh $$0, int $$1, int $$2, float $$3) {
      if (this.a != null) {
         if (this.l > 0.0F) {
            float $$4 = 1.0F + 0.1F * (float)Math.sin((double)(this.l / 15.0F * (float) Math.PI));
            $$0.c().a();
            $$0.c().a((float)(this.r() + 8), (float)(this.t() + 12), 0.0F);
            $$0.c().b(1.0F, $$4, 1.0F);
            $$0.c().a((float)(-(this.r() + 8)), (float)(-(this.t() + 12)), 0.0F);
         }

         eqx $$5 = eqx.O();
         RenderSystem.disableDepthTest();
         aey $$6 = this.a.a(true, this.b);
         int $$7 = this.r();
         if (this.b) {
            $$7 -= 2;
         }

         $$0.a($$6, $$7, this.t(), this.f, this.g);
         RenderSystem.enableDepthTest();
         this.a($$0, $$5.aq());
         if (this.l > 0.0F) {
            $$0.c().b();
            this.l -= $$3;
         }
      }
   }

   private void a(esh $$0, fuh $$1) {
      List<cjh> $$2 = this.d.a();
      int $$3 = this.b ? -2 : 0;
      if ($$2.size() == 1) {
         $$0.b($$2.get(0), this.r() + 9 + $$3, this.t() + 5);
      } else if ($$2.size() == 2) {
         $$0.b($$2.get(0), this.r() + 3 + $$3, this.t() + 5);
         $$0.b($$2.get(1), this.r() + 14 + $$3, this.t() + 5);
      }
   }

   public erg b() {
      return this.d;
   }

   public boolean a(eqk $$0) {
      List<fcc> $$1 = $$0.a(this.d);
      this.j = false;
      if ($$1 != null) {
         for (fcc $$2 : $$1) {
            if ($$2.b() && $$2.d()) {
               this.j = true;
               break;
            }
         }
      }

      return this.j;
   }
}
