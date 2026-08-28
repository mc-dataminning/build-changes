import java.util.List;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class cci extends cdd {
   private static final int i = 2;
   private static final int j = 32;
   private static final int k = 10;
   private static final int l = 7;

   public cci(bvq $$0, double $$1) {
      super($$0, $$1, 240, false);
   }

   @Nullable
   @Override
   protected fbb h() {
      float $$0 = this.b.dV().A.i();
      if (this.b.dV().A.i() < 0.3F) {
         return this.k();
      } else {
         fbb $$1;
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
   private fbb k() {
      return cgg.a(this.b, 10, 7);
   }

   @Nullable
   private fbb l() {
      ard $$0 = (ard)this.b.dV();
      List<coj> $$1 = $$0.a(but.bC, this.b.cR().g(32.0), this::a);
      if ($$1.isEmpty()) {
         return null;
      } else {
         coj $$2 = $$1.get(this.b.dV().A.a($$1.size()));
         fbb $$3 = $$2.dt();
         return cgg.a(this.b, 10, 7, $$3);
      }
   }

   @Nullable
   private fbb m() {
      kk $$0 = this.n();
      if ($$0 == null) {
         return null;
      } else {
         ji $$1 = this.a($$0);
         return $$1 == null ? null : cgg.a(this.b, 10, 7, fbb.c($$1));
      }
   }

   @Nullable
   private kk n() {
      ard $$0 = (ard)this.b.dV();
      List<kk> $$1 = kk.a(kk.a(this.b), 2).filter($$1x -> $$0.b($$1x) == 0).collect(Collectors.toList());
      return $$1.isEmpty() ? null : $$1.get($$0.A.a($$1.size()));
   }

   @Nullable
   private ji a(kk $$0) {
      ard $$1 = (ard)this.b.dV();
      cgm $$2 = $$1.A();
      List<ji> $$3 = $$2.c($$0x -> true, $$0.k(), 8, cgm.b.b).map(cgn::g).collect(Collectors.toList());
      return $$3.isEmpty() ? null : $$3.get($$1.A.a($$3.size()));
   }

   private boolean a(coj $$0) {
      return $$0.a(this.b.dV().ad());
   }
}
