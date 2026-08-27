import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.function.BiFunction;
import java.util.function.Function;

public abstract class fom extends fol {
   private static final int aY = 4;
   private static final int aZ = 1048576;
   public static final int aS = 2097152;
   public static final int aT = 262144;
   public static final int aU = 131072;
   public static final int aV = 256;
   private static final fom ba = a("solid", eln.j, elu.b.h, 2097152, true, false, fom.b.a().a(as).a(p).a(am).a(true));
   private static final fom bb = a("cutout_mipped", eln.j, elu.b.h, 131072, true, false, fom.b.a().a(as).a(q).a(am).a(true));
   private static final fom bc = a("cutout", eln.j, elu.b.h, 131072, true, false, fom.b.a().a(as).a(r).a(an).a(true));
   private static final fom bd = a("translucent", eln.j, elu.b.h, 2097152, true, true, a(s));
   private static final fom be = a("translucent_moving_block", eln.j, elu.b.h, 262144, false, true, P());
   private static final fom bf = a("translucent_no_crumbling", eln.j, elu.b.h, 262144, false, true, a(u));
   private static final Function<aex, fom> bg = ac.b($$0 -> a("armor_cutout_no_cull", $$0, false));
   private static final Function<aex, fom> bh = ac.b($$0 -> {
      fom.b $$1 = fom.b.a().a(w).a(new fol.n($$0, false, false)).a(c).a(as).a(au).a(true);
      return a("entity_solid", eln.k, elu.b.h, 256, true, false, $$1);
   });
   private static final Function<aex, fom> bi = ac.b($$0 -> {
      fom.b $$1 = fom.b.a().a(x).a(new fol.n($$0, false, false)).a(c).a(as).a(au).a(true);
      return a("entity_cutout", eln.k, elu.b.h, 256, true, false, $$1);
   });
   private static final BiFunction<aex, Boolean, fom> bj = ac.a(($$0, $$1) -> {
      fom.b $$2 = fom.b.a().a(y).a(new fol.n($$0, false, false)).a(c).a(ax).a(as).a(au).a($$1);
      return a("entity_cutout_no_cull", eln.k, elu.b.h, 256, true, false, $$2);
   });
   private static final BiFunction<aex, Boolean, fom> bk = ac.a(($$0, $$1) -> {
      fom.b $$2 = fom.b.a().a(z).a(new fol.n($$0, false, false)).a(c).a(ax).a(as).a(au).a(aH).a($$1);
      return a("entity_cutout_no_cull_z_offset", eln.k, elu.b.h, 256, true, false, $$2);
   });
   private static final Function<aex, fom> bl = ac.b($$0 -> {
      fom.b $$1 = fom.b.a().a(A).a(new fol.n($$0, false, false)).a(h).a(aO).a(as).a(au).a(fol.aC).a(true);
      return a("item_entity_translucent_cull", eln.k, elu.b.h, 256, true, true, $$1);
   });
   private static final Function<aex, fom> bm = ac.b($$0 -> {
      fom.b $$1 = fom.b.a().a(B).a(new fol.n($$0, false, false)).a(h).a(as).a(au).a(true);
      return a("entity_translucent_cull", eln.k, elu.b.h, 256, true, true, $$1);
   });
   private static final BiFunction<aex, Boolean, fom> bn = ac.a(($$0, $$1) -> {
      fom.b $$2 = fom.b.a().a(C).a(new fol.n($$0, false, false)).a(h).a(ax).a(as).a(au).a($$1);
      return a("entity_translucent", eln.k, elu.b.h, 256, true, true, $$2);
   });
   private static final BiFunction<aex, Boolean, fom> bo = ac.a(($$0, $$1) -> {
      fom.b $$2 = fom.b.a().a(D).a(new fol.n($$0, false, false)).a(h).a(ax).a(aD).a(au).a($$1);
      return a("entity_translucent_emissive", eln.k, elu.b.h, 256, true, true, $$2);
   });
   private static final Function<aex, fom> bp = ac.b($$0 -> {
      fom.b $$1 = fom.b.a().a(E).a(new fol.n($$0, false, false)).a(ax).a(as).a(true);
      return a("entity_smooth_cutout", eln.k, elu.b.h, 256, $$1);
   });
   private static final BiFunction<aex, Boolean, fom> bq = ac.a(($$0, $$1) -> {
      fom.b $$2 = fom.b.a().a(F).a(new fol.n($$0, false, false)).a($$1 ? h : c).a($$1 ? aD : aC).a(false);
      return a("beacon_beam", eln.j, elu.b.h, 256, false, true, $$2);
   });
   private static final Function<aex, fom> br = ac.b($$0 -> {
      fom.b $$1 = fom.b.a().a(G).a(new fol.n($$0, false, false)).a(az).a(ax).a(as).a(au).a(false);
      return a("entity_decal", eln.k, elu.b.h, 256, $$1);
   });
   private static final Function<aex, fom> bs = ac.b($$0 -> {
      fom.b $$1 = fom.b.a().a(H).a(new fol.n($$0, false, false)).a(h).a(ax).a(as).a(au).a(aD).a(false);
      return a("entity_no_outline", eln.k, elu.b.h, 256, false, true, $$1);
   });
   private static final Function<aex, fom> bt = ac.b($$0 -> {
      fom.b $$1 = fom.b.a().a(I).a(new fol.n($$0, false, false)).a(h).a(aw).a(as).a(au).a(aD).a(aA).a(aH).a(false);
      return a("entity_shadow", eln.k, elu.b.h, 256, false, false, $$1);
   });
   private static final Function<aex, fom> bu = ac.b($$0 -> {
      fom.b $$1 = fom.b.a().a(J).a(new fol.n($$0, false, false)).a(ax).a(true);
      return a("entity_alpha", eln.k, elu.b.h, 256, $$1);
   });
   private static final Function<aex, fom> bv = ac.b($$0 -> {
      fol.n $$1 = new fol.n($$0, false, false);
      return a("eyes", eln.k, elu.b.h, 256, false, true, fom.b.a().a(K).a($$1).a(d).a(aD).a(false));
   });
   private static final fom bw = a("leash", eln.p, elu.b.f, 256, fom.b.a().a(M).a(ao).a(ax).a(as).a(false));
   private static final fom bx = a("water_mask", eln.m, elu.b.h, 256, fom.b.a().a(N).a(ao).a(aE).a(false));
   private static final fom by = a(
      "armor_glint", eln.q, elu.b.h, 256, fom.b.a().a(P).a(new fol.n(fuf.a, true, false)).a(aD).a(ax).a(az).a(f).a(aq).a(aH).a(false)
   );
   private static final fom bz = a(
      "armor_entity_glint", eln.q, elu.b.h, 256, fom.b.a().a(Q).a(new fol.n(fuf.a, true, false)).a(aD).a(ax).a(az).a(f).a(ar).a(aH).a(false)
   );
   private static final fom bA = a(
      "glint_translucent", eln.q, elu.b.h, 256, fom.b.a().a(R).a(new fol.n(fuf.b, true, false)).a(aD).a(ax).a(az).a(f).a(aq).a(aO).a(false)
   );
   private static final fom bB = a("glint", eln.q, elu.b.h, 256, fom.b.a().a(S).a(new fol.n(fuf.b, true, false)).a(aD).a(ax).a(az).a(f).a(aq).a(false));
   private static final fom bC = a("glint_direct", eln.q, elu.b.h, 256, fom.b.a().a(T).a(new fol.n(fuf.b, true, false)).a(aD).a(ax).a(az).a(f).a(aq).a(false));
   private static final fom bD = a(
      "entity_glint", eln.q, elu.b.h, 256, fom.b.a().a(U).a(new fol.n(fuf.a, true, false)).a(aD).a(ax).a(az).a(f).a(aO).a(ar).a(false)
   );
   private static final fom bE = a(
      "entity_glint_direct", eln.q, elu.b.h, 256, fom.b.a().a(V).a(new fol.n(fuf.a, true, false)).a(aD).a(ax).a(az).a(f).a(ar).a(false)
   );
   private static final Function<aex, fom> bF = ac.b($$0 -> {
      fol.n $$1 = new fol.n($$0, false, false);
      return a("crumbling", eln.j, elu.b.h, 256, false, true, fom.b.a().a(W).a($$1).a(g).a(aD).a(aG).a(false));
   });
   private static final Function<aex, fom> bG = ac.b(
      $$0 -> a("text", eln.t, elu.b.h, 256, false, true, fom.b.a().a(X).a(new fol.n($$0, false, false)).a(h).a(as).a(false))
   );
   private static final fom bH = a("text_background", eln.p, elu.b.h, 256, false, true, fom.b.a().a(Y).a(ao).a(h).a(as).a(false));
   private static final Function<aex, fom> bI = ac.b(
      $$0 -> a("text_intensity", eln.t, elu.b.h, 256, false, true, fom.b.a().a(Z).a(new fol.n($$0, false, false)).a(h).a(as).a(false))
   );
   private static final Function<aex, fom> bJ = ac.b(
      $$0 -> a("text_polygon_offset", eln.t, elu.b.h, 256, false, true, fom.b.a().a(X).a(new fol.n($$0, false, false)).a(h).a(as).a(aG).a(false))
   );
   private static final Function<aex, fom> bK = ac.b(
      $$0 -> a("text_intensity_polygon_offset", eln.t, elu.b.h, 256, false, true, fom.b.a().a(Z).a(new fol.n($$0, false, false)).a(h).a(as).a(aG).a(false))
   );
   private static final Function<aex, fom> bL = ac.b(
      $$0 -> a("text_see_through", eln.t, elu.b.h, 256, false, true, fom.b.a().a(aa).a(new fol.n($$0, false, false)).a(h).a(as).a(ay).a(aD).a(false))
   );
   private static final fom bM = a("text_background_see_through", eln.p, elu.b.h, 256, false, true, fom.b.a().a(ab).a(ao).a(h).a(as).a(ay).a(aD).a(false));
   private static final Function<aex, fom> bN = ac.b(
      $$0 -> a("text_intensity_see_through", eln.t, elu.b.h, 256, false, true, fom.b.a().a(ac).a(new fol.n($$0, false, false)).a(h).a(as).a(ay).a(aD).a(false))
   );
   private static final fom bO = a("lightning", eln.n, elu.b.h, 256, false, true, fom.b.a().a(ad).a(aC).a(e).a(aM).a(false));
   private static final fom bP = a("tripwire", eln.j, elu.b.h, 262144, true, true, Q());
   private static final fom bQ = a(
      "end_portal", eln.m, elu.b.h, 256, false, false, fom.b.a().a(af).a(fol.i.d().a(fqx.a, false, false).a(fqx.b, false, false).a()).a(false)
   );
   private static final fom bR = a(
      "end_gateway", eln.m, elu.b.h, 256, false, false, fom.b.a().a(ag).a(fol.i.d().a(fqx.a, false, false).a(fqx.b, false, false).a()).a(false)
   );
   public static final fom.a aW = a("lines", eln.o, elu.b.a, 256, fom.b.a().a(ah).a(new fol.h(OptionalDouble.empty())).a(aH).a(h).a(aO).a(aC).a(ax).a(false));
   public static final fom.a aX = a(
      "line_strip", eln.o, elu.b.b, 256, fom.b.a().a(ah).a(new fol.h(OptionalDouble.empty())).a(aH).a(h).a(aO).a(aC).a(ax).a(false)
   );
   private static final Function<Double, fom.a> bS = ac.b(
      $$0 -> a("debug_line_strip", eln.n, elu.b.d, 256, fom.b.a().a(o).a(new fol.h(OptionalDouble.of($$0))).a(c).a(ax).a(false))
   );
   private static final fom.a bT = a("debug_filled_box", eln.n, elu.b.f, 131072, false, true, fom.b.a().a(o).a(aH).a(h).a(false));
   private static final fom.a bU = a("debug_quads", eln.n, elu.b.h, 131072, false, true, fom.b.a().a(o).a(h).a(ax).a(false));
   private static final fom.a bV = a("debug_section_quads", eln.n, elu.b.h, 131072, false, true, fom.b.a().a(o).a(aH).a(h).a(aw).a(false));
   private static final fom.a bW = a("gui", eln.n, elu.b.h, 256, fom.b.a().a(ai).a(h).a(aA).a(false));
   private static final fom.a bX = a("gui_overlay", eln.n, elu.b.h, 256, fom.b.a().a(aj).a(h).a(ay).a(aD).a(false));
   private static final fom.a bY = a("gui_text_highlight", eln.n, elu.b.h, 256, fom.b.a().a(ak).a(h).a(ay).a(aR).a(false));
   private static final fom.a bZ = a("gui_ghost_recipe_overlay", eln.n, elu.b.h, 256, fom.b.a().a(al).a(h).a(aB).a(aD).a(false));
   private static final ImmutableList<fom> ca = ImmutableList.of(c(), d(), e(), f(), u());
   private final elu cb;
   private final elu.b cc;
   private final int cd;
   private final boolean ce;
   private final boolean cf;
   private final Optional<fom> cg;

   public static fom c() {
      return ba;
   }

   public static fom d() {
      return bb;
   }

   public static fom e() {
      return bc;
   }

   private static fom.b a(fol.m $$0) {
      return fom.b.a().a(as).a($$0).a(am).a(h).a(aK).a(true);
   }

   public static fom f() {
      return bd;
   }

   private static fom.b P() {
      return fom.b.a().a(as).a(t).a(am).a(h).a(aO).a(true);
   }

   public static fom g() {
      return be;
   }

   public static fom h() {
      return bf;
   }

   private static fom.a a(String $$0, aex $$1, boolean $$2) {
      fom.b $$3 = fom.b.a().a(v).a(new fol.n($$1, false, false)).a(c).a(ax).a(as).a(au).a(aH).a($$2 ? az : aA).a(true);
      return a($$0, eln.k, elu.b.h, 256, true, false, $$3);
   }

   public static fom a(aex $$0) {
      return bg.apply($$0);
   }

   public static fom b(aex $$0) {
      return a("armor_decal_cutout_no_cull", $$0, true);
   }

   public static fom c(aex $$0) {
      return bh.apply($$0);
   }

   public static fom d(aex $$0) {
      return bi.apply($$0);
   }

   public static fom a(aex $$0, boolean $$1) {
      return bj.apply($$0, $$1);
   }

   public static fom e(aex $$0) {
      return a($$0, true);
   }

   public static fom b(aex $$0, boolean $$1) {
      return bk.apply($$0, $$1);
   }

   public static fom f(aex $$0) {
      return b($$0, true);
   }

   public static fom g(aex $$0) {
      return bl.apply($$0);
   }

   public static fom h(aex $$0) {
      return bm.apply($$0);
   }

   public static fom c(aex $$0, boolean $$1) {
      return bn.apply($$0, $$1);
   }

   public static fom i(aex $$0) {
      return c($$0, true);
   }

   public static fom d(aex $$0, boolean $$1) {
      return bo.apply($$0, $$1);
   }

   public static fom j(aex $$0) {
      return d($$0, true);
   }

   public static fom k(aex $$0) {
      return bp.apply($$0);
   }

   public static fom e(aex $$0, boolean $$1) {
      return bq.apply($$0, $$1);
   }

   public static fom l(aex $$0) {
      return br.apply($$0);
   }

   public static fom m(aex $$0) {
      return bs.apply($$0);
   }

   public static fom n(aex $$0) {
      return bt.apply($$0);
   }

   public static fom o(aex $$0) {
      return bu.apply($$0);
   }

   public static fom p(aex $$0) {
      return bv.apply($$0);
   }

   public static fom a(aex $$0, float $$1, float $$2) {
      return a(
         "energy_swirl",
         eln.k,
         elu.b.h,
         256,
         false,
         true,
         fom.b.a().a(L).a(new fol.n($$0, false, false)).a(new fol.j($$1, $$2)).a(d).a(ax).a(as).a(au).a(false)
      );
   }

   public static fom i() {
      return bw;
   }

   public static fom j() {
      return bx;
   }

   public static fom q(aex $$0) {
      return fom.a.aY.apply($$0, ax);
   }

   public static fom k() {
      return by;
   }

   public static fom l() {
      return bz;
   }

   public static fom m() {
      return bA;
   }

   public static fom n() {
      return bB;
   }

   public static fom o() {
      return bC;
   }

   public static fom p() {
      return bD;
   }

   public static fom q() {
      return bE;
   }

   public static fom r(aex $$0) {
      return bF.apply($$0);
   }

   public static fom s(aex $$0) {
      return bG.apply($$0);
   }

   public static fom r() {
      return bH;
   }

   public static fom t(aex $$0) {
      return bI.apply($$0);
   }

   public static fom u(aex $$0) {
      return bJ.apply($$0);
   }

   public static fom v(aex $$0) {
      return bK.apply($$0);
   }

   public static fom w(aex $$0) {
      return bL.apply($$0);
   }

   public static fom s() {
      return bM;
   }

   public static fom x(aex $$0) {
      return bN.apply($$0);
   }

   public static fom t() {
      return bO;
   }

   private static fom.b Q() {
      return fom.b.a().a(as).a(ae).a(am).a(h).a(aM).a(true);
   }

   public static fom u() {
      return bP;
   }

   public static fom v() {
      return bQ;
   }

   public static fom w() {
      return bR;
   }

   public static fom x() {
      return aW;
   }

   public static fom y() {
      return aX;
   }

   public static fom a(double $$0) {
      return bS.apply($$0);
   }

   public static fom z() {
      return bT;
   }

   public static fom A() {
      return bU;
   }

   public static fom B() {
      return bV;
   }

   public static fom C() {
      return bW;
   }

   public static fom D() {
      return bX;
   }

   public static fom E() {
      return bY;
   }

   public static fom F() {
      return bZ;
   }

   public fom(String $$0, elu $$1, elu.b $$2, int $$3, boolean $$4, boolean $$5, Runnable $$6, Runnable $$7) {
      super($$0, $$6, $$7);
      this.cb = $$1;
      this.cc = $$2;
      this.cd = $$3;
      this.ce = $$4;
      this.cf = $$5;
      this.cg = Optional.of(this);
   }

   static fom.a a(String $$0, elu $$1, elu.b $$2, int $$3, fom.b $$4) {
      return a($$0, $$1, $$2, $$3, false, false, $$4);
   }

   private static fom.a a(String $$0, elu $$1, elu.b $$2, int $$3, boolean $$4, boolean $$5, fom.b $$6) {
      return new fom.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   public void a(elk $$0, elx $$1) {
      if ($$0.j()) {
         if (this.cf) {
            $$0.a($$1);
         }

         elk.b $$2 = $$0.d();
         this.a();
         ell.a($$2);
         this.b();
      }
   }

   @Override
   public String toString() {
      return this.b;
   }

   public static List<fom> G() {
      return ca;
   }

   public int H() {
      return this.cd;
   }

   public elu I() {
      return this.cb;
   }

   public elu.b J() {
      return this.cc;
   }

   public Optional<fom> K() {
      return Optional.empty();
   }

   public boolean L() {
      return false;
   }

   public boolean M() {
      return this.ce;
   }

   public boolean N() {
      return !this.cc.l;
   }

   public Optional<fom> O() {
      return this.cg;
   }

   static final class a extends fom {
      static final BiFunction<aex, fol.c, fom> aY = ac.a(
         ($$0, $$1) -> fom.a("outline", eln.r, elu.b.h, 256, fom.b.a().a(O).a(new fol.n($$0, false, false)).a($$1).a(ay).a(aJ).a(fom.c.b))
      );
      private final fom.b aZ;
      private final Optional<fom> ba;
      private final boolean bb;

      a(String $$0, elu $$1, elu.b $$2, int $$3, boolean $$4, boolean $$5, fom.b $$6) {
         super($$0, $$1, $$2, $$3, $$4, $$5, () -> $$6.o.forEach(fol::a), () -> $$6.o.forEach(fol::b));
         this.aZ = $$6;
         this.ba = $$6.n == fom.c.c ? $$6.a.c().map($$1x -> aY.apply($$1x, $$6.e)) : Optional.empty();
         this.bb = $$6.n == fom.c.b;
      }

      @Override
      public Optional<fom> K() {
         return this.ba;
      }

      @Override
      public boolean L() {
         return this.bb;
      }

      protected final fom.b P() {
         return this.aZ;
      }

      @Override
      public String toString() {
         return "RenderType[" + this.b + ":" + this.aZ + "]";
      }
   }

   protected static final class b {
      final fol.e a;
      private final fol.m b;
      private final fol.p c;
      private final fol.d d;
      final fol.c e;
      private final fol.g f;
      private final fol.l g;
      private final fol.f h;
      private final fol.k i;
      private final fol.o j;
      private final fol.q k;
      private final fol.h l;
      private final fol.b m;
      final fom.c n;
      final ImmutableList<fol> o;

      b(
         fol.e $$0,
         fol.m $$1,
         fol.p $$2,
         fol.d $$3,
         fol.c $$4,
         fol.g $$5,
         fol.l $$6,
         fol.f $$7,
         fol.k $$8,
         fol.o $$9,
         fol.q $$10,
         fol.h $$11,
         fol.b $$12,
         fom.c $$13
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
         this.o = ImmutableList.of(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.m, new fol[]{this.l});
      }

      @Override
      public String toString() {
         return "CompositeState[" + this.o + ", outlineProperty=" + this.n + "]";
      }

      public static fom.b.a a() {
         return new fom.b.a();
      }

      public static class a {
         private fol.e a = fol.ao;
         private fol.m b = fol.i;
         private fol.p c;
         private fol.d d;
         private fol.c e;
         private fol.g f;
         private fol.l g;
         private fol.f h;
         private fol.k i;
         private fol.o j;
         private fol.q k;
         private fol.h l;
         private fol.b m;

         a() {
            this.c = fol.c;
            this.d = fol.aA;
            this.e = fol.aw;
            this.f = fol.at;
            this.g = fol.av;
            this.h = fol.aF;
            this.i = fol.aI;
            this.j = fol.ap;
            this.k = fol.aC;
            this.l = fol.aP;
            this.m = fol.aQ;
         }

         public fom.b.a a(fol.e $$0) {
            this.a = $$0;
            return this;
         }

         public fom.b.a a(fol.m $$0) {
            this.b = $$0;
            return this;
         }

         public fom.b.a a(fol.p $$0) {
            this.c = $$0;
            return this;
         }

         public fom.b.a a(fol.d $$0) {
            this.d = $$0;
            return this;
         }

         public fom.b.a a(fol.c $$0) {
            this.e = $$0;
            return this;
         }

         public fom.b.a a(fol.g $$0) {
            this.f = $$0;
            return this;
         }

         public fom.b.a a(fol.l $$0) {
            this.g = $$0;
            return this;
         }

         public fom.b.a a(fol.f $$0) {
            this.h = $$0;
            return this;
         }

         public fom.b.a a(fol.k $$0) {
            this.i = $$0;
            return this;
         }

         public fom.b.a a(fol.o $$0) {
            this.j = $$0;
            return this;
         }

         public fom.b.a a(fol.q $$0) {
            this.k = $$0;
            return this;
         }

         public fom.b.a a(fol.h $$0) {
            this.l = $$0;
            return this;
         }

         public fom.b.a a(fol.b $$0) {
            this.m = $$0;
            return this;
         }

         public fom.b a(boolean $$0) {
            return this.a($$0 ? fom.c.c : fom.c.a);
         }

         public fom.b a(fom.c $$0) {
            return new fom.b(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, $$0);
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
