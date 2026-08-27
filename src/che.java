import com.mojang.logging.LogUtils;
import java.util.Optional;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class che extends civ implements cku {
   private static final Logger d = LogUtils.getLogger();
   public static final String a = "LodestonePos";
   public static final String b = "LodestoneDimension";
   public static final String c = "LodestoneTracked";

   public che(civ.a $$0) {
      super($$0);
   }

   public static boolean d(cja $$0) {
      qu $$1 = $$0.v();
      return $$1 != null && ($$1.e("LodestoneDimension") || $$1.e("LodestonePos"));
   }

   private static Optional<aet<cpq>> c(qu $$0) {
      return cpq.g.parse(rf.a, $$0.c("LodestoneDimension")).result();
   }

   @Nullable
   public static hf a(qu $$0) {
      boolean $$1 = $$0.e("LodestonePos");
      boolean $$2 = $$0.e("LodestoneDimension");
      if ($$1 && $$2) {
         Optional<aet<cpq>> $$3 = c($$0);
         if ($$3.isPresent()) {
            gw $$4 = rg.b($$0.p("LodestonePos"));
            return hf.a($$3.get(), $$4);
         }
      }

      return null;
   }

   @Nullable
   public static hf a(cpq $$0) {
      return $$0.x_().j() ? hf.a($$0.ac(), $$0.R()) : null;
   }

   @Override
   public boolean i(cja $$0) {
      return d($$0) || super.i($$0);
   }

   @Override
   public void a(cja $$0, cpq $$1, bil $$2, int $$3, boolean $$4) {
      if (!$$1.B) {
         if (d($$0)) {
            qu $$5 = $$0.w();
            if ($$5.e("LodestoneTracked") && !$$5.q("LodestoneTracked")) {
               return;
            }

            Optional<aet<cpq>> $$6 = c($$5);
            if ($$6.isPresent() && $$6.get() == $$1.ac() && $$5.e("LodestonePos")) {
               gw $$7 = rg.b($$5.p("LodestonePos"));
               if (!$$1.j($$7) || !((akn)$$1).w().a(bue.s, $$7)) {
                  $$5.r("LodestonePos");
               }
            }
         }
      }
   }

   @Override
   public bgt a(clk $$0) {
      gw $$1 = $$0.a();
      cpq $$2 = $$0.q();
      if (!$$2.a_($$1).a(csr.pq)) {
         return super.a($$0);
      } else {
         $$2.a(null, $$1, aoz.mL, apa.h, 1.0F, 1.0F);
         cbp $$3 = $$0.o();
         cja $$4 = $$0.n();
         boolean $$5 = !$$3.fR().d && $$4.L() == 1;
         if ($$5) {
            this.a($$2.ac(), $$1, $$4.w());
         } else {
            cja $$6 = new cja(cjd.qe, 1);
            qu $$7 = $$4.u() ? $$4.v().h() : new qu();
            $$6.c($$7);
            if (!$$3.fR().d) {
               $$4.h(1);
            }

            this.a($$2.ac(), $$1, $$7);
            if (!$$3.fQ().e($$6)) {
               $$3.a($$6, false);
            }
         }

         return bgt.a($$2.B);
      }
   }

   private void a(aet<cpq> $$0, gw $$1, qu $$2) {
      $$2.a("LodestonePos", rg.a($$1));
      cpq.g.encodeStart(rf.a, $$0).resultOrPartial(d::error).ifPresent($$1x -> $$2.a("LodestoneDimension", $$1x));
      $$2.a("LodestoneTracked", true);
   }

   @Override
   public String j(cja $$0) {
      return d($$0) ? "item.minecraft.lodestone_compass" : super.j($$0);
   }
}
