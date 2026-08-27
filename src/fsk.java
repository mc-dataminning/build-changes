import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import org.slf4j.Logger;

public class fsk {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<bik<?>, fsj<?>> b = new Object2ObjectOpenHashMap();
   private static final Map<fzg.a, fsj<fmf>> c = Map.of(fzg.a.b, $$0 -> new fxj($$0, false), fzg.a.a, $$0 -> new fxj($$0, true));

   private static <T extends big> void a(bik<? extends T> $$0, fsj<T> $$1) {
      b.put($$0, $$1);
   }

   public static Map<bik<?>, fsi<?>> a(fsj.a $$0) {
      Builder<bik<?>, fsi<?>> $$1 = ImmutableMap.builder();
      b.forEach(($$2, $$3) -> {
         try {
            $$1.put($$2, $$3.create($$0));
         } catch (Exception var5) {
            throw new IllegalArgumentException("Failed to create model for " + jc.h.b((bik<?>)$$2), var5);
         }
      });
      return $$1.build();
   }

   public static Map<fzg.a, fsi<? extends cbl>> b(fsj.a $$0) {
      Builder<fzg.a, fsi<? extends cbl>> $$1 = ImmutableMap.builder();
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

      for (bik<?> $$1 : jc.h) {
         if ($$1 != bik.bt && !b.containsKey($$1)) {
            a.warn("No renderer registered for {}", jc.h.b($$1));
            $$0 = false;
         }
      }

      return !$$0;
   }

   static {
      a(bik.b, fri::new);
      a(bik.c, ftr::new);
      a(bik.d, frj::new);
      a(bik.e, fuw::new);
      a(bik.f, frl::new);
      a(bik.g, frm::new);
      a(bik.h, frn::new);
      a(bik.i, fro::new);
      a(bik.j, fry.a::new);
      a(bik.k, $$0 -> new frp($$0, false));
      a(bik.m, frr::new);
      a(bik.l, $$0 -> new frq($$0, fhi.p));
      a(bik.n, frs::new);
      a(bik.o, $$0 -> new frp($$0, true));
      a(bik.p, $$0 -> new fto<>($$0, fhi.s));
      a(bik.q, fru::new);
      a(bik.r, frv::new);
      a(bik.s, $$0 -> new fto<>($$0, fhi.v));
      a(bik.t, frw::new);
      a(bik.u, frx::new);
      a(bik.v, frz::new);
      a(bik.w, $$0 -> new frt<>($$0, 0.87F, fhi.H));
      a(bik.x, fsa::new);
      a(bik.y, fsb::new);
      a(bik.z, fuu::new);
      a(bik.A, fsc::new);
      a(bik.E, fsf::new);
      a(bik.F, fsg::new);
      a(bik.C, fse::new);
      a(bik.D, fuu::new);
      a(bik.B, fsd::new);
      a(bik.G, fsm::new);
      a(bik.H, fsl::new);
      a(bik.I, fuu::new);
      a(bik.J, fsn::new);
      a(bik.K, $$0 -> new fuu<>($$0, 1.0F, true));
      a(bik.L, fso::new);
      a(bik.ag, $$0 -> new fuu<>($$0, 3.0F, true));
      a(bik.M, fsp::new);
      a(bik.bu, fsq::new);
      a(bik.N, fsr::new);
      a(bik.O, fss::new);
      a(bik.P, $$0 -> new fto<>($$0, fhi.Z));
      a(bik.Q, fst::new);
      a(bik.R, $$0 -> new fsu($$0, 6.0F));
      a(bik.S, ftg::new);
      a(bik.T, $$0 -> new fsv($$0, new fgm<>($$0.a(fhi.ae))));
      a(bik.U, fsw::new);
      a(bik.V, fsx::new);
      a(bik.W, fsy::new);
      a(bik.X, $$0 -> new fto<>($$0, fhi.ai));
      a(bik.Y, fsz::new);
      a(bik.Z, ftb::new);
      a(bik.aa, ftd::new);
      a(bik.ab, ftr::new);
      a(bik.ac, fte::new);
      a(bik.ad, ftf::new);
      a(bik.ae, fry.b::new);
      a(bik.af, ftg::new);
      a(bik.ah, fti::new);
      a(bik.ai, ftj::new);
      a(bik.aj, $$0 -> new ftl($$0, fhi.ar));
      a(bik.ak, ftm::new);
      a(bik.al, ftn::new);
      a(bik.am, ftr::new);
      a(bik.an, $$0 -> new fto<>($$0, fhi.av));
      a(bik.ao, ftq::new);
      a(bik.ap, $$0 -> new frt<>($$0, 0.92F, fhi.ax));
      a(bik.aq, fts::new);
      a(bik.ar, ftt::new);
      a(bik.as, ftu::new);
      a(bik.at, ftv::new);
      a(bik.au, ftw::new);
      a(bik.av, ftx::new);
      a(bik.aw, $$0 -> new fty($$0, fhi.aD, fhi.aI, fhi.aJ, false));
      a(bik.ax, $$0 -> new fty($$0, fhi.aE, fhi.aF, fhi.aG, false));
      a(bik.ay, ftz::new);
      a(bik.az, fua::new);
      a(bik.aA, fuu::new);
      a(bik.aB, fub::new);
      a(bik.aC, fuc::new);
      a(bik.aD, fud::new);
      a(bik.aE, fuf::new);
      a(bik.aF, fug::new);
      a(bik.aG, fui::new);
      a(bik.aH, fuh::new);
      a(bik.aI, fuj::new);
      a(bik.aJ, fuk::new);
      a(bik.aK, $$0 -> new fvb($$0, fhi.bi));
      a(bik.aL, ful::new);
      a(bik.aM, $$0 -> new fuu<>($$0, 0.75F, true));
      a(bik.aN, fum::new);
      a(bik.aP, fuu::new);
      a(bik.aO, fun::new);
      a(bik.aQ, $$0 -> new fto<>($$0, fhi.bq));
      a(bik.aR, fuo::new);
      a(bik.aS, fup::new);
      a(bik.aT, $$0 -> new fuq<>($$0, new fgm<>($$0.a(fhi.bs))));
      a(bik.aU, fur::new);
      a(bik.aV, fus::new);
      a(bik.aW, fut::new);
      a(bik.aX, fry.c::new);
      a(bik.aY, fuy::new);
      a(bik.aZ, fux::new);
      a(bik.ba, $$0 -> new ftl($$0, fhi.bB));
      a(bik.bb, fuv::new);
      a(bik.bc, fuz::new);
      a(bik.bd, fva::new);
      a(bik.be, fvc::new);
      a(bik.bf, fvd::new);
      a(bik.bg, fve::new);
      a(bik.bi, fvg::new);
      a(bik.bh, fvf::new);
      a(bik.bj, fvh::new);
      a(bik.bk, fvi::new);
      a(bik.bl, fvj::new);
      a(bik.bm, fvk::new);
      a(bik.bn, fvl::new);
      a(bik.bo, fvm::new);
      a(bik.bp, fvn::new);
      a(bik.bq, $$0 -> new fvb($$0, fhi.bZ));
      a(bik.br, fvo::new);
      a(bik.bs, $$0 -> new fty($$0, fhi.cf, fhi.cg, fhi.ch, true));
   }
}
