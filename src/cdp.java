import java.util.List;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class cdp extends cek {
   private static final int i = 2;
   private static final int j = 32;
   private static final int k = 10;
   private static final int l = 7;

   public cdp(bwz $$0, double $$1) {
      super($$0, $$1, 240, false);
   }

   @Nullable
   @Override
   protected fcu h() {
      float $$0 = this.b.dV().A.i();
      if (this.b.dV().A.i() < 0.3F) {
         return this.k();
      } else {
         fcu $$1;
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
   private fcu k() {
      return chn.a(this.b, 10, 7);
   }

   @Nullable
   private fcu l() {
      arn $$0 = (arn)this.b.dV();
      List<cpu> $$1 = $$0.a(bwb.bC, this.b.cR().g(32.0), this::a);
      if ($$1.isEmpty()) {
         return null;
      } else {
         cpu $$2 = $$1.get(this.b.dV().A.a($$1.size()));
         fcu $$3 = $$2.dt();
         return chn.a(this.b, 10, 7, $$3);
      }
   }

   @Nullable
   private fcu m() {
      kl $$0 = this.n();
      if ($$0 == null) {
         return null;
      } else {
         jj $$1 = this.a($$0);
         return $$1 == null ? null : chn.a(this.b, 10, 7, fcu.c($$1));
      }
   }

   @Nullable
   private kl n() {
      arn $$0 = (arn)this.b.dV();
      List<kl> $$1 = kl.a(kl.a(this.b), 2).filter($$1x -> $$0.b($$1x) == 0).collect(Collectors.toList());
      return $$1.isEmpty() ? null : $$1.get($$0.A.a($$1.size()));
   }

   @Nullable
   private jj a(kl $$0) {
      arn $$1 = (arn)this.b.dV();
      cht $$2 = $$1.A();
      List<jj> $$3 = $$2.c($$0x -> true, $$0.k(), 8, cht.b.b).map(chu::g).collect(Collectors.toList());
      return $$3.isEmpty() ? null : $$3.get($$1.A.a($$3.size()));
   }

   private boolean a(cpu $$0) {
      return $$0.a(this.b.dV().ae());
   }
}
