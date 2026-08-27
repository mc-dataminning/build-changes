import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.types.Type;
import com.mojang.logging.LogUtils;
import java.util.Set;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dqe<T extends dqc> {
   private static final Logger V = LogUtils.getLogger();
   public static final dqe<dqz> a = a("furnace", dqe.b.a(dqz::new, dfe.dp));
   public static final dqe<dqy> b = a("fletching", dqe.b.a(dqy::new, dfe.oW));
   public static final dqe<dqj> c = a("chest", dqe.b.a(dqj::new, dfe.dg));
   public static final dqe<dsa> d = a("trapped_chest", dqe.b.a(dsa::new, dfe.hP));
   public static final dqe<dqx> e = a("ender_chest", dqe.b.a(dqx::new, dfe.gy));
   public static final dqe<drf> f = a("jukebox", dqe.b.a(drf::new, dfe.eH));
   public static final dqe<dqu> g = a("dispenser", dqe.b.a(dqu::new, dfe.bD));
   public static final dqe<dqv> h = a("dropper", dqe.b.a(dqv::new, dfe.ic));
   public static final dqe<drr> i = a(
      "sign",
      dqe.b.a(
         drr::new,
         dfe.qh,
         dfe.qk,
         dfe.dq,
         dfe.dr,
         dfe.ds,
         dfe.dt,
         dfe.du,
         dfe.dv,
         dfe.dw,
         dfe.dD,
         dfe.dE,
         dfe.dF,
         dfe.dG,
         dfe.dH,
         dfe.dI,
         dfe.dJ,
         dfe.qf,
         dfe.qi,
         dfe.qg,
         dfe.qj,
         dfe.dx,
         dfe.dK,
         dfe.dy,
         dfe.dL
      )
   );
   public static final dqe<dra> j = a(
      "hanging_sign",
      dqe.b.a(
         dra::new,
         dfe.dV,
         dfe.ei,
         dfe.dM,
         dfe.dN,
         dfe.dO,
         dfe.dP,
         dfe.dQ,
         dfe.dR,
         dfe.dS,
         dfe.dT,
         dfe.dU,
         dfe.dW,
         dfe.dX,
         dfe.dY,
         dfe.dZ,
         dfe.ea,
         dfe.eb,
         dfe.ec,
         dfe.ed,
         dfe.ee,
         dfe.eg,
         dfe.eh,
         dfe.ef,
         dfe.ej
      )
   );
   public static final dqe<drv> k = a("mob_spawner", dqe.b.a(drv::new, dfe.de));
   public static final dqe<dsy> l = a("piston", dqe.b.a(dsy::new, dfe.cA));
   public static final dqe<dqf> m = a("brewing_stand", dqe.b.a(dqf::new, dfe.gk));
   public static final dqe<dqw> n = a("enchanting_table", dqe.b.a(dqw::new, dfe.gj));
   public static final dqe<dry> o = a("end_portal", dqe.b.a(dry::new, dfe.gp));
   public static final dqe<dpw> p = a("beacon", dqe.b.a(dpw::new, dfe.gH));
   public static final dqe<drt> q = a(
      "skull", dqe.b.a(drt::new, dfe.hy, dfe.hz, dfe.hG, dfe.hH, dfe.hI, dfe.hJ, dfe.hC, dfe.hD, dfe.hA, dfe.hB, dfe.hE, dfe.hF, dfe.hK, dfe.hL)
   );
   public static final dqe<dqr> r = a("daylight_detector", dqe.b.a(dqr::new, dfe.hT));
   public static final dqe<drc> s = a("hopper", dqe.b.a(drc::new, dfe.hW));
   public static final dqe<dqn> t = a("comparator", dqe.b.a(dqn::new, dfe.hS));
   public static final dqe<dpq> u = a(
      "banner",
      dqe.b.a(
         dpq::new,
         dfe.jD,
         dfe.jE,
         dfe.jF,
         dfe.jG,
         dfe.jH,
         dfe.jI,
         dfe.jJ,
         dfe.jK,
         dfe.jL,
         dfe.jM,
         dfe.jN,
         dfe.jO,
         dfe.jP,
         dfe.jQ,
         dfe.jR,
         dfe.jS,
         dfe.jT,
         dfe.jU,
         dfe.jV,
         dfe.jW,
         dfe.jX,
         dfe.jY,
         dfe.jZ,
         dfe.ka,
         dfe.kb,
         dfe.kc,
         dfe.kd,
         dfe.ke,
         dfe.kf,
         dfe.kg,
         dfe.kh,
         dfe.ki
      )
   );
   public static final dqe<drw> v = a("structure_block", dqe.b.a(drw::new, dfe.ql));
   public static final dqe<drx> w = a("end_gateway", dqe.b.a(drx::new, dfe.lD));
   public static final dqe<dqm> x = a("command_block", dqe.b.a(dqm::new, dfe.gG, dfe.lF, dfe.lE));
   public static final dqe<drq> y = a(
      "shulker_box",
      dqe.b.a(drq::new, dfe.lN, dfe.md, dfe.lZ, dfe.ma, dfe.lX, dfe.lV, dfe.mb, dfe.lR, dfe.lW, dfe.lT, dfe.lQ, dfe.lP, dfe.lU, dfe.lY, dfe.mc, dfe.lO, dfe.lS)
   );
   public static final dqe<dpx> z = a(
      "bed", dqe.b.a(dpx::new, dfe.bX, dfe.bY, dfe.bU, dfe.bV, dfe.bS, dfe.bQ, dfe.bW, dfe.bM, dfe.bR, dfe.bO, dfe.bL, dfe.bK, dfe.bP, dfe.bT, dfe.bJ, dfe.bN)
   );
   public static final dqe<dqo> A = a("conduit", dqe.b.a(dqo::new, dfe.nV));
   public static final dqe<dpu> B = a("barrel", dqe.b.a(dpu::new, dfe.oS));
   public static final dqe<dru> C = a("smoker", dqe.b.a(dru::new, dfe.oT));
   public static final dqe<dqb> D = a("blast_furnace", dqe.b.a(dqb::new, dfe.oU));
   public static final dqe<drg> E = a("lectern", dqe.b.a(drg::new, dfe.oY));
   public static final dqe<dpz> F = a("bell", dqe.b.a(dpz::new, dfe.pc));
   public static final dqe<dre> G = a("jigsaw", dqe.b.a(dre::new, dfe.qm));
   public static final dqe<dqi> H = a("campfire", dqe.b.a(dqi::new, dfe.pf, dfe.pg, dfe.ph));
   public static final dqe<dpy> I = a("beehive", dqe.b.a(dpy::new, dfe.qp, dfe.qq));
   public static final dqe<dro> J = a("sculk_sensor", dqe.b.a(dro::new, dfe.sb));
   public static final dqe<dqh> K = a("calibrated_sculk_sensor", dqe.b.a(dqh::new, dfe.sc));
   public static final dqe<drn> L = a("sculk_catalyst", dqe.b.a(drn::new, dfe.sf));
   public static final dqe<drp> M = a("sculk_shrieker", dqe.b.a(drp::new, dfe.sg));
   public static final dqe<dql> N = a("chiseled_bookshelf", dqe.b.a(dql::new, dfe.cX));
   public static final dqe<dqg> O = a("brushable_block", dqe.b.a(dqg::new, dfe.ap, dfe.as));
   public static final dqe<dqs> P = a("decorated_pot", dqe.b.a(dqs::new, dfe.uN));
   public static final dqe<dqq> Q = a("crafter", dqe.b.a(dqq::new, dfe.uO));
   public static final dqe<dsb> R = a("trial_spawner", dqe.b.a(dsb::new, dfe.uP));
   public static final dqe<dsk> S = a("vault", dqe.b.a(dsk::new, dfe.uQ));
   public static final dqe<dqa> T = a("big_brain", dqe.b.a(dqa::new, dfe.uS));
   public static final dqe<drl> U = a("potato_refinery", dqe.b.a(drl::new, dfe.up));
   private final dqe.a<? extends T> W;
   private final Set<dfc> X;
   private final Type<?> Y;
   private final ja.c<dqe<?>> Z = lh.k.f(this);

   @Nullable
   public static akt a(dqe<?> $$0) {
      return lh.k.b($$0);
   }

   private static <T extends dqc> dqe<T> a(String $$0, dqe.b<T> $$1) {
      if ($$1.b.isEmpty()) {
         V.warn("Block entity type {} requires at least one valid block to be defined!", $$0);
      }

      Type<?> $$2 = ad.a(bgf.s, $$0);
      return jn.a(lh.k, $$0, $$1.a($$2));
   }

   public dqe(dqe.a<? extends T> $$0, Set<dfc> $$1, Type<?> $$2) {
      this.W = $$0;
      this.X = $$1;
      this.Y = $$2;
   }

   @Nullable
   public T a(ir $$0, dtc $$1) {
      return (T)this.W.create($$0, $$1);
   }

   public boolean a(dtc $$0) {
      return this.X.contains($$0.b());
   }

   @Nullable
   public ja.c<dqe<?>> a() {
      return this.Z;
   }

   @Nullable
   public T a(dbg $$0, ir $$1) {
      dqc $$2 = $$0.c_($$1);
      return (T)($$2 != null && $$2.r() == this ? $$2 : null);
   }

   @FunctionalInterface
   interface a<T extends dqc> {
      T create(ir var1, dtc var2);
   }

   public static final class b<T extends dqc> {
      private final dqe.a<? extends T> a;
      final Set<dfc> b;

      private b(dqe.a<? extends T> $$0, Set<dfc> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public static <T extends dqc> dqe.b<T> a(dqe.a<? extends T> $$0, dfc... $$1) {
         return new dqe.b<>($$0, ImmutableSet.copyOf($$1));
      }

      public dqe<T> a(Type<?> $$0) {
         return new dqe<>(this.a, this.b, $$0);
      }
   }
}
