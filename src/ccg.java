import java.util.List;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class ccg extends cdb {
   private static final int i = 2;
   private static final int j = 32;
   private static final int k = 10;
   private static final int l = 7;

   public ccg(bvo $$0, double $$1) {
      super($$0, $$1, 240, false);
   }

   @Nullable
   @Override
   protected fba h() {
      float $$0 = this.b.dW().A.i();
      if (this.b.dW().A.i() < 0.3F) {
         return this.k();
      } else {
         fba $$1;
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
   private fba k() {
      return cge.a(this.b, 10, 7);
   }

   @Nullable
   private fba l() {
      arc $$0 = (arc)this.b.dW();
      List<coi> $$1 = $$0.a(bur.bD, this.b.cR().g(32.0), this::a);
      if ($$1.isEmpty()) {
         return null;
      } else {
         coi $$2 = $$1.get(this.b.dW().A.a($$1.size()));
         fba $$3 = $$2.du();
         return cge.a(this.b, 10, 7, $$3);
      }
   }

   @Nullable
   private fba m() {
      kk $$0 = this.n();
      if ($$0 == null) {
         return null;
      } else {
         ji $$1 = this.a($$0);
         return $$1 == null ? null : cge.a(this.b, 10, 7, fba.c($$1));
      }
   }

   @Nullable
   private kk n() {
      arc $$0 = (arc)this.b.dW();
      List<kk> $$1 = kk.a(kk.a(this.b), 2).filter($$1x -> $$0.b($$1x) == 0).collect(Collectors.toList());
      return $$1.isEmpty() ? null : $$1.get($$0.A.a($$1.size()));
   }

   @Nullable
   private ji a(kk $$0) {
      arc $$1 = (arc)this.b.dW();
      cgk $$2 = $$1.A();
      List<ji> $$3 = $$2.c($$0x -> true, $$0.k(), 8, cgk.b.b).map(cgl::g).collect(Collectors.toList());
      return $$3.isEmpty() ? null : $$3.get($$1.A.a($$3.size()));
   }

   private boolean a(coi $$0) {
      return $$0.a(this.b.dW().ad());
   }
}
