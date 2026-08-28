import java.util.EnumSet;
import javax.annotation.Nullable;

public class cfb extends cdv {
   private static final int a = 10;
   private final bxh b;
   private final int c;
   @Nullable
   private iu d;

   public cfb(bxh $$0, int $$1) {
      this.b = $$0;
      this.c = b($$1);
      this.a(EnumSet.of(cdv.a.a));
   }

   @Override
   public boolean b() {
      if (this.b.cX()) {
         return false;
      } else if (this.b.dV().V()) {
         return false;
      } else if (this.b.dY().a(this.c) != 0) {
         return false;
      } else {
         aro $$0 = (aro)this.b.dV();
         iu $$1 = this.b.dv();
         if (!$$0.a($$1, 6)) {
            return false;
         } else {
            fdw $$2 = chv.a(this.b, 15, 7, $$1x -> (double)(-$$0.b(jx.a($$1x))));
            this.d = $$2 == null ? null : iu.a((jo)$$2);
            return this.d != null;
         }
      }
   }

   @Override
   public boolean c() {
      return this.d != null && !this.b.O().k() && this.b.O().g().equals(this.d);
   }

   @Override
   public void a() {
      if (this.d != null) {
         cgj $$0 = this.b.O();
         if ($$0.k() && !this.d.a(this.b.dt(), 10.0)) {
            fdw $$1 = fdw.c(this.d);
            fdw $$2 = this.b.dt();
            fdw $$3 = $$2.d($$1);
            $$1 = $$3.c(0.4).e($$1);
            fdw $$4 = $$1.d($$2).d().c(10.0).e($$2);
            iu $$5 = iu.a((jo)$$4);
            $$5 = this.b.dV().a(efn.a.f, $$5);
            if (!$$0.a((double)$$5.u(), (double)$$5.v(), (double)$$5.w(), 1.0)) {
               this.h();
            }
         }
      }
   }

   private void h() {
      azt $$0 = this.b.dY();
      iu $$1 = this.b.dV().a(efn.a.f, this.b.dv().b(-8 + $$0.a(16), 0, -8 + $$0.a(16)));
      this.b.O().a((double)$$1.u(), (double)$$1.v(), (double)$$1.w(), 1.0);
   }
}
