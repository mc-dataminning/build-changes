import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import org.slf4j.Logger;

public class fue {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<bjx<?>, fud<?>> b = new Object2ObjectOpenHashMap();
   private static final Map<gba.a, fud<fnz>> c = Map.of(gba.a.b, $$0 -> new fzd($$0, false), gba.a.a, $$0 -> new fzd($$0, true));

   private static <T extends bjt> void a(bjx<? extends T> $$0, fud<T> $$1) {
      b.put($$0, $$1);
   }

   public static Map<bjx<?>, fuc<?>> a(fud.a $$0) {
      Builder<bjx<?>, fuc<?>> $$1 = ImmutableMap.builder();
      b.forEach(($$2, $$3) -> {
         try {
            $$1.put($$2, $$3.create($$0));
         } catch (Exception var5) {
            throw new IllegalArgumentException("Failed to create model for " + jy.h.b((bjx<?>)$$2), var5);
         }
      });
      return $$1.build();
   }

   public static Map<gba.a, fuc<? extends ccx>> b(fud.a $$0) {
      Builder<gba.a, fuc<? extends ccx>> $$1 = ImmutableMap.builder();
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

      for (bjx<?> $$1 : jy.h) {
         if ($$1 != bjx.bt && !b.containsKey($$1)) {
            a.warn("No renderer registered for {}", jy.h.b($$1));
            $$0 = false;
         }
      }

      return !$$0;
   }

   static {
      a(bjx.b, ftc::new);
      a(bjx.c, fvl::new);
      a(bjx.d, ftd::new);
      a(bjx.e, fwq::new);
      a(bjx.f, ftf::new);
      a(bjx.g, ftg::new);
      a(bjx.h, fth::new);
      a(bjx.i, fti::new);
      a(bjx.j, fts.a::new);
      a(bjx.k, $$0 -> new ftj($$0, false));
      a(bjx.m, ftl::new);
      a(bjx.l, $$0 -> new ftk($$0, fiv.p));
      a(bjx.n, ftm::new);
      a(bjx.o, $$0 -> new ftj($$0, true));
      a(bjx.p, $$0 -> new fvi<>($$0, fiv.s));
      a(bjx.q, fto::new);
      a(bjx.r, ftp::new);
      a(bjx.s, $$0 -> new fvi<>($$0, fiv.v));
      a(bjx.t, ftq::new);
      a(bjx.u, ftr::new);
      a(bjx.v, ftt::new);
      a(bjx.w, $$0 -> new ftn<>($$0, 0.87F, fiv.H));
      a(bjx.x, ftu::new);
      a(bjx.y, ftv::new);
      a(bjx.z, fwo::new);
      a(bjx.A, ftw::new);
      a(bjx.E, ftz::new);
      a(bjx.F, fua::new);
      a(bjx.C, fty::new);
      a(bjx.D, fwo::new);
      a(bjx.B, ftx::new);
      a(bjx.G, fug::new);
      a(bjx.H, fuf::new);
      a(bjx.I, fwo::new);
      a(bjx.J, fuh::new);
      a(bjx.K, $$0 -> new fwo<>($$0, 1.0F, true));
      a(bjx.L, fui::new);
      a(bjx.ag, $$0 -> new fwo<>($$0, 3.0F, true));
      a(bjx.M, fuj::new);
      a(bjx.bu, fuk::new);
      a(bjx.N, ful::new);
      a(bjx.O, fum::new);
      a(bjx.P, $$0 -> new fvi<>($$0, fiv.Z));
      a(bjx.Q, fun::new);
      a(bjx.R, $$0 -> new fuo($$0, 6.0F));
      a(bjx.S, fva::new);
      a(bjx.T, $$0 -> new fup($$0, new fhz<>($$0.a(fiv.ae))));
      a(bjx.U, fuq::new);
      a(bjx.V, fur::new);
      a(bjx.W, fus::new);
      a(bjx.X, $$0 -> new fvi<>($$0, fiv.ai));
      a(bjx.Y, fut::new);
      a(bjx.Z, fuv::new);
      a(bjx.aa, fux::new);
      a(bjx.ab, fvl::new);
      a(bjx.ac, fuy::new);
      a(bjx.ad, fuz::new);
      a(bjx.ae, fts.b::new);
      a(bjx.af, fva::new);
      a(bjx.ah, fvc::new);
      a(bjx.ai, fvd::new);
      a(bjx.aj, $$0 -> new fvf($$0, fiv.ar));
      a(bjx.ak, fvg::new);
      a(bjx.al, fvh::new);
      a(bjx.am, fvl::new);
      a(bjx.an, $$0 -> new fvi<>($$0, fiv.av));
      a(bjx.ao, fvk::new);
      a(bjx.ap, $$0 -> new ftn<>($$0, 0.92F, fiv.ax));
      a(bjx.aq, fvm::new);
      a(bjx.ar, fvn::new);
      a(bjx.as, fvo::new);
      a(bjx.at, fvp::new);
      a(bjx.au, fvq::new);
      a(bjx.av, fvr::new);
      a(bjx.aw, $$0 -> new fvs($$0, fiv.aD, fiv.aI, fiv.aJ, false));
      a(bjx.ax, $$0 -> new fvs($$0, fiv.aE, fiv.aF, fiv.aG, false));
      a(bjx.ay, fvt::new);
      a(bjx.az, fvu::new);
      a(bjx.aA, fwo::new);
      a(bjx.aB, fvv::new);
      a(bjx.aC, fvw::new);
      a(bjx.aD, fvx::new);
      a(bjx.aE, fvz::new);
      a(bjx.aF, fwa::new);
      a(bjx.aG, fwc::new);
      a(bjx.aH, fwb::new);
      a(bjx.aI, fwd::new);
      a(bjx.aJ, fwe::new);
      a(bjx.aK, $$0 -> new fwv($$0, fiv.bi));
      a(bjx.aL, fwf::new);
      a(bjx.aM, $$0 -> new fwo<>($$0, 0.75F, true));
      a(bjx.aN, fwg::new);
      a(bjx.aP, fwo::new);
      a(bjx.aO, fwh::new);
      a(bjx.aQ, $$0 -> new fvi<>($$0, fiv.bq));
      a(bjx.aR, fwi::new);
      a(bjx.aS, fwj::new);
      a(bjx.aT, $$0 -> new fwk<>($$0, new fhz<>($$0.a(fiv.bs))));
      a(bjx.aU, fwl::new);
      a(bjx.aV, fwm::new);
      a(bjx.aW, fwn::new);
      a(bjx.aX, fts.c::new);
      a(bjx.aY, fws::new);
      a(bjx.aZ, fwr::new);
      a(bjx.ba, $$0 -> new fvf($$0, fiv.bB));
      a(bjx.bb, fwp::new);
      a(bjx.bc, fwt::new);
      a(bjx.bd, fwu::new);
      a(bjx.be, fww::new);
      a(bjx.bf, fwx::new);
      a(bjx.bg, fwy::new);
      a(bjx.bi, fxa::new);
      a(bjx.bh, fwz::new);
      a(bjx.bj, fxb::new);
      a(bjx.bk, fxc::new);
      a(bjx.bl, fxd::new);
      a(bjx.bm, fxe::new);
      a(bjx.bn, fxf::new);
      a(bjx.bo, fxg::new);
      a(bjx.bp, fxh::new);
      a(bjx.bq, $$0 -> new fwv($$0, fiv.bZ));
      a(bjx.br, fxi::new);
      a(bjx.bs, $$0 -> new fvs($$0, fiv.cf, fiv.cg, fiv.ch, true));
   }
}
