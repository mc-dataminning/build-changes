import java.util.EnumSet;
import javax.annotation.Nullable;

public class ccq extends cbk {
   private static final int a = 10;
   private final buv b;
   private final int c;
   @Nullable
   private jf d;

   public ccq(buv $$0, int $$1) {
      this.b = $$0;
      this.c = b($$1);
      this.a(EnumSet.of(cbk.a.a));
   }

   @Override
   public boolean b() {
      if (this.b.cV()) {
         return false;
      } else if (this.b.dS().S()) {
         return false;
      } else if (this.b.dV().a(this.c) != 0) {
         return false;
      } else {
         arj $$0 = (arj)this.b.dS();
         jf $$1 = this.b.ds();
         if (!$$0.a($$1, 6)) {
            return false;
         } else {
            eyw $$2 = cfk.a(this.b, 15, 7, $$1x -> (double)(-$$0.b(kh.a($$1x))));
            this.d = $$2 == null ? null : jf.a((jy)$$2);
            return this.d != null;
         }
      }
   }

   @Override
   public boolean c() {
      return this.d != null && !this.b.P().m() && this.b.P().i().equals(this.d);
   }

   @Override
   public void a() {
      if (this.d != null) {
         cdy $$0 = this.b.P();
         if ($$0.m() && !this.d.a(this.b.dq(), 10.0)) {
            eyw $$1 = eyw.c(this.d);
            eyw $$2 = this.b.dq();
            eyw $$3 = $$2.d($$1);
            $$1 = $$3.c(0.4).e($$1);
            eyw $$4 = $$1.d($$2).d().c(10.0).e($$2);
            jf $$5 = jf.a((jy)$$4);
            $$5 = this.b.dS().a(eao.a.f, $$5);
            if (!$$0.a((double)$$5.u(), (double)$$5.v(), (double)$$5.w(), 1.0)) {
               this.h();
            }
         }
      }
   }

   private void h() {
      azn $$0 = this.b.dV();
      jf $$1 = this.b.dS().a(eao.a.f, this.b.ds().b(-8 + $$0.a(16), 0, -8 + $$0.a(16)));
      this.b.P().a((double)$$1.u(), (double)$$1.v(), (double)$$1.w(), 1.0);
   }
}
