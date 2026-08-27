import java.util.List;
import javax.annotation.Nullable;

public class bzh extends bzm {
   private int a;
   private final bsx b;
   @Nullable
   private clw c;
   private byv d;

   public bzh(bsx $$0) {
      this.b = $$0;
   }

   @Override
   public boolean a() {
      List<cnt> $$0 = this.b.dP().a(cnt.class, this.b.cK().g(5.0));
      boolean $$1 = false;

      for (cnt $$2 : $$0) {
         bru $$3 = $$2.cQ();
         if ($$3 instanceof clw && (ayd.e(((clw)$$3).bp) > 0.0F || ayd.e(((clw)$$3).br) > 0.0F)) {
            $$1 = true;
            break;
         }
      }

      return this.c != null && (ayd.e(this.c.bp) > 0.0F || ayd.e(this.c.br) > 0.0F) || $$1;
   }

   @Override
   public boolean Q_() {
      return true;
   }

   @Override
   public boolean b() {
      return this.c != null && this.c.bR() && (ayd.e(this.c.bp) > 0.0F || ayd.e(this.c.br) > 0.0F);
   }

   @Override
   public void c() {
      for (cnt $$1 : this.b.dP().a(cnt.class, this.b.cK().g(5.0))) {
         if ($$1.cQ() instanceof clw $$2) {
            this.c = $$2;
            break;
         }
      }

      this.a = 0;
      this.d = byv.a;
   }

   @Override
   public void d() {
      this.c = null;
   }

   @Override
   public void e() {
      boolean $$0 = ayd.e(this.c.bp) > 0.0F || ayd.e(this.c.br) > 0.0F;
      float $$1 = this.d == byv.b ? ($$0 ? 0.01F : 0.0F) : 0.015F;
      this.b.a($$1, new euk((double)this.b.bp, (double)this.b.bq, (double)this.b.br));
      this.b.a(bst.a, this.b.ds());
      if (--this.a <= 0) {
         this.a = this.a(10);
         if (this.d == byv.a) {
            io $$2 = this.c.dp().a(this.c.cH().g());
            $$2 = $$2.b(0, -1, 0);
            this.b.K().a((double)$$2.u(), (double)$$2.v(), (double)$$2.w(), 1.0);
            if (this.b.f(this.c) < 4.0F) {
               this.a = 0;
               this.d = byv.b;
            }
         } else if (this.d == byv.b) {
            it $$3 = this.c.cI();
            io $$4 = this.c.dp().a($$3, 10);
            this.b.K().a((double)$$4.u(), (double)($$4.v() - 1), (double)$$4.w(), 1.0);
            if (this.b.f(this.c) > 12.0F) {
               this.a = 0;
               this.d = byv.a;
            }
         }
      }
   }
}
