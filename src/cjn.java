import com.mojang.logging.LogUtils;
import java.util.Optional;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class cjn extends cle implements cnd {
   private static final Logger d = LogUtils.getLogger();
   public static final String a = "LodestonePos";
   public static final String b = "LodestoneDimension";
   public static final String c = "LodestoneTracked";

   public cjn(cle.a $$0) {
      super($$0);
   }

   public static boolean d(clj $$0) {
      rz $$1 = $$0.v();
      return $$1 != null && ($$1.e("LodestoneDimension") || $$1.e("LodestonePos"));
   }

   private static Optional<agh<csa>> c(rz $$0) {
      return csa.g.parse(sn.a, $$0.c("LodestoneDimension")).result();
   }

   @Nullable
   public static ia a(rz $$0) {
      boolean $$1 = $$0.e("LodestonePos");
      boolean $$2 = $$0.e("LodestoneDimension");
      if ($$1 && $$2) {
         Optional<agh<csa>> $$3 = c($$0);
         if ($$3.isPresent()) {
            ht $$4 = so.b($$0.p("LodestonePos"));
            return ia.a($$3.get(), $$4);
         }
      }

      return null;
   }

   @Nullable
   public static ia a(csa $$0) {
      return $$0.D_().j() ? ia.a($$0.ad(), $$0.S()) : null;
   }

   @Override
   public boolean i(clj $$0) {
      return d($$0) || super.i($$0);
   }

   @Override
   public void a(clj $$0, csa $$1, bkq $$2, int $$3, boolean $$4) {
      if (!$$1.B) {
         if (d($$0)) {
            rz $$5 = $$0.w();
            if ($$5.e("LodestoneTracked") && !$$5.q("LodestoneTracked")) {
               return;
            }

            Optional<agh<csa>> $$6 = c($$5);
            if ($$6.isPresent() && $$6.get() == $$1.ad() && $$5.e("LodestonePos")) {
               ht $$7 = so.b($$5.p("LodestonePos"));
               if (!$$1.j($$7) || !((ame)$$1).x().a(bwj.s, $$7)) {
                  $$5.r("LodestonePos");
               }
            }
         }
      }
   }

   @Override
   public bix a(cnt $$0) {
      ht $$1 = $$0.a();
      csa $$2 = $$0.q();
      if (!$$2.a_($$1).a(cvc.pq)) {
         return super.a($$0);
      } else {
         $$2.a(null, $$1, aqr.nf, aqs.h, 1.0F, 1.0F);
         cdu $$3 = $$0.o();
         clj $$4 = $$0.n();
         boolean $$5 = !$$3.fU().d && $$4.L() == 1;
         if ($$5) {
            this.a($$2.ad(), $$1, $$4.w());
         } else {
            clj $$6 = new clj(clm.qP, 1);
            rz $$7 = $$4.u() ? $$4.v().h() : new rz();
            $$6.c($$7);
            if (!$$3.fU().d) {
               $$4.h(1);
            }

            this.a($$2.ad(), $$1, $$7);
            if (!$$3.fT().e($$6)) {
               $$3.a($$6, false);
            }
         }

         return bix.a($$2.B);
      }
   }

   private void a(agh<csa> $$0, ht $$1, rz $$2) {
      $$2.a("LodestonePos", so.a($$1));
      csa.g.encodeStart(sn.a, $$0).resultOrPartial(d::error).ifPresent($$1x -> $$2.a("LodestoneDimension", $$1x));
      $$2.a("LodestoneTracked", true);
   }

   @Override
   public String j(clj $$0) {
      return d($$0) ? "item.minecraft.lodestone_compass" : super.j($$0);
   }
}
