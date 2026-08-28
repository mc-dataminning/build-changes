import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class cxe extends cvb {
   private static final MapCodec<chx.d> a = chx.d.a.fieldOf("BucketVariantTag");
   private final bur<? extends bvi> b;
   private final avz c;

   public cxe(bur<? extends bvi> $$0, esy $$1, avz $$2, cwl.a $$3) {
      super($$1, $$3);
      this.b = $$0;
      this.c = $$2;
   }

   @Override
   public void a(@Nullable cox $$0, dgi $$1, cwp $$2, ji $$3) {
      if ($$1 instanceof arc) {
         this.a((arc)$$1, $$2, $$3);
         $$1.a($$0, ebt.t, $$3);
      }
   }

   @Override
   protected void a(@Nullable cox $$0, dgj $$1, ji $$2) {
      $$1.a($$0, $$2, this.c, awb.g, 1.0F, 1.0F);
   }

   private void a(arc $$0, cwp $$1, ji $$2) {
      bvi $$3 = this.b.b($$0, bur.a($$0, $$1, null), $$2, buq.l, true, false);
      if ($$3 instanceof cgz $$4) {
         cyy $$5 = $$1.a(kv.X, cyy.a);
         $$4.h($$5.d());
         $$4.x(true);
      }

      if ($$3 != null) {
         $$0.a_($$3);
         $$3.R();
      }
   }

   @Override
   public void a(cwp $$0, cwl.b $$1, List<wo> $$2, cyh $$3) {
      if (this.b == bur.bA) {
         cyy $$4 = $$0.a(kv.X, cyy.a);
         if ($$4.c()) {
            return;
         }

         Optional<chx.d> $$5 = $$4.a(a).result();
         if ($$5.isPresent()) {
            chx.d $$6 = $$5.get();
            n[] $$7 = new n[]{n.u, n.h};
            String $$8 = "color.minecraft." + $$6.c();
            String $$9 = "color.minecraft." + $$6.d();
            int $$10 = chx.b.indexOf($$6);
            if ($$10 != -1) {
               $$2.add(wo.c(chx.b($$10)).a($$7));
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
