import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.function.BiFunction;
import java.util.function.Function;

public abstract class ftn extends ftm {
   private static final int aX = 1048576;
   public static final int aS = 4194304;
   public static final int aT = 786432;
   public static final int aU = 1536;
   private static final ftn aY = a("solid", epx.j, eqe.b.h, 4194304, true, false, ftn.b.a().a(as).a(p).a(am).a(true));
   private static final ftn aZ = a("cutout_mipped", epx.j, eqe.b.h, 4194304, true, false, ftn.b.a().a(as).a(q).a(am).a(true));
   private static final ftn ba = a("cutout", epx.j, eqe.b.h, 786432, true, false, ftn.b.a().a(as).a(r).a(an).a(true));
   private static final ftn bb = a("translucent", epx.j, eqe.b.h, 786432, true, true, a(s));
   private static final ftn bc = a("translucent_moving_block", epx.j, eqe.b.h, 786432, false, true, O());
   private static final Function<ahg, ftn> bd = ac.b($$0 -> a("armor_cutout_no_cull", $$0, false));
   private static final Function<ahg, ftn> be = ac.b($$0 -> {
      ftn.b $$1 = ftn.b.a().a(v).a(new ftm.n($$0, false, false)).a(c).a(as).a(au).a(true);
      return a("entity_solid", epx.k, eqe.b.h, 1536, true, false, $$1);
   });
   private static final Function<ahg, ftn> bf = ac.b($$0 -> {
      ftn.b $$1 = ftn.b.a().a(w).a(new ftm.n($$0, false, false)).a(c).a(as).a(au).a(true);
      return a("entity_cutout", epx.k, eqe.b.h, 1536, true, false, $$1);
   });
   private static final BiFunction<ahg, Boolean, ftn> bg = ac.a(($$0, $$1) -> {
      ftn.b $$2 = ftn.b.a().a(x).a(new ftm.n($$0, false, false)).a(c).a(ax).a(as).a(au).a($$1);
      return a("entity_cutout_no_cull", epx.k, eqe.b.h, 1536, true, false, $$2);
   });
   private static final BiFunction<ahg, Boolean, ftn> bh = ac.a(($$0, $$1) -> {
      ftn.b $$2 = ftn.b.a().a(y).a(new ftm.n($$0, false, false)).a(c).a(ax).a(as).a(au).a(aH).a($$1);
      return a("entity_cutout_no_cull_z_offset", epx.k, eqe.b.h, 1536, true, false, $$2);
   });
   private static final Function<ahg, ftn> bi = ac.b($$0 -> {
      ftn.b $$1 = ftn.b.a().a(z).a(new ftm.n($$0, false, false)).a(h).a(aO).a(as).a(au).a(ftm.aC).a(true);
      return a("item_entity_translucent_cull", epx.k, eqe.b.h, 1536, true, true, $$1);
   });
   private static final Function<ahg, ftn> bj = ac.b($$0 -> {
      ftn.b $$1 = ftn.b.a().a(A).a(new ftm.n($$0, false, false)).a(h).a(as).a(au).a(true);
      return a("entity_translucent_cull", epx.k, eqe.b.h, 1536, true, true, $$1);
   });
   private static final BiFunction<ahg, Boolean, ftn> bk = ac.a(($$0, $$1) -> {
      ftn.b $$2 = ftn.b.a().a(B).a(new ftm.n($$0, false, false)).a(h).a(ax).a(as).a(au).a($$1);
      return a("entity_translucent", epx.k, eqe.b.h, 1536, true, true, $$2);
   });
   private static final BiFunction<ahg, Boolean, ftn> bl = ac.a(($$0, $$1) -> {
      ftn.b $$2 = ftn.b.a().a(C).a(new ftm.n($$0, false, false)).a(h).a(ax).a(aD).a(au).a($$1);
      return a("entity_translucent_emissive", epx.k, eqe.b.h, 1536, true, true, $$2);
   });
   private static final Function<ahg, ftn> bm = ac.b($$0 -> {
      ftn.b $$1 = ftn.b.a().a(D).a(new ftm.n($$0, false, false)).a(ax).a(as).a(true);
      return a("entity_smooth_cutout", epx.k, eqe.b.h, 1536, $$1);
   });
   private static final BiFunction<ahg, Boolean, ftn> bn = ac.a(($$0, $$1) -> {
      ftn.b $$2 = ftn.b.a().a(E).a(new ftm.n($$0, false, false)).a($$1 ? h : c).a($$1 ? aD : aC).a(false);
      return a("beacon_beam", epx.j, eqe.b.h, 1536, false, true, $$2);
   });
   private static final Function<ahg, ftn> bo = ac.b($$0 -> {
      ftn.b $$1 = ftn.b.a().a(F).a(new ftm.n($$0, false, false)).a(az).a(ax).a(as).a(au).a(false);
      return a("entity_decal", epx.k, eqe.b.h, 1536, $$1);
   });
   private static final Function<ahg, ftn> bp = ac.b($$0 -> {
      ftn.b $$1 = ftn.b.a().a(G).a(new ftm.n($$0, false, false)).a(h).a(ax).a(as).a(au).a(aD).a(false);
      return a("entity_no_outline", epx.k, eqe.b.h, 1536, false, true, $$1);
   });
   private static final Function<ahg, ftn> bq = ac.b($$0 -> {
      ftn.b $$1 = ftn.b.a().a(H).a(new ftm.n($$0, false, false)).a(h).a(aw).a(as).a(au).a(aD).a(aA).a(aH).a(false);
      return a("entity_shadow", epx.k, eqe.b.h, 1536, false, false, $$1);
   });
   private static final Function<ahg, ftn> br = ac.b($$0 -> {
      ftn.b $$1 = ftn.b.a().a(I).a(new ftm.n($$0, false, false)).a(ax).a(true);
      return a("entity_alpha", epx.k, eqe.b.h, 1536, $$1);
   });
   private static final BiFunction<ahg, ftm.p, ftn> bs = ac.a(($$0, $$1) -> {
      ftm.n $$2 = new ftm.n($$0, false, false);
      return a("eyes", epx.k, eqe.b.h, 1536, false, true, ftn.b.a().a(J).a($$2).a($$1).a(aD).a(false));
   });
   private static final ftn bt = a("leash", epx.p, eqe.b.f, 1536, ftn.b.a().a(L).a(ao).a(ax).a(as).a(false));
   private static final ftn bu = a("water_mask", epx.m, eqe.b.h, 1536, ftn.b.a().a(M).a(ao).a(aE).a(false));
   private static final ftn bv = a(
      "armor_glint", epx.q, eqe.b.h, 1536, ftn.b.a().a(O).a(new ftm.n(fzj.a, true, false)).a(aD).a(ax).a(az).a(f).a(aq).a(aH).a(false)
   );
   private static final ftn bw = a(
      "armor_entity_glint", epx.q, eqe.b.h, 1536, ftn.b.a().a(P).a(new ftm.n(fzj.a, true, false)).a(aD).a(ax).a(az).a(f).a(ar).a(aH).a(false)
   );
   private static final ftn bx = a(
      "glint_translucent", epx.q, eqe.b.h, 1536, ftn.b.a().a(Q).a(new ftm.n(fzj.b, true, false)).a(aD).a(ax).a(az).a(f).a(aq).a(aO).a(false)
   );
   private static final ftn by = a("glint", epx.q, eqe.b.h, 1536, ftn.b.a().a(R).a(new ftm.n(fzj.b, true, false)).a(aD).a(ax).a(az).a(f).a(aq).a(false));
   private static final ftn bz = a("glint_direct", epx.q, eqe.b.h, 1536, ftn.b.a().a(S).a(new ftm.n(fzj.b, true, false)).a(aD).a(ax).a(az).a(f).a(aq).a(false));
   private static final ftn bA = a(
      "entity_glint", epx.q, eqe.b.h, 1536, ftn.b.a().a(T).a(new ftm.n(fzj.a, true, false)).a(aD).a(ax).a(az).a(f).a(aO).a(ar).a(false)
   );
   private static final ftn bB = a(
      "entity_glint_direct", epx.q, eqe.b.h, 1536, ftn.b.a().a(U).a(new ftm.n(fzj.a, true, false)).a(aD).a(ax).a(az).a(f).a(ar).a(false)
   );
   private static final Function<ahg, ftn> bC = ac.b($$0 -> {
      ftm.n $$1 = new ftm.n($$0, false, false);
      return a("crumbling", epx.j, eqe.b.h, 1536, false, true, ftn.b.a().a(V).a($$1).a(g).a(aD).a(aG).a(false));
   });
   private static final Function<ahg, ftn> bD = ac.b(
      $$0 -> a("text", epx.t, eqe.b.h, 786432, false, true, ftn.b.a().a(W).a(new ftm.n($$0, false, false)).a(h).a(as).a(false))
   );
   private static final ftn bE = a("text_background", epx.p, eqe.b.h, 1536, false, true, ftn.b.a().a(X).a(ao).a(h).a(as).a(false));
   private static final Function<ahg, ftn> bF = ac.b(
      $$0 -> a("text_intensity", epx.t, eqe.b.h, 786432, false, true, ftn.b.a().a(Y).a(new ftm.n($$0, false, false)).a(h).a(as).a(false))
   );
   private static final Function<ahg, ftn> bG = ac.b(
      $$0 -> a("text_polygon_offset", epx.t, eqe.b.h, 1536, false, true, ftn.b.a().a(W).a(new ftm.n($$0, false, false)).a(h).a(as).a(aG).a(false))
   );
   private static final Function<ahg, ftn> bH = ac.b(
      $$0 -> a("text_intensity_polygon_offset", epx.t, eqe.b.h, 1536, false, true, ftn.b.a().a(Y).a(new ftm.n($$0, false, false)).a(h).a(as).a(aG).a(false))
   );
   private static final Function<ahg, ftn> bI = ac.b(
      $$0 -> a("text_see_through", epx.t, eqe.b.h, 1536, false, true, ftn.b.a().a(Z).a(new ftm.n($$0, false, false)).a(h).a(as).a(ay).a(aD).a(false))
   );
   private static final ftn bJ = a("text_background_see_through", epx.p, eqe.b.h, 1536, false, true, ftn.b.a().a(aa).a(ao).a(h).a(as).a(ay).a(aD).a(false));
   private static final Function<ahg, ftn> bK = ac.b(
      $$0 -> a("text_intensity_see_through", epx.t, eqe.b.h, 1536, false, true, ftn.b.a().a(ab).a(new ftm.n($$0, false, false)).a(h).a(as).a(ay).a(aD).a(false))
   );
   private static final ftn bL = a("lightning", epx.n, eqe.b.h, 1536, false, true, ftn.b.a().a(ac).a(aC).a(e).a(aM).a(false));
   private static final ftn bM = a("tripwire", epx.j, eqe.b.h, 1536, true, true, P());
   private static final ftn bN = a(
      "end_portal", epx.m, eqe.b.h, 1536, false, false, ftn.b.a().a(ae).a(ftm.i.d().a(fvy.a, false, false).a(fvy.b, false, false).a()).a(false)
   );
   private static final ftn bO = a(
      "end_gateway", epx.m, eqe.b.h, 1536, false, false, ftn.b.a().a(af).a(ftm.i.d().a(fvy.a, false, false).a(fvy.b, false, false).a()).a(false)
   );
   public static final ftn.a aV = a("lines", epx.o, eqe.b.a, 1536, ftn.b.a().a(ag).a(new ftm.h(OptionalDouble.empty())).a(aH).a(h).a(aO).a(aC).a(ax).a(false));
   public static final ftn.a aW = a(
      "line_strip", epx.o, eqe.b.b, 1536, ftn.b.a().a(ag).a(new ftm.h(OptionalDouble.empty())).a(aH).a(h).a(aO).a(aC).a(ax).a(false)
   );
   private static final Function<Double, ftn.a> bP = ac.b(
      $$0 -> a("debug_line_strip", epx.n, eqe.b.d, 1536, ftn.b.a().a(o).a(new ftm.h(OptionalDouble.of($$0))).a(c).a(ax).a(false))
   );
   private static final ftn.a bQ = a("debug_filled_box", epx.n, eqe.b.f, 1536, false, true, ftn.b.a().a(o).a(aH).a(h).a(false));
   private static final ftn.a bR = a("debug_quads", epx.n, eqe.b.h, 1536, false, true, ftn.b.a().a(o).a(h).a(ax).a(false));
   private static final ftn.a bS = a("debug_section_quads", epx.n, eqe.b.h, 1536, false, true, ftn.b.a().a(o).a(aH).a(h).a(aw).a(false));
   private static final ftn.a bT = a("gui", epx.n, eqe.b.h, 786432, ftn.b.a().a(ah).a(h).a(aA).a(false));
   private static final ftn.a bU = a("gui_overlay", epx.n, eqe.b.h, 1536, ftn.b.a().a(ai).a(h).a(ay).a(aD).a(false));
   private static final ftn.a bV = a("gui_text_highlight", epx.n, eqe.b.h, 1536, ftn.b.a().a(aj).a(h).a(ay).a(aR).a(false));
   private static final ftn.a bW = a("gui_ghost_recipe_overlay", epx.n, eqe.b.h, 1536, ftn.b.a().a(ak).a(h).a(aB).a(aD).a(false));
   private static final ImmutableList<ftn> bX = ImmutableList.of(c(), d(), e(), f(), t());
   private final eqe bY;
   private final eqe.b bZ;
   private final int ca;
   private final boolean cb;
   private final boolean cc;
   private final Optional<ftn> cd;

   public static ftn c() {
      return aY;
   }

   public static ftn d() {
      return aZ;
   }

   public static ftn e() {
      return ba;
   }

   private static ftn.b a(ftm.m $$0) {
      return ftn.b.a().a(as).a($$0).a(am).a(h).a(aK).a(true);
   }

   public static ftn f() {
      return bb;
   }

   private static ftn.b O() {
      return ftn.b.a().a(as).a(t).a(am).a(h).a(aO).a(true);
   }

   public static ftn g() {
      return bc;
   }

   private static ftn.a a(String $$0, ahg $$1, boolean $$2) {
      ftn.b $$3 = ftn.b.a().a(u).a(new ftm.n($$1, false, false)).a(c).a(ax).a(as).a(au).a(aH).a($$2 ? az : aA).a(true);
      return a($$0, epx.k, eqe.b.h, 1536, true, false, $$3);
   }

   public static ftn a(ahg $$0) {
      return bd.apply($$0);
   }

   public static ftn b(ahg $$0) {
      return a("armor_decal_cutout_no_cull", $$0, true);
   }

   public static ftn c(ahg $$0) {
      return be.apply($$0);
   }

   public static ftn d(ahg $$0) {
      return bf.apply($$0);
   }

   public static ftn a(ahg $$0, boolean $$1) {
      return bg.apply($$0, $$1);
   }

   public static ftn e(ahg $$0) {
      return a($$0, true);
   }

   public static ftn b(ahg $$0, boolean $$1) {
      return bh.apply($$0, $$1);
   }

   public static ftn f(ahg $$0) {
      return b($$0, true);
   }

   public static ftn g(ahg $$0) {
      return bi.apply($$0);
   }

   public static ftn h(ahg $$0) {
      return bj.apply($$0);
   }

   public static ftn c(ahg $$0, boolean $$1) {
      return bk.apply($$0, $$1);
   }

   public static ftn i(ahg $$0) {
      return c($$0, true);
   }

   public static ftn d(ahg $$0, boolean $$1) {
      return bl.apply($$0, $$1);
   }

   public static ftn j(ahg $$0) {
      return d($$0, true);
   }

   public static ftn k(ahg $$0) {
      return bm.apply($$0);
   }

   public static ftn e(ahg $$0, boolean $$1) {
      return bn.apply($$0, $$1);
   }

   public static ftn l(ahg $$0) {
      return bo.apply($$0);
   }

   public static ftn m(ahg $$0) {
      return bp.apply($$0);
   }

   public static ftn n(ahg $$0) {
      return bq.apply($$0);
   }

   public static ftn o(ahg $$0) {
      return br.apply($$0);
   }

   public static ftn p(ahg $$0) {
      return bs.apply($$0, d);
   }

   public static ftn q(ahg $$0) {
      return bl.apply($$0, false);
   }

   public static ftn a(ahg $$0, float $$1, float $$2) {
      return a(
         "breeze_wind",
         epx.k,
         eqe.b.h,
         1536,
         false,
         true,
         ftn.b.a().a(al).a(new ftm.n($$0, false, false)).a(new ftm.j($$1, $$2)).a(h).a(ax).a(as).a(av).a(false)
      );
   }

   public static ftn b(ahg $$0, float $$1, float $$2) {
      return a(
         "energy_swirl",
         epx.k,
         eqe.b.h,
         1536,
         false,
         true,
         ftn.b.a().a(K).a(new ftm.n($$0, false, false)).a(new ftm.j($$1, $$2)).a(d).a(ax).a(as).a(au).a(false)
      );
   }

   public static ftn h() {
      return bt;
   }

   public static ftn i() {
      return bu;
   }

   public static ftn r(ahg $$0) {
      return ftn.a.aX.apply($$0, ax);
   }

   public static ftn j() {
      return bv;
   }

   public static ftn k() {
      return bw;
   }

   public static ftn l() {
      return bx;
   }

   public static ftn m() {
      return by;
   }

   public static ftn n() {
      return bz;
   }

   public static ftn o() {
      return bA;
   }

   public static ftn p() {
      return bB;
   }

   public static ftn s(ahg $$0) {
      return bC.apply($$0);
   }

   public static ftn t(ahg $$0) {
      return bD.apply($$0);
   }

   public static ftn q() {
      return bE;
   }

   public static ftn u(ahg $$0) {
      return bF.apply($$0);
   }

   public static ftn v(ahg $$0) {
      return bG.apply($$0);
   }

   public static ftn w(ahg $$0) {
      return bH.apply($$0);
   }

   public static ftn x(ahg $$0) {
      return bI.apply($$0);
   }

   public static ftn r() {
      return bJ;
   }

   public static ftn y(ahg $$0) {
      return bK.apply($$0);
   }

   public static ftn s() {
      return bL;
   }

   private static ftn.b P() {
      return ftn.b.a().a(as).a(ad).a(am).a(h).a(aM).a(true);
   }

   public static ftn t() {
      return bM;
   }

   public static ftn u() {
      return bN;
   }

   public static ftn v() {
      return bO;
   }

   public static ftn w() {
      return aV;
   }

   public static ftn x() {
      return aW;
   }

   public static ftn a(double $$0) {
      return bP.apply($$0);
   }

   public static ftn y() {
      return bQ;
   }

   public static ftn z() {
      return bR;
   }

   public static ftn A() {
      return bS;
   }

   public static ftn B() {
      return bT;
   }

   public static ftn C() {
      return bU;
   }

   public static ftn D() {
      return bV;
   }

   public static ftn E() {
      return bW;
   }

   public ftn(String $$0, eqe $$1, eqe.b $$2, int $$3, boolean $$4, boolean $$5, Runnable $$6, Runnable $$7) {
      super($$0, $$6, $$7);
      this.bY = $$1;
      this.bZ = $$2;
      this.ca = $$3;
      this.cb = $$4;
      this.cc = $$5;
      this.cd = Optional.of(this);
   }

   static ftn.a a(String $$0, eqe $$1, eqe.b $$2, int $$3, ftn.b $$4) {
      return a($$0, $$1, $$2, $$3, false, false, $$4);
   }

   private static ftn.a a(String $$0, eqe $$1, eqe.b $$2, int $$3, boolean $$4, boolean $$5, ftn.b $$6) {
      return new ftn.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   public void a(epu $$0, eqh $$1) {
      if ($$0.k()) {
         if (this.cc) {
            $$0.a($$1);
         }

         epu.b $$2 = $$0.d();
         this.a();
         epv.a($$2);
         this.b();
      }
   }

   @Override
   public String toString() {
      return this.b;
   }

   public static List<ftn> F() {
      return bX;
   }

   public int G() {
      return this.ca;
   }

   public eqe H() {
      return this.bY;
   }

   public eqe.b I() {
      return this.bZ;
   }

   public Optional<ftn> J() {
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

   public Optional<ftn> N() {
      return this.cd;
   }

   static final class a extends ftn {
      static final BiFunction<ahg, ftm.c, ftn> aX = ac.a(
         ($$0, $$1) -> ftn.a("outline", epx.r, eqe.b.h, 1536, ftn.b.a().a(N).a(new ftm.n($$0, false, false)).a($$1).a(ay).a(aJ).a(ftn.c.b))
      );
      private final ftn.b aY;
      private final Optional<ftn> aZ;
      private final boolean ba;

      a(String $$0, eqe $$1, eqe.b $$2, int $$3, boolean $$4, boolean $$5, ftn.b $$6) {
         super($$0, $$1, $$2, $$3, $$4, $$5, () -> $$6.o.forEach(ftm::a), () -> $$6.o.forEach(ftm::b));
         this.aY = $$6;
         this.aZ = $$6.n == ftn.c.c ? $$6.a.c().map($$1x -> aX.apply($$1x, $$6.e)) : Optional.empty();
         this.ba = $$6.n == ftn.c.b;
      }

      @Override
      public Optional<ftn> J() {
         return this.aZ;
      }

      @Override
      public boolean K() {
         return this.ba;
      }

      protected final ftn.b O() {
         return this.aY;
      }

      @Override
      public String toString() {
         return "RenderType[" + this.b + ":" + this.aY + "]";
      }
   }

   protected static final class b {
      final ftm.e a;
      private final ftm.m b;
      private final ftm.p c;
      private final ftm.d d;
      final ftm.c e;
      private final ftm.g f;
      private final ftm.l g;
      private final ftm.f h;
      private final ftm.k i;
      private final ftm.o j;
      private final ftm.q k;
      private final ftm.h l;
      private final ftm.b m;
      final ftn.c n;
      final ImmutableList<ftm> o;

      b(
         ftm.e $$0,
         ftm.m $$1,
         ftm.p $$2,
         ftm.d $$3,
         ftm.c $$4,
         ftm.g $$5,
         ftm.l $$6,
         ftm.f $$7,
         ftm.k $$8,
         ftm.o $$9,
         ftm.q $$10,
         ftm.h $$11,
         ftm.b $$12,
         ftn.c $$13
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
         this.o = ImmutableList.of(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.m, new ftm[]{this.l});
      }

      @Override
      public String toString() {
         return "CompositeState[" + this.o + ", outlineProperty=" + this.n + "]";
      }

      public static ftn.b.a a() {
         return new ftn.b.a();
      }

      public static class a {
         private ftm.e a = ftm.ao;
         private ftm.m b = ftm.i;
         private ftm.p c;
         private ftm.d d;
         private ftm.c e;
         private ftm.g f;
         private ftm.l g;
         private ftm.f h;
         private ftm.k i;
         private ftm.o j;
         private ftm.q k;
         private ftm.h l;
         private ftm.b m;

         a() {
            this.c = ftm.c;
            this.d = ftm.aA;
            this.e = ftm.aw;
            this.f = ftm.at;
            this.g = ftm.av;
            this.h = ftm.aF;
            this.i = ftm.aI;
            this.j = ftm.ap;
            this.k = ftm.aC;
            this.l = ftm.aP;
            this.m = ftm.aQ;
         }

         public ftn.b.a a(ftm.e $$0) {
            this.a = $$0;
            return this;
         }

         public ftn.b.a a(ftm.m $$0) {
            this.b = $$0;
            return this;
         }

         public ftn.b.a a(ftm.p $$0) {
            this.c = $$0;
            return this;
         }

         public ftn.b.a a(ftm.d $$0) {
            this.d = $$0;
            return this;
         }

         public ftn.b.a a(ftm.c $$0) {
            this.e = $$0;
            return this;
         }

         public ftn.b.a a(ftm.g $$0) {
            this.f = $$0;
            return this;
         }

         public ftn.b.a a(ftm.l $$0) {
            this.g = $$0;
            return this;
         }

         public ftn.b.a a(ftm.f $$0) {
            this.h = $$0;
            return this;
         }

         public ftn.b.a a(ftm.k $$0) {
            this.i = $$0;
            return this;
         }

         public ftn.b.a a(ftm.o $$0) {
            this.j = $$0;
            return this;
         }

         public ftn.b.a a(ftm.q $$0) {
            this.k = $$0;
            return this;
         }

         public ftn.b.a a(ftm.h $$0) {
            this.l = $$0;
            return this;
         }

         public ftn.b.a a(ftm.b $$0) {
            this.m = $$0;
            return this;
         }

         public ftn.b a(boolean $$0) {
            return this.a($$0 ? ftn.c.c : ftn.c.a);
         }

         public ftn.b a(ftn.c $$0) {
            return new ftn.b(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, $$0);
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
