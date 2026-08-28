import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class cvb extends csw {
   private static final MapCodec<cgg.d> a = cgg.d.a.fieldOf("BucketVariantTag");
   private final btb<?> b;
   private final avz c;

   public cvb(btb<?> $$0, env $$1, avz $$2, cul.a $$3) {
      super($$1, $$3);
      this.b = $$0;
      this.c = $$2;
   }

   @Override
   public void a(@Nullable cmy $$0, dbz $$1, cuq $$2, iz $$3) {
      if ($$1 instanceof arf) {
         this.a((arf)$$1, $$2, $$3);
         $$1.a($$0, dww.t, $$3);
      }
   }

   @Override
   protected void a(@Nullable cmy $$0, dca $$1, iz $$2) {
      $$1.a($$0, $$2, this.c, awb.g, 1.0F, 1.0F);
   }

   private void a(arf $$0, cuq $$1, iz $$2) {
      if (this.b.a($$0, $$1, null, $$2, btu.l, true, false) instanceof cfi $$4) {
         cxf $$5 = $$1.a(km.N, cxf.a);
         $$4.c($$5.c());
         $$4.w(true);
      }
   }

   @Override
   public void a(cuq $$0, cul.b $$1, List<xp> $$2, cwj $$3) {
      if (this.b == btb.bg) {
         cxf $$4 = $$0.a(km.N, cxf.a);
         if ($$4.b()) {
            return;
         }

         Optional<cgg.d> $$5 = $$4.a(a).result();
         if ($$5.isPresent()) {
            cgg.d $$6 = $$5.get();
            n[] $$7 = new n[]{n.u, n.h};
            String $$8 = "color.minecraft." + $$6.c();
            String $$9 = "color.minecraft." + $$6.d();
            int $$10 = cgg.c.indexOf($$6);
            if ($$10 != -1) {
               $$2.add(xp.c(cgg.c($$10)).a($$7));
               return;
            }

            $$2.add($$6.b().d().e().a($$7));
            yd $$11 = xp.c($$8);
            if (!$$8.equals($$9)) {
               $$11.f(", ").b(xp.c($$9));
            }

            $$11.a($$7);
            $$2.add($$11);
         }
      }
   }
}
