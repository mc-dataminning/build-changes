import java.util.List;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class bpu extends bqp {
   private static final int i = 2;
   private static final int j = 32;
   private static final int k = 10;
   private static final int l = 7;

   public bpu(bjf $$0, double $$1) {
      super($$0, $$1, 240, false);
   }

   @Nullable
   @Override
   protected ehf h() {
      float $$0 = this.b.dK().z.i();
      if (this.b.dK().z.i() < 0.3F) {
         return this.k();
      } else {
         ehf $$1;
         if ($$0 < 0.7F) {
            $$1 = this.l();
            if ($$1 == null) {
               $$1 = this.m();
            }
         } else {
            $$1 = this.m();
            if ($$1 == null) {
               $$1 = this.l();
            }
         }

         return $$1 == null ? this.k() : $$1;
      }
   }

   @Nullable
   private ehf k() {
      return btq.a(this.b, 10, 7);
   }

   @Nullable
   private ehf l() {
      aki $$0 = (aki)this.b.dK();
      List<cay> $$1 = $$0.a(bik.bf, this.b.cG().g(32.0), this::a);
      if ($$1.isEmpty()) {
         return null;
      } else {
         cay $$2 = $$1.get(this.b.dK().z.a($$1.size()));
         ehf $$3 = $$2.di();
         return btq.a(this.b, 10, 7, $$3);
      }
   }

   @Nullable
   private ehf m() {
      hy $$0 = this.n();
      if ($$0 == null) {
         return null;
      } else {
         gv $$1 = this.a($$0);
         return $$1 == null ? null : btq.a(this.b, 10, 7, ehf.c($$1));
      }
   }

   @Nullable
   private hy n() {
      aki $$0 = (aki)this.b.dK();
      List<hy> $$1 = hy.a(hy.a(this.b), 2).filter($$1x -> $$0.b($$1x) == 0).collect(Collectors.toList());
      return $$1.isEmpty() ? null : $$1.get($$0.z.a($$1.size()));
   }

   @Nullable
   private gv a(hy $$0) {
      aki $$1 = (aki)this.b.dK();
      btw $$2 = $$1.w();
      List<gv> $$3 = $$2.c($$0x -> true, $$0.q(), 8, btw.b.b).map(btx::f).collect(Collectors.toList());
      return $$3.isEmpty() ? null : $$3.get($$1.z.a($$3.size()));
   }

   private boolean a(cay $$0) {
      return $$0.a(this.b.dK().V());
   }
}
