import com.mojang.logging.LogUtils;
import java.util.Optional;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class chb extends cis implements ckr {
   private static final Logger d = LogUtils.getLogger();
   public static final String a = "LodestonePos";
   public static final String b = "LodestoneDimension";
   public static final String c = "LodestoneTracked";

   public chb(cis.a $$0) {
      super($$0);
   }

   public static boolean d(cix $$0) {
      qr $$1 = $$0.v();
      return $$1 != null && ($$1.e("LodestoneDimension") || $$1.e("LodestonePos"));
   }

   private static Optional<aeq<cpl>> c(qr $$0) {
      return cpl.g.parse(rc.a, $$0.c("LodestoneDimension")).result();
   }

   @Nullable
   public static hd a(qr $$0) {
      boolean $$1 = $$0.e("LodestonePos");
      boolean $$2 = $$0.e("LodestoneDimension");
      if ($$1 && $$2) {
         Optional<aeq<cpl>> $$3 = c($$0);
         if ($$3.isPresent()) {
            gu $$4 = rd.b($$0.p("LodestonePos"));
            return hd.a($$3.get(), $$4);
         }
      }

      return null;
   }

   @Nullable
   public static hd a(cpl $$0) {
      return $$0.x_().j() ? hd.a($$0.ac(), $$0.R()) : null;
   }

   @Override
   public boolean i(cix $$0) {
      return d($$0) || super.i($$0);
   }

   @Override
   public void a(cix $$0, cpl $$1, bii $$2, int $$3, boolean $$4) {
      if (!$$1.B) {
         if (d($$0)) {
            qr $$5 = $$0.w();
            if ($$5.e("LodestoneTracked") && !$$5.q("LodestoneTracked")) {
               return;
            }

            Optional<aeq<cpl>> $$6 = c($$5);
            if ($$6.isPresent() && $$6.get() == $$1.ac() && $$5.e("LodestonePos")) {
               gu $$7 = rd.b($$5.p("LodestonePos"));
               if (!$$1.j($$7) || !((akk)$$1).w().a(bub.s, $$7)) {
                  $$5.r("LodestonePos");
               }
            }
         }
      }
   }

   @Override
   public bgq a(clh $$0) {
      gu $$1 = $$0.a();
      cpl $$2 = $$0.q();
      if (!$$2.a_($$1).a(csm.pq)) {
         return super.a($$0);
      } else {
         $$2.a(null, $$1, aow.mL, aox.h, 1.0F, 1.0F);
         cbm $$3 = $$0.o();
         cix $$4 = $$0.n();
         boolean $$5 = !$$3.fR().d && $$4.L() == 1;
         if ($$5) {
            this.a($$2.ac(), $$1, $$4.w());
         } else {
            cix $$6 = new cix(cja.qe, 1);
            qr $$7 = $$4.u() ? $$4.v().h() : new qr();
            $$6.c($$7);
            if (!$$3.fR().d) {
               $$4.h(1);
            }

            this.a($$2.ac(), $$1, $$7);
            if (!$$3.fQ().e($$6)) {
               $$3.a($$6, false);
            }
         }

         return bgq.a($$2.B);
      }
   }

   private void a(aeq<cpl> $$0, gu $$1, qr $$2) {
      $$2.a("LodestonePos", rd.a($$1));
      cpl.g.encodeStart(rc.a, $$0).resultOrPartial(d::error).ifPresent($$1x -> $$2.a("LodestoneDimension", $$1x));
      $$2.a("LodestoneTracked", true);
   }

   @Override
   public String j(cix $$0) {
      return d($$0) ? "item.minecraft.lodestone_compass" : super.j($$0);
   }
}
