import java.util.EnumSet;
import javax.annotation.Nullable;

public class bqy extends bps {
   private static final int a = 10;
   private final bjf b;
   private final int c;
   @Nullable
   private gv d;

   public bqy(bjf $$0, int $$1) {
      this.b = $$0;
      this.c = b($$1);
      this.a(EnumSet.of(bps.a.a));
   }

   @Override
   public boolean a() {
      if (this.b.cO()) {
         return false;
      } else if (this.b.dK().N()) {
         return false;
      } else if (this.b.ee().a(this.c) != 0) {
         return false;
      } else {
         aki $$0 = (aki)this.b.dK();
         gv $$1 = this.b.dk();
         if (!$$0.a($$1, 6)) {
            return false;
         } else {
            ehf $$2 = btq.a(this.b, 15, 7, $$1x -> (double)(-$$0.b(hy.a($$1x))));
            this.d = $$2 == null ? null : gv.a($$2);
            return this.d != null;
         }
      }
   }

   @Override
   public boolean b() {
      return this.d != null && !this.b.H().l() && this.b.H().h().equals(this.d);
   }

   @Override
   public void e() {
      if (this.d != null) {
         bsg $$0 = this.b.H();
         if ($$0.l() && !this.d.a(this.b.di(), 10.0)) {
            ehf $$1 = ehf.c(this.d);
            ehf $$2 = this.b.di();
            ehf $$3 = $$2.d($$1);
            $$1 = $$3.a(0.4).e($$1);
            ehf $$4 = $$1.d($$2).d().a(10.0).e($$2);
            gv $$5 = gv.a($$4);
            $$5 = this.b.dK().a(dkh.a.f, $$5);
            if (!$$0.a((double)$$5.u(), (double)$$5.v(), (double)$$5.w(), 1.0)) {
               this.h();
            }
         }
      }
   }

   private void h() {
      art $$0 = this.b.ee();
      gv $$1 = this.b.dK().a(dkh.a.f, this.b.dk().b(-8 + $$0.a(16), 0, -8 + $$0.a(16)));
      this.b.H().a((double)$$1.u(), (double)$$1.v(), (double)$$1.w(), 1.0);
   }
}
