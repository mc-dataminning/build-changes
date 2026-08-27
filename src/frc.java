import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.function.BiFunction;
import java.util.function.Function;

public abstract class frc extends frb {
   private static final int aW = 1048576;
   public static final int aR = 4194304;
   public static final int aS = 786432;
   public static final int aT = 1536;
   private static final frc aX = a("solid", enu.j, eob.b.h, 4194304, true, false, frc.b.a().a(ar).a(p).a(al).a(true));
   private static final frc aY = a("cutout_mipped", enu.j, eob.b.h, 4194304, true, false, frc.b.a().a(ar).a(q).a(al).a(true));
   private static final frc aZ = a("cutout", enu.j, eob.b.h, 786432, true, false, frc.b.a().a(ar).a(r).a(am).a(true));
   private static final frc ba = a("translucent", enu.j, eob.b.h, 786432, true, true, a(s));
   private static final frc bb = a("translucent_moving_block", enu.j, eob.b.h, 786432, false, true, O());
   private static final Function<agi, frc> bc = ac.b($$0 -> a("armor_cutout_no_cull", $$0, false));
   private static final Function<agi, frc> bd = ac.b($$0 -> {
      frc.b $$1 = frc.b.a().a(v).a(new frb.n($$0, false, false)).a(c).a(ar).a(at).a(true);
      return a("entity_solid", enu.k, eob.b.h, 1536, true, false, $$1);
   });
   private static final Function<agi, frc> be = ac.b($$0 -> {
      frc.b $$1 = frc.b.a().a(w).a(new frb.n($$0, false, false)).a(c).a(ar).a(at).a(true);
      return a("entity_cutout", enu.k, eob.b.h, 1536, true, false, $$1);
   });
   private static final BiFunction<agi, Boolean, frc> bf = ac.a(($$0, $$1) -> {
      frc.b $$2 = frc.b.a().a(x).a(new frb.n($$0, false, false)).a(c).a(aw).a(ar).a(at).a($$1);
      return a("entity_cutout_no_cull", enu.k, eob.b.h, 1536, true, false, $$2);
   });
   private static final BiFunction<agi, Boolean, frc> bg = ac.a(($$0, $$1) -> {
      frc.b $$2 = frc.b.a().a(y).a(new frb.n($$0, false, false)).a(c).a(aw).a(ar).a(at).a(aG).a($$1);
      return a("entity_cutout_no_cull_z_offset", enu.k, eob.b.h, 1536, true, false, $$2);
   });
   private static final Function<agi, frc> bh = ac.b($$0 -> {
      frc.b $$1 = frc.b.a().a(z).a(new frb.n($$0, false, false)).a(h).a(aN).a(ar).a(at).a(frb.aB).a(true);
      return a("item_entity_translucent_cull", enu.k, eob.b.h, 1536, true, true, $$1);
   });
   private static final Function<agi, frc> bi = ac.b($$0 -> {
      frc.b $$1 = frc.b.a().a(A).a(new frb.n($$0, false, false)).a(h).a(ar).a(at).a(true);
      return a("entity_translucent_cull", enu.k, eob.b.h, 1536, true, true, $$1);
   });
   private static final BiFunction<agi, Boolean, frc> bj = ac.a(($$0, $$1) -> {
      frc.b $$2 = frc.b.a().a(B).a(new frb.n($$0, false, false)).a(h).a(aw).a(ar).a(at).a($$1);
      return a("entity_translucent", enu.k, eob.b.h, 1536, true, true, $$2);
   });
   private static final BiFunction<agi, Boolean, frc> bk = ac.a(($$0, $$1) -> {
      frc.b $$2 = frc.b.a().a(C).a(new frb.n($$0, false, false)).a(h).a(aw).a(aC).a(at).a($$1);
      return a("entity_translucent_emissive", enu.k, eob.b.h, 1536, true, true, $$2);
   });
   private static final Function<agi, frc> bl = ac.b($$0 -> {
      frc.b $$1 = frc.b.a().a(D).a(new frb.n($$0, false, false)).a(aw).a(ar).a(true);
      return a("entity_smooth_cutout", enu.k, eob.b.h, 1536, $$1);
   });
   private static final BiFunction<agi, Boolean, frc> bm = ac.a(($$0, $$1) -> {
      frc.b $$2 = frc.b.a().a(E).a(new frb.n($$0, false, false)).a($$1 ? h : c).a($$1 ? aC : aB).a(false);
      return a("beacon_beam", enu.j, eob.b.h, 1536, false, true, $$2);
   });
   private static final Function<agi, frc> bn = ac.b($$0 -> {
      frc.b $$1 = frc.b.a().a(F).a(new frb.n($$0, false, false)).a(ay).a(aw).a(ar).a(at).a(false);
      return a("entity_decal", enu.k, eob.b.h, 1536, $$1);
   });
   private static final Function<agi, frc> bo = ac.b($$0 -> {
      frc.b $$1 = frc.b.a().a(G).a(new frb.n($$0, false, false)).a(h).a(aw).a(ar).a(at).a(aC).a(false);
      return a("entity_no_outline", enu.k, eob.b.h, 1536, false, true, $$1);
   });
   private static final Function<agi, frc> bp = ac.b($$0 -> {
      frc.b $$1 = frc.b.a().a(H).a(new frb.n($$0, false, false)).a(h).a(av).a(ar).a(at).a(aC).a(az).a(aG).a(false);
      return a("entity_shadow", enu.k, eob.b.h, 1536, false, false, $$1);
   });
   private static final Function<agi, frc> bq = ac.b($$0 -> {
      frc.b $$1 = frc.b.a().a(I).a(new frb.n($$0, false, false)).a(aw).a(true);
      return a("entity_alpha", enu.k, eob.b.h, 1536, $$1);
   });
   private static final Function<agi, frc> br = ac.b($$0 -> {
      frb.n $$1 = new frb.n($$0, false, false);
      return a("eyes", enu.k, eob.b.h, 1536, false, true, frc.b.a().a(J).a($$1).a(d).a(aC).a(false));
   });
   private static final frc bs = a("leash", enu.p, eob.b.f, 1536, frc.b.a().a(L).a(an).a(aw).a(ar).a(false));
   private static final frc bt = a("water_mask", enu.m, eob.b.h, 1536, frc.b.a().a(M).a(an).a(aD).a(false));
   private static final frc bu = a(
      "armor_glint", enu.q, eob.b.h, 1536, frc.b.a().a(O).a(new frb.n(fwv.a, true, false)).a(aC).a(aw).a(ay).a(f).a(ap).a(aG).a(false)
   );
   private static final frc bv = a(
      "armor_entity_glint", enu.q, eob.b.h, 1536, frc.b.a().a(P).a(new frb.n(fwv.a, true, false)).a(aC).a(aw).a(ay).a(f).a(aq).a(aG).a(false)
   );
   private static final frc bw = a(
      "glint_translucent", enu.q, eob.b.h, 1536, frc.b.a().a(Q).a(new frb.n(fwv.b, true, false)).a(aC).a(aw).a(ay).a(f).a(ap).a(aN).a(false)
   );
   private static final frc bx = a("glint", enu.q, eob.b.h, 1536, frc.b.a().a(R).a(new frb.n(fwv.b, true, false)).a(aC).a(aw).a(ay).a(f).a(ap).a(false));
   private static final frc by = a("glint_direct", enu.q, eob.b.h, 1536, frc.b.a().a(S).a(new frb.n(fwv.b, true, false)).a(aC).a(aw).a(ay).a(f).a(ap).a(false));
   private static final frc bz = a(
      "entity_glint", enu.q, eob.b.h, 1536, frc.b.a().a(T).a(new frb.n(fwv.a, true, false)).a(aC).a(aw).a(ay).a(f).a(aN).a(aq).a(false)
   );
   private static final frc bA = a(
      "entity_glint_direct", enu.q, eob.b.h, 1536, frc.b.a().a(U).a(new frb.n(fwv.a, true, false)).a(aC).a(aw).a(ay).a(f).a(aq).a(false)
   );
   private static final Function<agi, frc> bB = ac.b($$0 -> {
      frb.n $$1 = new frb.n($$0, false, false);
      return a("crumbling", enu.j, eob.b.h, 1536, false, true, frc.b.a().a(V).a($$1).a(g).a(aC).a(aF).a(false));
   });
   private static final Function<agi, frc> bC = ac.b(
      $$0 -> a("text", enu.t, eob.b.h, 786432, false, true, frc.b.a().a(W).a(new frb.n($$0, false, false)).a(h).a(ar).a(false))
   );
   private static final frc bD = a("text_background", enu.p, eob.b.h, 1536, false, true, frc.b.a().a(X).a(an).a(h).a(ar).a(false));
   private static final Function<agi, frc> bE = ac.b(
      $$0 -> a("text_intensity", enu.t, eob.b.h, 786432, false, true, frc.b.a().a(Y).a(new frb.n($$0, false, false)).a(h).a(ar).a(false))
   );
   private static final Function<agi, frc> bF = ac.b(
      $$0 -> a("text_polygon_offset", enu.t, eob.b.h, 1536, false, true, frc.b.a().a(W).a(new frb.n($$0, false, false)).a(h).a(ar).a(aF).a(false))
   );
   private static final Function<agi, frc> bG = ac.b(
      $$0 -> a("text_intensity_polygon_offset", enu.t, eob.b.h, 1536, false, true, frc.b.a().a(Y).a(new frb.n($$0, false, false)).a(h).a(ar).a(aF).a(false))
   );
   private static final Function<agi, frc> bH = ac.b(
      $$0 -> a("text_see_through", enu.t, eob.b.h, 1536, false, true, frc.b.a().a(Z).a(new frb.n($$0, false, false)).a(h).a(ar).a(ax).a(aC).a(false))
   );
   private static final frc bI = a("text_background_see_through", enu.p, eob.b.h, 1536, false, true, frc.b.a().a(aa).a(an).a(h).a(ar).a(ax).a(aC).a(false));
   private static final Function<agi, frc> bJ = ac.b(
      $$0 -> a("text_intensity_see_through", enu.t, eob.b.h, 1536, false, true, frc.b.a().a(ab).a(new frb.n($$0, false, false)).a(h).a(ar).a(ax).a(aC).a(false))
   );
   private static final frc bK = a("lightning", enu.n, eob.b.h, 1536, false, true, frc.b.a().a(ac).a(aB).a(e).a(aL).a(false));
   private static final frc bL = a("tripwire", enu.j, eob.b.h, 1536, true, true, P());
   private static final frc bM = a(
      "end_portal", enu.m, eob.b.h, 1536, false, false, frc.b.a().a(ae).a(frb.i.d().a(ftn.a, false, false).a(ftn.b, false, false).a()).a(false)
   );
   private static final frc bN = a(
      "end_gateway", enu.m, eob.b.h, 1536, false, false, frc.b.a().a(af).a(frb.i.d().a(ftn.a, false, false).a(ftn.b, false, false).a()).a(false)
   );
   public static final frc.a aU = a("lines", enu.o, eob.b.a, 1536, frc.b.a().a(ag).a(new frb.h(OptionalDouble.empty())).a(aG).a(h).a(aN).a(aB).a(aw).a(false));
   public static final frc.a aV = a(
      "line_strip", enu.o, eob.b.b, 1536, frc.b.a().a(ag).a(new frb.h(OptionalDouble.empty())).a(aG).a(h).a(aN).a(aB).a(aw).a(false)
   );
   private static final Function<Double, frc.a> bO = ac.b(
      $$0 -> a("debug_line_strip", enu.n, eob.b.d, 1536, frc.b.a().a(o).a(new frb.h(OptionalDouble.of($$0))).a(c).a(aw).a(false))
   );
   private static final frc.a bP = a("debug_filled_box", enu.n, eob.b.f, 1536, false, true, frc.b.a().a(o).a(aG).a(h).a(false));
   private static final frc.a bQ = a("debug_quads", enu.n, eob.b.h, 1536, false, true, frc.b.a().a(o).a(h).a(aw).a(false));
   private static final frc.a bR = a("debug_section_quads", enu.n, eob.b.h, 1536, false, true, frc.b.a().a(o).a(aG).a(h).a(av).a(false));
   private static final frc.a bS = a("gui", enu.n, eob.b.h, 786432, frc.b.a().a(ah).a(h).a(az).a(false));
   private static final frc.a bT = a("gui_overlay", enu.n, eob.b.h, 1536, frc.b.a().a(ai).a(h).a(ax).a(aC).a(false));
   private static final frc.a bU = a("gui_text_highlight", enu.n, eob.b.h, 1536, frc.b.a().a(aj).a(h).a(ax).a(aQ).a(false));
   private static final frc.a bV = a("gui_ghost_recipe_overlay", enu.n, eob.b.h, 1536, frc.b.a().a(ak).a(h).a(aA).a(aC).a(false));
   private static final ImmutableList<frc> bW = ImmutableList.of(c(), d(), e(), f(), t());
   private final eob bX;
   private final eob.b bY;
   private final int bZ;
   private final boolean ca;
   private final boolean cb;
   private final Optional<frc> cc;

   public static frc c() {
      return aX;
   }

   public static frc d() {
      return aY;
   }

   public static frc e() {
      return aZ;
   }

   private static frc.b a(frb.m $$0) {
      return frc.b.a().a(ar).a($$0).a(al).a(h).a(aJ).a(true);
   }

   public static frc f() {
      return ba;
   }

   private static frc.b O() {
      return frc.b.a().a(ar).a(t).a(al).a(h).a(aN).a(true);
   }

   public static frc g() {
      return bb;
   }

   private static frc.a a(String $$0, agi $$1, boolean $$2) {
      frc.b $$3 = frc.b.a().a(u).a(new frb.n($$1, false, false)).a(c).a(aw).a(ar).a(at).a(aG).a($$2 ? ay : az).a(true);
      return a($$0, enu.k, eob.b.h, 1536, true, false, $$3);
   }

   public static frc a(agi $$0) {
      return bc.apply($$0);
   }

   public static frc b(agi $$0) {
      return a("armor_decal_cutout_no_cull", $$0, true);
   }

   public static frc c(agi $$0) {
      return bd.apply($$0);
   }

   public static frc d(agi $$0) {
      return be.apply($$0);
   }

   public static frc a(agi $$0, boolean $$1) {
      return bf.apply($$0, $$1);
   }

   public static frc e(agi $$0) {
      return a($$0, true);
   }

   public static frc b(agi $$0, boolean $$1) {
      return bg.apply($$0, $$1);
   }

   public static frc f(agi $$0) {
      return b($$0, true);
   }

   public static frc g(agi $$0) {
      return bh.apply($$0);
   }

   public static frc h(agi $$0) {
      return bi.apply($$0);
   }

   public static frc c(agi $$0, boolean $$1) {
      return bj.apply($$0, $$1);
   }

   public static frc i(agi $$0) {
      return c($$0, true);
   }

   public static frc d(agi $$0, boolean $$1) {
      return bk.apply($$0, $$1);
   }

   public static frc j(agi $$0) {
      return d($$0, true);
   }

   public static frc k(agi $$0) {
      return bl.apply($$0);
   }

   public static frc e(agi $$0, boolean $$1) {
      return bm.apply($$0, $$1);
   }

   public static frc l(agi $$0) {
      return bn.apply($$0);
   }

   public static frc m(agi $$0) {
      return bo.apply($$0);
   }

   public static frc n(agi $$0) {
      return bp.apply($$0);
   }

   public static frc o(agi $$0) {
      return bq.apply($$0);
   }

   public static frc p(agi $$0) {
      return br.apply($$0);
   }

   public static frc a(agi $$0, float $$1, float $$2) {
      return a(
         "energy_swirl",
         enu.k,
         eob.b.h,
         1536,
         false,
         true,
         frc.b.a().a(K).a(new frb.n($$0, false, false)).a(new frb.j($$1, $$2)).a(d).a(aw).a(ar).a(at).a(false)
      );
   }

   public static frc h() {
      return bs;
   }

   public static frc i() {
      return bt;
   }

   public static frc q(agi $$0) {
      return frc.a.aW.apply($$0, aw);
   }

   public static frc j() {
      return bu;
   }

   public static frc k() {
      return bv;
   }

   public static frc l() {
      return bw;
   }

   public static frc m() {
      return bx;
   }

   public static frc n() {
      return by;
   }

   public static frc o() {
      return bz;
   }

   public static frc p() {
      return bA;
   }

   public static frc r(agi $$0) {
      return bB.apply($$0);
   }

   public static frc s(agi $$0) {
      return bC.apply($$0);
   }

   public static frc q() {
      return bD;
   }

   public static frc t(agi $$0) {
      return bE.apply($$0);
   }

   public static frc u(agi $$0) {
      return bF.apply($$0);
   }

   public static frc v(agi $$0) {
      return bG.apply($$0);
   }

   public static frc w(agi $$0) {
      return bH.apply($$0);
   }

   public static frc r() {
      return bI;
   }

   public static frc x(agi $$0) {
      return bJ.apply($$0);
   }

   public static frc s() {
      return bK;
   }

   private static frc.b P() {
      return frc.b.a().a(ar).a(ad).a(al).a(h).a(aL).a(true);
   }

   public static frc t() {
      return bL;
   }

   public static frc u() {
      return bM;
   }

   public static frc v() {
      return bN;
   }

   public static frc w() {
      return aU;
   }

   public static frc x() {
      return aV;
   }

   public static frc a(double $$0) {
      return bO.apply($$0);
   }

   public static frc y() {
      return bP;
   }

   public static frc z() {
      return bQ;
   }

   public static frc A() {
      return bR;
   }

   public static frc B() {
      return bS;
   }

   public static frc C() {
      return bT;
   }

   public static frc D() {
      return bU;
   }

   public static frc E() {
      return bV;
   }

   public frc(String $$0, eob $$1, eob.b $$2, int $$3, boolean $$4, boolean $$5, Runnable $$6, Runnable $$7) {
      super($$0, $$6, $$7);
      this.bX = $$1;
      this.bY = $$2;
      this.bZ = $$3;
      this.ca = $$4;
      this.cb = $$5;
      this.cc = Optional.of(this);
   }

   static frc.a a(String $$0, eob $$1, eob.b $$2, int $$3, frc.b $$4) {
      return a($$0, $$1, $$2, $$3, false, false, $$4);
   }

   private static frc.a a(String $$0, eob $$1, eob.b $$2, int $$3, boolean $$4, boolean $$5, frc.b $$6) {
      return new frc.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   public void a(enr $$0, eoe $$1) {
      if ($$0.k()) {
         if (this.cb) {
            $$0.a($$1);
         }

         enr.b $$2 = $$0.d();
         this.a();
         ens.a($$2);
         this.b();
      }
   }

   @Override
   public String toString() {
      return this.b;
   }

   public static List<frc> F() {
      return bW;
   }

   public int G() {
      return this.bZ;
   }

   public eob H() {
      return this.bX;
   }

   public eob.b I() {
      return this.bY;
   }

   public Optional<frc> J() {
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

   public Optional<frc> N() {
      return this.cc;
   }

   static final class a extends frc {
      static final BiFunction<agi, frb.c, frc> aW = ac.a(
         ($$0, $$1) -> frc.a("outline", enu.r, eob.b.h, 1536, frc.b.a().a(N).a(new frb.n($$0, false, false)).a($$1).a(ax).a(aI).a(frc.c.b))
      );
      private final frc.b aX;
      private final Optional<frc> aY;
      private final boolean aZ;

      a(String $$0, eob $$1, eob.b $$2, int $$3, boolean $$4, boolean $$5, frc.b $$6) {
         super($$0, $$1, $$2, $$3, $$4, $$5, () -> $$6.o.forEach(frb::a), () -> $$6.o.forEach(frb::b));
         this.aX = $$6;
         this.aY = $$6.n == frc.c.c ? $$6.a.c().map($$1x -> aW.apply($$1x, $$6.e)) : Optional.empty();
         this.aZ = $$6.n == frc.c.b;
      }

      @Override
      public Optional<frc> J() {
         return this.aY;
      }

      @Override
      public boolean K() {
         return this.aZ;
      }

      protected final frc.b O() {
         return this.aX;
      }

      @Override
      public String toString() {
         return "RenderType[" + this.b + ":" + this.aX + "]";
      }
   }

   protected static final class b {
      final frb.e a;
      private final frb.m b;
      private final frb.p c;
      private final frb.d d;
      final frb.c e;
      private final frb.g f;
      private final frb.l g;
      private final frb.f h;
      private final frb.k i;
      private final frb.o j;
      private final frb.q k;
      private final frb.h l;
      private final frb.b m;
      final frc.c n;
      final ImmutableList<frb> o;

      b(
         frb.e $$0,
         frb.m $$1,
         frb.p $$2,
         frb.d $$3,
         frb.c $$4,
         frb.g $$5,
         frb.l $$6,
         frb.f $$7,
         frb.k $$8,
         frb.o $$9,
         frb.q $$10,
         frb.h $$11,
         frb.b $$12,
         frc.c $$13
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
         this.o = ImmutableList.of(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.m, new frb[]{this.l});
      }

      @Override
      public String toString() {
         return "CompositeState[" + this.o + ", outlineProperty=" + this.n + "]";
      }

      public static frc.b.a a() {
         return new frc.b.a();
      }

      public static class a {
         private frb.e a = frb.an;
         private frb.m b = frb.i;
         private frb.p c;
         private frb.d d;
         private frb.c e;
         private frb.g f;
         private frb.l g;
         private frb.f h;
         private frb.k i;
         private frb.o j;
         private frb.q k;
         private frb.h l;
         private frb.b m;

         a() {
            this.c = frb.c;
            this.d = frb.az;
            this.e = frb.av;
            this.f = frb.as;
            this.g = frb.au;
            this.h = frb.aE;
            this.i = frb.aH;
            this.j = frb.ao;
            this.k = frb.aB;
            this.l = frb.aO;
            this.m = frb.aP;
         }

         public frc.b.a a(frb.e $$0) {
            this.a = $$0;
            return this;
         }

         public frc.b.a a(frb.m $$0) {
            this.b = $$0;
            return this;
         }

         public frc.b.a a(frb.p $$0) {
            this.c = $$0;
            return this;
         }

         public frc.b.a a(frb.d $$0) {
            this.d = $$0;
            return this;
         }

         public frc.b.a a(frb.c $$0) {
            this.e = $$0;
            return this;
         }

         public frc.b.a a(frb.g $$0) {
            this.f = $$0;
            return this;
         }

         public frc.b.a a(frb.l $$0) {
            this.g = $$0;
            return this;
         }

         public frc.b.a a(frb.f $$0) {
            this.h = $$0;
            return this;
         }

         public frc.b.a a(frb.k $$0) {
            this.i = $$0;
            return this;
         }

         public frc.b.a a(frb.o $$0) {
            this.j = $$0;
            return this;
         }

         public frc.b.a a(frb.q $$0) {
            this.k = $$0;
            return this;
         }

         public frc.b.a a(frb.h $$0) {
            this.l = $$0;
            return this;
         }

         public frc.b.a a(frb.b $$0) {
            this.m = $$0;
            return this;
         }

         public frc.b a(boolean $$0) {
            return this.a($$0 ? frc.c.c : frc.c.a);
         }

         public frc.b a(frc.c $$0) {
            return new frc.b(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, $$0);
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
