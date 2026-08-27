import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.function.BiFunction;
import java.util.function.Function;

public abstract class fqp extends fqo {
   private static final int aW = 1048576;
   public static final int aR = 4194304;
   public static final int aS = 786432;
   public static final int aT = 1536;
   private static final fqp aX = a("solid", eni.j, enp.b.h, 4194304, true, false, fqp.b.a().a(ar).a(p).a(al).a(true));
   private static final fqp aY = a("cutout_mipped", eni.j, enp.b.h, 4194304, true, false, fqp.b.a().a(ar).a(q).a(al).a(true));
   private static final fqp aZ = a("cutout", eni.j, enp.b.h, 786432, true, false, fqp.b.a().a(ar).a(r).a(am).a(true));
   private static final fqp ba = a("translucent", eni.j, enp.b.h, 786432, true, true, a(s));
   private static final fqp bb = a("translucent_moving_block", eni.j, enp.b.h, 786432, false, true, O());
   private static final Function<agg, fqp> bc = ac.b($$0 -> a("armor_cutout_no_cull", $$0, false));
   private static final Function<agg, fqp> bd = ac.b($$0 -> {
      fqp.b $$1 = fqp.b.a().a(v).a(new fqo.n($$0, false, false)).a(c).a(ar).a(at).a(true);
      return a("entity_solid", eni.k, enp.b.h, 1536, true, false, $$1);
   });
   private static final Function<agg, fqp> be = ac.b($$0 -> {
      fqp.b $$1 = fqp.b.a().a(w).a(new fqo.n($$0, false, false)).a(c).a(ar).a(at).a(true);
      return a("entity_cutout", eni.k, enp.b.h, 1536, true, false, $$1);
   });
   private static final BiFunction<agg, Boolean, fqp> bf = ac.a(($$0, $$1) -> {
      fqp.b $$2 = fqp.b.a().a(x).a(new fqo.n($$0, false, false)).a(c).a(aw).a(ar).a(at).a($$1);
      return a("entity_cutout_no_cull", eni.k, enp.b.h, 1536, true, false, $$2);
   });
   private static final BiFunction<agg, Boolean, fqp> bg = ac.a(($$0, $$1) -> {
      fqp.b $$2 = fqp.b.a().a(y).a(new fqo.n($$0, false, false)).a(c).a(aw).a(ar).a(at).a(aG).a($$1);
      return a("entity_cutout_no_cull_z_offset", eni.k, enp.b.h, 1536, true, false, $$2);
   });
   private static final Function<agg, fqp> bh = ac.b($$0 -> {
      fqp.b $$1 = fqp.b.a().a(z).a(new fqo.n($$0, false, false)).a(h).a(aN).a(ar).a(at).a(fqo.aB).a(true);
      return a("item_entity_translucent_cull", eni.k, enp.b.h, 1536, true, true, $$1);
   });
   private static final Function<agg, fqp> bi = ac.b($$0 -> {
      fqp.b $$1 = fqp.b.a().a(A).a(new fqo.n($$0, false, false)).a(h).a(ar).a(at).a(true);
      return a("entity_translucent_cull", eni.k, enp.b.h, 1536, true, true, $$1);
   });
   private static final BiFunction<agg, Boolean, fqp> bj = ac.a(($$0, $$1) -> {
      fqp.b $$2 = fqp.b.a().a(B).a(new fqo.n($$0, false, false)).a(h).a(aw).a(ar).a(at).a($$1);
      return a("entity_translucent", eni.k, enp.b.h, 1536, true, true, $$2);
   });
   private static final BiFunction<agg, Boolean, fqp> bk = ac.a(($$0, $$1) -> {
      fqp.b $$2 = fqp.b.a().a(C).a(new fqo.n($$0, false, false)).a(h).a(aw).a(aC).a(at).a($$1);
      return a("entity_translucent_emissive", eni.k, enp.b.h, 1536, true, true, $$2);
   });
   private static final Function<agg, fqp> bl = ac.b($$0 -> {
      fqp.b $$1 = fqp.b.a().a(D).a(new fqo.n($$0, false, false)).a(aw).a(ar).a(true);
      return a("entity_smooth_cutout", eni.k, enp.b.h, 1536, $$1);
   });
   private static final BiFunction<agg, Boolean, fqp> bm = ac.a(($$0, $$1) -> {
      fqp.b $$2 = fqp.b.a().a(E).a(new fqo.n($$0, false, false)).a($$1 ? h : c).a($$1 ? aC : aB).a(false);
      return a("beacon_beam", eni.j, enp.b.h, 1536, false, true, $$2);
   });
   private static final Function<agg, fqp> bn = ac.b($$0 -> {
      fqp.b $$1 = fqp.b.a().a(F).a(new fqo.n($$0, false, false)).a(ay).a(aw).a(ar).a(at).a(false);
      return a("entity_decal", eni.k, enp.b.h, 1536, $$1);
   });
   private static final Function<agg, fqp> bo = ac.b($$0 -> {
      fqp.b $$1 = fqp.b.a().a(G).a(new fqo.n($$0, false, false)).a(h).a(aw).a(ar).a(at).a(aC).a(false);
      return a("entity_no_outline", eni.k, enp.b.h, 1536, false, true, $$1);
   });
   private static final Function<agg, fqp> bp = ac.b($$0 -> {
      fqp.b $$1 = fqp.b.a().a(H).a(new fqo.n($$0, false, false)).a(h).a(av).a(ar).a(at).a(aC).a(az).a(aG).a(false);
      return a("entity_shadow", eni.k, enp.b.h, 1536, false, false, $$1);
   });
   private static final Function<agg, fqp> bq = ac.b($$0 -> {
      fqp.b $$1 = fqp.b.a().a(I).a(new fqo.n($$0, false, false)).a(aw).a(true);
      return a("entity_alpha", eni.k, enp.b.h, 1536, $$1);
   });
   private static final Function<agg, fqp> br = ac.b($$0 -> {
      fqo.n $$1 = new fqo.n($$0, false, false);
      return a("eyes", eni.k, enp.b.h, 1536, false, true, fqp.b.a().a(J).a($$1).a(d).a(aC).a(false));
   });
   private static final fqp bs = a("leash", eni.p, enp.b.f, 1536, fqp.b.a().a(L).a(an).a(aw).a(ar).a(false));
   private static final fqp bt = a("water_mask", eni.m, enp.b.h, 1536, fqp.b.a().a(M).a(an).a(aD).a(false));
   private static final fqp bu = a(
      "armor_glint", eni.q, enp.b.h, 1536, fqp.b.a().a(O).a(new fqo.n(fwi.a, true, false)).a(aC).a(aw).a(ay).a(f).a(ap).a(aG).a(false)
   );
   private static final fqp bv = a(
      "armor_entity_glint", eni.q, enp.b.h, 1536, fqp.b.a().a(P).a(new fqo.n(fwi.a, true, false)).a(aC).a(aw).a(ay).a(f).a(aq).a(aG).a(false)
   );
   private static final fqp bw = a(
      "glint_translucent", eni.q, enp.b.h, 1536, fqp.b.a().a(Q).a(new fqo.n(fwi.b, true, false)).a(aC).a(aw).a(ay).a(f).a(ap).a(aN).a(false)
   );
   private static final fqp bx = a("glint", eni.q, enp.b.h, 1536, fqp.b.a().a(R).a(new fqo.n(fwi.b, true, false)).a(aC).a(aw).a(ay).a(f).a(ap).a(false));
   private static final fqp by = a("glint_direct", eni.q, enp.b.h, 1536, fqp.b.a().a(S).a(new fqo.n(fwi.b, true, false)).a(aC).a(aw).a(ay).a(f).a(ap).a(false));
   private static final fqp bz = a(
      "entity_glint", eni.q, enp.b.h, 1536, fqp.b.a().a(T).a(new fqo.n(fwi.a, true, false)).a(aC).a(aw).a(ay).a(f).a(aN).a(aq).a(false)
   );
   private static final fqp bA = a(
      "entity_glint_direct", eni.q, enp.b.h, 1536, fqp.b.a().a(U).a(new fqo.n(fwi.a, true, false)).a(aC).a(aw).a(ay).a(f).a(aq).a(false)
   );
   private static final Function<agg, fqp> bB = ac.b($$0 -> {
      fqo.n $$1 = new fqo.n($$0, false, false);
      return a("crumbling", eni.j, enp.b.h, 1536, false, true, fqp.b.a().a(V).a($$1).a(g).a(aC).a(aF).a(false));
   });
   private static final Function<agg, fqp> bC = ac.b(
      $$0 -> a("text", eni.t, enp.b.h, 786432, false, true, fqp.b.a().a(W).a(new fqo.n($$0, false, false)).a(h).a(ar).a(false))
   );
   private static final fqp bD = a("text_background", eni.p, enp.b.h, 1536, false, true, fqp.b.a().a(X).a(an).a(h).a(ar).a(false));
   private static final Function<agg, fqp> bE = ac.b(
      $$0 -> a("text_intensity", eni.t, enp.b.h, 786432, false, true, fqp.b.a().a(Y).a(new fqo.n($$0, false, false)).a(h).a(ar).a(false))
   );
   private static final Function<agg, fqp> bF = ac.b(
      $$0 -> a("text_polygon_offset", eni.t, enp.b.h, 1536, false, true, fqp.b.a().a(W).a(new fqo.n($$0, false, false)).a(h).a(ar).a(aF).a(false))
   );
   private static final Function<agg, fqp> bG = ac.b(
      $$0 -> a("text_intensity_polygon_offset", eni.t, enp.b.h, 1536, false, true, fqp.b.a().a(Y).a(new fqo.n($$0, false, false)).a(h).a(ar).a(aF).a(false))
   );
   private static final Function<agg, fqp> bH = ac.b(
      $$0 -> a("text_see_through", eni.t, enp.b.h, 1536, false, true, fqp.b.a().a(Z).a(new fqo.n($$0, false, false)).a(h).a(ar).a(ax).a(aC).a(false))
   );
   private static final fqp bI = a("text_background_see_through", eni.p, enp.b.h, 1536, false, true, fqp.b.a().a(aa).a(an).a(h).a(ar).a(ax).a(aC).a(false));
   private static final Function<agg, fqp> bJ = ac.b(
      $$0 -> a("text_intensity_see_through", eni.t, enp.b.h, 1536, false, true, fqp.b.a().a(ab).a(new fqo.n($$0, false, false)).a(h).a(ar).a(ax).a(aC).a(false))
   );
   private static final fqp bK = a("lightning", eni.n, enp.b.h, 1536, false, true, fqp.b.a().a(ac).a(aB).a(e).a(aL).a(false));
   private static final fqp bL = a("tripwire", eni.j, enp.b.h, 1536, true, true, P());
   private static final fqp bM = a(
      "end_portal", eni.m, enp.b.h, 1536, false, false, fqp.b.a().a(ae).a(fqo.i.d().a(fta.a, false, false).a(fta.b, false, false).a()).a(false)
   );
   private static final fqp bN = a(
      "end_gateway", eni.m, enp.b.h, 1536, false, false, fqp.b.a().a(af).a(fqo.i.d().a(fta.a, false, false).a(fta.b, false, false).a()).a(false)
   );
   public static final fqp.a aU = a("lines", eni.o, enp.b.a, 1536, fqp.b.a().a(ag).a(new fqo.h(OptionalDouble.empty())).a(aG).a(h).a(aN).a(aB).a(aw).a(false));
   public static final fqp.a aV = a(
      "line_strip", eni.o, enp.b.b, 1536, fqp.b.a().a(ag).a(new fqo.h(OptionalDouble.empty())).a(aG).a(h).a(aN).a(aB).a(aw).a(false)
   );
   private static final Function<Double, fqp.a> bO = ac.b(
      $$0 -> a("debug_line_strip", eni.n, enp.b.d, 1536, fqp.b.a().a(o).a(new fqo.h(OptionalDouble.of($$0))).a(c).a(aw).a(false))
   );
   private static final fqp.a bP = a("debug_filled_box", eni.n, enp.b.f, 1536, false, true, fqp.b.a().a(o).a(aG).a(h).a(false));
   private static final fqp.a bQ = a("debug_quads", eni.n, enp.b.h, 1536, false, true, fqp.b.a().a(o).a(h).a(aw).a(false));
   private static final fqp.a bR = a("debug_section_quads", eni.n, enp.b.h, 1536, false, true, fqp.b.a().a(o).a(aG).a(h).a(av).a(false));
   private static final fqp.a bS = a("gui", eni.n, enp.b.h, 786432, fqp.b.a().a(ah).a(h).a(az).a(false));
   private static final fqp.a bT = a("gui_overlay", eni.n, enp.b.h, 1536, fqp.b.a().a(ai).a(h).a(ax).a(aC).a(false));
   private static final fqp.a bU = a("gui_text_highlight", eni.n, enp.b.h, 1536, fqp.b.a().a(aj).a(h).a(ax).a(aQ).a(false));
   private static final fqp.a bV = a("gui_ghost_recipe_overlay", eni.n, enp.b.h, 1536, fqp.b.a().a(ak).a(h).a(aA).a(aC).a(false));
   private static final ImmutableList<fqp> bW = ImmutableList.of(c(), d(), e(), f(), t());
   private final enp bX;
   private final enp.b bY;
   private final int bZ;
   private final boolean ca;
   private final boolean cb;
   private final Optional<fqp> cc;

   public static fqp c() {
      return aX;
   }

   public static fqp d() {
      return aY;
   }

   public static fqp e() {
      return aZ;
   }

   private static fqp.b a(fqo.m $$0) {
      return fqp.b.a().a(ar).a($$0).a(al).a(h).a(aJ).a(true);
   }

   public static fqp f() {
      return ba;
   }

   private static fqp.b O() {
      return fqp.b.a().a(ar).a(t).a(al).a(h).a(aN).a(true);
   }

   public static fqp g() {
      return bb;
   }

   private static fqp.a a(String $$0, agg $$1, boolean $$2) {
      fqp.b $$3 = fqp.b.a().a(u).a(new fqo.n($$1, false, false)).a(c).a(aw).a(ar).a(at).a(aG).a($$2 ? ay : az).a(true);
      return a($$0, eni.k, enp.b.h, 1536, true, false, $$3);
   }

   public static fqp a(agg $$0) {
      return bc.apply($$0);
   }

   public static fqp b(agg $$0) {
      return a("armor_decal_cutout_no_cull", $$0, true);
   }

   public static fqp c(agg $$0) {
      return bd.apply($$0);
   }

   public static fqp d(agg $$0) {
      return be.apply($$0);
   }

   public static fqp a(agg $$0, boolean $$1) {
      return bf.apply($$0, $$1);
   }

   public static fqp e(agg $$0) {
      return a($$0, true);
   }

   public static fqp b(agg $$0, boolean $$1) {
      return bg.apply($$0, $$1);
   }

   public static fqp f(agg $$0) {
      return b($$0, true);
   }

   public static fqp g(agg $$0) {
      return bh.apply($$0);
   }

   public static fqp h(agg $$0) {
      return bi.apply($$0);
   }

   public static fqp c(agg $$0, boolean $$1) {
      return bj.apply($$0, $$1);
   }

   public static fqp i(agg $$0) {
      return c($$0, true);
   }

   public static fqp d(agg $$0, boolean $$1) {
      return bk.apply($$0, $$1);
   }

   public static fqp j(agg $$0) {
      return d($$0, true);
   }

   public static fqp k(agg $$0) {
      return bl.apply($$0);
   }

   public static fqp e(agg $$0, boolean $$1) {
      return bm.apply($$0, $$1);
   }

   public static fqp l(agg $$0) {
      return bn.apply($$0);
   }

   public static fqp m(agg $$0) {
      return bo.apply($$0);
   }

   public static fqp n(agg $$0) {
      return bp.apply($$0);
   }

   public static fqp o(agg $$0) {
      return bq.apply($$0);
   }

   public static fqp p(agg $$0) {
      return br.apply($$0);
   }

   public static fqp a(agg $$0, float $$1, float $$2) {
      return a(
         "energy_swirl",
         eni.k,
         enp.b.h,
         1536,
         false,
         true,
         fqp.b.a().a(K).a(new fqo.n($$0, false, false)).a(new fqo.j($$1, $$2)).a(d).a(aw).a(ar).a(at).a(false)
      );
   }

   public static fqp h() {
      return bs;
   }

   public static fqp i() {
      return bt;
   }

   public static fqp q(agg $$0) {
      return fqp.a.aW.apply($$0, aw);
   }

   public static fqp j() {
      return bu;
   }

   public static fqp k() {
      return bv;
   }

   public static fqp l() {
      return bw;
   }

   public static fqp m() {
      return bx;
   }

   public static fqp n() {
      return by;
   }

   public static fqp o() {
      return bz;
   }

   public static fqp p() {
      return bA;
   }

   public static fqp r(agg $$0) {
      return bB.apply($$0);
   }

   public static fqp s(agg $$0) {
      return bC.apply($$0);
   }

   public static fqp q() {
      return bD;
   }

   public static fqp t(agg $$0) {
      return bE.apply($$0);
   }

   public static fqp u(agg $$0) {
      return bF.apply($$0);
   }

   public static fqp v(agg $$0) {
      return bG.apply($$0);
   }

   public static fqp w(agg $$0) {
      return bH.apply($$0);
   }

   public static fqp r() {
      return bI;
   }

   public static fqp x(agg $$0) {
      return bJ.apply($$0);
   }

   public static fqp s() {
      return bK;
   }

   private static fqp.b P() {
      return fqp.b.a().a(ar).a(ad).a(al).a(h).a(aL).a(true);
   }

   public static fqp t() {
      return bL;
   }

   public static fqp u() {
      return bM;
   }

   public static fqp v() {
      return bN;
   }

   public static fqp w() {
      return aU;
   }

   public static fqp x() {
      return aV;
   }

   public static fqp a(double $$0) {
      return bO.apply($$0);
   }

   public static fqp y() {
      return bP;
   }

   public static fqp z() {
      return bQ;
   }

   public static fqp A() {
      return bR;
   }

   public static fqp B() {
      return bS;
   }

   public static fqp C() {
      return bT;
   }

   public static fqp D() {
      return bU;
   }

   public static fqp E() {
      return bV;
   }

   public fqp(String $$0, enp $$1, enp.b $$2, int $$3, boolean $$4, boolean $$5, Runnable $$6, Runnable $$7) {
      super($$0, $$6, $$7);
      this.bX = $$1;
      this.bY = $$2;
      this.bZ = $$3;
      this.ca = $$4;
      this.cb = $$5;
      this.cc = Optional.of(this);
   }

   static fqp.a a(String $$0, enp $$1, enp.b $$2, int $$3, fqp.b $$4) {
      return a($$0, $$1, $$2, $$3, false, false, $$4);
   }

   private static fqp.a a(String $$0, enp $$1, enp.b $$2, int $$3, boolean $$4, boolean $$5, fqp.b $$6) {
      return new fqp.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   public void a(enf $$0, ens $$1) {
      if ($$0.k()) {
         if (this.cb) {
            $$0.a($$1);
         }

         enf.b $$2 = $$0.d();
         this.a();
         eng.a($$2);
         this.b();
      }
   }

   @Override
   public String toString() {
      return this.b;
   }

   public static List<fqp> F() {
      return bW;
   }

   public int G() {
      return this.bZ;
   }

   public enp H() {
      return this.bX;
   }

   public enp.b I() {
      return this.bY;
   }

   public Optional<fqp> J() {
      return Optional.empty();
   }

   public boolean K() {
      return false;
   }

   public boolean L() {
      return this.ca;
   }

   public boolean M() {
      return !this.bY.l;
   }

   public Optional<fqp> N() {
      return this.cc;
   }

   static final class a extends fqp {
      static final BiFunction<agg, fqo.c, fqp> aW = ac.a(
         ($$0, $$1) -> fqp.a("outline", eni.r, enp.b.h, 1536, fqp.b.a().a(N).a(new fqo.n($$0, false, false)).a($$1).a(ax).a(aI).a(fqp.c.b))
      );
      private final fqp.b aX;
      private final Optional<fqp> aY;
      private final boolean aZ;

      a(String $$0, enp $$1, enp.b $$2, int $$3, boolean $$4, boolean $$5, fqp.b $$6) {
         super($$0, $$1, $$2, $$3, $$4, $$5, () -> $$6.o.forEach(fqo::a), () -> $$6.o.forEach(fqo::b));
         this.aX = $$6;
         this.aY = $$6.n == fqp.c.c ? $$6.a.c().map($$1x -> aW.apply($$1x, $$6.e)) : Optional.empty();
         this.aZ = $$6.n == fqp.c.b;
      }

      @Override
      public Optional<fqp> J() {
         return this.aY;
      }

      @Override
      public boolean K() {
         return this.aZ;
      }

      protected final fqp.b O() {
         return this.aX;
      }

      @Override
      public String toString() {
         return "RenderType[" + this.b + ":" + this.aX + "]";
      }
   }

   protected static final class b {
      final fqo.e a;
      private final fqo.m b;
      private final fqo.p c;
      private final fqo.d d;
      final fqo.c e;
      private final fqo.g f;
      private final fqo.l g;
      private final fqo.f h;
      private final fqo.k i;
      private final fqo.o j;
      private final fqo.q k;
      private final fqo.h l;
      private final fqo.b m;
      final fqp.c n;
      final ImmutableList<fqo> o;

      b(
         fqo.e $$0,
         fqo.m $$1,
         fqo.p $$2,
         fqo.d $$3,
         fqo.c $$4,
         fqo.g $$5,
         fqo.l $$6,
         fqo.f $$7,
         fqo.k $$8,
         fqo.o $$9,
         fqo.q $$10,
         fqo.h $$11,
         fqo.b $$12,
         fqp.c $$13
      ) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$4;
         this.f = $$5;
         this.g = $$6;
         this.h = $$7;
         this.i = $$8;
         this.j = $$9;
         this.k = $$10;
         this.l = $$11;
         this.m = $$12;
         this.n = $$13;
         this.o = ImmutableList.of(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.m, new fqo[]{this.l});
      }

      @Override
      public String toString() {
         return "CompositeState[" + this.o + ", outlineProperty=" + this.n + "]";
      }

      public static fqp.b.a a() {
         return new fqp.b.a();
      }

      public static class a {
         private fqo.e a = fqo.an;
         private fqo.m b = fqo.i;
         private fqo.p c;
         private fqo.d d;
         private fqo.c e;
         private fqo.g f;
         private fqo.l g;
         private fqo.f h;
         private fqo.k i;
         private fqo.o j;
         private fqo.q k;
         private fqo.h l;
         private fqo.b m;

         a() {
            this.c = fqo.c;
            this.d = fqo.az;
            this.e = fqo.av;
            this.f = fqo.as;
            this.g = fqo.au;
            this.h = fqo.aE;
            this.i = fqo.aH;
            this.j = fqo.ao;
            this.k = fqo.aB;
            this.l = fqo.aO;
            this.m = fqo.aP;
         }

         public fqp.b.a a(fqo.e $$0) {
            this.a = $$0;
            return this;
         }

         public fqp.b.a a(fqo.m $$0) {
            this.b = $$0;
            return this;
         }

         public fqp.b.a a(fqo.p $$0) {
            this.c = $$0;
            return this;
         }

         public fqp.b.a a(fqo.d $$0) {
            this.d = $$0;
            return this;
         }

         public fqp.b.a a(fqo.c $$0) {
            this.e = $$0;
            return this;
         }

         public fqp.b.a a(fqo.g $$0) {
            this.f = $$0;
            return this;
         }

         public fqp.b.a a(fqo.l $$0) {
            this.g = $$0;
            return this;
         }

         public fqp.b.a a(fqo.f $$0) {
            this.h = $$0;
            return this;
         }

         public fqp.b.a a(fqo.k $$0) {
            this.i = $$0;
            return this;
         }

         public fqp.b.a a(fqo.o $$0) {
            this.j = $$0;
            return this;
         }

         public fqp.b.a a(fqo.q $$0) {
            this.k = $$0;
            return this;
         }

         public fqp.b.a a(fqo.h $$0) {
            this.l = $$0;
            return this;
         }

         public fqp.b.a a(fqo.b $$0) {
            this.m = $$0;
            return this;
         }

         public fqp.b a(boolean $$0) {
            return this.a($$0 ? fqp.c.c : fqp.c.a);
         }

         public fqp.b a(fqp.c $$0) {
            return new fqp.b(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, $$0);
         }
      }
   }

   static enum c {
      a("none"),
      b("is_outline"),
      c("affects_outline");

      private final String d;

      private c(String $$0) {
         this.d = $$0;
      }

      @Override
      public String toString() {
         return this.d;
      }
   }
}
