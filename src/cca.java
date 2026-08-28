import java.util.List;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class cca extends ccv {
   private static final int i = 2;
   private static final int j = 32;
   private static final int k = 10;
   private static final int l = 7;

   public cca(bvi $$0, double $$1) {
      super($$0, $$1, 240, false);
   }

   @Nullable
   @Override
   protected ezn h() {
      float $$0 = this.b.dX().A.i();
      if (this.b.dX().A.i() < 0.3F) {
         return this.k();
      } else {
         ezn $$1;
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
   private ezn k() {
      return cfy.a(this.b, 10, 7);
   }

   @Nullable
   private ezn l() {
      arn $$0 = (arn)this.b.dX();
      List<cny> $$1 = $$0.a(bul.bj, this.b.cS().g(32.0), this::a);
      if ($$1.isEmpty()) {
         return null;
      } else {
         cny $$2 = $$1.get(this.b.dX().A.a($$1.size()));
         ezn $$3 = $$2.dv();
         return cfy.a(this.b, 10, 7, $$3);
      }
   }

   @Nullable
   private ezn m() {
      kj $$0 = this.n();
      if ($$0 == null) {
         return null;
      } else {
         jh $$1 = this.a($$0);
         return $$1 == null ? null : cfy.a(this.b, 10, 7, ezn.c($$1));
      }
   }

   @Nullable
   private kj n() {
      arn $$0 = (arn)this.b.dX();
      List<kj> $$1 = kj.a(kj.a(this.b), 2).filter($$1x -> $$0.b($$1x) == 0).collect(Collectors.toList());
      return $$1.isEmpty() ? null : $$1.get($$0.A.a($$1.size()));
   }

   @Nullable
   private jh a(kj $$0) {
      arn $$1 = (arn)this.b.dX();
      cge $$2 = $$1.y();
      List<jh> $$3 = $$2.c($$0x -> true, $$0.k(), 8, cge.b.b).map(cgf::g).collect(Collectors.toList());
      return $$3.isEmpty() ? null : $$3.get($$1.A.a($$3.size()));
   }

   private boolean a(cny $$0) {
      return $$0.a(this.b.dX().aa());
   }
}
