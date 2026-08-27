import com.mojang.logging.LogUtils;
import java.util.Optional;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ckv extends cmm implements col {
   private static final Logger d = LogUtils.getLogger();
   public static final String a = "LodestonePos";
   public static final String b = "LodestoneDimension";
   public static final String c = "LodestoneTracked";

   public ckv(cmm.a $$0) {
      super($$0);
   }

   public static boolean d(cmr $$0) {
      sl $$1 = $$0.v();
      return $$1 != null && ($$1.e("LodestoneDimension") || $$1.e("LodestonePos"));
   }

   private static Optional<ahc<cti>> c(sl $$0) {
      return cti.g.parse(sz.a, $$0.c("LodestoneDimension")).result();
   }

   @Nullable
   public static ig a(sl $$0) {
      boolean $$1 = $$0.e("LodestonePos");
      boolean $$2 = $$0.e("LodestoneDimension");
      if ($$1 && $$2) {
         Optional<ahc<cti>> $$3 = c($$0);
         if ($$3.isPresent()) {
            hx $$4 = ta.b($$0.p("LodestonePos"));
            return ig.a($$3.get(), $$4);
         }
      }

      return null;
   }

   @Nullable
   public static ig a(cti $$0) {
      return $$0.E_().j() ? ig.a($$0.ae(), $$0.T()) : null;
   }

   @Override
   public boolean i(cmr $$0) {
      return d($$0) || super.i($$0);
   }

   @Override
   public void a(cmr $$0, cti $$1, blp $$2, int $$3, boolean $$4) {
      if (!$$1.B) {
         if (d($$0)) {
            sl $$5 = $$0.w();
            if ($$5.e("LodestoneTracked") && !$$5.q("LodestoneTracked")) {
               return;
            }

            Optional<ahc<cti>> $$6 = c($$5);
            if ($$6.isPresent() && $$6.get() == $$1.ae() && $$5.e("LodestonePos")) {
               hx $$7 = ta.b($$5.p("LodestonePos"));
               if (!$$1.k($$7) || !((amz)$$1).y().a(bxk.s, $$7)) {
                  $$5.r("LodestonePos");
               }
            }
         }
      }
   }

   @Override
   public bjv a(cpc $$0) {
      hx $$1 = $$0.a();
      cti $$2 = $$0.q();
      if (!$$2.a_($$1).a(cwl.pq)) {
         return super.a($$0);
      } else {
         $$2.a(null, $$1, arm.nz, arn.h, 1.0F, 1.0F);
         cfb $$3 = $$0.o();
         cmr $$4 = $$0.n();
         boolean $$5 = !$$3.fT().d && $$4.L() == 1;
         if ($$5) {
            this.a($$2.ae(), $$1, $$4.w());
         } else {
            cmr $$6 = new cmr(cmu.qP, 1);
            sl $$7 = $$4.u() ? $$4.v().h() : new sl();
            $$6.c($$7);
            if (!$$3.fT().d) {
               $$4.h(1);
            }

            this.a($$2.ae(), $$1, $$7);
            if (!$$3.fS().e($$6)) {
               $$3.a($$6, false);
            }
         }

         return bjv.a($$2.B);
      }
   }

   private void a(ahc<cti> $$0, hx $$1, sl $$2) {
      $$2.a("LodestonePos", ta.a($$1));
      cti.g.encodeStart(sz.a, $$0).resultOrPartial(d::error).ifPresent($$1x -> $$2.a("LodestoneDimension", $$1x));
      $$2.a("LodestoneTracked", true);
   }

   @Override
   public String j(cmr $$0) {
      return d($$0) ? "item.minecraft.lodestone_compass" : super.j($$0);
   }
}
