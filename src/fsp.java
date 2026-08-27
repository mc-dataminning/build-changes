import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import org.slf4j.Logger;

public class fsp {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<bim<?>, fso<?>> b = new Object2ObjectOpenHashMap();
   private static final Map<fzl.a, fso<fmk>> c = Map.of(fzl.a.b, $$0 -> new fxo($$0, false), fzl.a.a, $$0 -> new fxo($$0, true));

   private static <T extends bii> void a(bim<? extends T> $$0, fso<T> $$1) {
      b.put($$0, $$1);
   }

   public static Map<bim<?>, fsn<?>> a(fso.a $$0) {
      Builder<bim<?>, fsn<?>> $$1 = ImmutableMap.builder();
      b.forEach(($$2, $$3) -> {
         try {
            $$1.put($$2, $$3.create($$0));
         } catch (Exception var5) {
            throw new IllegalArgumentException("Failed to create model for " + jb.h.b((bim<?>)$$2), var5);
         }
      });
      return $$1.build();
   }

   public static Map<fzl.a, fsn<? extends cbn>> b(fso.a $$0) {
      Builder<fzl.a, fsn<? extends cbn>> $$1 = ImmutableMap.builder();
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
      a(bim.b, frn::new);
      a(bim.c, ftw::new);
      a(bim.d, fro::new);
      a(bim.e, fvb::new);
      a(bim.f, frq::new);
      a(bim.g, frr::new);
      a(bim.h, frs::new);
      a(bim.i, frt::new);
      a(bim.j, fsd.a::new);
      a(bim.k, $$0 -> new fru($$0, false));
      a(bim.m, frw::new);
      a(bim.l, $$0 -> new frv($$0, fhm.p));
      a(bim.n, frx::new);
      a(bim.o, $$0 -> new fru($$0, true));
      a(bim.p, $$0 -> new ftt<>($$0, fhm.s));
      a(bim.q, frz::new);
      a(bim.r, fsa::new);
      a(bim.s, $$0 -> new ftt<>($$0, fhm.v));
      a(bim.t, fsb::new);
      a(bim.u, fsc::new);
      a(bim.v, fse::new);
      a(bim.w, $$0 -> new fry<>($$0, 0.87F, fhm.H));
      a(bim.x, fsf::new);
      a(bim.y, fsg::new);
      a(bim.z, fuz::new);
      a(bim.A, fsh::new);
      a(bim.E, fsk::new);
      a(bim.F, fsl::new);
      a(bim.C, fsj::new);
      a(bim.D, fuz::new);
      a(bim.B, fsi::new);
      a(bim.G, fsr::new);
      a(bim.H, fsq::new);
      a(bim.I, fuz::new);
      a(bim.J, fss::new);
      a(bim.K, $$0 -> new fuz<>($$0, 1.0F, true));
      a(bim.L, fst::new);
      a(bim.ag, $$0 -> new fuz<>($$0, 3.0F, true));
      a(bim.M, fsu::new);
      a(bim.bu, fsv::new);
      a(bim.N, fsw::new);
      a(bim.O, fsx::new);
      a(bim.P, $$0 -> new ftt<>($$0, fhm.Z));
      a(bim.Q, fsy::new);
      a(bim.R, $$0 -> new fsz($$0, 6.0F));
      a(bim.S, ftl::new);
      a(bim.T, $$0 -> new fta($$0, new fgq<>($$0.a(fhm.ae))));
      a(bim.U, ftb::new);
      a(bim.V, ftc::new);
      a(bim.W, ftd::new);
      a(bim.X, $$0 -> new ftt<>($$0, fhm.ai));
      a(bim.Y, fte::new);
      a(bim.Z, ftg::new);
      a(bim.aa, fti::new);
      a(bim.ab, ftw::new);
      a(bim.ac, ftj::new);
      a(bim.ad, ftk::new);
      a(bim.ae, fsd.b::new);
      a(bim.af, ftl::new);
      a(bim.ah, ftn::new);
      a(bim.ai, fto::new);
      a(bim.aj, $$0 -> new ftq($$0, fhm.ar));
      a(bim.ak, ftr::new);
      a(bim.al, fts::new);
      a(bim.am, ftw::new);
      a(bim.an, $$0 -> new ftt<>($$0, fhm.av));
      a(bim.ao, ftv::new);
      a(bim.ap, $$0 -> new fry<>($$0, 0.92F, fhm.ax));
      a(bim.aq, ftx::new);
      a(bim.ar, fty::new);
      a(bim.as, ftz::new);
      a(bim.at, fua::new);
      a(bim.au, fub::new);
      a(bim.av, fuc::new);
      a(bim.aw, $$0 -> new fud($$0, fhm.aD, fhm.aI, fhm.aJ, false));
      a(bim.ax, $$0 -> new fud($$0, fhm.aE, fhm.aF, fhm.aG, false));
      a(bim.ay, fue::new);
      a(bim.az, fuf::new);
      a(bim.aA, fuz::new);
      a(bim.aB, fug::new);
      a(bim.aC, fuh::new);
      a(bim.aD, fui::new);
      a(bim.aE, fuk::new);
      a(bim.aF, ful::new);
      a(bim.aG, fun::new);
      a(bim.aH, fum::new);
      a(bim.aI, fuo::new);
      a(bim.aJ, fup::new);
      a(bim.aK, $$0 -> new fvg($$0, fhm.bi));
      a(bim.aL, fuq::new);
      a(bim.aM, $$0 -> new fuz<>($$0, 0.75F, true));
      a(bim.aN, fur::new);
      a(bim.aP, fuz::new);
      a(bim.aO, fus::new);
      a(bim.aQ, $$0 -> new ftt<>($$0, fhm.bq));
      a(bim.aR, fut::new);
      a(bim.aS, fuu::new);
      a(bim.aT, $$0 -> new fuv<>($$0, new fgq<>($$0.a(fhm.bs))));
      a(bim.aU, fuw::new);
      a(bim.aV, fux::new);
      a(bim.aW, fuy::new);
      a(bim.aX, fsd.c::new);
      a(bim.aY, fvd::new);
      a(bim.aZ, fvc::new);
      a(bim.ba, $$0 -> new ftq($$0, fhm.bB));
      a(bim.bb, fva::new);
      a(bim.bc, fve::new);
      a(bim.bd, fvf::new);
      a(bim.be, fvh::new);
      a(bim.bf, fvi::new);
      a(bim.bg, fvj::new);
      a(bim.bi, fvl::new);
      a(bim.bh, fvk::new);
      a(bim.bj, fvm::new);
      a(bim.bk, fvn::new);
      a(bim.bl, fvo::new);
      a(bim.bm, fvp::new);
      a(bim.bn, fvq::new);
      a(bim.bo, fvr::new);
      a(bim.bp, fvs::new);
      a(bim.bq, $$0 -> new fvg($$0, fhm.bZ));
      a(bim.br, fvt::new);
      a(bim.bs, $$0 -> new fud($$0, fhm.cf, fhm.cg, fhm.ch, true));
   }
}
