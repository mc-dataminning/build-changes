import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.function.BiFunction;
import java.util.function.Function;

public abstract class foo extends fon {
   private static final int aY = 4;
   private static final int aZ = 1048576;
   public static final int aS = 2097152;
   public static final int aT = 262144;
   public static final int aU = 131072;
   public static final int aV = 256;
   private static final foo ba = a("solid", elp.j, elw.b.h, 2097152, true, false, foo.b.a().a(as).a(p).a(am).a(true));
   private static final foo bb = a("cutout_mipped", elp.j, elw.b.h, 131072, true, false, foo.b.a().a(as).a(q).a(am).a(true));
   private static final foo bc = a("cutout", elp.j, elw.b.h, 131072, true, false, foo.b.a().a(as).a(r).a(an).a(true));
   private static final foo bd = a("translucent", elp.j, elw.b.h, 2097152, true, true, a(s));
   private static final foo be = a("translucent_moving_block", elp.j, elw.b.h, 262144, false, true, P());
   private static final foo bf = a("translucent_no_crumbling", elp.j, elw.b.h, 262144, false, true, a(u));
   private static final Function<aey, foo> bg = ac.b($$0 -> a("armor_cutout_no_cull", $$0, false));
   private static final Function<aey, foo> bh = ac.b($$0 -> {
      foo.b $$1 = foo.b.a().a(w).a(new fon.n($$0, false, false)).a(c).a(as).a(au).a(true);
      return a("entity_solid", elp.k, elw.b.h, 256, true, false, $$1);
   });
   private static final Function<aey, foo> bi = ac.b($$0 -> {
      foo.b $$1 = foo.b.a().a(x).a(new fon.n($$0, false, false)).a(c).a(as).a(au).a(true);
      return a("entity_cutout", elp.k, elw.b.h, 256, true, false, $$1);
   });
   private static final BiFunction<aey, Boolean, foo> bj = ac.a(($$0, $$1) -> {
      foo.b $$2 = foo.b.a().a(y).a(new fon.n($$0, false, false)).a(c).a(ax).a(as).a(au).a($$1);
      return a("entity_cutout_no_cull", elp.k, elw.b.h, 256, true, false, $$2);
   });
   private static final BiFunction<aey, Boolean, foo> bk = ac.a(($$0, $$1) -> {
      foo.b $$2 = foo.b.a().a(z).a(new fon.n($$0, false, false)).a(c).a(ax).a(as).a(au).a(aH).a($$1);
      return a("entity_cutout_no_cull_z_offset", elp.k, elw.b.h, 256, true, false, $$2);
   });
   private static final Function<aey, foo> bl = ac.b($$0 -> {
      foo.b $$1 = foo.b.a().a(A).a(new fon.n($$0, false, false)).a(h).a(aO).a(as).a(au).a(fon.aC).a(true);
      return a("item_entity_translucent_cull", elp.k, elw.b.h, 256, true, true, $$1);
   });
   private static final Function<aey, foo> bm = ac.b($$0 -> {
      foo.b $$1 = foo.b.a().a(B).a(new fon.n($$0, false, false)).a(h).a(as).a(au).a(true);
      return a("entity_translucent_cull", elp.k, elw.b.h, 256, true, true, $$1);
   });
   private static final BiFunction<aey, Boolean, foo> bn = ac.a(($$0, $$1) -> {
      foo.b $$2 = foo.b.a().a(C).a(new fon.n($$0, false, false)).a(h).a(ax).a(as).a(au).a($$1);
      return a("entity_translucent", elp.k, elw.b.h, 256, true, true, $$2);
   });
   private static final BiFunction<aey, Boolean, foo> bo = ac.a(($$0, $$1) -> {
      foo.b $$2 = foo.b.a().a(D).a(new fon.n($$0, false, false)).a(h).a(ax).a(aD).a(au).a($$1);
      return a("entity_translucent_emissive", elp.k, elw.b.h, 256, true, true, $$2);
   });
   private static final Function<aey, foo> bp = ac.b($$0 -> {
      foo.b $$1 = foo.b.a().a(E).a(new fon.n($$0, false, false)).a(ax).a(as).a(true);
      return a("entity_smooth_cutout", elp.k, elw.b.h, 256, $$1);
   });
   private static final BiFunction<aey, Boolean, foo> bq = ac.a(($$0, $$1) -> {
      foo.b $$2 = foo.b.a().a(F).a(new fon.n($$0, false, false)).a($$1 ? h : c).a($$1 ? aD : aC).a(false);
      return a("beacon_beam", elp.j, elw.b.h, 256, false, true, $$2);
   });
   private static final Function<aey, foo> br = ac.b($$0 -> {
      foo.b $$1 = foo.b.a().a(G).a(new fon.n($$0, false, false)).a(az).a(ax).a(as).a(au).a(false);
      return a("entity_decal", elp.k, elw.b.h, 256, $$1);
   });
   private static final Function<aey, foo> bs = ac.b($$0 -> {
      foo.b $$1 = foo.b.a().a(H).a(new fon.n($$0, false, false)).a(h).a(ax).a(as).a(au).a(aD).a(false);
      return a("entity_no_outline", elp.k, elw.b.h, 256, false, true, $$1);
   });
   private static final Function<aey, foo> bt = ac.b($$0 -> {
      foo.b $$1 = foo.b.a().a(I).a(new fon.n($$0, false, false)).a(h).a(aw).a(as).a(au).a(aD).a(aA).a(aH).a(false);
      return a("entity_shadow", elp.k, elw.b.h, 256, false, false, $$1);
   });
   private static final Function<aey, foo> bu = ac.b($$0 -> {
      foo.b $$1 = foo.b.a().a(J).a(new fon.n($$0, false, false)).a(ax).a(true);
      return a("entity_alpha", elp.k, elw.b.h, 256, $$1);
   });
   private static final Function<aey, foo> bv = ac.b($$0 -> {
      fon.n $$1 = new fon.n($$0, false, false);
      return a("eyes", elp.k, elw.b.h, 256, false, true, foo.b.a().a(K).a($$1).a(d).a(aD).a(false));
   });
   private static final foo bw = a("leash", elp.p, elw.b.f, 256, foo.b.a().a(M).a(ao).a(ax).a(as).a(false));
   private static final foo bx = a("water_mask", elp.m, elw.b.h, 256, foo.b.a().a(N).a(ao).a(aE).a(false));
   private static final foo by = a(
      "armor_glint", elp.q, elw.b.h, 256, foo.b.a().a(P).a(new fon.n(fuh.a, true, false)).a(aD).a(ax).a(az).a(f).a(aq).a(aH).a(false)
   );
   private static final foo bz = a(
      "armor_entity_glint", elp.q, elw.b.h, 256, foo.b.a().a(Q).a(new fon.n(fuh.a, true, false)).a(aD).a(ax).a(az).a(f).a(ar).a(aH).a(false)
   );
   private static final foo bA = a(
      "glint_translucent", elp.q, elw.b.h, 256, foo.b.a().a(R).a(new fon.n(fuh.b, true, false)).a(aD).a(ax).a(az).a(f).a(aq).a(aO).a(false)
   );
   private static final foo bB = a("glint", elp.q, elw.b.h, 256, foo.b.a().a(S).a(new fon.n(fuh.b, true, false)).a(aD).a(ax).a(az).a(f).a(aq).a(false));
   private static final foo bC = a("glint_direct", elp.q, elw.b.h, 256, foo.b.a().a(T).a(new fon.n(fuh.b, true, false)).a(aD).a(ax).a(az).a(f).a(aq).a(false));
   private static final foo bD = a(
      "entity_glint", elp.q, elw.b.h, 256, foo.b.a().a(U).a(new fon.n(fuh.a, true, false)).a(aD).a(ax).a(az).a(f).a(aO).a(ar).a(false)
   );
   private static final foo bE = a(
      "entity_glint_direct", elp.q, elw.b.h, 256, foo.b.a().a(V).a(new fon.n(fuh.a, true, false)).a(aD).a(ax).a(az).a(f).a(ar).a(false)
   );
   private static final Function<aey, foo> bF = ac.b($$0 -> {
      fon.n $$1 = new fon.n($$0, false, false);
      return a("crumbling", elp.j, elw.b.h, 256, false, true, foo.b.a().a(W).a($$1).a(g).a(aD).a(aG).a(false));
   });
   private static final Function<aey, foo> bG = ac.b(
      $$0 -> a("text", elp.t, elw.b.h, 256, false, true, foo.b.a().a(X).a(new fon.n($$0, false, false)).a(h).a(as).a(false))
   );
   private static final foo bH = a("text_background", elp.p, elw.b.h, 256, false, true, foo.b.a().a(Y).a(ao).a(h).a(as).a(false));
   private static final Function<aey, foo> bI = ac.b(
      $$0 -> a("text_intensity", elp.t, elw.b.h, 256, false, true, foo.b.a().a(Z).a(new fon.n($$0, false, false)).a(h).a(as).a(false))
   );
   private static final Function<aey, foo> bJ = ac.b(
      $$0 -> a("text_polygon_offset", elp.t, elw.b.h, 256, false, true, foo.b.a().a(X).a(new fon.n($$0, false, false)).a(h).a(as).a(aG).a(false))
   );
   private static final Function<aey, foo> bK = ac.b(
      $$0 -> a("text_intensity_polygon_offset", elp.t, elw.b.h, 256, false, true, foo.b.a().a(Z).a(new fon.n($$0, false, false)).a(h).a(as).a(aG).a(false))
   );
   private static final Function<aey, foo> bL = ac.b(
      $$0 -> a("text_see_through", elp.t, elw.b.h, 256, false, true, foo.b.a().a(aa).a(new fon.n($$0, false, false)).a(h).a(as).a(ay).a(aD).a(false))
   );
   private static final foo bM = a("text_background_see_through", elp.p, elw.b.h, 256, false, true, foo.b.a().a(ab).a(ao).a(h).a(as).a(ay).a(aD).a(false));
   private static final Function<aey, foo> bN = ac.b(
      $$0 -> a("text_intensity_see_through", elp.t, elw.b.h, 256, false, true, foo.b.a().a(ac).a(new fon.n($$0, false, false)).a(h).a(as).a(ay).a(aD).a(false))
   );
   private static final foo bO = a("lightning", elp.n, elw.b.h, 256, false, true, foo.b.a().a(ad).a(aC).a(e).a(aM).a(false));
   private static final foo bP = a("tripwire", elp.j, elw.b.h, 262144, true, true, Q());
   private static final foo bQ = a(
      "end_portal", elp.m, elw.b.h, 256, false, false, foo.b.a().a(af).a(fon.i.d().a(fqz.a, false, false).a(fqz.b, false, false).a()).a(false)
   );
   private static final foo bR = a(
      "end_gateway", elp.m, elw.b.h, 256, false, false, foo.b.a().a(ag).a(fon.i.d().a(fqz.a, false, false).a(fqz.b, false, false).a()).a(false)
   );
   public static final foo.a aW = a("lines", elp.o, elw.b.a, 256, foo.b.a().a(ah).a(new fon.h(OptionalDouble.empty())).a(aH).a(h).a(aO).a(aC).a(ax).a(false));
   public static final foo.a aX = a(
      "line_strip", elp.o, elw.b.b, 256, foo.b.a().a(ah).a(new fon.h(OptionalDouble.empty())).a(aH).a(h).a(aO).a(aC).a(ax).a(false)
   );
   private static final Function<Double, foo.a> bS = ac.b(
      $$0 -> a("debug_line_strip", elp.n, elw.b.d, 256, foo.b.a().a(o).a(new fon.h(OptionalDouble.of($$0))).a(c).a(ax).a(false))
   );
   private static final foo.a bT = a("debug_filled_box", elp.n, elw.b.f, 131072, false, true, foo.b.a().a(o).a(aH).a(h).a(false));
   private static final foo.a bU = a("debug_quads", elp.n, elw.b.h, 131072, false, true, foo.b.a().a(o).a(h).a(ax).a(false));
   private static final foo.a bV = a("debug_section_quads", elp.n, elw.b.h, 131072, false, true, foo.b.a().a(o).a(aH).a(h).a(aw).a(false));
   private static final foo.a bW = a("gui", elp.n, elw.b.h, 256, foo.b.a().a(ai).a(h).a(aA).a(false));
   private static final foo.a bX = a("gui_overlay", elp.n, elw.b.h, 256, foo.b.a().a(aj).a(h).a(ay).a(aD).a(false));
   private static final foo.a bY = a("gui_text_highlight", elp.n, elw.b.h, 256, foo.b.a().a(ak).a(h).a(ay).a(aR).a(false));
   private static final foo.a bZ = a("gui_ghost_recipe_overlay", elp.n, elw.b.h, 256, foo.b.a().a(al).a(h).a(aB).a(aD).a(false));
   private static final ImmutableList<foo> ca = ImmutableList.of(c(), d(), e(), f(), u());
   private final elw cb;
   private final elw.b cc;
   private final int cd;
   private final boolean ce;
   private final boolean cf;
   private final Optional<foo> cg;

   public static foo c() {
      return ba;
   }

   public static foo d() {
      return bb;
   }

   public static foo e() {
      return bc;
   }

   private static foo.b a(fon.m $$0) {
      return foo.b.a().a(as).a($$0).a(am).a(h).a(aK).a(true);
   }

   public static foo f() {
      return bd;
   }

   private static foo.b P() {
      return foo.b.a().a(as).a(t).a(am).a(h).a(aO).a(true);
   }

   public static foo g() {
      return be;
   }

   public static foo h() {
      return bf;
   }

   private static foo.a a(String $$0, aey $$1, boolean $$2) {
      foo.b $$3 = foo.b.a().a(v).a(new fon.n($$1, false, false)).a(c).a(ax).a(as).a(au).a(aH).a($$2 ? az : aA).a(true);
      return a($$0, elp.k, elw.b.h, 256, true, false, $$3);
   }

   public static foo a(aey $$0) {
      return bg.apply($$0);
   }

   public static foo b(aey $$0) {
      return a("armor_decal_cutout_no_cull", $$0, true);
   }

   public static foo c(aey $$0) {
      return bh.apply($$0);
   }

   public static foo d(aey $$0) {
      return bi.apply($$0);
   }

   public static foo a(aey $$0, boolean $$1) {
      return bj.apply($$0, $$1);
   }

   public static foo e(aey $$0) {
      return a($$0, true);
   }

   public static foo b(aey $$0, boolean $$1) {
      return bk.apply($$0, $$1);
   }

   public static foo f(aey $$0) {
      return b($$0, true);
   }

   public static foo g(aey $$0) {
      return bl.apply($$0);
   }

   public static foo h(aey $$0) {
      return bm.apply($$0);
   }

   public static foo c(aey $$0, boolean $$1) {
      return bn.apply($$0, $$1);
   }

   public static foo i(aey $$0) {
      return c($$0, true);
   }

   public static foo d(aey $$0, boolean $$1) {
      return bo.apply($$0, $$1);
   }

   public static foo j(aey $$0) {
      return d($$0, true);
   }

   public static foo k(aey $$0) {
      return bp.apply($$0);
   }

   public static foo e(aey $$0, boolean $$1) {
      return bq.apply($$0, $$1);
   }

   public static foo l(aey $$0) {
      return br.apply($$0);
   }

   public static foo m(aey $$0) {
      return bs.apply($$0);
   }

   public static foo n(aey $$0) {
      return bt.apply($$0);
   }

   public static foo o(aey $$0) {
      return bu.apply($$0);
   }

   public static foo p(aey $$0) {
      return bv.apply($$0);
   }

   public static foo a(aey $$0, float $$1, float $$2) {
      return a(
         "energy_swirl",
         elp.k,
         elw.b.h,
         256,
         false,
         true,
         foo.b.a().a(L).a(new fon.n($$0, false, false)).a(new fon.j($$1, $$2)).a(d).a(ax).a(as).a(au).a(false)
      );
   }

   public static foo i() {
      return bw;
   }

   public static foo j() {
      return bx;
   }

   public static foo q(aey $$0) {
      return foo.a.aY.apply($$0, ax);
   }

   public static foo k() {
      return by;
   }

   public static foo l() {
      return bz;
   }

   public static foo m() {
      return bA;
   }

   public static foo n() {
      return bB;
   }

   public static foo o() {
      return bC;
   }

   public static foo p() {
      return bD;
   }

   public static foo q() {
      return bE;
   }

   public static foo r(aey $$0) {
      return bF.apply($$0);
   }

   public static foo s(aey $$0) {
      return bG.apply($$0);
   }

   public static foo r() {
      return bH;
   }

   public static foo t(aey $$0) {
      return bI.apply($$0);
   }

   public static foo u(aey $$0) {
      return bJ.apply($$0);
   }

   public static foo v(aey $$0) {
      return bK.apply($$0);
   }

   public static foo w(aey $$0) {
      return bL.apply($$0);
   }

   public static foo s() {
      return bM;
   }

   public static foo x(aey $$0) {
      return bN.apply($$0);
   }

   public static foo t() {
      return bO;
   }

   private static foo.b Q() {
      return foo.b.a().a(as).a(ae).a(am).a(h).a(aM).a(true);
   }

   public static foo u() {
      return bP;
   }

   public static foo v() {
      return bQ;
   }

   public static foo w() {
      return bR;
   }

   public static foo x() {
      return aW;
   }

   public static foo y() {
      return aX;
   }

   public static foo a(double $$0) {
      return bS.apply($$0);
   }

   public static foo z() {
      return bT;
   }

   public static foo A() {
      return bU;
   }

   public static foo B() {
      return bV;
   }

   public static foo C() {
      return bW;
   }

   public static foo D() {
      return bX;
   }

   public static foo E() {
      return bY;
   }

   public static foo F() {
      return bZ;
   }

   public foo(String $$0, elw $$1, elw.b $$2, int $$3, boolean $$4, boolean $$5, Runnable $$6, Runnable $$7) {
      super($$0, $$6, $$7);
      this.cb = $$1;
      this.cc = $$2;
      this.cd = $$3;
      this.ce = $$4;
      this.cf = $$5;
      this.cg = Optional.of(this);
   }

   static foo.a a(String $$0, elw $$1, elw.b $$2, int $$3, foo.b $$4) {
      return a($$0, $$1, $$2, $$3, false, false, $$4);
   }

   private static foo.a a(String $$0, elw $$1, elw.b $$2, int $$3, boolean $$4, boolean $$5, foo.b $$6) {
      return new foo.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   public void a(elm $$0, elz $$1) {
      if ($$0.j()) {
         if (this.cf) {
            $$0.a($$1);
         }

         elm.b $$2 = $$0.d();
         this.a();
         eln.a($$2);
         this.b();
      }
   }

   @Override
   public String toString() {
      return this.b;
   }

   public static List<foo> G() {
      return ca;
   }

   public int H() {
      return this.cd;
   }

   public elw I() {
      return this.cb;
   }

   public elw.b J() {
      return this.cc;
   }

   public Optional<foo> K() {
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

   public Optional<foo> O() {
      return this.cg;
   }

   static final class a extends foo {
      static final BiFunction<aey, fon.c, foo> aY = ac.a(
         ($$0, $$1) -> foo.a("outline", elp.r, elw.b.h, 256, foo.b.a().a(O).a(new fon.n($$0, false, false)).a($$1).a(ay).a(aJ).a(foo.c.b))
      );
      private final foo.b aZ;
      private final Optional<foo> ba;
      private final boolean bb;

      a(String $$0, elw $$1, elw.b $$2, int $$3, boolean $$4, boolean $$5, foo.b $$6) {
         super($$0, $$1, $$2, $$3, $$4, $$5, () -> $$6.o.forEach(fon::a), () -> $$6.o.forEach(fon::b));
         this.aZ = $$6;
         this.ba = $$6.n == foo.c.c ? $$6.a.c().map($$1x -> aY.apply($$1x, $$6.e)) : Optional.empty();
         this.bb = $$6.n == foo.c.b;
      }

      @Override
      public Optional<foo> K() {
         return this.ba;
      }

      @Override
      public boolean L() {
         return this.bb;
      }

      protected final foo.b P() {
         return this.aZ;
      }

      @Override
      public String toString() {
         return "RenderType[" + this.b + ":" + this.aZ + "]";
      }
   }

   protected static final class b {
      final fon.e a;
      private final fon.m b;
      private final fon.p c;
      private final fon.d d;
      final fon.c e;
      private final fon.g f;
      private final fon.l g;
      private final fon.f h;
      private final fon.k i;
      private final fon.o j;
      private final fon.q k;
      private final fon.h l;
      private final fon.b m;
      final foo.c n;
      final ImmutableList<fon> o;

      b(
         fon.e $$0,
         fon.m $$1,
         fon.p $$2,
         fon.d $$3,
         fon.c $$4,
         fon.g $$5,
         fon.l $$6,
         fon.f $$7,
         fon.k $$8,
         fon.o $$9,
         fon.q $$10,
         fon.h $$11,
         fon.b $$12,
         foo.c $$13
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
         this.o = ImmutableList.of(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.m, new fon[]{this.l});
      }

      @Override
      public String toString() {
         return "CompositeState[" + this.o + ", outlineProperty=" + this.n + "]";
      }

      public static foo.b.a a() {
         return new foo.b.a();
      }

      public static class a {
         private fon.e a = fon.ao;
         private fon.m b = fon.i;
         private fon.p c;
         private fon.d d;
         private fon.c e;
         private fon.g f;
         private fon.l g;
         private fon.f h;
         private fon.k i;
         private fon.o j;
         private fon.q k;
         private fon.h l;
         private fon.b m;

         a() {
            this.c = fon.c;
            this.d = fon.aA;
            this.e = fon.aw;
            this.f = fon.at;
            this.g = fon.av;
            this.h = fon.aF;
            this.i = fon.aI;
            this.j = fon.ap;
            this.k = fon.aC;
            this.l = fon.aP;
            this.m = fon.aQ;
         }

         public foo.b.a a(fon.e $$0) {
            this.a = $$0;
            return this;
         }

         public foo.b.a a(fon.m $$0) {
            this.b = $$0;
            return this;
         }

         public foo.b.a a(fon.p $$0) {
            this.c = $$0;
            return this;
         }

         public foo.b.a a(fon.d $$0) {
            this.d = $$0;
            return this;
         }

         public foo.b.a a(fon.c $$0) {
            this.e = $$0;
            return this;
         }

         public foo.b.a a(fon.g $$0) {
            this.f = $$0;
            return this;
         }

         public foo.b.a a(fon.l $$0) {
            this.g = $$0;
            return this;
         }

         public foo.b.a a(fon.f $$0) {
            this.h = $$0;
            return this;
         }

         public foo.b.a a(fon.k $$0) {
            this.i = $$0;
            return this;
         }

         public foo.b.a a(fon.o $$0) {
            this.j = $$0;
            return this;
         }

         public foo.b.a a(fon.q $$0) {
            this.k = $$0;
            return this;
         }

         public foo.b.a a(fon.h $$0) {
            this.l = $$0;
            return this;
         }

         public foo.b.a a(fon.b $$0) {
            this.m = $$0;
            return this;
         }

         public foo.b a(boolean $$0) {
            return this.a($$0 ? foo.c.c : foo.c.a);
         }

         public foo.b a(foo.c $$0) {
            return new foo.b(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, $$0);
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
