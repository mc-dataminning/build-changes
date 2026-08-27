import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class crt extends cpp {
   private static final MapCodec<cdd.d> a = cdd.d.a.fieldOf("BucketVariantTag");
   private final bqb<?> b;
   private final aul c;

   public crt(bqb<?> $$0, ekr $$1, aul $$2, cre.a $$3) {
      super($$1, $$3);
      this.b = $$0;
      this.c = $$2;
   }

   @Override
   public void a(@Nullable cjt $$0, cyx $$1, crj $$2, ib $$3) {
      if ($$1 instanceof aps) {
         this.a((aps)$$1, $$2, $$3);
         $$1.a($$0, dts.t, $$3);
      }
   }

   @Override
   protected void a(@Nullable cjt $$0, cyy $$1, ib $$2) {
      $$1.a($$0, $$2, this.c, aun.g, 1.0F, 1.0F);
   }

   private void a(aps $$0, crj $$1, ib $$2) {
      if (this.b.a($$0, $$1, null, $$2, bqs.l, true, false) instanceof ccf $$4) {
         ctt $$5 = $$1.a(jp.E, ctt.a);
         $$4.c($$5.c());
         $$4.w(true);
      }
   }

   @Override
   public void a(crj $$0, @Nullable cyx $$1, List<wg> $$2, csz $$3) {
      if (this.b == bqb.bf) {
         ctt $$4 = $$0.a(jp.E, ctt.a);
         if ($$4.b()) {
            return;
         }

         Optional<cdd.d> $$5 = $$4.a(a).result();
         if ($$5.isPresent()) {
            cdd.d $$6 = $$5.get();
            n[] $$7 = new n[]{n.u, n.h};
            String $$8 = "color.minecraft." + $$6.c();
            String $$9 = "color.minecraft." + $$6.d();
            int $$10 = cdd.c.indexOf($$6);
            if ($$10 != -1) {
               $$2.add(wg.c(cdd.c($$10)).a($$7));
               return;
            }

            $$2.add($$6.b().d().e().a($$7));
            wu $$11 = wg.c($$8);
            if (!$$8.equals($$9)) {
               $$11.f(", ").b(wg.c($$9));
            }

            $$11.a($$7);
            $$2.add($$11);
         }
      }
   }
}
