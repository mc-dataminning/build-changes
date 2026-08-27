import java.util.List;
import javax.annotation.Nullable;

public class bzj extends bzo {
   private int a;
   private final bsz b;
   @Nullable
   private cly c;
   private byx d;

   public bzj(bsz $$0) {
      this.b = $$0;
   }

   @Override
   public boolean a() {
      List<cnv> $$0 = this.b.dP().a(cnv.class, this.b.cK().g(5.0));
      boolean $$1 = false;

      for (cnv $$2 : $$0) {
         brw $$3 = $$2.cQ();
         if ($$3 instanceof cly && (ayf.e(((cly)$$3).bo) > 0.0F || ayf.e(((cly)$$3).bq) > 0.0F)) {
            $$1 = true;
            break;
         }
      }

      return this.c != null && (ayf.e(this.c.bo) > 0.0F || ayf.e(this.c.bq) > 0.0F) || $$1;
   }

   @Override
   public boolean Q_() {
      return true;
   }

   @Override
   public boolean b() {
      return this.c != null && this.c.bR() && (ayf.e(this.c.bo) > 0.0F || ayf.e(this.c.bq) > 0.0F);
   }

   @Override
   public void c() {
      for (cnv $$1 : this.b.dP().a(cnv.class, this.b.cK().g(5.0))) {
         if ($$1.cQ() instanceof cly $$2) {
            this.c = $$2;
            break;
         }
      }

      this.a = 0;
      this.d = byx.a;
   }

   @Override
   public void d() {
      this.c = null;
   }

   @Override
   public void e() {
      boolean $$0 = ayf.e(this.c.bo) > 0.0F || ayf.e(this.c.bq) > 0.0F;
      float $$1 = this.d == byx.b ? ($$0 ? 0.01F : 0.0F) : 0.015F;
      this.b.a($$1, new eum((double)this.b.bo, (double)this.b.bp, (double)this.b.bq));
      this.b.a(bsv.a, this.b.ds());
      if (--this.a <= 0) {
         this.a = this.a(10);
         if (this.d == byx.a) {
            io $$2 = this.c.dp().a(this.c.cH().g());
            $$2 = $$2.b(0, -1, 0);
            this.b.K().a((double)$$2.u(), (double)$$2.v(), (double)$$2.w(), 1.0);
            if (this.b.f(this.c) < 4.0F) {
               this.a = 0;
               this.d = byx.b;
            }
         } else if (this.d == byx.b) {
            it $$3 = this.c.cI();
            io $$4 = this.c.dp().a($$3, 10);
            this.b.K().a((double)$$4.u(), (double)($$4.v() - 1), (double)$$4.w(), 1.0);
            if (this.b.f(this.c) > 12.0F) {
               this.a = 0;
               this.d = byx.a;
            }
         }
      }
   }
}
