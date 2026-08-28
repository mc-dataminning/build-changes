import java.util.List;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class ces extends cfn {
   private static final int i = 2;
   private static final int j = 32;
   private static final int k = 10;
   private static final int l = 7;

   public ces(byc $$0, double $$1) {
      super($$0, $$1, 240, false);
   }

   @Nullable
   @Override
   protected ffq h() {
      float $$0 = this.b.dV().A.i();
      if (this.b.dV().A.i() < 0.3F) {
         return this.k();
      } else {
         ffq $$1;
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
   private ffq k() {
      return ciq.a(this.b, 10, 7);
   }

   @Nullable
   private ffq l() {
      ars $$0 = (ars)this.b.dV();
      List<crj> $$1 = $$0.a(bxc.bE, this.b.cR().g(32.0), this::a);
      if ($$1.isEmpty()) {
         return null;
      } else {
         crj $$2 = $$1.get(this.b.dV().A.a($$1.size()));
         ffq $$3 = $$2.dt();
         return ciq.a(this.b, 10, 7, $$3);
      }
   }

   @Nullable
   private ffq m() {
      jy $$0 = this.n();
      if ($$0 == null) {
         return null;
      } else {
         iv $$1 = this.a($$0);
         return $$1 == null ? null : ciq.a(this.b, 10, 7, ffq.c($$1));
      }
   }

   @Nullable
   private jy n() {
      ars $$0 = (ars)this.b.dV();
      List<jy> $$1 = jy.a(jy.a(this.b), 2).filter($$1x -> $$0.b($$1x) == 0).collect(Collectors.toList());
      return $$1.isEmpty() ? null : $$1.get($$0.A.a($$1.size()));
   }

   @Nullable
   private iv a(jy $$0) {
      ars $$1 = (ars)this.b.dV();
      ciw $$2 = $$1.A();
      List<iv> $$3 = $$2.c($$0x -> true, $$0.k(), 8, ciw.b.b).map(cix::g).collect(Collectors.toList());
      return $$3.isEmpty() ? null : $$3.get($$1.A.a($$3.size()));
   }

   private boolean a(crj $$0) {
      return $$0.a(this.b.dV().ae());
   }
}
