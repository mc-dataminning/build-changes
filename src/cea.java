import java.util.List;
import javax.annotation.Nullable;

public class cea extends cef {
   private int a;
   private final bxr b;
   @Nullable
   private crm c;
   private cdo d;

   public cea(bxr $$0) {
      this.b = $$0;
   }

   @Override
   public boolean b() {
      List<ctx> $$0 = this.b.dU().a(ctx.class, this.b.cQ().g(5.0));
      boolean $$1 = false;

      for (ctx $$2 : $$0) {
         bwi $$3 = $$2.cV();
         if ($$3 instanceof crm $$4 && (azm.e($$4.bg) > 0.0F || azm.e($$4.bi) > 0.0F)) {
            $$1 = true;
            break;
         }
      }

      return this.c != null && (azm.e(this.c.bg) > 0.0F || azm.e(this.c.bi) > 0.0F) || $$1;
   }

   @Override
   public boolean Q_() {
      return true;
   }

   @Override
   public boolean c() {
      return this.c != null && this.c.bX() && (azm.e(this.c.bg) > 0.0F || azm.e(this.c.bi) > 0.0F);
   }

   @Override
   public void d() {
      for (ctx $$1 : this.b.dU().a(ctx.class, this.b.cQ().g(5.0))) {
         if ($$1.cV() instanceof crm $$2) {
            this.c = $$2;
            break;
         }
      }

      this.a = 0;
      this.d = cdo.a;
   }

   @Override
   public void e() {
      this.c = null;
   }

   @Override
   public void a() {
      boolean $$0 = azm.e(this.c.bg) > 0.0F || azm.e(this.c.bi) > 0.0F;
      float $$1 = this.d == cdo.b ? ($$0 ? 0.01F : 0.0F) : 0.015F;
      this.b.a($$1, new ffc((double)this.b.bg, (double)this.b.bh, (double)this.b.bi));
      this.b.a(bxn.a, this.b.dx());
      if (--this.a <= 0) {
         this.a = this.a(10);
         if (this.d == cdo.a) {
            iv $$2 = this.c.du().a(this.c.cN().g());
            $$2 = $$2.b(0, -1, 0);
            this.b.O().a((double)$$2.u(), (double)$$2.v(), (double)$$2.w(), 1.0);
            if (this.b.f(this.c) < 4.0F) {
               this.a = 0;
               this.d = cdo.b;
            }
         } else if (this.d == cdo.b) {
            jb $$3 = this.c.cO();
            iv $$4 = this.c.du().a($$3, 10);
            this.b.O().a((double)$$4.u(), (double)($$4.v() - 1), (double)$$4.w(), 1.0);
            if (this.b.f(this.c) > 12.0F) {
               this.a = 0;
               this.d = cdo.a;
            }
         }
      }
   }
}
