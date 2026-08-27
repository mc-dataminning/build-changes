import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.function.BiFunction;
import java.util.function.Function;

public abstract class frh extends frg {
   private static final int aW = 1048576;
   public static final int aR = 4194304;
   public static final int aS = 786432;
   public static final int aT = 1536;
   private static final frh aX = a("solid", enz.j, eog.b.h, 4194304, true, false, frh.b.a().a(ar).a(p).a(al).a(true));
   private static final frh aY = a("cutout_mipped", enz.j, eog.b.h, 4194304, true, false, frh.b.a().a(ar).a(q).a(al).a(true));
   private static final frh aZ = a("cutout", enz.j, eog.b.h, 786432, true, false, frh.b.a().a(ar).a(r).a(am).a(true));
   private static final frh ba = a("translucent", enz.j, eog.b.h, 786432, true, true, a(s));
   private static final frh bb = a("translucent_moving_block", enz.j, eog.b.h, 786432, false, true, O());
   private static final Function<agm, frh> bc = ac.b($$0 -> a("armor_cutout_no_cull", $$0, false));
   private static final Function<agm, frh> bd = ac.b($$0 -> {
      frh.b $$1 = frh.b.a().a(v).a(new frg.n($$0, false, false)).a(c).a(ar).a(at).a(true);
      return a("entity_solid", enz.k, eog.b.h, 1536, true, false, $$1);
   });
   private static final Function<agm, frh> be = ac.b($$0 -> {
      frh.b $$1 = frh.b.a().a(w).a(new frg.n($$0, false, false)).a(c).a(ar).a(at).a(true);
      return a("entity_cutout", enz.k, eog.b.h, 1536, true, false, $$1);
   });
   private static final BiFunction<agm, Boolean, frh> bf = ac.a(($$0, $$1) -> {
      frh.b $$2 = frh.b.a().a(x).a(new frg.n($$0, false, false)).a(c).a(aw).a(ar).a(at).a($$1);
      return a("entity_cutout_no_cull", enz.k, eog.b.h, 1536, true, false, $$2);
   });
   private static final BiFunction<agm, Boolean, frh> bg = ac.a(($$0, $$1) -> {
      frh.b $$2 = frh.b.a().a(y).a(new frg.n($$0, false, false)).a(c).a(aw).a(ar).a(at).a(aG).a($$1);
      return a("entity_cutout_no_cull_z_offset", enz.k, eog.b.h, 1536, true, false, $$2);
   });
   private static final Function<agm, frh> bh = ac.b($$0 -> {
      frh.b $$1 = frh.b.a().a(z).a(new frg.n($$0, false, false)).a(h).a(aN).a(ar).a(at).a(frg.aB).a(true);
      return a("item_entity_translucent_cull", enz.k, eog.b.h, 1536, true, true, $$1);
   });
   private static final Function<agm, frh> bi = ac.b($$0 -> {
      frh.b $$1 = frh.b.a().a(A).a(new frg.n($$0, false, false)).a(h).a(ar).a(at).a(true);
      return a("entity_translucent_cull", enz.k, eog.b.h, 1536, true, true, $$1);
   });
   private static final BiFunction<agm, Boolean, frh> bj = ac.a(($$0, $$1) -> {
      frh.b $$2 = frh.b.a().a(B).a(new frg.n($$0, false, false)).a(h).a(aw).a(ar).a(at).a($$1);
      return a("entity_translucent", enz.k, eog.b.h, 1536, true, true, $$2);
   });
   private static final BiFunction<agm, Boolean, frh> bk = ac.a(($$0, $$1) -> {
      frh.b $$2 = frh.b.a().a(C).a(new frg.n($$0, false, false)).a(h).a(aw).a(aC).a(at).a($$1);
      return a("entity_translucent_emissive", enz.k, eog.b.h, 1536, true, true, $$2);
   });
   private static final Function<agm, frh> bl = ac.b($$0 -> {
      frh.b $$1 = frh.b.a().a(D).a(new frg.n($$0, false, false)).a(aw).a(ar).a(true);
      return a("entity_smooth_cutout", enz.k, eog.b.h, 1536, $$1);
   });
   private static final BiFunction<agm, Boolean, frh> bm = ac.a(($$0, $$1) -> {
      frh.b $$2 = frh.b.a().a(E).a(new frg.n($$0, false, false)).a($$1 ? h : c).a($$1 ? aC : aB).a(false);
      return a("beacon_beam", enz.j, eog.b.h, 1536, false, true, $$2);
   });
   private static final Function<agm, frh> bn = ac.b($$0 -> {
      frh.b $$1 = frh.b.a().a(F).a(new frg.n($$0, false, false)).a(ay).a(aw).a(ar).a(at).a(false);
      return a("entity_decal", enz.k, eog.b.h, 1536, $$1);
   });
   private static final Function<agm, frh> bo = ac.b($$0 -> {
      frh.b $$1 = frh.b.a().a(G).a(new frg.n($$0, false, false)).a(h).a(aw).a(ar).a(at).a(aC).a(false);
      return a("entity_no_outline", enz.k, eog.b.h, 1536, false, true, $$1);
   });
   private static final Function<agm, frh> bp = ac.b($$0 -> {
      frh.b $$1 = frh.b.a().a(H).a(new frg.n($$0, false, false)).a(h).a(av).a(ar).a(at).a(aC).a(az).a(aG).a(false);
      return a("entity_shadow", enz.k, eog.b.h, 1536, false, false, $$1);
   });
   private static final Function<agm, frh> bq = ac.b($$0 -> {
      frh.b $$1 = frh.b.a().a(I).a(new frg.n($$0, false, false)).a(aw).a(true);
      return a("entity_alpha", enz.k, eog.b.h, 1536, $$1);
   });
   private static final Function<agm, frh> br = ac.b($$0 -> {
      frg.n $$1 = new frg.n($$0, false, false);
      return a("eyes", enz.k, eog.b.h, 1536, false, true, frh.b.a().a(J).a($$1).a(d).a(aC).a(false));
   });
   private static final frh bs = a("leash", enz.p, eog.b.f, 1536, frh.b.a().a(L).a(an).a(aw).a(ar).a(false));
   private static final frh bt = a("water_mask", enz.m, eog.b.h, 1536, frh.b.a().a(M).a(an).a(aD).a(false));
   private static final frh bu = a(
      "armor_glint", enz.q, eog.b.h, 1536, frh.b.a().a(O).a(new frg.n(fxa.a, true, false)).a(aC).a(aw).a(ay).a(f).a(ap).a(aG).a(false)
   );
   private static final frh bv = a(
      "armor_entity_glint", enz.q, eog.b.h, 1536, frh.b.a().a(P).a(new frg.n(fxa.a, true, false)).a(aC).a(aw).a(ay).a(f).a(aq).a(aG).a(false)
   );
   private static final frh bw = a(
      "glint_translucent", enz.q, eog.b.h, 1536, frh.b.a().a(Q).a(new frg.n(fxa.b, true, false)).a(aC).a(aw).a(ay).a(f).a(ap).a(aN).a(false)
   );
   private static final frh bx = a("glint", enz.q, eog.b.h, 1536, frh.b.a().a(R).a(new frg.n(fxa.b, true, false)).a(aC).a(aw).a(ay).a(f).a(ap).a(false));
   private static final frh by = a("glint_direct", enz.q, eog.b.h, 1536, frh.b.a().a(S).a(new frg.n(fxa.b, true, false)).a(aC).a(aw).a(ay).a(f).a(ap).a(false));
   private static final frh bz = a(
      "entity_glint", enz.q, eog.b.h, 1536, frh.b.a().a(T).a(new frg.n(fxa.a, true, false)).a(aC).a(aw).a(ay).a(f).a(aN).a(aq).a(false)
   );
   private static final frh bA = a(
      "entity_glint_direct", enz.q, eog.b.h, 1536, frh.b.a().a(U).a(new frg.n(fxa.a, true, false)).a(aC).a(aw).a(ay).a(f).a(aq).a(false)
   );
   private static final Function<agm, frh> bB = ac.b($$0 -> {
      frg.n $$1 = new frg.n($$0, false, false);
      return a("crumbling", enz.j, eog.b.h, 1536, false, true, frh.b.a().a(V).a($$1).a(g).a(aC).a(aF).a(false));
   });
   private static final Function<agm, frh> bC = ac.b(
      $$0 -> a("text", enz.t, eog.b.h, 786432, false, true, frh.b.a().a(W).a(new frg.n($$0, false, false)).a(h).a(ar).a(false))
   );
   private static final frh bD = a("text_background", enz.p, eog.b.h, 1536, false, true, frh.b.a().a(X).a(an).a(h).a(ar).a(false));
   private static final Function<agm, frh> bE = ac.b(
      $$0 -> a("text_intensity", enz.t, eog.b.h, 786432, false, true, frh.b.a().a(Y).a(new frg.n($$0, false, false)).a(h).a(ar).a(false))
   );
   private static final Function<agm, frh> bF = ac.b(
      $$0 -> a("text_polygon_offset", enz.t, eog.b.h, 1536, false, true, frh.b.a().a(W).a(new frg.n($$0, false, false)).a(h).a(ar).a(aF).a(false))
   );
   private static final Function<agm, frh> bG = ac.b(
      $$0 -> a("text_intensity_polygon_offset", enz.t, eog.b.h, 1536, false, true, frh.b.a().a(Y).a(new frg.n($$0, false, false)).a(h).a(ar).a(aF).a(false))
   );
   private static final Function<agm, frh> bH = ac.b(
      $$0 -> a("text_see_through", enz.t, eog.b.h, 1536, false, true, frh.b.a().a(Z).a(new frg.n($$0, false, false)).a(h).a(ar).a(ax).a(aC).a(false))
   );
   private static final frh bI = a("text_background_see_through", enz.p, eog.b.h, 1536, false, true, frh.b.a().a(aa).a(an).a(h).a(ar).a(ax).a(aC).a(false));
   private static final Function<agm, frh> bJ = ac.b(
      $$0 -> a("text_intensity_see_through", enz.t, eog.b.h, 1536, false, true, frh.b.a().a(ab).a(new frg.n($$0, false, false)).a(h).a(ar).a(ax).a(aC).a(false))
   );
   private static final frh bK = a("lightning", enz.n, eog.b.h, 1536, false, true, frh.b.a().a(ac).a(aB).a(e).a(aL).a(false));
   private static final frh bL = a("tripwire", enz.j, eog.b.h, 1536, true, true, P());
   private static final frh bM = a(
      "end_portal", enz.m, eog.b.h, 1536, false, false, frh.b.a().a(ae).a(frg.i.d().a(fts.a, false, false).a(fts.b, false, false).a()).a(false)
   );
   private static final frh bN = a(
      "end_gateway", enz.m, eog.b.h, 1536, false, false, frh.b.a().a(af).a(frg.i.d().a(fts.a, false, false).a(fts.b, false, false).a()).a(false)
   );
   public static final frh.a aU = a("lines", enz.o, eog.b.a, 1536, frh.b.a().a(ag).a(new frg.h(OptionalDouble.empty())).a(aG).a(h).a(aN).a(aB).a(aw).a(false));
   public static final frh.a aV = a(
      "line_strip", enz.o, eog.b.b, 1536, frh.b.a().a(ag).a(new frg.h(OptionalDouble.empty())).a(aG).a(h).a(aN).a(aB).a(aw).a(false)
   );
   private static final Function<Double, frh.a> bO = ac.b(
      $$0 -> a("debug_line_strip", enz.n, eog.b.d, 1536, frh.b.a().a(o).a(new frg.h(OptionalDouble.of($$0))).a(c).a(aw).a(false))
   );
   private static final frh.a bP = a("debug_filled_box", enz.n, eog.b.f, 1536, false, true, frh.b.a().a(o).a(aG).a(h).a(false));
   private static final frh.a bQ = a("debug_quads", enz.n, eog.b.h, 1536, false, true, frh.b.a().a(o).a(h).a(aw).a(false));
   private static final frh.a bR = a("debug_section_quads", enz.n, eog.b.h, 1536, false, true, frh.b.a().a(o).a(aG).a(h).a(av).a(false));
   private static final frh.a bS = a("gui", enz.n, eog.b.h, 786432, frh.b.a().a(ah).a(h).a(az).a(false));
   private static final frh.a bT = a("gui_overlay", enz.n, eog.b.h, 1536, frh.b.a().a(ai).a(h).a(ax).a(aC).a(false));
   private static final frh.a bU = a("gui_text_highlight", enz.n, eog.b.h, 1536, frh.b.a().a(aj).a(h).a(ax).a(aQ).a(false));
   private static final frh.a bV = a("gui_ghost_recipe_overlay", enz.n, eog.b.h, 1536, frh.b.a().a(ak).a(h).a(aA).a(aC).a(false));
   private static final ImmutableList<frh> bW = ImmutableList.of(c(), d(), e(), f(), t());
   private final eog bX;
   private final eog.b bY;
   private final int bZ;
   private final boolean ca;
   private final boolean cb;
   private final Optional<frh> cc;

   public static frh c() {
      return aX;
   }

   public static frh d() {
      return aY;
   }

   public static frh e() {
      return aZ;
   }

   private static frh.b a(frg.m $$0) {
      return frh.b.a().a(ar).a($$0).a(al).a(h).a(aJ).a(true);
   }

   public static frh f() {
      return ba;
   }

   private static frh.b O() {
      return frh.b.a().a(ar).a(t).a(al).a(h).a(aN).a(true);
   }

   public static frh g() {
      return bb;
   }

   private static frh.a a(String $$0, agm $$1, boolean $$2) {
      frh.b $$3 = frh.b.a().a(u).a(new frg.n($$1, false, false)).a(c).a(aw).a(ar).a(at).a(aG).a($$2 ? ay : az).a(true);
      return a($$0, enz.k, eog.b.h, 1536, true, false, $$3);
   }

   public static frh a(agm $$0) {
      return bc.apply($$0);
   }

   public static frh b(agm $$0) {
      return a("armor_decal_cutout_no_cull", $$0, true);
   }

   public static frh c(agm $$0) {
      return bd.apply($$0);
   }

   public static frh d(agm $$0) {
      return be.apply($$0);
   }

   public static frh a(agm $$0, boolean $$1) {
      return bf.apply($$0, $$1);
   }

   public static frh e(agm $$0) {
      return a($$0, true);
   }

   public static frh b(agm $$0, boolean $$1) {
      return bg.apply($$0, $$1);
   }

   public static frh f(agm $$0) {
      return b($$0, true);
   }

   public static frh g(agm $$0) {
      return bh.apply($$0);
   }

   public static frh h(agm $$0) {
      return bi.apply($$0);
   }

   public static frh c(agm $$0, boolean $$1) {
      return bj.apply($$0, $$1);
   }

   public static frh i(agm $$0) {
      return c($$0, true);
   }

   public static frh d(agm $$0, boolean $$1) {
      return bk.apply($$0, $$1);
   }

   public static frh j(agm $$0) {
      return d($$0, true);
   }

   public static frh k(agm $$0) {
      return bl.apply($$0);
   }

   public static frh e(agm $$0, boolean $$1) {
      return bm.apply($$0, $$1);
   }

   public static frh l(agm $$0) {
      return bn.apply($$0);
   }

   public static frh m(agm $$0) {
      return bo.apply($$0);
   }

   public static frh n(agm $$0) {
      return bp.apply($$0);
   }

   public static frh o(agm $$0) {
      return bq.apply($$0);
   }

   public static frh p(agm $$0) {
      return br.apply($$0);
   }

   public static frh a(agm $$0, float $$1, float $$2) {
      return a(
         "energy_swirl",
         enz.k,
         eog.b.h,
         1536,
         false,
         true,
         frh.b.a().a(K).a(new frg.n($$0, false, false)).a(new frg.j($$1, $$2)).a(d).a(aw).a(ar).a(at).a(false)
      );
   }

   public static frh h() {
      return bs;
   }

   public static frh i() {
      return bt;
   }

   public static frh q(agm $$0) {
      return frh.a.aW.apply($$0, aw);
   }

   public static frh j() {
      return bu;
   }

   public static frh k() {
      return bv;
   }

   public static frh l() {
      return bw;
   }

   public static frh m() {
      return bx;
   }

   public static frh n() {
      return by;
   }

   public static frh o() {
      return bz;
   }

   public static frh p() {
      return bA;
   }

   public static frh r(agm $$0) {
      return bB.apply($$0);
   }

   public static frh s(agm $$0) {
      return bC.apply($$0);
   }

   public static frh q() {
      return bD;
   }

   public static frh t(agm $$0) {
      return bE.apply($$0);
   }

   public static frh u(agm $$0) {
      return bF.apply($$0);
   }

   public static frh v(agm $$0) {
      return bG.apply($$0);
   }

   public static frh w(agm $$0) {
      return bH.apply($$0);
   }

   public static frh r() {
      return bI;
   }

   public static frh x(agm $$0) {
      return bJ.apply($$0);
   }

   public static frh s() {
      return bK;
   }

   private static frh.b P() {
      return frh.b.a().a(ar).a(ad).a(al).a(h).a(aL).a(true);
   }

   public static frh t() {
      return bL;
   }

   public static frh u() {
      return bM;
   }

   public static frh v() {
      return bN;
   }

   public static frh w() {
      return aU;
   }

   public static frh x() {
      return aV;
   }

   public static frh a(double $$0) {
      return bO.apply($$0);
   }

   public static frh y() {
      return bP;
   }

   public static frh z() {
      return bQ;
   }

   public static frh A() {
      return bR;
   }

   public static frh B() {
      return bS;
   }

   public static frh C() {
      return bT;
   }

   public static frh D() {
      return bU;
   }

   public static frh E() {
      return bV;
   }

   public frh(String $$0, eog $$1, eog.b $$2, int $$3, boolean $$4, boolean $$5, Runnable $$6, Runnable $$7) {
      super($$0, $$6, $$7);
      this.bX = $$1;
      this.bY = $$2;
      this.bZ = $$3;
      this.ca = $$4;
      this.cb = $$5;
      this.cc = Optional.of(this);
   }

   static frh.a a(String $$0, eog $$1, eog.b $$2, int $$3, frh.b $$4) {
      return a($$0, $$1, $$2, $$3, false, false, $$4);
   }

   private static frh.a a(String $$0, eog $$1, eog.b $$2, int $$3, boolean $$4, boolean $$5, frh.b $$6) {
      return new frh.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   public void a(enw $$0, eoj $$1) {
      if ($$0.k()) {
         if (this.cb) {
            $$0.a($$1);
         }

         enw.b $$2 = $$0.d();
         this.a();
         enx.a($$2);
         this.b();
      }
   }

   @Override
   public String toString() {
      return this.b;
   }

   public static List<frh> F() {
      return bW;
   }

   public int G() {
      return this.bZ;
   }

   public eog H() {
      return this.bX;
   }

   public eog.b I() {
      return this.bY;
   }

   public Optional<frh> J() {
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

   public Optional<frh> N() {
      return this.cc;
   }

   static final class a extends frh {
      static final BiFunction<agm, frg.c, frh> aW = ac.a(
         ($$0, $$1) -> frh.a("outline", enz.r, eog.b.h, 1536, frh.b.a().a(N).a(new frg.n($$0, false, false)).a($$1).a(ax).a(aI).a(frh.c.b))
      );
      private final frh.b aX;
      private final Optional<frh> aY;
      private final boolean aZ;

      a(String $$0, eog $$1, eog.b $$2, int $$3, boolean $$4, boolean $$5, frh.b $$6) {
         super($$0, $$1, $$2, $$3, $$4, $$5, () -> $$6.o.forEach(frg::a), () -> $$6.o.forEach(frg::b));
         this.aX = $$6;
         this.aY = $$6.n == frh.c.c ? $$6.a.c().map($$1x -> aW.apply($$1x, $$6.e)) : Optional.empty();
         this.aZ = $$6.n == frh.c.b;
      }

      @Override
      public Optional<frh> J() {
         return this.aY;
      }

      @Override
      public boolean K() {
         return this.aZ;
      }

      protected final frh.b O() {
         return this.aX;
      }

      @Override
      public String toString() {
         return "RenderType[" + this.b + ":" + this.aX + "]";
      }
   }

   protected static final class b {
      final frg.e a;
      private final frg.m b;
      private final frg.p c;
      private final frg.d d;
      final frg.c e;
      private final frg.g f;
      private final frg.l g;
      private final frg.f h;
      private final frg.k i;
      private final frg.o j;
      private final frg.q k;
      private final frg.h l;
      private final frg.b m;
      final frh.c n;
      final ImmutableList<frg> o;

      b(
         frg.e $$0,
         frg.m $$1,
         frg.p $$2,
         frg.d $$3,
         frg.c $$4,
         frg.g $$5,
         frg.l $$6,
         frg.f $$7,
         frg.k $$8,
         frg.o $$9,
         frg.q $$10,
         frg.h $$11,
         frg.b $$12,
         frh.c $$13
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
         this.o = ImmutableList.of(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.m, new frg[]{this.l});
      }

      @Override
      public String toString() {
         return "CompositeState[" + this.o + ", outlineProperty=" + this.n + "]";
      }

      public static frh.b.a a() {
         return new frh.b.a();
      }

      public static class a {
         private frg.e a = frg.an;
         private frg.m b = frg.i;
         private frg.p c;
         private frg.d d;
         private frg.c e;
         private frg.g f;
         private frg.l g;
         private frg.f h;
         private frg.k i;
         private frg.o j;
         private frg.q k;
         private frg.h l;
         private frg.b m;

         a() {
            this.c = frg.c;
            this.d = frg.az;
            this.e = frg.av;
            this.f = frg.as;
            this.g = frg.au;
            this.h = frg.aE;
            this.i = frg.aH;
            this.j = frg.ao;
            this.k = frg.aB;
            this.l = frg.aO;
            this.m = frg.aP;
         }

         public frh.b.a a(frg.e $$0) {
            this.a = $$0;
            return this;
         }

         public frh.b.a a(frg.m $$0) {
            this.b = $$0;
            return this;
         }

         public frh.b.a a(frg.p $$0) {
            this.c = $$0;
            return this;
         }

         public frh.b.a a(frg.d $$0) {
            this.d = $$0;
            return this;
         }

         public frh.b.a a(frg.c $$0) {
            this.e = $$0;
            return this;
         }

         public frh.b.a a(frg.g $$0) {
            this.f = $$0;
            return this;
         }

         public frh.b.a a(frg.l $$0) {
            this.g = $$0;
            return this;
         }

         public frh.b.a a(frg.f $$0) {
            this.h = $$0;
            return this;
         }

         public frh.b.a a(frg.k $$0) {
            this.i = $$0;
            return this;
         }

         public frh.b.a a(frg.o $$0) {
            this.j = $$0;
            return this;
         }

         public frh.b.a a(frg.q $$0) {
            this.k = $$0;
            return this;
         }

         public frh.b.a a(frg.h $$0) {
            this.l = $$0;
            return this;
         }

         public frh.b.a a(frg.b $$0) {
            this.m = $$0;
            return this;
         }

         public frh.b a(boolean $$0) {
            return this.a($$0 ? frh.c.c : frh.c.a);
         }

         public frh.b a(frh.c $$0) {
            return new frh.b(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, $$0);
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
