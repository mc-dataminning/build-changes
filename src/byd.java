import java.util.List;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class byd extends byy {
   private static final int i = 2;
   private static final int j = 32;
   private static final int k = 10;
   private static final int l = 7;

   public byd(brm $$0, double $$1) {
      super($$0, $$1, 240, false);
   }

   @Nullable
   @Override
   protected etf h() {
      float $$0 = this.b.dN().z.i();
      if (this.b.dN().z.i() < 0.3F) {
         return this.k();
      } else {
         etf $$1;
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
   private etf k() {
      return ccb.a(this.b, 10, 7);
   }

   @Nullable
   private etf l() {
      aqe $$0 = (aqe)this.b.dN();
      List<cjy> $$1 = $$0.a(bqr.bi, this.b.cI().g(32.0), this::a);
      if ($$1.isEmpty()) {
         return null;
      } else {
         cjy $$2 = $$1.get(this.b.dN().z.a($$1.size()));
         etf $$3 = $$2.dl();
         return ccb.a(this.b, 10, 7, $$3);
      }
   }

   @Nullable
   private etf m() {
      jo $$0 = this.n();
      if ($$0 == null) {
         return null;
      } else {
         im $$1 = this.a($$0);
         return $$1 == null ? null : ccb.a(this.b, 10, 7, etf.c($$1));
      }
   }

   @Nullable
   private jo n() {
      aqe $$0 = (aqe)this.b.dN();
      List<jo> $$1 = jo.a(jo.a(this.b), 2).filter($$1x -> $$0.b($$1x) == 0).collect(Collectors.toList());
      return $$1.isEmpty() ? null : $$1.get($$0.z.a($$1.size()));
   }

   @Nullable
   private im a(jo $$0) {
      aqe $$1 = (aqe)this.b.dN();
      cch $$2 = $$1.y();
      List<im> $$3 = $$2.c($$0x -> true, $$0.q(), 8, cch.b.b).map(cci::f).collect(Collectors.toList());
      return $$3.isEmpty() ? null : $$3.get($$1.z.a($$3.size()));
   }

   private boolean a(cjy $$0) {
      return $$0.a(this.b.dN().Y());
   }
}
