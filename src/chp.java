import com.mojang.logging.LogUtils;
import java.util.Optional;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class chp extends cjg implements clf {
   private static final Logger d = LogUtils.getLogger();
   public static final String a = "LodestonePos";
   public static final String b = "LodestoneDimension";
   public static final String c = "LodestoneTracked";

   public chp(cjg.a $$0) {
      super($$0);
   }

   public static boolean d(cjl $$0) {
      qw $$1 = $$0.v();
      return $$1 != null && ($$1.e("LodestoneDimension") || $$1.e("LodestonePos"));
   }

   private static Optional<aey<cqb>> c(qw $$0) {
      return cqb.g.parse(ri.a, $$0.c("LodestoneDimension")).result();
   }

   @Nullable
   public static hd a(qw $$0) {
      boolean $$1 = $$0.e("LodestonePos");
      boolean $$2 = $$0.e("LodestoneDimension");
      if ($$1 && $$2) {
         Optional<aey<cqb>> $$3 = c($$0);
         if ($$3.isPresent()) {
            gw $$4 = rj.b($$0.p("LodestonePos"));
            return hd.a($$3.get(), $$4);
         }
      }

      return null;
   }

   @Nullable
   public static hd a(cqb $$0) {
      return $$0.C_().j() ? hd.a($$0.ac(), $$0.R()) : null;
   }

   @Override
   public boolean i(cjl $$0) {
      return d($$0) || super.i($$0);
   }

   @Override
   public void a(cjl $$0, cqb $$1, biw $$2, int $$3, boolean $$4) {
      if (!$$1.B) {
         if (d($$0)) {
            qw $$5 = $$0.w();
            if ($$5.e("LodestoneTracked") && !$$5.q("LodestoneTracked")) {
               return;
            }

            Optional<aey<cqb>> $$6 = c($$5);
            if ($$6.isPresent() && $$6.get() == $$1.ac() && $$5.e("LodestonePos")) {
               gw $$7 = rj.b($$5.p("LodestonePos"));
               if (!$$1.j($$7) || !((akt)$$1).w().a(bup.s, $$7)) {
                  $$5.r("LodestonePos");
               }
            }
         }
      }
   }

   @Override
   public bhe a(clv $$0) {
      gw $$1 = $$0.a();
      cqb $$2 = $$0.q();
      if (!$$2.a_($$1).a(cte.pq)) {
         return super.a($$0);
      } else {
         $$2.a(null, $$1, apg.mL, aph.h, 1.0F, 1.0F);
         cca $$3 = $$0.o();
         cjl $$4 = $$0.n();
         boolean $$5 = !$$3.fT().d && $$4.L() == 1;
         if ($$5) {
            this.a($$2.ac(), $$1, $$4.w());
         } else {
            cjl $$6 = new cjl(cjo.qe, 1);
            qw $$7 = $$4.u() ? $$4.v().h() : new qw();
            $$6.c($$7);
            if (!$$3.fT().d) {
               $$4.h(1);
            }

            this.a($$2.ac(), $$1, $$7);
            if (!$$3.fS().e($$6)) {
               $$3.a($$6, false);
            }
         }

         return bhe.a($$2.B);
      }
   }

   private void a(aey<cqb> $$0, gw $$1, qw $$2) {
      $$2.a("LodestonePos", rj.a($$1));
      cqb.g.encodeStart(ri.a, $$0).resultOrPartial(d::error).ifPresent($$1x -> $$2.a("LodestoneDimension", $$1x));
      $$2.a("LodestoneTracked", true);
   }

   @Override
   public String j(cjl $$0) {
      return d($$0) ? "item.minecraft.lodestone_compass" : super.j($$0);
   }
}
