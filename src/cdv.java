import java.util.List;
import javax.annotation.Nullable;

public class cdv extends cea {
   private int a;
   private final bxm b;
   @Nullable
   private crc c;
   private cdj d;

   public cdv(bxm $$0) {
      this.b = $$0;
   }

   @Override
   public boolean b() {
      List<ctn> $$0 = this.b.dV().a(ctn.class, this.b.cR().g(5.0));
      boolean $$1 = false;

      for (ctn $$2 : $$0) {
         bwf $$3 = $$2.cW();
         if ($$3 instanceof crc $$4 && (azm.e($$4.bg) > 0.0F || azm.e($$4.bi) > 0.0F)) {
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
      return this.c != null && this.c.bZ() && (azm.e(this.c.bg) > 0.0F || azm.e(this.c.bi) > 0.0F);
   }

   @Override
   public void d() {
      for (ctn $$1 : this.b.dV().a(ctn.class, this.b.cR().g(5.0))) {
         if ($$1.cW() instanceof crc $$2) {
            this.c = $$2;
            break;
         }
      }

      this.a = 0;
      this.d = cdj.a;
   }

   @Override
   public void e() {
      this.c = null;
   }

   @Override
   public void a() {
      boolean $$0 = azm.e(this.c.bg) > 0.0F || azm.e(this.c.bi) > 0.0F;
      float $$1 = this.d == cdj.b ? ($$0 ? 0.01F : 0.0F) : 0.015F;
      this.b.a($$1, new feq((double)this.b.bg, (double)this.b.bh, (double)this.b.bi));
      this.b.a(bxi.a, this.b.dy());
      if (--this.a <= 0) {
         this.a = this.a(10);
         if (this.d == cdj.a) {
            iu $$2 = this.c.dv().a(this.c.cO().g());
            $$2 = $$2.b(0, -1, 0);
            this.b.O().a((double)$$2.u(), (double)$$2.v(), (double)$$2.w(), 1.0);
            if (this.b.f(this.c) < 4.0F) {
               this.a = 0;
               this.d = cdj.b;
            }
         } else if (this.d == cdj.b) {
            ja $$3 = this.c.cP();
            iu $$4 = this.c.dv().a($$3, 10);
            this.b.O().a((double)$$4.u(), (double)($$4.v() - 1), (double)$$4.w(), 1.0);
            if (this.b.f(this.c) > 12.0F) {
               this.a = 0;
               this.d = cdj.a;
            }
         }
      }
   }
}
