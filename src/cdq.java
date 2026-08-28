import java.util.List;
import javax.annotation.Nullable;

public class cdq extends cdv {
   private int a;
   private final bxh b;
   @Nullable
   private cqs c;
   private cde d;

   public cdq(bxh $$0) {
      this.b = $$0;
   }

   @Override
   public boolean b() {
      List<ctc> $$0 = this.b.dV().a(ctc.class, this.b.cR().g(5.0));
      boolean $$1 = false;

      for (ctc $$2 : $$0) {
         bwa $$3 = $$2.cW();
         if ($$3 instanceof cqs $$4 && (azk.e($$4.bg) > 0.0F || azk.e($$4.bi) > 0.0F)) {
            $$1 = true;
            break;
         }
      }

      return this.c != null && (azk.e(this.c.bg) > 0.0F || azk.e(this.c.bi) > 0.0F) || $$1;
   }

   @Override
   public boolean P_() {
      return true;
   }

   @Override
   public boolean c() {
      return this.c != null && this.c.bZ() && (azk.e(this.c.bg) > 0.0F || azk.e(this.c.bi) > 0.0F);
   }

   @Override
   public void d() {
      for (ctc $$1 : this.b.dV().a(ctc.class, this.b.cR().g(5.0))) {
         if ($$1.cW() instanceof cqs $$2) {
            this.c = $$2;
            break;
         }
      }

      this.a = 0;
      this.d = cde.a;
   }

   @Override
   public void e() {
      this.c = null;
   }

   @Override
   public void a() {
      boolean $$0 = azk.e(this.c.bg) > 0.0F || azk.e(this.c.bi) > 0.0F;
      float $$1 = this.d == cde.b ? ($$0 ? 0.01F : 0.0F) : 0.015F;
      this.b.a($$1, new fdw((double)this.b.bg, (double)this.b.bh, (double)this.b.bi));
      this.b.a(bxd.a, this.b.dy());
      if (--this.a <= 0) {
         this.a = this.a(10);
         if (this.d == cde.a) {
            iu $$2 = this.c.dv().a(this.c.cO().g());
            $$2 = $$2.b(0, -1, 0);
            this.b.O().a((double)$$2.u(), (double)$$2.v(), (double)$$2.w(), 1.0);
            if (this.b.f(this.c) < 4.0F) {
               this.a = 0;
               this.d = cde.b;
            }
         } else if (this.d == cde.b) {
            ja $$3 = this.c.cP();
            iu $$4 = this.c.dv().a($$3, 10);
            this.b.O().a((double)$$4.u(), (double)($$4.v() - 1), (double)$$4.w(), 1.0);
            if (this.b.f(this.c) > 12.0F) {
               this.a = 0;
               this.d = cde.a;
            }
         }
      }
   }
}
