import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class cva extends csv {
   private static final MapCodec<cgf.d> a = cgf.d.a.fieldOf("BucketVariantTag");
   private final bta<?> b;
   private final avz c;

   public cva(bta<?> $$0, enu $$1, avz $$2, cuk.a $$3) {
      super($$1, $$3);
      this.b = $$0;
      this.c = $$2;
   }

   @Override
   public void a(@Nullable cmx $$0, dby $$1, cup $$2, iz $$3) {
      if ($$1 instanceof arf) {
         this.a((arf)$$1, $$2, $$3);
         $$1.a($$0, dwv.t, $$3);
      }
   }

   @Override
   protected void a(@Nullable cmx $$0, dbz $$1, iz $$2) {
      $$1.a($$0, $$2, this.c, awb.g, 1.0F, 1.0F);
   }

   private void a(arf $$0, cup $$1, iz $$2) {
      if (this.b.a($$0, $$1, null, $$2, btt.l, true, false) instanceof cfh $$4) {
         cxe $$5 = $$1.a(km.N, cxe.a);
         $$4.c($$5.c());
         $$4.w(true);
      }
   }

   @Override
   public void a(cup $$0, cuk.b $$1, List<xp> $$2, cwi $$3) {
      if (this.b == bta.bg) {
         cxe $$4 = $$0.a(km.N, cxe.a);
         if ($$4.b()) {
            return;
         }

         Optional<cgf.d> $$5 = $$4.a(a).result();
         if ($$5.isPresent()) {
            cgf.d $$6 = $$5.get();
            n[] $$7 = new n[]{n.u, n.h};
            String $$8 = "color.minecraft." + $$6.c();
            String $$9 = "color.minecraft." + $$6.d();
            int $$10 = cgf.c.indexOf($$6);
            if ($$10 != -1) {
               $$2.add(xp.c(cgf.c($$10)).a($$7));
               return;
            }

            $$2.add($$6.b().d().e().a($$7));
            yd $$11 = xp.c($$8);
            if (!$$8.equals($$9)) {
               $$11.f(", ").b(xp.c($$9));
            }

            $$11.a($$7);
            $$2.add($$11);
         }
      }
   }
}
