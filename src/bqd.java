import java.util.List;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class bqd extends bqy {
   private static final int i = 2;
   private static final int j = 32;
   private static final int k = 10;
   private static final int l = 7;

   public bqd(bjp $$0, double $$1) {
      super($$0, $$1, 240, false);
   }

   @Nullable
   @Override
   protected ehn h() {
      float $$0 = this.b.dL().z.i();
      if (this.b.dL().z.i() < 0.3F) {
         return this.k();
      } else {
         ehn $$1;
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
   private ehn k() {
      return btz.a(this.b, 10, 7);
   }

   @Nullable
   private ehn l() {
      akr $$0 = (akr)this.b.dL();
      List<cbh> $$1 = $$0.a(biu.bf, this.b.cG().g(32.0), this::a);
      if ($$1.isEmpty()) {
         return null;
      } else {
         cbh $$2 = $$1.get(this.b.dL().z.a($$1.size()));
         ehn $$3 = $$2.dj();
         return btz.a(this.b, 10, 7, $$3);
      }
   }

   @Nullable
   private ehn m() {
      hz $$0 = this.n();
      if ($$0 == null) {
         return null;
      } else {
         gw $$1 = this.a($$0);
         return $$1 == null ? null : btz.a(this.b, 10, 7, ehn.c($$1));
      }
   }

   @Nullable
   private hz n() {
      akr $$0 = (akr)this.b.dL();
      List<hz> $$1 = hz.a(hz.a(this.b), 2).filter($$1x -> $$0.b($$1x) == 0).collect(Collectors.toList());
      return $$1.isEmpty() ? null : $$1.get($$0.z.a($$1.size()));
   }

   @Nullable
   private gw a(hz $$0) {
      akr $$1 = (akr)this.b.dL();
      buf $$2 = $$1.w();
      List<gw> $$3 = $$2.c($$0x -> true, $$0.q(), 8, buf.b.b).map(bug::f).collect(Collectors.toList());
      return $$3.isEmpty() ? null : $$3.get($$1.z.a($$3.size()));
   }

   private boolean a(cbh $$0) {
      return $$0.a(this.b.dL().V());
   }
}
