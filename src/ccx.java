import java.util.List;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class ccx extends cds {
   private static final int i = 2;
   private static final int j = 32;
   private static final int k = 10;
   private static final int l = 7;

   public ccx(bwf $$0, double $$1) {
      super($$0, $$1, 240, false);
   }

   @Nullable
   @Override
   protected fbr h() {
      float $$0 = this.b.dW().A.i();
      if (this.b.dW().A.i() < 0.3F) {
         return this.k();
      } else {
         fbr $$1;
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
   private fbr k() {
      return cgv.a(this.b, 10, 7);
   }

   @Nullable
   private fbr l() {
      arx $$0 = (arx)this.b.dW();
      List<cpa> $$1 = $$0.a(bvi.bD, this.b.cR().g(32.0), this::a);
      if ($$1.isEmpty()) {
         return null;
      } else {
         cpa $$2 = $$1.get(this.b.dW().A.a($$1.size()));
         fbr $$3 = $$2.du();
         return cgv.a(this.b, 10, 7, $$3);
      }
   }

   @Nullable
   private fbr m() {
      kj $$0 = this.n();
      if ($$0 == null) {
         return null;
      } else {
         jh $$1 = this.a($$0);
         return $$1 == null ? null : cgv.a(this.b, 10, 7, fbr.c($$1));
      }
   }

   @Nullable
   private kj n() {
      arx $$0 = (arx)this.b.dW();
      List<kj> $$1 = kj.a(kj.a(this.b), 2).filter($$1x -> $$0.b($$1x) == 0).collect(Collectors.toList());
      return $$1.isEmpty() ? null : $$1.get($$0.A.a($$1.size()));
   }

   @Nullable
   private jh a(kj $$0) {
      arx $$1 = (arx)this.b.dW();
      chb $$2 = $$1.A();
      List<jh> $$3 = $$2.c($$0x -> true, $$0.k(), 8, chb.b.b).map(chc::g).collect(Collectors.toList());
      return $$3.isEmpty() ? null : $$3.get($$1.A.a($$3.size()));
   }

   private boolean a(cpa $$0) {
      return $$0.a(this.b.dW().ad());
   }
}
