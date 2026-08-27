import com.mojang.logging.LogUtils;
import java.util.Optional;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class cll extends cnb implements cpb {
   private static final Logger d = LogUtils.getLogger();
   public static final String a = "LodestonePos";
   public static final String b = "LodestoneDimension";
   public static final String c = "LodestoneTracked";

   public cll(cnb.a $$0) {
      super($$0);
   }

   public static boolean d(cng $$0) {
      so $$1 = $$0.v();
      return $$1 != null && ($$1.e("LodestoneDimension") || $$1.e("LodestonePos"));
   }

   private static Optional<ahg<ctx>> c(so $$0) {
      return ctx.g.parse(tc.a, $$0.c("LodestoneDimension")).result();
   }

   @Nullable
   public static ig a(so $$0) {
      boolean $$1 = $$0.e("LodestonePos");
      boolean $$2 = $$0.e("LodestoneDimension");
      if ($$1 && $$2) {
         Optional<ahg<ctx>> $$3 = c($$0);
         if ($$3.isPresent()) {
            hx $$4 = td.b($$0.p("LodestonePos"));
            return ig.a($$3.get(), $$4);
         }
      }

      return null;
   }

   @Nullable
   public static ig a(ctx $$0) {
      return $$0.E_().j() ? ig.a($$0.ae(), $$0.T()) : null;
   }

   @Override
   public boolean i(cng $$0) {
      return d($$0) || super.i($$0);
   }

   @Override
   public void a(cng $$0, ctx $$1, blw $$2, int $$3, boolean $$4) {
      if (!$$1.B) {
         if (d($$0)) {
            so $$5 = $$0.w();
            if ($$5.e("LodestoneTracked") && !$$5.q("LodestoneTracked")) {
               return;
            }

            Optional<ahg<ctx>> $$6 = c($$5);
            if ($$6.isPresent() && $$6.get() == $$1.ae() && $$5.e("LodestonePos")) {
               hx $$7 = td.b($$5.p("LodestonePos"));
               if (!$$1.k($$7) || !((ane)$$1).y().a(bxu.s, $$7)) {
                  $$5.r("LodestonePos");
               }
            }
         }
      }
   }

   @Override
   public bkc a(cpr $$0) {
      hx $$1 = $$0.a();
      ctx $$2 = $$0.q();
      if (!$$2.a_($$1).a(cxa.pq)) {
         return super.a($$0);
      } else {
         $$2.a(null, $$1, art.nO, aru.h, 1.0F, 1.0F);
         cfq $$3 = $$0.o();
         cng $$4 = $$0.n();
         boolean $$5 = !$$3.fT().d && $$4.L() == 1;
         if ($$5) {
            this.a($$2.ae(), $$1, $$4.w());
         } else {
            cng $$6 = new cng(cnj.qR, 1);
            so $$7 = $$4.u() ? $$4.v().h() : new so();
            $$6.c($$7);
            if (!$$3.fT().d) {
               $$4.h(1);
            }

            this.a($$2.ae(), $$1, $$7);
            if (!$$3.fS().e($$6)) {
               $$3.a($$6, false);
            }
         }

         return bkc.a($$2.B);
      }
   }

   private void a(ahg<ctx> $$0, hx $$1, so $$2) {
      $$2.a("LodestonePos", td.a($$1));
      ctx.g.encodeStart(tc.a, $$0).resultOrPartial(d::error).ifPresent($$1x -> $$2.a("LodestoneDimension", $$1x));
      $$2.a("LodestoneTracked", true);
   }

   @Override
   public String j(cng $$0) {
      return d($$0) ? "item.minecraft.lodestone_compass" : super.j($$0);
   }
}
