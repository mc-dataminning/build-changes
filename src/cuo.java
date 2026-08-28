import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class cuo extends csj {
   private static final MapCodec<cfs.d> a = cfs.d.a.fieldOf("BucketVariantTag");
   private final bsn<?> b;
   private final avg c;

   public cuo(bsn<?> $$0, eoi $$1, avg $$2, cty.a $$3) {
      super($$1, $$3);
      this.b = $$0;
      this.c = $$2;
   }

   @Override
   public void a(@Nullable cml $$0, dcg $$1, cud $$2, ja $$3) {
      if ($$1 instanceof aqm) {
         this.a((aqm)$$1, $$2, $$3);
         $$1.a($$0, dxh.t, $$3);
      }
   }

   @Override
   protected void a(@Nullable cml $$0, dch $$1, ja $$2) {
      $$1.a($$0, $$2, this.c, avi.g, 1.0F, 1.0F);
   }

   private void a(aqm $$0, cud $$1, ja $$2) {
      if (this.b.a($$0, $$1, null, $$2, btg.l, true, false) instanceof ceu $$4) {
         cwr $$5 = $$1.a(kn.N, cwr.a);
         $$4.c($$5.c());
         $$4.w(true);
      }
   }

   @Override
   public void a(cud $$0, cty.b $$1, List<wu> $$2, cvw $$3) {
      if (this.b == bsn.bg) {
         cwr $$4 = $$0.a(kn.N, cwr.a);
         if ($$4.b()) {
            return;
         }

         Optional<cfs.d> $$5 = $$4.a(a).result();
         if ($$5.isPresent()) {
            cfs.d $$6 = $$5.get();
            n[] $$7 = new n[]{n.u, n.h};
            String $$8 = "color.minecraft." + $$6.c();
            String $$9 = "color.minecraft." + $$6.d();
            int $$10 = cfs.c.indexOf($$6);
            if ($$10 != -1) {
               $$2.add(wu.c(cfs.c($$10)).a($$7));
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
