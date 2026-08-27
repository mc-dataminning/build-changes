import com.mojang.logging.LogUtils;
import java.util.Optional;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class chl extends cjc implements clb {
   private static final Logger d = LogUtils.getLogger();
   public static final String a = "LodestonePos";
   public static final String b = "LodestoneDimension";
   public static final String c = "LodestoneTracked";

   public chl(cjc.a $$0) {
      super($$0);
   }

   public static boolean d(cjh $$0) {
      qy $$1 = $$0.v();
      return $$1 != null && ($$1.e("LodestoneDimension") || $$1.e("LodestonePos"));
   }

   private static Optional<aex<cpx>> c(qy $$0) {
      return cpx.g.parse(rk.a, $$0.c("LodestoneDimension")).result();
   }

   @Nullable
   public static hf a(qy $$0) {
      boolean $$1 = $$0.e("LodestonePos");
      boolean $$2 = $$0.e("LodestoneDimension");
      if ($$1 && $$2) {
         Optional<aex<cpx>> $$3 = c($$0);
         if ($$3.isPresent()) {
            gw $$4 = rl.b($$0.p("LodestonePos"));
            return hf.a($$3.get(), $$4);
         }
      }

      return null;
   }

   @Nullable
   public static hf a(cpx $$0) {
      return $$0.C_().j() ? hf.a($$0.ac(), $$0.R()) : null;
   }

   @Override
   public boolean i(cjh $$0) {
      return d($$0) || super.i($$0);
   }

   @Override
   public void a(cjh $$0, cpx $$1, bis $$2, int $$3, boolean $$4) {
      if (!$$1.B) {
         if (d($$0)) {
            qy $$5 = $$0.w();
            if ($$5.e("LodestoneTracked") && !$$5.q("LodestoneTracked")) {
               return;
            }

            Optional<aex<cpx>> $$6 = c($$5);
            if ($$6.isPresent() && $$6.get() == $$1.ac() && $$5.e("LodestonePos")) {
               gw $$7 = rl.b($$5.p("LodestonePos"));
               if (!$$1.j($$7) || !((aks)$$1).w().a(bul.s, $$7)) {
                  $$5.r("LodestonePos");
               }
            }
         }
      }
   }

   @Override
   public bha a(clr $$0) {
      gw $$1 = $$0.a();
      cpx $$2 = $$0.q();
      if (!$$2.a_($$1).a(csy.pq)) {
         return super.a($$0);
      } else {
         $$2.a(null, $$1, apf.mL, apg.h, 1.0F, 1.0F);
         cbw $$3 = $$0.o();
         cjh $$4 = $$0.n();
         boolean $$5 = !$$3.fS().d && $$4.L() == 1;
         if ($$5) {
            this.a($$2.ac(), $$1, $$4.w());
         } else {
            cjh $$6 = new cjh(cjk.qe, 1);
            qy $$7 = $$4.u() ? $$4.v().h() : new qy();
            $$6.c($$7);
            if (!$$3.fS().d) {
               $$4.h(1);
            }

            this.a($$2.ac(), $$1, $$7);
            if (!$$3.fR().e($$6)) {
               $$3.a($$6, false);
            }
         }

         return bha.a($$2.B);
      }
   }

   private void a(aex<cpx> $$0, gw $$1, qy $$2) {
      $$2.a("LodestonePos", rl.a($$1));
      cpx.g.encodeStart(rk.a, $$0).resultOrPartial(d::error).ifPresent($$1x -> $$2.a("LodestoneDimension", $$1x));
      $$2.a("LodestoneTracked", true);
   }

   @Override
   public String j(cjh $$0) {
      return d($$0) ? "item.minecraft.lodestone_compass" : super.j($$0);
   }
}
