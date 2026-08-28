import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class cxb extends cuy {
   private static final MapCodec<chy.d> a = chy.d.a.fieldOf("BucketVariantTag");
   private final bus<?> b;
   private final awm c;

   public cxb(bus<?> $$0, eru $$1, awm $$2, cwi.a $$3) {
      super($$1, $$3);
      this.b = $$0;
      this.c = $$2;
   }

   @Override
   public void a(@Nullable cou $$0, dfm $$1, cwm $$2, jh $$3) {
      if ($$1 instanceof arp) {
         this.a((arp)$$1, $$2, $$3);
         $$1.a($$0, ear.t, $$3);
      }
   }

   @Override
   protected void a(@Nullable cou $$0, dfn $$1, jh $$2) {
      $$1.a($$0, $$2, this.c, awo.g, 1.0F, 1.0F);
   }

   private void a(arp $$0, cwm $$1, jh $$2) {
      bul $$3 = this.b.b($$0, bus.a($$0, $$1, null), $$2, bur.l, true, false);
      if ($$3 instanceof cha $$4) {
         cyv $$5 = $$1.a(ku.X, cyv.a);
         $$4.h($$5.c());
         $$4.x(true);
      }

      if ($$3 != null) {
         $$0.a_($$3);
      }
   }

   @Override
   public void a(cwm $$0, cwi.b $$1, List<xj> $$2, cye $$3) {
      if (this.b == bus.bw) {
         cyv $$4 = $$0.a(ku.X, cyv.a);
         if ($$4.b()) {
            return;
         }

         Optional<chy.d> $$5 = $$4.a(a).result();
         if ($$5.isPresent()) {
            chy.d $$6 = $$5.get();
            n[] $$7 = new n[]{n.u, n.h};
            String $$8 = "color.minecraft." + $$6.c();
            String $$9 = "color.minecraft." + $$6.d();
            int $$10 = chy.b.indexOf($$6);
            if ($$10 != -1) {
               $$2.add(xj.c(chy.b($$10)).a($$7));
               return;
            }

            $$2.add($$6.b().d().e().a($$7));
            xx $$11 = xj.c($$8);
            if (!$$8.equals($$9)) {
               $$11.f(", ").b(xj.c($$9));
            }

            $$11.a($$7);
            $$2.add($$11);
         }
      }
   }
}
