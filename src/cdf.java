import java.util.List;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class cdf extends cea {
   private static final int i = 2;
   private static final int j = 32;
   private static final int k = 10;
   private static final int l = 7;

   public cdf(bwn $$0, double $$1) {
      super($$0, $$1, 240, false);
   }

   @Nullable
   @Override
   protected fbx h() {
      float $$0 = this.b.dV().A.i();
      if (this.b.dV().A.i() < 0.3F) {
         return this.k();
      } else {
         fbx $$1;
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
   private fbx k() {
      return chd.a(this.b, 10, 7);
   }

   @Nullable
   private fbx l() {
      ash $$0 = (ash)this.b.dV();
      List<cpi> $$1 = $$0.a(bvq.bD, this.b.cR().g(32.0), this::a);
      if ($$1.isEmpty()) {
         return null;
      } else {
         cpi $$2 = $$1.get(this.b.dV().A.a($$1.size()));
         fbx $$3 = $$2.dt();
         return chd.a(this.b, 10, 7, $$3);
      }
   }

   @Nullable
   private fbx m() {
      kj $$0 = this.n();
      if ($$0 == null) {
         return null;
      } else {
         jh $$1 = this.a($$0);
         return $$1 == null ? null : chd.a(this.b, 10, 7, fbx.c($$1));
      }
   }

   @Nullable
   private kj n() {
      ash $$0 = (ash)this.b.dV();
      List<kj> $$1 = kj.a(kj.a(this.b), 2).filter($$1x -> $$0.b($$1x) == 0).collect(Collectors.toList());
      return $$1.isEmpty() ? null : $$1.get($$0.A.a($$1.size()));
   }

   @Nullable
   private jh a(kj $$0) {
      ash $$1 = (ash)this.b.dV();
      chj $$2 = $$1.z();
      List<jh> $$3 = $$2.c($$0x -> true, $$0.k(), 8, chj.b.b).map(chk::g).collect(Collectors.toList());
      return $$3.isEmpty() ? null : $$3.get($$1.A.a($$3.size()));
   }

   private boolean a(cpi $$0) {
      return $$0.a(this.b.dV().ac());
   }
}
