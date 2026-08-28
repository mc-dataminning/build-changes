import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class cuy extends cst {
   private static final MapCodec<cgd.d> a = cgd.d.a.fieldOf("BucketVariantTag");
   private final bsy<?> b;
   private final avy c;

   public cuy(bsy<?> $$0, ens $$1, avy $$2, cui.a $$3) {
      super($$1, $$3);
      this.b = $$0;
      this.c = $$2;
   }

   @Override
   public void a(@Nullable cmv $$0, dbw $$1, cun $$2, iz $$3) {
      if ($$1 instanceof are) {
         this.a((are)$$1, $$2, $$3);
         $$1.a($$0, dwt.t, $$3);
      }
   }

   @Override
   protected void a(@Nullable cmv $$0, dbx $$1, iz $$2) {
      $$1.a($$0, $$2, this.c, awa.g, 1.0F, 1.0F);
   }

   private void a(are $$0, cun $$1, iz $$2) {
      if (this.b.a($$0, $$1, null, $$2, btr.l, true, false) instanceof cff $$4) {
         cxc $$5 = $$1.a(km.M, cxc.a);
         $$4.c($$5.c());
         $$4.w(true);
      }
   }

   @Override
   public void a(cun $$0, cui.b $$1, List<xo> $$2, cwg $$3) {
      if (this.b == bsy.bg) {
         cxc $$4 = $$0.a(km.M, cxc.a);
         if ($$4.b()) {
            return;
         }

         Optional<cgd.d> $$5 = $$4.a(a).result();
         if ($$5.isPresent()) {
            cgd.d $$6 = $$5.get();
            n[] $$7 = new n[]{n.u, n.h};
            String $$8 = "color.minecraft." + $$6.c();
            String $$9 = "color.minecraft." + $$6.d();
            int $$10 = cgd.c.indexOf($$6);
            if ($$10 != -1) {
               $$2.add(xo.c(cgd.c($$10)).a($$7));
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
