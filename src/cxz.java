import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class cxz extends cvw {
   private static final MapCodec<cis.d> a = cis.d.a.fieldOf("BucketVariantTag");
   private final bvm<?> b;
   private final axe c;

   public cxz(bvm<?> $$0, eto $$1, axe $$2, cxg.a $$3) {
      super($$1, $$3);
      this.b = $$0;
      this.c = $$2;
   }

   @Override
   public void a(@Nullable cps $$0, dha $$1, cxk $$2, jh $$3) {
      if ($$1 instanceof ash) {
         this.a((ash)$$1, $$2, $$3);
         $$1.a($$0, ecj.t, $$3);
      }
   }

   @Override
   protected void a(@Nullable cps $$0, dhb $$1, jh $$2) {
      $$1.a($$0, $$2, this.c, axg.g, 1.0F, 1.0F);
   }

   private void a(ash $$0, cxk $$1, jh $$2) {
      bvf $$3 = this.b.b($$0, bvm.a($$0, $$1, null), $$2, bvl.l, true, false);
      if ($$3 instanceof chu $$4) {
         czt $$5 = $$1.a(ku.X, czt.a);
         $$4.h($$5.c());
         $$4.x(true);
      }

      if ($$3 != null) {
         $$0.a_($$3);
      }
   }

   @Override
   public void a(cxk $$0, cxg.b $$1, List<xv> $$2, czc $$3) {
      if (this.b == bvm.bA) {
         czt $$4 = $$0.a(ku.X, czt.a);
         if ($$4.b()) {
            return;
         }

         Optional<cis.d> $$5 = $$4.a(a).result();
         if ($$5.isPresent()) {
            cis.d $$6 = $$5.get();
            n[] $$7 = new n[]{n.u, n.h};
            String $$8 = "color.minecraft." + $$6.c();
            String $$9 = "color.minecraft." + $$6.d();
            int $$10 = cis.b.indexOf($$6);
            if ($$10 != -1) {
               $$2.add(xv.c(cis.b($$10)).a($$7));
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
