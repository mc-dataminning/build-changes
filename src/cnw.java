import com.mojang.logging.LogUtils;
import java.util.Optional;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class cnw extends cpl {
   private static final Logger d = LogUtils.getLogger();
   public static final String a = "LodestonePos";
   public static final String b = "LodestoneDimension";
   public static final String c = "LodestoneTracked";

   public cnw(cpl.a $$0) {
      super($$0);
   }

   public static boolean d(cpq $$0) {
      sy $$1 = $$0.w();
      return $$1 != null && ($$1.e("LodestoneDimension") || $$1.e("LodestonePos"));
   }

   private static Optional<ajb<cwe>> c(sy $$0) {
      return cwe.g.parse(tm.a, $$0.c("LodestoneDimension")).result();
   }

   @Nullable
   public static ik a(sy $$0) {
      boolean $$1 = $$0.e("LodestonePos");
      boolean $$2 = $$0.e("LodestoneDimension");
      if ($$1 && $$2) {
         Optional<ajb<cwe>> $$3 = c($$0);
         if ($$3.isPresent()) {
            ib $$4 = tn.b($$0.p("LodestonePos"));
            return ik.a($$3.get(), $$4);
         }
      }

      return null;
   }

   @Nullable
   public static ik a(cwe $$0) {
      return $$0.E_().j() ? ik.a($$0.ad(), $$0.T()) : null;
   }

   @Override
   public boolean i(cpq $$0) {
      return d($$0) || super.i($$0);
   }

   @Override
   public void a(cpq $$0, cwe $$1, bof $$2, int $$3, boolean $$4) {
      if (!$$1.B) {
         if (d($$0)) {
            sy $$5 = $$0.x();
            if ($$5.e("LodestoneTracked") && !$$5.q("LodestoneTracked")) {
               return;
            }

            Optional<ajb<cwe>> $$6 = c($$5);
            if ($$6.isPresent() && $$6.get() == $$1.ad() && $$5.e("LodestonePos")) {
               ib $$7 = tn.b($$5.p("LodestonePos"));
               if (!$$1.k($$7) || !((apa)$$1).y().a(cae.s, $$7)) {
                  $$5.r("LodestonePos");
               }
            }
         }
      }
   }

   @Override
   public bml a(crz $$0) {
      ib $$1 = $$0.a();
      cwe $$2 = $$0.q();
      if (!$$2.a_($$1).a(czh.pq)) {
         return super.a($$0);
      } else {
         $$2.a(null, $$1, atp.nP, atq.h, 1.0F, 1.0F);
         cia $$3 = $$0.o();
         cpq $$4 = $$0.n();
         boolean $$5 = !$$3.fW().d && $$4.M() == 1;
         if ($$5) {
            this.a($$2.ad(), $$1, $$4.x());
         } else {
            cpq $$6 = $$4.a(cpt.qR, 1);
            if (!$$3.fW().d) {
               $$4.h(1);
            }

            this.a($$2.ad(), $$1, $$6.x());
            if (!$$3.fV().e($$6)) {
               $$3.a($$6, false);
            }
         }

         return bml.a($$2.B);
      }
   }

   private void a(ajb<cwe> $$0, ib $$1, sy $$2) {
      $$2.a("LodestonePos", tn.a($$1));
      cwe.g.encodeStart(tm.a, $$0).resultOrPartial(d::error).ifPresent($$1x -> $$2.a("LodestoneDimension", $$1x));
      $$2.a("LodestoneTracked", true);
   }

   @Override
   public String j(cpq $$0) {
      return d($$0) ? "item.minecraft.lodestone_compass" : super.j($$0);
   }
}
