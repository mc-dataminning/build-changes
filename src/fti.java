import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import org.slf4j.Logger;

public class fti {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<biu<?>, fth<?>> b = new Object2ObjectOpenHashMap();
   private static final Map<gae.a, fth<fnd>> c = Map.of(gae.a.b, $$0 -> new fyh($$0, false), gae.a.a, $$0 -> new fyh($$0, true));

   private static <T extends biq> void a(biu<? extends T> $$0, fth<T> $$1) {
      b.put($$0, $$1);
   }

   public static Map<biu<?>, ftg<?>> a(fth.a $$0) {
      Builder<biu<?>, ftg<?>> $$1 = ImmutableMap.builder();
      b.forEach(($$2, $$3) -> {
         try {
            $$1.put($$2, $$3.create($$0));
         } catch (Exception var5) {
            throw new IllegalArgumentException("Failed to create model for " + jd.h.b((biu<?>)$$2), var5);
         }
      });
      return $$1.build();
   }

   public static Map<gae.a, ftg<? extends cbu>> b(fth.a $$0) {
      Builder<gae.a, ftg<? extends cbu>> $$1 = ImmutableMap.builder();
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

      for (biu<?> $$1 : jd.h) {
         if ($$1 != biu.bt && !b.containsKey($$1)) {
            a.warn("No renderer registered for {}", jd.h.b($$1));
            $$0 = false;
         }
      }

      return !$$0;
   }

   static {
      a(biu.b, fsg::new);
      a(biu.c, fup::new);
      a(biu.d, fsh::new);
      a(biu.e, fvu::new);
      a(biu.f, fsj::new);
      a(biu.g, fsk::new);
      a(biu.h, fsl::new);
      a(biu.i, fsm::new);
      a(biu.j, fsw.a::new);
      a(biu.k, $$0 -> new fsn($$0, false));
      a(biu.m, fsp::new);
      a(biu.l, $$0 -> new fso($$0, fib.p));
      a(biu.n, fsq::new);
      a(biu.o, $$0 -> new fsn($$0, true));
      a(biu.p, $$0 -> new fum<>($$0, fib.s));
      a(biu.q, fss::new);
      a(biu.r, fst::new);
      a(biu.s, $$0 -> new fum<>($$0, fib.v));
      a(biu.t, fsu::new);
      a(biu.u, fsv::new);
      a(biu.v, fsx::new);
      a(biu.w, $$0 -> new fsr<>($$0, 0.87F, fib.H));
      a(biu.x, fsy::new);
      a(biu.y, fsz::new);
      a(biu.z, fvs::new);
      a(biu.A, fta::new);
      a(biu.E, ftd::new);
      a(biu.F, fte::new);
      a(biu.C, ftc::new);
      a(biu.D, fvs::new);
      a(biu.B, ftb::new);
      a(biu.G, ftk::new);
      a(biu.H, ftj::new);
      a(biu.I, fvs::new);
      a(biu.J, ftl::new);
      a(biu.K, $$0 -> new fvs<>($$0, 1.0F, true));
      a(biu.L, ftm::new);
      a(biu.ag, $$0 -> new fvs<>($$0, 3.0F, true));
      a(biu.M, ftn::new);
      a(biu.bu, fto::new);
      a(biu.N, ftp::new);
      a(biu.O, ftq::new);
      a(biu.P, $$0 -> new fum<>($$0, fib.Z));
      a(biu.Q, ftr::new);
      a(biu.R, $$0 -> new fts($$0, 6.0F));
      a(biu.S, fue::new);
      a(biu.T, $$0 -> new ftt($$0, new fhf<>($$0.a(fib.ae))));
      a(biu.U, ftu::new);
      a(biu.V, ftv::new);
      a(biu.W, ftw::new);
      a(biu.X, $$0 -> new fum<>($$0, fib.ai));
      a(biu.Y, ftx::new);
      a(biu.Z, ftz::new);
      a(biu.aa, fub::new);
      a(biu.ab, fup::new);
      a(biu.ac, fuc::new);
      a(biu.ad, fud::new);
      a(biu.ae, fsw.b::new);
      a(biu.af, fue::new);
      a(biu.ah, fug::new);
      a(biu.ai, fuh::new);
      a(biu.aj, $$0 -> new fuj($$0, fib.ar));
      a(biu.ak, fuk::new);
      a(biu.al, ful::new);
      a(biu.am, fup::new);
      a(biu.an, $$0 -> new fum<>($$0, fib.av));
      a(biu.ao, fuo::new);
      a(biu.ap, $$0 -> new fsr<>($$0, 0.92F, fib.ax));
      a(biu.aq, fuq::new);
      a(biu.ar, fur::new);
      a(biu.as, fus::new);
      a(biu.at, fut::new);
      a(biu.au, fuu::new);
      a(biu.av, fuv::new);
      a(biu.aw, $$0 -> new fuw($$0, fib.aD, fib.aI, fib.aJ, false));
      a(biu.ax, $$0 -> new fuw($$0, fib.aE, fib.aF, fib.aG, false));
      a(biu.ay, fux::new);
      a(biu.az, fuy::new);
      a(biu.aA, fvs::new);
      a(biu.aB, fuz::new);
      a(biu.aC, fva::new);
      a(biu.aD, fvb::new);
      a(biu.aE, fvd::new);
      a(biu.aF, fve::new);
      a(biu.aG, fvg::new);
      a(biu.aH, fvf::new);
      a(biu.aI, fvh::new);
      a(biu.aJ, fvi::new);
      a(biu.aK, $$0 -> new fvz($$0, fib.bi));
      a(biu.aL, fvj::new);
      a(biu.aM, $$0 -> new fvs<>($$0, 0.75F, true));
      a(biu.aN, fvk::new);
      a(biu.aP, fvs::new);
      a(biu.aO, fvl::new);
      a(biu.aQ, $$0 -> new fum<>($$0, fib.bq));
      a(biu.aR, fvm::new);
      a(biu.aS, fvn::new);
      a(biu.aT, $$0 -> new fvo<>($$0, new fhf<>($$0.a(fib.bs))));
      a(biu.aU, fvp::new);
      a(biu.aV, fvq::new);
      a(biu.aW, fvr::new);
      a(biu.aX, fsw.c::new);
      a(biu.aY, fvw::new);
      a(biu.aZ, fvv::new);
      a(biu.ba, $$0 -> new fuj($$0, fib.bB));
      a(biu.bb, fvt::new);
      a(biu.bc, fvx::new);
      a(biu.bd, fvy::new);
      a(biu.be, fwa::new);
      a(biu.bf, fwb::new);
      a(biu.bg, fwc::new);
      a(biu.bi, fwe::new);
      a(biu.bh, fwd::new);
      a(biu.bj, fwf::new);
      a(biu.bk, fwg::new);
      a(biu.bl, fwh::new);
      a(biu.bm, fwi::new);
      a(biu.bn, fwj::new);
      a(biu.bo, fwk::new);
      a(biu.bp, fwl::new);
      a(biu.bq, $$0 -> new fvz($$0, fib.bZ));
      a(biu.br, fwm::new);
      a(biu.bs, $$0 -> new fuw($$0, fib.cf, fib.cg, fib.ch, true));
   }
}
