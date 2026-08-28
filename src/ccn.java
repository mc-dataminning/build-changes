import java.util.EnumSet;
import javax.annotation.Nullable;

public class ccn extends cbh {
   private static final int a = 10;
   private final bus b;
   private final int c;
   @Nullable
   private je d;

   public ccn(bus $$0, int $$1) {
      this.b = $$0;
      this.c = b($$1);
      this.a(EnumSet.of(cbh.a.a));
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
         arh $$0 = (arh)this.b.dS();
         je $$1 = this.b.ds();
         if (!$$0.a($$1, 6)) {
            return false;
         } else {
            eys $$2 = cfh.a(this.b, 15, 7, $$1x -> (double)(-$$0.b(kg.a($$1x))));
            this.d = $$2 == null ? null : je.a((jx)$$2);
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
         cdv $$0 = this.b.P();
         if ($$0.m() && !this.d.a(this.b.dq(), 10.0)) {
            eys $$1 = eys.c(this.d);
            eys $$2 = this.b.dq();
            eys $$3 = $$2.d($$1);
            $$1 = $$3.c(0.4).e($$1);
            eys $$4 = $$1.d($$2).d().c(10.0).e($$2);
            je $$5 = je.a((jx)$$4);
            $$5 = this.b.dS().a(eak.a.f, $$5);
            if (!$$0.a((double)$$5.u(), (double)$$5.v(), (double)$$5.w(), 1.0)) {
               this.h();
            }
         }
      }
   }

   private void h() {
      azl $$0 = this.b.dV();
      je $$1 = this.b.dS().a(eak.a.f, this.b.ds().b(-8 + $$0.a(16), 0, -8 + $$0.a(16)));
      this.b.P().a((double)$$1.u(), (double)$$1.v(), (double)$$1.w(), 1.0);
   }
}
