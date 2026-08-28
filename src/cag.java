import java.util.List;
import javax.annotation.Nullable;

public class cag extends cal {
   private int a;
   private final btw b;
   @Nullable
   private cmv c;
   private bzu d;

   public cag(btw $$0) {
      this.b = $$0;
   }

   @Override
   public boolean a() {
      List<cot> $$0 = this.b.dP().a(cot.class, this.b.cK().g(5.0));
      boolean $$1 = false;

      for (cot $$2 : $$0) {
         bss $$3 = $$2.cQ();
         if ($$3 instanceof cmv && (ayx.e(((cmv)$$3).bo) > 0.0F || ayx.e(((cmv)$$3).bq) > 0.0F)) {
            $$1 = true;
            break;
         }
      }

      return this.c != null && (ayx.e(this.c.bo) > 0.0F || ayx.e(this.c.bq) > 0.0F) || $$1;
   }

   @Override
   public boolean Q_() {
      return true;
   }

   @Override
   public boolean b() {
      return this.c != null && this.c.bR() && (ayx.e(this.c.bo) > 0.0F || ayx.e(this.c.bq) > 0.0F);
   }

   @Override
   public void c() {
      for (cot $$1 : this.b.dP().a(cot.class, this.b.cK().g(5.0))) {
         if ($$1.cQ() instanceof cmv $$2) {
            this.c = $$2;
            break;
         }
      }

      this.a = 0;
      this.d = bzu.a;
   }

   @Override
   public void d() {
      this.c = null;
   }

   @Override
   public void e() {
      boolean $$0 = ayx.e(this.c.bo) > 0.0F || ayx.e(this.c.bq) > 0.0F;
      float $$1 = this.d == bzu.b ? ($$0 ? 0.01F : 0.0F) : 0.015F;
      this.b.a($$1, new evp((double)this.b.bo, (double)this.b.bp, (double)this.b.bq));
      this.b.a(bts.a, this.b.ds());
      if (--this.a <= 0) {
         this.a = this.a(10);
         if (this.d == bzu.a) {
            iz $$2 = this.c.dp().a(this.c.cH().g());
            $$2 = $$2.b(0, -1, 0);
            this.b.K().a((double)$$2.u(), (double)$$2.v(), (double)$$2.w(), 1.0);
            if (this.b.f(this.c) < 4.0F) {
               this.a = 0;
               this.d = bzu.b;
            }
         } else if (this.d == bzu.b) {
            je $$3 = this.c.cI();
            iz $$4 = this.c.dp().a($$3, 10);
            this.b.K().a((double)$$4.u(), (double)($$4.v() - 1), (double)$$4.w(), 1.0);
            if (this.b.f(this.c) > 12.0F) {
               this.a = 0;
               this.d = bzu.a;
            }
         }
      }
   }
}
