import java.util.EnumSet;
import javax.annotation.Nullable;

public class cad extends byx {
   private static final int a = 10;
   private final bsi b;
   private final int c;
   @Nullable
   private in d;

   public cad(bsi $$0, int $$1) {
      this.b = $$0;
      this.c = b($$1);
      this.a(EnumSet.of(byx.a.a));
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
         aqh $$0 = (aqh)this.b.dN();
         in $$1 = this.b.dn();
         if (!$$0.a($$1, 6)) {
            return false;
         } else {
            etp $$2 = ccx.a(this.b, 15, 7, $$1x -> (double)(-$$0.b(jp.a($$1x))));
            this.d = $$2 == null ? null : in.a($$2);
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
         cbl $$0 = this.b.K();
         if ($$0.l() && !this.d.a(this.b.dl(), 10.0)) {
            etp $$1 = etp.c(this.d);
            etp $$2 = this.b.dl();
            etp $$3 = $$2.d($$1);
            $$1 = $$3.a(0.4).e($$1);
            etp $$4 = $$1.d($$2).d().a(10.0).e($$2);
            in $$5 = in.a($$4);
            $$5 = this.b.dN().a(dvz.a.f, $$5);
            if (!$$0.a((double)$$5.u(), (double)$$5.v(), (double)$$5.w(), 1.0)) {
               this.h();
            }
         }
      }
   }

   private void h() {
      ayg $$0 = this.b.ej();
      in $$1 = this.b.dN().a(dvz.a.f, this.b.dn().b(-8 + $$0.a(16), 0, -8 + $$0.a(16)));
      this.b.K().a((double)$$1.u(), (double)$$1.v(), (double)$$1.w(), 1.0);
   }
}
