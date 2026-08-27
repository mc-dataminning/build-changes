import java.util.List;
import javax.annotation.Nullable;

public class cjp extends chg {
   private final biu<?> a;
   private final apd b;

   public cjp(biu<?> $$0, eal $$1, apd $$2, cja.a $$3) {
      super($$1, $$3);
      this.a = $$0;
      this.b = $$2;
   }

   @Override
   public void a(@Nullable cbu $$0, cpv $$1, cjf $$2, gw $$3) {
      if ($$1 instanceof akr) {
         this.a((akr)$$1, $$2, $$3);
         $$1.a($$0, djt.t, $$3);
      }
   }

   @Override
   protected void a(@Nullable cbu $$0, cpw $$1, gw $$2) {
      $$1.a($$0, $$2, this.b, apf.g, 1.0F, 1.0F);
   }

   private void a(akr $$0, cjf $$1, gw $$2) {
      if (this.a.a($$0, $$1, null, $$2, bjk.l, true, false) instanceof but $$4) {
         $$4.c($$1.w());
         $$4.w(true);
      }
   }

   @Override
   public void a(cjf $$0, @Nullable cpv $$1, List<tm> $$2, ckw $$3) {
      if (this.a == biu.bc) {
         qy $$4 = $$0.v();
         if ($$4 != null && $$4.b("BucketVariantTag", 3)) {
            int $$5 = $$4.h("BucketVariantTag");
            n[] $$6 = new n[]{n.u, n.h};
            String $$7 = "color.minecraft." + bvr.s($$5);
            String $$8 = "color.minecraft." + bvr.t($$5);

            for (int $$9 = 0; $$9 < bvr.c.size(); $$9++) {
               if ($$5 == bvr.c.get($$9).a()) {
                  $$2.add(tm.c(bvr.c($$9)).a($$6));
                  return;
               }
            }

            $$2.add(bvr.u($$5).d().d().a($$6));
            tz $$10 = tm.c($$7);
            if (!$$7.equals($$8)) {
               $$10.f(", ").b(tm.c($$8));
            }

            $$10.a($$6);
            $$2.add($$10);
         }
      }
   }
}
