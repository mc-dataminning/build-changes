import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.function.BiFunction;
import java.util.function.Function;

public abstract class foi extends foh {
   private static final int aY = 4;
   private static final int aZ = 1048576;
   public static final int aS = 2097152;
   public static final int aT = 262144;
   public static final int aU = 131072;
   public static final int aV = 256;
   private static final foi ba = a("solid", elh.j, elo.b.h, 2097152, true, false, foi.b.a().a(as).a(p).a(am).a(true));
   private static final foi bb = a("cutout_mipped", elh.j, elo.b.h, 131072, true, false, foi.b.a().a(as).a(q).a(am).a(true));
   private static final foi bc = a("cutout", elh.j, elo.b.h, 131072, true, false, foi.b.a().a(as).a(r).a(an).a(true));
   private static final foi bd = a("translucent", elh.j, elo.b.h, 2097152, true, true, a(s));
   private static final foi be = a("translucent_moving_block", elh.j, elo.b.h, 262144, false, true, P());
   private static final foi bf = a("translucent_no_crumbling", elh.j, elo.b.h, 262144, false, true, a(u));
   private static final Function<aez, foi> bg = ac.b($$0 -> a("armor_cutout_no_cull", $$0, false));
   private static final Function<aez, foi> bh = ac.b($$0 -> {
      foi.b $$1 = foi.b.a().a(w).a(new foh.n($$0, false, false)).a(c).a(as).a(au).a(true);
      return a("entity_solid", elh.k, elo.b.h, 256, true, false, $$1);
   });
   private static final Function<aez, foi> bi = ac.b($$0 -> {
      foi.b $$1 = foi.b.a().a(x).a(new foh.n($$0, false, false)).a(c).a(as).a(au).a(true);
      return a("entity_cutout", elh.k, elo.b.h, 256, true, false, $$1);
   });
   private static final BiFunction<aez, Boolean, foi> bj = ac.a(($$0, $$1) -> {
      foi.b $$2 = foi.b.a().a(y).a(new foh.n($$0, false, false)).a(c).a(ax).a(as).a(au).a($$1);
      return a("entity_cutout_no_cull", elh.k, elo.b.h, 256, true, false, $$2);
   });
   private static final BiFunction<aez, Boolean, foi> bk = ac.a(($$0, $$1) -> {
      foi.b $$2 = foi.b.a().a(z).a(new foh.n($$0, false, false)).a(c).a(ax).a(as).a(au).a(aH).a($$1);
      return a("entity_cutout_no_cull_z_offset", elh.k, elo.b.h, 256, true, false, $$2);
   });
   private static final Function<aez, foi> bl = ac.b($$0 -> {
      foi.b $$1 = foi.b.a().a(A).a(new foh.n($$0, false, false)).a(h).a(aO).a(as).a(au).a(foh.aC).a(true);
      return a("item_entity_translucent_cull", elh.k, elo.b.h, 256, true, true, $$1);
   });
   private static final Function<aez, foi> bm = ac.b($$0 -> {
      foi.b $$1 = foi.b.a().a(B).a(new foh.n($$0, false, false)).a(h).a(as).a(au).a(true);
      return a("entity_translucent_cull", elh.k, elo.b.h, 256, true, true, $$1);
   });
   private static final BiFunction<aez, Boolean, foi> bn = ac.a(($$0, $$1) -> {
      foi.b $$2 = foi.b.a().a(C).a(new foh.n($$0, false, false)).a(h).a(ax).a(as).a(au).a($$1);
      return a("entity_translucent", elh.k, elo.b.h, 256, true, true, $$2);
   });
   private static final BiFunction<aez, Boolean, foi> bo = ac.a(($$0, $$1) -> {
      foi.b $$2 = foi.b.a().a(D).a(new foh.n($$0, false, false)).a(h).a(ax).a(aD).a(au).a($$1);
      return a("entity_translucent_emissive", elh.k, elo.b.h, 256, true, true, $$2);
   });
   private static final Function<aez, foi> bp = ac.b($$0 -> {
      foi.b $$1 = foi.b.a().a(E).a(new foh.n($$0, false, false)).a(ax).a(as).a(true);
      return a("entity_smooth_cutout", elh.k, elo.b.h, 256, $$1);
   });
   private static final BiFunction<aez, Boolean, foi> bq = ac.a(($$0, $$1) -> {
      foi.b $$2 = foi.b.a().a(F).a(new foh.n($$0, false, false)).a($$1 ? h : c).a($$1 ? aD : aC).a(false);
      return a("beacon_beam", elh.j, elo.b.h, 256, false, true, $$2);
   });
   private static final Function<aez, foi> br = ac.b($$0 -> {
      foi.b $$1 = foi.b.a().a(G).a(new foh.n($$0, false, false)).a(az).a(ax).a(as).a(au).a(false);
      return a("entity_decal", elh.k, elo.b.h, 256, $$1);
   });
   private static final Function<aez, foi> bs = ac.b($$0 -> {
      foi.b $$1 = foi.b.a().a(H).a(new foh.n($$0, false, false)).a(h).a(ax).a(as).a(au).a(aD).a(false);
      return a("entity_no_outline", elh.k, elo.b.h, 256, false, true, $$1);
   });
   private static final Function<aez, foi> bt = ac.b($$0 -> {
      foi.b $$1 = foi.b.a().a(I).a(new foh.n($$0, false, false)).a(h).a(aw).a(as).a(au).a(aD).a(aA).a(aH).a(false);
      return a("entity_shadow", elh.k, elo.b.h, 256, false, false, $$1);
   });
   private static final Function<aez, foi> bu = ac.b($$0 -> {
      foi.b $$1 = foi.b.a().a(J).a(new foh.n($$0, false, false)).a(ax).a(true);
      return a("entity_alpha", elh.k, elo.b.h, 256, $$1);
   });
   private static final Function<aez, foi> bv = ac.b($$0 -> {
      foh.n $$1 = new foh.n($$0, false, false);
      return a("eyes", elh.k, elo.b.h, 256, false, true, foi.b.a().a(K).a($$1).a(d).a(aD).a(false));
   });
   private static final foi bw = a("leash", elh.p, elo.b.f, 256, foi.b.a().a(M).a(ao).a(ax).a(as).a(false));
   private static final foi bx = a("water_mask", elh.m, elo.b.h, 256, foi.b.a().a(N).a(ao).a(aE).a(false));
   private static final foi by = a(
      "armor_glint", elh.q, elo.b.h, 256, foi.b.a().a(P).a(new foh.n(fub.a, true, false)).a(aD).a(ax).a(az).a(f).a(aq).a(aH).a(false)
   );
   private static final foi bz = a(
      "armor_entity_glint", elh.q, elo.b.h, 256, foi.b.a().a(Q).a(new foh.n(fub.a, true, false)).a(aD).a(ax).a(az).a(f).a(ar).a(aH).a(false)
   );
   private static final foi bA = a(
      "glint_translucent", elh.q, elo.b.h, 256, foi.b.a().a(R).a(new foh.n(fub.b, true, false)).a(aD).a(ax).a(az).a(f).a(aq).a(aO).a(false)
   );
   private static final foi bB = a("glint", elh.q, elo.b.h, 256, foi.b.a().a(S).a(new foh.n(fub.b, true, false)).a(aD).a(ax).a(az).a(f).a(aq).a(false));
   private static final foi bC = a("glint_direct", elh.q, elo.b.h, 256, foi.b.a().a(T).a(new foh.n(fub.b, true, false)).a(aD).a(ax).a(az).a(f).a(aq).a(false));
   private static final foi bD = a(
      "entity_glint", elh.q, elo.b.h, 256, foi.b.a().a(U).a(new foh.n(fub.a, true, false)).a(aD).a(ax).a(az).a(f).a(aO).a(ar).a(false)
   );
   private static final foi bE = a(
      "entity_glint_direct", elh.q, elo.b.h, 256, foi.b.a().a(V).a(new foh.n(fub.a, true, false)).a(aD).a(ax).a(az).a(f).a(ar).a(false)
   );
   private static final Function<aez, foi> bF = ac.b($$0 -> {
      foh.n $$1 = new foh.n($$0, false, false);
      return a("crumbling", elh.j, elo.b.h, 256, false, true, foi.b.a().a(W).a($$1).a(g).a(aD).a(aG).a(false));
   });
   private static final Function<aez, foi> bG = ac.b(
      $$0 -> a("text", elh.t, elo.b.h, 256, false, true, foi.b.a().a(X).a(new foh.n($$0, false, false)).a(h).a(as).a(false))
   );
   private static final foi bH = a("text_background", elh.p, elo.b.h, 256, false, true, foi.b.a().a(Y).a(ao).a(h).a(as).a(false));
   private static final Function<aez, foi> bI = ac.b(
      $$0 -> a("text_intensity", elh.t, elo.b.h, 256, false, true, foi.b.a().a(Z).a(new foh.n($$0, false, false)).a(h).a(as).a(false))
   );
   private static final Function<aez, foi> bJ = ac.b(
      $$0 -> a("text_polygon_offset", elh.t, elo.b.h, 256, false, true, foi.b.a().a(X).a(new foh.n($$0, false, false)).a(h).a(as).a(aG).a(false))
   );
   private static final Function<aez, foi> bK = ac.b(
      $$0 -> a("text_intensity_polygon_offset", elh.t, elo.b.h, 256, false, true, foi.b.a().a(Z).a(new foh.n($$0, false, false)).a(h).a(as).a(aG).a(false))
   );
   private static final Function<aez, foi> bL = ac.b(
      $$0 -> a("text_see_through", elh.t, elo.b.h, 256, false, true, foi.b.a().a(aa).a(new foh.n($$0, false, false)).a(h).a(as).a(ay).a(aD).a(false))
   );
   private static final foi bM = a("text_background_see_through", elh.p, elo.b.h, 256, false, true, foi.b.a().a(ab).a(ao).a(h).a(as).a(ay).a(aD).a(false));
   private static final Function<aez, foi> bN = ac.b(
      $$0 -> a("text_intensity_see_through", elh.t, elo.b.h, 256, false, true, foi.b.a().a(ac).a(new foh.n($$0, false, false)).a(h).a(as).a(ay).a(aD).a(false))
   );
   private static final foi bO = a("lightning", elh.n, elo.b.h, 256, false, true, foi.b.a().a(ad).a(aC).a(e).a(aM).a(false));
   private static final foi bP = a("tripwire", elh.j, elo.b.h, 262144, true, true, Q());
   private static final foi bQ = a(
      "end_portal", elh.m, elo.b.h, 256, false, false, foi.b.a().a(af).a(foh.i.d().a(fqt.a, false, false).a(fqt.b, false, false).a()).a(false)
   );
   private static final foi bR = a(
      "end_gateway", elh.m, elo.b.h, 256, false, false, foi.b.a().a(ag).a(foh.i.d().a(fqt.a, false, false).a(fqt.b, false, false).a()).a(false)
   );
   public static final foi.a aW = a("lines", elh.o, elo.b.a, 256, foi.b.a().a(ah).a(new foh.h(OptionalDouble.empty())).a(aH).a(h).a(aO).a(aC).a(ax).a(false));
   public static final foi.a aX = a(
      "line_strip", elh.o, elo.b.b, 256, foi.b.a().a(ah).a(new foh.h(OptionalDouble.empty())).a(aH).a(h).a(aO).a(aC).a(ax).a(false)
   );
   private static final Function<Double, foi.a> bS = ac.b(
      $$0 -> a("debug_line_strip", elh.n, elo.b.d, 256, foi.b.a().a(o).a(new foh.h(OptionalDouble.of($$0))).a(c).a(ax).a(false))
   );
   private static final foi.a bT = a("debug_filled_box", elh.n, elo.b.f, 131072, false, true, foi.b.a().a(o).a(aH).a(h).a(false));
   private static final foi.a bU = a("debug_quads", elh.n, elo.b.h, 131072, false, true, foi.b.a().a(o).a(h).a(ax).a(false));
   private static final foi.a bV = a("debug_section_quads", elh.n, elo.b.h, 131072, false, true, foi.b.a().a(o).a(aH).a(h).a(aw).a(false));
   private static final foi.a bW = a("gui", elh.n, elo.b.h, 256, foi.b.a().a(ai).a(h).a(aA).a(false));
   private static final foi.a bX = a("gui_overlay", elh.n, elo.b.h, 256, foi.b.a().a(aj).a(h).a(ay).a(aD).a(false));
   private static final foi.a bY = a("gui_text_highlight", elh.n, elo.b.h, 256, foi.b.a().a(ak).a(h).a(ay).a(aR).a(false));
   private static final foi.a bZ = a("gui_ghost_recipe_overlay", elh.n, elo.b.h, 256, foi.b.a().a(al).a(h).a(aB).a(aD).a(false));
   private static final ImmutableList<foi> ca = ImmutableList.of(c(), d(), e(), f(), u());
   private final elo cb;
   private final elo.b cc;
   private final int cd;
   private final boolean ce;
   private final boolean cf;
   private final Optional<foi> cg;

   public static foi c() {
      return ba;
   }

   public static foi d() {
      return bb;
   }

   public static foi e() {
      return bc;
   }

   private static foi.b a(foh.m $$0) {
      return foi.b.a().a(as).a($$0).a(am).a(h).a(aK).a(true);
   }

   public static foi f() {
      return bd;
   }

   private static foi.b P() {
      return foi.b.a().a(as).a(t).a(am).a(h).a(aO).a(true);
   }

   public static foi g() {
      return be;
   }

   public static foi h() {
      return bf;
   }

   private static foi.a a(String $$0, aez $$1, boolean $$2) {
      foi.b $$3 = foi.b.a().a(v).a(new foh.n($$1, false, false)).a(c).a(ax).a(as).a(au).a(aH).a($$2 ? az : aA).a(true);
      return a($$0, elh.k, elo.b.h, 256, true, false, $$3);
   }

   public static foi a(aez $$0) {
      return bg.apply($$0);
   }

   public static foi b(aez $$0) {
      return a("armor_decal_cutout_no_cull", $$0, true);
   }

   public static foi c(aez $$0) {
      return bh.apply($$0);
   }

   public static foi d(aez $$0) {
      return bi.apply($$0);
   }

   public static foi a(aez $$0, boolean $$1) {
      return bj.apply($$0, $$1);
   }

   public static foi e(aez $$0) {
      return a($$0, true);
   }

   public static foi b(aez $$0, boolean $$1) {
      return bk.apply($$0, $$1);
   }

   public static foi f(aez $$0) {
      return b($$0, true);
   }

   public static foi g(aez $$0) {
      return bl.apply($$0);
   }

   public static foi h(aez $$0) {
      return bm.apply($$0);
   }

   public static foi c(aez $$0, boolean $$1) {
      return bn.apply($$0, $$1);
   }

   public static foi i(aez $$0) {
      return c($$0, true);
   }

   public static foi d(aez $$0, boolean $$1) {
      return bo.apply($$0, $$1);
   }

   public static foi j(aez $$0) {
      return d($$0, true);
   }

   public static foi k(aez $$0) {
      return bp.apply($$0);
   }

   public static foi e(aez $$0, boolean $$1) {
      return bq.apply($$0, $$1);
   }

   public static foi l(aez $$0) {
      return br.apply($$0);
   }

   public static foi m(aez $$0) {
      return bs.apply($$0);
   }

   public static foi n(aez $$0) {
      return bt.apply($$0);
   }

   public static foi o(aez $$0) {
      return bu.apply($$0);
   }

   public static foi p(aez $$0) {
      return bv.apply($$0);
   }

   public static foi a(aez $$0, float $$1, float $$2) {
      return a(
         "energy_swirl",
         elh.k,
         elo.b.h,
         256,
         false,
         true,
         foi.b.a().a(L).a(new foh.n($$0, false, false)).a(new foh.j($$1, $$2)).a(d).a(ax).a(as).a(au).a(false)
      );
   }

   public static foi i() {
      return bw;
   }

   public static foi j() {
      return bx;
   }

   public static foi q(aez $$0) {
      return foi.a.aY.apply($$0, ax);
   }

   public static foi k() {
      return by;
   }

   public static foi l() {
      return bz;
   }

   public static foi m() {
      return bA;
   }

   public static foi n() {
      return bB;
   }

   public static foi o() {
      return bC;
   }

   public static foi p() {
      return bD;
   }

   public static foi q() {
      return bE;
   }

   public static foi r(aez $$0) {
      return bF.apply($$0);
   }

   public static foi s(aez $$0) {
      return bG.apply($$0);
   }

   public static foi r() {
      return bH;
   }

   public static foi t(aez $$0) {
      return bI.apply($$0);
   }

   public static foi u(aez $$0) {
      return bJ.apply($$0);
   }

   public static foi v(aez $$0) {
      return bK.apply($$0);
   }

   public static foi w(aez $$0) {
      return bL.apply($$0);
   }

   public static foi s() {
      return bM;
   }

   public static foi x(aez $$0) {
      return bN.apply($$0);
   }

   public static foi t() {
      return bO;
   }

   private static foi.b Q() {
      return foi.b.a().a(as).a(ae).a(am).a(h).a(aM).a(true);
   }

   public static foi u() {
      return bP;
   }

   public static foi v() {
      return bQ;
   }

   public static foi w() {
      return bR;
   }

   public static foi x() {
      return aW;
   }

   public static foi y() {
      return aX;
   }

   public static foi a(double $$0) {
      return bS.apply($$0);
   }

   public static foi z() {
      return bT;
   }

   public static foi A() {
      return bU;
   }

   public static foi B() {
      return bV;
   }

   public static foi C() {
      return bW;
   }

   public static foi D() {
      return bX;
   }

   public static foi E() {
      return bY;
   }

   public static foi F() {
      return bZ;
   }

   public foi(String $$0, elo $$1, elo.b $$2, int $$3, boolean $$4, boolean $$5, Runnable $$6, Runnable $$7) {
      super($$0, $$6, $$7);
      this.cb = $$1;
      this.cc = $$2;
      this.cd = $$3;
      this.ce = $$4;
      this.cf = $$5;
      this.cg = Optional.of(this);
   }

   static foi.a a(String $$0, elo $$1, elo.b $$2, int $$3, foi.b $$4) {
      return a($$0, $$1, $$2, $$3, false, false, $$4);
   }

   private static foi.a a(String $$0, elo $$1, elo.b $$2, int $$3, boolean $$4, boolean $$5, foi.b $$6) {
      return new foi.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   public void a(ele $$0, elr $$1) {
      if ($$0.j()) {
         if (this.cf) {
            $$0.a($$1);
         }

         ele.b $$2 = $$0.d();
         this.a();
         elf.a($$2);
         this.b();
      }
   }

   @Override
   public String toString() {
      return this.b;
   }

   public static List<foi> G() {
      return ca;
   }

   public int H() {
      return this.cd;
   }

   public elo I() {
      return this.cb;
   }

   public elo.b J() {
      return this.cc;
   }

   public Optional<foi> K() {
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

   public Optional<foi> O() {
      return this.cg;
   }

   static final class a extends foi {
      static final BiFunction<aez, foh.c, foi> aY = ac.a(
         ($$0, $$1) -> foi.a("outline", elh.r, elo.b.h, 256, foi.b.a().a(O).a(new foh.n($$0, false, false)).a($$1).a(ay).a(aJ).a(foi.c.b))
      );
      private final foi.b aZ;
      private final Optional<foi> ba;
      private final boolean bb;

      a(String $$0, elo $$1, elo.b $$2, int $$3, boolean $$4, boolean $$5, foi.b $$6) {
         super($$0, $$1, $$2, $$3, $$4, $$5, () -> $$6.o.forEach(foh::a), () -> $$6.o.forEach(foh::b));
         this.aZ = $$6;
         this.ba = $$6.n == foi.c.c ? $$6.a.c().map($$1x -> aY.apply($$1x, $$6.e)) : Optional.empty();
         this.bb = $$6.n == foi.c.b;
      }

      @Override
      public Optional<foi> K() {
         return this.ba;
      }

      @Override
      public boolean L() {
         return this.bb;
      }

      protected final foi.b P() {
         return this.aZ;
      }

      @Override
      public String toString() {
         return "RenderType[" + this.b + ":" + this.aZ + "]";
      }
   }

   protected static final class b {
      final foh.e a;
      private final foh.m b;
      private final foh.p c;
      private final foh.d d;
      final foh.c e;
      private final foh.g f;
      private final foh.l g;
      private final foh.f h;
      private final foh.k i;
      private final foh.o j;
      private final foh.q k;
      private final foh.h l;
      private final foh.b m;
      final foi.c n;
      final ImmutableList<foh> o;

      b(
         foh.e $$0,
         foh.m $$1,
         foh.p $$2,
         foh.d $$3,
         foh.c $$4,
         foh.g $$5,
         foh.l $$6,
         foh.f $$7,
         foh.k $$8,
         foh.o $$9,
         foh.q $$10,
         foh.h $$11,
         foh.b $$12,
         foi.c $$13
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
         this.o = ImmutableList.of(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.m, new foh[]{this.l});
      }

      @Override
      public String toString() {
         return "CompositeState[" + this.o + ", outlineProperty=" + this.n + "]";
      }

      public static foi.b.a a() {
         return new foi.b.a();
      }

      public static class a {
         private foh.e a = foh.ao;
         private foh.m b = foh.i;
         private foh.p c;
         private foh.d d;
         private foh.c e;
         private foh.g f;
         private foh.l g;
         private foh.f h;
         private foh.k i;
         private foh.o j;
         private foh.q k;
         private foh.h l;
         private foh.b m;

         a() {
            this.c = foh.c;
            this.d = foh.aA;
            this.e = foh.aw;
            this.f = foh.at;
            this.g = foh.av;
            this.h = foh.aF;
            this.i = foh.aI;
            this.j = foh.ap;
            this.k = foh.aC;
            this.l = foh.aP;
            this.m = foh.aQ;
         }

         public foi.b.a a(foh.e $$0) {
            this.a = $$0;
            return this;
         }

         public foi.b.a a(foh.m $$0) {
            this.b = $$0;
            return this;
         }

         public foi.b.a a(foh.p $$0) {
            this.c = $$0;
            return this;
         }

         public foi.b.a a(foh.d $$0) {
            this.d = $$0;
            return this;
         }

         public foi.b.a a(foh.c $$0) {
            this.e = $$0;
            return this;
         }

         public foi.b.a a(foh.g $$0) {
            this.f = $$0;
            return this;
         }

         public foi.b.a a(foh.l $$0) {
            this.g = $$0;
            return this;
         }

         public foi.b.a a(foh.f $$0) {
            this.h = $$0;
            return this;
         }

         public foi.b.a a(foh.k $$0) {
            this.i = $$0;
            return this;
         }

         public foi.b.a a(foh.o $$0) {
            this.j = $$0;
            return this;
         }

         public foi.b.a a(foh.q $$0) {
            this.k = $$0;
            return this;
         }

         public foi.b.a a(foh.h $$0) {
            this.l = $$0;
            return this;
         }

         public foi.b.a a(foh.b $$0) {
            this.m = $$0;
            return this;
         }

         public foi.b a(boolean $$0) {
            return this.a($$0 ? foi.c.c : foi.c.a);
         }

         public foi.b a(foi.c $$0) {
            return new foi.b(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, $$0);
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
