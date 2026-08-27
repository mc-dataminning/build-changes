import java.util.EnumSet;
import javax.annotation.Nullable;

public class bxr extends bwl {
   private static final int a = 10;
   private final bpw b;
   private final int c;
   @Nullable
   private ib d;

   public bxr(bpw $$0, int $$1) {
      this.b = $$0;
      this.c = b($$1);
      this.a(EnumSet.of(bwl.a.a));
   }

   @Override
   public boolean a() {
      if (this.b.cO()) {
         return false;
      } else if (this.b.dM().P()) {
         return false;
      } else if (this.b.ei().a(this.c) != 0) {
         return false;
      } else {
         apf $$0 = (apf)this.b.dM();
         ib $$1 = this.b.dm();
         if (!$$0.a($$1, 6)) {
            return false;
         } else {
            epr $$2 = cal.a(this.b, 15, 7, $$1x -> (double)(-$$0.b(je.a($$1x))));
            this.d = $$2 == null ? null : ib.a($$2);
            return this.d != null;
         }
      }
   }

   @Override
   public boolean b() {
      return this.d != null && !this.b.K().l() && this.b.K().h().equals(this.d);
   }

   @Override
   public void e() {
      if (this.d != null) {
         byz $$0 = this.b.K();
         if ($$0.l() && !this.d.a(this.b.dk(), 10.0)) {
            epr $$1 = epr.c(this.d);
            epr $$2 = this.b.dk();
            epr $$3 = $$2.d($$1);
            $$1 = $$3.a(0.4).e($$1);
            epr $$4 = $$1.d($$2).d().a(10.0).e($$2);
            ib $$5 = ib.a($$4);
            $$5 = this.b.dM().a(dsm.a.f, $$5);
            if (!$$0.a((double)$$5.u(), (double)$$5.v(), (double)$$5.w(), 1.0)) {
               this.h();
            }
         }
      }
   }

   private void h() {
      axd $$0 = this.b.ei();
      ib $$1 = this.b.dM().a(dsm.a.f, this.b.dm().b(-8 + $$0.a(16), 0, -8 + $$0.a(16)));
      this.b.K().a((double)$$1.u(), (double)$$1.v(), (double)$$1.w(), 1.0);
   }
}
