import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class cso extends cqj {
   private static final MapCodec<cdt.d> a = cdt.d.a.fieldOf("BucketVariantTag");
   private final bqr<?> b;
   private final auy c;

   public cso(bqr<?> $$0, elq $$1, auy $$2, cry.a $$3) {
      super($$1, $$3);
      this.b = $$0;
      this.c = $$2;
   }

   @Override
   public void a(@Nullable ckl $$0, czu $$1, csd $$2, im $$3) {
      if ($$1 instanceof aqe) {
         this.a((aqe)$$1, $$2, $$3);
         $$1.a($$0, dur.t, $$3);
      }
   }

   @Override
   protected void a(@Nullable ckl $$0, czv $$1, im $$2) {
      $$1.a($$0, $$2, this.c, ava.g, 1.0F, 1.0F);
   }

   private void a(aqe $$0, csd $$1, im $$2) {
      if (this.b.a($$0, $$1, null, $$2, bri.l, true, false) instanceof ccv $$4) {
         cuq $$5 = $$1.a(jz.E, cuq.a);
         $$4.c($$5.c());
         $$4.w(true);
      }
   }

   @Override
   public void a(csd $$0, @Nullable czu $$1, List<ws> $$2, ctu $$3) {
      if (this.b == bqr.bf) {
         cuq $$4 = $$0.a(jz.E, cuq.a);
         if ($$4.b()) {
            return;
         }

         Optional<cdt.d> $$5 = $$4.a(a).result();
         if ($$5.isPresent()) {
            cdt.d $$6 = $$5.get();
            n[] $$7 = new n[]{n.u, n.h};
            String $$8 = "color.minecraft." + $$6.c();
            String $$9 = "color.minecraft." + $$6.d();
            int $$10 = cdt.c.indexOf($$6);
            if ($$10 != -1) {
               $$2.add(ws.c(cdt.c($$10)).a($$7));
               return;
            }

            $$2.add($$6.b().d().e().a($$7));
            xg $$11 = ws.c($$8);
            if (!$$8.equals($$9)) {
               $$11.f(", ").b(ws.c($$9));
            }

            $$11.a($$7);
            $$2.add($$11);
         }
      }
   }
}
