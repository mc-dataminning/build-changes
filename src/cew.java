import java.util.List;
import javax.annotation.Nullable;

public class cew extends cfb {
   private int a;
   private final byn b;
   @Nullable
   private csi c;
   private cek d;

   public cew(byn $$0) {
      this.b = $$0;
   }

   @Override
   public boolean b() {
      List<cut> $$0 = this.b.dV().a(cut.class, this.b.cR().g(5.0));
      boolean $$1 = false;

      for (cut $$2 : $$0) {
         bxe $$3 = $$2.cW();
         if ($$3 instanceof csi $$4 && (azz.e($$4.bg) > 0.0F || azz.e($$4.bi) > 0.0F)) {
            $$1 = true;
            break;
         }
      }

      return this.c != null && (azz.e(this.c.bg) > 0.0F || azz.e(this.c.bi) > 0.0F) || $$1;
   }

   @Override
   public boolean V_() {
      return true;
   }

   @Override
   public boolean c() {
      return this.c != null && this.c.bY() && (azz.e(this.c.bg) > 0.0F || azz.e(this.c.bi) > 0.0F);
   }

   @Override
   public void d() {
      for (cut $$1 : this.b.dV().a(cut.class, this.b.cR().g(5.0))) {
         if ($$1.cW() instanceof csi $$2) {
            this.c = $$2;
            break;
         }
      }

      this.a = 0;
      this.d = cek.a;
   }

   @Override
   public void e() {
      this.c = null;
   }

   @Override
   public void a() {
      boolean $$0 = azz.e(this.c.bg) > 0.0F || azz.e(this.c.bi) > 0.0F;
      float $$1 = this.d == cek.b ? ($$0 ? 0.01F : 0.0F) : 0.015F;
      this.b.a($$1, new fgc((double)this.b.bg, (double)this.b.bh, (double)this.b.bi));
      this.b.a(byj.a, this.b.dy());
      if (--this.a <= 0) {
         this.a = this.a(10);
         if (this.d == cek.a) {
            iw $$2 = this.c.dv().a(this.c.cO().g());
            $$2 = $$2.b(0, -1, 0);
            this.b.N().a((double)$$2.u(), (double)$$2.v(), (double)$$2.w(), 1.0);
            if (this.b.f(this.c) < 4.0F) {
               this.a = 0;
               this.d = cek.b;
            }
         } else if (this.d == cek.b) {
            jc $$3 = this.c.cP();
            iw $$4 = this.c.dv().a($$3, 10);
            this.b.N().a((double)$$4.u(), (double)($$4.v() - 1), (double)$$4.w(), 1.0);
            if (this.b.f(this.c) > 12.0F) {
               this.a = 0;
               this.d = cek.a;
            }
         }
      }
   }
}
