import java.util.EnumSet;
import javax.annotation.Nullable;

public class cbq extends cak {
   private static final int a = 10;
   private final btu b;
   private final int c;
   @Nullable
   private jd d;

   public cbq(btu $$0, int $$1) {
      this.b = $$0;
      this.c = b($$1);
      this.a(EnumSet.of(cak.a.a));
   }

   @Override
   public boolean b() {
      if (this.b.cS()) {
         return false;
      } else if (this.b.dQ().R()) {
         return false;
      } else if (this.b.dT().a(this.c) != 0) {
         return false;
      } else {
         aqt $$0 = (aqt)this.b.dQ();
         jd $$1 = this.b.dq();
         if (!$$0.a($$1, 6)) {
            return false;
         } else {
            eww $$2 = cek.a(this.b, 15, 7, $$1x -> (double)(-$$0.b(kf.a($$1x))));
            this.d = $$2 == null ? null : jd.a((jw)$$2);
            return this.d != null;
         }
      }
   }

   @Override
   public boolean c() {
      return this.d != null && !this.b.J().l() && this.b.J().h().equals(this.d);
   }

   @Override
   public void a() {
      if (this.d != null) {
         ccy $$0 = this.b.J();
         if ($$0.l() && !this.d.a(this.b.do(), 10.0)) {
            eww $$1 = eww.c(this.d);
            eww $$2 = this.b.do();
            eww $$3 = $$2.d($$1);
            $$1 = $$3.a(0.4).e($$1);
            eww $$4 = $$1.d($$2).d().a(10.0).e($$2);
            jd $$5 = jd.a((jw)$$4);
            $$5 = this.b.dQ().a(dyv.a.f, $$5);
            if (!$$0.a((double)$$5.u(), (double)$$5.v(), (double)$$5.w(), 1.0)) {
               this.h();
            }
         }
      }
   }

   private void h() {
      ayv $$0 = this.b.dT();
      jd $$1 = this.b.dQ().a(dyv.a.f, this.b.dq().b(-8 + $$0.a(16), 0, -8 + $$0.a(16)));
      this.b.J().a((double)$$1.u(), (double)$$1.v(), (double)$$1.w(), 1.0);
   }
}
