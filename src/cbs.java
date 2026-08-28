import java.util.EnumSet;
import javax.annotation.Nullable;

public class cbs extends cam {
   private static final int a = 10;
   private final btw b;
   private final int c;
   @Nullable
   private jd d;

   public cbs(btw $$0, int $$1) {
      this.b = $$0;
      this.c = b($$1);
      this.a(EnumSet.of(cam.a.a));
   }

   @Override
   public boolean b() {
      if (this.b.cS()) {
         return false;
      } else if (this.b.dP().R()) {
         return false;
      } else if (this.b.dS().a(this.c) != 0) {
         return false;
      } else {
         aqu $$0 = (aqu)this.b.dP();
         jd $$1 = this.b.dp();
         if (!$$0.a($$1, 6)) {
            return false;
         } else {
            exa $$2 = cem.a(this.b, 15, 7, $$1x -> (double)(-$$0.b(kf.a($$1x))));
            this.d = $$2 == null ? null : jd.a((jw)$$2);
            return this.d != null;
         }
      }
   }

   @Override
   public boolean c() {
      return this.d != null && !this.b.N().l() && this.b.N().h().equals(this.d);
   }

   @Override
   public void a() {
      if (this.d != null) {
         cda $$0 = this.b.N();
         if ($$0.l() && !this.d.a(this.b.dn(), 10.0)) {
            exa $$1 = exa.c(this.d);
            exa $$2 = this.b.dn();
            exa $$3 = $$2.d($$1);
            $$1 = $$3.a(0.4).e($$1);
            exa $$4 = $$1.d($$2).d().a(10.0).e($$2);
            jd $$5 = jd.a((jw)$$4);
            $$5 = this.b.dP().a(dyy.a.f, $$5);
            if (!$$0.a((double)$$5.u(), (double)$$5.v(), (double)$$5.w(), 1.0)) {
               this.h();
            }
         }
      }
   }

   private void h() {
      ayw $$0 = this.b.dS();
      jd $$1 = this.b.dP().a(dyy.a.f, this.b.dp().b(-8 + $$0.a(16), 0, -8 + $$0.a(16)));
      this.b.N().a((double)$$1.u(), (double)$$1.v(), (double)$$1.w(), 1.0);
   }
}
