import java.util.List;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class bst extends bto {
   private static final int i = 2;
   private static final int j = 32;
   private static final int k = 10;
   private static final int l = 7;

   public bst(bme $$0, double $$1) {
      super($$0, $$1, 240, false);
   }

   @Nullable
   @Override
   protected elb h() {
      float $$0 = this.b.dM().z.i();
      if (this.b.dM().z.i() < 0.3F) {
         return this.k();
      } else {
         elb $$1;
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
   private elb k() {
      return bwq.a(this.b, 10, 7);
   }

   @Nullable
   private elb l() {
      amp $$0 = (amp)this.b.dM();
      List<cee> $$1 = $$0.a(blj.bg, this.b.cH().g(32.0), this::a);
      if ($$1.isEmpty()) {
         return null;
      } else {
         cee $$2 = $$1.get(this.b.dM().z.a($$1.size()));
         elb $$3 = $$2.dk();
         return bwq.a(this.b, 10, 7, $$3);
      }
   }

   @Nullable
   private elb m() {
      ix $$0 = this.n();
      if ($$0 == null) {
         return null;
      } else {
         hv $$1 = this.a($$0);
         return $$1 == null ? null : bwq.a(this.b, 10, 7, elb.c($$1));
      }
   }

   @Nullable
   private ix n() {
      amp $$0 = (amp)this.b.dM();
      List<ix> $$1 = ix.a(ix.a(this.b), 2).filter($$1x -> $$0.b($$1x) == 0).collect(Collectors.toList());
      return $$1.isEmpty() ? null : $$1.get($$0.z.a($$1.size()));
   }

   @Nullable
   private hv a(ix $$0) {
      amp $$1 = (amp)this.b.dM();
      bww $$2 = $$1.x();
      List<hv> $$3 = $$2.c($$0x -> true, $$0.q(), 8, bww.b.b).map(bwx::f).collect(Collectors.toList());
      return $$3.isEmpty() ? null : $$3.get($$1.z.a($$3.size()));
   }

   private boolean a(cee $$0) {
      return $$0.a(this.b.dM().W());
   }
}
