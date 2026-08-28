import java.util.List;
import javax.annotation.Nullable;

public class cbo extends cbt {
   private int a;
   private final bvd b;
   @Nullable
   private coh c;
   private cbc d;

   public cbo(bvd $$0) {
      this.b = $$0;
   }

   @Override
   public boolean b() {
      List<cqh> $$0 = this.b.dX().a(cqh.class, this.b.cS().g(5.0));
      boolean $$1 = false;

      for (cqh $$2 : $$0) {
         btz $$3 = $$2.cY();
         if ($$3 instanceof coh && (azj.e(((coh)$$3).bl) > 0.0F || azj.e(((coh)$$3).bn) > 0.0F)) {
            $$1 = true;
            break;
         }
      }

      return this.c != null && (azj.e(this.c.bl) > 0.0F || azj.e(this.c.bn) > 0.0F) || $$1;
   }

   @Override
   public boolean U_() {
      return true;
   }

   @Override
   public boolean c() {
      return this.c != null && this.c.ca() && (azj.e(this.c.bl) > 0.0F || azj.e(this.c.bn) > 0.0F);
   }

   @Override
   public void d() {
      for (cqh $$1 : this.b.dX().a(cqh.class, this.b.cS().g(5.0))) {
         if ($$1.cY() instanceof coh $$2) {
            this.c = $$2;
            break;
         }
      }

      this.a = 0;
      this.d = cbc.a;
   }

   @Override
   public void e() {
      this.c = null;
   }

   @Override
   public void a() {
      boolean $$0 = azj.e(this.c.bl) > 0.0F || azj.e(this.c.bn) > 0.0F;
      float $$1 = this.d == cbc.b ? ($$0 ? 0.01F : 0.0F) : 0.015F;
      this.b.a($$1, new ezh((double)this.b.bl, (double)this.b.bm, (double)this.b.bn));
      this.b.a(buz.a, this.b.dA());
      if (--this.a <= 0) {
         this.a = this.a(10);
         if (this.d == cbc.a) {
            jg $$2 = this.c.dx().a(this.c.cP().g());
            $$2 = $$2.b(0, -1, 0);
            this.b.P().a((double)$$2.u(), (double)$$2.v(), (double)$$2.w(), 1.0);
            if (this.b.f(this.c) < 4.0F) {
               this.a = 0;
               this.d = cbc.b;
            }
         } else if (this.d == cbc.b) {
            jl $$3 = this.c.cQ();
            jg $$4 = this.c.dx().a($$3, 10);
            this.b.P().a((double)$$4.u(), (double)($$4.v() - 1), (double)$$4.w(), 1.0);
            if (this.b.f(this.c) > 12.0F) {
               this.a = 0;
               this.d = cbc.a;
            }
         }
      }
   }
}
