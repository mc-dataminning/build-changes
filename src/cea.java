import java.util.List;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class cea extends cev {
   private static final int i = 2;
   private static final int j = 32;
   private static final int k = 10;
   private static final int l = 7;

   public cea(bxk $$0, double $$1) {
      super($$0, $$1, 240, false);
   }

   @Nullable
   @Override
   protected fei h() {
      float $$0 = this.b.dV().A.i();
      if (this.b.dV().A.i() < 0.3F) {
         return this.k();
      } else {
         fei $$1;
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
   private fei k() {
      return chy.a(this.b, 10, 7);
   }

   @Nullable
   private fei l() {
      arq $$0 = (arq)this.b.dV();
      List<cqk> $$1 = $$0.a(bwm.bD, this.b.cR().g(32.0), this::a);
      if ($$1.isEmpty()) {
         return null;
      } else {
         cqk $$2 = $$1.get(this.b.dV().A.a($$1.size()));
         fei $$3 = $$2.dt();
         return chy.a(this.b, 10, 7, $$3);
      }
   }

   @Nullable
   private fei m() {
      jx $$0 = this.n();
      if ($$0 == null) {
         return null;
      } else {
         iu $$1 = this.a($$0);
         return $$1 == null ? null : chy.a(this.b, 10, 7, fei.c($$1));
      }
   }

   @Nullable
   private jx n() {
      arq $$0 = (arq)this.b.dV();
      List<jx> $$1 = jx.a(jx.a(this.b), 2).filter($$1x -> $$0.b($$1x) == 0).collect(Collectors.toList());
      return $$1.isEmpty() ? null : $$1.get($$0.A.a($$1.size()));
   }

   @Nullable
   private iu a(jx $$0) {
      arq $$1 = (arq)this.b.dV();
      cie $$2 = $$1.A();
      List<iu> $$3 = $$2.c($$0x -> true, $$0.k(), 8, cie.b.b).map(cif::g).collect(Collectors.toList());
      return $$3.isEmpty() ? null : $$3.get($$1.A.a($$3.size()));
   }

   private boolean a(cqk $$0) {
      return $$0.a(this.b.dV().ae());
   }
}
