import com.mojang.blaze3d.systems.RenderSystem;
import java.util.List;

public class fby extends etv {
   private static final euc c = new euc(new aex("recipe_book/tab"), new aex("recipe_book/tab_selected"));
   private final ere d;
   private static final float e = 15.0F;
   private float l;

   public fby(ere $$0) {
      super(0, 0, 35, 27, false);
      this.d = $$0;
      this.a(c);
   }

   public void a(eqv $$0) {
      eqi $$1 = $$0.s.m();
      List<fca> $$2 = $$1.a(this.d);
      if ($$0.s.bS instanceof cfv) {
         for (fca $$3 : $$2) {
            for (cmk<?> $$4 : $$3.a($$1.a((cfv<?>)$$0.s.bS))) {
               if ($$1.d($$4)) {
                  this.l = 15.0F;
                  return;
               }
            }
         }
      }
   }

   @Override
   public void b(esf $$0, int $$1, int $$2, float $$3) {
      if (this.a != null) {
         if (this.l > 0.0F) {
            float $$4 = 1.0F + 0.1F * (float)Math.sin((double)(this.l / 15.0F * (float) Math.PI));
            $$0.c().a();
            $$0.c().a((float)(this.r() + 8), (float)(this.t() + 12), 0.0F);
            $$0.c().b(1.0F, $$4, 1.0F);
            $$0.c().a((float)(-(this.r() + 8)), (float)(-(this.t() + 12)), 0.0F);
         }

         eqv $$5 = eqv.O();
         RenderSystem.disableDepthTest();
         aex $$6 = this.a.a(true, this.b);
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

   private void a(esf $$0, fuf $$1) {
      List<cjf> $$2 = this.d.a();
      int $$3 = this.b ? -2 : 0;
      if ($$2.size() == 1) {
         $$0.b($$2.get(0), this.r() + 9 + $$3, this.t() + 5);
      } else if ($$2.size() == 2) {
         $$0.b($$2.get(0), this.r() + 3 + $$3, this.t() + 5);
         $$0.b($$2.get(1), this.r() + 14 + $$3, this.t() + 5);
      }
   }

   public ere b() {
      return this.d;
   }

   public boolean a(eqi $$0) {
      List<fca> $$1 = $$0.a(this.d);
      this.j = false;
      if ($$1 != null) {
         for (fca $$2 : $$1) {
            if ($$2.b() && $$2.d()) {
               this.j = true;
               break;
            }
         }
      }

      return this.j;
   }
}
