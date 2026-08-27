import java.util.List;
import javax.annotation.Nullable;

public class cqa extends cnt {
   private final bol<?> a;
   private final ato b;

   public cqa(bol<?> $$0, ehq $$1, ato $$2, cpl.a $$3) {
      super($$1, $$3);
      this.a = $$0;
      this.b = $$2;
   }

   @Override
   public void a(@Nullable cia $$0, cwe $$1, cpq $$2, ib $$3) {
      if ($$1 instanceof apa) {
         this.a((apa)$$1, $$2, $$3);
         $$1.a($$0, dqr.t, $$3);
      }
   }

   @Override
   protected void a(@Nullable cia $$0, cwf $$1, ib $$2) {
      $$1.a($$0, $$2, this.b, atq.g, 1.0F, 1.0F);
   }

   private void a(apa $$0, cpq $$1, ib $$2) {
      if (this.a.a($$0, $$1, null, $$2, bpb.l, true, false) instanceof cao $$4) {
         $$4.c($$1.x());
         $$4.w(true);
      }
   }

   @Override
   public void a(cpq $$0, @Nullable cwe $$1, List<vs> $$2, crh $$3) {
      if (this.a == bol.be) {
         sy $$4 = $$0.w();
         if ($$4 != null && $$4.b("BucketVariantTag", 3)) {
            int $$5 = $$4.h("BucketVariantTag");
            n[] $$6 = new n[]{n.u, n.h};
            String $$7 = "color.minecraft." + cbm.t($$5);
            String $$8 = "color.minecraft." + cbm.u($$5);

            for (int $$9 = 0; $$9 < cbm.c.size(); $$9++) {
               if ($$5 == cbm.c.get($$9).a()) {
                  $$2.add(vs.c(cbm.c($$9)).a($$6));
                  return;
               }
            }

            $$2.add(cbm.v($$5).d().e().a($$6));
            wg $$10 = vs.c($$7);
            if (!$$7.equals($$8)) {
               $$10.f(", ").b(vs.c($$8));
            }

            $$10.a($$6);
            $$2.add($$10);
         }
      }
   }
}
