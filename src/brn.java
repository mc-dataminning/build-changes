import java.util.EnumSet;
import javax.annotation.Nullable;

public class brn extends bqh {
   private static final int a = 10;
   private final bjv b;
   private final int c;
   @Nullable
   private gw d;

   public brn(bjv $$0, int $$1) {
      this.b = $$0;
      this.c = b($$1);
      this.a(EnumSet.of(bqh.a.a));
   }

   @Override
   public boolean a() {
      if (this.b.cO()) {
         return false;
      } else if (this.b.dL().N()) {
         return false;
      } else if (this.b.ef().a(this.c) != 0) {
         return false;
      } else {
         akt $$0 = (akt)this.b.dL();
         gw $$1 = this.b.dl();
         if (!$$0.a($$1, 6)) {
            return false;
         } else {
            ehh $$2 = buf.a(this.b, 15, 7, $$1x -> (double)(-$$0.b(hw.a($$1x))));
            this.d = $$2 == null ? null : gw.a($$2);
            return this.d != null;
         }
      }
   }

   @Override
   public boolean b() {
      return this.d != null && !this.b.L().l() && this.b.L().h().equals(this.d);
   }

   @Override
   public void e() {
      if (this.d != null) {
         bsv $$0 = this.b.L();
         if ($$0.l() && !this.d.a(this.b.dj(), 10.0)) {
            ehh $$1 = ehh.c(this.d);
            ehh $$2 = this.b.dj();
            ehh $$3 = $$2.d($$1);
            $$1 = $$3.a(0.4).e($$1);
            ehh $$4 = $$1.d($$2).d().a(10.0).e($$2);
            gw $$5 = gw.a($$4);
            $$5 = this.b.dL().a(dkm.a.f, $$5);
            if (!$$0.a((double)$$5.u(), (double)$$5.v(), (double)$$5.w(), 1.0)) {
               this.h();
            }
         }
      }
   }

   private void h() {
      ash $$0 = this.b.ef();
      gw $$1 = this.b.dL().a(dkm.a.f, this.b.dl().b(-8 + $$0.a(16), 0, -8 + $$0.a(16)));
      this.b.L().a((double)$$1.u(), (double)$$1.v(), (double)$$1.w(), 1.0);
   }
}
