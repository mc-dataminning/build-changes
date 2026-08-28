import java.util.EnumSet;
import javax.annotation.Nullable;

public class ceb extends ccv {
   private static final int a = 10;
   private final bwf b;
   private final int c;
   @Nullable
   private jh d;

   public ceb(bwf $$0, int $$1) {
      this.b = $$0;
      this.c = b($$1);
      this.a(EnumSet.of(ccv.a.a));
   }

   @Override
   public boolean b() {
      if (this.b.cY()) {
         return false;
      } else if (this.b.dW().V()) {
         return false;
      } else if (this.b.dZ().a(this.c) != 0) {
         return false;
      } else {
         arx $$0 = (arx)this.b.dW();
         jh $$1 = this.b.dw();
         if (!$$0.a($$1, 6)) {
            return false;
         } else {
            fbr $$2 = cgv.a(this.b, 15, 7, $$1x -> (double)(-$$0.b(kj.a($$1x))));
            this.d = $$2 == null ? null : jh.a((ka)$$2);
            return this.d != null;
         }
      }
   }

   @Override
   public boolean c() {
      return this.d != null && !this.b.L().m() && this.b.L().i().equals(this.d);
   }

   @Override
   public void a() {
      if (this.d != null) {
         cfj $$0 = this.b.L();
         if ($$0.m() && !this.d.a(this.b.du(), 10.0)) {
            fbr $$1 = fbr.c(this.d);
            fbr $$2 = this.b.du();
            fbr $$3 = $$2.d($$1);
            $$1 = $$3.c(0.4).e($$1);
            fbr $$4 = $$1.d($$2).d().c(10.0).e($$2);
            jh $$5 = jh.a((ka)$$4);
            $$5 = this.b.dW().a(edj.a.f, $$5);
            if (!$$0.a((double)$$5.u(), (double)$$5.v(), (double)$$5.w(), 1.0)) {
               this.h();
            }
         }
      }
   }

   private void h() {
      bac $$0 = this.b.dZ();
      jh $$1 = this.b.dW().a(edj.a.f, this.b.dw().b(-8 + $$0.a(16), 0, -8 + $$0.a(16)));
      this.b.L().a((double)$$1.u(), (double)$$1.v(), (double)$$1.w(), 1.0);
   }
}
