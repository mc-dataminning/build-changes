import java.util.List;
import javax.annotation.Nullable;

public class cbx extends ccc {
   private int a;
   private final bvm b;
   @Nullable
   private cor c;
   private cbl d;

   public cbx(bvm $$0) {
      this.b = $$0;
   }

   @Override
   public boolean b() {
      List<cqq> $$0 = this.b.dY().a(cqq.class, this.b.cT().g(5.0));
      boolean $$1 = false;

      for (cqq $$2 : $$0) {
         bui $$3 = $$2.cZ();
         if ($$3 instanceof cor && (azn.e(((cor)$$3).bo) > 0.0F || azn.e(((cor)$$3).bq) > 0.0F)) {
            $$1 = true;
            break;
         }
      }

      return this.c != null && (azn.e(this.c.bo) > 0.0F || azn.e(this.c.bq) > 0.0F) || $$1;
   }

   @Override
   public boolean U_() {
      return true;
   }

   @Override
   public boolean c() {
      return this.c != null && this.c.cb() && (azn.e(this.c.bo) > 0.0F || azn.e(this.c.bq) > 0.0F);
   }

   @Override
   public void d() {
      for (cqq $$1 : this.b.dY().a(cqq.class, this.b.cT().g(5.0))) {
         if ($$1.cZ() instanceof cor $$2) {
            this.c = $$2;
            break;
         }
      }

      this.a = 0;
      this.d = cbl.a;
   }

   @Override
   public void e() {
      this.c = null;
   }

   @Override
   public void a() {
      boolean $$0 = azn.e(this.c.bo) > 0.0F || azn.e(this.c.bq) > 0.0F;
      float $$1 = this.d == cbl.b ? ($$0 ? 0.01F : 0.0F) : 0.015F;
      this.b.a($$1, new ezr((double)this.b.bo, (double)this.b.bp, (double)this.b.bq));
      this.b.a(bvi.a, this.b.dB());
      if (--this.a <= 0) {
         this.a = this.a(10);
         if (this.d == cbl.a) {
            jh $$2 = this.c.dy().a(this.c.cQ().g());
            $$2 = $$2.b(0, -1, 0);
            this.b.P().a((double)$$2.u(), (double)$$2.v(), (double)$$2.w(), 1.0);
            if (this.b.f(this.c) < 4.0F) {
               this.a = 0;
               this.d = cbl.b;
            }
         } else if (this.d == cbl.b) {
            jm $$3 = this.c.cR();
            jh $$4 = this.c.dy().a($$3, 10);
            this.b.P().a((double)$$4.u(), (double)($$4.v() - 1), (double)$$4.w(), 1.0);
            if (this.b.f(this.c) > 12.0F) {
               this.a = 0;
               this.d = cbl.a;
            }
         }
      }
   }
}
