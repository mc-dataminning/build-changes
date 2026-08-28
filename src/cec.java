import java.util.EnumSet;
import javax.annotation.Nullable;

public class cec extends ccw {
   private static final int a = 10;
   private final bwg b;
   private final int c;
   @Nullable
   private ji d;

   public cec(bwg $$0, int $$1) {
      this.b = $$0;
      this.c = b($$1);
      this.a(EnumSet.of(ccw.a.a));
   }

   @Override
   public boolean b() {
      if (this.b.cW()) {
         return false;
      } else if (this.b.dU().V()) {
         return false;
      } else if (this.b.dX().a(this.c) != 0) {
         return false;
      } else {
         ard $$0 = (ard)this.b.dU();
         ji $$1 = this.b.du();
         if (!$$0.a($$1, 6)) {
            return false;
         } else {
            fbx $$2 = cgw.a(this.b, 15, 7, $$1x -> (double)(-$$0.b(kk.a($$1x))));
            this.d = $$2 == null ? null : ji.a((kb)$$2);
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
         cfk $$0 = this.b.O();
         if ($$0.k() && !this.d.a(this.b.ds(), 10.0)) {
            fbx $$1 = fbx.c(this.d);
            fbx $$2 = this.b.ds();
            fbx $$3 = $$2.d($$1);
            $$1 = $$3.c(0.4).e($$1);
            fbx $$4 = $$1.d($$2).d().c(10.0).e($$2);
            ji $$5 = ji.a((kb)$$4);
            $$5 = this.b.dU().a(edo.a.f, $$5);
            if (!$$0.a((double)$$5.u(), (double)$$5.v(), (double)$$5.w(), 1.0)) {
               this.h();
            }
         }
      }
   }

   private void h() {
      azh $$0 = this.b.dX();
      ji $$1 = this.b.dU().a(edo.a.f, this.b.du().b(-8 + $$0.a(16), 0, -8 + $$0.a(16)));
      this.b.O().a((double)$$1.u(), (double)$$1.v(), (double)$$1.w(), 1.0);
   }
}
