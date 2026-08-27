import com.mojang.logging.LogUtils;
import java.util.Optional;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ckl extends cmc implements cob {
   private static final Logger d = LogUtils.getLogger();
   public static final String a = "LodestonePos";
   public static final String b = "LodestoneDimension";
   public static final String c = "LodestoneTracked";

   public ckl(cmc.a $$0) {
      super($$0);
   }

   public static boolean d(cmh $$0) {
      sj $$1 = $$0.v();
      return $$1 != null && ($$1.e("LodestoneDimension") || $$1.e("LodestonePos"));
   }

   private static Optional<ags<csy>> c(sj $$0) {
      return csy.g.parse(sx.a, $$0.c("LodestoneDimension")).result();
   }

   @Nullable
   public static id a(sj $$0) {
      boolean $$1 = $$0.e("LodestonePos");
      boolean $$2 = $$0.e("LodestoneDimension");
      if ($$1 && $$2) {
         Optional<ags<csy>> $$3 = c($$0);
         if ($$3.isPresent()) {
            hv $$4 = sy.b($$0.p("LodestonePos"));
            return id.a($$3.get(), $$4);
         }
      }

      return null;
   }

   @Nullable
   public static id a(csy $$0) {
      return $$0.E_().j() ? id.a($$0.ad(), $$0.S()) : null;
   }

   @Override
   public boolean i(cmh $$0) {
      return d($$0) || super.i($$0);
   }

   @Override
   public void a(cmh $$0, csy $$1, blf $$2, int $$3, boolean $$4) {
      if (!$$1.B) {
         if (d($$0)) {
            sj $$5 = $$0.w();
            if ($$5.e("LodestoneTracked") && !$$5.q("LodestoneTracked")) {
               return;
            }

            Optional<ags<csy>> $$6 = c($$5);
            if ($$6.isPresent() && $$6.get() == $$1.ad() && $$5.e("LodestonePos")) {
               hv $$7 = sy.b($$5.p("LodestonePos"));
               if (!$$1.j($$7) || !((amp)$$1).x().a(bxa.s, $$7)) {
                  $$5.r("LodestonePos");
               }
            }
         }
      }
   }

   @Override
   public bjl a(cos $$0) {
      hv $$1 = $$0.a();
      csy $$2 = $$0.q();
      if (!$$2.a_($$1).a(cwb.pq)) {
         return super.a($$0);
      } else {
         $$2.a(null, $$1, arc.nz, ard.h, 1.0F, 1.0F);
         cer $$3 = $$0.o();
         cmh $$4 = $$0.n();
         boolean $$5 = !$$3.fT().d && $$4.L() == 1;
         if ($$5) {
            this.a($$2.ad(), $$1, $$4.w());
         } else {
            cmh $$6 = new cmh(cmk.qP, 1);
            sj $$7 = $$4.u() ? $$4.v().h() : new sj();
            $$6.c($$7);
            if (!$$3.fT().d) {
               $$4.h(1);
            }

            this.a($$2.ad(), $$1, $$7);
            if (!$$3.fS().e($$6)) {
               $$3.a($$6, false);
            }
         }

         return bjl.a($$2.B);
      }
   }

   private void a(ags<csy> $$0, hv $$1, sj $$2) {
      $$2.a("LodestonePos", sy.a($$1));
      csy.g.encodeStart(sx.a, $$0).resultOrPartial(d::error).ifPresent($$1x -> $$2.a("LodestoneDimension", $$1x));
      $$2.a("LodestoneTracked", true);
   }

   @Override
   public String j(cmh $$0) {
      return d($$0) ? "item.minecraft.lodestone_compass" : super.j($$0);
   }
}
