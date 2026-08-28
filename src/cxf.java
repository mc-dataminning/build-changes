import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class cxf extends cvc {
   private static final MapCodec<chz.d> a = chz.d.a.fieldOf("BucketVariantTag");
   private final but<? extends bvk> b;
   private final avz c;

   public cxf(but<? extends bvk> $$0, esz $$1, avz $$2, cwm.a $$3) {
      super($$1, $$3);
      this.b = $$0;
      this.c = $$2;
   }

   @Override
   public void a(@Nullable coy $$0, dgj $$1, cwq $$2, ji $$3) {
      if ($$1 instanceof ard) {
         this.a((ard)$$1, $$2, $$3);
         $$1.a($$0, ebu.t, $$3);
      }
   }

   @Override
   protected void a(@Nullable coy $$0, dgk $$1, ji $$2) {
      $$1.a($$0, $$2, this.c, awb.g, 1.0F, 1.0F);
   }

   private void a(ard $$0, cwq $$1, ji $$2) {
      bvk $$3 = this.b.b($$0, but.a($$0, $$1, null), $$2, bus.l, true, false);
      if ($$3 instanceof chb $$4) {
         cyz $$5 = $$1.a(kv.X, cyz.a);
         $$4.h($$5.d());
         $$4.x(true);
      }

      if ($$3 != null) {
         $$0.a_($$3);
         $$3.U();
      }
   }

   @Override
   public void a(cwq $$0, cwm.b $$1, List<wp> $$2, cyi $$3) {
      if (this.b == but.bz) {
         cyz $$4 = $$0.a(kv.X, cyz.a);
         if ($$4.c()) {
            return;
         }

         Optional<chz.d> $$5 = $$4.a(a).result();
         if ($$5.isPresent()) {
            chz.d $$6 = $$5.get();
            n[] $$7 = new n[]{n.u, n.h};
            String $$8 = "color.minecraft." + $$6.c();
            String $$9 = "color.minecraft." + $$6.d();
            int $$10 = chz.b.indexOf($$6);
            if ($$10 != -1) {
               $$2.add(wp.c(chz.b($$10)).a($$7));
               return;
            }

            $$2.add($$6.b().d().e().a($$7));
            xd $$11 = wp.c($$8);
            if (!$$8.equals($$9)) {
               $$11.f(", ").b(wp.c($$9));
            }

            $$11.a($$7);
            $$2.add($$11);
         }
      }
   }
}
