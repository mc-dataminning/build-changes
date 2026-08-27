import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.function.BiFunction;
import java.util.function.Function;

public abstract class fnt extends fns {
   private static final int aY = 4;
   private static final int aZ = 1048576;
   public static final int aS = 2097152;
   public static final int aT = 262144;
   public static final int aU = 131072;
   public static final int aV = 256;
   private static final fnt ba = a("solid", ele.j, ell.b.h, 2097152, true, false, fnt.b.a().a(as).a(p).a(am).a(true));
   private static final fnt bb = a("cutout_mipped", ele.j, ell.b.h, 131072, true, false, fnt.b.a().a(as).a(q).a(am).a(true));
   private static final fnt bc = a("cutout", ele.j, ell.b.h, 131072, true, false, fnt.b.a().a(as).a(r).a(an).a(true));
   private static final fnt bd = a("translucent", ele.j, ell.b.h, 2097152, true, true, a(s));
   private static final fnt be = a("translucent_moving_block", ele.j, ell.b.h, 262144, false, true, P());
   private static final fnt bf = a("translucent_no_crumbling", ele.j, ell.b.h, 262144, false, true, a(u));
   private static final Function<aer, fnt> bg = ac.b($$0 -> a("armor_cutout_no_cull", $$0, false));
   private static final Function<aer, fnt> bh = ac.b($$0 -> {
      fnt.b $$1 = fnt.b.a().a(w).a(new fns.n($$0, false, false)).a(c).a(as).a(au).a(true);
      return a("entity_solid", ele.k, ell.b.h, 256, true, false, $$1);
   });
   private static final Function<aer, fnt> bi = ac.b($$0 -> {
      fnt.b $$1 = fnt.b.a().a(x).a(new fns.n($$0, false, false)).a(c).a(as).a(au).a(true);
      return a("entity_cutout", ele.k, ell.b.h, 256, true, false, $$1);
   });
   private static final BiFunction<aer, Boolean, fnt> bj = ac.a(($$0, $$1) -> {
      fnt.b $$2 = fnt.b.a().a(y).a(new fns.n($$0, false, false)).a(c).a(ax).a(as).a(au).a($$1);
      return a("entity_cutout_no_cull", ele.k, ell.b.h, 256, true, false, $$2);
   });
   private static final BiFunction<aer, Boolean, fnt> bk = ac.a(($$0, $$1) -> {
      fnt.b $$2 = fnt.b.a().a(z).a(new fns.n($$0, false, false)).a(c).a(ax).a(as).a(au).a(aH).a($$1);
      return a("entity_cutout_no_cull_z_offset", ele.k, ell.b.h, 256, true, false, $$2);
   });
   private static final Function<aer, fnt> bl = ac.b($$0 -> {
      fnt.b $$1 = fnt.b.a().a(A).a(new fns.n($$0, false, false)).a(h).a(aO).a(as).a(au).a(fns.aC).a(true);
      return a("item_entity_translucent_cull", ele.k, ell.b.h, 256, true, true, $$1);
   });
   private static final Function<aer, fnt> bm = ac.b($$0 -> {
      fnt.b $$1 = fnt.b.a().a(B).a(new fns.n($$0, false, false)).a(h).a(as).a(au).a(true);
      return a("entity_translucent_cull", ele.k, ell.b.h, 256, true, true, $$1);
   });
   private static final BiFunction<aer, Boolean, fnt> bn = ac.a(($$0, $$1) -> {
      fnt.b $$2 = fnt.b.a().a(C).a(new fns.n($$0, false, false)).a(h).a(ax).a(as).a(au).a($$1);
      return a("entity_translucent", ele.k, ell.b.h, 256, true, true, $$2);
   });
   private static final BiFunction<aer, Boolean, fnt> bo = ac.a(($$0, $$1) -> {
      fnt.b $$2 = fnt.b.a().a(D).a(new fns.n($$0, false, false)).a(h).a(ax).a(aD).a(au).a($$1);
      return a("entity_translucent_emissive", ele.k, ell.b.h, 256, true, true, $$2);
   });
   private static final Function<aer, fnt> bp = ac.b($$0 -> {
      fnt.b $$1 = fnt.b.a().a(E).a(new fns.n($$0, false, false)).a(ax).a(as).a(true);
      return a("entity_smooth_cutout", ele.k, ell.b.h, 256, $$1);
   });
   private static final BiFunction<aer, Boolean, fnt> bq = ac.a(($$0, $$1) -> {
      fnt.b $$2 = fnt.b.a().a(F).a(new fns.n($$0, false, false)).a($$1 ? h : c).a($$1 ? aD : aC).a(false);
      return a("beacon_beam", ele.j, ell.b.h, 256, false, true, $$2);
   });
   private static final Function<aer, fnt> br = ac.b($$0 -> {
      fnt.b $$1 = fnt.b.a().a(G).a(new fns.n($$0, false, false)).a(az).a(ax).a(as).a(au).a(false);
      return a("entity_decal", ele.k, ell.b.h, 256, $$1);
   });
   private static final Function<aer, fnt> bs = ac.b($$0 -> {
      fnt.b $$1 = fnt.b.a().a(H).a(new fns.n($$0, false, false)).a(h).a(ax).a(as).a(au).a(aD).a(false);
      return a("entity_no_outline", ele.k, ell.b.h, 256, false, true, $$1);
   });
   private static final Function<aer, fnt> bt = ac.b($$0 -> {
      fnt.b $$1 = fnt.b.a().a(I).a(new fns.n($$0, false, false)).a(h).a(aw).a(as).a(au).a(aD).a(aA).a(aH).a(false);
      return a("entity_shadow", ele.k, ell.b.h, 256, false, false, $$1);
   });
   private static final Function<aer, fnt> bu = ac.b($$0 -> {
      fnt.b $$1 = fnt.b.a().a(J).a(new fns.n($$0, false, false)).a(ax).a(true);
      return a("entity_alpha", ele.k, ell.b.h, 256, $$1);
   });
   private static final Function<aer, fnt> bv = ac.b($$0 -> {
      fns.n $$1 = new fns.n($$0, false, false);
      return a("eyes", ele.k, ell.b.h, 256, false, true, fnt.b.a().a(K).a($$1).a(d).a(aD).a(false));
   });
   private static final fnt bw = a("leash", ele.p, ell.b.f, 256, fnt.b.a().a(M).a(ao).a(ax).a(as).a(false));
   private static final fnt bx = a("water_mask", ele.m, ell.b.h, 256, fnt.b.a().a(N).a(ao).a(aE).a(false));
   private static final fnt by = a(
      "armor_glint", ele.q, ell.b.h, 256, fnt.b.a().a(P).a(new fns.n(ftm.a, true, false)).a(aD).a(ax).a(az).a(f).a(aq).a(aH).a(false)
   );
   private static final fnt bz = a(
      "armor_entity_glint", ele.q, ell.b.h, 256, fnt.b.a().a(Q).a(new fns.n(ftm.a, true, false)).a(aD).a(ax).a(az).a(f).a(ar).a(aH).a(false)
   );
   private static final fnt bA = a(
      "glint_translucent", ele.q, ell.b.h, 256, fnt.b.a().a(R).a(new fns.n(ftm.b, true, false)).a(aD).a(ax).a(az).a(f).a(aq).a(aO).a(false)
   );
   private static final fnt bB = a("glint", ele.q, ell.b.h, 256, fnt.b.a().a(S).a(new fns.n(ftm.b, true, false)).a(aD).a(ax).a(az).a(f).a(aq).a(false));
   private static final fnt bC = a("glint_direct", ele.q, ell.b.h, 256, fnt.b.a().a(T).a(new fns.n(ftm.b, true, false)).a(aD).a(ax).a(az).a(f).a(aq).a(false));
   private static final fnt bD = a(
      "entity_glint", ele.q, ell.b.h, 256, fnt.b.a().a(U).a(new fns.n(ftm.a, true, false)).a(aD).a(ax).a(az).a(f).a(aO).a(ar).a(false)
   );
   private static final fnt bE = a(
      "entity_glint_direct", ele.q, ell.b.h, 256, fnt.b.a().a(V).a(new fns.n(ftm.a, true, false)).a(aD).a(ax).a(az).a(f).a(ar).a(false)
   );
   private static final Function<aer, fnt> bF = ac.b($$0 -> {
      fns.n $$1 = new fns.n($$0, false, false);
      return a("crumbling", ele.j, ell.b.h, 256, false, true, fnt.b.a().a(W).a($$1).a(g).a(aD).a(aG).a(false));
   });
   private static final Function<aer, fnt> bG = ac.b(
      $$0 -> a("text", ele.t, ell.b.h, 256, false, true, fnt.b.a().a(X).a(new fns.n($$0, false, false)).a(h).a(as).a(false))
   );
   private static final fnt bH = a("text_background", ele.p, ell.b.h, 256, false, true, fnt.b.a().a(Y).a(ao).a(h).a(as).a(false));
   private static final Function<aer, fnt> bI = ac.b(
      $$0 -> a("text_intensity", ele.t, ell.b.h, 256, false, true, fnt.b.a().a(Z).a(new fns.n($$0, false, false)).a(h).a(as).a(false))
   );
   private static final Function<aer, fnt> bJ = ac.b(
      $$0 -> a("text_polygon_offset", ele.t, ell.b.h, 256, false, true, fnt.b.a().a(X).a(new fns.n($$0, false, false)).a(h).a(as).a(aG).a(false))
   );
   private static final Function<aer, fnt> bK = ac.b(
      $$0 -> a("text_intensity_polygon_offset", ele.t, ell.b.h, 256, false, true, fnt.b.a().a(Z).a(new fns.n($$0, false, false)).a(h).a(as).a(aG).a(false))
   );
   private static final Function<aer, fnt> bL = ac.b(
      $$0 -> a("text_see_through", ele.t, ell.b.h, 256, false, true, fnt.b.a().a(aa).a(new fns.n($$0, false, false)).a(h).a(as).a(ay).a(aD).a(false))
   );
   private static final fnt bM = a("text_background_see_through", ele.p, ell.b.h, 256, false, true, fnt.b.a().a(ab).a(ao).a(h).a(as).a(ay).a(aD).a(false));
   private static final Function<aer, fnt> bN = ac.b(
      $$0 -> a("text_intensity_see_through", ele.t, ell.b.h, 256, false, true, fnt.b.a().a(ac).a(new fns.n($$0, false, false)).a(h).a(as).a(ay).a(aD).a(false))
   );
   private static final fnt bO = a("lightning", ele.n, ell.b.h, 256, false, true, fnt.b.a().a(ad).a(aC).a(e).a(aM).a(false));
   private static final fnt bP = a("tripwire", ele.j, ell.b.h, 262144, true, true, Q());
   private static final fnt bQ = a(
      "end_portal", ele.m, ell.b.h, 256, false, false, fnt.b.a().a(af).a(fns.i.d().a(fqe.a, false, false).a(fqe.b, false, false).a()).a(false)
   );
   private static final fnt bR = a(
      "end_gateway", ele.m, ell.b.h, 256, false, false, fnt.b.a().a(ag).a(fns.i.d().a(fqe.a, false, false).a(fqe.b, false, false).a()).a(false)
   );
   public static final fnt.a aW = a("lines", ele.o, ell.b.a, 256, fnt.b.a().a(ah).a(new fns.h(OptionalDouble.empty())).a(aH).a(h).a(aO).a(aC).a(ax).a(false));
   public static final fnt.a aX = a(
      "line_strip", ele.o, ell.b.b, 256, fnt.b.a().a(ah).a(new fns.h(OptionalDouble.empty())).a(aH).a(h).a(aO).a(aC).a(ax).a(false)
   );
   private static final Function<Double, fnt.a> bS = ac.b(
      $$0 -> a("debug_line_strip", ele.n, ell.b.d, 256, fnt.b.a().a(o).a(new fns.h(OptionalDouble.of($$0))).a(c).a(ax).a(false))
   );
   private static final fnt.a bT = a("debug_filled_box", ele.n, ell.b.f, 131072, false, true, fnt.b.a().a(o).a(aH).a(h).a(false));
   private static final fnt.a bU = a("debug_quads", ele.n, ell.b.h, 131072, false, true, fnt.b.a().a(o).a(h).a(ax).a(false));
   private static final fnt.a bV = a("debug_section_quads", ele.n, ell.b.h, 131072, false, true, fnt.b.a().a(o).a(aH).a(h).a(aw).a(false));
   private static final fnt.a bW = a("gui", ele.n, ell.b.h, 256, fnt.b.a().a(ai).a(h).a(aA).a(false));
   private static final fnt.a bX = a("gui_overlay", ele.n, ell.b.h, 256, fnt.b.a().a(aj).a(h).a(ay).a(aD).a(false));
   private static final fnt.a bY = a("gui_text_highlight", ele.n, ell.b.h, 256, fnt.b.a().a(ak).a(h).a(ay).a(aR).a(false));
   private static final fnt.a bZ = a("gui_ghost_recipe_overlay", ele.n, ell.b.h, 256, fnt.b.a().a(al).a(h).a(aB).a(aD).a(false));
   private static final ImmutableList<fnt> ca = ImmutableList.of(c(), d(), e(), f(), u());
   private final ell cb;
   private final ell.b cc;
   private final int cd;
   private final boolean ce;
   private final boolean cf;
   private final Optional<fnt> cg;

   public static fnt c() {
      return ba;
   }

   public static fnt d() {
      return bb;
   }

   public static fnt e() {
      return bc;
   }

   private static fnt.b a(fns.m $$0) {
      return fnt.b.a().a(as).a($$0).a(am).a(h).a(aK).a(true);
   }

   public static fnt f() {
      return bd;
   }

   private static fnt.b P() {
      return fnt.b.a().a(as).a(t).a(am).a(h).a(aO).a(true);
   }

   public static fnt g() {
      return be;
   }

   public static fnt h() {
      return bf;
   }

   private static fnt.a a(String $$0, aer $$1, boolean $$2) {
      fnt.b $$3 = fnt.b.a().a(v).a(new fns.n($$1, false, false)).a(c).a(ax).a(as).a(au).a(aH).a($$2 ? az : aA).a(true);
      return a($$0, ele.k, ell.b.h, 256, true, false, $$3);
   }

   public static fnt a(aer $$0) {
      return bg.apply($$0);
   }

   public static fnt b(aer $$0) {
      return a("armor_decal_cutout_no_cull", $$0, true);
   }

   public static fnt c(aer $$0) {
      return bh.apply($$0);
   }

   public static fnt d(aer $$0) {
      return bi.apply($$0);
   }

   public static fnt a(aer $$0, boolean $$1) {
      return bj.apply($$0, $$1);
   }

   public static fnt e(aer $$0) {
      return a($$0, true);
   }

   public static fnt b(aer $$0, boolean $$1) {
      return bk.apply($$0, $$1);
   }

   public static fnt f(aer $$0) {
      return b($$0, true);
   }

   public static fnt g(aer $$0) {
      return bl.apply($$0);
   }

   public static fnt h(aer $$0) {
      return bm.apply($$0);
   }

   public static fnt c(aer $$0, boolean $$1) {
      return bn.apply($$0, $$1);
   }

   public static fnt i(aer $$0) {
      return c($$0, true);
   }

   public static fnt d(aer $$0, boolean $$1) {
      return bo.apply($$0, $$1);
   }

   public static fnt j(aer $$0) {
      return d($$0, true);
   }

   public static fnt k(aer $$0) {
      return bp.apply($$0);
   }

   public static fnt e(aer $$0, boolean $$1) {
      return bq.apply($$0, $$1);
   }

   public static fnt l(aer $$0) {
      return br.apply($$0);
   }

   public static fnt m(aer $$0) {
      return bs.apply($$0);
   }

   public static fnt n(aer $$0) {
      return bt.apply($$0);
   }

   public static fnt o(aer $$0) {
      return bu.apply($$0);
   }

   public static fnt p(aer $$0) {
      return bv.apply($$0);
   }

   public static fnt a(aer $$0, float $$1, float $$2) {
      return a(
         "energy_swirl",
         ele.k,
         ell.b.h,
         256,
         false,
         true,
         fnt.b.a().a(L).a(new fns.n($$0, false, false)).a(new fns.j($$1, $$2)).a(d).a(ax).a(as).a(au).a(false)
      );
   }

   public static fnt i() {
      return bw;
   }

   public static fnt j() {
      return bx;
   }

   public static fnt q(aer $$0) {
      return fnt.a.aY.apply($$0, ax);
   }

   public static fnt k() {
      return by;
   }

   public static fnt l() {
      return bz;
   }

   public static fnt m() {
      return bA;
   }

   public static fnt n() {
      return bB;
   }

   public static fnt o() {
      return bC;
   }

   public static fnt p() {
      return bD;
   }

   public static fnt q() {
      return bE;
   }

   public static fnt r(aer $$0) {
      return bF.apply($$0);
   }

   public static fnt s(aer $$0) {
      return bG.apply($$0);
   }

   public static fnt r() {
      return bH;
   }

   public static fnt t(aer $$0) {
      return bI.apply($$0);
   }

   public static fnt u(aer $$0) {
      return bJ.apply($$0);
   }

   public static fnt v(aer $$0) {
      return bK.apply($$0);
   }

   public static fnt w(aer $$0) {
      return bL.apply($$0);
   }

   public static fnt s() {
      return bM;
   }

   public static fnt x(aer $$0) {
      return bN.apply($$0);
   }

   public static fnt t() {
      return bO;
   }

   private static fnt.b Q() {
      return fnt.b.a().a(as).a(ae).a(am).a(h).a(aM).a(true);
   }

   public static fnt u() {
      return bP;
   }

   public static fnt v() {
      return bQ;
   }

   public static fnt w() {
      return bR;
   }

   public static fnt x() {
      return aW;
   }

   public static fnt y() {
      return aX;
   }

   public static fnt a(double $$0) {
      return bS.apply($$0);
   }

   public static fnt z() {
      return bT;
   }

   public static fnt A() {
      return bU;
   }

   public static fnt B() {
      return bV;
   }

   public static fnt C() {
      return bW;
   }

   public static fnt D() {
      return bX;
   }

   public static fnt E() {
      return bY;
   }

   public static fnt F() {
      return bZ;
   }

   public fnt(String $$0, ell $$1, ell.b $$2, int $$3, boolean $$4, boolean $$5, Runnable $$6, Runnable $$7) {
      super($$0, $$6, $$7);
      this.cb = $$1;
      this.cc = $$2;
      this.cd = $$3;
      this.ce = $$4;
      this.cf = $$5;
      this.cg = Optional.of(this);
   }

   static fnt.a a(String $$0, ell $$1, ell.b $$2, int $$3, fnt.b $$4) {
      return a($$0, $$1, $$2, $$3, false, false, $$4);
   }

   private static fnt.a a(String $$0, ell $$1, ell.b $$2, int $$3, boolean $$4, boolean $$5, fnt.b $$6) {
      return new fnt.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   public void a(elb $$0, elo $$1) {
      if ($$0.j()) {
         if (this.cf) {
            $$0.a($$1);
         }

         elb.b $$2 = $$0.d();
         this.a();
         elc.a($$2);
         this.b();
      }
   }

   @Override
   public String toString() {
      return this.b;
   }

   public static List<fnt> G() {
      return ca;
   }

   public int H() {
      return this.cd;
   }

   public ell I() {
      return this.cb;
   }

   public ell.b J() {
      return this.cc;
   }

   public Optional<fnt> K() {
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

   public Optional<fnt> O() {
      return this.cg;
   }

   static final class a extends fnt {
      static final BiFunction<aer, fns.c, fnt> aY = ac.a(
         ($$0, $$1) -> fnt.a("outline", ele.r, ell.b.h, 256, fnt.b.a().a(O).a(new fns.n($$0, false, false)).a($$1).a(ay).a(aJ).a(fnt.c.b))
      );
      private final fnt.b aZ;
      private final Optional<fnt> ba;
      private final boolean bb;

      a(String $$0, ell $$1, ell.b $$2, int $$3, boolean $$4, boolean $$5, fnt.b $$6) {
         super($$0, $$1, $$2, $$3, $$4, $$5, () -> $$6.o.forEach(fns::a), () -> $$6.o.forEach(fns::b));
         this.aZ = $$6;
         this.ba = $$6.n == fnt.c.c ? $$6.a.c().map($$1x -> aY.apply($$1x, $$6.e)) : Optional.empty();
         this.bb = $$6.n == fnt.c.b;
      }

      @Override
      public Optional<fnt> K() {
         return this.ba;
      }

      @Override
      public boolean L() {
         return this.bb;
      }

      protected final fnt.b P() {
         return this.aZ;
      }

      @Override
      public String toString() {
         return "RenderType[" + this.b + ":" + this.aZ + "]";
      }
   }

   protected static final class b {
      final fns.e a;
      private final fns.m b;
      private final fns.p c;
      private final fns.d d;
      final fns.c e;
      private final fns.g f;
      private final fns.l g;
      private final fns.f h;
      private final fns.k i;
      private final fns.o j;
      private final fns.q k;
      private final fns.h l;
      private final fns.b m;
      final fnt.c n;
      final ImmutableList<fns> o;

      b(
         fns.e $$0,
         fns.m $$1,
         fns.p $$2,
         fns.d $$3,
         fns.c $$4,
         fns.g $$5,
         fns.l $$6,
         fns.f $$7,
         fns.k $$8,
         fns.o $$9,
         fns.q $$10,
         fns.h $$11,
         fns.b $$12,
         fnt.c $$13
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
         this.o = ImmutableList.of(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.m, new fns[]{this.l});
      }

      @Override
      public String toString() {
         return "CompositeState[" + this.o + ", outlineProperty=" + this.n + "]";
      }

      public static fnt.b.a a() {
         return new fnt.b.a();
      }

      public static class a {
         private fns.e a = fns.ao;
         private fns.m b = fns.i;
         private fns.p c;
         private fns.d d;
         private fns.c e;
         private fns.g f;
         private fns.l g;
         private fns.f h;
         private fns.k i;
         private fns.o j;
         private fns.q k;
         private fns.h l;
         private fns.b m;

         a() {
            this.c = fns.c;
            this.d = fns.aA;
            this.e = fns.aw;
            this.f = fns.at;
            this.g = fns.av;
            this.h = fns.aF;
            this.i = fns.aI;
            this.j = fns.ap;
            this.k = fns.aC;
            this.l = fns.aP;
            this.m = fns.aQ;
         }

         public fnt.b.a a(fns.e $$0) {
            this.a = $$0;
            return this;
         }

         public fnt.b.a a(fns.m $$0) {
            this.b = $$0;
            return this;
         }

         public fnt.b.a a(fns.p $$0) {
            this.c = $$0;
            return this;
         }

         public fnt.b.a a(fns.d $$0) {
            this.d = $$0;
            return this;
         }

         public fnt.b.a a(fns.c $$0) {
            this.e = $$0;
            return this;
         }

         public fnt.b.a a(fns.g $$0) {
            this.f = $$0;
            return this;
         }

         public fnt.b.a a(fns.l $$0) {
            this.g = $$0;
            return this;
         }

         public fnt.b.a a(fns.f $$0) {
            this.h = $$0;
            return this;
         }

         public fnt.b.a a(fns.k $$0) {
            this.i = $$0;
            return this;
         }

         public fnt.b.a a(fns.o $$0) {
            this.j = $$0;
            return this;
         }

         public fnt.b.a a(fns.q $$0) {
            this.k = $$0;
            return this;
         }

         public fnt.b.a a(fns.h $$0) {
            this.l = $$0;
            return this;
         }

         public fnt.b.a a(fns.b $$0) {
            this.m = $$0;
            return this;
         }

         public fnt.b a(boolean $$0) {
            return this.a($$0 ? fnt.c.c : fnt.c.a);
         }

         public fnt.b a(fnt.c $$0) {
            return new fnt.b(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, $$0);
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
