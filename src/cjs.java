import com.mojang.logging.LogUtils;
import java.util.Optional;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class cjs extends clj implements cni {
   private static final Logger d = LogUtils.getLogger();
   public static final String a = "LodestonePos";
   public static final String b = "LodestoneDimension";
   public static final String c = "LodestoneTracked";

   public cjs(clj.a $$0) {
      super($$0);
   }

   public static boolean d(clo $$0) {
      sd $$1 = $$0.v();
      return $$1 != null && ($$1.e("LodestoneDimension") || $$1.e("LodestonePos"));
   }

   private static Optional<agl<csf>> c(sd $$0) {
      return csf.g.parse(sr.a, $$0.c("LodestoneDimension")).result();
   }

   @Nullable
   public static ie a(sd $$0) {
      boolean $$1 = $$0.e("LodestonePos");
      boolean $$2 = $$0.e("LodestoneDimension");
      if ($$1 && $$2) {
         Optional<agl<csf>> $$3 = c($$0);
         if ($$3.isPresent()) {
            hx $$4 = ss.b($$0.p("LodestonePos"));
            return ie.a($$3.get(), $$4);
         }
      }

      return null;
   }

   @Nullable
   public static ie a(csf $$0) {
      return $$0.E_().j() ? ie.a($$0.ad(), $$0.S()) : null;
   }

   @Override
   public boolean i(clo $$0) {
      return d($$0) || super.i($$0);
   }

   @Override
   public void a(clo $$0, csf $$1, bkv $$2, int $$3, boolean $$4) {
      if (!$$1.B) {
         if (d($$0)) {
            sd $$5 = $$0.w();
            if ($$5.e("LodestoneTracked") && !$$5.q("LodestoneTracked")) {
               return;
            }

            Optional<agl<csf>> $$6 = c($$5);
            if ($$6.isPresent() && $$6.get() == $$1.ad() && $$5.e("LodestonePos")) {
               hx $$7 = ss.b($$5.p("LodestonePos"));
               if (!$$1.j($$7) || !((ami)$$1).x().a(bwo.s, $$7)) {
                  $$5.r("LodestonePos");
               }
            }
         }
      }
   }

   @Override
   public bjb a(cny $$0) {
      hx $$1 = $$0.a();
      csf $$2 = $$0.q();
      if (!$$2.a_($$1).a(cvh.pq)) {
         return super.a($$0);
      } else {
         $$2.a(null, $$1, aqv.nf, aqw.h, 1.0F, 1.0F);
         cdz $$3 = $$0.o();
         clo $$4 = $$0.n();
         boolean $$5 = !$$3.fU().d && $$4.L() == 1;
         if ($$5) {
            this.a($$2.ad(), $$1, $$4.w());
         } else {
            clo $$6 = new clo(clr.qP, 1);
            sd $$7 = $$4.u() ? $$4.v().h() : new sd();
            $$6.c($$7);
            if (!$$3.fU().d) {
               $$4.h(1);
            }

            this.a($$2.ad(), $$1, $$7);
            if (!$$3.fT().e($$6)) {
               $$3.a($$6, false);
            }
         }

         return bjb.a($$2.B);
      }
   }

   private void a(agl<csf> $$0, hx $$1, sd $$2) {
      $$2.a("LodestonePos", ss.a($$1));
      csf.g.encodeStart(sr.a, $$0).resultOrPartial(d::error).ifPresent($$1x -> $$2.a("LodestoneDimension", $$1x));
      $$2.a("LodestoneTracked", true);
   }

   @Override
   public String j(clo $$0) {
      return d($$0) ? "item.minecraft.lodestone_compass" : super.j($$0);
   }
}
