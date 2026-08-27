import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.function.BiFunction;
import java.util.function.Function;

public abstract class fsq extends fsp {
   private static final int aX = 1048576;
   public static final int aS = 4194304;
   public static final int aT = 786432;
   public static final int aU = 1536;
   private static final fsq aY = a("solid", epb.j, epi.b.h, 4194304, true, false, fsq.b.a().a(as).a(p).a(am).a(true));
   private static final fsq aZ = a("cutout_mipped", epb.j, epi.b.h, 4194304, true, false, fsq.b.a().a(as).a(q).a(am).a(true));
   private static final fsq ba = a("cutout", epb.j, epi.b.h, 786432, true, false, fsq.b.a().a(as).a(r).a(an).a(true));
   private static final fsq bb = a("translucent", epb.j, epi.b.h, 786432, true, true, a(s));
   private static final fsq bc = a("translucent_moving_block", epb.j, epi.b.h, 786432, false, true, O());
   private static final Function<agt, fsq> bd = ac.b($$0 -> a("armor_cutout_no_cull", $$0, false));
   private static final Function<agt, fsq> be = ac.b($$0 -> {
      fsq.b $$1 = fsq.b.a().a(v).a(new fsp.n($$0, false, false)).a(c).a(as).a(au).a(true);
      return a("entity_solid", epb.k, epi.b.h, 1536, true, false, $$1);
   });
   private static final Function<agt, fsq> bf = ac.b($$0 -> {
      fsq.b $$1 = fsq.b.a().a(w).a(new fsp.n($$0, false, false)).a(c).a(as).a(au).a(true);
      return a("entity_cutout", epb.k, epi.b.h, 1536, true, false, $$1);
   });
   private static final BiFunction<agt, Boolean, fsq> bg = ac.a(($$0, $$1) -> {
      fsq.b $$2 = fsq.b.a().a(x).a(new fsp.n($$0, false, false)).a(c).a(ax).a(as).a(au).a($$1);
      return a("entity_cutout_no_cull", epb.k, epi.b.h, 1536, true, false, $$2);
   });
   private static final BiFunction<agt, Boolean, fsq> bh = ac.a(($$0, $$1) -> {
      fsq.b $$2 = fsq.b.a().a(y).a(new fsp.n($$0, false, false)).a(c).a(ax).a(as).a(au).a(aH).a($$1);
      return a("entity_cutout_no_cull_z_offset", epb.k, epi.b.h, 1536, true, false, $$2);
   });
   private static final Function<agt, fsq> bi = ac.b($$0 -> {
      fsq.b $$1 = fsq.b.a().a(z).a(new fsp.n($$0, false, false)).a(h).a(aO).a(as).a(au).a(fsp.aC).a(true);
      return a("item_entity_translucent_cull", epb.k, epi.b.h, 1536, true, true, $$1);
   });
   private static final Function<agt, fsq> bj = ac.b($$0 -> {
      fsq.b $$1 = fsq.b.a().a(A).a(new fsp.n($$0, false, false)).a(h).a(as).a(au).a(true);
      return a("entity_translucent_cull", epb.k, epi.b.h, 1536, true, true, $$1);
   });
   private static final BiFunction<agt, Boolean, fsq> bk = ac.a(($$0, $$1) -> {
      fsq.b $$2 = fsq.b.a().a(B).a(new fsp.n($$0, false, false)).a(h).a(ax).a(as).a(au).a($$1);
      return a("entity_translucent", epb.k, epi.b.h, 1536, true, true, $$2);
   });
   private static final BiFunction<agt, Boolean, fsq> bl = ac.a(($$0, $$1) -> {
      fsq.b $$2 = fsq.b.a().a(C).a(new fsp.n($$0, false, false)).a(h).a(ax).a(aD).a(au).a($$1);
      return a("entity_translucent_emissive", epb.k, epi.b.h, 1536, true, true, $$2);
   });
   private static final Function<agt, fsq> bm = ac.b($$0 -> {
      fsq.b $$1 = fsq.b.a().a(D).a(new fsp.n($$0, false, false)).a(ax).a(as).a(true);
      return a("entity_smooth_cutout", epb.k, epi.b.h, 1536, $$1);
   });
   private static final BiFunction<agt, Boolean, fsq> bn = ac.a(($$0, $$1) -> {
      fsq.b $$2 = fsq.b.a().a(E).a(new fsp.n($$0, false, false)).a($$1 ? h : c).a($$1 ? aD : aC).a(false);
      return a("beacon_beam", epb.j, epi.b.h, 1536, false, true, $$2);
   });
   private static final Function<agt, fsq> bo = ac.b($$0 -> {
      fsq.b $$1 = fsq.b.a().a(F).a(new fsp.n($$0, false, false)).a(az).a(ax).a(as).a(au).a(false);
      return a("entity_decal", epb.k, epi.b.h, 1536, $$1);
   });
   private static final Function<agt, fsq> bp = ac.b($$0 -> {
      fsq.b $$1 = fsq.b.a().a(G).a(new fsp.n($$0, false, false)).a(h).a(ax).a(as).a(au).a(aD).a(false);
      return a("entity_no_outline", epb.k, epi.b.h, 1536, false, true, $$1);
   });
   private static final Function<agt, fsq> bq = ac.b($$0 -> {
      fsq.b $$1 = fsq.b.a().a(H).a(new fsp.n($$0, false, false)).a(h).a(aw).a(as).a(au).a(aD).a(aA).a(aH).a(false);
      return a("entity_shadow", epb.k, epi.b.h, 1536, false, false, $$1);
   });
   private static final Function<agt, fsq> br = ac.b($$0 -> {
      fsq.b $$1 = fsq.b.a().a(I).a(new fsp.n($$0, false, false)).a(ax).a(true);
      return a("entity_alpha", epb.k, epi.b.h, 1536, $$1);
   });
   private static final BiFunction<agt, fsp.p, fsq> bs = ac.a(($$0, $$1) -> {
      fsp.n $$2 = new fsp.n($$0, false, false);
      return a("eyes", epb.k, epi.b.h, 1536, false, true, fsq.b.a().a(J).a($$2).a($$1).a(aD).a(false));
   });
   private static final fsq bt = a("leash", epb.p, epi.b.f, 1536, fsq.b.a().a(L).a(ao).a(ax).a(as).a(false));
   private static final fsq bu = a("water_mask", epb.m, epi.b.h, 1536, fsq.b.a().a(M).a(ao).a(aE).a(false));
   private static final fsq bv = a(
      "armor_glint", epb.q, epi.b.h, 1536, fsq.b.a().a(O).a(new fsp.n(fym.a, true, false)).a(aD).a(ax).a(az).a(f).a(aq).a(aH).a(false)
   );
   private static final fsq bw = a(
      "armor_entity_glint", epb.q, epi.b.h, 1536, fsq.b.a().a(P).a(new fsp.n(fym.a, true, false)).a(aD).a(ax).a(az).a(f).a(ar).a(aH).a(false)
   );
   private static final fsq bx = a(
      "glint_translucent", epb.q, epi.b.h, 1536, fsq.b.a().a(Q).a(new fsp.n(fym.b, true, false)).a(aD).a(ax).a(az).a(f).a(aq).a(aO).a(false)
   );
   private static final fsq by = a("glint", epb.q, epi.b.h, 1536, fsq.b.a().a(R).a(new fsp.n(fym.b, true, false)).a(aD).a(ax).a(az).a(f).a(aq).a(false));
   private static final fsq bz = a("glint_direct", epb.q, epi.b.h, 1536, fsq.b.a().a(S).a(new fsp.n(fym.b, true, false)).a(aD).a(ax).a(az).a(f).a(aq).a(false));
   private static final fsq bA = a(
      "entity_glint", epb.q, epi.b.h, 1536, fsq.b.a().a(T).a(new fsp.n(fym.a, true, false)).a(aD).a(ax).a(az).a(f).a(aO).a(ar).a(false)
   );
   private static final fsq bB = a(
      "entity_glint_direct", epb.q, epi.b.h, 1536, fsq.b.a().a(U).a(new fsp.n(fym.a, true, false)).a(aD).a(ax).a(az).a(f).a(ar).a(false)
   );
   private static final Function<agt, fsq> bC = ac.b($$0 -> {
      fsp.n $$1 = new fsp.n($$0, false, false);
      return a("crumbling", epb.j, epi.b.h, 1536, false, true, fsq.b.a().a(V).a($$1).a(g).a(aD).a(aG).a(false));
   });
   private static final Function<agt, fsq> bD = ac.b(
      $$0 -> a("text", epb.t, epi.b.h, 786432, false, true, fsq.b.a().a(W).a(new fsp.n($$0, false, false)).a(h).a(as).a(false))
   );
   private static final fsq bE = a("text_background", epb.p, epi.b.h, 1536, false, true, fsq.b.a().a(X).a(ao).a(h).a(as).a(false));
   private static final Function<agt, fsq> bF = ac.b(
      $$0 -> a("text_intensity", epb.t, epi.b.h, 786432, false, true, fsq.b.a().a(Y).a(new fsp.n($$0, false, false)).a(h).a(as).a(false))
   );
   private static final Function<agt, fsq> bG = ac.b(
      $$0 -> a("text_polygon_offset", epb.t, epi.b.h, 1536, false, true, fsq.b.a().a(W).a(new fsp.n($$0, false, false)).a(h).a(as).a(aG).a(false))
   );
   private static final Function<agt, fsq> bH = ac.b(
      $$0 -> a("text_intensity_polygon_offset", epb.t, epi.b.h, 1536, false, true, fsq.b.a().a(Y).a(new fsp.n($$0, false, false)).a(h).a(as).a(aG).a(false))
   );
   private static final Function<agt, fsq> bI = ac.b(
      $$0 -> a("text_see_through", epb.t, epi.b.h, 1536, false, true, fsq.b.a().a(Z).a(new fsp.n($$0, false, false)).a(h).a(as).a(ay).a(aD).a(false))
   );
   private static final fsq bJ = a("text_background_see_through", epb.p, epi.b.h, 1536, false, true, fsq.b.a().a(aa).a(ao).a(h).a(as).a(ay).a(aD).a(false));
   private static final Function<agt, fsq> bK = ac.b(
      $$0 -> a("text_intensity_see_through", epb.t, epi.b.h, 1536, false, true, fsq.b.a().a(ab).a(new fsp.n($$0, false, false)).a(h).a(as).a(ay).a(aD).a(false))
   );
   private static final fsq bL = a("lightning", epb.n, epi.b.h, 1536, false, true, fsq.b.a().a(ac).a(aC).a(e).a(aM).a(false));
   private static final fsq bM = a("tripwire", epb.j, epi.b.h, 1536, true, true, P());
   private static final fsq bN = a(
      "end_portal", epb.m, epi.b.h, 1536, false, false, fsq.b.a().a(ae).a(fsp.i.d().a(fvb.a, false, false).a(fvb.b, false, false).a()).a(false)
   );
   private static final fsq bO = a(
      "end_gateway", epb.m, epi.b.h, 1536, false, false, fsq.b.a().a(af).a(fsp.i.d().a(fvb.a, false, false).a(fvb.b, false, false).a()).a(false)
   );
   public static final fsq.a aV = a("lines", epb.o, epi.b.a, 1536, fsq.b.a().a(ag).a(new fsp.h(OptionalDouble.empty())).a(aH).a(h).a(aO).a(aC).a(ax).a(false));
   public static final fsq.a aW = a(
      "line_strip", epb.o, epi.b.b, 1536, fsq.b.a().a(ag).a(new fsp.h(OptionalDouble.empty())).a(aH).a(h).a(aO).a(aC).a(ax).a(false)
   );
   private static final Function<Double, fsq.a> bP = ac.b(
      $$0 -> a("debug_line_strip", epb.n, epi.b.d, 1536, fsq.b.a().a(o).a(new fsp.h(OptionalDouble.of($$0))).a(c).a(ax).a(false))
   );
   private static final fsq.a bQ = a("debug_filled_box", epb.n, epi.b.f, 1536, false, true, fsq.b.a().a(o).a(aH).a(h).a(false));
   private static final fsq.a bR = a("debug_quads", epb.n, epi.b.h, 1536, false, true, fsq.b.a().a(o).a(h).a(ax).a(false));
   private static final fsq.a bS = a("debug_section_quads", epb.n, epi.b.h, 1536, false, true, fsq.b.a().a(o).a(aH).a(h).a(aw).a(false));
   private static final fsq.a bT = a("gui", epb.n, epi.b.h, 786432, fsq.b.a().a(ah).a(h).a(aA).a(false));
   private static final fsq.a bU = a("gui_overlay", epb.n, epi.b.h, 1536, fsq.b.a().a(ai).a(h).a(ay).a(aD).a(false));
   private static final fsq.a bV = a("gui_text_highlight", epb.n, epi.b.h, 1536, fsq.b.a().a(aj).a(h).a(ay).a(aR).a(false));
   private static final fsq.a bW = a("gui_ghost_recipe_overlay", epb.n, epi.b.h, 1536, fsq.b.a().a(ak).a(h).a(aB).a(aD).a(false));
   private static final ImmutableList<fsq> bX = ImmutableList.of(c(), d(), e(), f(), t());
   private final epi bY;
   private final epi.b bZ;
   private final int ca;
   private final boolean cb;
   private final boolean cc;
   private final Optional<fsq> cd;

   public static fsq c() {
      return aY;
   }

   public static fsq d() {
      return aZ;
   }

   public static fsq e() {
      return ba;
   }

   private static fsq.b a(fsp.m $$0) {
      return fsq.b.a().a(as).a($$0).a(am).a(h).a(aK).a(true);
   }

   public static fsq f() {
      return bb;
   }

   private static fsq.b O() {
      return fsq.b.a().a(as).a(t).a(am).a(h).a(aO).a(true);
   }

   public static fsq g() {
      return bc;
   }

   private static fsq.a a(String $$0, agt $$1, boolean $$2) {
      fsq.b $$3 = fsq.b.a().a(u).a(new fsp.n($$1, false, false)).a(c).a(ax).a(as).a(au).a(aH).a($$2 ? az : aA).a(true);
      return a($$0, epb.k, epi.b.h, 1536, true, false, $$3);
   }

   public static fsq a(agt $$0) {
      return bd.apply($$0);
   }

   public static fsq b(agt $$0) {
      return a("armor_decal_cutout_no_cull", $$0, true);
   }

   public static fsq c(agt $$0) {
      return be.apply($$0);
   }

   public static fsq d(agt $$0) {
      return bf.apply($$0);
   }

   public static fsq a(agt $$0, boolean $$1) {
      return bg.apply($$0, $$1);
   }

   public static fsq e(agt $$0) {
      return a($$0, true);
   }

   public static fsq b(agt $$0, boolean $$1) {
      return bh.apply($$0, $$1);
   }

   public static fsq f(agt $$0) {
      return b($$0, true);
   }

   public static fsq g(agt $$0) {
      return bi.apply($$0);
   }

   public static fsq h(agt $$0) {
      return bj.apply($$0);
   }

   public static fsq c(agt $$0, boolean $$1) {
      return bk.apply($$0, $$1);
   }

   public static fsq i(agt $$0) {
      return c($$0, true);
   }

   public static fsq d(agt $$0, boolean $$1) {
      return bl.apply($$0, $$1);
   }

   public static fsq j(agt $$0) {
      return d($$0, true);
   }

   public static fsq k(agt $$0) {
      return bm.apply($$0);
   }

   public static fsq e(agt $$0, boolean $$1) {
      return bn.apply($$0, $$1);
   }

   public static fsq l(agt $$0) {
      return bo.apply($$0);
   }

   public static fsq m(agt $$0) {
      return bp.apply($$0);
   }

   public static fsq n(agt $$0) {
      return bq.apply($$0);
   }

   public static fsq o(agt $$0) {
      return br.apply($$0);
   }

   public static fsq p(agt $$0) {
      return bs.apply($$0, d);
   }

   public static fsq q(agt $$0) {
      return bl.apply($$0, false);
   }

   public static fsq a(agt $$0, float $$1, float $$2) {
      return a(
         "breeze_wind",
         epb.k,
         epi.b.h,
         1536,
         false,
         true,
         fsq.b.a().a(al).a(new fsp.n($$0, false, false)).a(new fsp.j($$1, $$2)).a(h).a(ax).a(as).a(av).a(false)
      );
   }

   public static fsq b(agt $$0, float $$1, float $$2) {
      return a(
         "energy_swirl",
         epb.k,
         epi.b.h,
         1536,
         false,
         true,
         fsq.b.a().a(K).a(new fsp.n($$0, false, false)).a(new fsp.j($$1, $$2)).a(d).a(ax).a(as).a(au).a(false)
      );
   }

   public static fsq h() {
      return bt;
   }

   public static fsq i() {
      return bu;
   }

   public static fsq r(agt $$0) {
      return fsq.a.aX.apply($$0, ax);
   }

   public static fsq j() {
      return bv;
   }

   public static fsq k() {
      return bw;
   }

   public static fsq l() {
      return bx;
   }

   public static fsq m() {
      return by;
   }

   public static fsq n() {
      return bz;
   }

   public static fsq o() {
      return bA;
   }

   public static fsq p() {
      return bB;
   }

   public static fsq s(agt $$0) {
      return bC.apply($$0);
   }

   public static fsq t(agt $$0) {
      return bD.apply($$0);
   }

   public static fsq q() {
      return bE;
   }

   public static fsq u(agt $$0) {
      return bF.apply($$0);
   }

   public static fsq v(agt $$0) {
      return bG.apply($$0);
   }

   public static fsq w(agt $$0) {
      return bH.apply($$0);
   }

   public static fsq x(agt $$0) {
      return bI.apply($$0);
   }

   public static fsq r() {
      return bJ;
   }

   public static fsq y(agt $$0) {
      return bK.apply($$0);
   }

   public static fsq s() {
      return bL;
   }

   private static fsq.b P() {
      return fsq.b.a().a(as).a(ad).a(am).a(h).a(aM).a(true);
   }

   public static fsq t() {
      return bM;
   }

   public static fsq u() {
      return bN;
   }

   public static fsq v() {
      return bO;
   }

   public static fsq w() {
      return aV;
   }

   public static fsq x() {
      return aW;
   }

   public static fsq a(double $$0) {
      return bP.apply($$0);
   }

   public static fsq y() {
      return bQ;
   }

   public static fsq z() {
      return bR;
   }

   public static fsq A() {
      return bS;
   }

   public static fsq B() {
      return bT;
   }

   public static fsq C() {
      return bU;
   }

   public static fsq D() {
      return bV;
   }

   public static fsq E() {
      return bW;
   }

   public fsq(String $$0, epi $$1, epi.b $$2, int $$3, boolean $$4, boolean $$5, Runnable $$6, Runnable $$7) {
      super($$0, $$6, $$7);
      this.bY = $$1;
      this.bZ = $$2;
      this.ca = $$3;
      this.cb = $$4;
      this.cc = $$5;
      this.cd = Optional.of(this);
   }

   static fsq.a a(String $$0, epi $$1, epi.b $$2, int $$3, fsq.b $$4) {
      return a($$0, $$1, $$2, $$3, false, false, $$4);
   }

   private static fsq.a a(String $$0, epi $$1, epi.b $$2, int $$3, boolean $$4, boolean $$5, fsq.b $$6) {
      return new fsq.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   public void a(eoy $$0, epl $$1) {
      if ($$0.k()) {
         if (this.cc) {
            $$0.a($$1);
         }

         eoy.b $$2 = $$0.d();
         this.a();
         eoz.a($$2);
         this.b();
      }
   }

   @Override
   public String toString() {
      return this.b;
   }

   public static List<fsq> F() {
      return bX;
   }

   public int G() {
      return this.ca;
   }

   public epi H() {
      return this.bY;
   }

   public epi.b I() {
      return this.bZ;
   }

   public Optional<fsq> J() {
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

   public Optional<fsq> N() {
      return this.cd;
   }

   static final class a extends fsq {
      static final BiFunction<agt, fsp.c, fsq> aX = ac.a(
         ($$0, $$1) -> fsq.a("outline", epb.r, epi.b.h, 1536, fsq.b.a().a(N).a(new fsp.n($$0, false, false)).a($$1).a(ay).a(aJ).a(fsq.c.b))
      );
      private final fsq.b aY;
      private final Optional<fsq> aZ;
      private final boolean ba;

      a(String $$0, epi $$1, epi.b $$2, int $$3, boolean $$4, boolean $$5, fsq.b $$6) {
         super($$0, $$1, $$2, $$3, $$4, $$5, () -> $$6.o.forEach(fsp::a), () -> $$6.o.forEach(fsp::b));
         this.aY = $$6;
         this.aZ = $$6.n == fsq.c.c ? $$6.a.c().map($$1x -> aX.apply($$1x, $$6.e)) : Optional.empty();
         this.ba = $$6.n == fsq.c.b;
      }

      @Override
      public Optional<fsq> J() {
         return this.aZ;
      }

      @Override
      public boolean K() {
         return this.ba;
      }

      protected final fsq.b O() {
         return this.aY;
      }

      @Override
      public String toString() {
         return "RenderType[" + this.b + ":" + this.aY + "]";
      }
   }

   protected static final class b {
      final fsp.e a;
      private final fsp.m b;
      private final fsp.p c;
      private final fsp.d d;
      final fsp.c e;
      private final fsp.g f;
      private final fsp.l g;
      private final fsp.f h;
      private final fsp.k i;
      private final fsp.o j;
      private final fsp.q k;
      private final fsp.h l;
      private final fsp.b m;
      final fsq.c n;
      final ImmutableList<fsp> o;

      b(
         fsp.e $$0,
         fsp.m $$1,
         fsp.p $$2,
         fsp.d $$3,
         fsp.c $$4,
         fsp.g $$5,
         fsp.l $$6,
         fsp.f $$7,
         fsp.k $$8,
         fsp.o $$9,
         fsp.q $$10,
         fsp.h $$11,
         fsp.b $$12,
         fsq.c $$13
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
         this.o = ImmutableList.of(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.m, new fsp[]{this.l});
      }

      @Override
      public String toString() {
         return "CompositeState[" + this.o + ", outlineProperty=" + this.n + "]";
      }

      public static fsq.b.a a() {
         return new fsq.b.a();
      }

      public static class a {
         private fsp.e a = fsp.ao;
         private fsp.m b = fsp.i;
         private fsp.p c;
         private fsp.d d;
         private fsp.c e;
         private fsp.g f;
         private fsp.l g;
         private fsp.f h;
         private fsp.k i;
         private fsp.o j;
         private fsp.q k;
         private fsp.h l;
         private fsp.b m;

         a() {
            this.c = fsp.c;
            this.d = fsp.aA;
            this.e = fsp.aw;
            this.f = fsp.at;
            this.g = fsp.av;
            this.h = fsp.aF;
            this.i = fsp.aI;
            this.j = fsp.ap;
            this.k = fsp.aC;
            this.l = fsp.aP;
            this.m = fsp.aQ;
         }

         public fsq.b.a a(fsp.e $$0) {
            this.a = $$0;
            return this;
         }

         public fsq.b.a a(fsp.m $$0) {
            this.b = $$0;
            return this;
         }

         public fsq.b.a a(fsp.p $$0) {
            this.c = $$0;
            return this;
         }

         public fsq.b.a a(fsp.d $$0) {
            this.d = $$0;
            return this;
         }

         public fsq.b.a a(fsp.c $$0) {
            this.e = $$0;
            return this;
         }

         public fsq.b.a a(fsp.g $$0) {
            this.f = $$0;
            return this;
         }

         public fsq.b.a a(fsp.l $$0) {
            this.g = $$0;
            return this;
         }

         public fsq.b.a a(fsp.f $$0) {
            this.h = $$0;
            return this;
         }

         public fsq.b.a a(fsp.k $$0) {
            this.i = $$0;
            return this;
         }

         public fsq.b.a a(fsp.o $$0) {
            this.j = $$0;
            return this;
         }

         public fsq.b.a a(fsp.q $$0) {
            this.k = $$0;
            return this;
         }

         public fsq.b.a a(fsp.h $$0) {
            this.l = $$0;
            return this;
         }

         public fsq.b.a a(fsp.b $$0) {
            this.m = $$0;
            return this;
         }

         public fsq.b a(boolean $$0) {
            return this.a($$0 ? fsq.c.c : fsq.c.a);
         }

         public fsq.b a(fsq.c $$0) {
            return new fsq.b(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, $$0);
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
