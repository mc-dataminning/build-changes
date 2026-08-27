import java.util.EnumSet;
import javax.annotation.Nullable;

public class bob extends bmv {
   private static final int a = 10;
   private final bgi b;
   private final int c;
   @Nullable
   private gu d;

   public bob(bgi $$0, int $$1) {
      this.b = $$0;
      this.c = b($$1);
      this.a(EnumSet.of(bmv.a.a));
   }

   @Override
   public boolean a() {
      if (this.b.bN()) {
         return false;
      } else if (this.b.dI().N()) {
         return false;
      } else if (this.b.ec().a(this.c) != 0) {
         return false;
      } else {
         aif $$0 = (aif)this.b.dI();
         gu $$1 = this.b.di();
         if (!$$0.a($$1, 6)) {
            return false;
         } else {
            eei $$2 = bqt.a(this.b, 15, 7, $$1x -> (double)(-$$0.b(hx.a($$1x))));
            this.d = $$2 == null ? null : gu.a($$2);
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
         bpj $$0 = this.b.J();
         if ($$0.l() && !this.d.a(this.b.dg(), 10.0)) {
            eei $$1 = eei.c(this.d);
            eei $$2 = this.b.dg();
            eei $$3 = $$2.d($$1);
            $$1 = $$3.a(0.4).e($$1);
            eei $$4 = $$1.d($$2).d().a(10.0).e($$2);
            gu $$5 = gu.a($$4);
            $$5 = this.b.dI().a(dhk.a.f, $$5);
            if (!$$0.a((double)$$5.u(), (double)$$5.v(), (double)$$5.w(), 1.0)) {
               this.h();
            }
         }
      }
   }

   private void h() {
      apf $$0 = this.b.ec();
      gu $$1 = this.b.dI().a(dhk.a.f, this.b.di().b(-8 + $$0.a(16), 0, -8 + $$0.a(16)));
      this.b.J().a((double)$$1.u(), (double)$$1.v(), (double)$$1.w(), 1.0);
   }
}
