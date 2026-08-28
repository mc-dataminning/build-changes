import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class cxv extends cvs {
   private static final MapCodec<cio.d> a = cio.d.a.fieldOf("BucketVariantTag");
   private final bvi<?> b;
   private final awu c;

   public cxv(bvi<?> $$0, etp $$1, awu $$2, cxc.a $$3) {
      super($$1, $$3);
      this.b = $$0;
      this.c = $$2;
   }

   @Override
   public void a(@Nullable cpo $$0, dgz $$1, cxg $$2, jh $$3) {
      if ($$1 instanceof arx) {
         this.a((arx)$$1, $$2, $$3);
         $$1.a($$0, eck.t, $$3);
      }
   }

   @Override
   protected void a(@Nullable cpo $$0, dha $$1, jh $$2) {
      $$1.a($$0, $$2, this.c, aww.g, 1.0F, 1.0F);
   }

   private void a(arx $$0, cxg $$1, jh $$2) {
      bvb $$3 = this.b.b($$0, bvi.a($$0, $$1, null), $$2, bvh.l, true, false);
      if ($$3 instanceof chq $$4) {
         czp $$5 = $$1.a(ku.X, czp.a);
         $$4.h($$5.d());
         $$4.x(true);
      }

      if ($$3 != null) {
         $$0.a_($$3);
      }
   }

   @Override
   public void a(cxg $$0, cxc.b $$1, List<xk> $$2, cyy $$3) {
      if (this.b == bvi.bA) {
         czp $$4 = $$0.a(ku.X, czp.a);
         if ($$4.c()) {
            return;
         }

         Optional<cio.d> $$5 = $$4.a(a).result();
         if ($$5.isPresent()) {
            cio.d $$6 = $$5.get();
            n[] $$7 = new n[]{n.u, n.h};
            String $$8 = "color.minecraft." + $$6.c();
            String $$9 = "color.minecraft." + $$6.d();
            int $$10 = cio.b.indexOf($$6);
            if ($$10 != -1) {
               $$2.add(xk.c(cio.b($$10)).a($$7));
               return;
            }

            $$2.add($$6.b().d().e().a($$7));
            xy $$11 = xk.c($$8);
            if (!$$8.equals($$9)) {
               $$11.f(", ").b(xk.c($$9));
            }

            $$11.a($$7);
            $$2.add($$11);
         }
      }
   }
}
