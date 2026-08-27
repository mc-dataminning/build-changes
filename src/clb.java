import com.mojang.logging.LogUtils;
import java.util.Optional;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class clb extends cms implements cos {
   private static final Logger d = LogUtils.getLogger();
   public static final String a = "LodestonePos";
   public static final String b = "LodestoneDimension";
   public static final String c = "LodestoneTracked";

   public clb(cms.a $$0) {
      super($$0);
   }

   public static boolean d(cmx $$0) {
      sn $$1 = $$0.v();
      return $$1 != null && ($$1.e("LodestoneDimension") || $$1.e("LodestonePos"));
   }

   private static Optional<ahf<cto>> c(sn $$0) {
      return cto.g.parse(tb.a, $$0.c("LodestoneDimension")).result();
   }

   @Nullable
   public static ig a(sn $$0) {
      boolean $$1 = $$0.e("LodestonePos");
      boolean $$2 = $$0.e("LodestoneDimension");
      if ($$1 && $$2) {
         Optional<ahf<cto>> $$3 = c($$0);
         if ($$3.isPresent()) {
            hx $$4 = tc.b($$0.p("LodestonePos"));
            return ig.a($$3.get(), $$4);
         }
      }

      return null;
   }

   @Nullable
   public static ig a(cto $$0) {
      return $$0.E_().j() ? ig.a($$0.ae(), $$0.T()) : null;
   }

   @Override
   public boolean i(cmx $$0) {
      return d($$0) || super.i($$0);
   }

   @Override
   public void a(cmx $$0, cto $$1, blu $$2, int $$3, boolean $$4) {
      if (!$$1.B) {
         if (d($$0)) {
            sn $$5 = $$0.w();
            if ($$5.e("LodestoneTracked") && !$$5.q("LodestoneTracked")) {
               return;
            }

            Optional<ahf<cto>> $$6 = c($$5);
            if ($$6.isPresent() && $$6.get() == $$1.ae() && $$5.e("LodestonePos")) {
               hx $$7 = tc.b($$5.p("LodestonePos"));
               if (!$$1.k($$7) || !((and)$$1).y().a(bxp.s, $$7)) {
                  $$5.r("LodestonePos");
               }
            }
         }
      }
   }

   @Override
   public bka a(cpi $$0) {
      hx $$1 = $$0.a();
      cto $$2 = $$0.q();
      if (!$$2.a_($$1).a(cwr.pq)) {
         return super.a($$0);
      } else {
         $$2.a(null, $$1, arr.nz, ars.h, 1.0F, 1.0F);
         cfh $$3 = $$0.o();
         cmx $$4 = $$0.n();
         boolean $$5 = !$$3.fT().d && $$4.L() == 1;
         if ($$5) {
            this.a($$2.ae(), $$1, $$4.w());
         } else {
            cmx $$6 = new cmx(cna.qP, 1);
            sn $$7 = $$4.u() ? $$4.v().h() : new sn();
            $$6.c($$7);
            if (!$$3.fT().d) {
               $$4.h(1);
            }

            this.a($$2.ae(), $$1, $$7);
            if (!$$3.fS().e($$6)) {
               $$3.a($$6, false);
            }
         }

         return bka.a($$2.B);
      }
   }

   private void a(ahf<cto> $$0, hx $$1, sn $$2) {
      $$2.a("LodestonePos", tc.a($$1));
      cto.g.encodeStart(tb.a, $$0).resultOrPartial(d::error).ifPresent($$1x -> $$2.a("LodestoneDimension", $$1x));
      $$2.a("LodestoneTracked", true);
   }

   @Override
   public String j(cmx $$0) {
      return d($$0) ? "item.minecraft.lodestone_compass" : super.j($$0);
   }
}
