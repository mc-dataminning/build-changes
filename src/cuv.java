import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class cuv extends csq {
   private static final MapCodec<cga.d> a = cga.d.a.fieldOf("BucketVariantTag");
   private final bsv<?> b;
   private final avv c;

   public cuv(bsv<?> $$0, enp $$1, avv $$2, cuf.a $$3) {
      super($$1, $$3);
      this.b = $$0;
      this.c = $$2;
   }

   @Override
   public void a(@Nullable cms $$0, dbt $$1, cuk $$2, iz $$3) {
      if ($$1 instanceof arb) {
         this.a((arb)$$1, $$2, $$3);
         $$1.a($$0, dwq.t, $$3);
      }
   }

   @Override
   protected void a(@Nullable cms $$0, dbu $$1, iz $$2) {
      $$1.a($$0, $$2, this.c, avx.g, 1.0F, 1.0F);
   }

   private void a(arb $$0, cuk $$1, iz $$2) {
      if (this.b.a($$0, $$1, null, $$2, bto.l, true, false) instanceof cfc $$4) {
         cwz $$5 = $$1.a(km.M, cwz.a);
         $$4.c($$5.c());
         $$4.w(true);
      }
   }

   @Override
   public void a(cuk $$0, cuf.b $$1, List<xl> $$2, cwd $$3) {
      if (this.b == bsv.bg) {
         cwz $$4 = $$0.a(km.M, cwz.a);
         if ($$4.b()) {
            return;
         }

         Optional<cga.d> $$5 = $$4.a(a).result();
         if ($$5.isPresent()) {
            cga.d $$6 = $$5.get();
            n[] $$7 = new n[]{n.u, n.h};
            String $$8 = "color.minecraft." + $$6.c();
            String $$9 = "color.minecraft." + $$6.d();
            int $$10 = cga.c.indexOf($$6);
            if ($$10 != -1) {
               $$2.add(xl.c(cga.c($$10)).a($$7));
               return;
            }

            $$2.add($$6.b().d().e().a($$7));
            xz $$11 = xl.c($$8);
            if (!$$8.equals($$9)) {
               $$11.f(", ").b(xl.c($$9));
            }

            $$11.a($$7);
            $$2.add($$11);
         }
      }
   }
}
