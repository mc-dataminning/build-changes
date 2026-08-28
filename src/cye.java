import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class cye extends cwb {
   private static final MapCodec<cix.d> a = cix.d.a.fieldOf("BucketVariantTag");
   private final bvr<?> b;
   private final axe c;

   public cye(bvr<?> $$0, etw $$1, axe $$2, cxl.a $$3) {
      super($$1, $$3);
      this.b = $$0;
      this.c = $$2;
   }

   @Override
   public void a(@Nullable cpx $$0, dhi $$1, cxp $$2, jh $$3) {
      if ($$1 instanceof ash) {
         this.a((ash)$$1, $$2, $$3);
         $$1.a($$0, ecr.t, $$3);
      }
   }

   @Override
   protected void a(@Nullable cpx $$0, dhj $$1, jh $$2) {
      $$1.a($$0, $$2, this.c, axg.g, 1.0F, 1.0F);
   }

   private void a(ash $$0, cxp $$1, jh $$2) {
      bvk $$3 = this.b.b($$0, bvr.a($$0, $$1, null), $$2, bvq.l, true, false);
      if ($$3 instanceof chz $$4) {
         czy $$5 = $$1.a(ku.X, czy.a);
         $$4.h($$5.c());
         $$4.x(true);
      }

      if ($$3 != null) {
         $$0.a_($$3);
      }
   }

   @Override
   public void a(cxp $$0, cxl.b $$1, List<xv> $$2, czh $$3) {
      if (this.b == bvr.bA) {
         czy $$4 = $$0.a(ku.X, czy.a);
         if ($$4.b()) {
            return;
         }

         Optional<cix.d> $$5 = $$4.a(a).result();
         if ($$5.isPresent()) {
            cix.d $$6 = $$5.get();
            n[] $$7 = new n[]{n.u, n.h};
            String $$8 = "color.minecraft." + $$6.c();
            String $$9 = "color.minecraft." + $$6.d();
            int $$10 = cix.b.indexOf($$6);
            if ($$10 != -1) {
               $$2.add(xv.c(cix.b($$10)).a($$7));
               return;
            }

            $$2.add($$6.b().d().e().a($$7));
            yj $$11 = xv.c($$8);
            if (!$$8.equals($$9)) {
               $$11.f(", ").b(xv.c($$9));
            }

            $$11.a($$7);
            $$2.add($$11);
         }
      }
   }
}
