import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class ctz extends cru {
   private static final MapCodec<cfe.d> a = cfe.d.a.fieldOf("BucketVariantTag");
   private final bsa<?> b;
   private final avg c;

   public ctz(bsa<?> $$0, emt $$1, avg $$2, ctj.a $$3) {
      super($$1, $$3);
      this.b = $$0;
      this.c = $$2;
   }

   @Override
   public void a(@Nullable clw $$0, dax $$1, cto $$2, io $$3) {
      if ($$1 instanceof aqm) {
         this.a((aqm)$$1, $$2, $$3);
         $$1.a($$0, dvu.t, $$3);
      }
   }

   @Override
   protected void a(@Nullable clw $$0, day $$1, io $$2) {
      $$1.a($$0, $$2, this.c, avi.g, 1.0F, 1.0F);
   }

   private void a(aqm $$0, cto $$1, io $$2) {
      if (this.b.a($$0, $$1, null, $$2, bss.l, true, false) instanceof ceg $$4) {
         cwd $$5 = $$1.a(kb.M, cwd.a);
         $$4.c($$5.c());
         $$4.w(true);
      }
   }

   @Override
   public void a(cto $$0, @Nullable dax $$1, List<wx> $$2, cvh $$3) {
      if (this.b == bsa.bg) {
         cwd $$4 = $$0.a(kb.M, cwd.a);
         if ($$4.b()) {
            return;
         }

         Optional<cfe.d> $$5 = $$4.a(a).result();
         if ($$5.isPresent()) {
            cfe.d $$6 = $$5.get();
            n[] $$7 = new n[]{n.u, n.h};
            String $$8 = "color.minecraft." + $$6.c();
            String $$9 = "color.minecraft." + $$6.d();
            int $$10 = cfe.c.indexOf($$6);
            if ($$10 != -1) {
               $$2.add(wx.c(cfe.c($$10)).a($$7));
               return;
            }

            $$2.add($$6.b().d().e().a($$7));
            xl $$11 = wx.c($$8);
            if (!$$8.equals($$9)) {
               $$11.f(", ").b(wx.c($$9));
            }

            $$11.a($$7);
            $$2.add($$11);
         }
      }
   }
}
