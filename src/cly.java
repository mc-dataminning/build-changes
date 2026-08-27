import java.util.List;
import javax.annotation.Nullable;

public class cly extends cjp {
   private final bkz<?> a;
   private final aqu b;

   public cly(bkz<?> $$0, ecw $$1, aqu $$2, clj.a $$3) {
      super($$1, $$3);
      this.a = $$0;
      this.b = $$2;
   }

   @Override
   public void a(@Nullable cdz $$0, csf $$1, clo $$2, hx $$3) {
      if ($$1 instanceof ami) {
         this.a((ami)$$1, $$2, $$3);
         $$1.a($$0, dlx.t, $$3);
      }
   }

   @Override
   protected void a(@Nullable cdz $$0, csg $$1, hx $$2) {
      $$1.a($$0, $$2, this.b, aqw.g, 1.0F, 1.0F);
   }

   private void a(ami $$0, clo $$1, hx $$2) {
      if (this.a.a($$0, $$1, null, $$2, blp.l, true, false) instanceof bwy $$4) {
         $$4.c($$1.w());
         $$4.w(true);
      }
   }

   @Override
   public void a(clo $$0, @Nullable csf $$1, List<uv> $$2, cnf $$3) {
      if (this.a == bkz.bc) {
         sd $$4 = $$0.v();
         if ($$4 != null && $$4.b("BucketVariantTag", 3)) {
            int $$5 = $$4.h("BucketVariantTag");
            n[] $$6 = new n[]{n.u, n.h};
            String $$7 = "color.minecraft." + bxw.s($$5);
            String $$8 = "color.minecraft." + bxw.t($$5);

            for (int $$9 = 0; $$9 < bxw.c.size(); $$9++) {
               if ($$5 == bxw.c.get($$9).a()) {
                  $$2.add(uv.c(bxw.c($$9)).a($$6));
                  return;
               }
            }

            $$2.add(bxw.u($$5).d().e().a($$6));
            vj $$10 = uv.c($$7);
            if (!$$7.equals($$8)) {
               $$10.f(", ").b(uv.c($$8));
            }

            $$10.a($$6);
            $$2.add($$10);
         }
      }
   }
}
