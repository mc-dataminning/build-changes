import java.util.List;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class bzn extends cai {
   private static final int i = 2;
   private static final int j = 32;
   private static final int k = 10;
   private static final int l = 7;

   public bzn(bsw $$0, double $$1) {
      super($$0, $$1, 240, false);
   }

   @Nullable
   @Override
   protected ewu h() {
      float $$0 = this.b.dU().A.i();
      if (this.b.dU().A.i() < 0.3F) {
         return this.k();
      } else {
         ewu $$1;
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
   private ewu k() {
      return cdl.a(this.b, 10, 7);
   }

   @Nullable
   private ewu l() {
      aqt $$0 = (aqt)this.b.dU();
      List<cll> $$1 = $$0.a(bsb.bn, this.b.cP().g(32.0), this::a);
      if ($$1.isEmpty()) {
         return null;
      } else {
         cll $$2 = $$1.get(this.b.dU().A.a($$1.size()));
         ewu $$3 = $$2.ds();
         return cdl.a(this.b, 10, 7, $$3);
      }
   }

   @Nullable
   private ewu m() {
      jt $$0 = this.n();
      if ($$0 == null) {
         return null;
      } else {
         ir $$1 = this.a($$0);
         return $$1 == null ? null : cdl.a(this.b, 10, 7, ewu.c($$1));
      }
   }

   @Nullable
   private jt n() {
      aqt $$0 = (aqt)this.b.dU();
      List<jt> $$1 = jt.a(jt.a(this.b), 2).filter($$1x -> $$0.b($$1x) == 0).collect(Collectors.toList());
      return $$1.isEmpty() ? null : $$1.get($$0.A.a($$1.size()));
   }

   @Nullable
   private ir a(jt $$0) {
      aqt $$1 = (aqt)this.b.dU();
      cdr $$2 = $$1.y();
      List<ir> $$3 = $$2.c($$0x -> true, $$0.q(), 8, cdr.b.b).map(cds::f).collect(Collectors.toList());
      return $$3.isEmpty() ? null : $$3.get($$1.A.a($$3.size()));
   }

   private boolean a(cll $$0) {
      return $$0.a(this.b.dU().Z());
   }
}
