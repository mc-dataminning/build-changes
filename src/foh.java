import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.function.BiFunction;
import java.util.function.Function;

public abstract class foh extends fog {
   private static final int aY = 4;
   private static final int aZ = 1048576;
   public static final int aS = 2097152;
   public static final int aT = 262144;
   public static final int aU = 131072;
   public static final int aV = 256;
   private static final foh ba = a("solid", eli.j, elp.b.h, 2097152, true, false, foh.b.a().a(as).a(p).a(am).a(true));
   private static final foh bb = a("cutout_mipped", eli.j, elp.b.h, 131072, true, false, foh.b.a().a(as).a(q).a(am).a(true));
   private static final foh bc = a("cutout", eli.j, elp.b.h, 131072, true, false, foh.b.a().a(as).a(r).a(an).a(true));
   private static final foh bd = a("translucent", eli.j, elp.b.h, 2097152, true, true, a(s));
   private static final foh be = a("translucent_moving_block", eli.j, elp.b.h, 262144, false, true, P());
   private static final foh bf = a("translucent_no_crumbling", eli.j, elp.b.h, 262144, false, true, a(u));
   private static final Function<aeu, foh> bg = ac.b($$0 -> a("armor_cutout_no_cull", $$0, false));
   private static final Function<aeu, foh> bh = ac.b($$0 -> {
      foh.b $$1 = foh.b.a().a(w).a(new fog.n($$0, false, false)).a(c).a(as).a(au).a(true);
      return a("entity_solid", eli.k, elp.b.h, 256, true, false, $$1);
   });
   private static final Function<aeu, foh> bi = ac.b($$0 -> {
      foh.b $$1 = foh.b.a().a(x).a(new fog.n($$0, false, false)).a(c).a(as).a(au).a(true);
      return a("entity_cutout", eli.k, elp.b.h, 256, true, false, $$1);
   });
   private static final BiFunction<aeu, Boolean, foh> bj = ac.a(($$0, $$1) -> {
      foh.b $$2 = foh.b.a().a(y).a(new fog.n($$0, false, false)).a(c).a(ax).a(as).a(au).a($$1);
      return a("entity_cutout_no_cull", eli.k, elp.b.h, 256, true, false, $$2);
   });
   private static final BiFunction<aeu, Boolean, foh> bk = ac.a(($$0, $$1) -> {
      foh.b $$2 = foh.b.a().a(z).a(new fog.n($$0, false, false)).a(c).a(ax).a(as).a(au).a(aH).a($$1);
      return a("entity_cutout_no_cull_z_offset", eli.k, elp.b.h, 256, true, false, $$2);
   });
   private static final Function<aeu, foh> bl = ac.b($$0 -> {
      foh.b $$1 = foh.b.a().a(A).a(new fog.n($$0, false, false)).a(h).a(aO).a(as).a(au).a(fog.aC).a(true);
      return a("item_entity_translucent_cull", eli.k, elp.b.h, 256, true, true, $$1);
   });
   private static final Function<aeu, foh> bm = ac.b($$0 -> {
      foh.b $$1 = foh.b.a().a(B).a(new fog.n($$0, false, false)).a(h).a(as).a(au).a(true);
      return a("entity_translucent_cull", eli.k, elp.b.h, 256, true, true, $$1);
   });
   private static final BiFunction<aeu, Boolean, foh> bn = ac.a(($$0, $$1) -> {
      foh.b $$2 = foh.b.a().a(C).a(new fog.n($$0, false, false)).a(h).a(ax).a(as).a(au).a($$1);
      return a("entity_translucent", eli.k, elp.b.h, 256, true, true, $$2);
   });
   private static final BiFunction<aeu, Boolean, foh> bo = ac.a(($$0, $$1) -> {
      foh.b $$2 = foh.b.a().a(D).a(new fog.n($$0, false, false)).a(h).a(ax).a(aD).a(au).a($$1);
      return a("entity_translucent_emissive", eli.k, elp.b.h, 256, true, true, $$2);
   });
   private static final Function<aeu, foh> bp = ac.b($$0 -> {
      foh.b $$1 = foh.b.a().a(E).a(new fog.n($$0, false, false)).a(ax).a(as).a(true);
      return a("entity_smooth_cutout", eli.k, elp.b.h, 256, $$1);
   });
   private static final BiFunction<aeu, Boolean, foh> bq = ac.a(($$0, $$1) -> {
      foh.b $$2 = foh.b.a().a(F).a(new fog.n($$0, false, false)).a($$1 ? h : c).a($$1 ? aD : aC).a(false);
      return a("beacon_beam", eli.j, elp.b.h, 256, false, true, $$2);
   });
   private static final Function<aeu, foh> br = ac.b($$0 -> {
      foh.b $$1 = foh.b.a().a(G).a(new fog.n($$0, false, false)).a(az).a(ax).a(as).a(au).a(false);
      return a("entity_decal", eli.k, elp.b.h, 256, $$1);
   });
   private static final Function<aeu, foh> bs = ac.b($$0 -> {
      foh.b $$1 = foh.b.a().a(H).a(new fog.n($$0, false, false)).a(h).a(ax).a(as).a(au).a(aD).a(false);
      return a("entity_no_outline", eli.k, elp.b.h, 256, false, true, $$1);
   });
   private static final Function<aeu, foh> bt = ac.b($$0 -> {
      foh.b $$1 = foh.b.a().a(I).a(new fog.n($$0, false, false)).a(h).a(aw).a(as).a(au).a(aD).a(aA).a(aH).a(false);
      return a("entity_shadow", eli.k, elp.b.h, 256, false, false, $$1);
   });
   private static final Function<aeu, foh> bu = ac.b($$0 -> {
      foh.b $$1 = foh.b.a().a(J).a(new fog.n($$0, false, false)).a(ax).a(true);
      return a("entity_alpha", eli.k, elp.b.h, 256, $$1);
   });
   private static final Function<aeu, foh> bv = ac.b($$0 -> {
      fog.n $$1 = new fog.n($$0, false, false);
      return a("eyes", eli.k, elp.b.h, 256, false, true, foh.b.a().a(K).a($$1).a(d).a(aD).a(false));
   });
   private static final foh bw = a("leash", eli.p, elp.b.f, 256, foh.b.a().a(M).a(ao).a(ax).a(as).a(false));
   private static final foh bx = a("water_mask", eli.m, elp.b.h, 256, foh.b.a().a(N).a(ao).a(aE).a(false));
   private static final foh by = a(
      "armor_glint", eli.q, elp.b.h, 256, foh.b.a().a(P).a(new fog.n(fua.a, true, false)).a(aD).a(ax).a(az).a(f).a(aq).a(aH).a(false)
   );
   private static final foh bz = a(
      "armor_entity_glint", eli.q, elp.b.h, 256, foh.b.a().a(Q).a(new fog.n(fua.a, true, false)).a(aD).a(ax).a(az).a(f).a(ar).a(aH).a(false)
   );
   private static final foh bA = a(
      "glint_translucent", eli.q, elp.b.h, 256, foh.b.a().a(R).a(new fog.n(fua.b, true, false)).a(aD).a(ax).a(az).a(f).a(aq).a(aO).a(false)
   );
   private static final foh bB = a("glint", eli.q, elp.b.h, 256, foh.b.a().a(S).a(new fog.n(fua.b, true, false)).a(aD).a(ax).a(az).a(f).a(aq).a(false));
   private static final foh bC = a("glint_direct", eli.q, elp.b.h, 256, foh.b.a().a(T).a(new fog.n(fua.b, true, false)).a(aD).a(ax).a(az).a(f).a(aq).a(false));
   private static final foh bD = a(
      "entity_glint", eli.q, elp.b.h, 256, foh.b.a().a(U).a(new fog.n(fua.a, true, false)).a(aD).a(ax).a(az).a(f).a(aO).a(ar).a(false)
   );
   private static final foh bE = a(
      "entity_glint_direct", eli.q, elp.b.h, 256, foh.b.a().a(V).a(new fog.n(fua.a, true, false)).a(aD).a(ax).a(az).a(f).a(ar).a(false)
   );
   private static final Function<aeu, foh> bF = ac.b($$0 -> {
      fog.n $$1 = new fog.n($$0, false, false);
      return a("crumbling", eli.j, elp.b.h, 256, false, true, foh.b.a().a(W).a($$1).a(g).a(aD).a(aG).a(false));
   });
   private static final Function<aeu, foh> bG = ac.b(
      $$0 -> a("text", eli.t, elp.b.h, 256, false, true, foh.b.a().a(X).a(new fog.n($$0, false, false)).a(h).a(as).a(false))
   );
   private static final foh bH = a("text_background", eli.p, elp.b.h, 256, false, true, foh.b.a().a(Y).a(ao).a(h).a(as).a(false));
   private static final Function<aeu, foh> bI = ac.b(
      $$0 -> a("text_intensity", eli.t, elp.b.h, 256, false, true, foh.b.a().a(Z).a(new fog.n($$0, false, false)).a(h).a(as).a(false))
   );
   private static final Function<aeu, foh> bJ = ac.b(
      $$0 -> a("text_polygon_offset", eli.t, elp.b.h, 256, false, true, foh.b.a().a(X).a(new fog.n($$0, false, false)).a(h).a(as).a(aG).a(false))
   );
   private static final Function<aeu, foh> bK = ac.b(
      $$0 -> a("text_intensity_polygon_offset", eli.t, elp.b.h, 256, false, true, foh.b.a().a(Z).a(new fog.n($$0, false, false)).a(h).a(as).a(aG).a(false))
   );
   private static final Function<aeu, foh> bL = ac.b(
      $$0 -> a("text_see_through", eli.t, elp.b.h, 256, false, true, foh.b.a().a(aa).a(new fog.n($$0, false, false)).a(h).a(as).a(ay).a(aD).a(false))
   );
   private static final foh bM = a("text_background_see_through", eli.p, elp.b.h, 256, false, true, foh.b.a().a(ab).a(ao).a(h).a(as).a(ay).a(aD).a(false));
   private static final Function<aeu, foh> bN = ac.b(
      $$0 -> a("text_intensity_see_through", eli.t, elp.b.h, 256, false, true, foh.b.a().a(ac).a(new fog.n($$0, false, false)).a(h).a(as).a(ay).a(aD).a(false))
   );
   private static final foh bO = a("lightning", eli.n, elp.b.h, 256, false, true, foh.b.a().a(ad).a(aC).a(e).a(aM).a(false));
   private static final foh bP = a("tripwire", eli.j, elp.b.h, 262144, true, true, Q());
   private static final foh bQ = a(
      "end_portal", eli.m, elp.b.h, 256, false, false, foh.b.a().a(af).a(fog.i.d().a(fqs.a, false, false).a(fqs.b, false, false).a()).a(false)
   );
   private static final foh bR = a(
      "end_gateway", eli.m, elp.b.h, 256, false, false, foh.b.a().a(ag).a(fog.i.d().a(fqs.a, false, false).a(fqs.b, false, false).a()).a(false)
   );
   public static final foh.a aW = a("lines", eli.o, elp.b.a, 256, foh.b.a().a(ah).a(new fog.h(OptionalDouble.empty())).a(aH).a(h).a(aO).a(aC).a(ax).a(false));
   public static final foh.a aX = a(
      "line_strip", eli.o, elp.b.b, 256, foh.b.a().a(ah).a(new fog.h(OptionalDouble.empty())).a(aH).a(h).a(aO).a(aC).a(ax).a(false)
   );
   private static final Function<Double, foh.a> bS = ac.b(
      $$0 -> a("debug_line_strip", eli.n, elp.b.d, 256, foh.b.a().a(o).a(new fog.h(OptionalDouble.of($$0))).a(c).a(ax).a(false))
   );
   private static final foh.a bT = a("debug_filled_box", eli.n, elp.b.f, 131072, false, true, foh.b.a().a(o).a(aH).a(h).a(false));
   private static final foh.a bU = a("debug_quads", eli.n, elp.b.h, 131072, false, true, foh.b.a().a(o).a(h).a(ax).a(false));
   private static final foh.a bV = a("debug_section_quads", eli.n, elp.b.h, 131072, false, true, foh.b.a().a(o).a(aH).a(h).a(aw).a(false));
   private static final foh.a bW = a("gui", eli.n, elp.b.h, 256, foh.b.a().a(ai).a(h).a(aA).a(false));
   private static final foh.a bX = a("gui_overlay", eli.n, elp.b.h, 256, foh.b.a().a(aj).a(h).a(ay).a(aD).a(false));
   private static final foh.a bY = a("gui_text_highlight", eli.n, elp.b.h, 256, foh.b.a().a(ak).a(h).a(ay).a(aR).a(false));
   private static final foh.a bZ = a("gui_ghost_recipe_overlay", eli.n, elp.b.h, 256, foh.b.a().a(al).a(h).a(aB).a(aD).a(false));
   private static final ImmutableList<foh> ca = ImmutableList.of(c(), d(), e(), f(), u());
   private final elp cb;
   private final elp.b cc;
   private final int cd;
   private final boolean ce;
   private final boolean cf;
   private final Optional<foh> cg;

   public static foh c() {
      return ba;
   }

   public static foh d() {
      return bb;
   }

   public static foh e() {
      return bc;
   }

   private static foh.b a(fog.m $$0) {
      return foh.b.a().a(as).a($$0).a(am).a(h).a(aK).a(true);
   }

   public static foh f() {
      return bd;
   }

   private static foh.b P() {
      return foh.b.a().a(as).a(t).a(am).a(h).a(aO).a(true);
   }

   public static foh g() {
      return be;
   }

   public static foh h() {
      return bf;
   }

   private static foh.a a(String $$0, aeu $$1, boolean $$2) {
      foh.b $$3 = foh.b.a().a(v).a(new fog.n($$1, false, false)).a(c).a(ax).a(as).a(au).a(aH).a($$2 ? az : aA).a(true);
      return a($$0, eli.k, elp.b.h, 256, true, false, $$3);
   }

   public static foh a(aeu $$0) {
      return bg.apply($$0);
   }

   public static foh b(aeu $$0) {
      return a("armor_decal_cutout_no_cull", $$0, true);
   }

   public static foh c(aeu $$0) {
      return bh.apply($$0);
   }

   public static foh d(aeu $$0) {
      return bi.apply($$0);
   }

   public static foh a(aeu $$0, boolean $$1) {
      return bj.apply($$0, $$1);
   }

   public static foh e(aeu $$0) {
      return a($$0, true);
   }

   public static foh b(aeu $$0, boolean $$1) {
      return bk.apply($$0, $$1);
   }

   public static foh f(aeu $$0) {
      return b($$0, true);
   }

   public static foh g(aeu $$0) {
      return bl.apply($$0);
   }

   public static foh h(aeu $$0) {
      return bm.apply($$0);
   }

   public static foh c(aeu $$0, boolean $$1) {
      return bn.apply($$0, $$1);
   }

   public static foh i(aeu $$0) {
      return c($$0, true);
   }

   public static foh d(aeu $$0, boolean $$1) {
      return bo.apply($$0, $$1);
   }

   public static foh j(aeu $$0) {
      return d($$0, true);
   }

   public static foh k(aeu $$0) {
      return bp.apply($$0);
   }

   public static foh e(aeu $$0, boolean $$1) {
      return bq.apply($$0, $$1);
   }

   public static foh l(aeu $$0) {
      return br.apply($$0);
   }

   public static foh m(aeu $$0) {
      return bs.apply($$0);
   }

   public static foh n(aeu $$0) {
      return bt.apply($$0);
   }

   public static foh o(aeu $$0) {
      return bu.apply($$0);
   }

   public static foh p(aeu $$0) {
      return bv.apply($$0);
   }

   public static foh a(aeu $$0, float $$1, float $$2) {
      return a(
         "energy_swirl",
         eli.k,
         elp.b.h,
         256,
         false,
         true,
         foh.b.a().a(L).a(new fog.n($$0, false, false)).a(new fog.j($$1, $$2)).a(d).a(ax).a(as).a(au).a(false)
      );
   }

   public static foh i() {
      return bw;
   }

   public static foh j() {
      return bx;
   }

   public static foh q(aeu $$0) {
      return foh.a.aY.apply($$0, ax);
   }

   public static foh k() {
      return by;
   }

   public static foh l() {
      return bz;
   }

   public static foh m() {
      return bA;
   }

   public static foh n() {
      return bB;
   }

   public static foh o() {
      return bC;
   }

   public static foh p() {
      return bD;
   }

   public static foh q() {
      return bE;
   }

   public static foh r(aeu $$0) {
      return bF.apply($$0);
   }

   public static foh s(aeu $$0) {
      return bG.apply($$0);
   }

   public static foh r() {
      return bH;
   }

   public static foh t(aeu $$0) {
      return bI.apply($$0);
   }

   public static foh u(aeu $$0) {
      return bJ.apply($$0);
   }

   public static foh v(aeu $$0) {
      return bK.apply($$0);
   }

   public static foh w(aeu $$0) {
      return bL.apply($$0);
   }

   public static foh s() {
      return bM;
   }

   public static foh x(aeu $$0) {
      return bN.apply($$0);
   }

   public static foh t() {
      return bO;
   }

   private static foh.b Q() {
      return foh.b.a().a(as).a(ae).a(am).a(h).a(aM).a(true);
   }

   public static foh u() {
      return bP;
   }

   public static foh v() {
      return bQ;
   }

   public static foh w() {
      return bR;
   }

   public static foh x() {
      return aW;
   }

   public static foh y() {
      return aX;
   }

   public static foh a(double $$0) {
      return bS.apply($$0);
   }

   public static foh z() {
      return bT;
   }

   public static foh A() {
      return bU;
   }

   public static foh B() {
      return bV;
   }

   public static foh C() {
      return bW;
   }

   public static foh D() {
      return bX;
   }

   public static foh E() {
      return bY;
   }

   public static foh F() {
      return bZ;
   }

   public foh(String $$0, elp $$1, elp.b $$2, int $$3, boolean $$4, boolean $$5, Runnable $$6, Runnable $$7) {
      super($$0, $$6, $$7);
      this.cb = $$1;
      this.cc = $$2;
      this.cd = $$3;
      this.ce = $$4;
      this.cf = $$5;
      this.cg = Optional.of(this);
   }

   static foh.a a(String $$0, elp $$1, elp.b $$2, int $$3, foh.b $$4) {
      return a($$0, $$1, $$2, $$3, false, false, $$4);
   }

   private static foh.a a(String $$0, elp $$1, elp.b $$2, int $$3, boolean $$4, boolean $$5, foh.b $$6) {
      return new foh.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   public void a(elf $$0, els $$1) {
      if ($$0.j()) {
         if (this.cf) {
            $$0.a($$1);
         }

         elf.b $$2 = $$0.d();
         this.a();
         elg.a($$2);
         this.b();
      }
   }

   @Override
   public String toString() {
      return this.b;
   }

   public static List<foh> G() {
      return ca;
   }

   public int H() {
      return this.cd;
   }

   public elp I() {
      return this.cb;
   }

   public elp.b J() {
      return this.cc;
   }

   public Optional<foh> K() {
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

   public Optional<foh> O() {
      return this.cg;
   }

   static final class a extends foh {
      static final BiFunction<aeu, fog.c, foh> aY = ac.a(
         ($$0, $$1) -> foh.a("outline", eli.r, elp.b.h, 256, foh.b.a().a(O).a(new fog.n($$0, false, false)).a($$1).a(ay).a(aJ).a(foh.c.b))
      );
      private final foh.b aZ;
      private final Optional<foh> ba;
      private final boolean bb;

      a(String $$0, elp $$1, elp.b $$2, int $$3, boolean $$4, boolean $$5, foh.b $$6) {
         super($$0, $$1, $$2, $$3, $$4, $$5, () -> $$6.o.forEach(fog::a), () -> $$6.o.forEach(fog::b));
         this.aZ = $$6;
         this.ba = $$6.n == foh.c.c ? $$6.a.c().map($$1x -> aY.apply($$1x, $$6.e)) : Optional.empty();
         this.bb = $$6.n == foh.c.b;
      }

      @Override
      public Optional<foh> K() {
         return this.ba;
      }

      @Override
      public boolean L() {
         return this.bb;
      }

      protected final foh.b P() {
         return this.aZ;
      }

      @Override
      public String toString() {
         return "RenderType[" + this.b + ":" + this.aZ + "]";
      }
   }

   protected static final class b {
      final fog.e a;
      private final fog.m b;
      private final fog.p c;
      private final fog.d d;
      final fog.c e;
      private final fog.g f;
      private final fog.l g;
      private final fog.f h;
      private final fog.k i;
      private final fog.o j;
      private final fog.q k;
      private final fog.h l;
      private final fog.b m;
      final foh.c n;
      final ImmutableList<fog> o;

      b(
         fog.e $$0,
         fog.m $$1,
         fog.p $$2,
         fog.d $$3,
         fog.c $$4,
         fog.g $$5,
         fog.l $$6,
         fog.f $$7,
         fog.k $$8,
         fog.o $$9,
         fog.q $$10,
         fog.h $$11,
         fog.b $$12,
         foh.c $$13
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
         this.o = ImmutableList.of(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.m, new fog[]{this.l});
      }

      @Override
      public String toString() {
         return "CompositeState[" + this.o + ", outlineProperty=" + this.n + "]";
      }

      public static foh.b.a a() {
         return new foh.b.a();
      }

      public static class a {
         private fog.e a = fog.ao;
         private fog.m b = fog.i;
         private fog.p c;
         private fog.d d;
         private fog.c e;
         private fog.g f;
         private fog.l g;
         private fog.f h;
         private fog.k i;
         private fog.o j;
         private fog.q k;
         private fog.h l;
         private fog.b m;

         a() {
            this.c = fog.c;
            this.d = fog.aA;
            this.e = fog.aw;
            this.f = fog.at;
            this.g = fog.av;
            this.h = fog.aF;
            this.i = fog.aI;
            this.j = fog.ap;
            this.k = fog.aC;
            this.l = fog.aP;
            this.m = fog.aQ;
         }

         public foh.b.a a(fog.e $$0) {
            this.a = $$0;
            return this;
         }

         public foh.b.a a(fog.m $$0) {
            this.b = $$0;
            return this;
         }

         public foh.b.a a(fog.p $$0) {
            this.c = $$0;
            return this;
         }

         public foh.b.a a(fog.d $$0) {
            this.d = $$0;
            return this;
         }

         public foh.b.a a(fog.c $$0) {
            this.e = $$0;
            return this;
         }

         public foh.b.a a(fog.g $$0) {
            this.f = $$0;
            return this;
         }

         public foh.b.a a(fog.l $$0) {
            this.g = $$0;
            return this;
         }

         public foh.b.a a(fog.f $$0) {
            this.h = $$0;
            return this;
         }

         public foh.b.a a(fog.k $$0) {
            this.i = $$0;
            return this;
         }

         public foh.b.a a(fog.o $$0) {
            this.j = $$0;
            return this;
         }

         public foh.b.a a(fog.q $$0) {
            this.k = $$0;
            return this;
         }

         public foh.b.a a(fog.h $$0) {
            this.l = $$0;
            return this;
         }

         public foh.b.a a(fog.b $$0) {
            this.m = $$0;
            return this;
         }

         public foh.b a(boolean $$0) {
            return this.a($$0 ? foh.c.c : foh.c.a);
         }

         public foh.b a(foh.c $$0) {
            return new foh.b(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, $$0);
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
