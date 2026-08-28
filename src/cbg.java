import java.util.EnumSet;
import javax.annotation.Nullable;

public class cbg extends caa {
   private static final int a = 10;
   private final btl b;
   private final int c;
   @Nullable
   private ja d;

   public cbg(btl $$0, int $$1) {
      this.b = $$0;
      this.c = b($$1);
      this.a(EnumSet.of(caa.a.a));
   }

   @Override
   public boolean a() {
      if (this.b.cT()) {
         return false;
      } else if (this.b.dR().R()) {
         return false;
      } else if (this.b.dU().a(this.c) != 0) {
         return false;
      } else {
         aqm $$0 = (aqm)this.b.dR();
         ja $$1 = this.b.dr();
         if (!$$0.a($$1, 6)) {
            return false;
         } else {
            ewh $$2 = cea.a(this.b, 15, 7, $$1x -> (double)(-$$0.b(kc.a($$1x))));
            this.d = $$2 == null ? null : ja.a($$2);
            return this.d != null;
         }
      }
   }

   @Override
   public boolean b() {
      return this.d != null && !this.b.J().l() && this.b.J().h().equals(this.d);
   }

   @Override
   public void e() {
      if (this.d != null) {
         cco $$0 = this.b.J();
         if ($$0.l() && !this.d.a(this.b.dp(), 10.0)) {
            ewh $$1 = ewh.c(this.d);
            ewh $$2 = this.b.dp();
            ewh $$3 = $$2.d($$1);
            $$1 = $$3.a(0.4).e($$1);
            ewh $$4 = $$1.d($$2).d().a(10.0).e($$2);
            ja $$5 = ja.a($$4);
            $$5 = this.b.dR().a(dyg.a.f, $$5);
            if (!$$0.a((double)$$5.u(), (double)$$5.v(), (double)$$5.w(), 1.0)) {
               this.h();
            }
         }
      }
   }

   private void h() {
      ayo $$0 = this.b.dU();
      ja $$1 = this.b.dR().a(dyg.a.f, this.b.dr().b(-8 + $$0.a(16), 0, -8 + $$0.a(16)));
      this.b.J().a((double)$$1.u(), (double)$$1.v(), (double)$$1.w(), 1.0);
   }
}
