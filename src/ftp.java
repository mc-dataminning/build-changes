import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.function.BiFunction;
import java.util.function.Function;

public abstract class ftp extends fto {
   private static final int aX = 1048576;
   public static final int aS = 4194304;
   public static final int aT = 786432;
   public static final int aU = 1536;
   private static final ftp aY = a("solid", epz.j, eqg.b.h, 4194304, true, false, ftp.b.a().a(as).a(p).a(am).a(true));
   private static final ftp aZ = a("cutout_mipped", epz.j, eqg.b.h, 4194304, true, false, ftp.b.a().a(as).a(q).a(am).a(true));
   private static final ftp ba = a("cutout", epz.j, eqg.b.h, 786432, true, false, ftp.b.a().a(as).a(r).a(an).a(true));
   private static final ftp bb = a("translucent", epz.j, eqg.b.h, 786432, true, true, a(s));
   private static final ftp bc = a("translucent_moving_block", epz.j, eqg.b.h, 786432, false, true, O());
   private static final Function<ahg, ftp> bd = ac.b($$0 -> a("armor_cutout_no_cull", $$0, false));
   private static final Function<ahg, ftp> be = ac.b($$0 -> {
      ftp.b $$1 = ftp.b.a().a(v).a(new fto.n($$0, false, false)).a(c).a(as).a(au).a(true);
      return a("entity_solid", epz.k, eqg.b.h, 1536, true, false, $$1);
   });
   private static final Function<ahg, ftp> bf = ac.b($$0 -> {
      ftp.b $$1 = ftp.b.a().a(w).a(new fto.n($$0, false, false)).a(c).a(as).a(au).a(true);
      return a("entity_cutout", epz.k, eqg.b.h, 1536, true, false, $$1);
   });
   private static final BiFunction<ahg, Boolean, ftp> bg = ac.a(($$0, $$1) -> {
      ftp.b $$2 = ftp.b.a().a(x).a(new fto.n($$0, false, false)).a(c).a(ax).a(as).a(au).a($$1);
      return a("entity_cutout_no_cull", epz.k, eqg.b.h, 1536, true, false, $$2);
   });
   private static final BiFunction<ahg, Boolean, ftp> bh = ac.a(($$0, $$1) -> {
      ftp.b $$2 = ftp.b.a().a(y).a(new fto.n($$0, false, false)).a(c).a(ax).a(as).a(au).a(aH).a($$1);
      return a("entity_cutout_no_cull_z_offset", epz.k, eqg.b.h, 1536, true, false, $$2);
   });
   private static final Function<ahg, ftp> bi = ac.b($$0 -> {
      ftp.b $$1 = ftp.b.a().a(z).a(new fto.n($$0, false, false)).a(h).a(aO).a(as).a(au).a(fto.aC).a(true);
      return a("item_entity_translucent_cull", epz.k, eqg.b.h, 1536, true, true, $$1);
   });
   private static final Function<ahg, ftp> bj = ac.b($$0 -> {
      ftp.b $$1 = ftp.b.a().a(A).a(new fto.n($$0, false, false)).a(h).a(as).a(au).a(true);
      return a("entity_translucent_cull", epz.k, eqg.b.h, 1536, true, true, $$1);
   });
   private static final BiFunction<ahg, Boolean, ftp> bk = ac.a(($$0, $$1) -> {
      ftp.b $$2 = ftp.b.a().a(B).a(new fto.n($$0, false, false)).a(h).a(ax).a(as).a(au).a($$1);
      return a("entity_translucent", epz.k, eqg.b.h, 1536, true, true, $$2);
   });
   private static final BiFunction<ahg, Boolean, ftp> bl = ac.a(($$0, $$1) -> {
      ftp.b $$2 = ftp.b.a().a(C).a(new fto.n($$0, false, false)).a(h).a(ax).a(aD).a(au).a($$1);
      return a("entity_translucent_emissive", epz.k, eqg.b.h, 1536, true, true, $$2);
   });
   private static final Function<ahg, ftp> bm = ac.b($$0 -> {
      ftp.b $$1 = ftp.b.a().a(D).a(new fto.n($$0, false, false)).a(ax).a(as).a(true);
      return a("entity_smooth_cutout", epz.k, eqg.b.h, 1536, $$1);
   });
   private static final BiFunction<ahg, Boolean, ftp> bn = ac.a(($$0, $$1) -> {
      ftp.b $$2 = ftp.b.a().a(E).a(new fto.n($$0, false, false)).a($$1 ? h : c).a($$1 ? aD : aC).a(false);
      return a("beacon_beam", epz.j, eqg.b.h, 1536, false, true, $$2);
   });
   private static final Function<ahg, ftp> bo = ac.b($$0 -> {
      ftp.b $$1 = ftp.b.a().a(F).a(new fto.n($$0, false, false)).a(az).a(ax).a(as).a(au).a(false);
      return a("entity_decal", epz.k, eqg.b.h, 1536, $$1);
   });
   private static final Function<ahg, ftp> bp = ac.b($$0 -> {
      ftp.b $$1 = ftp.b.a().a(G).a(new fto.n($$0, false, false)).a(h).a(ax).a(as).a(au).a(aD).a(false);
      return a("entity_no_outline", epz.k, eqg.b.h, 1536, false, true, $$1);
   });
   private static final Function<ahg, ftp> bq = ac.b($$0 -> {
      ftp.b $$1 = ftp.b.a().a(H).a(new fto.n($$0, false, false)).a(h).a(aw).a(as).a(au).a(aD).a(aA).a(aH).a(false);
      return a("entity_shadow", epz.k, eqg.b.h, 1536, false, false, $$1);
   });
   private static final Function<ahg, ftp> br = ac.b($$0 -> {
      ftp.b $$1 = ftp.b.a().a(I).a(new fto.n($$0, false, false)).a(ax).a(true);
      return a("entity_alpha", epz.k, eqg.b.h, 1536, $$1);
   });
   private static final BiFunction<ahg, fto.p, ftp> bs = ac.a(($$0, $$1) -> {
      fto.n $$2 = new fto.n($$0, false, false);
      return a("eyes", epz.k, eqg.b.h, 1536, false, true, ftp.b.a().a(J).a($$2).a($$1).a(aD).a(false));
   });
   private static final ftp bt = a("leash", epz.p, eqg.b.f, 1536, ftp.b.a().a(L).a(ao).a(ax).a(as).a(false));
   private static final ftp bu = a("water_mask", epz.m, eqg.b.h, 1536, ftp.b.a().a(M).a(ao).a(aE).a(false));
   private static final ftp bv = a(
      "armor_glint", epz.q, eqg.b.h, 1536, ftp.b.a().a(O).a(new fto.n(fzl.a, true, false)).a(aD).a(ax).a(az).a(f).a(aq).a(aH).a(false)
   );
   private static final ftp bw = a(
      "armor_entity_glint", epz.q, eqg.b.h, 1536, ftp.b.a().a(P).a(new fto.n(fzl.a, true, false)).a(aD).a(ax).a(az).a(f).a(ar).a(aH).a(false)
   );
   private static final ftp bx = a(
      "glint_translucent", epz.q, eqg.b.h, 1536, ftp.b.a().a(Q).a(new fto.n(fzl.b, true, false)).a(aD).a(ax).a(az).a(f).a(aq).a(aO).a(false)
   );
   private static final ftp by = a("glint", epz.q, eqg.b.h, 1536, ftp.b.a().a(R).a(new fto.n(fzl.b, true, false)).a(aD).a(ax).a(az).a(f).a(aq).a(false));
   private static final ftp bz = a("glint_direct", epz.q, eqg.b.h, 1536, ftp.b.a().a(S).a(new fto.n(fzl.b, true, false)).a(aD).a(ax).a(az).a(f).a(aq).a(false));
   private static final ftp bA = a(
      "entity_glint", epz.q, eqg.b.h, 1536, ftp.b.a().a(T).a(new fto.n(fzl.a, true, false)).a(aD).a(ax).a(az).a(f).a(aO).a(ar).a(false)
   );
   private static final ftp bB = a(
      "entity_glint_direct", epz.q, eqg.b.h, 1536, ftp.b.a().a(U).a(new fto.n(fzl.a, true, false)).a(aD).a(ax).a(az).a(f).a(ar).a(false)
   );
   private static final Function<ahg, ftp> bC = ac.b($$0 -> {
      fto.n $$1 = new fto.n($$0, false, false);
      return a("crumbling", epz.j, eqg.b.h, 1536, false, true, ftp.b.a().a(V).a($$1).a(g).a(aD).a(aG).a(false));
   });
   private static final Function<ahg, ftp> bD = ac.b(
      $$0 -> a("text", epz.t, eqg.b.h, 786432, false, true, ftp.b.a().a(W).a(new fto.n($$0, false, false)).a(h).a(as).a(false))
   );
   private static final ftp bE = a("text_background", epz.p, eqg.b.h, 1536, false, true, ftp.b.a().a(X).a(ao).a(h).a(as).a(false));
   private static final Function<ahg, ftp> bF = ac.b(
      $$0 -> a("text_intensity", epz.t, eqg.b.h, 786432, false, true, ftp.b.a().a(Y).a(new fto.n($$0, false, false)).a(h).a(as).a(false))
   );
   private static final Function<ahg, ftp> bG = ac.b(
      $$0 -> a("text_polygon_offset", epz.t, eqg.b.h, 1536, false, true, ftp.b.a().a(W).a(new fto.n($$0, false, false)).a(h).a(as).a(aG).a(false))
   );
   private static final Function<ahg, ftp> bH = ac.b(
      $$0 -> a("text_intensity_polygon_offset", epz.t, eqg.b.h, 1536, false, true, ftp.b.a().a(Y).a(new fto.n($$0, false, false)).a(h).a(as).a(aG).a(false))
   );
   private static final Function<ahg, ftp> bI = ac.b(
      $$0 -> a("text_see_through", epz.t, eqg.b.h, 1536, false, true, ftp.b.a().a(Z).a(new fto.n($$0, false, false)).a(h).a(as).a(ay).a(aD).a(false))
   );
   private static final ftp bJ = a("text_background_see_through", epz.p, eqg.b.h, 1536, false, true, ftp.b.a().a(aa).a(ao).a(h).a(as).a(ay).a(aD).a(false));
   private static final Function<ahg, ftp> bK = ac.b(
      $$0 -> a("text_intensity_see_through", epz.t, eqg.b.h, 1536, false, true, ftp.b.a().a(ab).a(new fto.n($$0, false, false)).a(h).a(as).a(ay).a(aD).a(false))
   );
   private static final ftp bL = a("lightning", epz.n, eqg.b.h, 1536, false, true, ftp.b.a().a(ac).a(aC).a(e).a(aM).a(false));
   private static final ftp bM = a("tripwire", epz.j, eqg.b.h, 1536, true, true, P());
   private static final ftp bN = a(
      "end_portal", epz.m, eqg.b.h, 1536, false, false, ftp.b.a().a(ae).a(fto.i.d().a(fwa.a, false, false).a(fwa.b, false, false).a()).a(false)
   );
   private static final ftp bO = a(
      "end_gateway", epz.m, eqg.b.h, 1536, false, false, ftp.b.a().a(af).a(fto.i.d().a(fwa.a, false, false).a(fwa.b, false, false).a()).a(false)
   );
   public static final ftp.a aV = a("lines", epz.o, eqg.b.a, 1536, ftp.b.a().a(ag).a(new fto.h(OptionalDouble.empty())).a(aH).a(h).a(aO).a(aC).a(ax).a(false));
   public static final ftp.a aW = a(
      "line_strip", epz.o, eqg.b.b, 1536, ftp.b.a().a(ag).a(new fto.h(OptionalDouble.empty())).a(aH).a(h).a(aO).a(aC).a(ax).a(false)
   );
   private static final Function<Double, ftp.a> bP = ac.b(
      $$0 -> a("debug_line_strip", epz.n, eqg.b.d, 1536, ftp.b.a().a(o).a(new fto.h(OptionalDouble.of($$0))).a(c).a(ax).a(false))
   );
   private static final ftp.a bQ = a("debug_filled_box", epz.n, eqg.b.f, 1536, false, true, ftp.b.a().a(o).a(aH).a(h).a(false));
   private static final ftp.a bR = a("debug_quads", epz.n, eqg.b.h, 1536, false, true, ftp.b.a().a(o).a(h).a(ax).a(false));
   private static final ftp.a bS = a("debug_section_quads", epz.n, eqg.b.h, 1536, false, true, ftp.b.a().a(o).a(aH).a(h).a(aw).a(false));
   private static final ftp.a bT = a("gui", epz.n, eqg.b.h, 786432, ftp.b.a().a(ah).a(h).a(aA).a(false));
   private static final ftp.a bU = a("gui_overlay", epz.n, eqg.b.h, 1536, ftp.b.a().a(ai).a(h).a(ay).a(aD).a(false));
   private static final ftp.a bV = a("gui_text_highlight", epz.n, eqg.b.h, 1536, ftp.b.a().a(aj).a(h).a(ay).a(aR).a(false));
   private static final ftp.a bW = a("gui_ghost_recipe_overlay", epz.n, eqg.b.h, 1536, ftp.b.a().a(ak).a(h).a(aB).a(aD).a(false));
   private static final ImmutableList<ftp> bX = ImmutableList.of(c(), d(), e(), f(), t());
   private final eqg bY;
   private final eqg.b bZ;
   private final int ca;
   private final boolean cb;
   private final boolean cc;
   private final Optional<ftp> cd;

   public static ftp c() {
      return aY;
   }

   public static ftp d() {
      return aZ;
   }

   public static ftp e() {
      return ba;
   }

   private static ftp.b a(fto.m $$0) {
      return ftp.b.a().a(as).a($$0).a(am).a(h).a(aK).a(true);
   }

   public static ftp f() {
      return bb;
   }

   private static ftp.b O() {
      return ftp.b.a().a(as).a(t).a(am).a(h).a(aO).a(true);
   }

   public static ftp g() {
      return bc;
   }

   private static ftp.a a(String $$0, ahg $$1, boolean $$2) {
      ftp.b $$3 = ftp.b.a().a(u).a(new fto.n($$1, false, false)).a(c).a(ax).a(as).a(au).a(aH).a($$2 ? az : aA).a(true);
      return a($$0, epz.k, eqg.b.h, 1536, true, false, $$3);
   }

   public static ftp a(ahg $$0) {
      return bd.apply($$0);
   }

   public static ftp b(ahg $$0) {
      return a("armor_decal_cutout_no_cull", $$0, true);
   }

   public static ftp c(ahg $$0) {
      return be.apply($$0);
   }

   public static ftp d(ahg $$0) {
      return bf.apply($$0);
   }

   public static ftp a(ahg $$0, boolean $$1) {
      return bg.apply($$0, $$1);
   }

   public static ftp e(ahg $$0) {
      return a($$0, true);
   }

   public static ftp b(ahg $$0, boolean $$1) {
      return bh.apply($$0, $$1);
   }

   public static ftp f(ahg $$0) {
      return b($$0, true);
   }

   public static ftp g(ahg $$0) {
      return bi.apply($$0);
   }

   public static ftp h(ahg $$0) {
      return bj.apply($$0);
   }

   public static ftp c(ahg $$0, boolean $$1) {
      return bk.apply($$0, $$1);
   }

   public static ftp i(ahg $$0) {
      return c($$0, true);
   }

   public static ftp d(ahg $$0, boolean $$1) {
      return bl.apply($$0, $$1);
   }

   public static ftp j(ahg $$0) {
      return d($$0, true);
   }

   public static ftp k(ahg $$0) {
      return bm.apply($$0);
   }

   public static ftp e(ahg $$0, boolean $$1) {
      return bn.apply($$0, $$1);
   }

   public static ftp l(ahg $$0) {
      return bo.apply($$0);
   }

   public static ftp m(ahg $$0) {
      return bp.apply($$0);
   }

   public static ftp n(ahg $$0) {
      return bq.apply($$0);
   }

   public static ftp o(ahg $$0) {
      return br.apply($$0);
   }

   public static ftp p(ahg $$0) {
      return bs.apply($$0, d);
   }

   public static ftp q(ahg $$0) {
      return bl.apply($$0, false);
   }

   public static ftp a(ahg $$0, float $$1, float $$2) {
      return a(
         "breeze_wind",
         epz.k,
         eqg.b.h,
         1536,
         false,
         true,
         ftp.b.a().a(al).a(new fto.n($$0, false, false)).a(new fto.j($$1, $$2)).a(h).a(ax).a(as).a(av).a(false)
      );
   }

   public static ftp b(ahg $$0, float $$1, float $$2) {
      return a(
         "energy_swirl",
         epz.k,
         eqg.b.h,
         1536,
         false,
         true,
         ftp.b.a().a(K).a(new fto.n($$0, false, false)).a(new fto.j($$1, $$2)).a(d).a(ax).a(as).a(au).a(false)
      );
   }

   public static ftp h() {
      return bt;
   }

   public static ftp i() {
      return bu;
   }

   public static ftp r(ahg $$0) {
      return ftp.a.aX.apply($$0, ax);
   }

   public static ftp j() {
      return bv;
   }

   public static ftp k() {
      return bw;
   }

   public static ftp l() {
      return bx;
   }

   public static ftp m() {
      return by;
   }

   public static ftp n() {
      return bz;
   }

   public static ftp o() {
      return bA;
   }

   public static ftp p() {
      return bB;
   }

   public static ftp s(ahg $$0) {
      return bC.apply($$0);
   }

   public static ftp t(ahg $$0) {
      return bD.apply($$0);
   }

   public static ftp q() {
      return bE;
   }

   public static ftp u(ahg $$0) {
      return bF.apply($$0);
   }

   public static ftp v(ahg $$0) {
      return bG.apply($$0);
   }

   public static ftp w(ahg $$0) {
      return bH.apply($$0);
   }

   public static ftp x(ahg $$0) {
      return bI.apply($$0);
   }

   public static ftp r() {
      return bJ;
   }

   public static ftp y(ahg $$0) {
      return bK.apply($$0);
   }

   public static ftp s() {
      return bL;
   }

   private static ftp.b P() {
      return ftp.b.a().a(as).a(ad).a(am).a(h).a(aM).a(true);
   }

   public static ftp t() {
      return bM;
   }

   public static ftp u() {
      return bN;
   }

   public static ftp v() {
      return bO;
   }

   public static ftp w() {
      return aV;
   }

   public static ftp x() {
      return aW;
   }

   public static ftp a(double $$0) {
      return bP.apply($$0);
   }

   public static ftp y() {
      return bQ;
   }

   public static ftp z() {
      return bR;
   }

   public static ftp A() {
      return bS;
   }

   public static ftp B() {
      return bT;
   }

   public static ftp C() {
      return bU;
   }

   public static ftp D() {
      return bV;
   }

   public static ftp E() {
      return bW;
   }

   public ftp(String $$0, eqg $$1, eqg.b $$2, int $$3, boolean $$4, boolean $$5, Runnable $$6, Runnable $$7) {
      super($$0, $$6, $$7);
      this.bY = $$1;
      this.bZ = $$2;
      this.ca = $$3;
      this.cb = $$4;
      this.cc = $$5;
      this.cd = Optional.of(this);
   }

   static ftp.a a(String $$0, eqg $$1, eqg.b $$2, int $$3, ftp.b $$4) {
      return a($$0, $$1, $$2, $$3, false, false, $$4);
   }

   private static ftp.a a(String $$0, eqg $$1, eqg.b $$2, int $$3, boolean $$4, boolean $$5, ftp.b $$6) {
      return new ftp.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   public void a(epw $$0, eqj $$1) {
      if ($$0.k()) {
         if (this.cc) {
            $$0.a($$1);
         }

         epw.b $$2 = $$0.d();
         this.a();
         epx.a($$2);
         this.b();
      }
   }

   @Override
   public String toString() {
      return this.b;
   }

   public static List<ftp> F() {
      return bX;
   }

   public int G() {
      return this.ca;
   }

   public eqg H() {
      return this.bY;
   }

   public eqg.b I() {
      return this.bZ;
   }

   public Optional<ftp> J() {
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

   public Optional<ftp> N() {
      return this.cd;
   }

   static final class a extends ftp {
      static final BiFunction<ahg, fto.c, ftp> aX = ac.a(
         ($$0, $$1) -> ftp.a("outline", epz.r, eqg.b.h, 1536, ftp.b.a().a(N).a(new fto.n($$0, false, false)).a($$1).a(ay).a(aJ).a(ftp.c.b))
      );
      private final ftp.b aY;
      private final Optional<ftp> aZ;
      private final boolean ba;

      a(String $$0, eqg $$1, eqg.b $$2, int $$3, boolean $$4, boolean $$5, ftp.b $$6) {
         super($$0, $$1, $$2, $$3, $$4, $$5, () -> $$6.o.forEach(fto::a), () -> $$6.o.forEach(fto::b));
         this.aY = $$6;
         this.aZ = $$6.n == ftp.c.c ? $$6.a.c().map($$1x -> aX.apply($$1x, $$6.e)) : Optional.empty();
         this.ba = $$6.n == ftp.c.b;
      }

      @Override
      public Optional<ftp> J() {
         return this.aZ;
      }

      @Override
      public boolean K() {
         return this.ba;
      }

      protected final ftp.b O() {
         return this.aY;
      }

      @Override
      public String toString() {
         return "RenderType[" + this.b + ":" + this.aY + "]";
      }
   }

   protected static final class b {
      final fto.e a;
      private final fto.m b;
      private final fto.p c;
      private final fto.d d;
      final fto.c e;
      private final fto.g f;
      private final fto.l g;
      private final fto.f h;
      private final fto.k i;
      private final fto.o j;
      private final fto.q k;
      private final fto.h l;
      private final fto.b m;
      final ftp.c n;
      final ImmutableList<fto> o;

      b(
         fto.e $$0,
         fto.m $$1,
         fto.p $$2,
         fto.d $$3,
         fto.c $$4,
         fto.g $$5,
         fto.l $$6,
         fto.f $$7,
         fto.k $$8,
         fto.o $$9,
         fto.q $$10,
         fto.h $$11,
         fto.b $$12,
         ftp.c $$13
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
         this.o = ImmutableList.of(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.m, new fto[]{this.l});
      }

      @Override
      public String toString() {
         return "CompositeState[" + this.o + ", outlineProperty=" + this.n + "]";
      }

      public static ftp.b.a a() {
         return new ftp.b.a();
      }

      public static class a {
         private fto.e a = fto.ao;
         private fto.m b = fto.i;
         private fto.p c;
         private fto.d d;
         private fto.c e;
         private fto.g f;
         private fto.l g;
         private fto.f h;
         private fto.k i;
         private fto.o j;
         private fto.q k;
         private fto.h l;
         private fto.b m;

         a() {
            this.c = fto.c;
            this.d = fto.aA;
            this.e = fto.aw;
            this.f = fto.at;
            this.g = fto.av;
            this.h = fto.aF;
            this.i = fto.aI;
            this.j = fto.ap;
            this.k = fto.aC;
            this.l = fto.aP;
            this.m = fto.aQ;
         }

         public ftp.b.a a(fto.e $$0) {
            this.a = $$0;
            return this;
         }

         public ftp.b.a a(fto.m $$0) {
            this.b = $$0;
            return this;
         }

         public ftp.b.a a(fto.p $$0) {
            this.c = $$0;
            return this;
         }

         public ftp.b.a a(fto.d $$0) {
            this.d = $$0;
            return this;
         }

         public ftp.b.a a(fto.c $$0) {
            this.e = $$0;
            return this;
         }

         public ftp.b.a a(fto.g $$0) {
            this.f = $$0;
            return this;
         }

         public ftp.b.a a(fto.l $$0) {
            this.g = $$0;
            return this;
         }

         public ftp.b.a a(fto.f $$0) {
            this.h = $$0;
            return this;
         }

         public ftp.b.a a(fto.k $$0) {
            this.i = $$0;
            return this;
         }

         public ftp.b.a a(fto.o $$0) {
            this.j = $$0;
            return this;
         }

         public ftp.b.a a(fto.q $$0) {
            this.k = $$0;
            return this;
         }

         public ftp.b.a a(fto.h $$0) {
            this.l = $$0;
            return this;
         }

         public ftp.b.a a(fto.b $$0) {
            this.m = $$0;
            return this;
         }

         public ftp.b a(boolean $$0) {
            return this.a($$0 ? ftp.c.c : ftp.c.a);
         }

         public ftp.b a(ftp.c $$0) {
            return new ftp.b(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, $$0);
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
