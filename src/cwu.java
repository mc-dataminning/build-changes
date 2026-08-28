import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class cwu extends cur {
   private static final MapCodec<chv.d> a = chv.d.a.fieldOf("BucketVariantTag");
   private final bup<?> b;
   private final awn c;

   public cwu(bup<?> $$0, ern $$1, awn $$2, cwb.a $$3) {
      super($$1, $$3);
      this.b = $$0;
      this.c = $$2;
   }

   @Override
   public void a(@Nullable cor $$0, dff $$1, cwf $$2, jh $$3) {
      if ($$1 instanceof arq) {
         this.a((arq)$$1, $$2, $$3);
         $$1.a($$0, eak.t, $$3);
      }
   }

   @Override
   protected void a(@Nullable cor $$0, dfg $$1, jh $$2) {
      $$1.a($$0, $$2, this.c, awp.g, 1.0F, 1.0F);
   }

   private void a(arq $$0, cwf $$1, jh $$2) {
      bui $$3 = this.b.b($$0, bup.a($$0, $$1, null), $$2, buo.l, true, false);
      if ($$3 instanceof cgx $$4) {
         cyo $$5 = $$1.a(ku.X, cyo.a);
         $$4.h($$5.c());
         $$4.x(true);
      }

      if ($$3 != null) {
         $$0.a_($$3);
      }
   }

   @Override
   public void a(cwf $$0, cwb.b $$1, List<xl> $$2, cxx $$3) {
      if (this.b == bup.bg) {
         cyo $$4 = $$0.a(ku.X, cyo.a);
         if ($$4.b()) {
            return;
         }

         Optional<chv.d> $$5 = $$4.a(a).result();
         if ($$5.isPresent()) {
            chv.d $$6 = $$5.get();
            n[] $$7 = new n[]{n.u, n.h};
            String $$8 = "color.minecraft." + $$6.c();
            String $$9 = "color.minecraft." + $$6.d();
            int $$10 = chv.c.indexOf($$6);
            if ($$10 != -1) {
               $$2.add(xl.c(chv.b($$10)).a($$7));
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
