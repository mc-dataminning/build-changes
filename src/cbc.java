import java.util.List;
import javax.annotation.Nullable;

public class cbc extends cbh {
   private int a;
   private final bus b;
   @Nullable
   private cnu c;
   private caq d;

   public cbc(bus $$0) {
      this.b = $$0;
   }

   @Override
   public boolean b() {
      List<cpu> $$0 = this.b.dS().a(cpu.class, this.b.cO().g(5.0));
      boolean $$1 = false;

      for (cpu $$2 : $$0) {
         bto $$3 = $$2.cU();
         if ($$3 instanceof cnu && (azd.e(((cnu)$$3).bk) > 0.0F || azd.e(((cnu)$$3).bm) > 0.0F)) {
            $$1 = true;
            break;
         }
      }

      return this.c != null && (azd.e(this.c.bk) > 0.0F || azd.e(this.c.bm) > 0.0F) || $$1;
   }

   @Override
   public boolean S_() {
      return true;
   }

   @Override
   public boolean c() {
      return this.c != null && this.c.bW() && (azd.e(this.c.bk) > 0.0F || azd.e(this.c.bm) > 0.0F);
   }

   @Override
   public void d() {
      for (cpu $$1 : this.b.dS().a(cpu.class, this.b.cO().g(5.0))) {
         if ($$1.cU() instanceof cnu $$2) {
            this.c = $$2;
            break;
         }
      }

      this.a = 0;
      this.d = caq.a;
   }

   @Override
   public void e() {
      this.c = null;
   }

   @Override
   public void a() {
      boolean $$0 = azd.e(this.c.bk) > 0.0F || azd.e(this.c.bm) > 0.0F;
      float $$1 = this.d == caq.b ? ($$0 ? 0.01F : 0.0F) : 0.015F;
      this.b.a($$1, new eys((double)this.b.bk, (double)this.b.bl, (double)this.b.bm));
      this.b.a(buo.a, this.b.dv());
      if (--this.a <= 0) {
         this.a = this.a(10);
         if (this.d == caq.a) {
            je $$2 = this.c.ds().a(this.c.cL().g());
            $$2 = $$2.b(0, -1, 0);
            this.b.P().a((double)$$2.u(), (double)$$2.v(), (double)$$2.w(), 1.0);
            if (this.b.f(this.c) < 4.0F) {
               this.a = 0;
               this.d = caq.b;
            }
         } else if (this.d == caq.b) {
            jj $$3 = this.c.cM();
            je $$4 = this.c.ds().a($$3, 10);
            this.b.P().a((double)$$4.u(), (double)($$4.v() - 1), (double)$$4.w(), 1.0);
            if (this.b.f(this.c) > 12.0F) {
               this.a = 0;
               this.d = caq.a;
            }
         }
      }
   }
}
