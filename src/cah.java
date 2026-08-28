import java.util.List;
import javax.annotation.Nullable;

public class cah extends cam {
   private int a;
   private final btw b;
   @Nullable
   private cmx c;
   private bzv d;

   public cah(btw $$0) {
      this.b = $$0;
   }

   @Override
   public boolean b() {
      List<cov> $$0 = this.b.dP().a(cov.class, this.b.cL().g(5.0));
      boolean $$1 = false;

      for (cov $$2 : $$0) {
         bsr $$3 = $$2.cR();
         if ($$3 instanceof cmx && (ayo.e(((cmx)$$3).bo) > 0.0F || ayo.e(((cmx)$$3).bq) > 0.0F)) {
            $$1 = true;
            break;
         }
      }

      return this.c != null && (ayo.e(this.c.bo) > 0.0F || ayo.e(this.c.bq) > 0.0F) || $$1;
   }

   @Override
   public boolean U_() {
      return true;
   }

   @Override
   public boolean c() {
      return this.c != null && this.c.bS() && (ayo.e(this.c.bo) > 0.0F || ayo.e(this.c.bq) > 0.0F);
   }

   @Override
   public void d() {
      for (cov $$1 : this.b.dP().a(cov.class, this.b.cL().g(5.0))) {
         if ($$1.cR() instanceof cmx $$2) {
            this.c = $$2;
            break;
         }
      }

      this.a = 0;
      this.d = bzv.a;
   }

   @Override
   public void e() {
      this.c = null;
   }

   @Override
   public void a() {
      boolean $$0 = ayo.e(this.c.bo) > 0.0F || ayo.e(this.c.bq) > 0.0F;
      float $$1 = this.d == bzv.b ? ($$0 ? 0.01F : 0.0F) : 0.015F;
      this.b.a($$1, new exa((double)this.b.bo, (double)this.b.bp, (double)this.b.bq));
      this.b.a(bts.a, this.b.ds());
      if (--this.a <= 0) {
         this.a = this.a(10);
         if (this.d == bzv.a) {
            jd $$2 = this.c.dp().a(this.c.cI().g());
            $$2 = $$2.b(0, -1, 0);
            this.b.N().a((double)$$2.u(), (double)$$2.v(), (double)$$2.w(), 1.0);
            if (this.b.f(this.c) < 4.0F) {
               this.a = 0;
               this.d = bzv.b;
            }
         } else if (this.d == bzv.b) {
            ji $$3 = this.c.cJ();
            jd $$4 = this.c.dp().a($$3, 10);
            this.b.N().a((double)$$4.u(), (double)($$4.v() - 1), (double)$$4.w(), 1.0);
            if (this.b.f(this.c) > 12.0F) {
               this.a = 0;
               this.d = bzv.a;
            }
         }
      }
   }
}
