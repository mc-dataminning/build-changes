import com.mojang.logging.LogUtils;
import java.util.Optional;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class cha extends cir implements ckq {
   private static final Logger d = LogUtils.getLogger();
   public static final String a = "LodestonePos";
   public static final String b = "LodestoneDimension";
   public static final String c = "LodestoneTracked";

   public cha(cir.a $$0) {
      super($$0);
   }

   public static boolean d(ciw $$0) {
      qs $$1 = $$0.v();
      return $$1 != null && ($$1.e("LodestoneDimension") || $$1.e("LodestonePos"));
   }

   private static Optional<aeo<cpk>> c(qs $$0) {
      return cpk.g.parse(rd.a, $$0.c("LodestoneDimension")).result();
   }

   @Nullable
   public static he a(qs $$0) {
      boolean $$1 = $$0.e("LodestonePos");
      boolean $$2 = $$0.e("LodestoneDimension");
      if ($$1 && $$2) {
         Optional<aeo<cpk>> $$3 = c($$0);
         if ($$3.isPresent()) {
            gv $$4 = re.b($$0.p("LodestonePos"));
            return he.a($$3.get(), $$4);
         }
      }

      return null;
   }

   @Nullable
   public static he a(cpk $$0) {
      return $$0.x_().j() ? he.a($$0.ac(), $$0.R()) : null;
   }

   @Override
   public boolean i(ciw $$0) {
      return d($$0) || super.i($$0);
   }

   @Override
   public void a(ciw $$0, cpk $$1, big $$2, int $$3, boolean $$4) {
      if (!$$1.B) {
         if (d($$0)) {
            qs $$5 = $$0.w();
            if ($$5.e("LodestoneTracked") && !$$5.q("LodestoneTracked")) {
               return;
            }

            Optional<aeo<cpk>> $$6 = c($$5);
            if ($$6.isPresent() && $$6.get() == $$1.ac() && $$5.e("LodestonePos")) {
               gv $$7 = re.b($$5.p("LodestonePos"));
               if (!$$1.j($$7) || !((aki)$$1).w().a(bua.s, $$7)) {
                  $$5.r("LodestonePos");
               }
            }
         }
      }
   }

   @Override
   public bgo a(clg $$0) {
      gv $$1 = $$0.a();
      cpk $$2 = $$0.q();
      if (!$$2.a_($$1).a(csl.pq)) {
         return super.a($$0);
      } else {
         $$2.a(null, $$1, aou.mL, aov.h, 1.0F, 1.0F);
         cbl $$3 = $$0.o();
         ciw $$4 = $$0.n();
         boolean $$5 = !$$3.fR().d && $$4.L() == 1;
         if ($$5) {
            this.a($$2.ac(), $$1, $$4.w());
         } else {
            ciw $$6 = new ciw(ciz.qe, 1);
            qs $$7 = $$4.u() ? $$4.v().h() : new qs();
            $$6.c($$7);
            if (!$$3.fR().d) {
               $$4.h(1);
            }

            this.a($$2.ac(), $$1, $$7);
            if (!$$3.fQ().e($$6)) {
               $$3.a($$6, false);
            }
         }

         return bgo.a($$2.B);
      }
   }

   private void a(aeo<cpk> $$0, gv $$1, qs $$2) {
      $$2.a("LodestonePos", re.a($$1));
      cpk.g.encodeStart(rd.a, $$0).resultOrPartial(d::error).ifPresent($$1x -> $$2.a("LodestoneDimension", $$1x));
      $$2.a("LodestoneTracked", true);
   }

   @Override
   public String j(ciw $$0) {
      return d($$0) ? "item.minecraft.lodestone_compass" : super.j($$0);
   }
}
