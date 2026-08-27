import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.function.BiFunction;
import java.util.function.Function;

public abstract class fpj extends fpi {
   private static final int aY = 4;
   private static final int aZ = 1048576;
   public static final int aS = 2097152;
   public static final int aT = 262144;
   public static final int aU = 131072;
   public static final int aV = 256;
   private static final fpj ba = a("solid", emf.j, emm.b.h, 2097152, true, false, fpj.b.a().a(as).a(p).a(am).a(true));
   private static final fpj bb = a("cutout_mipped", emf.j, emm.b.h, 131072, true, false, fpj.b.a().a(as).a(q).a(am).a(true));
   private static final fpj bc = a("cutout", emf.j, emm.b.h, 131072, true, false, fpj.b.a().a(as).a(r).a(an).a(true));
   private static final fpj bd = a("translucent", emf.j, emm.b.h, 2097152, true, true, a(s));
   private static final fpj be = a("translucent_moving_block", emf.j, emm.b.h, 262144, false, true, P());
   private static final fpj bf = a("translucent_no_crumbling", emf.j, emm.b.h, 262144, false, true, a(u));
   private static final Function<afw, fpj> bg = ac.b($$0 -> a("armor_cutout_no_cull", $$0, false));
   private static final Function<afw, fpj> bh = ac.b($$0 -> {
      fpj.b $$1 = fpj.b.a().a(w).a(new fpi.n($$0, false, false)).a(c).a(as).a(au).a(true);
      return a("entity_solid", emf.k, emm.b.h, 256, true, false, $$1);
   });
   private static final Function<afw, fpj> bi = ac.b($$0 -> {
      fpj.b $$1 = fpj.b.a().a(x).a(new fpi.n($$0, false, false)).a(c).a(as).a(au).a(true);
      return a("entity_cutout", emf.k, emm.b.h, 256, true, false, $$1);
   });
   private static final BiFunction<afw, Boolean, fpj> bj = ac.a(($$0, $$1) -> {
      fpj.b $$2 = fpj.b.a().a(y).a(new fpi.n($$0, false, false)).a(c).a(ax).a(as).a(au).a($$1);
      return a("entity_cutout_no_cull", emf.k, emm.b.h, 256, true, false, $$2);
   });
   private static final BiFunction<afw, Boolean, fpj> bk = ac.a(($$0, $$1) -> {
      fpj.b $$2 = fpj.b.a().a(z).a(new fpi.n($$0, false, false)).a(c).a(ax).a(as).a(au).a(aH).a($$1);
      return a("entity_cutout_no_cull_z_offset", emf.k, emm.b.h, 256, true, false, $$2);
   });
   private static final Function<afw, fpj> bl = ac.b($$0 -> {
      fpj.b $$1 = fpj.b.a().a(A).a(new fpi.n($$0, false, false)).a(h).a(aO).a(as).a(au).a(fpi.aC).a(true);
      return a("item_entity_translucent_cull", emf.k, emm.b.h, 256, true, true, $$1);
   });
   private static final Function<afw, fpj> bm = ac.b($$0 -> {
      fpj.b $$1 = fpj.b.a().a(B).a(new fpi.n($$0, false, false)).a(h).a(as).a(au).a(true);
      return a("entity_translucent_cull", emf.k, emm.b.h, 256, true, true, $$1);
   });
   private static final BiFunction<afw, Boolean, fpj> bn = ac.a(($$0, $$1) -> {
      fpj.b $$2 = fpj.b.a().a(C).a(new fpi.n($$0, false, false)).a(h).a(ax).a(as).a(au).a($$1);
      return a("entity_translucent", emf.k, emm.b.h, 256, true, true, $$2);
   });
   private static final BiFunction<afw, Boolean, fpj> bo = ac.a(($$0, $$1) -> {
      fpj.b $$2 = fpj.b.a().a(D).a(new fpi.n($$0, false, false)).a(h).a(ax).a(aD).a(au).a($$1);
      return a("entity_translucent_emissive", emf.k, emm.b.h, 256, true, true, $$2);
   });
   private static final Function<afw, fpj> bp = ac.b($$0 -> {
      fpj.b $$1 = fpj.b.a().a(E).a(new fpi.n($$0, false, false)).a(ax).a(as).a(true);
      return a("entity_smooth_cutout", emf.k, emm.b.h, 256, $$1);
   });
   private static final BiFunction<afw, Boolean, fpj> bq = ac.a(($$0, $$1) -> {
      fpj.b $$2 = fpj.b.a().a(F).a(new fpi.n($$0, false, false)).a($$1 ? h : c).a($$1 ? aD : aC).a(false);
      return a("beacon_beam", emf.j, emm.b.h, 256, false, true, $$2);
   });
   private static final Function<afw, fpj> br = ac.b($$0 -> {
      fpj.b $$1 = fpj.b.a().a(G).a(new fpi.n($$0, false, false)).a(az).a(ax).a(as).a(au).a(false);
      return a("entity_decal", emf.k, emm.b.h, 256, $$1);
   });
   private static final Function<afw, fpj> bs = ac.b($$0 -> {
      fpj.b $$1 = fpj.b.a().a(H).a(new fpi.n($$0, false, false)).a(h).a(ax).a(as).a(au).a(aD).a(false);
      return a("entity_no_outline", emf.k, emm.b.h, 256, false, true, $$1);
   });
   private static final Function<afw, fpj> bt = ac.b($$0 -> {
      fpj.b $$1 = fpj.b.a().a(I).a(new fpi.n($$0, false, false)).a(h).a(aw).a(as).a(au).a(aD).a(aA).a(aH).a(false);
      return a("entity_shadow", emf.k, emm.b.h, 256, false, false, $$1);
   });
   private static final Function<afw, fpj> bu = ac.b($$0 -> {
      fpj.b $$1 = fpj.b.a().a(J).a(new fpi.n($$0, false, false)).a(ax).a(true);
      return a("entity_alpha", emf.k, emm.b.h, 256, $$1);
   });
   private static final Function<afw, fpj> bv = ac.b($$0 -> {
      fpi.n $$1 = new fpi.n($$0, false, false);
      return a("eyes", emf.k, emm.b.h, 256, false, true, fpj.b.a().a(K).a($$1).a(d).a(aD).a(false));
   });
   private static final fpj bw = a("leash", emf.p, emm.b.f, 256, fpj.b.a().a(M).a(ao).a(ax).a(as).a(false));
   private static final fpj bx = a("water_mask", emf.m, emm.b.h, 256, fpj.b.a().a(N).a(ao).a(aE).a(false));
   private static final fpj by = a(
      "armor_glint", emf.q, emm.b.h, 256, fpj.b.a().a(P).a(new fpi.n(fvb.a, true, false)).a(aD).a(ax).a(az).a(f).a(aq).a(aH).a(false)
   );
   private static final fpj bz = a(
      "armor_entity_glint", emf.q, emm.b.h, 256, fpj.b.a().a(Q).a(new fpi.n(fvb.a, true, false)).a(aD).a(ax).a(az).a(f).a(ar).a(aH).a(false)
   );
   private static final fpj bA = a(
      "glint_translucent", emf.q, emm.b.h, 256, fpj.b.a().a(R).a(new fpi.n(fvb.b, true, false)).a(aD).a(ax).a(az).a(f).a(aq).a(aO).a(false)
   );
   private static final fpj bB = a("glint", emf.q, emm.b.h, 256, fpj.b.a().a(S).a(new fpi.n(fvb.b, true, false)).a(aD).a(ax).a(az).a(f).a(aq).a(false));
   private static final fpj bC = a("glint_direct", emf.q, emm.b.h, 256, fpj.b.a().a(T).a(new fpi.n(fvb.b, true, false)).a(aD).a(ax).a(az).a(f).a(aq).a(false));
   private static final fpj bD = a(
      "entity_glint", emf.q, emm.b.h, 256, fpj.b.a().a(U).a(new fpi.n(fvb.a, true, false)).a(aD).a(ax).a(az).a(f).a(aO).a(ar).a(false)
   );
   private static final fpj bE = a(
      "entity_glint_direct", emf.q, emm.b.h, 256, fpj.b.a().a(V).a(new fpi.n(fvb.a, true, false)).a(aD).a(ax).a(az).a(f).a(ar).a(false)
   );
   private static final Function<afw, fpj> bF = ac.b($$0 -> {
      fpi.n $$1 = new fpi.n($$0, false, false);
      return a("crumbling", emf.j, emm.b.h, 256, false, true, fpj.b.a().a(W).a($$1).a(g).a(aD).a(aG).a(false));
   });
   private static final Function<afw, fpj> bG = ac.b(
      $$0 -> a("text", emf.t, emm.b.h, 256, false, true, fpj.b.a().a(X).a(new fpi.n($$0, false, false)).a(h).a(as).a(false))
   );
   private static final fpj bH = a("text_background", emf.p, emm.b.h, 256, false, true, fpj.b.a().a(Y).a(ao).a(h).a(as).a(false));
   private static final Function<afw, fpj> bI = ac.b(
      $$0 -> a("text_intensity", emf.t, emm.b.h, 256, false, true, fpj.b.a().a(Z).a(new fpi.n($$0, false, false)).a(h).a(as).a(false))
   );
   private static final Function<afw, fpj> bJ = ac.b(
      $$0 -> a("text_polygon_offset", emf.t, emm.b.h, 256, false, true, fpj.b.a().a(X).a(new fpi.n($$0, false, false)).a(h).a(as).a(aG).a(false))
   );
   private static final Function<afw, fpj> bK = ac.b(
      $$0 -> a("text_intensity_polygon_offset", emf.t, emm.b.h, 256, false, true, fpj.b.a().a(Z).a(new fpi.n($$0, false, false)).a(h).a(as).a(aG).a(false))
   );
   private static final Function<afw, fpj> bL = ac.b(
      $$0 -> a("text_see_through", emf.t, emm.b.h, 256, false, true, fpj.b.a().a(aa).a(new fpi.n($$0, false, false)).a(h).a(as).a(ay).a(aD).a(false))
   );
   private static final fpj bM = a("text_background_see_through", emf.p, emm.b.h, 256, false, true, fpj.b.a().a(ab).a(ao).a(h).a(as).a(ay).a(aD).a(false));
   private static final Function<afw, fpj> bN = ac.b(
      $$0 -> a("text_intensity_see_through", emf.t, emm.b.h, 256, false, true, fpj.b.a().a(ac).a(new fpi.n($$0, false, false)).a(h).a(as).a(ay).a(aD).a(false))
   );
   private static final fpj bO = a("lightning", emf.n, emm.b.h, 256, false, true, fpj.b.a().a(ad).a(aC).a(e).a(aM).a(false));
   private static final fpj bP = a("tripwire", emf.j, emm.b.h, 262144, true, true, Q());
   private static final fpj bQ = a(
      "end_portal", emf.m, emm.b.h, 256, false, false, fpj.b.a().a(af).a(fpi.i.d().a(frt.a, false, false).a(frt.b, false, false).a()).a(false)
   );
   private static final fpj bR = a(
      "end_gateway", emf.m, emm.b.h, 256, false, false, fpj.b.a().a(ag).a(fpi.i.d().a(frt.a, false, false).a(frt.b, false, false).a()).a(false)
   );
   public static final fpj.a aW = a("lines", emf.o, emm.b.a, 256, fpj.b.a().a(ah).a(new fpi.h(OptionalDouble.empty())).a(aH).a(h).a(aO).a(aC).a(ax).a(false));
   public static final fpj.a aX = a(
      "line_strip", emf.o, emm.b.b, 256, fpj.b.a().a(ah).a(new fpi.h(OptionalDouble.empty())).a(aH).a(h).a(aO).a(aC).a(ax).a(false)
   );
   private static final Function<Double, fpj.a> bS = ac.b(
      $$0 -> a("debug_line_strip", emf.n, emm.b.d, 256, fpj.b.a().a(o).a(new fpi.h(OptionalDouble.of($$0))).a(c).a(ax).a(false))
   );
   private static final fpj.a bT = a("debug_filled_box", emf.n, emm.b.f, 131072, false, true, fpj.b.a().a(o).a(aH).a(h).a(false));
   private static final fpj.a bU = a("debug_quads", emf.n, emm.b.h, 131072, false, true, fpj.b.a().a(o).a(h).a(ax).a(false));
   private static final fpj.a bV = a("debug_section_quads", emf.n, emm.b.h, 131072, false, true, fpj.b.a().a(o).a(aH).a(h).a(aw).a(false));
   private static final fpj.a bW = a("gui", emf.n, emm.b.h, 256, fpj.b.a().a(ai).a(h).a(aA).a(false));
   private static final fpj.a bX = a("gui_overlay", emf.n, emm.b.h, 256, fpj.b.a().a(aj).a(h).a(ay).a(aD).a(false));
   private static final fpj.a bY = a("gui_text_highlight", emf.n, emm.b.h, 256, fpj.b.a().a(ak).a(h).a(ay).a(aR).a(false));
   private static final fpj.a bZ = a("gui_ghost_recipe_overlay", emf.n, emm.b.h, 256, fpj.b.a().a(al).a(h).a(aB).a(aD).a(false));
   private static final ImmutableList<fpj> ca = ImmutableList.of(c(), d(), e(), f(), u());
   private final emm cb;
   private final emm.b cc;
   private final int cd;
   private final boolean ce;
   private final boolean cf;
   private final Optional<fpj> cg;

   public static fpj c() {
      return ba;
   }

   public static fpj d() {
      return bb;
   }

   public static fpj e() {
      return bc;
   }

   private static fpj.b a(fpi.m $$0) {
      return fpj.b.a().a(as).a($$0).a(am).a(h).a(aK).a(true);
   }

   public static fpj f() {
      return bd;
   }

   private static fpj.b P() {
      return fpj.b.a().a(as).a(t).a(am).a(h).a(aO).a(true);
   }

   public static fpj g() {
      return be;
   }

   public static fpj h() {
      return bf;
   }

   private static fpj.a a(String $$0, afw $$1, boolean $$2) {
      fpj.b $$3 = fpj.b.a().a(v).a(new fpi.n($$1, false, false)).a(c).a(ax).a(as).a(au).a(aH).a($$2 ? az : aA).a(true);
      return a($$0, emf.k, emm.b.h, 256, true, false, $$3);
   }

   public static fpj a(afw $$0) {
      return bg.apply($$0);
   }

   public static fpj b(afw $$0) {
      return a("armor_decal_cutout_no_cull", $$0, true);
   }

   public static fpj c(afw $$0) {
      return bh.apply($$0);
   }

   public static fpj d(afw $$0) {
      return bi.apply($$0);
   }

   public static fpj a(afw $$0, boolean $$1) {
      return bj.apply($$0, $$1);
   }

   public static fpj e(afw $$0) {
      return a($$0, true);
   }

   public static fpj b(afw $$0, boolean $$1) {
      return bk.apply($$0, $$1);
   }

   public static fpj f(afw $$0) {
      return b($$0, true);
   }

   public static fpj g(afw $$0) {
      return bl.apply($$0);
   }

   public static fpj h(afw $$0) {
      return bm.apply($$0);
   }

   public static fpj c(afw $$0, boolean $$1) {
      return bn.apply($$0, $$1);
   }

   public static fpj i(afw $$0) {
      return c($$0, true);
   }

   public static fpj d(afw $$0, boolean $$1) {
      return bo.apply($$0, $$1);
   }

   public static fpj j(afw $$0) {
      return d($$0, true);
   }

   public static fpj k(afw $$0) {
      return bp.apply($$0);
   }

   public static fpj e(afw $$0, boolean $$1) {
      return bq.apply($$0, $$1);
   }

   public static fpj l(afw $$0) {
      return br.apply($$0);
   }

   public static fpj m(afw $$0) {
      return bs.apply($$0);
   }

   public static fpj n(afw $$0) {
      return bt.apply($$0);
   }

   public static fpj o(afw $$0) {
      return bu.apply($$0);
   }

   public static fpj p(afw $$0) {
      return bv.apply($$0);
   }

   public static fpj a(afw $$0, float $$1, float $$2) {
      return a(
         "energy_swirl",
         emf.k,
         emm.b.h,
         256,
         false,
         true,
         fpj.b.a().a(L).a(new fpi.n($$0, false, false)).a(new fpi.j($$1, $$2)).a(d).a(ax).a(as).a(au).a(false)
      );
   }

   public static fpj i() {
      return bw;
   }

   public static fpj j() {
      return bx;
   }

   public static fpj q(afw $$0) {
      return fpj.a.aY.apply($$0, ax);
   }

   public static fpj k() {
      return by;
   }

   public static fpj l() {
      return bz;
   }

   public static fpj m() {
      return bA;
   }

   public static fpj n() {
      return bB;
   }

   public static fpj o() {
      return bC;
   }

   public static fpj p() {
      return bD;
   }

   public static fpj q() {
      return bE;
   }

   public static fpj r(afw $$0) {
      return bF.apply($$0);
   }

   public static fpj s(afw $$0) {
      return bG.apply($$0);
   }

   public static fpj r() {
      return bH;
   }

   public static fpj t(afw $$0) {
      return bI.apply($$0);
   }

   public static fpj u(afw $$0) {
      return bJ.apply($$0);
   }

   public static fpj v(afw $$0) {
      return bK.apply($$0);
   }

   public static fpj w(afw $$0) {
      return bL.apply($$0);
   }

   public static fpj s() {
      return bM;
   }

   public static fpj x(afw $$0) {
      return bN.apply($$0);
   }

   public static fpj t() {
      return bO;
   }

   private static fpj.b Q() {
      return fpj.b.a().a(as).a(ae).a(am).a(h).a(aM).a(true);
   }

   public static fpj u() {
      return bP;
   }

   public static fpj v() {
      return bQ;
   }

   public static fpj w() {
      return bR;
   }

   public static fpj x() {
      return aW;
   }

   public static fpj y() {
      return aX;
   }

   public static fpj a(double $$0) {
      return bS.apply($$0);
   }

   public static fpj z() {
      return bT;
   }

   public static fpj A() {
      return bU;
   }

   public static fpj B() {
      return bV;
   }

   public static fpj C() {
      return bW;
   }

   public static fpj D() {
      return bX;
   }

   public static fpj E() {
      return bY;
   }

   public static fpj F() {
      return bZ;
   }

   public fpj(String $$0, emm $$1, emm.b $$2, int $$3, boolean $$4, boolean $$5, Runnable $$6, Runnable $$7) {
      super($$0, $$6, $$7);
      this.cb = $$1;
      this.cc = $$2;
      this.cd = $$3;
      this.ce = $$4;
      this.cf = $$5;
      this.cg = Optional.of(this);
   }

   static fpj.a a(String $$0, emm $$1, emm.b $$2, int $$3, fpj.b $$4) {
      return a($$0, $$1, $$2, $$3, false, false, $$4);
   }

   private static fpj.a a(String $$0, emm $$1, emm.b $$2, int $$3, boolean $$4, boolean $$5, fpj.b $$6) {
      return new fpj.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   public void a(emc $$0, emp $$1) {
      if ($$0.j()) {
         if (this.cf) {
            $$0.a($$1);
         }

         emc.b $$2 = $$0.d();
         this.a();
         emd.a($$2);
         this.b();
      }
   }

   @Override
   public String toString() {
      return this.b;
   }

   public static List<fpj> G() {
      return ca;
   }

   public int H() {
      return this.cd;
   }

   public emm I() {
      return this.cb;
   }

   public emm.b J() {
      return this.cc;
   }

   public Optional<fpj> K() {
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

   public Optional<fpj> O() {
      return this.cg;
   }

   static final class a extends fpj {
      static final BiFunction<afw, fpi.c, fpj> aY = ac.a(
         ($$0, $$1) -> fpj.a("outline", emf.r, emm.b.h, 256, fpj.b.a().a(O).a(new fpi.n($$0, false, false)).a($$1).a(ay).a(aJ).a(fpj.c.b))
      );
      private final fpj.b aZ;
      private final Optional<fpj> ba;
      private final boolean bb;

      a(String $$0, emm $$1, emm.b $$2, int $$3, boolean $$4, boolean $$5, fpj.b $$6) {
         super($$0, $$1, $$2, $$3, $$4, $$5, () -> $$6.o.forEach(fpi::a), () -> $$6.o.forEach(fpi::b));
         this.aZ = $$6;
         this.ba = $$6.n == fpj.c.c ? $$6.a.c().map($$1x -> aY.apply($$1x, $$6.e)) : Optional.empty();
         this.bb = $$6.n == fpj.c.b;
      }

      @Override
      public Optional<fpj> K() {
         return this.ba;
      }

      @Override
      public boolean L() {
         return this.bb;
      }

      protected final fpj.b P() {
         return this.aZ;
      }

      @Override
      public String toString() {
         return "RenderType[" + this.b + ":" + this.aZ + "]";
      }
   }

   protected static final class b {
      final fpi.e a;
      private final fpi.m b;
      private final fpi.p c;
      private final fpi.d d;
      final fpi.c e;
      private final fpi.g f;
      private final fpi.l g;
      private final fpi.f h;
      private final fpi.k i;
      private final fpi.o j;
      private final fpi.q k;
      private final fpi.h l;
      private final fpi.b m;
      final fpj.c n;
      final ImmutableList<fpi> o;

      b(
         fpi.e $$0,
         fpi.m $$1,
         fpi.p $$2,
         fpi.d $$3,
         fpi.c $$4,
         fpi.g $$5,
         fpi.l $$6,
         fpi.f $$7,
         fpi.k $$8,
         fpi.o $$9,
         fpi.q $$10,
         fpi.h $$11,
         fpi.b $$12,
         fpj.c $$13
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
         this.o = ImmutableList.of(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.m, new fpi[]{this.l});
      }

      @Override
      public String toString() {
         return "CompositeState[" + this.o + ", outlineProperty=" + this.n + "]";
      }

      public static fpj.b.a a() {
         return new fpj.b.a();
      }

      public static class a {
         private fpi.e a = fpi.ao;
         private fpi.m b = fpi.i;
         private fpi.p c;
         private fpi.d d;
         private fpi.c e;
         private fpi.g f;
         private fpi.l g;
         private fpi.f h;
         private fpi.k i;
         private fpi.o j;
         private fpi.q k;
         private fpi.h l;
         private fpi.b m;

         a() {
            this.c = fpi.c;
            this.d = fpi.aA;
            this.e = fpi.aw;
            this.f = fpi.at;
            this.g = fpi.av;
            this.h = fpi.aF;
            this.i = fpi.aI;
            this.j = fpi.ap;
            this.k = fpi.aC;
            this.l = fpi.aP;
            this.m = fpi.aQ;
         }

         public fpj.b.a a(fpi.e $$0) {
            this.a = $$0;
            return this;
         }

         public fpj.b.a a(fpi.m $$0) {
            this.b = $$0;
            return this;
         }

         public fpj.b.a a(fpi.p $$0) {
            this.c = $$0;
            return this;
         }

         public fpj.b.a a(fpi.d $$0) {
            this.d = $$0;
            return this;
         }

         public fpj.b.a a(fpi.c $$0) {
            this.e = $$0;
            return this;
         }

         public fpj.b.a a(fpi.g $$0) {
            this.f = $$0;
            return this;
         }

         public fpj.b.a a(fpi.l $$0) {
            this.g = $$0;
            return this;
         }

         public fpj.b.a a(fpi.f $$0) {
            this.h = $$0;
            return this;
         }

         public fpj.b.a a(fpi.k $$0) {
            this.i = $$0;
            return this;
         }

         public fpj.b.a a(fpi.o $$0) {
            this.j = $$0;
            return this;
         }

         public fpj.b.a a(fpi.q $$0) {
            this.k = $$0;
            return this;
         }

         public fpj.b.a a(fpi.h $$0) {
            this.l = $$0;
            return this;
         }

         public fpj.b.a a(fpi.b $$0) {
            this.m = $$0;
            return this;
         }

         public fpj.b a(boolean $$0) {
            return this.a($$0 ? fpj.c.c : fpj.c.a);
         }

         public fpj.b a(fpj.c $$0) {
            return new fpj.b(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, $$0);
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
