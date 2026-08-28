import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class cxw extends cvu {
   private static final MapCodec<cis.d> a = cis.d.a.fieldOf("BucketVariantTag");
   private final bvi<? extends bwa> b;
   private final avz c;

   public cxw(bvi<? extends bwa> $$0, etv $$1, avz $$2, cxd.a $$3) {
      super($$1, $$3);
      this.b = $$0;
      this.c = $$2;
   }

   @Override
   public void a(@Nullable bvy $$0, dgz $$1, cxh $$2, ji $$3) {
      if ($$1 instanceof ard) {
         this.a((ard)$$1, $$2, $$3);
         $$1.a($$0, ecp.t, $$3);
      }
   }

   @Override
   protected void a(@Nullable bvy $$0, dha $$1, ji $$2) {
      $$1.a($$0, $$2, this.c, awb.g, 1.0F, 1.0F);
   }

   private void a(ard $$0, cxh $$1, ji $$2) {
      bwa $$3 = this.b.b($$0, bvi.a($$0, $$1, null), $$2, bvh.l, true, false);
      if ($$3 instanceof chr $$4) {
         czo $$5 = $$1.a(kv.Z, czo.a);
         $$4.h($$5.d());
         $$4.w(true);
      }

      if ($$3 != null) {
         $$0.a_($$3);
         $$3.T();
      }
   }

   @Override
   public void a(cxh $$0, cxd.b $$1, List<wp> $$2, cyx $$3) {
      if (this.b == bvi.bz) {
         czo $$4 = $$0.a(kv.Z, czo.a);
         if ($$4.c()) {
            return;
         }

         Optional<cis.d> $$5 = $$4.a(a).result();
         if ($$5.isPresent()) {
            cis.d $$6 = $$5.get();
            n[] $$7 = new n[]{n.u, n.h};
            String $$8 = "color.minecraft." + $$6.c();
            String $$9 = "color.minecraft." + $$6.d();
            int $$10 = cis.b.indexOf($$6);
            if ($$10 != -1) {
               $$2.add(wp.c(cis.b($$10)).a($$7));
               return;
            }

            $$2.add($$6.b().d().e().a($$7));
            xd $$11 = wp.c($$8);
            if (!$$8.equals($$9)) {
               $$11.f(", ").b(wp.c($$9));
            }

            $$11.a($$7);
            $$2.add($$11);
         }
      }
   }
}
