import java.util.List;
import javax.annotation.Nullable;

public class bys extends byx {
   private int a;
   private final bsi b;
   @Nullable
   private clh c;
   private byg d;

   public bys(bsi $$0) {
      this.b = $$0;
   }

   @Override
   public boolean a() {
      List<cne> $$0 = this.b.dN().a(cne.class, this.b.cI().g(5.0));
      boolean $$1 = false;

      for (cne $$2 : $$0) {
         brh $$3 = $$2.cO();
         if ($$3 instanceof clh && (axz.e(((clh)$$3).bp) > 0.0F || axz.e(((clh)$$3).br) > 0.0F)) {
            $$1 = true;
            break;
         }
      }

      return this.c != null && (axz.e(this.c.bp) > 0.0F || axz.e(this.c.br) > 0.0F) || $$1;
   }

   @Override
   public boolean Q_() {
      return true;
   }

   @Override
   public boolean b() {
      return this.c != null && this.c.bP() && (axz.e(this.c.bp) > 0.0F || axz.e(this.c.br) > 0.0F);
   }

   @Override
   public void c() {
      for (cne $$1 : this.b.dN().a(cne.class, this.b.cI().g(5.0))) {
         if ($$1.cO() instanceof clh $$2) {
            this.c = $$2;
            break;
         }
      }

      this.a = 0;
      this.d = byg.a;
   }

   @Override
   public void d() {
      this.c = null;
   }

   @Override
   public void e() {
      boolean $$0 = axz.e(this.c.bp) > 0.0F || axz.e(this.c.br) > 0.0F;
      float $$1 = this.d == byg.b ? ($$0 ? 0.01F : 0.0F) : 0.015F;
      this.b.a($$1, new etp((double)this.b.bp, (double)this.b.bq, (double)this.b.br));
      this.b.a(bsf.a, this.b.dq());
      if (--this.a <= 0) {
         this.a = this.a(10);
         if (this.d == byg.a) {
            in $$2 = this.c.dn().a(this.c.cF().g());
            $$2 = $$2.b(0, -1, 0);
            this.b.K().a((double)$$2.u(), (double)$$2.v(), (double)$$2.w(), 1.0);
            if (this.b.f(this.c) < 4.0F) {
               this.a = 0;
               this.d = byg.b;
            }
         } else if (this.d == byg.b) {
            is $$3 = this.c.cG();
            in $$4 = this.c.dn().a($$3, 10);
            this.b.K().a((double)$$4.u(), (double)($$4.v() - 1), (double)$$4.w(), 1.0);
            if (this.b.f(this.c) > 12.0F) {
               this.a = 0;
               this.d = byg.a;
            }
         }
      }
   }
}
