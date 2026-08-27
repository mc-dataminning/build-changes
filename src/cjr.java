import java.util.List;
import javax.annotation.Nullable;

public class cjr extends chi {
   private final biw<?> a;
   private final ape b;

   public cjr(biw<?> $$0, ean $$1, ape $$2, cjc.a $$3) {
      super($$1, $$3);
      this.a = $$0;
      this.b = $$2;
   }

   @Override
   public void a(@Nullable cbw $$0, cpx $$1, cjh $$2, gw $$3) {
      if ($$1 instanceof aks) {
         this.a((aks)$$1, $$2, $$3);
         $$1.a($$0, djv.t, $$3);
      }
   }

   @Override
   protected void a(@Nullable cbw $$0, cpy $$1, gw $$2) {
      $$1.a($$0, $$2, this.b, apg.g, 1.0F, 1.0F);
   }

   private void a(aks $$0, cjh $$1, gw $$2) {
      if (this.a.a($$0, $$1, null, $$2, bjm.l, true, false) instanceof buv $$4) {
         $$4.c($$1.w());
         $$4.w(true);
      }
   }

   @Override
   public void a(cjh $$0, @Nullable cpx $$1, List<tn> $$2, cky $$3) {
      if (this.a == biw.bc) {
         qy $$4 = $$0.v();
         if ($$4 != null && $$4.b("BucketVariantTag", 3)) {
            int $$5 = $$4.h("BucketVariantTag");
            n[] $$6 = new n[]{n.u, n.h};
            String $$7 = "color.minecraft." + bvt.s($$5);
            String $$8 = "color.minecraft." + bvt.t($$5);

            for (int $$9 = 0; $$9 < bvt.c.size(); $$9++) {
               if ($$5 == bvt.c.get($$9).a()) {
                  $$2.add(tn.c(bvt.c($$9)).a($$6));
                  return;
               }
            }

            $$2.add(bvt.u($$5).d().d().a($$6));
            ua $$10 = tn.c($$7);
            if (!$$7.equals($$8)) {
               $$10.f(", ").b(tn.c($$8));
            }

            $$10.a($$6);
            $$2.add($$10);
         }
      }
   }
}
