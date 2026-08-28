import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class cul extends csg {
   private static final MapCodec<cfo.d> a = cfo.d.a.fieldOf("BucketVariantTag");
   private final bsj<?> b;
   private final ave c;

   public cul(bsj<?> $$0, eoa $$1, ave $$2, ctv.a $$3) {
      super($$1, $$3);
      this.b = $$0;
      this.c = $$2;
   }

   @Override
   public void a(@Nullable cmh $$0, dcd $$1, cua $$2, ja $$3) {
      if ($$1 instanceof aqk) {
         this.a((aqk)$$1, $$2, $$3);
         $$1.a($$0, dxa.t, $$3);
      }
   }

   @Override
   protected void a(@Nullable cmh $$0, dce $$1, ja $$2) {
      $$1.a($$0, $$2, this.c, avg.g, 1.0F, 1.0F);
   }

   private void a(aqk $$0, cua $$1, ja $$2) {
      if (this.b.a($$0, $$1, null, $$2, btc.l, true, false) instanceof ceq $$4) {
         cwo $$5 = $$1.a(kn.N, cwo.a);
         $$4.c($$5.c());
         $$4.w(true);
      }
   }

   @Override
   public void a(cua $$0, ctv.b $$1, List<wu> $$2, cvt $$3) {
      if (this.b == bsj.bg) {
         cwo $$4 = $$0.a(kn.N, cwo.a);
         if ($$4.b()) {
            return;
         }

         Optional<cfo.d> $$5 = $$4.a(a).result();
         if ($$5.isPresent()) {
            cfo.d $$6 = $$5.get();
            n[] $$7 = new n[]{n.u, n.h};
            String $$8 = "color.minecraft." + $$6.c();
            String $$9 = "color.minecraft." + $$6.d();
            int $$10 = cfo.c.indexOf($$6);
            if ($$10 != -1) {
               $$2.add(wu.c(cfo.c($$10)).a($$7));
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
