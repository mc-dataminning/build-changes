import java.util.List;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class brv extends bsq {
   private static final int i = 2;
   private static final int j = 32;
   private static final int k = 10;
   private static final int l = 7;

   public brv(blh $$0, double $$1) {
      super($$0, $$1, 240, false);
   }

   @Nullable
   @Override
   protected eji h() {
      float $$0 = this.b.dL().z.i();
      if (this.b.dL().z.i() < 0.3F) {
         return this.k();
      } else {
         eji $$1;
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
   private eji k() {
      return bvr.a(this.b, 10, 7);
   }

   @Nullable
   private eji l() {
      ama $$0 = (ama)this.b.dL();
      List<ccz> $$1 = $$0.a(bkm.bf, this.b.cG().g(32.0), this::a);
      if ($$1.isEmpty()) {
         return null;
      } else {
         ccz $$2 = $$1.get(this.b.dL().z.a($$1.size()));
         eji $$3 = $$2.dj();
         return bvr.a(this.b, 10, 7, $$3);
      }
   }

   @Nullable
   private eji m() {
      iu $$0 = this.n();
      if ($$0 == null) {
         return null;
      } else {
         ht $$1 = this.a($$0);
         return $$1 == null ? null : bvr.a(this.b, 10, 7, eji.c($$1));
      }
   }

   @Nullable
   private iu n() {
      ama $$0 = (ama)this.b.dL();
      List<iu> $$1 = iu.a(iu.a(this.b), 2).filter($$1x -> $$0.b($$1x) == 0).collect(Collectors.toList());
      return $$1.isEmpty() ? null : $$1.get($$0.z.a($$1.size()));
   }

   @Nullable
   private ht a(iu $$0) {
      ama $$1 = (ama)this.b.dL();
      bvx $$2 = $$1.w();
      List<ht> $$3 = $$2.c($$0x -> true, $$0.q(), 8, bvx.b.b).map(bvy::f).collect(Collectors.toList());
      return $$3.isEmpty() ? null : $$3.get($$1.z.a($$3.size()));
   }

   private boolean a(ccz $$0) {
      return $$0.a(this.b.dL().V());
   }
}
