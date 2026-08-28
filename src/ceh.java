import java.util.List;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class ceh extends cfc {
   private static final int i = 2;
   private static final int j = 32;
   private static final int k = 10;
   private static final int l = 7;

   public ceh(bxr $$0, double $$1) {
      super($$0, $$1, 240, false);
   }

   @Nullable
   @Override
   protected fex h() {
      float $$0 = this.b.dU().A.i();
      if (this.b.dU().A.i() < 0.3F) {
         return this.k();
      } else {
         fex $$1;
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
   private fex k() {
      return cif.a(this.b, 10, 7);
   }

   @Nullable
   private fex l() {
      arq $$0 = (arq)this.b.dU();
      List<cqv> $$1 = $$0.a(bwr.bD, this.b.cQ().g(32.0), this::a);
      if ($$1.isEmpty()) {
         return null;
      } else {
         cqv $$2 = $$1.get(this.b.dU().A.a($$1.size()));
         fex $$3 = $$2.ds();
         return cif.a(this.b, 10, 7, $$3);
      }
   }

   @Nullable
   private fex m() {
      jy $$0 = this.n();
      if ($$0 == null) {
         return null;
      } else {
         iv $$1 = this.a($$0);
         return $$1 == null ? null : cif.a(this.b, 10, 7, fex.c($$1));
      }
   }

   @Nullable
   private jy n() {
      arq $$0 = (arq)this.b.dU();
      List<jy> $$1 = jy.a(jy.a(this.b), 2).filter($$1x -> $$0.b($$1x) == 0).collect(Collectors.toList());
      return $$1.isEmpty() ? null : $$1.get($$0.A.a($$1.size()));
   }

   @Nullable
   private iv a(jy $$0) {
      arq $$1 = (arq)this.b.dU();
      cil $$2 = $$1.A();
      List<iv> $$3 = $$2.c($$0x -> true, $$0.k(), 8, cil.b.b).map(cim::g).collect(Collectors.toList());
      return $$3.isEmpty() ? null : $$3.get($$1.A.a($$3.size()));
   }

   private boolean a(cqv $$0) {
      return $$0.a(this.b.dU().ae());
   }
}
