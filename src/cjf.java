import com.mojang.logging.LogUtils;
import java.util.Optional;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class cjf extends ckw implements cmv {
   private static final Logger d = LogUtils.getLogger();
   public static final String a = "LodestonePos";
   public static final String b = "LodestoneDimension";
   public static final String c = "LodestoneTracked";

   public cjf(ckw.a $$0) {
      super($$0);
   }

   public static boolean d(clb $$0) {
      rz $$1 = $$0.v();
      return $$1 != null && ($$1.e("LodestoneDimension") || $$1.e("LodestonePos"));
   }

   private static Optional<agf<crs>> c(rz $$0) {
      return crs.g.parse(sn.a, $$0.c("LodestoneDimension")).result();
   }

   @Nullable
   public static ia a(rz $$0) {
      boolean $$1 = $$0.e("LodestonePos");
      boolean $$2 = $$0.e("LodestoneDimension");
      if ($$1 && $$2) {
         Optional<agf<crs>> $$3 = c($$0);
         if ($$3.isPresent()) {
            ht $$4 = so.b($$0.p("LodestonePos"));
            return ia.a($$3.get(), $$4);
         }
      }

      return null;
   }

   @Nullable
   public static ia a(crs $$0) {
      return $$0.D_().j() ? ia.a($$0.ac(), $$0.R()) : null;
   }

   @Override
   public boolean i(clb $$0) {
      return d($$0) || super.i($$0);
   }

   @Override
   public void a(clb $$0, crs $$1, bki $$2, int $$3, boolean $$4) {
      if (!$$1.B) {
         if (d($$0)) {
            rz $$5 = $$0.w();
            if ($$5.e("LodestoneTracked") && !$$5.q("LodestoneTracked")) {
               return;
            }

            Optional<agf<crs>> $$6 = c($$5);
            if ($$6.isPresent() && $$6.get() == $$1.ac() && $$5.e("LodestonePos")) {
               ht $$7 = so.b($$5.p("LodestonePos"));
               if (!$$1.j($$7) || !((ama)$$1).w().a(bwb.s, $$7)) {
                  $$5.r("LodestonePos");
               }
            }
         }
      }
   }

   @Override
   public biq a(cnl $$0) {
      ht $$1 = $$0.a();
      crs $$2 = $$0.q();
      if (!$$2.a_($$1).a(cuv.pq)) {
         return super.a($$0);
      } else {
         $$2.a(null, $$1, aqn.mP, aqo.h, 1.0F, 1.0F);
         cdm $$3 = $$0.o();
         clb $$4 = $$0.n();
         boolean $$5 = !$$3.fT().d && $$4.L() == 1;
         if ($$5) {
            this.a($$2.ac(), $$1, $$4.w());
         } else {
            clb $$6 = new clb(cle.qe, 1);
            rz $$7 = $$4.u() ? $$4.v().h() : new rz();
            $$6.c($$7);
            if (!$$3.fT().d) {
               $$4.h(1);
            }

            this.a($$2.ac(), $$1, $$7);
            if (!$$3.fS().e($$6)) {
               $$3.a($$6, false);
            }
         }

         return biq.a($$2.B);
      }
   }

   private void a(agf<crs> $$0, ht $$1, rz $$2) {
      $$2.a("LodestonePos", so.a($$1));
      crs.g.encodeStart(sn.a, $$0).resultOrPartial(d::error).ifPresent($$1x -> $$2.a("LodestoneDimension", $$1x));
      $$2.a("LodestoneTracked", true);
   }

   @Override
   public String j(clb $$0) {
      return d($$0) ? "item.minecraft.lodestone_compass" : super.j($$0);
   }
}
