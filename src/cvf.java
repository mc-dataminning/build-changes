import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class cvf extends csv {
   private static final MapCodec<cge.d> a = cge.d.a.fieldOf("BucketVariantTag");
   private final bsx<?> b;
   private final avo c;

   public cvf(bsx<?> $$0, epd $$1, avo $$2, cul.a $$3) {
      super($$1, $$3);
      this.b = $$0;
      this.c = $$2;
   }

   @Override
   public void a(@Nullable cmx $$0, dcw $$1, cuq $$2, jd $$3) {
      if ($$1 instanceof aqu) {
         this.a((aqu)$$1, $$2, $$3);
         $$1.a($$0, dxz.t, $$3);
      }
   }

   @Override
   protected void a(@Nullable cmx $$0, dcx $$1, jd $$2) {
      $$1.a($$0, $$2, this.c, avq.g, 1.0F, 1.0F);
   }

   private void a(aqu $$0, cuq $$1, jd $$2) {
      if (this.b.a($$0, $$1, null, $$2, btr.l, true, false) instanceof cfg $$4) {
         cxh $$5 = $$1.a(kq.N, cxh.a);
         $$4.h($$5.c());
         $$4.x(true);
      }
   }

   @Override
   public void a(cuq $$0, cul.b $$1, List<wz> $$2, cwm $$3) {
      if (this.b == bsx.bg) {
         cxh $$4 = $$0.a(kq.N, cxh.a);
         if ($$4.b()) {
            return;
         }

         Optional<cge.d> $$5 = $$4.a(a).result();
         if ($$5.isPresent()) {
            cge.d $$6 = $$5.get();
            n[] $$7 = new n[]{n.u, n.h};
            String $$8 = "color.minecraft." + $$6.c();
            String $$9 = "color.minecraft." + $$6.d();
            int $$10 = cge.c.indexOf($$6);
            if ($$10 != -1) {
               $$2.add(wz.c(cge.c($$10)).a($$7));
               return;
            }

            $$2.add($$6.b().d().e().a($$7));
            xn $$11 = wz.c($$8);
            if (!$$8.equals($$9)) {
               $$11.f(", ").b(wz.c($$9));
            }

            $$11.a($$7);
            $$2.add($$11);
         }
      }
   }
}
