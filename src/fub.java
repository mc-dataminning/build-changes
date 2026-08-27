import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.function.BiFunction;
import java.util.function.Function;

public abstract class fub extends fua {
   private static final int aX = 1048576;
   public static final int aS = 4194304;
   public static final int aT = 786432;
   public static final int aU = 1536;
   private static final fub aY = a("solid", eqi.j, eqp.b.h, 4194304, true, false, fub.b.a().a(as).a(p).a(am).a(true));
   private static final fub aZ = a("cutout_mipped", eqi.j, eqp.b.h, 4194304, true, false, fub.b.a().a(as).a(q).a(am).a(true));
   private static final fub ba = a("cutout", eqi.j, eqp.b.h, 786432, true, false, fub.b.a().a(as).a(r).a(an).a(true));
   private static final fub bb = a("translucent", eqi.j, eqp.b.h, 786432, true, true, a(s));
   private static final fub bc = a("translucent_moving_block", eqi.j, eqp.b.h, 786432, false, true, O());
   private static final Function<ahh, fub> bd = ac.b($$0 -> a("armor_cutout_no_cull", $$0, false));
   private static final Function<ahh, fub> be = ac.b($$0 -> {
      fub.b $$1 = fub.b.a().a(v).a(new fua.n($$0, false, false)).a(c).a(as).a(au).a(true);
      return a("entity_solid", eqi.k, eqp.b.h, 1536, true, false, $$1);
   });
   private static final Function<ahh, fub> bf = ac.b($$0 -> {
      fub.b $$1 = fub.b.a().a(w).a(new fua.n($$0, false, false)).a(c).a(as).a(au).a(true);
      return a("entity_cutout", eqi.k, eqp.b.h, 1536, true, false, $$1);
   });
   private static final BiFunction<ahh, Boolean, fub> bg = ac.a(($$0, $$1) -> {
      fub.b $$2 = fub.b.a().a(x).a(new fua.n($$0, false, false)).a(c).a(ax).a(as).a(au).a($$1);
      return a("entity_cutout_no_cull", eqi.k, eqp.b.h, 1536, true, false, $$2);
   });
   private static final BiFunction<ahh, Boolean, fub> bh = ac.a(($$0, $$1) -> {
      fub.b $$2 = fub.b.a().a(y).a(new fua.n($$0, false, false)).a(c).a(ax).a(as).a(au).a(aH).a($$1);
      return a("entity_cutout_no_cull_z_offset", eqi.k, eqp.b.h, 1536, true, false, $$2);
   });
   private static final Function<ahh, fub> bi = ac.b($$0 -> {
      fub.b $$1 = fub.b.a().a(z).a(new fua.n($$0, false, false)).a(h).a(aO).a(as).a(au).a(fua.aC).a(true);
      return a("item_entity_translucent_cull", eqi.k, eqp.b.h, 1536, true, true, $$1);
   });
   private static final Function<ahh, fub> bj = ac.b($$0 -> {
      fub.b $$1 = fub.b.a().a(A).a(new fua.n($$0, false, false)).a(h).a(as).a(au).a(true);
      return a("entity_translucent_cull", eqi.k, eqp.b.h, 1536, true, true, $$1);
   });
   private static final BiFunction<ahh, Boolean, fub> bk = ac.a(($$0, $$1) -> {
      fub.b $$2 = fub.b.a().a(B).a(new fua.n($$0, false, false)).a(h).a(ax).a(as).a(au).a($$1);
      return a("entity_translucent", eqi.k, eqp.b.h, 1536, true, true, $$2);
   });
   private static final BiFunction<ahh, Boolean, fub> bl = ac.a(($$0, $$1) -> {
      fub.b $$2 = fub.b.a().a(C).a(new fua.n($$0, false, false)).a(h).a(ax).a(aD).a(au).a($$1);
      return a("entity_translucent_emissive", eqi.k, eqp.b.h, 1536, true, true, $$2);
   });
   private static final Function<ahh, fub> bm = ac.b($$0 -> {
      fub.b $$1 = fub.b.a().a(D).a(new fua.n($$0, false, false)).a(ax).a(as).a(true);
      return a("entity_smooth_cutout", eqi.k, eqp.b.h, 1536, $$1);
   });
   private static final BiFunction<ahh, Boolean, fub> bn = ac.a(($$0, $$1) -> {
      fub.b $$2 = fub.b.a().a(E).a(new fua.n($$0, false, false)).a($$1 ? h : c).a($$1 ? aD : aC).a(false);
      return a("beacon_beam", eqi.j, eqp.b.h, 1536, false, true, $$2);
   });
   private static final Function<ahh, fub> bo = ac.b($$0 -> {
      fub.b $$1 = fub.b.a().a(F).a(new fua.n($$0, false, false)).a(az).a(ax).a(as).a(au).a(false);
      return a("entity_decal", eqi.k, eqp.b.h, 1536, $$1);
   });
   private static final Function<ahh, fub> bp = ac.b($$0 -> {
      fub.b $$1 = fub.b.a().a(G).a(new fua.n($$0, false, false)).a(h).a(ax).a(as).a(au).a(aD).a(false);
      return a("entity_no_outline", eqi.k, eqp.b.h, 1536, false, true, $$1);
   });
   private static final Function<ahh, fub> bq = ac.b($$0 -> {
      fub.b $$1 = fub.b.a().a(H).a(new fua.n($$0, false, false)).a(h).a(aw).a(as).a(au).a(aD).a(aA).a(aH).a(false);
      return a("entity_shadow", eqi.k, eqp.b.h, 1536, false, false, $$1);
   });
   private static final Function<ahh, fub> br = ac.b($$0 -> {
      fub.b $$1 = fub.b.a().a(I).a(new fua.n($$0, false, false)).a(ax).a(true);
      return a("entity_alpha", eqi.k, eqp.b.h, 1536, $$1);
   });
   private static final BiFunction<ahh, fua.p, fub> bs = ac.a(($$0, $$1) -> {
      fua.n $$2 = new fua.n($$0, false, false);
      return a("eyes", eqi.k, eqp.b.h, 1536, false, true, fub.b.a().a(J).a($$2).a($$1).a(aD).a(false));
   });
   private static final fub bt = a("leash", eqi.p, eqp.b.f, 1536, fub.b.a().a(L).a(ao).a(ax).a(as).a(false));
   private static final fub bu = a("water_mask", eqi.m, eqp.b.h, 1536, fub.b.a().a(M).a(ao).a(aE).a(false));
   private static final fub bv = a(
      "armor_glint", eqi.q, eqp.b.h, 1536, fub.b.a().a(O).a(new fua.n(fzy.a, true, false)).a(aD).a(ax).a(az).a(f).a(aq).a(aH).a(false)
   );
   private static final fub bw = a(
      "armor_entity_glint", eqi.q, eqp.b.h, 1536, fub.b.a().a(P).a(new fua.n(fzy.a, true, false)).a(aD).a(ax).a(az).a(f).a(ar).a(aH).a(false)
   );
   private static final fub bx = a(
      "glint_translucent", eqi.q, eqp.b.h, 1536, fub.b.a().a(Q).a(new fua.n(fzy.b, true, false)).a(aD).a(ax).a(az).a(f).a(aq).a(aO).a(false)
   );
   private static final fub by = a("glint", eqi.q, eqp.b.h, 1536, fub.b.a().a(R).a(new fua.n(fzy.b, true, false)).a(aD).a(ax).a(az).a(f).a(aq).a(false));
   private static final fub bz = a("glint_direct", eqi.q, eqp.b.h, 1536, fub.b.a().a(S).a(new fua.n(fzy.b, true, false)).a(aD).a(ax).a(az).a(f).a(aq).a(false));
   private static final fub bA = a(
      "entity_glint", eqi.q, eqp.b.h, 1536, fub.b.a().a(T).a(new fua.n(fzy.a, true, false)).a(aD).a(ax).a(az).a(f).a(aO).a(ar).a(false)
   );
   private static final fub bB = a(
      "entity_glint_direct", eqi.q, eqp.b.h, 1536, fub.b.a().a(U).a(new fua.n(fzy.a, true, false)).a(aD).a(ax).a(az).a(f).a(ar).a(false)
   );
   private static final Function<ahh, fub> bC = ac.b($$0 -> {
      fua.n $$1 = new fua.n($$0, false, false);
      return a("crumbling", eqi.j, eqp.b.h, 1536, false, true, fub.b.a().a(V).a($$1).a(g).a(aD).a(aG).a(false));
   });
   private static final Function<ahh, fub> bD = ac.b(
      $$0 -> a("text", eqi.t, eqp.b.h, 786432, false, true, fub.b.a().a(W).a(new fua.n($$0, false, false)).a(h).a(as).a(false))
   );
   private static final fub bE = a("text_background", eqi.p, eqp.b.h, 1536, false, true, fub.b.a().a(X).a(ao).a(h).a(as).a(false));
   private static final Function<ahh, fub> bF = ac.b(
      $$0 -> a("text_intensity", eqi.t, eqp.b.h, 786432, false, true, fub.b.a().a(Y).a(new fua.n($$0, false, false)).a(h).a(as).a(false))
   );
   private static final Function<ahh, fub> bG = ac.b(
      $$0 -> a("text_polygon_offset", eqi.t, eqp.b.h, 1536, false, true, fub.b.a().a(W).a(new fua.n($$0, false, false)).a(h).a(as).a(aG).a(false))
   );
   private static final Function<ahh, fub> bH = ac.b(
      $$0 -> a("text_intensity_polygon_offset", eqi.t, eqp.b.h, 1536, false, true, fub.b.a().a(Y).a(new fua.n($$0, false, false)).a(h).a(as).a(aG).a(false))
   );
   private static final Function<ahh, fub> bI = ac.b(
      $$0 -> a("text_see_through", eqi.t, eqp.b.h, 1536, false, true, fub.b.a().a(Z).a(new fua.n($$0, false, false)).a(h).a(as).a(ay).a(aD).a(false))
   );
   private static final fub bJ = a("text_background_see_through", eqi.p, eqp.b.h, 1536, false, true, fub.b.a().a(aa).a(ao).a(h).a(as).a(ay).a(aD).a(false));
   private static final Function<ahh, fub> bK = ac.b(
      $$0 -> a("text_intensity_see_through", eqi.t, eqp.b.h, 1536, false, true, fub.b.a().a(ab).a(new fua.n($$0, false, false)).a(h).a(as).a(ay).a(aD).a(false))
   );
   private static final fub bL = a("lightning", eqi.n, eqp.b.h, 1536, false, true, fub.b.a().a(ac).a(aC).a(e).a(aM).a(false));
   private static final fub bM = a("tripwire", eqi.j, eqp.b.h, 1536, true, true, P());
   private static final fub bN = a(
      "end_portal", eqi.m, eqp.b.h, 1536, false, false, fub.b.a().a(ae).a(fua.i.d().a(fwm.a, false, false).a(fwm.b, false, false).a()).a(false)
   );
   private static final fub bO = a(
      "end_gateway", eqi.m, eqp.b.h, 1536, false, false, fub.b.a().a(af).a(fua.i.d().a(fwm.a, false, false).a(fwm.b, false, false).a()).a(false)
   );
   public static final fub.a aV = a("lines", eqi.o, eqp.b.a, 1536, fub.b.a().a(ag).a(new fua.h(OptionalDouble.empty())).a(aH).a(h).a(aO).a(aC).a(ax).a(false));
   public static final fub.a aW = a(
      "line_strip", eqi.o, eqp.b.b, 1536, fub.b.a().a(ag).a(new fua.h(OptionalDouble.empty())).a(aH).a(h).a(aO).a(aC).a(ax).a(false)
   );
   private static final Function<Double, fub.a> bP = ac.b(
      $$0 -> a("debug_line_strip", eqi.n, eqp.b.d, 1536, fub.b.a().a(o).a(new fua.h(OptionalDouble.of($$0))).a(c).a(ax).a(false))
   );
   private static final fub.a bQ = a("debug_filled_box", eqi.n, eqp.b.f, 1536, false, true, fub.b.a().a(o).a(aH).a(h).a(false));
   private static final fub.a bR = a("debug_quads", eqi.n, eqp.b.h, 1536, false, true, fub.b.a().a(o).a(h).a(ax).a(false));
   private static final fub.a bS = a("debug_section_quads", eqi.n, eqp.b.h, 1536, false, true, fub.b.a().a(o).a(aH).a(h).a(aw).a(false));
   private static final fub.a bT = a("gui", eqi.n, eqp.b.h, 786432, fub.b.a().a(ah).a(h).a(aA).a(false));
   private static final fub.a bU = a("gui_overlay", eqi.n, eqp.b.h, 1536, fub.b.a().a(ai).a(h).a(ay).a(aD).a(false));
   private static final fub.a bV = a("gui_text_highlight", eqi.n, eqp.b.h, 1536, fub.b.a().a(aj).a(h).a(ay).a(aR).a(false));
   private static final fub.a bW = a("gui_ghost_recipe_overlay", eqi.n, eqp.b.h, 1536, fub.b.a().a(ak).a(h).a(aB).a(aD).a(false));
   private static final ImmutableList<fub> bX = ImmutableList.of(c(), d(), e(), f(), t());
   private final eqp bY;
   private final eqp.b bZ;
   private final int ca;
   private final boolean cb;
   private final boolean cc;
   private final Optional<fub> cd;

   public static fub c() {
      return aY;
   }

   public static fub d() {
      return aZ;
   }

   public static fub e() {
      return ba;
   }

   private static fub.b a(fua.m $$0) {
      return fub.b.a().a(as).a($$0).a(am).a(h).a(aK).a(true);
   }

   public static fub f() {
      return bb;
   }

   private static fub.b O() {
      return fub.b.a().a(as).a(t).a(am).a(h).a(aO).a(true);
   }

   public static fub g() {
      return bc;
   }

   private static fub.a a(String $$0, ahh $$1, boolean $$2) {
      fub.b $$3 = fub.b.a().a(u).a(new fua.n($$1, false, false)).a(c).a(ax).a(as).a(au).a(aH).a($$2 ? az : aA).a(true);
      return a($$0, eqi.k, eqp.b.h, 1536, true, false, $$3);
   }

   public static fub a(ahh $$0) {
      return bd.apply($$0);
   }

   public static fub b(ahh $$0) {
      return a("armor_decal_cutout_no_cull", $$0, true);
   }

   public static fub c(ahh $$0) {
      return be.apply($$0);
   }

   public static fub d(ahh $$0) {
      return bf.apply($$0);
   }

   public static fub a(ahh $$0, boolean $$1) {
      return bg.apply($$0, $$1);
   }

   public static fub e(ahh $$0) {
      return a($$0, true);
   }

   public static fub b(ahh $$0, boolean $$1) {
      return bh.apply($$0, $$1);
   }

   public static fub f(ahh $$0) {
      return b($$0, true);
   }

   public static fub g(ahh $$0) {
      return bi.apply($$0);
   }

   public static fub h(ahh $$0) {
      return bj.apply($$0);
   }

   public static fub c(ahh $$0, boolean $$1) {
      return bk.apply($$0, $$1);
   }

   public static fub i(ahh $$0) {
      return c($$0, true);
   }

   public static fub d(ahh $$0, boolean $$1) {
      return bl.apply($$0, $$1);
   }

   public static fub j(ahh $$0) {
      return d($$0, true);
   }

   public static fub k(ahh $$0) {
      return bm.apply($$0);
   }

   public static fub e(ahh $$0, boolean $$1) {
      return bn.apply($$0, $$1);
   }

   public static fub l(ahh $$0) {
      return bo.apply($$0);
   }

   public static fub m(ahh $$0) {
      return bp.apply($$0);
   }

   public static fub n(ahh $$0) {
      return bq.apply($$0);
   }

   public static fub o(ahh $$0) {
      return br.apply($$0);
   }

   public static fub p(ahh $$0) {
      return bs.apply($$0, d);
   }

   public static fub q(ahh $$0) {
      return bl.apply($$0, false);
   }

   public static fub a(ahh $$0, float $$1, float $$2) {
      return a(
         "breeze_wind",
         eqi.k,
         eqp.b.h,
         1536,
         false,
         true,
         fub.b.a().a(al).a(new fua.n($$0, false, false)).a(new fua.j($$1, $$2)).a(h).a(ax).a(as).a(av).a(false)
      );
   }

   public static fub b(ahh $$0, float $$1, float $$2) {
      return a(
         "energy_swirl",
         eqi.k,
         eqp.b.h,
         1536,
         false,
         true,
         fub.b.a().a(K).a(new fua.n($$0, false, false)).a(new fua.j($$1, $$2)).a(d).a(ax).a(as).a(au).a(false)
      );
   }

   public static fub h() {
      return bt;
   }

   public static fub i() {
      return bu;
   }

   public static fub r(ahh $$0) {
      return fub.a.aX.apply($$0, ax);
   }

   public static fub j() {
      return bv;
   }

   public static fub k() {
      return bw;
   }

   public static fub l() {
      return bx;
   }

   public static fub m() {
      return by;
   }

   public static fub n() {
      return bz;
   }

   public static fub o() {
      return bA;
   }

   public static fub p() {
      return bB;
   }

   public static fub s(ahh $$0) {
      return bC.apply($$0);
   }

   public static fub t(ahh $$0) {
      return bD.apply($$0);
   }

   public static fub q() {
      return bE;
   }

   public static fub u(ahh $$0) {
      return bF.apply($$0);
   }

   public static fub v(ahh $$0) {
      return bG.apply($$0);
   }

   public static fub w(ahh $$0) {
      return bH.apply($$0);
   }

   public static fub x(ahh $$0) {
      return bI.apply($$0);
   }

   public static fub r() {
      return bJ;
   }

   public static fub y(ahh $$0) {
      return bK.apply($$0);
   }

   public static fub s() {
      return bL;
   }

   private static fub.b P() {
      return fub.b.a().a(as).a(ad).a(am).a(h).a(aM).a(true);
   }

   public static fub t() {
      return bM;
   }

   public static fub u() {
      return bN;
   }

   public static fub v() {
      return bO;
   }

   public static fub w() {
      return aV;
   }

   public static fub x() {
      return aW;
   }

   public static fub a(double $$0) {
      return bP.apply($$0);
   }

   public static fub y() {
      return bQ;
   }

   public static fub z() {
      return bR;
   }

   public static fub A() {
      return bS;
   }

   public static fub B() {
      return bT;
   }

   public static fub C() {
      return bU;
   }

   public static fub D() {
      return bV;
   }

   public static fub E() {
      return bW;
   }

   public fub(String $$0, eqp $$1, eqp.b $$2, int $$3, boolean $$4, boolean $$5, Runnable $$6, Runnable $$7) {
      super($$0, $$6, $$7);
      this.bY = $$1;
      this.bZ = $$2;
      this.ca = $$3;
      this.cb = $$4;
      this.cc = $$5;
      this.cd = Optional.of(this);
   }

   static fub.a a(String $$0, eqp $$1, eqp.b $$2, int $$3, fub.b $$4) {
      return a($$0, $$1, $$2, $$3, false, false, $$4);
   }

   private static fub.a a(String $$0, eqp $$1, eqp.b $$2, int $$3, boolean $$4, boolean $$5, fub.b $$6) {
      return new fub.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   public void a(eqf $$0, eqs $$1) {
      if ($$0.k()) {
         if (this.cc) {
            $$0.a($$1);
         }

         eqf.b $$2 = $$0.d();
         this.a();
         eqg.a($$2);
         this.b();
      }
   }

   @Override
   public String toString() {
      return this.b;
   }

   public static List<fub> F() {
      return bX;
   }

   public int G() {
      return this.ca;
   }

   public eqp H() {
      return this.bY;
   }

   public eqp.b I() {
      return this.bZ;
   }

   public Optional<fub> J() {
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

   public Optional<fub> N() {
      return this.cd;
   }

   static final class a extends fub {
      static final BiFunction<ahh, fua.c, fub> aX = ac.a(
         ($$0, $$1) -> fub.a("outline", eqi.r, eqp.b.h, 1536, fub.b.a().a(N).a(new fua.n($$0, false, false)).a($$1).a(ay).a(aJ).a(fub.c.b))
      );
      private final fub.b aY;
      private final Optional<fub> aZ;
      private final boolean ba;

      a(String $$0, eqp $$1, eqp.b $$2, int $$3, boolean $$4, boolean $$5, fub.b $$6) {
         super($$0, $$1, $$2, $$3, $$4, $$5, () -> $$6.o.forEach(fua::a), () -> $$6.o.forEach(fua::b));
         this.aY = $$6;
         this.aZ = $$6.n == fub.c.c ? $$6.a.c().map($$1x -> aX.apply($$1x, $$6.e)) : Optional.empty();
         this.ba = $$6.n == fub.c.b;
      }

      @Override
      public Optional<fub> J() {
         return this.aZ;
      }

      @Override
      public boolean K() {
         return this.ba;
      }

      protected final fub.b O() {
         return this.aY;
      }

      @Override
      public String toString() {
         return "RenderType[" + this.b + ":" + this.aY + "]";
      }
   }

   protected static final class b {
      final fua.e a;
      private final fua.m b;
      private final fua.p c;
      private final fua.d d;
      final fua.c e;
      private final fua.g f;
      private final fua.l g;
      private final fua.f h;
      private final fua.k i;
      private final fua.o j;
      private final fua.q k;
      private final fua.h l;
      private final fua.b m;
      final fub.c n;
      final ImmutableList<fua> o;

      b(
         fua.e $$0,
         fua.m $$1,
         fua.p $$2,
         fua.d $$3,
         fua.c $$4,
         fua.g $$5,
         fua.l $$6,
         fua.f $$7,
         fua.k $$8,
         fua.o $$9,
         fua.q $$10,
         fua.h $$11,
         fua.b $$12,
         fub.c $$13
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
         this.o = ImmutableList.of(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.m, new fua[]{this.l});
      }

      @Override
      public String toString() {
         return "CompositeState[" + this.o + ", outlineProperty=" + this.n + "]";
      }

      public static fub.b.a a() {
         return new fub.b.a();
      }

      public static class a {
         private fua.e a = fua.ao;
         private fua.m b = fua.i;
         private fua.p c;
         private fua.d d;
         private fua.c e;
         private fua.g f;
         private fua.l g;
         private fua.f h;
         private fua.k i;
         private fua.o j;
         private fua.q k;
         private fua.h l;
         private fua.b m;

         a() {
            this.c = fua.c;
            this.d = fua.aA;
            this.e = fua.aw;
            this.f = fua.at;
            this.g = fua.av;
            this.h = fua.aF;
            this.i = fua.aI;
            this.j = fua.ap;
            this.k = fua.aC;
            this.l = fua.aP;
            this.m = fua.aQ;
         }

         public fub.b.a a(fua.e $$0) {
            this.a = $$0;
            return this;
         }

         public fub.b.a a(fua.m $$0) {
            this.b = $$0;
            return this;
         }

         public fub.b.a a(fua.p $$0) {
            this.c = $$0;
            return this;
         }

         public fub.b.a a(fua.d $$0) {
            this.d = $$0;
            return this;
         }

         public fub.b.a a(fua.c $$0) {
            this.e = $$0;
            return this;
         }

         public fub.b.a a(fua.g $$0) {
            this.f = $$0;
            return this;
         }

         public fub.b.a a(fua.l $$0) {
            this.g = $$0;
            return this;
         }

         public fub.b.a a(fua.f $$0) {
            this.h = $$0;
            return this;
         }

         public fub.b.a a(fua.k $$0) {
            this.i = $$0;
            return this;
         }

         public fub.b.a a(fua.o $$0) {
            this.j = $$0;
            return this;
         }

         public fub.b.a a(fua.q $$0) {
            this.k = $$0;
            return this;
         }

         public fub.b.a a(fua.h $$0) {
            this.l = $$0;
            return this;
         }

         public fub.b.a a(fua.b $$0) {
            this.m = $$0;
            return this;
         }

         public fub.b a(boolean $$0) {
            return this.a($$0 ? fub.c.c : fub.c.a);
         }

         public fub.b a(fub.c $$0) {
            return new fub.b(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, $$0);
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
