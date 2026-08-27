import com.mojang.logging.LogUtils;
import java.util.Optional;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class cnh extends coy {
   private static final Logger d = LogUtils.getLogger();
   public static final String a = "LodestonePos";
   public static final String b = "LodestoneDimension";
   public static final String c = "LodestoneTracked";

   public cnh(coy.a $$0) {
      super($$0);
   }

   public static boolean d(cpd $$0) {
      sw $$1 = $$0.w();
      return $$1 != null && ($$1.e("LodestoneDimension") || $$1.e("LodestonePos"));
   }

   private static Optional<aix<cvr>> c(sw $$0) {
      return cvr.g.parse(tk.a, $$0.c("LodestoneDimension")).result();
   }

   @Nullable
   public static ii a(sw $$0) {
      boolean $$1 = $$0.e("LodestonePos");
      boolean $$2 = $$0.e("LodestoneDimension");
      if ($$1 && $$2) {
         Optional<aix<cvr>> $$3 = c($$0);
         if ($$3.isPresent()) {
            hz $$4 = tl.b($$0.p("LodestonePos"));
            return ii.a($$3.get(), $$4);
         }
      }

      return null;
   }

   @Nullable
   public static ii a(cvr $$0) {
      return $$0.E_().j() ? ii.a($$0.ad(), $$0.T()) : null;
   }

   @Override
   public boolean i(cpd $$0) {
      return d($$0) || super.i($$0);
   }

   @Override
   public void a(cpd $$0, cvr $$1, bnq $$2, int $$3, boolean $$4) {
      if (!$$1.B) {
         if (d($$0)) {
            sw $$5 = $$0.x();
            if ($$5.e("LodestoneTracked") && !$$5.q("LodestoneTracked")) {
               return;
            }

            Optional<aix<cvr>> $$6 = c($$5);
            if ($$6.isPresent() && $$6.get() == $$1.ad() && $$5.e("LodestonePos")) {
               hz $$7 = tl.b($$5.p("LodestonePos"));
               if (!$$1.k($$7) || !((aow)$$1).y().a(bzp.s, $$7)) {
                  $$5.r("LodestonePos");
               }
            }
         }
      }
   }

   @Override
   public blw a(crm $$0) {
      hz $$1 = $$0.a();
      cvr $$2 = $$0.q();
      if (!$$2.a_($$1).a(cyu.pq)) {
         return super.a($$0);
      } else {
         $$2.a(null, $$1, atl.nP, atm.h, 1.0F, 1.0F);
         chl $$3 = $$0.o();
         cpd $$4 = $$0.n();
         boolean $$5 = !$$3.fU().d && $$4.M() == 1;
         if ($$5) {
            this.a($$2.ad(), $$1, $$4.x());
         } else {
            cpd $$6 = new cpd(cpg.qR, 1);
            sw $$7 = $$4.v() ? $$4.w().h() : new sw();
            $$6.c($$7);
            if (!$$3.fU().d) {
               $$4.h(1);
            }

            this.a($$2.ad(), $$1, $$7);
            if (!$$3.fT().e($$6)) {
               $$3.a($$6, false);
            }
         }

         return blw.a($$2.B);
      }
   }

   private void a(aix<cvr> $$0, hz $$1, sw $$2) {
      $$2.a("LodestonePos", tl.a($$1));
      cvr.g.encodeStart(tk.a, $$0).resultOrPartial(d::error).ifPresent($$1x -> $$2.a("LodestoneDimension", $$1x));
      $$2.a("LodestoneTracked", true);
   }

   @Override
   public String j(cpd $$0) {
      return d($$0) ? "item.minecraft.lodestone_compass" : super.j($$0);
   }
}
