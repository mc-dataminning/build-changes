import java.util.List;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class btm extends buh {
   private static final int i = 2;
   private static final int j = 32;
   private static final int k = 10;
   private static final int l = 7;

   public btm(bmx $$0, double $$1) {
      super($$0, $$1, 240, false);
   }

   @Nullable
   @Override
   protected emc h() {
      float $$0 = this.b.dL().z.i();
      if (this.b.dL().z.i() < 0.3F) {
         return this.k();
      } else {
         emc $$1;
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
   private emc k() {
      return bxk.a(this.b, 10, 7);
   }

   @Nullable
   private emc l() {
      ane $$0 = (ane)this.b.dL();
      List<cfd> $$1 = $$0.a(bmc.bh, this.b.cH().g(32.0), this::a);
      if ($$1.isEmpty()) {
         return null;
      } else {
         cfd $$2 = $$1.get(this.b.dL().z.a($$1.size()));
         emc $$3 = $$2.dj();
         return bxk.a(this.b, 10, 7, $$3);
      }
   }

   @Nullable
   private emc m() {
      iz $$0 = this.n();
      if ($$0 == null) {
         return null;
      } else {
         hx $$1 = this.a($$0);
         return $$1 == null ? null : bxk.a(this.b, 10, 7, emc.c($$1));
      }
   }

   @Nullable
   private iz n() {
      ane $$0 = (ane)this.b.dL();
      List<iz> $$1 = iz.a(iz.a(this.b), 2).filter($$1x -> $$0.b($$1x) == 0).collect(Collectors.toList());
      return $$1.isEmpty() ? null : $$1.get($$0.z.a($$1.size()));
   }

   @Nullable
   private hx a(iz $$0) {
      ane $$1 = (ane)this.b.dL();
      bxq $$2 = $$1.y();
      List<hx> $$3 = $$2.c($$0x -> true, $$0.q(), 8, bxq.b.b).map(bxr::f).collect(Collectors.toList());
      return $$3.isEmpty() ? null : $$3.get($$1.z.a($$3.size()));
   }

   private boolean a(cfd $$0) {
      return $$0.a(this.b.dL().X());
   }
}
