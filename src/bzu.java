import java.util.List;
import javax.annotation.Nullable;

public class bzu extends bzz {
   private int a;
   private final btk b;
   @Nullable
   private cmk c;
   private bzi d;

   public bzu(btk $$0) {
      this.b = $$0;
   }

   @Override
   public boolean a() {
      List<coh> $$0 = this.b.dQ().a(coh.class, this.b.cL().g(5.0));
      boolean $$1 = false;

      for (coh $$2 : $$0) {
         bsg $$3 = $$2.cR();
         if ($$3 instanceof cmk && (ayg.e(((cmk)$$3).bo) > 0.0F || ayg.e(((cmk)$$3).bq) > 0.0F)) {
            $$1 = true;
            break;
         }
      }

      return this.c != null && (ayg.e(this.c.bo) > 0.0F || ayg.e(this.c.bq) > 0.0F) || $$1;
   }

   @Override
   public boolean Q_() {
      return true;
   }

   @Override
   public boolean b() {
      return this.c != null && this.c.bS() && (ayg.e(this.c.bo) > 0.0F || ayg.e(this.c.bq) > 0.0F);
   }

   @Override
   public void c() {
      for (coh $$1 : this.b.dQ().a(coh.class, this.b.cL().g(5.0))) {
         if ($$1.cR() instanceof cmk $$2) {
            this.c = $$2;
            break;
         }
      }

      this.a = 0;
      this.d = bzi.a;
   }

   @Override
   public void d() {
      this.c = null;
   }

   @Override
   public void e() {
      boolean $$0 = ayg.e(this.c.bo) > 0.0F || ayg.e(this.c.bq) > 0.0F;
      float $$1 = this.d == bzi.b ? ($$0 ? 0.01F : 0.0F) : 0.015F;
      this.b.a($$1, new ewf((double)this.b.bo, (double)this.b.bp, (double)this.b.bq));
      this.b.a(btg.a, this.b.dt());
      if (--this.a <= 0) {
         this.a = this.a(10);
         if (this.d == bzi.a) {
            ja $$2 = this.c.dq().a(this.c.cI().g());
            $$2 = $$2.b(0, -1, 0);
            this.b.K().a((double)$$2.u(), (double)$$2.v(), (double)$$2.w(), 1.0);
            if (this.b.f(this.c) < 4.0F) {
               this.a = 0;
               this.d = bzi.b;
            }
         } else if (this.d == bzi.b) {
            jf $$3 = this.c.cJ();
            ja $$4 = this.c.dq().a($$3, 10);
            this.b.K().a((double)$$4.u(), (double)($$4.v() - 1), (double)$$4.w(), 1.0);
            if (this.b.f(this.c) > 12.0F) {
               this.a = 0;
               this.d = bzi.a;
            }
         }
      }
   }
}
