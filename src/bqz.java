import java.util.List;
import javax.annotation.Nullable;

public class bqz extends bre {
   private int a;
   private final bks b;
   @Nullable
   private ccx c;
   private bqn d;

   public bqz(bks $$0) {
      this.b = $$0;
   }

   @Override
   public boolean a() {
      List<ceq> $$0 = this.b.dL().a(ceq.class, this.b.cG().g(5.0));
      boolean $$1 = false;

      for (ceq $$2 : $$0) {
         bjt $$3 = $$2.cN();
         if ($$3 instanceof ccx && (asy.e(((ccx)$$3).bk) > 0.0F || asy.e(((ccx)$$3).bm) > 0.0F)) {
            $$1 = true;
            break;
         }
      }

      return this.c != null && (asy.e(this.c.bk) > 0.0F || asy.e(this.c.bm) > 0.0F) || $$1;
   }

   @Override
   public boolean Q_() {
      return true;
   }

   @Override
   public boolean b() {
      return this.c != null && this.c.bN() && (asy.e(this.c.bk) > 0.0F || asy.e(this.c.bm) > 0.0F);
   }

   @Override
   public void c() {
      for (ceq $$1 : this.b.dL().a(ceq.class, this.b.cG().g(5.0))) {
         if ($$1.cN() instanceof ccx $$2) {
            this.c = $$2;
            break;
         }
      }

      this.a = 0;
      this.d = bqn.a;
   }

   @Override
   public void d() {
      this.c = null;
   }

   @Override
   public void e() {
      boolean $$0 = asy.e(this.c.bk) > 0.0F || asy.e(this.c.bm) > 0.0F;
      float $$1 = this.d == bqn.b ? ($$0 ? 0.01F : 0.0F) : 0.015F;
      this.b.a($$1, new eif((double)this.b.bk, (double)this.b.bl, (double)this.b.bm));
      this.b.a(bkp.a, this.b.do());
      if (--this.a <= 0) {
         this.a = this.a(10);
         if (this.d == bqn.a) {
            ht $$2 = this.c.dl().a(this.c.cD().g());
            $$2 = $$2.b(0, -1, 0);
            this.b.L().a((double)$$2.u(), (double)$$2.v(), (double)$$2.w(), 1.0);
            if (this.b.e((bjt)this.c) < 4.0F) {
               this.a = 0;
               this.d = bqn.b;
            }
         } else if (this.d == bqn.b) {
            hx $$3 = this.c.cE();
            ht $$4 = this.c.dl().a($$3, 10);
            this.b.L().a((double)$$4.u(), (double)($$4.v() - 1), (double)$$4.w(), 1.0);
            if (this.b.e((bjt)this.c) > 12.0F) {
               this.a = 0;
               this.d = bqn.a;
            }
         }
      }
   }
}
