import java.util.List;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class bvh extends bwc {
   private static final int i = 2;
   private static final int j = 32;
   private static final int k = 10;
   private static final int l = 7;

   public bvh(boq $$0, double $$1) {
      super($$0, $$1, 240, false);
   }

   @Nullable
   @Override
   protected enz h() {
      float $$0 = this.b.dM().z.i();
      if (this.b.dM().z.i() < 0.3F) {
         return this.k();
      } else {
         enz $$1;
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
   private enz k() {
      return bzf.a(this.b, 10, 7);
   }

   @Nullable
   private enz l() {
      aow $$0 = (aow)this.b.dM();
      List<cgy> $$1 = $$0.a(bnw.bh, this.b.cH().g(32.0), this::a);
      if ($$1.isEmpty()) {
         return null;
      } else {
         cgy $$2 = $$1.get(this.b.dM().z.a($$1.size()));
         enz $$3 = $$2.dk();
         return bzf.a(this.b, 10, 7, $$3);
      }
   }

   @Nullable
   private enz m() {
      jb $$0 = this.n();
      if ($$0 == null) {
         return null;
      } else {
         hz $$1 = this.a($$0);
         return $$1 == null ? null : bzf.a(this.b, 10, 7, enz.c($$1));
      }
   }

   @Nullable
   private jb n() {
      aow $$0 = (aow)this.b.dM();
      List<jb> $$1 = jb.a(jb.a(this.b), 2).filter($$1x -> $$0.b($$1x) == 0).collect(Collectors.toList());
      return $$1.isEmpty() ? null : $$1.get($$0.z.a($$1.size()));
   }

   @Nullable
   private hz a(jb $$0) {
      aow $$1 = (aow)this.b.dM();
      bzl $$2 = $$1.y();
      List<hz> $$3 = $$2.c($$0x -> true, $$0.q(), 8, bzl.b.b).map(bzm::f).collect(Collectors.toList());
      return $$3.isEmpty() ? null : $$3.get($$1.z.a($$3.size()));
   }

   private boolean a(cgy $$0) {
      return $$0.a(this.b.dM().X());
   }
}
