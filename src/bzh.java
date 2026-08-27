import java.util.EnumSet;
import javax.annotation.Nullable;

public class bzh extends byb {
   private static final int a = 10;
   private final brm b;
   private final int c;
   @Nullable
   private im d;

   public bzh(brm $$0, int $$1) {
      this.b = $$0;
      this.c = b($$1);
      this.a(EnumSet.of(byb.a.a));
   }

   @Override
   public boolean a() {
      if (this.b.cP()) {
         return false;
      } else if (this.b.dN().Q()) {
         return false;
      } else if (this.b.ej().a(this.c) != 0) {
         return false;
      } else {
         aqe $$0 = (aqe)this.b.dN();
         im $$1 = this.b.dn();
         if (!$$0.a($$1, 6)) {
            return false;
         } else {
            etf $$2 = ccb.a(this.b, 15, 7, $$1x -> (double)(-$$0.b(jo.a($$1x))));
            this.d = $$2 == null ? null : im.a($$2);
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
         cap $$0 = this.b.K();
         if ($$0.l() && !this.d.a(this.b.dl(), 10.0)) {
            etf $$1 = etf.c(this.d);
            etf $$2 = this.b.dl();
            etf $$3 = $$2.d($$1);
            $$1 = $$3.a(0.4).e($$1);
            etf $$4 = $$1.d($$2).d().a(10.0).e($$2);
            im $$5 = im.a($$4);
            $$5 = this.b.dN().a(dvq.a.f, $$5);
            if (!$$0.a((double)$$5.u(), (double)$$5.v(), (double)$$5.w(), 1.0)) {
               this.h();
            }
         }
      }
   }

   private void h() {
      ayd $$0 = this.b.ej();
      im $$1 = this.b.dN().a(dvq.a.f, this.b.dn().b(-8 + $$0.a(16), 0, -8 + $$0.a(16)));
      this.b.K().a((double)$$1.u(), (double)$$1.v(), (double)$$1.w(), 1.0);
   }
}
