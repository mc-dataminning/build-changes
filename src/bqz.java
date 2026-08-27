import java.util.EnumSet;
import javax.annotation.Nullable;

public class bqz extends bpt {
   private static final int a = 10;
   private final bjh b;
   private final int c;
   @Nullable
   private gu d;

   public bqz(bjh $$0, int $$1) {
      this.b = $$0;
      this.c = b($$1);
      this.a(EnumSet.of(bpt.a.a));
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
         akk $$0 = (akk)this.b.dK();
         gu $$1 = this.b.dk();
         if (!$$0.a($$1, 6)) {
            return false;
         } else {
            ehd $$2 = btr.a(this.b, 15, 7, $$1x -> (double)(-$$0.b(hx.a($$1x))));
            this.d = $$2 == null ? null : gu.a($$2);
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
         bsh $$0 = this.b.H();
         if ($$0.l() && !this.d.a(this.b.di(), 10.0)) {
            ehd $$1 = ehd.c(this.d);
            ehd $$2 = this.b.di();
            ehd $$3 = $$2.d($$1);
            $$1 = $$3.a(0.4).e($$1);
            ehd $$4 = $$1.d($$2).d().a(10.0).e($$2);
            gu $$5 = gu.a($$4);
            $$5 = this.b.dK().a(dki.a.f, $$5);
            if (!$$0.a((double)$$5.u(), (double)$$5.v(), (double)$$5.w(), 1.0)) {
               this.h();
            }
         }
      }
   }

   private void h() {
      aru $$0 = this.b.ee();
      gu $$1 = this.b.dK().a(dki.a.f, this.b.dk().b(-8 + $$0.a(16), 0, -8 + $$0.a(16)));
      this.b.H().a((double)$$1.u(), (double)$$1.v(), (double)$$1.w(), 1.0);
   }
}
