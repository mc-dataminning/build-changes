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
      if (this.b.cR()) {
         return false;
      } else if (this.b.dO().R()) {
         return false;
      } else if (this.b.dR().a(this.c) != 0) {
         return false;
      } else {
         aqu $$0 = (aqu)this.b.dO();
         jd $$1 = this.b.do();
         if (!$$0.a($$1, 6)) {
            return false;
         } else {
            exc $$2 = cem.a(this.b, 15, 7, $$1x -> (double)(-$$0.b(kf.a($$1x))));
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
         if ($$0.l() && !this.d.a(this.b.dm(), 10.0)) {
            exc $$1 = exc.c(this.d);
            exc $$2 = this.b.dm();
            exc $$3 = $$2.d($$1);
            $$1 = $$3.a(0.4).e($$1);
            exc $$4 = $$1.d($$2).d().a(10.0).e($$2);
            jd $$5 = jd.a((jw)$$4);
            $$5 = this.b.dO().a(dyy.a.f, $$5);
            if (!$$0.a((double)$$5.u(), (double)$$5.v(), (double)$$5.w(), 1.0)) {
               this.h();
            }
         }
      }
   }

   private void h() {
      ayw $$0 = this.b.dR();
      jd $$1 = this.b.dO().a(dyy.a.f, this.b.do().b(-8 + $$0.a(16), 0, -8 + $$0.a(16)));
      this.b.N().a((double)$$1.u(), (double)$$1.v(), (double)$$1.w(), 1.0);
   }
}
