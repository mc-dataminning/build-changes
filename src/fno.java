import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.function.BiFunction;
import java.util.function.Function;

public abstract class fno extends fnn {
   private static final int aY = 4;
   private static final int aZ = 1048576;
   public static final int aS = 2097152;
   public static final int aT = 262144;
   public static final int aU = 131072;
   public static final int aV = 256;
   private static final fno ba = a("solid", elf.j, elm.b.h, 2097152, true, false, fno.b.a().a(as).a(p).a(am).a(true));
   private static final fno bb = a("cutout_mipped", elf.j, elm.b.h, 131072, true, false, fno.b.a().a(as).a(q).a(am).a(true));
   private static final fno bc = a("cutout", elf.j, elm.b.h, 131072, true, false, fno.b.a().a(as).a(r).a(an).a(true));
   private static final fno bd = a("translucent", elf.j, elm.b.h, 2097152, true, true, a(s));
   private static final fno be = a("translucent_moving_block", elf.j, elm.b.h, 262144, false, true, P());
   private static final fno bf = a("translucent_no_crumbling", elf.j, elm.b.h, 262144, false, true, a(u));
   private static final Function<aep, fno> bg = ac.b($$0 -> {
      fno.b $$1 = fno.b.a().a(v).a(new fnn.n($$0, false, false)).a(c).a(ax).a(as).a(au).a(aH).a(true);
      return a("armor_cutout_no_cull", elf.k, elm.b.h, 256, true, false, $$1);
   });
   private static final Function<aep, fno> bh = ac.b($$0 -> {
      fno.b $$1 = fno.b.a().a(w).a(new fnn.n($$0, false, false)).a(c).a(as).a(au).a(true);
      return a("entity_solid", elf.k, elm.b.h, 256, true, false, $$1);
   });
   private static final Function<aep, fno> bi = ac.b($$0 -> {
      fno.b $$1 = fno.b.a().a(x).a(new fnn.n($$0, false, false)).a(c).a(as).a(au).a(true);
      return a("entity_cutout", elf.k, elm.b.h, 256, true, false, $$1);
   });
   private static final BiFunction<aep, Boolean, fno> bj = ac.a(($$0, $$1) -> {
      fno.b $$2 = fno.b.a().a(y).a(new fnn.n($$0, false, false)).a(c).a(ax).a(as).a(au).a($$1);
      return a("entity_cutout_no_cull", elf.k, elm.b.h, 256, true, false, $$2);
   });
   private static final BiFunction<aep, Boolean, fno> bk = ac.a(($$0, $$1) -> {
      fno.b $$2 = fno.b.a().a(z).a(new fnn.n($$0, false, false)).a(c).a(ax).a(as).a(au).a(aH).a($$1);
      return a("entity_cutout_no_cull_z_offset", elf.k, elm.b.h, 256, true, false, $$2);
   });
   private static final Function<aep, fno> bl = ac.b($$0 -> {
      fno.b $$1 = fno.b.a().a(A).a(new fnn.n($$0, false, false)).a(h).a(aO).a(as).a(au).a(fnn.aC).a(true);
      return a("item_entity_translucent_cull", elf.k, elm.b.h, 256, true, true, $$1);
   });
   private static final Function<aep, fno> bm = ac.b($$0 -> {
      fno.b $$1 = fno.b.a().a(B).a(new fnn.n($$0, false, false)).a(h).a(as).a(au).a(true);
      return a("entity_translucent_cull", elf.k, elm.b.h, 256, true, true, $$1);
   });
   private static final BiFunction<aep, Boolean, fno> bn = ac.a(($$0, $$1) -> {
      fno.b $$2 = fno.b.a().a(C).a(new fnn.n($$0, false, false)).a(h).a(ax).a(as).a(au).a($$1);
      return a("entity_translucent", elf.k, elm.b.h, 256, true, true, $$2);
   });
   private static final BiFunction<aep, Boolean, fno> bo = ac.a(($$0, $$1) -> {
      fno.b $$2 = fno.b.a().a(D).a(new fnn.n($$0, false, false)).a(h).a(ax).a(aD).a(au).a($$1);
      return a("entity_translucent_emissive", elf.k, elm.b.h, 256, true, true, $$2);
   });
   private static final Function<aep, fno> bp = ac.b($$0 -> {
      fno.b $$1 = fno.b.a().a(E).a(new fnn.n($$0, false, false)).a(ax).a(as).a(true);
      return a("entity_smooth_cutout", elf.k, elm.b.h, 256, $$1);
   });
   private static final BiFunction<aep, Boolean, fno> bq = ac.a(($$0, $$1) -> {
      fno.b $$2 = fno.b.a().a(F).a(new fnn.n($$0, false, false)).a($$1 ? h : c).a($$1 ? aD : aC).a(false);
      return a("beacon_beam", elf.j, elm.b.h, 256, false, true, $$2);
   });
   private static final Function<aep, fno> br = ac.b($$0 -> {
      fno.b $$1 = fno.b.a().a(G).a(new fnn.n($$0, false, false)).a(az).a(ax).a(as).a(au).a(false);
      return a("entity_decal", elf.k, elm.b.h, 256, $$1);
   });
   private static final Function<aep, fno> bs = ac.b($$0 -> {
      fno.b $$1 = fno.b.a().a(H).a(new fnn.n($$0, false, false)).a(h).a(ax).a(as).a(au).a(aD).a(false);
      return a("entity_no_outline", elf.k, elm.b.h, 256, false, true, $$1);
   });
   private static final Function<aep, fno> bt = ac.b($$0 -> {
      fno.b $$1 = fno.b.a().a(I).a(new fnn.n($$0, false, false)).a(h).a(aw).a(as).a(au).a(aD).a(aA).a(aH).a(false);
      return a("entity_shadow", elf.k, elm.b.h, 256, false, false, $$1);
   });
   private static final Function<aep, fno> bu = ac.b($$0 -> {
      fno.b $$1 = fno.b.a().a(J).a(new fnn.n($$0, false, false)).a(ax).a(true);
      return a("entity_alpha", elf.k, elm.b.h, 256, $$1);
   });
   private static final Function<aep, fno> bv = ac.b($$0 -> {
      fnn.n $$1 = new fnn.n($$0, false, false);
      return a("eyes", elf.k, elm.b.h, 256, false, true, fno.b.a().a(K).a($$1).a(d).a(aD).a(false));
   });
   private static final fno bw = a("leash", elf.p, elm.b.f, 256, fno.b.a().a(M).a(ao).a(ax).a(as).a(false));
   private static final fno bx = a("water_mask", elf.m, elm.b.h, 256, fno.b.a().a(N).a(ao).a(aE).a(false));
   private static final fno by = a(
      "armor_glint", elf.q, elm.b.h, 256, fno.b.a().a(P).a(new fnn.n(fth.a, true, false)).a(aD).a(ax).a(az).a(f).a(aq).a(aH).a(false)
   );
   private static final fno bz = a(
      "armor_entity_glint", elf.q, elm.b.h, 256, fno.b.a().a(Q).a(new fnn.n(fth.a, true, false)).a(aD).a(ax).a(az).a(f).a(ar).a(aH).a(false)
   );
   private static final fno bA = a(
      "glint_translucent", elf.q, elm.b.h, 256, fno.b.a().a(R).a(new fnn.n(fth.b, true, false)).a(aD).a(ax).a(az).a(f).a(aq).a(aO).a(false)
   );
   private static final fno bB = a("glint", elf.q, elm.b.h, 256, fno.b.a().a(S).a(new fnn.n(fth.b, true, false)).a(aD).a(ax).a(az).a(f).a(aq).a(false));
   private static final fno bC = a("glint_direct", elf.q, elm.b.h, 256, fno.b.a().a(T).a(new fnn.n(fth.b, true, false)).a(aD).a(ax).a(az).a(f).a(aq).a(false));
   private static final fno bD = a(
      "entity_glint", elf.q, elm.b.h, 256, fno.b.a().a(U).a(new fnn.n(fth.a, true, false)).a(aD).a(ax).a(az).a(f).a(aO).a(ar).a(false)
   );
   private static final fno bE = a(
      "entity_glint_direct", elf.q, elm.b.h, 256, fno.b.a().a(V).a(new fnn.n(fth.a, true, false)).a(aD).a(ax).a(az).a(f).a(ar).a(false)
   );
   private static final Function<aep, fno> bF = ac.b($$0 -> {
      fnn.n $$1 = new fnn.n($$0, false, false);
      return a("crumbling", elf.j, elm.b.h, 256, false, true, fno.b.a().a(W).a($$1).a(g).a(aD).a(aG).a(false));
   });
   private static final Function<aep, fno> bG = ac.b(
      $$0 -> a("text", elf.t, elm.b.h, 256, false, true, fno.b.a().a(X).a(new fnn.n($$0, false, false)).a(h).a(as).a(false))
   );
   private static final fno bH = a("text_background", elf.p, elm.b.h, 256, false, true, fno.b.a().a(Y).a(ao).a(h).a(as).a(false));
   private static final Function<aep, fno> bI = ac.b(
      $$0 -> a("text_intensity", elf.t, elm.b.h, 256, false, true, fno.b.a().a(Z).a(new fnn.n($$0, false, false)).a(h).a(as).a(false))
   );
   private static final Function<aep, fno> bJ = ac.b(
      $$0 -> a("text_polygon_offset", elf.t, elm.b.h, 256, false, true, fno.b.a().a(X).a(new fnn.n($$0, false, false)).a(h).a(as).a(aG).a(false))
   );
   private static final Function<aep, fno> bK = ac.b(
      $$0 -> a("text_intensity_polygon_offset", elf.t, elm.b.h, 256, false, true, fno.b.a().a(Z).a(new fnn.n($$0, false, false)).a(h).a(as).a(aG).a(false))
   );
   private static final Function<aep, fno> bL = ac.b(
      $$0 -> a("text_see_through", elf.t, elm.b.h, 256, false, true, fno.b.a().a(aa).a(new fnn.n($$0, false, false)).a(h).a(as).a(ay).a(aD).a(false))
   );
   private static final fno bM = a("text_background_see_through", elf.p, elm.b.h, 256, false, true, fno.b.a().a(ab).a(ao).a(h).a(as).a(ay).a(aD).a(false));
   private static final Function<aep, fno> bN = ac.b(
      $$0 -> a("text_intensity_see_through", elf.t, elm.b.h, 256, false, true, fno.b.a().a(ac).a(new fnn.n($$0, false, false)).a(h).a(as).a(ay).a(aD).a(false))
   );
   private static final fno bO = a("lightning", elf.n, elm.b.h, 256, false, true, fno.b.a().a(ad).a(aC).a(e).a(aM).a(false));
   private static final fno bP = a("tripwire", elf.j, elm.b.h, 262144, true, true, Q());
   private static final fno bQ = a(
      "end_portal", elf.m, elm.b.h, 256, false, false, fno.b.a().a(af).a(fnn.i.d().a(fpz.a, false, false).a(fpz.b, false, false).a()).a(false)
   );
   private static final fno bR = a(
      "end_gateway", elf.m, elm.b.h, 256, false, false, fno.b.a().a(ag).a(fnn.i.d().a(fpz.a, false, false).a(fpz.b, false, false).a()).a(false)
   );
   public static final fno.a aW = a("lines", elf.o, elm.b.a, 256, fno.b.a().a(ah).a(new fnn.h(OptionalDouble.empty())).a(aH).a(h).a(aO).a(aC).a(ax).a(false));
   public static final fno.a aX = a(
      "line_strip", elf.o, elm.b.b, 256, fno.b.a().a(ah).a(new fnn.h(OptionalDouble.empty())).a(aH).a(h).a(aO).a(aC).a(ax).a(false)
   );
   private static final Function<Double, fno.a> bS = ac.b(
      $$0 -> a("debug_line_strip", elf.n, elm.b.d, 256, fno.b.a().a(o).a(new fnn.h(OptionalDouble.of($$0))).a(c).a(ax).a(false))
   );
   private static final fno.a bT = a("debug_filled_box", elf.n, elm.b.f, 131072, false, true, fno.b.a().a(o).a(aH).a(h).a(false));
   private static final fno.a bU = a("debug_quads", elf.n, elm.b.h, 131072, false, true, fno.b.a().a(o).a(h).a(ax).a(false));
   private static final fno.a bV = a("debug_section_quads", elf.n, elm.b.h, 131072, false, true, fno.b.a().a(o).a(aH).a(h).a(aw).a(false));
   private static final fno.a bW = a("gui", elf.n, elm.b.h, 256, fno.b.a().a(ai).a(h).a(aA).a(false));
   private static final fno.a bX = a("gui_overlay", elf.n, elm.b.h, 256, fno.b.a().a(aj).a(h).a(ay).a(aD).a(false));
   private static final fno.a bY = a("gui_text_highlight", elf.n, elm.b.h, 256, fno.b.a().a(ak).a(h).a(ay).a(aR).a(false));
   private static final fno.a bZ = a("gui_ghost_recipe_overlay", elf.n, elm.b.h, 256, fno.b.a().a(al).a(h).a(aB).a(aD).a(false));
   private static final ImmutableList<fno> ca = ImmutableList.of(c(), d(), e(), f(), u());
   private final elm cb;
   private final elm.b cc;
   private final int cd;
   private final boolean ce;
   private final boolean cf;
   private final Optional<fno> cg;

   public static fno c() {
      return ba;
   }

   public static fno d() {
      return bb;
   }

   public static fno e() {
      return bc;
   }

   private static fno.b a(fnn.m $$0) {
      return fno.b.a().a(as).a($$0).a(am).a(h).a(aK).a(true);
   }

   public static fno f() {
      return bd;
   }

   private static fno.b P() {
      return fno.b.a().a(as).a(t).a(am).a(h).a(aO).a(true);
   }

   public static fno g() {
      return be;
   }

   public static fno h() {
      return bf;
   }

   public static fno a(aep $$0) {
      return bg.apply($$0);
   }

   public static fno b(aep $$0) {
      return bh.apply($$0);
   }

   public static fno c(aep $$0) {
      return bi.apply($$0);
   }

   public static fno a(aep $$0, boolean $$1) {
      return bj.apply($$0, $$1);
   }

   public static fno d(aep $$0) {
      return a($$0, true);
   }

   public static fno b(aep $$0, boolean $$1) {
      return bk.apply($$0, $$1);
   }

   public static fno e(aep $$0) {
      return b($$0, true);
   }

   public static fno f(aep $$0) {
      return bl.apply($$0);
   }

   public static fno g(aep $$0) {
      return bm.apply($$0);
   }

   public static fno c(aep $$0, boolean $$1) {
      return bn.apply($$0, $$1);
   }

   public static fno h(aep $$0) {
      return c($$0, true);
   }

   public static fno d(aep $$0, boolean $$1) {
      return bo.apply($$0, $$1);
   }

   public static fno i(aep $$0) {
      return d($$0, true);
   }

   public static fno j(aep $$0) {
      return bp.apply($$0);
   }

   public static fno e(aep $$0, boolean $$1) {
      return bq.apply($$0, $$1);
   }

   public static fno k(aep $$0) {
      return br.apply($$0);
   }

   public static fno l(aep $$0) {
      return bs.apply($$0);
   }

   public static fno m(aep $$0) {
      return bt.apply($$0);
   }

   public static fno n(aep $$0) {
      return bu.apply($$0);
   }

   public static fno o(aep $$0) {
      return bv.apply($$0);
   }

   public static fno a(aep $$0, float $$1, float $$2) {
      return a(
         "energy_swirl",
         elf.k,
         elm.b.h,
         256,
         false,
         true,
         fno.b.a().a(L).a(new fnn.n($$0, false, false)).a(new fnn.j($$1, $$2)).a(d).a(ax).a(as).a(au).a(false)
      );
   }

   public static fno i() {
      return bw;
   }

   public static fno j() {
      return bx;
   }

   public static fno p(aep $$0) {
      return fno.a.aY.apply($$0, ax);
   }

   public static fno k() {
      return by;
   }

   public static fno l() {
      return bz;
   }

   public static fno m() {
      return bA;
   }

   public static fno n() {
      return bB;
   }

   public static fno o() {
      return bC;
   }

   public static fno p() {
      return bD;
   }

   public static fno q() {
      return bE;
   }

   public static fno q(aep $$0) {
      return bF.apply($$0);
   }

   public static fno r(aep $$0) {
      return bG.apply($$0);
   }

   public static fno r() {
      return bH;
   }

   public static fno s(aep $$0) {
      return bI.apply($$0);
   }

   public static fno t(aep $$0) {
      return bJ.apply($$0);
   }

   public static fno u(aep $$0) {
      return bK.apply($$0);
   }

   public static fno v(aep $$0) {
      return bL.apply($$0);
   }

   public static fno s() {
      return bM;
   }

   public static fno w(aep $$0) {
      return bN.apply($$0);
   }

   public static fno t() {
      return bO;
   }

   private static fno.b Q() {
      return fno.b.a().a(as).a(ae).a(am).a(h).a(aM).a(true);
   }

   public static fno u() {
      return bP;
   }

   public static fno v() {
      return bQ;
   }

   public static fno w() {
      return bR;
   }

   public static fno x() {
      return aW;
   }

   public static fno y() {
      return aX;
   }

   public static fno a(double $$0) {
      return bS.apply($$0);
   }

   public static fno z() {
      return bT;
   }

   public static fno A() {
      return bU;
   }

   public static fno B() {
      return bV;
   }

   public static fno C() {
      return bW;
   }

   public static fno D() {
      return bX;
   }

   public static fno E() {
      return bY;
   }

   public static fno F() {
      return bZ;
   }

   public fno(String $$0, elm $$1, elm.b $$2, int $$3, boolean $$4, boolean $$5, Runnable $$6, Runnable $$7) {
      super($$0, $$6, $$7);
      this.cb = $$1;
      this.cc = $$2;
      this.cd = $$3;
      this.ce = $$4;
      this.cf = $$5;
      this.cg = Optional.of(this);
   }

   static fno.a a(String $$0, elm $$1, elm.b $$2, int $$3, fno.b $$4) {
      return a($$0, $$1, $$2, $$3, false, false, $$4);
   }

   private static fno.a a(String $$0, elm $$1, elm.b $$2, int $$3, boolean $$4, boolean $$5, fno.b $$6) {
      return new fno.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   public void a(elc $$0, elp $$1) {
      if ($$0.j()) {
         if (this.cf) {
            $$0.a($$1);
         }

         elc.b $$2 = $$0.d();
         this.a();
         eld.a($$2);
         this.b();
      }
   }

   @Override
   public String toString() {
      return this.b;
   }

   public static List<fno> G() {
      return ca;
   }

   public int H() {
      return this.cd;
   }

   public elm I() {
      return this.cb;
   }

   public elm.b J() {
      return this.cc;
   }

   public Optional<fno> K() {
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

   public Optional<fno> O() {
      return this.cg;
   }

   static final class a extends fno {
      static final BiFunction<aep, fnn.c, fno> aY = ac.a(
         ($$0, $$1) -> fno.a("outline", elf.r, elm.b.h, 256, fno.b.a().a(O).a(new fnn.n($$0, false, false)).a($$1).a(ay).a(aJ).a(fno.c.b))
      );
      private final fno.b aZ;
      private final Optional<fno> ba;
      private final boolean bb;

      a(String $$0, elm $$1, elm.b $$2, int $$3, boolean $$4, boolean $$5, fno.b $$6) {
         super($$0, $$1, $$2, $$3, $$4, $$5, () -> $$6.o.forEach(fnn::a), () -> $$6.o.forEach(fnn::b));
         this.aZ = $$6;
         this.ba = $$6.n == fno.c.c ? $$6.a.c().map($$1x -> aY.apply($$1x, $$6.e)) : Optional.empty();
         this.bb = $$6.n == fno.c.b;
      }

      @Override
      public Optional<fno> K() {
         return this.ba;
      }

      @Override
      public boolean L() {
         return this.bb;
      }

      protected final fno.b P() {
         return this.aZ;
      }

      @Override
      public String toString() {
         return "RenderType[" + this.b + ":" + this.aZ + "]";
      }
   }

   protected static final class b {
      final fnn.e a;
      private final fnn.m b;
      private final fnn.p c;
      private final fnn.d d;
      final fnn.c e;
      private final fnn.g f;
      private final fnn.l g;
      private final fnn.f h;
      private final fnn.k i;
      private final fnn.o j;
      private final fnn.q k;
      private final fnn.h l;
      private final fnn.b m;
      final fno.c n;
      final ImmutableList<fnn> o;

      b(
         fnn.e $$0,
         fnn.m $$1,
         fnn.p $$2,
         fnn.d $$3,
         fnn.c $$4,
         fnn.g $$5,
         fnn.l $$6,
         fnn.f $$7,
         fnn.k $$8,
         fnn.o $$9,
         fnn.q $$10,
         fnn.h $$11,
         fnn.b $$12,
         fno.c $$13
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
         this.o = ImmutableList.of(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.m, new fnn[]{this.l});
      }

      @Override
      public String toString() {
         return "CompositeState[" + this.o + ", outlineProperty=" + this.n + "]";
      }

      public static fno.b.a a() {
         return new fno.b.a();
      }

      public static class a {
         private fnn.e a = fnn.ao;
         private fnn.m b = fnn.i;
         private fnn.p c;
         private fnn.d d;
         private fnn.c e;
         private fnn.g f;
         private fnn.l g;
         private fnn.f h;
         private fnn.k i;
         private fnn.o j;
         private fnn.q k;
         private fnn.h l;
         private fnn.b m;

         a() {
            this.c = fnn.c;
            this.d = fnn.aA;
            this.e = fnn.aw;
            this.f = fnn.at;
            this.g = fnn.av;
            this.h = fnn.aF;
            this.i = fnn.aI;
            this.j = fnn.ap;
            this.k = fnn.aC;
            this.l = fnn.aP;
            this.m = fnn.aQ;
         }

         public fno.b.a a(fnn.e $$0) {
            this.a = $$0;
            return this;
         }

         public fno.b.a a(fnn.m $$0) {
            this.b = $$0;
            return this;
         }

         public fno.b.a a(fnn.p $$0) {
            this.c = $$0;
            return this;
         }

         public fno.b.a a(fnn.d $$0) {
            this.d = $$0;
            return this;
         }

         public fno.b.a a(fnn.c $$0) {
            this.e = $$0;
            return this;
         }

         public fno.b.a a(fnn.g $$0) {
            this.f = $$0;
            return this;
         }

         public fno.b.a a(fnn.l $$0) {
            this.g = $$0;
            return this;
         }

         public fno.b.a a(fnn.f $$0) {
            this.h = $$0;
            return this;
         }

         public fno.b.a a(fnn.k $$0) {
            this.i = $$0;
            return this;
         }

         public fno.b.a a(fnn.o $$0) {
            this.j = $$0;
            return this;
         }

         public fno.b.a a(fnn.q $$0) {
            this.k = $$0;
            return this;
         }

         public fno.b.a a(fnn.h $$0) {
            this.l = $$0;
            return this;
         }

         public fno.b.a a(fnn.b $$0) {
            this.m = $$0;
            return this;
         }

         public fno.b a(boolean $$0) {
            return this.a($$0 ? fno.c.c : fno.c.a);
         }

         public fno.b a(fno.c $$0) {
            return new fno.b(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, $$0);
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
