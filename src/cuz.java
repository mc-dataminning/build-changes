import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class cuz extends csu {
   private static final MapCodec<cge.d> a = cge.d.a.fieldOf("BucketVariantTag");
   private final bsz<?> b;
   private final avy c;

   public cuz(bsz<?> $$0, ent $$1, avy $$2, cuj.a $$3) {
      super($$1, $$3);
      this.b = $$0;
      this.c = $$2;
   }

   @Override
   public void a(@Nullable cmw $$0, dbx $$1, cuo $$2, iz $$3) {
      if ($$1 instanceof are) {
         this.a((are)$$1, $$2, $$3);
         $$1.a($$0, dwu.t, $$3);
      }
   }

   @Override
   protected void a(@Nullable cmw $$0, dby $$1, iz $$2) {
      $$1.a($$0, $$2, this.c, awa.g, 1.0F, 1.0F);
   }

   private void a(are $$0, cuo $$1, iz $$2) {
      if (this.b.a($$0, $$1, null, $$2, bts.l, true, false) instanceof cfg $$4) {
         cxd $$5 = $$1.a(km.N, cxd.a);
         $$4.c($$5.c());
         $$4.w(true);
      }
   }

   @Override
   public void a(cuo $$0, cuj.b $$1, List<xo> $$2, cwh $$3) {
      if (this.b == bsz.bg) {
         cxd $$4 = $$0.a(km.N, cxd.a);
         if ($$4.b()) {
            return;
         }

         Optional<cge.d> $$5 = $$4.a(a).result();
         if ($$5.isPresent()) {
            cge.d $$6 = $$5.get();
            n[] $$7 = new n[]{n.u, n.h};
            String $$8 = "color.minecraft." + $$6.c();
            String $$9 = "color.minecraft." + $$6.d();
            int $$10 = cge.c.indexOf($$6);
            if ($$10 != -1) {
               $$2.add(xo.c(cge.c($$10)).a($$7));
               return;
            }

            $$2.add($$6.b().d().e().a($$7));
            yc $$11 = xo.c($$8);
            if (!$$8.equals($$9)) {
               $$11.f(", ").b(xo.c($$9));
            }

            $$11.a($$7);
            $$2.add($$11);
         }
      }
   }
}
