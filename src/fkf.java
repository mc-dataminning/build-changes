import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.function.BiFunction;
import java.util.function.Function;

public abstract class fkf extends fke {
   private static final int aY = 4;
   private static final int aZ = 1048576;
   public static final int aS = 2097152;
   public static final int aT = 262144;
   public static final int aU = 131072;
   public static final int aV = 256;
   private static final fkf ba = a("solid", eih.j, eio.b.h, 2097152, true, false, fkf.b.a().a(as).a(p).a(am).a(true));
   private static final fkf bb = a("cutout_mipped", eih.j, eio.b.h, 131072, true, false, fkf.b.a().a(as).a(q).a(am).a(true));
   private static final fkf bc = a("cutout", eih.j, eio.b.h, 131072, true, false, fkf.b.a().a(as).a(r).a(an).a(true));
   private static final fkf bd = a("translucent", eih.j, eio.b.h, 2097152, true, true, a(s));
   private static final fkf be = a("translucent_moving_block", eih.j, eio.b.h, 262144, false, true, P());
   private static final fkf bf = a("translucent_no_crumbling", eih.j, eio.b.h, 262144, false, true, a(u));
   private static final Function<acq, fkf> bg = ac.b($$0 -> {
      fkf.b $$1 = fkf.b.a().a(v).a(new fke.n($$0, false, false)).a(c).a(ax).a(as).a(au).a(aH).a(true);
      return a("armor_cutout_no_cull", eih.k, eio.b.h, 256, true, false, $$1);
   });
   private static final Function<acq, fkf> bh = ac.b($$0 -> {
      fkf.b $$1 = fkf.b.a().a(w).a(new fke.n($$0, false, false)).a(c).a(as).a(au).a(true);
      return a("entity_solid", eih.k, eio.b.h, 256, true, false, $$1);
   });
   private static final Function<acq, fkf> bi = ac.b($$0 -> {
      fkf.b $$1 = fkf.b.a().a(x).a(new fke.n($$0, false, false)).a(c).a(as).a(au).a(true);
      return a("entity_cutout", eih.k, eio.b.h, 256, true, false, $$1);
   });
   private static final BiFunction<acq, Boolean, fkf> bj = ac.a(($$0, $$1) -> {
      fkf.b $$2 = fkf.b.a().a(y).a(new fke.n($$0, false, false)).a(c).a(ax).a(as).a(au).a($$1);
      return a("entity_cutout_no_cull", eih.k, eio.b.h, 256, true, false, $$2);
   });
   private static final BiFunction<acq, Boolean, fkf> bk = ac.a(($$0, $$1) -> {
      fkf.b $$2 = fkf.b.a().a(z).a(new fke.n($$0, false, false)).a(c).a(ax).a(as).a(au).a(aH).a($$1);
      return a("entity_cutout_no_cull_z_offset", eih.k, eio.b.h, 256, true, false, $$2);
   });
   private static final Function<acq, fkf> bl = ac.b($$0 -> {
      fkf.b $$1 = fkf.b.a().a(A).a(new fke.n($$0, false, false)).a(h).a(aO).a(as).a(au).a(fke.aC).a(true);
      return a("item_entity_translucent_cull", eih.k, eio.b.h, 256, true, true, $$1);
   });
   private static final Function<acq, fkf> bm = ac.b($$0 -> {
      fkf.b $$1 = fkf.b.a().a(B).a(new fke.n($$0, false, false)).a(h).a(as).a(au).a(true);
      return a("entity_translucent_cull", eih.k, eio.b.h, 256, true, true, $$1);
   });
   private static final BiFunction<acq, Boolean, fkf> bn = ac.a(($$0, $$1) -> {
      fkf.b $$2 = fkf.b.a().a(C).a(new fke.n($$0, false, false)).a(h).a(ax).a(as).a(au).a($$1);
      return a("entity_translucent", eih.k, eio.b.h, 256, true, true, $$2);
   });
   private static final BiFunction<acq, Boolean, fkf> bo = ac.a(($$0, $$1) -> {
      fkf.b $$2 = fkf.b.a().a(D).a(new fke.n($$0, false, false)).a(h).a(ax).a(aD).a(au).a($$1);
      return a("entity_translucent_emissive", eih.k, eio.b.h, 256, true, true, $$2);
   });
   private static final Function<acq, fkf> bp = ac.b($$0 -> {
      fkf.b $$1 = fkf.b.a().a(E).a(new fke.n($$0, false, false)).a(ax).a(as).a(true);
      return a("entity_smooth_cutout", eih.k, eio.b.h, 256, $$1);
   });
   private static final BiFunction<acq, Boolean, fkf> bq = ac.a(($$0, $$1) -> {
      fkf.b $$2 = fkf.b.a().a(F).a(new fke.n($$0, false, false)).a($$1 ? h : c).a($$1 ? aD : aC).a(false);
      return a("beacon_beam", eih.j, eio.b.h, 256, false, true, $$2);
   });
   private static final Function<acq, fkf> br = ac.b($$0 -> {
      fkf.b $$1 = fkf.b.a().a(G).a(new fke.n($$0, false, false)).a(az).a(ax).a(as).a(au).a(false);
      return a("entity_decal", eih.k, eio.b.h, 256, $$1);
   });
   private static final Function<acq, fkf> bs = ac.b($$0 -> {
      fkf.b $$1 = fkf.b.a().a(H).a(new fke.n($$0, false, false)).a(h).a(ax).a(as).a(au).a(aD).a(false);
      return a("entity_no_outline", eih.k, eio.b.h, 256, false, true, $$1);
   });
   private static final Function<acq, fkf> bt = ac.b($$0 -> {
      fkf.b $$1 = fkf.b.a().a(I).a(new fke.n($$0, false, false)).a(h).a(aw).a(as).a(au).a(aD).a(aA).a(aH).a(false);
      return a("entity_shadow", eih.k, eio.b.h, 256, false, false, $$1);
   });
   private static final Function<acq, fkf> bu = ac.b($$0 -> {
      fkf.b $$1 = fkf.b.a().a(J).a(new fke.n($$0, false, false)).a(ax).a(true);
      return a("entity_alpha", eih.k, eio.b.h, 256, $$1);
   });
   private static final Function<acq, fkf> bv = ac.b($$0 -> {
      fke.n $$1 = new fke.n($$0, false, false);
      return a("eyes", eih.k, eio.b.h, 256, false, true, fkf.b.a().a(K).a($$1).a(d).a(aD).a(false));
   });
   private static final fkf bw = a("leash", eih.p, eio.b.f, 256, fkf.b.a().a(M).a(ao).a(ax).a(as).a(false));
   private static final fkf bx = a("water_mask", eih.m, eio.b.h, 256, fkf.b.a().a(N).a(ao).a(aE).a(false));
   private static final fkf by = a(
      "armor_glint", eih.q, eio.b.h, 256, fkf.b.a().a(P).a(new fke.n(fpw.a, true, false)).a(aD).a(ax).a(az).a(f).a(aq).a(aH).a(false)
   );
   private static final fkf bz = a(
      "armor_entity_glint", eih.q, eio.b.h, 256, fkf.b.a().a(Q).a(new fke.n(fpw.a, true, false)).a(aD).a(ax).a(az).a(f).a(ar).a(aH).a(false)
   );
   private static final fkf bA = a(
      "glint_translucent", eih.q, eio.b.h, 256, fkf.b.a().a(R).a(new fke.n(fpw.b, true, false)).a(aD).a(ax).a(az).a(f).a(aq).a(aO).a(false)
   );
   private static final fkf bB = a("glint", eih.q, eio.b.h, 256, fkf.b.a().a(S).a(new fke.n(fpw.b, true, false)).a(aD).a(ax).a(az).a(f).a(aq).a(false));
   private static final fkf bC = a("glint_direct", eih.q, eio.b.h, 256, fkf.b.a().a(T).a(new fke.n(fpw.b, true, false)).a(aD).a(ax).a(az).a(f).a(aq).a(false));
   private static final fkf bD = a(
      "entity_glint", eih.q, eio.b.h, 256, fkf.b.a().a(U).a(new fke.n(fpw.a, true, false)).a(aD).a(ax).a(az).a(f).a(aO).a(ar).a(false)
   );
   private static final fkf bE = a(
      "entity_glint_direct", eih.q, eio.b.h, 256, fkf.b.a().a(V).a(new fke.n(fpw.a, true, false)).a(aD).a(ax).a(az).a(f).a(ar).a(false)
   );
   private static final Function<acq, fkf> bF = ac.b($$0 -> {
      fke.n $$1 = new fke.n($$0, false, false);
      return a("crumbling", eih.j, eio.b.h, 256, false, true, fkf.b.a().a(W).a($$1).a(g).a(aD).a(aG).a(false));
   });
   private static final Function<acq, fkf> bG = ac.b(
      $$0 -> a("text", eih.t, eio.b.h, 256, false, true, fkf.b.a().a(X).a(new fke.n($$0, false, false)).a(h).a(as).a(false))
   );
   private static final fkf bH = a("text_background", eih.p, eio.b.h, 256, false, true, fkf.b.a().a(Y).a(ao).a(h).a(as).a(false));
   private static final Function<acq, fkf> bI = ac.b(
      $$0 -> a("text_intensity", eih.t, eio.b.h, 256, false, true, fkf.b.a().a(Z).a(new fke.n($$0, false, false)).a(h).a(as).a(false))
   );
   private static final Function<acq, fkf> bJ = ac.b(
      $$0 -> a("text_polygon_offset", eih.t, eio.b.h, 256, false, true, fkf.b.a().a(X).a(new fke.n($$0, false, false)).a(h).a(as).a(aG).a(false))
   );
   private static final Function<acq, fkf> bK = ac.b(
      $$0 -> a("text_intensity_polygon_offset", eih.t, eio.b.h, 256, false, true, fkf.b.a().a(Z).a(new fke.n($$0, false, false)).a(h).a(as).a(aG).a(false))
   );
   private static final Function<acq, fkf> bL = ac.b(
      $$0 -> a("text_see_through", eih.t, eio.b.h, 256, false, true, fkf.b.a().a(aa).a(new fke.n($$0, false, false)).a(h).a(as).a(ay).a(aD).a(false))
   );
   private static final fkf bM = a("text_background_see_through", eih.p, eio.b.h, 256, false, true, fkf.b.a().a(ab).a(ao).a(h).a(as).a(ay).a(aD).a(false));
   private static final Function<acq, fkf> bN = ac.b(
      $$0 -> a("text_intensity_see_through", eih.t, eio.b.h, 256, false, true, fkf.b.a().a(ac).a(new fke.n($$0, false, false)).a(h).a(as).a(ay).a(aD).a(false))
   );
   private static final fkf bO = a("lightning", eih.n, eio.b.h, 256, false, true, fkf.b.a().a(ad).a(aC).a(e).a(aM).a(false));
   private static final fkf bP = a("tripwire", eih.j, eio.b.h, 262144, true, true, Q());
   private static final fkf bQ = a(
      "end_portal", eih.m, eio.b.h, 256, false, false, fkf.b.a().a(af).a(fke.i.d().a(fmn.a, false, false).a(fmn.b, false, false).a()).a(false)
   );
   private static final fkf bR = a(
      "end_gateway", eih.m, eio.b.h, 256, false, false, fkf.b.a().a(ag).a(fke.i.d().a(fmn.a, false, false).a(fmn.b, false, false).a()).a(false)
   );
   public static final fkf.a aW = a("lines", eih.o, eio.b.a, 256, fkf.b.a().a(ah).a(new fke.h(OptionalDouble.empty())).a(aH).a(h).a(aO).a(aC).a(ax).a(false));
   public static final fkf.a aX = a(
      "line_strip", eih.o, eio.b.b, 256, fkf.b.a().a(ah).a(new fke.h(OptionalDouble.empty())).a(aH).a(h).a(aO).a(aC).a(ax).a(false)
   );
   private static final Function<Double, fkf.a> bS = ac.b(
      $$0 -> a("debug_line_strip", eih.n, eio.b.d, 256, fkf.b.a().a(o).a(new fke.h(OptionalDouble.of($$0))).a(c).a(ax).a(false))
   );
   private static final fkf.a bT = a("debug_filled_box", eih.n, eio.b.f, 131072, false, true, fkf.b.a().a(o).a(aH).a(h).a(false));
   private static final fkf.a bU = a("debug_quads", eih.n, eio.b.h, 131072, false, true, fkf.b.a().a(o).a(h).a(ax).a(false));
   private static final fkf.a bV = a("debug_section_quads", eih.n, eio.b.h, 131072, false, true, fkf.b.a().a(o).a(aH).a(h).a(aw).a(false));
   private static final fkf.a bW = a("gui", eih.n, eio.b.h, 256, fkf.b.a().a(ai).a(h).a(aA).a(false));
   private static final fkf.a bX = a("gui_overlay", eih.n, eio.b.h, 256, fkf.b.a().a(aj).a(h).a(ay).a(aD).a(false));
   private static final fkf.a bY = a("gui_text_highlight", eih.n, eio.b.h, 256, fkf.b.a().a(ak).a(h).a(ay).a(aR).a(false));
   private static final fkf.a bZ = a("gui_ghost_recipe_overlay", eih.n, eio.b.h, 256, fkf.b.a().a(al).a(h).a(aB).a(aD).a(false));
   private static final ImmutableList<fkf> ca = ImmutableList.of(c(), d(), e(), f(), u());
   private final eio cb;
   private final eio.b cc;
   private final int cd;
   private final boolean ce;
   private final boolean cf;
   private final Optional<fkf> cg;

   public static fkf c() {
      return ba;
   }

   public static fkf d() {
      return bb;
   }

   public static fkf e() {
      return bc;
   }

   private static fkf.b a(fke.m $$0) {
      return fkf.b.a().a(as).a($$0).a(am).a(h).a(aK).a(true);
   }

   public static fkf f() {
      return bd;
   }

   private static fkf.b P() {
      return fkf.b.a().a(as).a(t).a(am).a(h).a(aO).a(true);
   }

   public static fkf g() {
      return be;
   }

   public static fkf h() {
      return bf;
   }

   public static fkf a(acq $$0) {
      return bg.apply($$0);
   }

   public static fkf b(acq $$0) {
      return bh.apply($$0);
   }

   public static fkf c(acq $$0) {
      return bi.apply($$0);
   }

   public static fkf a(acq $$0, boolean $$1) {
      return bj.apply($$0, $$1);
   }

   public static fkf d(acq $$0) {
      return a($$0, true);
   }

   public static fkf b(acq $$0, boolean $$1) {
      return bk.apply($$0, $$1);
   }

   public static fkf e(acq $$0) {
      return b($$0, true);
   }

   public static fkf f(acq $$0) {
      return bl.apply($$0);
   }

   public static fkf g(acq $$0) {
      return bm.apply($$0);
   }

   public static fkf c(acq $$0, boolean $$1) {
      return bn.apply($$0, $$1);
   }

   public static fkf h(acq $$0) {
      return c($$0, true);
   }

   public static fkf d(acq $$0, boolean $$1) {
      return bo.apply($$0, $$1);
   }

   public static fkf i(acq $$0) {
      return d($$0, true);
   }

   public static fkf j(acq $$0) {
      return bp.apply($$0);
   }

   public static fkf e(acq $$0, boolean $$1) {
      return bq.apply($$0, $$1);
   }

   public static fkf k(acq $$0) {
      return br.apply($$0);
   }

   public static fkf l(acq $$0) {
      return bs.apply($$0);
   }

   public static fkf m(acq $$0) {
      return bt.apply($$0);
   }

   public static fkf n(acq $$0) {
      return bu.apply($$0);
   }

   public static fkf o(acq $$0) {
      return bv.apply($$0);
   }

   public static fkf a(acq $$0, float $$1, float $$2) {
      return a(
         "energy_swirl",
         eih.k,
         eio.b.h,
         256,
         false,
         true,
         fkf.b.a().a(L).a(new fke.n($$0, false, false)).a(new fke.j($$1, $$2)).a(d).a(ax).a(as).a(au).a(false)
      );
   }

   public static fkf i() {
      return bw;
   }

   public static fkf j() {
      return bx;
   }

   public static fkf p(acq $$0) {
      return fkf.a.aY.apply($$0, ax);
   }

   public static fkf k() {
      return by;
   }

   public static fkf l() {
      return bz;
   }

   public static fkf m() {
      return bA;
   }

   public static fkf n() {
      return bB;
   }

   public static fkf o() {
      return bC;
   }

   public static fkf p() {
      return bD;
   }

   public static fkf q() {
      return bE;
   }

   public static fkf q(acq $$0) {
      return bF.apply($$0);
   }

   public static fkf r(acq $$0) {
      return bG.apply($$0);
   }

   public static fkf r() {
      return bH;
   }

   public static fkf s(acq $$0) {
      return bI.apply($$0);
   }

   public static fkf t(acq $$0) {
      return bJ.apply($$0);
   }

   public static fkf u(acq $$0) {
      return bK.apply($$0);
   }

   public static fkf v(acq $$0) {
      return bL.apply($$0);
   }

   public static fkf s() {
      return bM;
   }

   public static fkf w(acq $$0) {
      return bN.apply($$0);
   }

   public static fkf t() {
      return bO;
   }

   private static fkf.b Q() {
      return fkf.b.a().a(as).a(ae).a(am).a(h).a(aM).a(true);
   }

   public static fkf u() {
      return bP;
   }

   public static fkf v() {
      return bQ;
   }

   public static fkf w() {
      return bR;
   }

   public static fkf x() {
      return aW;
   }

   public static fkf y() {
      return aX;
   }

   public static fkf a(double $$0) {
      return bS.apply($$0);
   }

   public static fkf z() {
      return bT;
   }

   public static fkf A() {
      return bU;
   }

   public static fkf B() {
      return bV;
   }

   public static fkf C() {
      return bW;
   }

   public static fkf D() {
      return bX;
   }

   public static fkf E() {
      return bY;
   }

   public static fkf F() {
      return bZ;
   }

   public fkf(String $$0, eio $$1, eio.b $$2, int $$3, boolean $$4, boolean $$5, Runnable $$6, Runnable $$7) {
      super($$0, $$6, $$7);
      this.cb = $$1;
      this.cc = $$2;
      this.cd = $$3;
      this.ce = $$4;
      this.cf = $$5;
      this.cg = Optional.of(this);
   }

   static fkf.a a(String $$0, eio $$1, eio.b $$2, int $$3, fkf.b $$4) {
      return a($$0, $$1, $$2, $$3, false, false, $$4);
   }

   private static fkf.a a(String $$0, eio $$1, eio.b $$2, int $$3, boolean $$4, boolean $$5, fkf.b $$6) {
      return new fkf.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   public void a(eie $$0, eir $$1) {
      if ($$0.j()) {
         if (this.cf) {
            $$0.a($$1);
         }

         eie.b $$2 = $$0.d();
         this.a();
         eif.a($$2);
         this.b();
      }
   }

   @Override
   public String toString() {
      return this.b;
   }

   public static List<fkf> G() {
      return ca;
   }

   public int H() {
      return this.cd;
   }

   public eio I() {
      return this.cb;
   }

   public eio.b J() {
      return this.cc;
   }

   public Optional<fkf> K() {
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

   public Optional<fkf> O() {
      return this.cg;
   }

   static final class a extends fkf {
      static final BiFunction<acq, fke.c, fkf> aY = ac.a(
         ($$0, $$1) -> fkf.a("outline", eih.r, eio.b.h, 256, fkf.b.a().a(O).a(new fke.n($$0, false, false)).a($$1).a(ay).a(aJ).a(fkf.c.b))
      );
      private final fkf.b aZ;
      private final Optional<fkf> ba;
      private final boolean bb;

      a(String $$0, eio $$1, eio.b $$2, int $$3, boolean $$4, boolean $$5, fkf.b $$6) {
         super($$0, $$1, $$2, $$3, $$4, $$5, () -> $$6.o.forEach(fke::a), () -> $$6.o.forEach(fke::b));
         this.aZ = $$6;
         this.ba = $$6.n == fkf.c.c ? $$6.a.c().map($$1x -> aY.apply($$1x, $$6.e)) : Optional.empty();
         this.bb = $$6.n == fkf.c.b;
      }

      @Override
      public Optional<fkf> K() {
         return this.ba;
      }

      @Override
      public boolean L() {
         return this.bb;
      }

      protected final fkf.b P() {
         return this.aZ;
      }

      @Override
      public String toString() {
         return "RenderType[" + this.b + ":" + this.aZ + "]";
      }
   }

   protected static final class b {
      final fke.e a;
      private final fke.m b;
      private final fke.p c;
      private final fke.d d;
      final fke.c e;
      private final fke.g f;
      private final fke.l g;
      private final fke.f h;
      private final fke.k i;
      private final fke.o j;
      private final fke.q k;
      private final fke.h l;
      private final fke.b m;
      final fkf.c n;
      final ImmutableList<fke> o;

      b(
         fke.e $$0,
         fke.m $$1,
         fke.p $$2,
         fke.d $$3,
         fke.c $$4,
         fke.g $$5,
         fke.l $$6,
         fke.f $$7,
         fke.k $$8,
         fke.o $$9,
         fke.q $$10,
         fke.h $$11,
         fke.b $$12,
         fkf.c $$13
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
         this.o = ImmutableList.of(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.m, new fke[]{this.l});
      }

      @Override
      public String toString() {
         return "CompositeState[" + this.o + ", outlineProperty=" + this.n + "]";
      }

      public static fkf.b.a a() {
         return new fkf.b.a();
      }

      public static class a {
         private fke.e a = fke.ao;
         private fke.m b = fke.i;
         private fke.p c;
         private fke.d d;
         private fke.c e;
         private fke.g f;
         private fke.l g;
         private fke.f h;
         private fke.k i;
         private fke.o j;
         private fke.q k;
         private fke.h l;
         private fke.b m;

         a() {
            this.c = fke.c;
            this.d = fke.aA;
            this.e = fke.aw;
            this.f = fke.at;
            this.g = fke.av;
            this.h = fke.aF;
            this.i = fke.aI;
            this.j = fke.ap;
            this.k = fke.aC;
            this.l = fke.aP;
            this.m = fke.aQ;
         }

         public fkf.b.a a(fke.e $$0) {
            this.a = $$0;
            return this;
         }

         public fkf.b.a a(fke.m $$0) {
            this.b = $$0;
            return this;
         }

         public fkf.b.a a(fke.p $$0) {
            this.c = $$0;
            return this;
         }

         public fkf.b.a a(fke.d $$0) {
            this.d = $$0;
            return this;
         }

         public fkf.b.a a(fke.c $$0) {
            this.e = $$0;
            return this;
         }

         public fkf.b.a a(fke.g $$0) {
            this.f = $$0;
            return this;
         }

         public fkf.b.a a(fke.l $$0) {
            this.g = $$0;
            return this;
         }

         public fkf.b.a a(fke.f $$0) {
            this.h = $$0;
            return this;
         }

         public fkf.b.a a(fke.k $$0) {
            this.i = $$0;
            return this;
         }

         public fkf.b.a a(fke.o $$0) {
            this.j = $$0;
            return this;
         }

         public fkf.b.a a(fke.q $$0) {
            this.k = $$0;
            return this;
         }

         public fkf.b.a a(fke.h $$0) {
            this.l = $$0;
            return this;
         }

         public fkf.b.a a(fke.b $$0) {
            this.m = $$0;
            return this;
         }

         public fkf.b a(boolean $$0) {
            return this.a($$0 ? fkf.c.c : fkf.c.a);
         }

         public fkf.b a(fkf.c $$0) {
            return new fkf.b(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, $$0);
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
