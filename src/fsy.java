import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import org.slf4j.Logger;

public class fsy {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<bim<?>, fsx<?>> b = new Object2ObjectOpenHashMap();
   private static final Map<fzu.a, fsx<fmt>> c = Map.of(fzu.a.b, $$0 -> new fxx($$0, false), fzu.a.a, $$0 -> new fxx($$0, true));

   private static <T extends bii> void a(bim<? extends T> $$0, fsx<T> $$1) {
      b.put($$0, $$1);
   }

   public static Map<bim<?>, fsw<?>> a(fsx.a $$0) {
      Builder<bim<?>, fsw<?>> $$1 = ImmutableMap.builder();
      b.forEach(($$2, $$3) -> {
         try {
            $$1.put($$2, $$3.create($$0));
         } catch (Exception var5) {
            throw new IllegalArgumentException("Failed to create model for " + jb.h.b((bim<?>)$$2), var5);
         }
      });
      return $$1.build();
   }

   public static Map<fzu.a, fsw<? extends cbm>> b(fsx.a $$0) {
      Builder<fzu.a, fsw<? extends cbm>> $$1 = ImmutableMap.builder();
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

      for (bim<?> $$1 : jb.h) {
         if ($$1 != bim.bt && !b.containsKey($$1)) {
            a.warn("No renderer registered for {}", jb.h.b($$1));
            $$0 = false;
         }
      }

      return !$$0;
   }

   static {
      a(bim.b, frw::new);
      a(bim.c, fuf::new);
      a(bim.d, frx::new);
      a(bim.e, fvk::new);
      a(bim.f, frz::new);
      a(bim.g, fsa::new);
      a(bim.h, fsb::new);
      a(bim.i, fsc::new);
      a(bim.j, fsm.a::new);
      a(bim.k, $$0 -> new fsd($$0, false));
      a(bim.m, fsf::new);
      a(bim.l, $$0 -> new fse($$0, fhr.p));
      a(bim.n, fsg::new);
      a(bim.o, $$0 -> new fsd($$0, true));
      a(bim.p, $$0 -> new fuc<>($$0, fhr.s));
      a(bim.q, fsi::new);
      a(bim.r, fsj::new);
      a(bim.s, $$0 -> new fuc<>($$0, fhr.v));
      a(bim.t, fsk::new);
      a(bim.u, fsl::new);
      a(bim.v, fsn::new);
      a(bim.w, $$0 -> new fsh<>($$0, 0.87F, fhr.H));
      a(bim.x, fso::new);
      a(bim.y, fsp::new);
      a(bim.z, fvi::new);
      a(bim.A, fsq::new);
      a(bim.E, fst::new);
      a(bim.F, fsu::new);
      a(bim.C, fss::new);
      a(bim.D, fvi::new);
      a(bim.B, fsr::new);
      a(bim.G, fta::new);
      a(bim.H, fsz::new);
      a(bim.I, fvi::new);
      a(bim.J, ftb::new);
      a(bim.K, $$0 -> new fvi<>($$0, 1.0F, true));
      a(bim.L, ftc::new);
      a(bim.ag, $$0 -> new fvi<>($$0, 3.0F, true));
      a(bim.M, ftd::new);
      a(bim.bu, fte::new);
      a(bim.N, ftf::new);
      a(bim.O, ftg::new);
      a(bim.P, $$0 -> new fuc<>($$0, fhr.Z));
      a(bim.Q, fth::new);
      a(bim.R, $$0 -> new fti($$0, 6.0F));
      a(bim.S, ftu::new);
      a(bim.T, $$0 -> new ftj($$0, new fgv<>($$0.a(fhr.ae))));
      a(bim.U, ftk::new);
      a(bim.V, ftl::new);
      a(bim.W, ftm::new);
      a(bim.X, $$0 -> new fuc<>($$0, fhr.ai));
      a(bim.Y, ftn::new);
      a(bim.Z, ftp::new);
      a(bim.aa, ftr::new);
      a(bim.ab, fuf::new);
      a(bim.ac, fts::new);
      a(bim.ad, ftt::new);
      a(bim.ae, fsm.b::new);
      a(bim.af, ftu::new);
      a(bim.ah, ftw::new);
      a(bim.ai, ftx::new);
      a(bim.aj, $$0 -> new ftz($$0, fhr.ar));
      a(bim.ak, fua::new);
      a(bim.al, fub::new);
      a(bim.am, fuf::new);
      a(bim.an, $$0 -> new fuc<>($$0, fhr.av));
      a(bim.ao, fue::new);
      a(bim.ap, $$0 -> new fsh<>($$0, 0.92F, fhr.ax));
      a(bim.aq, fug::new);
      a(bim.ar, fuh::new);
      a(bim.as, fui::new);
      a(bim.at, fuj::new);
      a(bim.au, fuk::new);
      a(bim.av, ful::new);
      a(bim.aw, $$0 -> new fum($$0, fhr.aD, fhr.aI, fhr.aJ, false));
      a(bim.ax, $$0 -> new fum($$0, fhr.aE, fhr.aF, fhr.aG, false));
      a(bim.ay, fun::new);
      a(bim.az, fuo::new);
      a(bim.aA, fvi::new);
      a(bim.aB, fup::new);
      a(bim.aC, fuq::new);
      a(bim.aD, fur::new);
      a(bim.aE, fut::new);
      a(bim.aF, fuu::new);
      a(bim.aG, fuw::new);
      a(bim.aH, fuv::new);
      a(bim.aI, fux::new);
      a(bim.aJ, fuy::new);
      a(bim.aK, $$0 -> new fvp($$0, fhr.bi));
      a(bim.aL, fuz::new);
      a(bim.aM, $$0 -> new fvi<>($$0, 0.75F, true));
      a(bim.aN, fva::new);
      a(bim.aP, fvi::new);
      a(bim.aO, fvb::new);
      a(bim.aQ, $$0 -> new fuc<>($$0, fhr.bq));
      a(bim.aR, fvc::new);
      a(bim.aS, fvd::new);
      a(bim.aT, $$0 -> new fve<>($$0, new fgv<>($$0.a(fhr.bs))));
      a(bim.aU, fvf::new);
      a(bim.aV, fvg::new);
      a(bim.aW, fvh::new);
      a(bim.aX, fsm.c::new);
      a(bim.aY, fvm::new);
      a(bim.aZ, fvl::new);
      a(bim.ba, $$0 -> new ftz($$0, fhr.bB));
      a(bim.bb, fvj::new);
      a(bim.bc, fvn::new);
      a(bim.bd, fvo::new);
      a(bim.be, fvq::new);
      a(bim.bf, fvr::new);
      a(bim.bg, fvs::new);
      a(bim.bi, fvu::new);
      a(bim.bh, fvt::new);
      a(bim.bj, fvv::new);
      a(bim.bk, fvw::new);
      a(bim.bl, fvx::new);
      a(bim.bm, fvy::new);
      a(bim.bn, fvz::new);
      a(bim.bo, fwa::new);
      a(bim.bp, fwb::new);
      a(bim.bq, $$0 -> new fvp($$0, fhr.bZ));
      a(bim.br, fwc::new);
      a(bim.bs, $$0 -> new fum($$0, fhr.cf, fhr.cg, fhr.ch, true));
   }
}
