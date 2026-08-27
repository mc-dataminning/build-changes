import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import org.slf4j.Logger;

public class fte {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<bja<?>, ftd<?>> b = new Object2ObjectOpenHashMap();
   private static final Map<gaa.a, ftd<fmz>> c = Map.of(gaa.a.b, $$0 -> new fyd($$0, false), gaa.a.a, $$0 -> new fyd($$0, true));

   private static <T extends biw> void a(bja<? extends T> $$0, ftd<T> $$1) {
      b.put($$0, $$1);
   }

   public static Map<bja<?>, ftc<?>> a(ftd.a $$0) {
      Builder<bja<?>, ftc<?>> $$1 = ImmutableMap.builder();
      b.forEach(($$2, $$3) -> {
         try {
            $$1.put($$2, $$3.create($$0));
         } catch (Exception var5) {
            throw new IllegalArgumentException("Failed to create model for " + jb.h.b((bja<?>)$$2), var5);
         }
      });
      return $$1.build();
   }

   public static Map<gaa.a, ftc<? extends cca>> b(ftd.a $$0) {
      Builder<gaa.a, ftc<? extends cca>> $$1 = ImmutableMap.builder();
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

      for (bja<?> $$1 : jb.h) {
         if ($$1 != bja.bt && !b.containsKey($$1)) {
            a.warn("No renderer registered for {}", jb.h.b($$1));
            $$0 = false;
         }
      }

      return !$$0;
   }

   static {
      a(bja.b, fsc::new);
      a(bja.c, ful::new);
      a(bja.d, fsd::new);
      a(bja.e, fvq::new);
      a(bja.f, fsf::new);
      a(bja.g, fsg::new);
      a(bja.h, fsh::new);
      a(bja.i, fsi::new);
      a(bja.j, fss.a::new);
      a(bja.k, $$0 -> new fsj($$0, false));
      a(bja.m, fsl::new);
      a(bja.l, $$0 -> new fsk($$0, fhw.p));
      a(bja.n, fsm::new);
      a(bja.o, $$0 -> new fsj($$0, true));
      a(bja.p, $$0 -> new fui<>($$0, fhw.s));
      a(bja.q, fso::new);
      a(bja.r, fsp::new);
      a(bja.s, $$0 -> new fui<>($$0, fhw.v));
      a(bja.t, fsq::new);
      a(bja.u, fsr::new);
      a(bja.v, fst::new);
      a(bja.w, $$0 -> new fsn<>($$0, 0.87F, fhw.H));
      a(bja.x, fsu::new);
      a(bja.y, fsv::new);
      a(bja.z, fvo::new);
      a(bja.A, fsw::new);
      a(bja.E, fsz::new);
      a(bja.F, fta::new);
      a(bja.C, fsy::new);
      a(bja.D, fvo::new);
      a(bja.B, fsx::new);
      a(bja.G, ftg::new);
      a(bja.H, ftf::new);
      a(bja.I, fvo::new);
      a(bja.J, fth::new);
      a(bja.K, $$0 -> new fvo<>($$0, 1.0F, true));
      a(bja.L, fti::new);
      a(bja.ag, $$0 -> new fvo<>($$0, 3.0F, true));
      a(bja.M, ftj::new);
      a(bja.bu, ftk::new);
      a(bja.N, ftl::new);
      a(bja.O, ftm::new);
      a(bja.P, $$0 -> new fui<>($$0, fhw.Z));
      a(bja.Q, ftn::new);
      a(bja.R, $$0 -> new fto($$0, 6.0F));
      a(bja.S, fua::new);
      a(bja.T, $$0 -> new ftp($$0, new fha<>($$0.a(fhw.ae))));
      a(bja.U, ftq::new);
      a(bja.V, ftr::new);
      a(bja.W, fts::new);
      a(bja.X, $$0 -> new fui<>($$0, fhw.ai));
      a(bja.Y, ftt::new);
      a(bja.Z, ftv::new);
      a(bja.aa, ftx::new);
      a(bja.ab, ful::new);
      a(bja.ac, fty::new);
      a(bja.ad, ftz::new);
      a(bja.ae, fss.b::new);
      a(bja.af, fua::new);
      a(bja.ah, fuc::new);
      a(bja.ai, fud::new);
      a(bja.aj, $$0 -> new fuf($$0, fhw.ar));
      a(bja.ak, fug::new);
      a(bja.al, fuh::new);
      a(bja.am, ful::new);
      a(bja.an, $$0 -> new fui<>($$0, fhw.av));
      a(bja.ao, fuk::new);
      a(bja.ap, $$0 -> new fsn<>($$0, 0.92F, fhw.ax));
      a(bja.aq, fum::new);
      a(bja.ar, fun::new);
      a(bja.as, fuo::new);
      a(bja.at, fup::new);
      a(bja.au, fuq::new);
      a(bja.av, fur::new);
      a(bja.aw, $$0 -> new fus($$0, fhw.aD, fhw.aI, fhw.aJ, false));
      a(bja.ax, $$0 -> new fus($$0, fhw.aE, fhw.aF, fhw.aG, false));
      a(bja.ay, fut::new);
      a(bja.az, fuu::new);
      a(bja.aA, fvo::new);
      a(bja.aB, fuv::new);
      a(bja.aC, fuw::new);
      a(bja.aD, fux::new);
      a(bja.aE, fuz::new);
      a(bja.aF, fva::new);
      a(bja.aG, fvc::new);
      a(bja.aH, fvb::new);
      a(bja.aI, fvd::new);
      a(bja.aJ, fve::new);
      a(bja.aK, $$0 -> new fvv($$0, fhw.bi));
      a(bja.aL, fvf::new);
      a(bja.aM, $$0 -> new fvo<>($$0, 0.75F, true));
      a(bja.aN, fvg::new);
      a(bja.aP, fvo::new);
      a(bja.aO, fvh::new);
      a(bja.aQ, $$0 -> new fui<>($$0, fhw.bq));
      a(bja.aR, fvi::new);
      a(bja.aS, fvj::new);
      a(bja.aT, $$0 -> new fvk<>($$0, new fha<>($$0.a(fhw.bs))));
      a(bja.aU, fvl::new);
      a(bja.aV, fvm::new);
      a(bja.aW, fvn::new);
      a(bja.aX, fss.c::new);
      a(bja.aY, fvs::new);
      a(bja.aZ, fvr::new);
      a(bja.ba, $$0 -> new fuf($$0, fhw.bB));
      a(bja.bb, fvp::new);
      a(bja.bc, fvt::new);
      a(bja.bd, fvu::new);
      a(bja.be, fvw::new);
      a(bja.bf, fvx::new);
      a(bja.bg, fvy::new);
      a(bja.bi, fwa::new);
      a(bja.bh, fvz::new);
      a(bja.bj, fwb::new);
      a(bja.bk, fwc::new);
      a(bja.bl, fwd::new);
      a(bja.bm, fwe::new);
      a(bja.bn, fwf::new);
      a(bja.bo, fwg::new);
      a(bja.bp, fwh::new);
      a(bja.bq, $$0 -> new fvv($$0, fhw.bZ));
      a(bja.br, fwi::new);
      a(bja.bs, $$0 -> new fus($$0, fhw.cf, fhw.cg, fhw.ch, true));
   }
}
