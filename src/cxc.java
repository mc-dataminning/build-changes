import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class cxc extends cuz {
   private static final MapCodec<chw.d> a = chw.d.a.fieldOf("BucketVariantTag");
   private final buq<? extends bvh> b;
   private final avy c;

   public cxc(buq<? extends bvh> $$0, esw $$1, avy $$2, cwj.a $$3) {
      super($$1, $$3);
      this.b = $$0;
      this.c = $$2;
   }

   @Override
   public void a(@Nullable cov $$0, dgg $$1, cwn $$2, ji $$3) {
      if ($$1 instanceof arc) {
         this.a((arc)$$1, $$2, $$3);
         $$1.a($$0, ebr.t, $$3);
      }
   }

   @Override
   protected void a(@Nullable cov $$0, dgh $$1, ji $$2) {
      $$1.a($$0, $$2, this.c, awa.g, 1.0F, 1.0F);
   }

   private void a(arc $$0, cwn $$1, ji $$2) {
      bvh $$3 = this.b.b($$0, buq.a($$0, $$1, null), $$2, bup.l, true, false);
      if ($$3 instanceof cgy $$4) {
         cyw $$5 = $$1.a(kv.X, cyw.a);
         $$4.h($$5.d());
         $$4.x(true);
      }

      if ($$3 != null) {
         $$0.a_($$3);
         $$3.R();
      }
   }

   @Override
   public void a(cwn $$0, cwj.b $$1, List<wo> $$2, cyf $$3) {
      if (this.b == buq.bz) {
         cyw $$4 = $$0.a(kv.X, cyw.a);
         if ($$4.c()) {
            return;
         }

         Optional<chw.d> $$5 = $$4.a(a).result();
         if ($$5.isPresent()) {
            chw.d $$6 = $$5.get();
            n[] $$7 = new n[]{n.u, n.h};
            String $$8 = "color.minecraft." + $$6.c();
            String $$9 = "color.minecraft." + $$6.d();
            int $$10 = chw.b.indexOf($$6);
            if ($$10 != -1) {
               $$2.add(wo.c(chw.b($$10)).a($$7));
               return;
            }

            $$2.add($$6.b().d().e().a($$7));
            xc $$11 = wo.c($$8);
            if (!$$8.equals($$9)) {
               $$11.f(", ").b(wo.c($$9));
            }

            $$11.a($$7);
            $$2.add($$11);
         }
      }
   }
}
