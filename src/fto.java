import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.function.BiFunction;
import java.util.function.Function;

public abstract class fto extends ftn {
   private static final int aX = 1048576;
   public static final int aS = 4194304;
   public static final int aT = 786432;
   public static final int aU = 1536;
   private static final fto aY = a("solid", epy.j, eqf.b.h, 4194304, true, false, fto.b.a().a(as).a(p).a(am).a(true));
   private static final fto aZ = a("cutout_mipped", epy.j, eqf.b.h, 4194304, true, false, fto.b.a().a(as).a(q).a(am).a(true));
   private static final fto ba = a("cutout", epy.j, eqf.b.h, 786432, true, false, fto.b.a().a(as).a(r).a(an).a(true));
   private static final fto bb = a("translucent", epy.j, eqf.b.h, 786432, true, true, a(s));
   private static final fto bc = a("translucent_moving_block", epy.j, eqf.b.h, 786432, false, true, O());
   private static final Function<ahg, fto> bd = ac.b($$0 -> a("armor_cutout_no_cull", $$0, false));
   private static final Function<ahg, fto> be = ac.b($$0 -> {
      fto.b $$1 = fto.b.a().a(v).a(new ftn.n($$0, false, false)).a(c).a(as).a(au).a(true);
      return a("entity_solid", epy.k, eqf.b.h, 1536, true, false, $$1);
   });
   private static final Function<ahg, fto> bf = ac.b($$0 -> {
      fto.b $$1 = fto.b.a().a(w).a(new ftn.n($$0, false, false)).a(c).a(as).a(au).a(true);
      return a("entity_cutout", epy.k, eqf.b.h, 1536, true, false, $$1);
   });
   private static final BiFunction<ahg, Boolean, fto> bg = ac.a(($$0, $$1) -> {
      fto.b $$2 = fto.b.a().a(x).a(new ftn.n($$0, false, false)).a(c).a(ax).a(as).a(au).a($$1);
      return a("entity_cutout_no_cull", epy.k, eqf.b.h, 1536, true, false, $$2);
   });
   private static final BiFunction<ahg, Boolean, fto> bh = ac.a(($$0, $$1) -> {
      fto.b $$2 = fto.b.a().a(y).a(new ftn.n($$0, false, false)).a(c).a(ax).a(as).a(au).a(aH).a($$1);
      return a("entity_cutout_no_cull_z_offset", epy.k, eqf.b.h, 1536, true, false, $$2);
   });
   private static final Function<ahg, fto> bi = ac.b($$0 -> {
      fto.b $$1 = fto.b.a().a(z).a(new ftn.n($$0, false, false)).a(h).a(aO).a(as).a(au).a(ftn.aC).a(true);
      return a("item_entity_translucent_cull", epy.k, eqf.b.h, 1536, true, true, $$1);
   });
   private static final Function<ahg, fto> bj = ac.b($$0 -> {
      fto.b $$1 = fto.b.a().a(A).a(new ftn.n($$0, false, false)).a(h).a(as).a(au).a(true);
      return a("entity_translucent_cull", epy.k, eqf.b.h, 1536, true, true, $$1);
   });
   private static final BiFunction<ahg, Boolean, fto> bk = ac.a(($$0, $$1) -> {
      fto.b $$2 = fto.b.a().a(B).a(new ftn.n($$0, false, false)).a(h).a(ax).a(as).a(au).a($$1);
      return a("entity_translucent", epy.k, eqf.b.h, 1536, true, true, $$2);
   });
   private static final BiFunction<ahg, Boolean, fto> bl = ac.a(($$0, $$1) -> {
      fto.b $$2 = fto.b.a().a(C).a(new ftn.n($$0, false, false)).a(h).a(ax).a(aD).a(au).a($$1);
      return a("entity_translucent_emissive", epy.k, eqf.b.h, 1536, true, true, $$2);
   });
   private static final Function<ahg, fto> bm = ac.b($$0 -> {
      fto.b $$1 = fto.b.a().a(D).a(new ftn.n($$0, false, false)).a(ax).a(as).a(true);
      return a("entity_smooth_cutout", epy.k, eqf.b.h, 1536, $$1);
   });
   private static final BiFunction<ahg, Boolean, fto> bn = ac.a(($$0, $$1) -> {
      fto.b $$2 = fto.b.a().a(E).a(new ftn.n($$0, false, false)).a($$1 ? h : c).a($$1 ? aD : aC).a(false);
      return a("beacon_beam", epy.j, eqf.b.h, 1536, false, true, $$2);
   });
   private static final Function<ahg, fto> bo = ac.b($$0 -> {
      fto.b $$1 = fto.b.a().a(F).a(new ftn.n($$0, false, false)).a(az).a(ax).a(as).a(au).a(false);
      return a("entity_decal", epy.k, eqf.b.h, 1536, $$1);
   });
   private static final Function<ahg, fto> bp = ac.b($$0 -> {
      fto.b $$1 = fto.b.a().a(G).a(new ftn.n($$0, false, false)).a(h).a(ax).a(as).a(au).a(aD).a(false);
      return a("entity_no_outline", epy.k, eqf.b.h, 1536, false, true, $$1);
   });
   private static final Function<ahg, fto> bq = ac.b($$0 -> {
      fto.b $$1 = fto.b.a().a(H).a(new ftn.n($$0, false, false)).a(h).a(aw).a(as).a(au).a(aD).a(aA).a(aH).a(false);
      return a("entity_shadow", epy.k, eqf.b.h, 1536, false, false, $$1);
   });
   private static final Function<ahg, fto> br = ac.b($$0 -> {
      fto.b $$1 = fto.b.a().a(I).a(new ftn.n($$0, false, false)).a(ax).a(true);
      return a("entity_alpha", epy.k, eqf.b.h, 1536, $$1);
   });
   private static final BiFunction<ahg, ftn.p, fto> bs = ac.a(($$0, $$1) -> {
      ftn.n $$2 = new ftn.n($$0, false, false);
      return a("eyes", epy.k, eqf.b.h, 1536, false, true, fto.b.a().a(J).a($$2).a($$1).a(aD).a(false));
   });
   private static final fto bt = a("leash", epy.p, eqf.b.f, 1536, fto.b.a().a(L).a(ao).a(ax).a(as).a(false));
   private static final fto bu = a("water_mask", epy.m, eqf.b.h, 1536, fto.b.a().a(M).a(ao).a(aE).a(false));
   private static final fto bv = a(
      "armor_glint", epy.q, eqf.b.h, 1536, fto.b.a().a(O).a(new ftn.n(fzk.a, true, false)).a(aD).a(ax).a(az).a(f).a(aq).a(aH).a(false)
   );
   private static final fto bw = a(
      "armor_entity_glint", epy.q, eqf.b.h, 1536, fto.b.a().a(P).a(new ftn.n(fzk.a, true, false)).a(aD).a(ax).a(az).a(f).a(ar).a(aH).a(false)
   );
   private static final fto bx = a(
      "glint_translucent", epy.q, eqf.b.h, 1536, fto.b.a().a(Q).a(new ftn.n(fzk.b, true, false)).a(aD).a(ax).a(az).a(f).a(aq).a(aO).a(false)
   );
   private static final fto by = a("glint", epy.q, eqf.b.h, 1536, fto.b.a().a(R).a(new ftn.n(fzk.b, true, false)).a(aD).a(ax).a(az).a(f).a(aq).a(false));
   private static final fto bz = a("glint_direct", epy.q, eqf.b.h, 1536, fto.b.a().a(S).a(new ftn.n(fzk.b, true, false)).a(aD).a(ax).a(az).a(f).a(aq).a(false));
   private static final fto bA = a(
      "entity_glint", epy.q, eqf.b.h, 1536, fto.b.a().a(T).a(new ftn.n(fzk.a, true, false)).a(aD).a(ax).a(az).a(f).a(aO).a(ar).a(false)
   );
   private static final fto bB = a(
      "entity_glint_direct", epy.q, eqf.b.h, 1536, fto.b.a().a(U).a(new ftn.n(fzk.a, true, false)).a(aD).a(ax).a(az).a(f).a(ar).a(false)
   );
   private static final Function<ahg, fto> bC = ac.b($$0 -> {
      ftn.n $$1 = new ftn.n($$0, false, false);
      return a("crumbling", epy.j, eqf.b.h, 1536, false, true, fto.b.a().a(V).a($$1).a(g).a(aD).a(aG).a(false));
   });
   private static final Function<ahg, fto> bD = ac.b(
      $$0 -> a("text", epy.t, eqf.b.h, 786432, false, true, fto.b.a().a(W).a(new ftn.n($$0, false, false)).a(h).a(as).a(false))
   );
   private static final fto bE = a("text_background", epy.p, eqf.b.h, 1536, false, true, fto.b.a().a(X).a(ao).a(h).a(as).a(false));
   private static final Function<ahg, fto> bF = ac.b(
      $$0 -> a("text_intensity", epy.t, eqf.b.h, 786432, false, true, fto.b.a().a(Y).a(new ftn.n($$0, false, false)).a(h).a(as).a(false))
   );
   private static final Function<ahg, fto> bG = ac.b(
      $$0 -> a("text_polygon_offset", epy.t, eqf.b.h, 1536, false, true, fto.b.a().a(W).a(new ftn.n($$0, false, false)).a(h).a(as).a(aG).a(false))
   );
   private static final Function<ahg, fto> bH = ac.b(
      $$0 -> a("text_intensity_polygon_offset", epy.t, eqf.b.h, 1536, false, true, fto.b.a().a(Y).a(new ftn.n($$0, false, false)).a(h).a(as).a(aG).a(false))
   );
   private static final Function<ahg, fto> bI = ac.b(
      $$0 -> a("text_see_through", epy.t, eqf.b.h, 1536, false, true, fto.b.a().a(Z).a(new ftn.n($$0, false, false)).a(h).a(as).a(ay).a(aD).a(false))
   );
   private static final fto bJ = a("text_background_see_through", epy.p, eqf.b.h, 1536, false, true, fto.b.a().a(aa).a(ao).a(h).a(as).a(ay).a(aD).a(false));
   private static final Function<ahg, fto> bK = ac.b(
      $$0 -> a("text_intensity_see_through", epy.t, eqf.b.h, 1536, false, true, fto.b.a().a(ab).a(new ftn.n($$0, false, false)).a(h).a(as).a(ay).a(aD).a(false))
   );
   private static final fto bL = a("lightning", epy.n, eqf.b.h, 1536, false, true, fto.b.a().a(ac).a(aC).a(e).a(aM).a(false));
   private static final fto bM = a("tripwire", epy.j, eqf.b.h, 1536, true, true, P());
   private static final fto bN = a(
      "end_portal", epy.m, eqf.b.h, 1536, false, false, fto.b.a().a(ae).a(ftn.i.d().a(fvz.a, false, false).a(fvz.b, false, false).a()).a(false)
   );
   private static final fto bO = a(
      "end_gateway", epy.m, eqf.b.h, 1536, false, false, fto.b.a().a(af).a(ftn.i.d().a(fvz.a, false, false).a(fvz.b, false, false).a()).a(false)
   );
   public static final fto.a aV = a("lines", epy.o, eqf.b.a, 1536, fto.b.a().a(ag).a(new ftn.h(OptionalDouble.empty())).a(aH).a(h).a(aO).a(aC).a(ax).a(false));
   public static final fto.a aW = a(
      "line_strip", epy.o, eqf.b.b, 1536, fto.b.a().a(ag).a(new ftn.h(OptionalDouble.empty())).a(aH).a(h).a(aO).a(aC).a(ax).a(false)
   );
   private static final Function<Double, fto.a> bP = ac.b(
      $$0 -> a("debug_line_strip", epy.n, eqf.b.d, 1536, fto.b.a().a(o).a(new ftn.h(OptionalDouble.of($$0))).a(c).a(ax).a(false))
   );
   private static final fto.a bQ = a("debug_filled_box", epy.n, eqf.b.f, 1536, false, true, fto.b.a().a(o).a(aH).a(h).a(false));
   private static final fto.a bR = a("debug_quads", epy.n, eqf.b.h, 1536, false, true, fto.b.a().a(o).a(h).a(ax).a(false));
   private static final fto.a bS = a("debug_section_quads", epy.n, eqf.b.h, 1536, false, true, fto.b.a().a(o).a(aH).a(h).a(aw).a(false));
   private static final fto.a bT = a("gui", epy.n, eqf.b.h, 786432, fto.b.a().a(ah).a(h).a(aA).a(false));
   private static final fto.a bU = a("gui_overlay", epy.n, eqf.b.h, 1536, fto.b.a().a(ai).a(h).a(ay).a(aD).a(false));
   private static final fto.a bV = a("gui_text_highlight", epy.n, eqf.b.h, 1536, fto.b.a().a(aj).a(h).a(ay).a(aR).a(false));
   private static final fto.a bW = a("gui_ghost_recipe_overlay", epy.n, eqf.b.h, 1536, fto.b.a().a(ak).a(h).a(aB).a(aD).a(false));
   private static final ImmutableList<fto> bX = ImmutableList.of(c(), d(), e(), f(), t());
   private final eqf bY;
   private final eqf.b bZ;
   private final int ca;
   private final boolean cb;
   private final boolean cc;
   private final Optional<fto> cd;

   public static fto c() {
      return aY;
   }

   public static fto d() {
      return aZ;
   }

   public static fto e() {
      return ba;
   }

   private static fto.b a(ftn.m $$0) {
      return fto.b.a().a(as).a($$0).a(am).a(h).a(aK).a(true);
   }

   public static fto f() {
      return bb;
   }

   private static fto.b O() {
      return fto.b.a().a(as).a(t).a(am).a(h).a(aO).a(true);
   }

   public static fto g() {
      return bc;
   }

   private static fto.a a(String $$0, ahg $$1, boolean $$2) {
      fto.b $$3 = fto.b.a().a(u).a(new ftn.n($$1, false, false)).a(c).a(ax).a(as).a(au).a(aH).a($$2 ? az : aA).a(true);
      return a($$0, epy.k, eqf.b.h, 1536, true, false, $$3);
   }

   public static fto a(ahg $$0) {
      return bd.apply($$0);
   }

   public static fto b(ahg $$0) {
      return a("armor_decal_cutout_no_cull", $$0, true);
   }

   public static fto c(ahg $$0) {
      return be.apply($$0);
   }

   public static fto d(ahg $$0) {
      return bf.apply($$0);
   }

   public static fto a(ahg $$0, boolean $$1) {
      return bg.apply($$0, $$1);
   }

   public static fto e(ahg $$0) {
      return a($$0, true);
   }

   public static fto b(ahg $$0, boolean $$1) {
      return bh.apply($$0, $$1);
   }

   public static fto f(ahg $$0) {
      return b($$0, true);
   }

   public static fto g(ahg $$0) {
      return bi.apply($$0);
   }

   public static fto h(ahg $$0) {
      return bj.apply($$0);
   }

   public static fto c(ahg $$0, boolean $$1) {
      return bk.apply($$0, $$1);
   }

   public static fto i(ahg $$0) {
      return c($$0, true);
   }

   public static fto d(ahg $$0, boolean $$1) {
      return bl.apply($$0, $$1);
   }

   public static fto j(ahg $$0) {
      return d($$0, true);
   }

   public static fto k(ahg $$0) {
      return bm.apply($$0);
   }

   public static fto e(ahg $$0, boolean $$1) {
      return bn.apply($$0, $$1);
   }

   public static fto l(ahg $$0) {
      return bo.apply($$0);
   }

   public static fto m(ahg $$0) {
      return bp.apply($$0);
   }

   public static fto n(ahg $$0) {
      return bq.apply($$0);
   }

   public static fto o(ahg $$0) {
      return br.apply($$0);
   }

   public static fto p(ahg $$0) {
      return bs.apply($$0, d);
   }

   public static fto q(ahg $$0) {
      return bl.apply($$0, false);
   }

   public static fto a(ahg $$0, float $$1, float $$2) {
      return a(
         "breeze_wind",
         epy.k,
         eqf.b.h,
         1536,
         false,
         true,
         fto.b.a().a(al).a(new ftn.n($$0, false, false)).a(new ftn.j($$1, $$2)).a(h).a(ax).a(as).a(av).a(false)
      );
   }

   public static fto b(ahg $$0, float $$1, float $$2) {
      return a(
         "energy_swirl",
         epy.k,
         eqf.b.h,
         1536,
         false,
         true,
         fto.b.a().a(K).a(new ftn.n($$0, false, false)).a(new ftn.j($$1, $$2)).a(d).a(ax).a(as).a(au).a(false)
      );
   }

   public static fto h() {
      return bt;
   }

   public static fto i() {
      return bu;
   }

   public static fto r(ahg $$0) {
      return fto.a.aX.apply($$0, ax);
   }

   public static fto j() {
      return bv;
   }

   public static fto k() {
      return bw;
   }

   public static fto l() {
      return bx;
   }

   public static fto m() {
      return by;
   }

   public static fto n() {
      return bz;
   }

   public static fto o() {
      return bA;
   }

   public static fto p() {
      return bB;
   }

   public static fto s(ahg $$0) {
      return bC.apply($$0);
   }

   public static fto t(ahg $$0) {
      return bD.apply($$0);
   }

   public static fto q() {
      return bE;
   }

   public static fto u(ahg $$0) {
      return bF.apply($$0);
   }

   public static fto v(ahg $$0) {
      return bG.apply($$0);
   }

   public static fto w(ahg $$0) {
      return bH.apply($$0);
   }

   public static fto x(ahg $$0) {
      return bI.apply($$0);
   }

   public static fto r() {
      return bJ;
   }

   public static fto y(ahg $$0) {
      return bK.apply($$0);
   }

   public static fto s() {
      return bL;
   }

   private static fto.b P() {
      return fto.b.a().a(as).a(ad).a(am).a(h).a(aM).a(true);
   }

   public static fto t() {
      return bM;
   }

   public static fto u() {
      return bN;
   }

   public static fto v() {
      return bO;
   }

   public static fto w() {
      return aV;
   }

   public static fto x() {
      return aW;
   }

   public static fto a(double $$0) {
      return bP.apply($$0);
   }

   public static fto y() {
      return bQ;
   }

   public static fto z() {
      return bR;
   }

   public static fto A() {
      return bS;
   }

   public static fto B() {
      return bT;
   }

   public static fto C() {
      return bU;
   }

   public static fto D() {
      return bV;
   }

   public static fto E() {
      return bW;
   }

   public fto(String $$0, eqf $$1, eqf.b $$2, int $$3, boolean $$4, boolean $$5, Runnable $$6, Runnable $$7) {
      super($$0, $$6, $$7);
      this.bY = $$1;
      this.bZ = $$2;
      this.ca = $$3;
      this.cb = $$4;
      this.cc = $$5;
      this.cd = Optional.of(this);
   }

   static fto.a a(String $$0, eqf $$1, eqf.b $$2, int $$3, fto.b $$4) {
      return a($$0, $$1, $$2, $$3, false, false, $$4);
   }

   private static fto.a a(String $$0, eqf $$1, eqf.b $$2, int $$3, boolean $$4, boolean $$5, fto.b $$6) {
      return new fto.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   public void a(epv $$0, eqi $$1) {
      if ($$0.k()) {
         if (this.cc) {
            $$0.a($$1);
         }

         epv.b $$2 = $$0.d();
         this.a();
         epw.a($$2);
         this.b();
      }
   }

   @Override
   public String toString() {
      return this.b;
   }

   public static List<fto> F() {
      return bX;
   }

   public int G() {
      return this.ca;
   }

   public eqf H() {
      return this.bY;
   }

   public eqf.b I() {
      return this.bZ;
   }

   public Optional<fto> J() {
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

   public Optional<fto> N() {
      return this.cd;
   }

   static final class a extends fto {
      static final BiFunction<ahg, ftn.c, fto> aX = ac.a(
         ($$0, $$1) -> fto.a("outline", epy.r, eqf.b.h, 1536, fto.b.a().a(N).a(new ftn.n($$0, false, false)).a($$1).a(ay).a(aJ).a(fto.c.b))
      );
      private final fto.b aY;
      private final Optional<fto> aZ;
      private final boolean ba;

      a(String $$0, eqf $$1, eqf.b $$2, int $$3, boolean $$4, boolean $$5, fto.b $$6) {
         super($$0, $$1, $$2, $$3, $$4, $$5, () -> $$6.o.forEach(ftn::a), () -> $$6.o.forEach(ftn::b));
         this.aY = $$6;
         this.aZ = $$6.n == fto.c.c ? $$6.a.c().map($$1x -> aX.apply($$1x, $$6.e)) : Optional.empty();
         this.ba = $$6.n == fto.c.b;
      }

      @Override
      public Optional<fto> J() {
         return this.aZ;
      }

      @Override
      public boolean K() {
         return this.ba;
      }

      protected final fto.b O() {
         return this.aY;
      }

      @Override
      public String toString() {
         return "RenderType[" + this.b + ":" + this.aY + "]";
      }
   }

   protected static final class b {
      final ftn.e a;
      private final ftn.m b;
      private final ftn.p c;
      private final ftn.d d;
      final ftn.c e;
      private final ftn.g f;
      private final ftn.l g;
      private final ftn.f h;
      private final ftn.k i;
      private final ftn.o j;
      private final ftn.q k;
      private final ftn.h l;
      private final ftn.b m;
      final fto.c n;
      final ImmutableList<ftn> o;

      b(
         ftn.e $$0,
         ftn.m $$1,
         ftn.p $$2,
         ftn.d $$3,
         ftn.c $$4,
         ftn.g $$5,
         ftn.l $$6,
         ftn.f $$7,
         ftn.k $$8,
         ftn.o $$9,
         ftn.q $$10,
         ftn.h $$11,
         ftn.b $$12,
         fto.c $$13
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
         this.o = ImmutableList.of(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.m, new ftn[]{this.l});
      }

      @Override
      public String toString() {
         return "CompositeState[" + this.o + ", outlineProperty=" + this.n + "]";
      }

      public static fto.b.a a() {
         return new fto.b.a();
      }

      public static class a {
         private ftn.e a = ftn.ao;
         private ftn.m b = ftn.i;
         private ftn.p c;
         private ftn.d d;
         private ftn.c e;
         private ftn.g f;
         private ftn.l g;
         private ftn.f h;
         private ftn.k i;
         private ftn.o j;
         private ftn.q k;
         private ftn.h l;
         private ftn.b m;

         a() {
            this.c = ftn.c;
            this.d = ftn.aA;
            this.e = ftn.aw;
            this.f = ftn.at;
            this.g = ftn.av;
            this.h = ftn.aF;
            this.i = ftn.aI;
            this.j = ftn.ap;
            this.k = ftn.aC;
            this.l = ftn.aP;
            this.m = ftn.aQ;
         }

         public fto.b.a a(ftn.e $$0) {
            this.a = $$0;
            return this;
         }

         public fto.b.a a(ftn.m $$0) {
            this.b = $$0;
            return this;
         }

         public fto.b.a a(ftn.p $$0) {
            this.c = $$0;
            return this;
         }

         public fto.b.a a(ftn.d $$0) {
            this.d = $$0;
            return this;
         }

         public fto.b.a a(ftn.c $$0) {
            this.e = $$0;
            return this;
         }

         public fto.b.a a(ftn.g $$0) {
            this.f = $$0;
            return this;
         }

         public fto.b.a a(ftn.l $$0) {
            this.g = $$0;
            return this;
         }

         public fto.b.a a(ftn.f $$0) {
            this.h = $$0;
            return this;
         }

         public fto.b.a a(ftn.k $$0) {
            this.i = $$0;
            return this;
         }

         public fto.b.a a(ftn.o $$0) {
            this.j = $$0;
            return this;
         }

         public fto.b.a a(ftn.q $$0) {
            this.k = $$0;
            return this;
         }

         public fto.b.a a(ftn.h $$0) {
            this.l = $$0;
            return this;
         }

         public fto.b.a a(ftn.b $$0) {
            this.m = $$0;
            return this;
         }

         public fto.b a(boolean $$0) {
            return this.a($$0 ? fto.c.c : fto.c.a);
         }

         public fto.b a(fto.c $$0) {
            return new fto.b(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, $$0);
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
