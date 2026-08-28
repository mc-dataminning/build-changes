import java.util.EnumSet;
import javax.annotation.Nullable;

public class cbf extends bzz {
   private static final int a = 10;
   private final btk b;
   private final int c;
   @Nullable
   private ja d;

   public cbf(btk $$0, int $$1) {
      this.b = $$0;
      this.c = b($$1);
      this.a(EnumSet.of(bzz.a.a));
   }

   @Override
   public boolean a() {
      if (this.b.cS()) {
         return false;
      } else if (this.b.dQ().R()) {
         return false;
      } else if (this.b.dT().a(this.c) != 0) {
         return false;
      } else {
         aqm $$0 = (aqm)this.b.dQ();
         ja $$1 = this.b.dq();
         if (!$$0.a($$1, 6)) {
            return false;
         } else {
            ewf $$2 = cdz.a(this.b, 15, 7, $$1x -> (double)(-$$0.b(kc.a($$1x))));
            this.d = $$2 == null ? null : ja.a($$2);
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
         ccn $$0 = this.b.K();
         if ($$0.l() && !this.d.a(this.b.do(), 10.0)) {
            ewf $$1 = ewf.c(this.d);
            ewf $$2 = this.b.do();
            ewf $$3 = $$2.d($$1);
            $$1 = $$3.a(0.4).e($$1);
            ewf $$4 = $$1.d($$2).d().a(10.0).e($$2);
            ja $$5 = ja.a($$4);
            $$5 = this.b.dQ().a(dyf.a.f, $$5);
            if (!$$0.a((double)$$5.u(), (double)$$5.v(), (double)$$5.w(), 1.0)) {
               this.h();
            }
         }
      }
   }

   private void h() {
      ayo $$0 = this.b.dT();
      ja $$1 = this.b.dQ().a(dyf.a.f, this.b.dq().b(-8 + $$0.a(16), 0, -8 + $$0.a(16)));
      this.b.K().a((double)$$1.u(), (double)$$1.v(), (double)$$1.w(), 1.0);
   }
}
