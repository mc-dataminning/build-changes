import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import org.slf4j.Logger;

public class ftd {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<bip<?>, ftc<?>> b = new Object2ObjectOpenHashMap();
   private static final Map<fzz.a, ftc<fmy>> c = Map.of(fzz.a.b, $$0 -> new fyc($$0, false), fzz.a.a, $$0 -> new fyc($$0, true));

   private static <T extends bil> void a(bip<? extends T> $$0, ftc<T> $$1) {
      b.put($$0, $$1);
   }

   public static Map<bip<?>, ftb<?>> a(ftc.a $$0) {
      Builder<bip<?>, ftb<?>> $$1 = ImmutableMap.builder();
      b.forEach(($$2, $$3) -> {
         try {
            $$1.put($$2, $$3.create($$0));
         } catch (Exception var5) {
            throw new IllegalArgumentException("Failed to create model for " + jd.h.b((bip<?>)$$2), var5);
         }
      });
      return $$1.build();
   }

   public static Map<fzz.a, ftb<? extends cbp>> b(ftc.a $$0) {
      Builder<fzz.a, ftb<? extends cbp>> $$1 = ImmutableMap.builder();
      c.forEach(($$2, $$3) -> {
         try {
            $$1.put($$2, $$3.create($$0));
         } catch (Exception var5) {
            throw new IllegalArgumentException("Failed to create player model for " + $$2, var5);
         }
      });
      return $$1.build();
   }

   public static boolean a() {
      boolean $$0 = true;

      for (bip<?> $$1 : jd.h) {
         if ($$1 != bip.bt && !b.containsKey($$1)) {
            a.warn("No renderer registered for {}", jd.h.b($$1));
            $$0 = false;
         }
      }

      return !$$0;
   }

   static {
      a(bip.b, fsb::new);
      a(bip.c, fuk::new);
      a(bip.d, fsc::new);
      a(bip.e, fvp::new);
      a(bip.f, fse::new);
      a(bip.g, fsf::new);
      a(bip.h, fsg::new);
      a(bip.i, fsh::new);
      a(bip.j, fsr.a::new);
      a(bip.k, $$0 -> new fsi($$0, false));
      a(bip.m, fsk::new);
      a(bip.l, $$0 -> new fsj($$0, fhw.p));
      a(bip.n, fsl::new);
      a(bip.o, $$0 -> new fsi($$0, true));
      a(bip.p, $$0 -> new fuh<>($$0, fhw.s));
      a(bip.q, fsn::new);
      a(bip.r, fso::new);
      a(bip.s, $$0 -> new fuh<>($$0, fhw.v));
      a(bip.t, fsp::new);
      a(bip.u, fsq::new);
      a(bip.v, fss::new);
      a(bip.w, $$0 -> new fsm<>($$0, 0.87F, fhw.H));
      a(bip.x, fst::new);
      a(bip.y, fsu::new);
      a(bip.z, fvn::new);
      a(bip.A, fsv::new);
      a(bip.E, fsy::new);
      a(bip.F, fsz::new);
      a(bip.C, fsx::new);
      a(bip.D, fvn::new);
      a(bip.B, fsw::new);
      a(bip.G, ftf::new);
      a(bip.H, fte::new);
      a(bip.I, fvn::new);
      a(bip.J, ftg::new);
      a(bip.K, $$0 -> new fvn<>($$0, 1.0F, true));
      a(bip.L, fth::new);
      a(bip.ag, $$0 -> new fvn<>($$0, 3.0F, true));
      a(bip.M, fti::new);
      a(bip.bu, ftj::new);
      a(bip.N, ftk::new);
      a(bip.O, ftl::new);
      a(bip.P, $$0 -> new fuh<>($$0, fhw.Z));
      a(bip.Q, ftm::new);
      a(bip.R, $$0 -> new ftn($$0, 6.0F));
      a(bip.S, ftz::new);
      a(bip.T, $$0 -> new fto($$0, new fha<>($$0.a(fhw.ae))));
      a(bip.U, ftp::new);
      a(bip.V, ftq::new);
      a(bip.W, ftr::new);
      a(bip.X, $$0 -> new fuh<>($$0, fhw.ai));
      a(bip.Y, fts::new);
      a(bip.Z, ftu::new);
      a(bip.aa, ftw::new);
      a(bip.ab, fuk::new);
      a(bip.ac, ftx::new);
      a(bip.ad, fty::new);
      a(bip.ae, fsr.b::new);
      a(bip.af, ftz::new);
      a(bip.ah, fub::new);
      a(bip.ai, fuc::new);
      a(bip.aj, $$0 -> new fue($$0, fhw.ar));
      a(bip.ak, fuf::new);
      a(bip.al, fug::new);
      a(bip.am, fuk::new);
      a(bip.an, $$0 -> new fuh<>($$0, fhw.av));
      a(bip.ao, fuj::new);
      a(bip.ap, $$0 -> new fsm<>($$0, 0.92F, fhw.ax));
      a(bip.aq, ful::new);
      a(bip.ar, fum::new);
      a(bip.as, fun::new);
      a(bip.at, fuo::new);
      a(bip.au, fup::new);
      a(bip.av, fuq::new);
      a(bip.aw, $$0 -> new fur($$0, fhw.aD, fhw.aI, fhw.aJ, false));
      a(bip.ax, $$0 -> new fur($$0, fhw.aE, fhw.aF, fhw.aG, false));
      a(bip.ay, fus::new);
      a(bip.az, fut::new);
      a(bip.aA, fvn::new);
      a(bip.aB, fuu::new);
      a(bip.aC, fuv::new);
      a(bip.aD, fuw::new);
      a(bip.aE, fuy::new);
      a(bip.aF, fuz::new);
      a(bip.aG, fvb::new);
      a(bip.aH, fva::new);
      a(bip.aI, fvc::new);
      a(bip.aJ, fvd::new);
      a(bip.aK, $$0 -> new fvu($$0, fhw.bi));
      a(bip.aL, fve::new);
      a(bip.aM, $$0 -> new fvn<>($$0, 0.75F, true));
      a(bip.aN, fvf::new);
      a(bip.aP, fvn::new);
      a(bip.aO, fvg::new);
      a(bip.aQ, $$0 -> new fuh<>($$0, fhw.bq));
      a(bip.aR, fvh::new);
      a(bip.aS, fvi::new);
      a(bip.aT, $$0 -> new fvj<>($$0, new fha<>($$0.a(fhw.bs))));
      a(bip.aU, fvk::new);
      a(bip.aV, fvl::new);
      a(bip.aW, fvm::new);
      a(bip.aX, fsr.c::new);
      a(bip.aY, fvr::new);
      a(bip.aZ, fvq::new);
      a(bip.ba, $$0 -> new fue($$0, fhw.bB));
      a(bip.bb, fvo::new);
      a(bip.bc, fvs::new);
      a(bip.bd, fvt::new);
      a(bip.be, fvv::new);
      a(bip.bf, fvw::new);
      a(bip.bg, fvx::new);
      a(bip.bi, fvz::new);
      a(bip.bh, fvy::new);
      a(bip.bj, fwa::new);
      a(bip.bk, fwb::new);
      a(bip.bl, fwc::new);
      a(bip.bm, fwd::new);
      a(bip.bn, fwe::new);
      a(bip.bo, fwf::new);
      a(bip.bp, fwg::new);
      a(bip.bq, $$0 -> new fvu($$0, fhw.bZ));
      a(bip.br, fwh::new);
      a(bip.bs, $$0 -> new fur($$0, fhw.cf, fhw.cg, fhw.ch, true));
   }
}
