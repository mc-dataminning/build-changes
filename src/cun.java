import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class cun extends csi {
   private static final MapCodec<cfr.d> a = cfr.d.a.fieldOf("BucketVariantTag");
   private final bsm<?> b;
   private final avg c;

   public cun(bsm<?> $$0, eog $$1, avg $$2, ctx.a $$3) {
      super($$1, $$3);
      this.b = $$0;
      this.c = $$2;
   }

   @Override
   public void a(@Nullable cmk $$0, dcf $$1, cuc $$2, ja $$3) {
      if ($$1 instanceof aqm) {
         this.a((aqm)$$1, $$2, $$3);
         $$1.a($$0, dxg.t, $$3);
      }
   }

   @Override
   protected void a(@Nullable cmk $$0, dcg $$1, ja $$2) {
      $$1.a($$0, $$2, this.c, avi.g, 1.0F, 1.0F);
   }

   private void a(aqm $$0, cuc $$1, ja $$2) {
      if (this.b.a($$0, $$1, null, $$2, btf.l, true, false) instanceof cet $$4) {
         cwq $$5 = $$1.a(kn.N, cwq.a);
         $$4.c($$5.c());
         $$4.w(true);
      }
   }

   @Override
   public void a(cuc $$0, ctx.b $$1, List<wu> $$2, cvv $$3) {
      if (this.b == bsm.bg) {
         cwq $$4 = $$0.a(kn.N, cwq.a);
         if ($$4.b()) {
            return;
         }

         Optional<cfr.d> $$5 = $$4.a(a).result();
         if ($$5.isPresent()) {
            cfr.d $$6 = $$5.get();
            n[] $$7 = new n[]{n.u, n.h};
            String $$8 = "color.minecraft." + $$6.c();
            String $$9 = "color.minecraft." + $$6.d();
            int $$10 = cfr.c.indexOf($$6);
            if ($$10 != -1) {
               $$2.add(wu.c(cfr.c($$10)).a($$7));
               return;
            }

            $$2.add($$6.b().d().e().a($$7));
            xi $$11 = wu.c($$8);
            if (!$$8.equals($$9)) {
               $$11.f(", ").b(wu.c($$9));
            }

            $$11.a($$7);
            $$2.add($$11);
         }
      }
   }
}
