import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class cub extends crw {
   private static final MapCodec<cfg.d> a = cfg.d.a.fieldOf("BucketVariantTag");
   private final bsc<?> b;
   private final avh c;

   public cub(bsc<?> $$0, emv $$1, avh $$2, ctl.a $$3) {
      super($$1, $$3);
      this.b = $$0;
      this.c = $$2;
   }

   @Override
   public void a(@Nullable cly $$0, daz $$1, ctq $$2, io $$3) {
      if ($$1 instanceof aqn) {
         this.a((aqn)$$1, $$2, $$3);
         $$1.a($$0, dvw.t, $$3);
      }
   }

   @Override
   protected void a(@Nullable cly $$0, dba $$1, io $$2) {
      $$1.a($$0, $$2, this.c, avj.g, 1.0F, 1.0F);
   }

   private void a(aqn $$0, ctq $$1, io $$2) {
      if (this.b.a($$0, $$1, null, $$2, bsu.l, true, false) instanceof cei $$4) {
         cwf $$5 = $$1.a(kb.M, cwf.a);
         $$4.c($$5.c());
         $$4.w(true);
      }
   }

   @Override
   public void a(ctq $$0, ctl.b $$1, List<wx> $$2, cvj $$3) {
      if (this.b == bsc.bg) {
         cwf $$4 = $$0.a(kb.M, cwf.a);
         if ($$4.b()) {
            return;
         }

         Optional<cfg.d> $$5 = $$4.a(a).result();
         if ($$5.isPresent()) {
            cfg.d $$6 = $$5.get();
            n[] $$7 = new n[]{n.u, n.h};
            String $$8 = "color.minecraft." + $$6.c();
            String $$9 = "color.minecraft." + $$6.d();
            int $$10 = cfg.c.indexOf($$6);
            if ($$10 != -1) {
               $$2.add(wx.c(cfg.c($$10)).a($$7));
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
