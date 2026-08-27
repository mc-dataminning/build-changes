import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record dkr(dku j, dfd k, dfd l, dks m, dld.o n, List<cri.d> o, int p, boolean q, boolean r, boolean s, boolean t) {
   public static final Codec<dkr> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dku.a.fieldOf("noise").forGetter(dkr::f),
               dfd.b.fieldOf("default_block").forGetter(dkr::g),
               dfd.b.fieldOf("default_fluid").forGetter(dkr::h),
               dks.a.fieldOf("noise_router").forGetter(dkr::i),
               dld.o.b.fieldOf("surface_rule").forGetter(dkr::j),
               cri.d.a.listOf().fieldOf("spawn_target").forGetter(dkr::k),
               Codec.INT.fieldOf("sea_level").forGetter(dkr::l),
               Codec.BOOL.fieldOf("disable_mob_generation").forGetter(dkr::a),
               Codec.BOOL.fieldOf("aquifers_enabled").forGetter(dkr::b),
               Codec.BOOL.fieldOf("ore_veins_enabled").forGetter(dkr::c),
               Codec.BOOL.fieldOf("legacy_random_source").forGetter(dkr::n)
            )
            .apply($$0, dkr::new)
   );
   public static final Codec<he<dkr>> b = aev.a(jc.ax, a);
   public static final aey<dkr> c = aey.a(jc.ax, new aez("overworld"));
   public static final aey<dkr> d = aey.a(jc.ax, new aez("large_biomes"));
   public static final aey<dkr> e = aey.a(jc.ax, new aez("amplified"));
   public static final aey<dkr> f = aey.a(jc.ax, new aez("nether"));
   public static final aey<dkr> g = aey.a(jc.ax, new aez("end"));
   public static final aey<dkr> h = aey.a(jc.ax, new aez("caves"));
   public static final aey<dkr> i = aey.a(jc.ax, new aez("floating_islands"));

   @Deprecated
   public boolean a() {
      return this.q;
   }

   public boolean b() {
      return this.r;
   }

   public boolean c() {
      return this.s;
   }

   public dll.a d() {
      return this.t ? dll.a.a : dll.a.b;
   }

   public static void a(nr<dkr> $$0) {
      $$0.a(c, a($$0, false, false));
      $$0.a(d, a($$0, false, true));
      $$0.a(e, a($$0, true, false));
      $$0.a(f, c($$0));
      $$0.a(g, b($$0));
      $$0.a(h, d($$0));
      $$0.a(i, e($$0));
   }

   private static dkr b(nr<?> $$0) {
      return new dkr(dku.d, cte.fz.o(), cte.a.o(), dkt.a($$0.a(jc.au)), oe.c(), List.of(), 0, true, false, false, true);
   }

   private static dkr c(nr<?> $$0) {
      return new dkr(dku.c, cte.dV.o(), cte.H.o(), dkt.a($$0.a(jc.au), $$0.a(jc.ay)), oe.b(), List.of(), 32, false, false, false, true);
   }

   private static dkr a(nr<?> $$0, boolean $$1, boolean $$2) {
      return new dkr(dku.b, cte.b.o(), cte.G.o(), dkt.a($$0.a(jc.au), $$0.a(jc.ay), $$2, $$1), oe.a(), new crp().a(), 63, false, true, true, false);
   }

   private static dkr d(nr<?> $$0) {
      return new dkr(dku.e, cte.b.o(), cte.G.o(), dkt.b($$0.a(jc.au), $$0.a(jc.ay)), oe.a(false, true, true), List.of(), 32, false, false, false, true);
   }

   private static dkr e(nr<?> $$0) {
      return new dkr(dku.f, cte.b.o(), cte.G.o(), dkt.c($$0.a(jc.au), $$0.a(jc.ay)), oe.a(false, false, false), List.of(), -64, false, false, false, true);
   }

   public static dkr e() {
      return new dkr(dku.b, cte.b.o(), cte.a.o(), dkt.a(), oe.d(), List.of(), 63, true, false, false, false);
   }

   public dku f() {
      return this.j;
   }

   public dfd g() {
      return this.k;
   }

   public dfd h() {
      return this.l;
   }

   public dks i() {
      return this.m;
   }

   public dld.o j() {
      return this.n;
   }

   public List<cri.d> k() {
      return this.o;
   }

   public int l() {
      return this.p;
   }

   public boolean m() {
      return this.r;
   }

   public boolean n() {
      return this.t;
   }
}
