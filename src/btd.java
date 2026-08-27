import java.util.List;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class btd extends bty {
   private static final int i = 2;
   private static final int j = 32;
   private static final int k = 10;
   private static final int l = 7;

   public btd(bmo $$0, double $$1) {
      super($$0, $$1, 240, false);
   }

   @Nullable
   @Override
   protected elm h() {
      float $$0 = this.b.dM().z.i();
      if (this.b.dM().z.i() < 0.3F) {
         return this.k();
      } else {
         elm $$1;
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
   private elm k() {
      return bxa.a(this.b, 10, 7);
   }

   @Nullable
   private elm l() {
      amz $$0 = (amz)this.b.dM();
      List<ceo> $$1 = $$0.a(blt.bg, this.b.cH().g(32.0), this::a);
      if ($$1.isEmpty()) {
         return null;
      } else {
         ceo $$2 = $$1.get(this.b.dM().z.a($$1.size()));
         elm $$3 = $$2.dk();
         return bxa.a(this.b, 10, 7, $$3);
      }
   }

   @Nullable
   private elm m() {
      iz $$0 = this.n();
      if ($$0 == null) {
         return null;
      } else {
         hx $$1 = this.a($$0);
         return $$1 == null ? null : bxa.a(this.b, 10, 7, elm.c($$1));
      }
   }

   @Nullable
   private iz n() {
      amz $$0 = (amz)this.b.dM();
      List<iz> $$1 = iz.a(iz.a(this.b), 2).filter($$1x -> $$0.b($$1x) == 0).collect(Collectors.toList());
      return $$1.isEmpty() ? null : $$1.get($$0.z.a($$1.size()));
   }

   @Nullable
   private hx a(iz $$0) {
      amz $$1 = (amz)this.b.dM();
      bxg $$2 = $$1.y();
      List<hx> $$3 = $$2.c($$0x -> true, $$0.q(), 8, bxg.b.b).map(bxh::f).collect(Collectors.toList());
      return $$3.isEmpty() ? null : $$3.get($$1.z.a($$3.size()));
   }

   private boolean a(ceo $$0) {
      return $$0.a(this.b.dM().X());
   }
}
