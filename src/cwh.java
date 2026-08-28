import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class cwh extends cua {
   private static final MapCodec<chd.d> a = chd.d.a.fieldOf("BucketVariantTag");
   private final bty<?> b;
   private final awf c;

   public cwh(bty<?> $$0, eqs $$1, awf $$2, cvn.a $$3) {
      super($$1, $$3);
      this.b = $$0;
      this.c = $$2;
   }

   @Override
   public void a(@Nullable cnx $$0, dej $$1, cvs $$2, jf $$3) {
      if ($$1 instanceof arj) {
         this.a((arj)$$1, $$2, $$3);
         $$1.a($$0, dzp.t, $$3);
      }
   }

   @Override
   protected void a(@Nullable cnx $$0, dek $$1, jf $$2) {
      $$1.a($$0, $$2, this.c, awh.g, 1.0F, 1.0F);
   }

   private void a(arj $$0, cvs $$1, jf $$2) {
      if (this.b.a($$0, $$1, null, $$2, btx.l, true, false) instanceof cgf $$4) {
         cyh $$5 = $$1.a(ks.S, cyh.a);
         $$4.h($$5.c());
         $$4.x(true);
      }
   }

   @Override
   public void a(cvs $$0, cvn.b $$1, List<xe> $$2, cxk $$3) {
      if (this.b == bty.bg) {
         cyh $$4 = $$0.a(ks.S, cyh.a);
         if ($$4.b()) {
            return;
         }

         Optional<chd.d> $$5 = $$4.a(a).result();
         if ($$5.isPresent()) {
            chd.d $$6 = $$5.get();
            n[] $$7 = new n[]{n.u, n.h};
            String $$8 = "color.minecraft." + $$6.c();
            String $$9 = "color.minecraft." + $$6.d();
            int $$10 = chd.c.indexOf($$6);
            if ($$10 != -1) {
               $$2.add(xe.c(chd.b($$10)).a($$7));
               return;
            }

            $$2.add($$6.b().d().e().a($$7));
            xs $$11 = xe.c($$8);
            if (!$$8.equals($$9)) {
               $$11.f(", ").b(xe.c($$9));
            }

            $$11.a($$7);
            $$2.add($$11);
         }
      }
   }
}
