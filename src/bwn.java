import java.util.List;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class bwn extends bxi {
   private static final int i = 2;
   private static final int j = 32;
   private static final int k = 10;
   private static final int l = 7;

   public bwn(bpw $$0, double $$1) {
      super($$0, $$1, 240, false);
   }

   @Nullable
   @Override
   protected epr h() {
      float $$0 = this.b.dM().z.i();
      if (this.b.dM().z.i() < 0.3F) {
         return this.k();
      } else {
         epr $$1;
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
   private epr k() {
      return cal.a(this.b, 10, 7);
   }

   @Nullable
   private epr l() {
      apf $$0 = (apf)this.b.dM();
      List<cif> $$1 = $$0.a(bpc.bi, this.b.cH().g(32.0), this::a);
      if ($$1.isEmpty()) {
         return null;
      } else {
         cif $$2 = $$1.get(this.b.dM().z.a($$1.size()));
         epr $$3 = $$2.dk();
         return cal.a(this.b, 10, 7, $$3);
      }
   }

   @Nullable
   private epr m() {
      je $$0 = this.n();
      if ($$0 == null) {
         return null;
      } else {
         ib $$1 = this.a($$0);
         return $$1 == null ? null : cal.a(this.b, 10, 7, epr.c($$1));
      }
   }

   @Nullable
   private je n() {
      apf $$0 = (apf)this.b.dM();
      List<je> $$1 = je.a(je.a(this.b), 2).filter($$1x -> $$0.b($$1x) == 0).collect(Collectors.toList());
      return $$1.isEmpty() ? null : $$1.get($$0.z.a($$1.size()));
   }

   @Nullable
   private ib a(je $$0) {
      apf $$1 = (apf)this.b.dM();
      car $$2 = $$1.y();
      List<ib> $$3 = $$2.c($$0x -> true, $$0.q(), 8, car.b.b).map(cas::f).collect(Collectors.toList());
      return $$3.isEmpty() ? null : $$3.get($$1.z.a($$3.size()));
   }

   private boolean a(cif $$0) {
      return $$0.a(this.b.dM().X());
   }
}
