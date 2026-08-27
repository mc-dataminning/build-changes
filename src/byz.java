import java.util.List;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class byz extends bzu {
   private static final int i = 2;
   private static final int j = 32;
   private static final int k = 10;
   private static final int l = 7;

   public byz(bsi $$0, double $$1) {
      super($$0, $$1, 240, false);
   }

   @Nullable
   @Override
   protected etp h() {
      float $$0 = this.b.dN().z.i();
      if (this.b.dN().z.i() < 0.3F) {
         return this.k();
      } else {
         etp $$1;
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
   private etp k() {
      return ccx.a(this.b, 10, 7);
   }

   @Nullable
   private etp l() {
      aqh $$0 = (aqh)this.b.dN();
      List<cku> $$1 = $$0.a(brn.bi, this.b.cI().g(32.0), this::a);
      if ($$1.isEmpty()) {
         return null;
      } else {
         cku $$2 = $$1.get(this.b.dN().z.a($$1.size()));
         etp $$3 = $$2.dl();
         return ccx.a(this.b, 10, 7, $$3);
      }
   }

   @Nullable
   private etp m() {
      jp $$0 = this.n();
      if ($$0 == null) {
         return null;
      } else {
         in $$1 = this.a($$0);
         return $$1 == null ? null : ccx.a(this.b, 10, 7, etp.c($$1));
      }
   }

   @Nullable
   private jp n() {
      aqh $$0 = (aqh)this.b.dN();
      List<jp> $$1 = jp.a(jp.a(this.b), 2).filter($$1x -> $$0.b($$1x) == 0).collect(Collectors.toList());
      return $$1.isEmpty() ? null : $$1.get($$0.z.a($$1.size()));
   }

   @Nullable
   private in a(jp $$0) {
      aqh $$1 = (aqh)this.b.dN();
      cdd $$2 = $$1.y();
      List<in> $$3 = $$2.c($$0x -> true, $$0.q(), 8, cdd.b.b).map(cde::f).collect(Collectors.toList());
      return $$3.isEmpty() ? null : $$3.get($$1.z.a($$3.size()));
   }

   private boolean a(cku $$0) {
      return $$0.a(this.b.dN().Y());
   }
}
