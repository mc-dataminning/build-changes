import java.util.EnumSet;
import javax.annotation.Nullable;

public class cbr extends cal {
   private static final int a = 10;
   private final btw b;
   private final int c;
   @Nullable
   private iz d;

   public cbr(btw $$0, int $$1) {
      this.b = $$0;
      this.c = b($$1);
      this.a(EnumSet.of(cal.a.a));
   }

   @Override
   public boolean a() {
      if (this.b.cR()) {
         return false;
      } else if (this.b.dP().R()) {
         return false;
      } else if (this.b.el().a(this.c) != 0) {
         return false;
      } else {
         are $$0 = (are)this.b.dP();
         iz $$1 = this.b.dp();
         if (!$$0.a($$1, 6)) {
            return false;
         } else {
            evp $$2 = cel.a(this.b, 15, 7, $$1x -> (double)(-$$0.b(kb.a($$1x))));
            this.d = $$2 == null ? null : iz.a($$2);
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
         ccz $$0 = this.b.K();
         if ($$0.l() && !this.d.a(this.b.dn(), 10.0)) {
            evp $$1 = evp.c(this.d);
            evp $$2 = this.b.dn();
            evp $$3 = $$2.d($$1);
            $$1 = $$3.a(0.4).e($$1);
            evp $$4 = $$1.d($$2).d().a(10.0).e($$2);
            iz $$5 = iz.a($$4);
            $$5 = this.b.dP().a(dxs.a.f, $$5);
            if (!$$0.a((double)$$5.u(), (double)$$5.v(), (double)$$5.w(), 1.0)) {
               this.h();
            }
         }
      }
   }

   private void h() {
      azf $$0 = this.b.el();
      iz $$1 = this.b.dP().a(dxs.a.f, this.b.dp().b(-8 + $$0.a(16), 0, -8 + $$0.a(16)));
      this.b.K().a((double)$$1.u(), (double)$$1.v(), (double)$$1.w(), 1.0);
   }
}
