import java.util.List;
import javax.annotation.Nullable;

public class cnh extends cky {
   private final bly<?> a;
   private final arq b;

   public cnh(bly<?> $$0, eep $$1, arq $$2, cms.a $$3) {
      super($$1, $$3);
      this.a = $$0;
      this.b = $$2;
   }

   @Override
   public void a(@Nullable cfh $$0, cto $$1, cmx $$2, hx $$3) {
      if ($$1 instanceof and) {
         this.a((and)$$1, $$2, $$3);
         $$1.a($$0, dnq.t, $$3);
      }
   }

   @Override
   protected void a(@Nullable cfh $$0, ctp $$1, hx $$2) {
      $$1.a($$0, $$2, this.b, ars.g, 1.0F, 1.0F);
   }

   private void a(and $$0, cmx $$1, hx $$2) {
      if (this.a.a($$0, $$1, null, $$2, bmo.l, true, false) instanceof bxz $$4) {
         $$4.c($$1.w());
         $$4.w(true);
      }
   }

   @Override
   public void a(cmx $$0, @Nullable cto $$1, List<vf> $$2, cop $$3) {
      if (this.a == bly.bd) {
         sn $$4 = $$0.v();
         if ($$4 != null && $$4.b("BucketVariantTag", 3)) {
            int $$5 = $$4.h("BucketVariantTag");
            n[] $$6 = new n[]{n.u, n.h};
            String $$7 = "color.minecraft." + byx.s($$5);
            String $$8 = "color.minecraft." + byx.t($$5);

            for (int $$9 = 0; $$9 < byx.c.size(); $$9++) {
               if ($$5 == byx.c.get($$9).a()) {
                  $$2.add(vf.c(byx.c($$9)).a($$6));
                  return;
               }
            }

            $$2.add(byx.u($$5).d().e().a($$6));
            vt $$10 = vf.c($$7);
            if (!$$7.equals($$8)) {
               $$10.f(", ").b(vf.c($$8));
            }

            $$10.a($$6);
            $$2.add($$10);
         }
      }
   }
}
