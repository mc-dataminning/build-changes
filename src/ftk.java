import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import org.slf4j.Logger;

public class ftk {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<biw<?>, ftj<?>> b = new Object2ObjectOpenHashMap();
   private static final Map<gag.a, ftj<fnf>> c = Map.of(gag.a.b, $$0 -> new fyj($$0, false), gag.a.a, $$0 -> new fyj($$0, true));

   private static <T extends bis> void a(biw<? extends T> $$0, ftj<T> $$1) {
      b.put($$0, $$1);
   }

   public static Map<biw<?>, fti<?>> a(ftj.a $$0) {
      Builder<biw<?>, fti<?>> $$1 = ImmutableMap.builder();
      b.forEach(($$2, $$3) -> {
         try {
            $$1.put($$2, $$3.create($$0));
         } catch (Exception var5) {
            throw new IllegalArgumentException("Failed to create model for " + jd.h.b((biw<?>)$$2), var5);
         }
      });
      return $$1.build();
   }

   public static Map<gag.a, fti<? extends cbw>> b(ftj.a $$0) {
      Builder<gag.a, fti<? extends cbw>> $$1 = ImmutableMap.builder();
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

      for (biw<?> $$1 : jd.h) {
         if ($$1 != biw.bt && !b.containsKey($$1)) {
            a.warn("No renderer registered for {}", jd.h.b($$1));
            $$0 = false;
         }
      }

      return !$$0;
   }

   static {
      a(biw.b, fsi::new);
      a(biw.c, fur::new);
      a(biw.d, fsj::new);
      a(biw.e, fvw::new);
      a(biw.f, fsl::new);
      a(biw.g, fsm::new);
      a(biw.h, fsn::new);
      a(biw.i, fso::new);
      a(biw.j, fsy.a::new);
      a(biw.k, $$0 -> new fsp($$0, false));
      a(biw.m, fsr::new);
      a(biw.l, $$0 -> new fsq($$0, fid.p));
      a(biw.n, fss::new);
      a(biw.o, $$0 -> new fsp($$0, true));
      a(biw.p, $$0 -> new fuo<>($$0, fid.s));
      a(biw.q, fsu::new);
      a(biw.r, fsv::new);
      a(biw.s, $$0 -> new fuo<>($$0, fid.v));
      a(biw.t, fsw::new);
      a(biw.u, fsx::new);
      a(biw.v, fsz::new);
      a(biw.w, $$0 -> new fst<>($$0, 0.87F, fid.H));
      a(biw.x, fta::new);
      a(biw.y, ftb::new);
      a(biw.z, fvu::new);
      a(biw.A, ftc::new);
      a(biw.E, ftf::new);
      a(biw.F, ftg::new);
      a(biw.C, fte::new);
      a(biw.D, fvu::new);
      a(biw.B, ftd::new);
      a(biw.G, ftm::new);
      a(biw.H, ftl::new);
      a(biw.I, fvu::new);
      a(biw.J, ftn::new);
      a(biw.K, $$0 -> new fvu<>($$0, 1.0F, true));
      a(biw.L, fto::new);
      a(biw.ag, $$0 -> new fvu<>($$0, 3.0F, true));
      a(biw.M, ftp::new);
      a(biw.bu, ftq::new);
      a(biw.N, ftr::new);
      a(biw.O, fts::new);
      a(biw.P, $$0 -> new fuo<>($$0, fid.Z));
      a(biw.Q, ftt::new);
      a(biw.R, $$0 -> new ftu($$0, 6.0F));
      a(biw.S, fug::new);
      a(biw.T, $$0 -> new ftv($$0, new fhh<>($$0.a(fid.ae))));
      a(biw.U, ftw::new);
      a(biw.V, ftx::new);
      a(biw.W, fty::new);
      a(biw.X, $$0 -> new fuo<>($$0, fid.ai));
      a(biw.Y, ftz::new);
      a(biw.Z, fub::new);
      a(biw.aa, fud::new);
      a(biw.ab, fur::new);
      a(biw.ac, fue::new);
      a(biw.ad, fuf::new);
      a(biw.ae, fsy.b::new);
      a(biw.af, fug::new);
      a(biw.ah, fui::new);
      a(biw.ai, fuj::new);
      a(biw.aj, $$0 -> new ful($$0, fid.ar));
      a(biw.ak, fum::new);
      a(biw.al, fun::new);
      a(biw.am, fur::new);
      a(biw.an, $$0 -> new fuo<>($$0, fid.av));
      a(biw.ao, fuq::new);
      a(biw.ap, $$0 -> new fst<>($$0, 0.92F, fid.ax));
      a(biw.aq, fus::new);
      a(biw.ar, fut::new);
      a(biw.as, fuu::new);
      a(biw.at, fuv::new);
      a(biw.au, fuw::new);
      a(biw.av, fux::new);
      a(biw.aw, $$0 -> new fuy($$0, fid.aD, fid.aI, fid.aJ, false));
      a(biw.ax, $$0 -> new fuy($$0, fid.aE, fid.aF, fid.aG, false));
      a(biw.ay, fuz::new);
      a(biw.az, fva::new);
      a(biw.aA, fvu::new);
      a(biw.aB, fvb::new);
      a(biw.aC, fvc::new);
      a(biw.aD, fvd::new);
      a(biw.aE, fvf::new);
      a(biw.aF, fvg::new);
      a(biw.aG, fvi::new);
      a(biw.aH, fvh::new);
      a(biw.aI, fvj::new);
      a(biw.aJ, fvk::new);
      a(biw.aK, $$0 -> new fwb($$0, fid.bi));
      a(biw.aL, fvl::new);
      a(biw.aM, $$0 -> new fvu<>($$0, 0.75F, true));
      a(biw.aN, fvm::new);
      a(biw.aP, fvu::new);
      a(biw.aO, fvn::new);
      a(biw.aQ, $$0 -> new fuo<>($$0, fid.bq));
      a(biw.aR, fvo::new);
      a(biw.aS, fvp::new);
      a(biw.aT, $$0 -> new fvq<>($$0, new fhh<>($$0.a(fid.bs))));
      a(biw.aU, fvr::new);
      a(biw.aV, fvs::new);
      a(biw.aW, fvt::new);
      a(biw.aX, fsy.c::new);
      a(biw.aY, fvy::new);
      a(biw.aZ, fvx::new);
      a(biw.ba, $$0 -> new ful($$0, fid.bB));
      a(biw.bb, fvv::new);
      a(biw.bc, fvz::new);
      a(biw.bd, fwa::new);
      a(biw.be, fwc::new);
      a(biw.bf, fwd::new);
      a(biw.bg, fwe::new);
      a(biw.bi, fwg::new);
      a(biw.bh, fwf::new);
      a(biw.bj, fwh::new);
      a(biw.bk, fwi::new);
      a(biw.bl, fwj::new);
      a(biw.bm, fwk::new);
      a(biw.bn, fwl::new);
      a(biw.bo, fwm::new);
      a(biw.bp, fwn::new);
      a(biw.bq, $$0 -> new fwb($$0, fid.bZ));
      a(biw.br, fwo::new);
      a(biw.bs, $$0 -> new fuy($$0, fid.cf, fid.cg, fid.ch, true));
   }
}
