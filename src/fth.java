import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.function.BiFunction;
import java.util.function.Function;

public abstract class fth extends ftg {
   private static final int aX = 1048576;
   public static final int aS = 4194304;
   public static final int aT = 786432;
   public static final int aU = 1536;
   private static final fth aY = a("solid", epr.j, epy.b.h, 4194304, true, false, fth.b.a().a(as).a(p).a(am).a(true));
   private static final fth aZ = a("cutout_mipped", epr.j, epy.b.h, 4194304, true, false, fth.b.a().a(as).a(q).a(am).a(true));
   private static final fth ba = a("cutout", epr.j, epy.b.h, 786432, true, false, fth.b.a().a(as).a(r).a(an).a(true));
   private static final fth bb = a("translucent", epr.j, epy.b.h, 786432, true, true, a(s));
   private static final fth bc = a("translucent_moving_block", epr.j, epy.b.h, 786432, false, true, O());
   private static final Function<ahd, fth> bd = ac.b($$0 -> a("armor_cutout_no_cull", $$0, false));
   private static final Function<ahd, fth> be = ac.b($$0 -> {
      fth.b $$1 = fth.b.a().a(v).a(new ftg.n($$0, false, false)).a(c).a(as).a(au).a(true);
      return a("entity_solid", epr.k, epy.b.h, 1536, true, false, $$1);
   });
   private static final Function<ahd, fth> bf = ac.b($$0 -> {
      fth.b $$1 = fth.b.a().a(w).a(new ftg.n($$0, false, false)).a(c).a(as).a(au).a(true);
      return a("entity_cutout", epr.k, epy.b.h, 1536, true, false, $$1);
   });
   private static final BiFunction<ahd, Boolean, fth> bg = ac.a(($$0, $$1) -> {
      fth.b $$2 = fth.b.a().a(x).a(new ftg.n($$0, false, false)).a(c).a(ax).a(as).a(au).a($$1);
      return a("entity_cutout_no_cull", epr.k, epy.b.h, 1536, true, false, $$2);
   });
   private static final BiFunction<ahd, Boolean, fth> bh = ac.a(($$0, $$1) -> {
      fth.b $$2 = fth.b.a().a(y).a(new ftg.n($$0, false, false)).a(c).a(ax).a(as).a(au).a(aH).a($$1);
      return a("entity_cutout_no_cull_z_offset", epr.k, epy.b.h, 1536, true, false, $$2);
   });
   private static final Function<ahd, fth> bi = ac.b($$0 -> {
      fth.b $$1 = fth.b.a().a(z).a(new ftg.n($$0, false, false)).a(h).a(aO).a(as).a(au).a(ftg.aC).a(true);
      return a("item_entity_translucent_cull", epr.k, epy.b.h, 1536, true, true, $$1);
   });
   private static final Function<ahd, fth> bj = ac.b($$0 -> {
      fth.b $$1 = fth.b.a().a(A).a(new ftg.n($$0, false, false)).a(h).a(as).a(au).a(true);
      return a("entity_translucent_cull", epr.k, epy.b.h, 1536, true, true, $$1);
   });
   private static final BiFunction<ahd, Boolean, fth> bk = ac.a(($$0, $$1) -> {
      fth.b $$2 = fth.b.a().a(B).a(new ftg.n($$0, false, false)).a(h).a(ax).a(as).a(au).a($$1);
      return a("entity_translucent", epr.k, epy.b.h, 1536, true, true, $$2);
   });
   private static final BiFunction<ahd, Boolean, fth> bl = ac.a(($$0, $$1) -> {
      fth.b $$2 = fth.b.a().a(C).a(new ftg.n($$0, false, false)).a(h).a(ax).a(aD).a(au).a($$1);
      return a("entity_translucent_emissive", epr.k, epy.b.h, 1536, true, true, $$2);
   });
   private static final Function<ahd, fth> bm = ac.b($$0 -> {
      fth.b $$1 = fth.b.a().a(D).a(new ftg.n($$0, false, false)).a(ax).a(as).a(true);
      return a("entity_smooth_cutout", epr.k, epy.b.h, 1536, $$1);
   });
   private static final BiFunction<ahd, Boolean, fth> bn = ac.a(($$0, $$1) -> {
      fth.b $$2 = fth.b.a().a(E).a(new ftg.n($$0, false, false)).a($$1 ? h : c).a($$1 ? aD : aC).a(false);
      return a("beacon_beam", epr.j, epy.b.h, 1536, false, true, $$2);
   });
   private static final Function<ahd, fth> bo = ac.b($$0 -> {
      fth.b $$1 = fth.b.a().a(F).a(new ftg.n($$0, false, false)).a(az).a(ax).a(as).a(au).a(false);
      return a("entity_decal", epr.k, epy.b.h, 1536, $$1);
   });
   private static final Function<ahd, fth> bp = ac.b($$0 -> {
      fth.b $$1 = fth.b.a().a(G).a(new ftg.n($$0, false, false)).a(h).a(ax).a(as).a(au).a(aD).a(false);
      return a("entity_no_outline", epr.k, epy.b.h, 1536, false, true, $$1);
   });
   private static final Function<ahd, fth> bq = ac.b($$0 -> {
      fth.b $$1 = fth.b.a().a(H).a(new ftg.n($$0, false, false)).a(h).a(aw).a(as).a(au).a(aD).a(aA).a(aH).a(false);
      return a("entity_shadow", epr.k, epy.b.h, 1536, false, false, $$1);
   });
   private static final Function<ahd, fth> br = ac.b($$0 -> {
      fth.b $$1 = fth.b.a().a(I).a(new ftg.n($$0, false, false)).a(ax).a(true);
      return a("entity_alpha", epr.k, epy.b.h, 1536, $$1);
   });
   private static final BiFunction<ahd, ftg.p, fth> bs = ac.a(($$0, $$1) -> {
      ftg.n $$2 = new ftg.n($$0, false, false);
      return a("eyes", epr.k, epy.b.h, 1536, false, true, fth.b.a().a(J).a($$2).a($$1).a(aD).a(false));
   });
   private static final fth bt = a("leash", epr.p, epy.b.f, 1536, fth.b.a().a(L).a(ao).a(ax).a(as).a(false));
   private static final fth bu = a("water_mask", epr.m, epy.b.h, 1536, fth.b.a().a(M).a(ao).a(aE).a(false));
   private static final fth bv = a(
      "armor_glint", epr.q, epy.b.h, 1536, fth.b.a().a(O).a(new ftg.n(fzd.a, true, false)).a(aD).a(ax).a(az).a(f).a(aq).a(aH).a(false)
   );
   private static final fth bw = a(
      "armor_entity_glint", epr.q, epy.b.h, 1536, fth.b.a().a(P).a(new ftg.n(fzd.a, true, false)).a(aD).a(ax).a(az).a(f).a(ar).a(aH).a(false)
   );
   private static final fth bx = a(
      "glint_translucent", epr.q, epy.b.h, 1536, fth.b.a().a(Q).a(new ftg.n(fzd.b, true, false)).a(aD).a(ax).a(az).a(f).a(aq).a(aO).a(false)
   );
   private static final fth by = a("glint", epr.q, epy.b.h, 1536, fth.b.a().a(R).a(new ftg.n(fzd.b, true, false)).a(aD).a(ax).a(az).a(f).a(aq).a(false));
   private static final fth bz = a("glint_direct", epr.q, epy.b.h, 1536, fth.b.a().a(S).a(new ftg.n(fzd.b, true, false)).a(aD).a(ax).a(az).a(f).a(aq).a(false));
   private static final fth bA = a(
      "entity_glint", epr.q, epy.b.h, 1536, fth.b.a().a(T).a(new ftg.n(fzd.a, true, false)).a(aD).a(ax).a(az).a(f).a(aO).a(ar).a(false)
   );
   private static final fth bB = a(
      "entity_glint_direct", epr.q, epy.b.h, 1536, fth.b.a().a(U).a(new ftg.n(fzd.a, true, false)).a(aD).a(ax).a(az).a(f).a(ar).a(false)
   );
   private static final Function<ahd, fth> bC = ac.b($$0 -> {
      ftg.n $$1 = new ftg.n($$0, false, false);
      return a("crumbling", epr.j, epy.b.h, 1536, false, true, fth.b.a().a(V).a($$1).a(g).a(aD).a(aG).a(false));
   });
   private static final Function<ahd, fth> bD = ac.b(
      $$0 -> a("text", epr.t, epy.b.h, 786432, false, true, fth.b.a().a(W).a(new ftg.n($$0, false, false)).a(h).a(as).a(false))
   );
   private static final fth bE = a("text_background", epr.p, epy.b.h, 1536, false, true, fth.b.a().a(X).a(ao).a(h).a(as).a(false));
   private static final Function<ahd, fth> bF = ac.b(
      $$0 -> a("text_intensity", epr.t, epy.b.h, 786432, false, true, fth.b.a().a(Y).a(new ftg.n($$0, false, false)).a(h).a(as).a(false))
   );
   private static final Function<ahd, fth> bG = ac.b(
      $$0 -> a("text_polygon_offset", epr.t, epy.b.h, 1536, false, true, fth.b.a().a(W).a(new ftg.n($$0, false, false)).a(h).a(as).a(aG).a(false))
   );
   private static final Function<ahd, fth> bH = ac.b(
      $$0 -> a("text_intensity_polygon_offset", epr.t, epy.b.h, 1536, false, true, fth.b.a().a(Y).a(new ftg.n($$0, false, false)).a(h).a(as).a(aG).a(false))
   );
   private static final Function<ahd, fth> bI = ac.b(
      $$0 -> a("text_see_through", epr.t, epy.b.h, 1536, false, true, fth.b.a().a(Z).a(new ftg.n($$0, false, false)).a(h).a(as).a(ay).a(aD).a(false))
   );
   private static final fth bJ = a("text_background_see_through", epr.p, epy.b.h, 1536, false, true, fth.b.a().a(aa).a(ao).a(h).a(as).a(ay).a(aD).a(false));
   private static final Function<ahd, fth> bK = ac.b(
      $$0 -> a("text_intensity_see_through", epr.t, epy.b.h, 1536, false, true, fth.b.a().a(ab).a(new ftg.n($$0, false, false)).a(h).a(as).a(ay).a(aD).a(false))
   );
   private static final fth bL = a("lightning", epr.n, epy.b.h, 1536, false, true, fth.b.a().a(ac).a(aC).a(e).a(aM).a(false));
   private static final fth bM = a("tripwire", epr.j, epy.b.h, 1536, true, true, P());
   private static final fth bN = a(
      "end_portal", epr.m, epy.b.h, 1536, false, false, fth.b.a().a(ae).a(ftg.i.d().a(fvs.a, false, false).a(fvs.b, false, false).a()).a(false)
   );
   private static final fth bO = a(
      "end_gateway", epr.m, epy.b.h, 1536, false, false, fth.b.a().a(af).a(ftg.i.d().a(fvs.a, false, false).a(fvs.b, false, false).a()).a(false)
   );
   public static final fth.a aV = a("lines", epr.o, epy.b.a, 1536, fth.b.a().a(ag).a(new ftg.h(OptionalDouble.empty())).a(aH).a(h).a(aO).a(aC).a(ax).a(false));
   public static final fth.a aW = a(
      "line_strip", epr.o, epy.b.b, 1536, fth.b.a().a(ag).a(new ftg.h(OptionalDouble.empty())).a(aH).a(h).a(aO).a(aC).a(ax).a(false)
   );
   private static final Function<Double, fth.a> bP = ac.b(
      $$0 -> a("debug_line_strip", epr.n, epy.b.d, 1536, fth.b.a().a(o).a(new ftg.h(OptionalDouble.of($$0))).a(c).a(ax).a(false))
   );
   private static final fth.a bQ = a("debug_filled_box", epr.n, epy.b.f, 1536, false, true, fth.b.a().a(o).a(aH).a(h).a(false));
   private static final fth.a bR = a("debug_quads", epr.n, epy.b.h, 1536, false, true, fth.b.a().a(o).a(h).a(ax).a(false));
   private static final fth.a bS = a("debug_section_quads", epr.n, epy.b.h, 1536, false, true, fth.b.a().a(o).a(aH).a(h).a(aw).a(false));
   private static final fth.a bT = a("gui", epr.n, epy.b.h, 786432, fth.b.a().a(ah).a(h).a(aA).a(false));
   private static final fth.a bU = a("gui_overlay", epr.n, epy.b.h, 1536, fth.b.a().a(ai).a(h).a(ay).a(aD).a(false));
   private static final fth.a bV = a("gui_text_highlight", epr.n, epy.b.h, 1536, fth.b.a().a(aj).a(h).a(ay).a(aR).a(false));
   private static final fth.a bW = a("gui_ghost_recipe_overlay", epr.n, epy.b.h, 1536, fth.b.a().a(ak).a(h).a(aB).a(aD).a(false));
   private static final ImmutableList<fth> bX = ImmutableList.of(c(), d(), e(), f(), t());
   private final epy bY;
   private final epy.b bZ;
   private final int ca;
   private final boolean cb;
   private final boolean cc;
   private final Optional<fth> cd;

   public static fth c() {
      return aY;
   }

   public static fth d() {
      return aZ;
   }

   public static fth e() {
      return ba;
   }

   private static fth.b a(ftg.m $$0) {
      return fth.b.a().a(as).a($$0).a(am).a(h).a(aK).a(true);
   }

   public static fth f() {
      return bb;
   }

   private static fth.b O() {
      return fth.b.a().a(as).a(t).a(am).a(h).a(aO).a(true);
   }

   public static fth g() {
      return bc;
   }

   private static fth.a a(String $$0, ahd $$1, boolean $$2) {
      fth.b $$3 = fth.b.a().a(u).a(new ftg.n($$1, false, false)).a(c).a(ax).a(as).a(au).a(aH).a($$2 ? az : aA).a(true);
      return a($$0, epr.k, epy.b.h, 1536, true, false, $$3);
   }

   public static fth a(ahd $$0) {
      return bd.apply($$0);
   }

   public static fth b(ahd $$0) {
      return a("armor_decal_cutout_no_cull", $$0, true);
   }

   public static fth c(ahd $$0) {
      return be.apply($$0);
   }

   public static fth d(ahd $$0) {
      return bf.apply($$0);
   }

   public static fth a(ahd $$0, boolean $$1) {
      return bg.apply($$0, $$1);
   }

   public static fth e(ahd $$0) {
      return a($$0, true);
   }

   public static fth b(ahd $$0, boolean $$1) {
      return bh.apply($$0, $$1);
   }

   public static fth f(ahd $$0) {
      return b($$0, true);
   }

   public static fth g(ahd $$0) {
      return bi.apply($$0);
   }

   public static fth h(ahd $$0) {
      return bj.apply($$0);
   }

   public static fth c(ahd $$0, boolean $$1) {
      return bk.apply($$0, $$1);
   }

   public static fth i(ahd $$0) {
      return c($$0, true);
   }

   public static fth d(ahd $$0, boolean $$1) {
      return bl.apply($$0, $$1);
   }

   public static fth j(ahd $$0) {
      return d($$0, true);
   }

   public static fth k(ahd $$0) {
      return bm.apply($$0);
   }

   public static fth e(ahd $$0, boolean $$1) {
      return bn.apply($$0, $$1);
   }

   public static fth l(ahd $$0) {
      return bo.apply($$0);
   }

   public static fth m(ahd $$0) {
      return bp.apply($$0);
   }

   public static fth n(ahd $$0) {
      return bq.apply($$0);
   }

   public static fth o(ahd $$0) {
      return br.apply($$0);
   }

   public static fth p(ahd $$0) {
      return bs.apply($$0, d);
   }

   public static fth q(ahd $$0) {
      return bl.apply($$0, false);
   }

   public static fth a(ahd $$0, float $$1, float $$2) {
      return a(
         "breeze_wind",
         epr.k,
         epy.b.h,
         1536,
         false,
         true,
         fth.b.a().a(al).a(new ftg.n($$0, false, false)).a(new ftg.j($$1, $$2)).a(h).a(ax).a(as).a(av).a(false)
      );
   }

   public static fth b(ahd $$0, float $$1, float $$2) {
      return a(
         "energy_swirl",
         epr.k,
         epy.b.h,
         1536,
         false,
         true,
         fth.b.a().a(K).a(new ftg.n($$0, false, false)).a(new ftg.j($$1, $$2)).a(d).a(ax).a(as).a(au).a(false)
      );
   }

   public static fth h() {
      return bt;
   }

   public static fth i() {
      return bu;
   }

   public static fth r(ahd $$0) {
      return fth.a.aX.apply($$0, ax);
   }

   public static fth j() {
      return bv;
   }

   public static fth k() {
      return bw;
   }

   public static fth l() {
      return bx;
   }

   public static fth m() {
      return by;
   }

   public static fth n() {
      return bz;
   }

   public static fth o() {
      return bA;
   }

   public static fth p() {
      return bB;
   }

   public static fth s(ahd $$0) {
      return bC.apply($$0);
   }

   public static fth t(ahd $$0) {
      return bD.apply($$0);
   }

   public static fth q() {
      return bE;
   }

   public static fth u(ahd $$0) {
      return bF.apply($$0);
   }

   public static fth v(ahd $$0) {
      return bG.apply($$0);
   }

   public static fth w(ahd $$0) {
      return bH.apply($$0);
   }

   public static fth x(ahd $$0) {
      return bI.apply($$0);
   }

   public static fth r() {
      return bJ;
   }

   public static fth y(ahd $$0) {
      return bK.apply($$0);
   }

   public static fth s() {
      return bL;
   }

   private static fth.b P() {
      return fth.b.a().a(as).a(ad).a(am).a(h).a(aM).a(true);
   }

   public static fth t() {
      return bM;
   }

   public static fth u() {
      return bN;
   }

   public static fth v() {
      return bO;
   }

   public static fth w() {
      return aV;
   }

   public static fth x() {
      return aW;
   }

   public static fth a(double $$0) {
      return bP.apply($$0);
   }

   public static fth y() {
      return bQ;
   }

   public static fth z() {
      return bR;
   }

   public static fth A() {
      return bS;
   }

   public static fth B() {
      return bT;
   }

   public static fth C() {
      return bU;
   }

   public static fth D() {
      return bV;
   }

   public static fth E() {
      return bW;
   }

   public fth(String $$0, epy $$1, epy.b $$2, int $$3, boolean $$4, boolean $$5, Runnable $$6, Runnable $$7) {
      super($$0, $$6, $$7);
      this.bY = $$1;
      this.bZ = $$2;
      this.ca = $$3;
      this.cb = $$4;
      this.cc = $$5;
      this.cd = Optional.of(this);
   }

   static fth.a a(String $$0, epy $$1, epy.b $$2, int $$3, fth.b $$4) {
      return a($$0, $$1, $$2, $$3, false, false, $$4);
   }

   private static fth.a a(String $$0, epy $$1, epy.b $$2, int $$3, boolean $$4, boolean $$5, fth.b $$6) {
      return new fth.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   public void a(epo $$0, eqb $$1) {
      if ($$0.k()) {
         if (this.cc) {
            $$0.a($$1);
         }

         epo.b $$2 = $$0.d();
         this.a();
         epp.a($$2);
         this.b();
      }
   }

   @Override
   public String toString() {
      return this.b;
   }

   public static List<fth> F() {
      return bX;
   }

   public int G() {
      return this.ca;
   }

   public epy H() {
      return this.bY;
   }

   public epy.b I() {
      return this.bZ;
   }

   public Optional<fth> J() {
      return Optional.empty();
   }

   public boolean K() {
      return false;
   }

   public boolean L() {
      return this.cb;
   }

   public boolean M() {
      return !this.bZ.l;
   }

   public Optional<fth> N() {
      return this.cd;
   }

   static final class a extends fth {
      static final BiFunction<ahd, ftg.c, fth> aX = ac.a(
         ($$0, $$1) -> fth.a("outline", epr.r, epy.b.h, 1536, fth.b.a().a(N).a(new ftg.n($$0, false, false)).a($$1).a(ay).a(aJ).a(fth.c.b))
      );
      private final fth.b aY;
      private final Optional<fth> aZ;
      private final boolean ba;

      a(String $$0, epy $$1, epy.b $$2, int $$3, boolean $$4, boolean $$5, fth.b $$6) {
         super($$0, $$1, $$2, $$3, $$4, $$5, () -> $$6.o.forEach(ftg::a), () -> $$6.o.forEach(ftg::b));
         this.aY = $$6;
         this.aZ = $$6.n == fth.c.c ? $$6.a.c().map($$1x -> aX.apply($$1x, $$6.e)) : Optional.empty();
         this.ba = $$6.n == fth.c.b;
      }

      @Override
      public Optional<fth> J() {
         return this.aZ;
      }

      @Override
      public boolean K() {
         return this.ba;
      }

      protected final fth.b O() {
         return this.aY;
      }

      @Override
      public String toString() {
         return "RenderType[" + this.b + ":" + this.aY + "]";
      }
   }

   protected static final class b {
      final ftg.e a;
      private final ftg.m b;
      private final ftg.p c;
      private final ftg.d d;
      final ftg.c e;
      private final ftg.g f;
      private final ftg.l g;
      private final ftg.f h;
      private final ftg.k i;
      private final ftg.o j;
      private final ftg.q k;
      private final ftg.h l;
      private final ftg.b m;
      final fth.c n;
      final ImmutableList<ftg> o;

      b(
         ftg.e $$0,
         ftg.m $$1,
         ftg.p $$2,
         ftg.d $$3,
         ftg.c $$4,
         ftg.g $$5,
         ftg.l $$6,
         ftg.f $$7,
         ftg.k $$8,
         ftg.o $$9,
         ftg.q $$10,
         ftg.h $$11,
         ftg.b $$12,
         fth.c $$13
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
         this.o = ImmutableList.of(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.m, new ftg[]{this.l});
      }

      @Override
      public String toString() {
         return "CompositeState[" + this.o + ", outlineProperty=" + this.n + "]";
      }

      public static fth.b.a a() {
         return new fth.b.a();
      }

      public static class a {
         private ftg.e a = ftg.ao;
         private ftg.m b = ftg.i;
         private ftg.p c;
         private ftg.d d;
         private ftg.c e;
         private ftg.g f;
         private ftg.l g;
         private ftg.f h;
         private ftg.k i;
         private ftg.o j;
         private ftg.q k;
         private ftg.h l;
         private ftg.b m;

         a() {
            this.c = ftg.c;
            this.d = ftg.aA;
            this.e = ftg.aw;
            this.f = ftg.at;
            this.g = ftg.av;
            this.h = ftg.aF;
            this.i = ftg.aI;
            this.j = ftg.ap;
            this.k = ftg.aC;
            this.l = ftg.aP;
            this.m = ftg.aQ;
         }

         public fth.b.a a(ftg.e $$0) {
            this.a = $$0;
            return this;
         }

         public fth.b.a a(ftg.m $$0) {
            this.b = $$0;
            return this;
         }

         public fth.b.a a(ftg.p $$0) {
            this.c = $$0;
            return this;
         }

         public fth.b.a a(ftg.d $$0) {
            this.d = $$0;
            return this;
         }

         public fth.b.a a(ftg.c $$0) {
            this.e = $$0;
            return this;
         }

         public fth.b.a a(ftg.g $$0) {
            this.f = $$0;
            return this;
         }

         public fth.b.a a(ftg.l $$0) {
            this.g = $$0;
            return this;
         }

         public fth.b.a a(ftg.f $$0) {
            this.h = $$0;
            return this;
         }

         public fth.b.a a(ftg.k $$0) {
            this.i = $$0;
            return this;
         }

         public fth.b.a a(ftg.o $$0) {
            this.j = $$0;
            return this;
         }

         public fth.b.a a(ftg.q $$0) {
            this.k = $$0;
            return this;
         }

         public fth.b.a a(ftg.h $$0) {
            this.l = $$0;
            return this;
         }

         public fth.b.a a(ftg.b $$0) {
            this.m = $$0;
            return this;
         }

         public fth.b a(boolean $$0) {
            return this.a($$0 ? fth.c.c : fth.c.a);
         }

         public fth.b a(fth.c $$0) {
            return new fth.b(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, $$0);
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
