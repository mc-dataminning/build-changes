import java.util.List;
import javax.annotation.Nullable;

public class caj extends cao {
   private int a;
   private final btz b;
   @Nullable
   private cmy c;
   private bzx d;

   public caj(btz $$0) {
      this.b = $$0;
   }

   @Override
   public boolean a() {
      List<cow> $$0 = this.b.dP().a(cow.class, this.b.cK().g(5.0));
      boolean $$1 = false;

      for (cow $$2 : $$0) {
         bsv $$3 = $$2.cQ();
         if ($$3 instanceof cmy && (ayz.e(((cmy)$$3).bo) > 0.0F || ayz.e(((cmy)$$3).bq) > 0.0F)) {
            $$1 = true;
            break;
         }
      }

      return this.c != null && (ayz.e(this.c.bo) > 0.0F || ayz.e(this.c.bq) > 0.0F) || $$1;
   }

   @Override
   public boolean Q_() {
      return true;
   }

   @Override
   public boolean b() {
      return this.c != null && this.c.bR() && (ayz.e(this.c.bo) > 0.0F || ayz.e(this.c.bq) > 0.0F);
   }

   @Override
   public void c() {
      for (cow $$1 : this.b.dP().a(cow.class, this.b.cK().g(5.0))) {
         if ($$1.cQ() instanceof cmy $$2) {
            this.c = $$2;
            break;
         }
      }

      this.a = 0;
      this.d = bzx.a;
   }

   @Override
   public void d() {
      this.c = null;
   }

   @Override
   public void e() {
      boolean $$0 = ayz.e(this.c.bo) > 0.0F || ayz.e(this.c.bq) > 0.0F;
      float $$1 = this.d == bzx.b ? ($$0 ? 0.01F : 0.0F) : 0.015F;
      this.b.a($$1, new evs((double)this.b.bo, (double)this.b.bp, (double)this.b.bq));
      this.b.a(btv.a, this.b.ds());
      if (--this.a <= 0) {
         this.a = this.a(10);
         if (this.d == bzx.a) {
            iz $$2 = this.c.dp().a(this.c.cH().g());
            $$2 = $$2.b(0, -1, 0);
            this.b.K().a((double)$$2.u(), (double)$$2.v(), (double)$$2.w(), 1.0);
            if (this.b.f(this.c) < 4.0F) {
               this.a = 0;
               this.d = bzx.b;
            }
         } else if (this.d == bzx.b) {
            je $$3 = this.c.cI();
            iz $$4 = this.c.dp().a($$3, 10);
            this.b.K().a((double)$$4.u(), (double)($$4.v() - 1), (double)$$4.w(), 1.0);
            if (this.b.f(this.c) > 12.0F) {
               this.a = 0;
               this.d = bzx.a;
            }
         }
      }
   }
}
