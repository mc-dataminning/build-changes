import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class csc extends cpy {
   private static final MapCodec<cdi.d> a = cdi.d.a.fieldOf("BucketVariantTag");
   private final bqg<?> b;
   private final aun c;

   public csc(bqg<?> $$0, ela $$1, aun $$2, crn.a $$3) {
      super($$1, $$3);
      this.b = $$0;
      this.c = $$2;
   }

   @Override
   public void a(@Nullable cka $$0, czg $$1, crs $$2, id $$3) {
      if ($$1 instanceof apu) {
         this.a((apu)$$1, $$2, $$3);
         $$1.a($$0, dub.t, $$3);
      }
   }

   @Override
   protected void a(@Nullable cka $$0, czh $$1, id $$2) {
      $$1.a($$0, $$2, this.c, aup.g, 1.0F, 1.0F);
   }

   private void a(apu $$0, crs $$1, id $$2) {
      if (this.b.a($$0, $$1, null, $$2, bqx.l, true, false) instanceof cck $$4) {
         cuc $$5 = $$1.a(jr.E, cuc.a);
         $$4.c($$5.c());
         $$4.w(true);
      }
   }

   @Override
   public void a(crs $$0, @Nullable czg $$1, List<wi> $$2, cti $$3) {
      if (this.b == bqg.bf) {
         cuc $$4 = $$0.a(jr.E, cuc.a);
         if ($$4.b()) {
            return;
         }

         Optional<cdi.d> $$5 = $$4.a(a).result();
         if ($$5.isPresent()) {
            cdi.d $$6 = $$5.get();
            n[] $$7 = new n[]{n.u, n.h};
            String $$8 = "color.minecraft." + $$6.c();
            String $$9 = "color.minecraft." + $$6.d();
            int $$10 = cdi.c.indexOf($$6);
            if ($$10 != -1) {
               $$2.add(wi.c(cdi.c($$10)).a($$7));
               return;
            }

            $$2.add($$6.b().d().e().a($$7));
            ww $$11 = wi.c($$8);
            if (!$$8.equals($$9)) {
               $$11.f(", ").b(wi.c($$9));
            }

            $$11.a($$7);
            $$2.add($$11);
         }
      }
   }
}
