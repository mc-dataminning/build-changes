import java.util.List;
import javax.annotation.Nullable;

public class bzv extends caa {
   private int a;
   private final btl b;
   @Nullable
   private cml c;
   private bzj d;

   public bzv(btl $$0) {
      this.b = $$0;
   }

   @Override
   public boolean a() {
      List<coi> $$0 = this.b.dR().a(coi.class, this.b.cM().g(5.0));
      boolean $$1 = false;

      for (coi $$2 : $$0) {
         bsh $$3 = $$2.cS();
         if ($$3 instanceof cml && (ayg.e(((cml)$$3).bp) > 0.0F || ayg.e(((cml)$$3).br) > 0.0F)) {
            $$1 = true;
            break;
         }
      }

      return this.c != null && (ayg.e(this.c.bp) > 0.0F || ayg.e(this.c.br) > 0.0F) || $$1;
   }

   @Override
   public boolean Q_() {
      return true;
   }

   @Override
   public boolean b() {
      return this.c != null && this.c.bT() && (ayg.e(this.c.bp) > 0.0F || ayg.e(this.c.br) > 0.0F);
   }

   @Override
   public void c() {
      for (coi $$1 : this.b.dR().a(coi.class, this.b.cM().g(5.0))) {
         if ($$1.cS() instanceof cml $$2) {
            this.c = $$2;
            break;
         }
      }

      this.a = 0;
      this.d = bzj.a;
   }

   @Override
   public void d() {
      this.c = null;
   }

   @Override
   public void e() {
      boolean $$0 = ayg.e(this.c.bp) > 0.0F || ayg.e(this.c.br) > 0.0F;
      float $$1 = this.d == bzj.b ? ($$0 ? 0.01F : 0.0F) : 0.015F;
      this.b.a($$1, new ewh((double)this.b.bp, (double)this.b.bq, (double)this.b.br));
      this.b.a(bth.a, this.b.du());
      if (--this.a <= 0) {
         this.a = this.a(10);
         if (this.d == bzj.a) {
            ja $$2 = this.c.dr().a(this.c.cJ().g());
            $$2 = $$2.b(0, -1, 0);
            this.b.J().a((double)$$2.u(), (double)$$2.v(), (double)$$2.w(), 1.0);
            if (this.b.f(this.c) < 4.0F) {
               this.a = 0;
               this.d = bzj.b;
            }
         } else if (this.d == bzj.b) {
            jf $$3 = this.c.cK();
            ja $$4 = this.c.dr().a($$3, 10);
            this.b.J().a((double)$$4.u(), (double)($$4.v() - 1), (double)$$4.w(), 1.0);
            if (this.b.f(this.c) > 12.0F) {
               this.a = 0;
               this.d = bzj.a;
            }
         }
      }
   }
}
