import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.logging.LogUtils;
import java.util.Map;
import org.slf4j.Logger;

public class foz {
   private static final Logger b = LogUtils.getLogger();
   public static final String a = "default";
   private static final Map<bfn<?>, foy<?>> c = Maps.newHashMap();
   private static final Map<String, foy<fiv>> d = ImmutableMap.of("default", (foy<>)$$0 -> new fty($$0, false), "slim", (foy<>)$$0 -> new fty($$0, true));

   private static <T extends bfj> void a(bfn<? extends T> $$0, foy<T> $$1) {
      c.put($$0, $$1);
   }

   public static Map<bfn<?>, fox<?>> a(foy.a $$0) {
      Builder<bfn<?>, fox<?>> $$1 = ImmutableMap.builder();
      c.forEach(($$2, $$3) -> {
         try {
            $$1.put($$2, $$3.create($$0));
         } catch (Exception var5) {
            throw new IllegalArgumentException("Failed to create model for " + jb.h.b((bfn<?>)$$2), var5);
         }
      });
      return $$1.build();
   }

   public static Map<String, fox<? extends byo>> b(foy.a $$0) {
      Builder<String, fox<? extends byo>> $$1 = ImmutableMap.builder();
      d.forEach(($$2, $$3) -> {
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

      for (bfn<?> $$1 : jb.h) {
         if ($$1 != bfn.bt && !c.containsKey($$1)) {
            b.warn("No renderer registered for {}", jb.h.b($$1));
            $$0 = false;
         }
      }

      return !$$0;
   }

   static {
      a(bfn.b, fnw::new);
      a(bfn.c, fqg::new);
      a(bfn.d, fnx::new);
      a(bfn.e, frl::new);
      a(bfn.f, fnz::new);
      a(bfn.g, foa::new);
      a(bfn.h, fob::new);
      a(bfn.i, foc::new);
      a(bfn.j, fom.a::new);
      a(bfn.k, $$0 -> new fod($$0, false));
      a(bfn.m, fof::new);
      a(bfn.l, $$0 -> new foe($$0, fed.p));
      a(bfn.n, fog::new);
      a(bfn.o, $$0 -> new fod($$0, true));
      a(bfn.p, $$0 -> new fqd<>($$0, fed.s));
      a(bfn.q, foi::new);
      a(bfn.r, foj::new);
      a(bfn.s, $$0 -> new fqd<>($$0, fed.v));
      a(bfn.t, fok::new);
      a(bfn.u, fol::new);
      a(bfn.v, fon::new);
      a(bfn.w, $$0 -> new foh<>($$0, 0.87F, fed.H));
      a(bfn.x, foo::new);
      a(bfn.y, fop::new);
      a(bfn.z, frj::new);
      a(bfn.A, foq::new);
      a(bfn.E, fou::new);
      a(bfn.F, fov::new);
      a(bfn.C, fot::new);
      a(bfn.D, frj::new);
      a(bfn.B, fos::new);
      a(bfn.G, fpb::new);
      a(bfn.H, fpa::new);
      a(bfn.I, frj::new);
      a(bfn.J, fpc::new);
      a(bfn.K, $$0 -> new frj<>($$0, 1.0F, true));
      a(bfn.L, fpd::new);
      a(bfn.ag, $$0 -> new frj<>($$0, 3.0F, true));
      a(bfn.M, fpe::new);
      a(bfn.bu, fpf::new);
      a(bfn.N, fpg::new);
      a(bfn.O, fph::new);
      a(bfn.P, $$0 -> new fqd<>($$0, fed.Z));
      a(bfn.Q, fpi::new);
      a(bfn.R, $$0 -> new fpj($$0, 6.0F));
      a(bfn.S, fpv::new);
      a(bfn.T, $$0 -> new fpk($$0, new fdh<>($$0.a(fed.ae))));
      a(bfn.U, fpl::new);
      a(bfn.V, fpm::new);
      a(bfn.W, fpn::new);
      a(bfn.X, $$0 -> new fqd<>($$0, fed.ai));
      a(bfn.Y, fpo::new);
      a(bfn.Z, fpq::new);
      a(bfn.aa, fps::new);
      a(bfn.ab, fqg::new);
      a(bfn.ac, fpt::new);
      a(bfn.ad, fpu::new);
      a(bfn.ae, fom.b::new);
      a(bfn.af, fpv::new);
      a(bfn.ah, fpx::new);
      a(bfn.ai, fpy::new);
      a(bfn.aj, $$0 -> new fqa($$0, fed.ar));
      a(bfn.ak, fqb::new);
      a(bfn.al, fqc::new);
      a(bfn.am, fqg::new);
      a(bfn.an, $$0 -> new fqd<>($$0, fed.av));
      a(bfn.ao, fqf::new);
      a(bfn.ap, $$0 -> new foh<>($$0, 0.92F, fed.ax));
      a(bfn.aq, fqh::new);
      a(bfn.ar, fqi::new);
      a(bfn.as, fqj::new);
      a(bfn.at, fqk::new);
      a(bfn.au, fql::new);
      a(bfn.av, fqm::new);
      a(bfn.aw, $$0 -> new fqn($$0, fed.aD, fed.aI, fed.aJ, false));
      a(bfn.ax, $$0 -> new fqn($$0, fed.aE, fed.aF, fed.aG, false));
      a(bfn.ay, fqo::new);
      a(bfn.az, fqp::new);
      a(bfn.aA, frj::new);
      a(bfn.aB, fqq::new);
      a(bfn.aC, fqr::new);
      a(bfn.aD, fqs::new);
      a(bfn.aE, fqu::new);
      a(bfn.aF, fqv::new);
      a(bfn.aG, fqx::new);
      a(bfn.aH, fqw::new);
      a(bfn.aI, fqy::new);
      a(bfn.aJ, fqz::new);
      a(bfn.aK, $$0 -> new frq($$0, fed.bi));
      a(bfn.aL, fra::new);
      a(bfn.aM, $$0 -> new frj<>($$0, 0.75F, true));
      a(bfn.aN, frb::new);
      a(bfn.aP, frj::new);
      a(bfn.aO, frc::new);
      a(bfn.aQ, $$0 -> new fqd<>($$0, fed.bq));
      a(bfn.aR, frd::new);
      a(bfn.aS, fre::new);
      a(bfn.aT, $$0 -> new frf<>($$0, new fdh<>($$0.a(fed.bs))));
      a(bfn.aU, frg::new);
      a(bfn.aV, frh::new);
      a(bfn.aW, fri::new);
      a(bfn.aX, fom.c::new);
      a(bfn.aY, frn::new);
      a(bfn.aZ, frm::new);
      a(bfn.ba, $$0 -> new fqa($$0, fed.bB));
      a(bfn.bb, frk::new);
      a(bfn.bc, fro::new);
      a(bfn.bd, frp::new);
      a(bfn.be, frr::new);
      a(bfn.bf, frs::new);
      a(bfn.bg, frt::new);
      a(bfn.bi, frv::new);
      a(bfn.bh, fru::new);
      a(bfn.bj, frw::new);
      a(bfn.bk, frx::new);
      a(bfn.bl, fry::new);
      a(bfn.bm, frz::new);
      a(bfn.bn, fsa::new);
      a(bfn.bo, fsb::new);
      a(bfn.bp, fsc::new);
      a(bfn.bq, $$0 -> new frq($$0, fed.bZ));
      a(bfn.br, fsd::new);
      a(bfn.bs, $$0 -> new fqn($$0, fed.cf, fed.cg, fed.ch, true));
   }
}
