import java.util.List;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class bzq extends cal {
   private static final int i = 2;
   private static final int j = 32;
   private static final int k = 10;
   private static final int l = 7;

   public bzq(bsz $$0, double $$1) {
      super($$0, $$1, 240, false);
   }

   @Nullable
   @Override
   protected eum h() {
      float $$0 = this.b.dP().z.i();
      if (this.b.dP().z.i() < 0.3F) {
         return this.k();
      } else {
         eum $$1;
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
   private eum k() {
      return cdo.a(this.b, 10, 7);
   }

   @Nullable
   private eum l() {
      aqn $$0 = (aqn)this.b.dP();
      List<cll> $$1 = $$0.a(bsc.bj, this.b.cK().g(32.0), this::a);
      if ($$1.isEmpty()) {
         return null;
      } else {
         cll $$2 = $$1.get(this.b.dP().z.a($$1.size()));
         eum $$3 = $$2.dn();
         return cdo.a(this.b, 10, 7, $$3);
      }
   }

   @Nullable
   private eum m() {
      jq $$0 = this.n();
      if ($$0 == null) {
         return null;
      } else {
         io $$1 = this.a($$0);
         return $$1 == null ? null : cdo.a(this.b, 10, 7, eum.c($$1));
      }
   }

   @Nullable
   private jq n() {
      aqn $$0 = (aqn)this.b.dP();
      List<jq> $$1 = jq.a(jq.a(this.b), 2).filter($$1x -> $$0.b($$1x) == 0).collect(Collectors.toList());
      return $$1.isEmpty() ? null : $$1.get($$0.z.a($$1.size()));
   }

   @Nullable
   private io a(jq $$0) {
      aqn $$1 = (aqn)this.b.dP();
      cdu $$2 = $$1.y();
      List<io> $$3 = $$2.c($$0x -> true, $$0.q(), 8, cdu.b.b).map(cdv::f).collect(Collectors.toList());
      return $$3.isEmpty() ? null : $$3.get($$1.z.a($$3.size()));
   }

   private boolean a(cll $$0) {
      return $$0.a(this.b.dP().Y());
   }
}
