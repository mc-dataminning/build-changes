import java.util.List;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class cao extends cbj {
   private static final int i = 2;
   private static final int j = 32;
   private static final int k = 10;
   private static final int l = 7;

   public cao(btw $$0, double $$1) {
      super($$0, $$1, 240, false);
   }

   @Nullable
   @Override
   protected exa h() {
      float $$0 = this.b.dP().z.i();
      if (this.b.dP().z.i() < 0.3F) {
         return this.k();
      } else {
         exa $$1;
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
   private exa k() {
      return cem.a(this.b, 10, 7);
   }

   @Nullable
   private exa l() {
      aqu $$0 = (aqu)this.b.dP();
      List<cmk> $$1 = $$0.a(bsx.bj, this.b.cL().g(32.0), this::a);
      if ($$1.isEmpty()) {
         return null;
      } else {
         cmk $$2 = $$1.get(this.b.dP().z.a($$1.size()));
         exa $$3 = $$2.dn();
         return cem.a(this.b, 10, 7, $$3);
      }
   }

   @Nullable
   private exa m() {
      kf $$0 = this.n();
      if ($$0 == null) {
         return null;
      } else {
         jd $$1 = this.a($$0);
         return $$1 == null ? null : cem.a(this.b, 10, 7, exa.c($$1));
      }
   }

   @Nullable
   private kf n() {
      aqu $$0 = (aqu)this.b.dP();
      List<kf> $$1 = kf.a(kf.a(this.b), 2).filter($$1x -> $$0.b($$1x) == 0).collect(Collectors.toList());
      return $$1.isEmpty() ? null : $$1.get($$0.z.a($$1.size()));
   }

   @Nullable
   private jd a(kf $$0) {
      aqu $$1 = (aqu)this.b.dP();
      ces $$2 = $$1.y();
      List<jd> $$3 = $$2.c($$0x -> true, $$0.k(), 8, ces.b.b).map(cet::f).collect(Collectors.toList());
      return $$3.isEmpty() ? null : $$3.get($$1.z.a($$3.size()));
   }

   private boolean a(cmk $$0) {
      return $$0.a(this.b.dP().Z());
   }
}
