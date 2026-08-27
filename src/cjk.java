import java.util.List;
import javax.annotation.Nullable;

public class cjk extends chb {
   private final bip<?> a;
   private final aoy b;

   public cjk(bip<?> $$0, eag $$1, aoy $$2, civ.a $$3) {
      super($$1, $$3);
      this.a = $$0;
      this.b = $$2;
   }

   @Override
   public void a(@Nullable cbp $$0, cpq $$1, cja $$2, gw $$3) {
      if ($$1 instanceof akn) {
         this.a((akn)$$1, $$2, $$3);
         $$1.a($$0, djo.t, $$3);
      }
   }

   @Override
   protected void a(@Nullable cbp $$0, cpr $$1, gw $$2) {
      $$1.a($$0, $$2, this.b, apa.g, 1.0F, 1.0F);
   }

   private void a(akn $$0, cja $$1, gw $$2) {
      if (this.a.a($$0, $$1, null, $$2, bjf.l, true, false) instanceof buo $$4) {
         $$4.c($$1.w());
         $$4.w(true);
      }
   }

   @Override
   public void a(cja $$0, @Nullable cpq $$1, List<ti> $$2, ckr $$3) {
      if (this.a == bip.bc) {
         qu $$4 = $$0.v();
         if ($$4 != null && $$4.b("BucketVariantTag", 3)) {
            int $$5 = $$4.h("BucketVariantTag");
            n[] $$6 = new n[]{n.u, n.h};
            String $$7 = "color.minecraft." + bvm.s($$5);
            String $$8 = "color.minecraft." + bvm.t($$5);

            for (int $$9 = 0; $$9 < bvm.c.size(); $$9++) {
               if ($$5 == bvm.c.get($$9).a()) {
                  $$2.add(ti.c(bvm.c($$9)).a($$6));
                  return;
               }
            }

            $$2.add(bvm.u($$5).d().d().a($$6));
            tv $$10 = ti.c($$7);
            if (!$$7.equals($$8)) {
               $$10.f(", ").b(ti.c($$8));
            }

            $$10.a($$6);
            $$2.add($$10);
         }
      }
   }
}
