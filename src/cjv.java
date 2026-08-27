import java.util.List;
import javax.annotation.Nullable;

public class cjv extends chm {
   private final bja<?> a;
   private final apf b;

   public cjv(bja<?> $$0, eaf $$1, apf $$2, cjg.a $$3) {
      super($$1, $$3);
      this.a = $$0;
      this.b = $$2;
   }

   @Override
   public void a(@Nullable cca $$0, cqb $$1, cjl $$2, gw $$3) {
      if ($$1 instanceof akt) {
         this.a((akt)$$1, $$2, $$3);
         $$1.a($$0, djn.t, $$3);
      }
   }

   @Override
   protected void a(@Nullable cca $$0, cqc $$1, gw $$2) {
      $$1.a($$0, $$2, this.b, aph.g, 1.0F, 1.0F);
   }

   private void a(akt $$0, cjl $$1, gw $$2) {
      if (this.a.a($$0, $$1, null, $$2, bjq.l, true, false) instanceof buz $$4) {
         $$4.c($$1.w());
         $$4.w(true);
      }
   }

   @Override
   public void a(cjl $$0, @Nullable cqb $$1, List<tl> $$2, clc $$3) {
      if (this.a == bja.bc) {
         qw $$4 = $$0.v();
         if ($$4 != null && $$4.b("BucketVariantTag", 3)) {
            int $$5 = $$4.h("BucketVariantTag");
            n[] $$6 = new n[]{n.u, n.h};
            String $$7 = "color.minecraft." + bvx.s($$5);
            String $$8 = "color.minecraft." + bvx.t($$5);

            for (int $$9 = 0; $$9 < bvx.c.size(); $$9++) {
               if ($$5 == bvx.c.get($$9).a()) {
                  $$2.add(tl.c(bvx.c($$9)).a($$6));
                  return;
               }
            }

            $$2.add(bvx.u($$5).d().e().a($$6));
            tz $$10 = tl.c($$7);
            if (!$$7.equals($$8)) {
               $$10.f(", ").b(tl.c($$8));
            }

            $$10.a($$6);
            $$2.add($$10);
         }
      }
   }
}
