import com.mojang.logging.LogUtils;
import java.util.Optional;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class cor extends cqf {
   private static final Logger d = LogUtils.getLogger();
   public static final String a = "LodestonePos";
   public static final String b = "LodestoneDimension";
   public static final String c = "LodestoneTracked";

   public cor(cqf.a $$0) {
      super($$0);
   }

   public static boolean d(cqk $$0) {
      ta $$1 = $$0.w();
      return $$1 != null && ($$1.e("LodestoneDimension") || $$1.e("LodestonePos"));
   }

   private static Optional<ajg<cwz>> c(ta $$0) {
      return cwz.g.parse(to.a, $$0.c("LodestoneDimension")).result();
   }

   @Nullable
   public static ik a(ta $$0) {
      boolean $$1 = $$0.e("LodestonePos");
      boolean $$2 = $$0.e("LodestoneDimension");
      if ($$1 && $$2) {
         Optional<ajg<cwz>> $$3 = c($$0);
         if ($$3.isPresent()) {
            Optional<ib> $$4 = tp.a($$0, "LodestonePos");
            if ($$4.isPresent()) {
               return ik.a($$3.get(), $$4.get());
            }
         }
      }

      return null;
   }

   @Nullable
   public static ik a(cwz $$0) {
      return $$0.D_().j() ? ik.a($$0.ad(), $$0.T()) : null;
   }

   @Override
   public boolean i(cqk $$0) {
      return d($$0) || super.i($$0);
   }

   @Override
   public void a(cqk $$0, cwz $$1, bow $$2, int $$3, boolean $$4) {
      if (!$$1.B) {
         if (d($$0)) {
            ta $$5 = $$0.x();
            if ($$5.e("LodestoneTracked") && !$$5.q("LodestoneTracked")) {
               return;
            }

            Optional<ajg<cwz>> $$6 = c($$5);
            if ($$6.isPresent() && $$6.get() == $$1.ad() && $$5.e("LodestonePos")) {
               Optional<ib> $$7 = tp.a($$5, "LodestonePos");
               if ($$7.isEmpty() || !$$1.k($$7.get()) || !((apf)$$1).y().a(cav.s, $$7.get())) {
                  $$5.r("LodestonePos");
               }
            }
         }
      }
   }

   @Override
   public bnc a(csu $$0) {
      ib $$1 = $$0.a();
      cwz $$2 = $$0.q();
      if (!$$2.a_($$1).a(dac.pq)) {
         return super.a($$0);
      } else {
         $$2.a(null, $$1, aty.nS, atz.h, 1.0F, 1.0F);
         cis $$3 = $$0.o();
         cqk $$4 = $$0.n();
         boolean $$5 = !$$3.fM() && $$4.M() == 1;
         if ($$5) {
            this.a($$2.ad(), $$1, $$4.x());
         } else {
            cqk $$6 = $$4.a(cqn.qR, 1);
            $$4.a(1, $$3);
            this.a($$2.ad(), $$1, $$6.x());
            if (!$$3.fZ().e($$6)) {
               $$3.a($$6, false);
            }
         }

         return bnc.a($$2.B);
      }
   }

   private void a(ajg<cwz> $$0, ib $$1, ta $$2) {
      $$2.a("LodestonePos", tp.a($$1));
      cwz.g.encodeStart(to.a, $$0).resultOrPartial(d::error).ifPresent($$1x -> $$2.a("LodestoneDimension", $$1x));
      $$2.a("LodestoneTracked", true);
   }

   @Override
   public String j(cqk $$0) {
      return d($$0) ? "item.minecraft.lodestone_compass" : super.j($$0);
   }
}
