import java.util.List;
import javax.annotation.Nullable;

public class bxw extends byb {
   private int a;
   private final brm b;
   @Nullable
   private ckl c;
   private bxk d;

   public bxw(brm $$0) {
      this.b = $$0;
   }

   @Override
   public boolean a() {
      List<cmi> $$0 = this.b.dN().a(cmi.class, this.b.cI().g(5.0));
      boolean $$1 = false;

      for (cmi $$2 : $$0) {
         bql $$3 = $$2.cO();
         if ($$3 instanceof ckl && (axw.e(((ckl)$$3).bp) > 0.0F || axw.e(((ckl)$$3).br) > 0.0F)) {
            $$1 = true;
            break;
         }
      }

      return this.c != null && (axw.e(this.c.bp) > 0.0F || axw.e(this.c.br) > 0.0F) || $$1;
   }

   @Override
   public boolean Q_() {
      return true;
   }

   @Override
   public boolean b() {
      return this.c != null && this.c.bP() && (axw.e(this.c.bp) > 0.0F || axw.e(this.c.br) > 0.0F);
   }

   @Override
   public void c() {
      for (cmi $$1 : this.b.dN().a(cmi.class, this.b.cI().g(5.0))) {
         if ($$1.cO() instanceof ckl $$2) {
            this.c = $$2;
            break;
         }
      }

      this.a = 0;
      this.d = bxk.a;
   }

   @Override
   public void d() {
      this.c = null;
   }

   @Override
   public void e() {
      boolean $$0 = axw.e(this.c.bp) > 0.0F || axw.e(this.c.br) > 0.0F;
      float $$1 = this.d == bxk.b ? ($$0 ? 0.01F : 0.0F) : 0.015F;
      this.b.a($$1, new etf((double)this.b.bp, (double)this.b.bq, (double)this.b.br));
      this.b.a(brj.a, this.b.dq());
      if (--this.a <= 0) {
         this.a = this.a(10);
         if (this.d == bxk.a) {
            im $$2 = this.c.dn().a(this.c.cF().g());
            $$2 = $$2.b(0, -1, 0);
            this.b.K().a((double)$$2.u(), (double)$$2.v(), (double)$$2.w(), 1.0);
            if (this.b.f(this.c) < 4.0F) {
               this.a = 0;
               this.d = bxk.b;
            }
         } else if (this.d == bxk.b) {
            ir $$3 = this.c.cG();
            im $$4 = this.c.dn().a($$3, 10);
            this.b.K().a((double)$$4.u(), (double)($$4.v() - 1), (double)$$4.w(), 1.0);
            if (this.b.f(this.c) > 12.0F) {
               this.a = 0;
               this.d = bxk.a;
            }
         }
      }
   }
}
