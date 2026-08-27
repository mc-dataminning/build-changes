import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.function.BiFunction;
import java.util.function.Function;

public abstract class foc extends fob {
   private static final int aY = 4;
   private static final int aZ = 1048576;
   public static final int aS = 2097152;
   public static final int aT = 262144;
   public static final int aU = 131072;
   public static final int aV = 256;
   private static final foc ba = a("solid", eld.j, elk.b.h, 2097152, true, false, foc.b.a().a(as).a(p).a(am).a(true));
   private static final foc bb = a("cutout_mipped", eld.j, elk.b.h, 131072, true, false, foc.b.a().a(as).a(q).a(am).a(true));
   private static final foc bc = a("cutout", eld.j, elk.b.h, 131072, true, false, foc.b.a().a(as).a(r).a(an).a(true));
   private static final foc bd = a("translucent", eld.j, elk.b.h, 2097152, true, true, a(s));
   private static final foc be = a("translucent_moving_block", eld.j, elk.b.h, 262144, false, true, P());
   private static final foc bf = a("translucent_no_crumbling", eld.j, elk.b.h, 262144, false, true, a(u));
   private static final Function<aer, foc> bg = ac.b($$0 -> a("armor_cutout_no_cull", $$0, false));
   private static final Function<aer, foc> bh = ac.b($$0 -> {
      foc.b $$1 = foc.b.a().a(w).a(new fob.n($$0, false, false)).a(c).a(as).a(au).a(true);
      return a("entity_solid", eld.k, elk.b.h, 256, true, false, $$1);
   });
   private static final Function<aer, foc> bi = ac.b($$0 -> {
      foc.b $$1 = foc.b.a().a(x).a(new fob.n($$0, false, false)).a(c).a(as).a(au).a(true);
      return a("entity_cutout", eld.k, elk.b.h, 256, true, false, $$1);
   });
   private static final BiFunction<aer, Boolean, foc> bj = ac.a(($$0, $$1) -> {
      foc.b $$2 = foc.b.a().a(y).a(new fob.n($$0, false, false)).a(c).a(ax).a(as).a(au).a($$1);
      return a("entity_cutout_no_cull", eld.k, elk.b.h, 256, true, false, $$2);
   });
   private static final BiFunction<aer, Boolean, foc> bk = ac.a(($$0, $$1) -> {
      foc.b $$2 = foc.b.a().a(z).a(new fob.n($$0, false, false)).a(c).a(ax).a(as).a(au).a(aH).a($$1);
      return a("entity_cutout_no_cull_z_offset", eld.k, elk.b.h, 256, true, false, $$2);
   });
   private static final Function<aer, foc> bl = ac.b($$0 -> {
      foc.b $$1 = foc.b.a().a(A).a(new fob.n($$0, false, false)).a(h).a(aO).a(as).a(au).a(fob.aC).a(true);
      return a("item_entity_translucent_cull", eld.k, elk.b.h, 256, true, true, $$1);
   });
   private static final Function<aer, foc> bm = ac.b($$0 -> {
      foc.b $$1 = foc.b.a().a(B).a(new fob.n($$0, false, false)).a(h).a(as).a(au).a(true);
      return a("entity_translucent_cull", eld.k, elk.b.h, 256, true, true, $$1);
   });
   private static final BiFunction<aer, Boolean, foc> bn = ac.a(($$0, $$1) -> {
      foc.b $$2 = foc.b.a().a(C).a(new fob.n($$0, false, false)).a(h).a(ax).a(as).a(au).a($$1);
      return a("entity_translucent", eld.k, elk.b.h, 256, true, true, $$2);
   });
   private static final BiFunction<aer, Boolean, foc> bo = ac.a(($$0, $$1) -> {
      foc.b $$2 = foc.b.a().a(D).a(new fob.n($$0, false, false)).a(h).a(ax).a(aD).a(au).a($$1);
      return a("entity_translucent_emissive", eld.k, elk.b.h, 256, true, true, $$2);
   });
   private static final Function<aer, foc> bp = ac.b($$0 -> {
      foc.b $$1 = foc.b.a().a(E).a(new fob.n($$0, false, false)).a(ax).a(as).a(true);
      return a("entity_smooth_cutout", eld.k, elk.b.h, 256, $$1);
   });
   private static final BiFunction<aer, Boolean, foc> bq = ac.a(($$0, $$1) -> {
      foc.b $$2 = foc.b.a().a(F).a(new fob.n($$0, false, false)).a($$1 ? h : c).a($$1 ? aD : aC).a(false);
      return a("beacon_beam", eld.j, elk.b.h, 256, false, true, $$2);
   });
   private static final Function<aer, foc> br = ac.b($$0 -> {
      foc.b $$1 = foc.b.a().a(G).a(new fob.n($$0, false, false)).a(az).a(ax).a(as).a(au).a(false);
      return a("entity_decal", eld.k, elk.b.h, 256, $$1);
   });
   private static final Function<aer, foc> bs = ac.b($$0 -> {
      foc.b $$1 = foc.b.a().a(H).a(new fob.n($$0, false, false)).a(h).a(ax).a(as).a(au).a(aD).a(false);
      return a("entity_no_outline", eld.k, elk.b.h, 256, false, true, $$1);
   });
   private static final Function<aer, foc> bt = ac.b($$0 -> {
      foc.b $$1 = foc.b.a().a(I).a(new fob.n($$0, false, false)).a(h).a(aw).a(as).a(au).a(aD).a(aA).a(aH).a(false);
      return a("entity_shadow", eld.k, elk.b.h, 256, false, false, $$1);
   });
   private static final Function<aer, foc> bu = ac.b($$0 -> {
      foc.b $$1 = foc.b.a().a(J).a(new fob.n($$0, false, false)).a(ax).a(true);
      return a("entity_alpha", eld.k, elk.b.h, 256, $$1);
   });
   private static final Function<aer, foc> bv = ac.b($$0 -> {
      fob.n $$1 = new fob.n($$0, false, false);
      return a("eyes", eld.k, elk.b.h, 256, false, true, foc.b.a().a(K).a($$1).a(d).a(aD).a(false));
   });
   private static final foc bw = a("leash", eld.p, elk.b.f, 256, foc.b.a().a(M).a(ao).a(ax).a(as).a(false));
   private static final foc bx = a("water_mask", eld.m, elk.b.h, 256, foc.b.a().a(N).a(ao).a(aE).a(false));
   private static final foc by = a(
      "armor_glint", eld.q, elk.b.h, 256, foc.b.a().a(P).a(new fob.n(ftv.a, true, false)).a(aD).a(ax).a(az).a(f).a(aq).a(aH).a(false)
   );
   private static final foc bz = a(
      "armor_entity_glint", eld.q, elk.b.h, 256, foc.b.a().a(Q).a(new fob.n(ftv.a, true, false)).a(aD).a(ax).a(az).a(f).a(ar).a(aH).a(false)
   );
   private static final foc bA = a(
      "glint_translucent", eld.q, elk.b.h, 256, foc.b.a().a(R).a(new fob.n(ftv.b, true, false)).a(aD).a(ax).a(az).a(f).a(aq).a(aO).a(false)
   );
   private static final foc bB = a("glint", eld.q, elk.b.h, 256, foc.b.a().a(S).a(new fob.n(ftv.b, true, false)).a(aD).a(ax).a(az).a(f).a(aq).a(false));
   private static final foc bC = a("glint_direct", eld.q, elk.b.h, 256, foc.b.a().a(T).a(new fob.n(ftv.b, true, false)).a(aD).a(ax).a(az).a(f).a(aq).a(false));
   private static final foc bD = a(
      "entity_glint", eld.q, elk.b.h, 256, foc.b.a().a(U).a(new fob.n(ftv.a, true, false)).a(aD).a(ax).a(az).a(f).a(aO).a(ar).a(false)
   );
   private static final foc bE = a(
      "entity_glint_direct", eld.q, elk.b.h, 256, foc.b.a().a(V).a(new fob.n(ftv.a, true, false)).a(aD).a(ax).a(az).a(f).a(ar).a(false)
   );
   private static final Function<aer, foc> bF = ac.b($$0 -> {
      fob.n $$1 = new fob.n($$0, false, false);
      return a("crumbling", eld.j, elk.b.h, 256, false, true, foc.b.a().a(W).a($$1).a(g).a(aD).a(aG).a(false));
   });
   private static final Function<aer, foc> bG = ac.b(
      $$0 -> a("text", eld.t, elk.b.h, 256, false, true, foc.b.a().a(X).a(new fob.n($$0, false, false)).a(h).a(as).a(false))
   );
   private static final foc bH = a("text_background", eld.p, elk.b.h, 256, false, true, foc.b.a().a(Y).a(ao).a(h).a(as).a(false));
   private static final Function<aer, foc> bI = ac.b(
      $$0 -> a("text_intensity", eld.t, elk.b.h, 256, false, true, foc.b.a().a(Z).a(new fob.n($$0, false, false)).a(h).a(as).a(false))
   );
   private static final Function<aer, foc> bJ = ac.b(
      $$0 -> a("text_polygon_offset", eld.t, elk.b.h, 256, false, true, foc.b.a().a(X).a(new fob.n($$0, false, false)).a(h).a(as).a(aG).a(false))
   );
   private static final Function<aer, foc> bK = ac.b(
      $$0 -> a("text_intensity_polygon_offset", eld.t, elk.b.h, 256, false, true, foc.b.a().a(Z).a(new fob.n($$0, false, false)).a(h).a(as).a(aG).a(false))
   );
   private static final Function<aer, foc> bL = ac.b(
      $$0 -> a("text_see_through", eld.t, elk.b.h, 256, false, true, foc.b.a().a(aa).a(new fob.n($$0, false, false)).a(h).a(as).a(ay).a(aD).a(false))
   );
   private static final foc bM = a("text_background_see_through", eld.p, elk.b.h, 256, false, true, foc.b.a().a(ab).a(ao).a(h).a(as).a(ay).a(aD).a(false));
   private static final Function<aer, foc> bN = ac.b(
      $$0 -> a("text_intensity_see_through", eld.t, elk.b.h, 256, false, true, foc.b.a().a(ac).a(new fob.n($$0, false, false)).a(h).a(as).a(ay).a(aD).a(false))
   );
   private static final foc bO = a("lightning", eld.n, elk.b.h, 256, false, true, foc.b.a().a(ad).a(aC).a(e).a(aM).a(false));
   private static final foc bP = a("tripwire", eld.j, elk.b.h, 262144, true, true, Q());
   private static final foc bQ = a(
      "end_portal", eld.m, elk.b.h, 256, false, false, foc.b.a().a(af).a(fob.i.d().a(fqn.a, false, false).a(fqn.b, false, false).a()).a(false)
   );
   private static final foc bR = a(
      "end_gateway", eld.m, elk.b.h, 256, false, false, foc.b.a().a(ag).a(fob.i.d().a(fqn.a, false, false).a(fqn.b, false, false).a()).a(false)
   );
   public static final foc.a aW = a("lines", eld.o, elk.b.a, 256, foc.b.a().a(ah).a(new fob.h(OptionalDouble.empty())).a(aH).a(h).a(aO).a(aC).a(ax).a(false));
   public static final foc.a aX = a(
      "line_strip", eld.o, elk.b.b, 256, foc.b.a().a(ah).a(new fob.h(OptionalDouble.empty())).a(aH).a(h).a(aO).a(aC).a(ax).a(false)
   );
   private static final Function<Double, foc.a> bS = ac.b(
      $$0 -> a("debug_line_strip", eld.n, elk.b.d, 256, foc.b.a().a(o).a(new fob.h(OptionalDouble.of($$0))).a(c).a(ax).a(false))
   );
   private static final foc.a bT = a("debug_filled_box", eld.n, elk.b.f, 131072, false, true, foc.b.a().a(o).a(aH).a(h).a(false));
   private static final foc.a bU = a("debug_quads", eld.n, elk.b.h, 131072, false, true, foc.b.a().a(o).a(h).a(ax).a(false));
   private static final foc.a bV = a("debug_section_quads", eld.n, elk.b.h, 131072, false, true, foc.b.a().a(o).a(aH).a(h).a(aw).a(false));
   private static final foc.a bW = a("gui", eld.n, elk.b.h, 256, foc.b.a().a(ai).a(h).a(aA).a(false));
   private static final foc.a bX = a("gui_overlay", eld.n, elk.b.h, 256, foc.b.a().a(aj).a(h).a(ay).a(aD).a(false));
   private static final foc.a bY = a("gui_text_highlight", eld.n, elk.b.h, 256, foc.b.a().a(ak).a(h).a(ay).a(aR).a(false));
   private static final foc.a bZ = a("gui_ghost_recipe_overlay", eld.n, elk.b.h, 256, foc.b.a().a(al).a(h).a(aB).a(aD).a(false));
   private static final ImmutableList<foc> ca = ImmutableList.of(c(), d(), e(), f(), u());
   private final elk cb;
   private final elk.b cc;
   private final int cd;
   private final boolean ce;
   private final boolean cf;
   private final Optional<foc> cg;

   public static foc c() {
      return ba;
   }

   public static foc d() {
      return bb;
   }

   public static foc e() {
      return bc;
   }

   private static foc.b a(fob.m $$0) {
      return foc.b.a().a(as).a($$0).a(am).a(h).a(aK).a(true);
   }

   public static foc f() {
      return bd;
   }

   private static foc.b P() {
      return foc.b.a().a(as).a(t).a(am).a(h).a(aO).a(true);
   }

   public static foc g() {
      return be;
   }

   public static foc h() {
      return bf;
   }

   private static foc.a a(String $$0, aer $$1, boolean $$2) {
      foc.b $$3 = foc.b.a().a(v).a(new fob.n($$1, false, false)).a(c).a(ax).a(as).a(au).a(aH).a($$2 ? az : aA).a(true);
      return a($$0, eld.k, elk.b.h, 256, true, false, $$3);
   }

   public static foc a(aer $$0) {
      return bg.apply($$0);
   }

   public static foc b(aer $$0) {
      return a("armor_decal_cutout_no_cull", $$0, true);
   }

   public static foc c(aer $$0) {
      return bh.apply($$0);
   }

   public static foc d(aer $$0) {
      return bi.apply($$0);
   }

   public static foc a(aer $$0, boolean $$1) {
      return bj.apply($$0, $$1);
   }

   public static foc e(aer $$0) {
      return a($$0, true);
   }

   public static foc b(aer $$0, boolean $$1) {
      return bk.apply($$0, $$1);
   }

   public static foc f(aer $$0) {
      return b($$0, true);
   }

   public static foc g(aer $$0) {
      return bl.apply($$0);
   }

   public static foc h(aer $$0) {
      return bm.apply($$0);
   }

   public static foc c(aer $$0, boolean $$1) {
      return bn.apply($$0, $$1);
   }

   public static foc i(aer $$0) {
      return c($$0, true);
   }

   public static foc d(aer $$0, boolean $$1) {
      return bo.apply($$0, $$1);
   }

   public static foc j(aer $$0) {
      return d($$0, true);
   }

   public static foc k(aer $$0) {
      return bp.apply($$0);
   }

   public static foc e(aer $$0, boolean $$1) {
      return bq.apply($$0, $$1);
   }

   public static foc l(aer $$0) {
      return br.apply($$0);
   }

   public static foc m(aer $$0) {
      return bs.apply($$0);
   }

   public static foc n(aer $$0) {
      return bt.apply($$0);
   }

   public static foc o(aer $$0) {
      return bu.apply($$0);
   }

   public static foc p(aer $$0) {
      return bv.apply($$0);
   }

   public static foc a(aer $$0, float $$1, float $$2) {
      return a(
         "energy_swirl",
         eld.k,
         elk.b.h,
         256,
         false,
         true,
         foc.b.a().a(L).a(new fob.n($$0, false, false)).a(new fob.j($$1, $$2)).a(d).a(ax).a(as).a(au).a(false)
      );
   }

   public static foc i() {
      return bw;
   }

   public static foc j() {
      return bx;
   }

   public static foc q(aer $$0) {
      return foc.a.aY.apply($$0, ax);
   }

   public static foc k() {
      return by;
   }

   public static foc l() {
      return bz;
   }

   public static foc m() {
      return bA;
   }

   public static foc n() {
      return bB;
   }

   public static foc o() {
      return bC;
   }

   public static foc p() {
      return bD;
   }

   public static foc q() {
      return bE;
   }

   public static foc r(aer $$0) {
      return bF.apply($$0);
   }

   public static foc s(aer $$0) {
      return bG.apply($$0);
   }

   public static foc r() {
      return bH;
   }

   public static foc t(aer $$0) {
      return bI.apply($$0);
   }

   public static foc u(aer $$0) {
      return bJ.apply($$0);
   }

   public static foc v(aer $$0) {
      return bK.apply($$0);
   }

   public static foc w(aer $$0) {
      return bL.apply($$0);
   }

   public static foc s() {
      return bM;
   }

   public static foc x(aer $$0) {
      return bN.apply($$0);
   }

   public static foc t() {
      return bO;
   }

   private static foc.b Q() {
      return foc.b.a().a(as).a(ae).a(am).a(h).a(aM).a(true);
   }

   public static foc u() {
      return bP;
   }

   public static foc v() {
      return bQ;
   }

   public static foc w() {
      return bR;
   }

   public static foc x() {
      return aW;
   }

   public static foc y() {
      return aX;
   }

   public static foc a(double $$0) {
      return bS.apply($$0);
   }

   public static foc z() {
      return bT;
   }

   public static foc A() {
      return bU;
   }

   public static foc B() {
      return bV;
   }

   public static foc C() {
      return bW;
   }

   public static foc D() {
      return bX;
   }

   public static foc E() {
      return bY;
   }

   public static foc F() {
      return bZ;
   }

   public foc(String $$0, elk $$1, elk.b $$2, int $$3, boolean $$4, boolean $$5, Runnable $$6, Runnable $$7) {
      super($$0, $$6, $$7);
      this.cb = $$1;
      this.cc = $$2;
      this.cd = $$3;
      this.ce = $$4;
      this.cf = $$5;
      this.cg = Optional.of(this);
   }

   static foc.a a(String $$0, elk $$1, elk.b $$2, int $$3, foc.b $$4) {
      return a($$0, $$1, $$2, $$3, false, false, $$4);
   }

   private static foc.a a(String $$0, elk $$1, elk.b $$2, int $$3, boolean $$4, boolean $$5, foc.b $$6) {
      return new foc.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   public void a(ela $$0, eln $$1) {
      if ($$0.j()) {
         if (this.cf) {
            $$0.a($$1);
         }

         ela.b $$2 = $$0.d();
         this.a();
         elb.a($$2);
         this.b();
      }
   }

   @Override
   public String toString() {
      return this.b;
   }

   public static List<foc> G() {
      return ca;
   }

   public int H() {
      return this.cd;
   }

   public elk I() {
      return this.cb;
   }

   public elk.b J() {
      return this.cc;
   }

   public Optional<foc> K() {
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

   public Optional<foc> O() {
      return this.cg;
   }

   static final class a extends foc {
      static final BiFunction<aer, fob.c, foc> aY = ac.a(
         ($$0, $$1) -> foc.a("outline", eld.r, elk.b.h, 256, foc.b.a().a(O).a(new fob.n($$0, false, false)).a($$1).a(ay).a(aJ).a(foc.c.b))
      );
      private final foc.b aZ;
      private final Optional<foc> ba;
      private final boolean bb;

      a(String $$0, elk $$1, elk.b $$2, int $$3, boolean $$4, boolean $$5, foc.b $$6) {
         super($$0, $$1, $$2, $$3, $$4, $$5, () -> $$6.o.forEach(fob::a), () -> $$6.o.forEach(fob::b));
         this.aZ = $$6;
         this.ba = $$6.n == foc.c.c ? $$6.a.c().map($$1x -> aY.apply($$1x, $$6.e)) : Optional.empty();
         this.bb = $$6.n == foc.c.b;
      }

      @Override
      public Optional<foc> K() {
         return this.ba;
      }

      @Override
      public boolean L() {
         return this.bb;
      }

      protected final foc.b P() {
         return this.aZ;
      }

      @Override
      public String toString() {
         return "RenderType[" + this.b + ":" + this.aZ + "]";
      }
   }

   protected static final class b {
      final fob.e a;
      private final fob.m b;
      private final fob.p c;
      private final fob.d d;
      final fob.c e;
      private final fob.g f;
      private final fob.l g;
      private final fob.f h;
      private final fob.k i;
      private final fob.o j;
      private final fob.q k;
      private final fob.h l;
      private final fob.b m;
      final foc.c n;
      final ImmutableList<fob> o;

      b(
         fob.e $$0,
         fob.m $$1,
         fob.p $$2,
         fob.d $$3,
         fob.c $$4,
         fob.g $$5,
         fob.l $$6,
         fob.f $$7,
         fob.k $$8,
         fob.o $$9,
         fob.q $$10,
         fob.h $$11,
         fob.b $$12,
         foc.c $$13
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
         this.o = ImmutableList.of(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.m, new fob[]{this.l});
      }

      @Override
      public String toString() {
         return "CompositeState[" + this.o + ", outlineProperty=" + this.n + "]";
      }

      public static foc.b.a a() {
         return new foc.b.a();
      }

      public static class a {
         private fob.e a = fob.ao;
         private fob.m b = fob.i;
         private fob.p c;
         private fob.d d;
         private fob.c e;
         private fob.g f;
         private fob.l g;
         private fob.f h;
         private fob.k i;
         private fob.o j;
         private fob.q k;
         private fob.h l;
         private fob.b m;

         a() {
            this.c = fob.c;
            this.d = fob.aA;
            this.e = fob.aw;
            this.f = fob.at;
            this.g = fob.av;
            this.h = fob.aF;
            this.i = fob.aI;
            this.j = fob.ap;
            this.k = fob.aC;
            this.l = fob.aP;
            this.m = fob.aQ;
         }

         public foc.b.a a(fob.e $$0) {
            this.a = $$0;
            return this;
         }

         public foc.b.a a(fob.m $$0) {
            this.b = $$0;
            return this;
         }

         public foc.b.a a(fob.p $$0) {
            this.c = $$0;
            return this;
         }

         public foc.b.a a(fob.d $$0) {
            this.d = $$0;
            return this;
         }

         public foc.b.a a(fob.c $$0) {
            this.e = $$0;
            return this;
         }

         public foc.b.a a(fob.g $$0) {
            this.f = $$0;
            return this;
         }

         public foc.b.a a(fob.l $$0) {
            this.g = $$0;
            return this;
         }

         public foc.b.a a(fob.f $$0) {
            this.h = $$0;
            return this;
         }

         public foc.b.a a(fob.k $$0) {
            this.i = $$0;
            return this;
         }

         public foc.b.a a(fob.o $$0) {
            this.j = $$0;
            return this;
         }

         public foc.b.a a(fob.q $$0) {
            this.k = $$0;
            return this;
         }

         public foc.b.a a(fob.h $$0) {
            this.l = $$0;
            return this;
         }

         public foc.b.a a(fob.b $$0) {
            this.m = $$0;
            return this;
         }

         public foc.b a(boolean $$0) {
            return this.a($$0 ? foc.c.c : foc.c.a);
         }

         public foc.b a(foc.c $$0) {
            return new foc.b(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, $$0);
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
