import com.mojang.logging.LogUtils;
import java.util.Optional;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class cin extends cke implements cmd {
   private static final Logger d = LogUtils.getLogger();
   public static final String a = "LodestonePos";
   public static final String b = "LodestoneDimension";
   public static final String c = "LodestoneTracked";

   public cin(cke.a $$0) {
      super($$0);
   }

   public static boolean d(ckj $$0) {
      rt $$1 = $$0.v();
      return $$1 != null && ($$1.e("LodestoneDimension") || $$1.e("LodestonePos"));
   }

   private static Optional<afv<cqz>> c(rt $$0) {
      return cqz.g.parse(sf.a, $$0.c("LodestoneDimension")).result();
   }

   @Nullable
   public static ia a(rt $$0) {
      boolean $$1 = $$0.e("LodestonePos");
      boolean $$2 = $$0.e("LodestoneDimension");
      if ($$1 && $$2) {
         Optional<afv<cqz>> $$3 = c($$0);
         if ($$3.isPresent()) {
            ht $$4 = sg.b($$0.p("LodestonePos"));
            return ia.a($$3.get(), $$4);
         }
      }

      return null;
   }

   @Nullable
   public static ia a(cqz $$0) {
      return $$0.D_().j() ? ia.a($$0.ac(), $$0.R()) : null;
   }

   @Override
   public boolean i(ckj $$0) {
      return d($$0) || super.i($$0);
   }

   @Override
   public void a(ckj $$0, cqz $$1, bjt $$2, int $$3, boolean $$4) {
      if (!$$1.B) {
         if (d($$0)) {
            rt $$5 = $$0.w();
            if ($$5.e("LodestoneTracked") && !$$5.q("LodestoneTracked")) {
               return;
            }

            Optional<afv<cqz>> $$6 = c($$5);
            if ($$6.isPresent() && $$6.get() == $$1.ac() && $$5.e("LodestonePos")) {
               ht $$7 = sg.b($$5.p("LodestonePos"));
               if (!$$1.j($$7) || !((alq)$$1).w().a(bvm.s, $$7)) {
                  $$5.r("LodestonePos");
               }
            }
         }
      }
   }

   @Override
   public bib a(cmt $$0) {
      ht $$1 = $$0.a();
      cqz $$2 = $$0.q();
      if (!$$2.a_($$1).a(cuc.pq)) {
         return super.a($$0);
      } else {
         $$2.a(null, $$1, aqd.mN, aqe.h, 1.0F, 1.0F);
         ccx $$3 = $$0.o();
         ckj $$4 = $$0.n();
         boolean $$5 = !$$3.fT().d && $$4.L() == 1;
         if ($$5) {
            this.a($$2.ac(), $$1, $$4.w());
         } else {
            ckj $$6 = new ckj(ckm.qe, 1);
            rt $$7 = $$4.u() ? $$4.v().h() : new rt();
            $$6.c($$7);
            if (!$$3.fT().d) {
               $$4.h(1);
            }

            this.a($$2.ac(), $$1, $$7);
            if (!$$3.fS().e($$6)) {
               $$3.a($$6, false);
            }
         }

         return bib.a($$2.B);
      }
   }

   private void a(afv<cqz> $$0, ht $$1, rt $$2) {
      $$2.a("LodestonePos", sg.a($$1));
      cqz.g.encodeStart(sf.a, $$0).resultOrPartial(d::error).ifPresent($$1x -> $$2.a("LodestoneDimension", $$1x));
      $$2.a("LodestoneTracked", true);
   }

   @Override
   public String j(ckj $$0) {
      return d($$0) ? "item.minecraft.lodestone_compass" : super.j($$0);
   }
}
