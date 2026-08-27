import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record dov(doy j, djh k, djh l, dow m, dph.o n, List<cux.d> o, int p, boolean q, boolean r, boolean s, boolean t) {
   public static final Codec<dov> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               doy.a.fieldOf("noise").forGetter(dov::f),
               djh.b.fieldOf("default_block").forGetter(dov::g),
               djh.b.fieldOf("default_fluid").forGetter(dov::h),
               dow.a.fieldOf("noise_router").forGetter(dov::i),
               dph.o.b.fieldOf("surface_rule").forGetter(dov::j),
               cux.d.a.listOf().fieldOf("spawn_target").forGetter(dov::k),
               Codec.INT.fieldOf("sea_level").forGetter(dov::l),
               Codec.BOOL.fieldOf("disable_mob_generation").forGetter(dov::a),
               Codec.BOOL.fieldOf("aquifers_enabled").forGetter(dov::b),
               Codec.BOOL.fieldOf("ore_veins_enabled").forGetter(dov::c),
               Codec.BOOL.fieldOf("legacy_random_source").forGetter(dov::n)
            )
            .apply($$0, dov::new)
   );
   public static final Codec<ih<dov>> b = ahc.a(ke.aA, a);
   public static final ahf<dov> c = ahf.a(ke.aA, new ahg("overworld"));
   public static final ahf<dov> d = ahf.a(ke.aA, new ahg("large_biomes"));
   public static final ahf<dov> e = ahf.a(ke.aA, new ahg("amplified"));
   public static final ahf<dov> f = ahf.a(ke.aA, new ahg("nether"));
   public static final ahf<dov> g = ahf.a(ke.aA, new ahg("end"));
   public static final ahf<dov> h = ahf.a(ke.aA, new ahg("caves"));
   public static final ahf<dov> i = ahf.a(ke.aA, new ahg("floating_islands"));

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

   public dpp.a d() {
      return this.t ? dpp.a.a : dpp.a.b;
   }

   public static void a(pe<dov> $$0) {
      $$0.a(c, a($$0, false, false));
      $$0.a(d, a($$0, false, true));
      $$0.a(e, a($$0, true, false));
      $$0.a(f, c($$0));
      $$0.a(g, b($$0));
      $$0.a(h, d($$0));
      $$0.a(i, e($$0));
   }

   private static dov b(pe<?> $$0) {
      return new dov(doy.d, cws.fz.o(), cws.a.o(), dox.a($$0.a(ke.ax)), pr.c(), List.of(), 0, true, false, false, true);
   }

   private static dov c(pe<?> $$0) {
      return new dov(doy.c, cws.dV.o(), cws.H.o(), dox.a($$0.a(ke.ax), $$0.a(ke.aB)), pr.b(), List.of(), 32, false, false, false, true);
   }

   private static dov a(pe<?> $$0, boolean $$1, boolean $$2) {
      return new dov(doy.b, cws.b.o(), cws.G.o(), dox.a($$0.a(ke.ax), $$0.a(ke.aB), $$2, $$1), pr.a(), new cve().a(), 63, false, true, true, false);
   }

   private static dov d(pe<?> $$0) {
      return new dov(doy.e, cws.b.o(), cws.G.o(), dox.b($$0.a(ke.ax), $$0.a(ke.aB)), pr.a(false, true, true), List.of(), 32, false, false, false, true);
   }

   private static dov e(pe<?> $$0) {
      return new dov(doy.f, cws.b.o(), cws.G.o(), dox.c($$0.a(ke.ax), $$0.a(ke.aB)), pr.a(false, false, false), List.of(), -64, false, false, false, true);
   }

   public static dov e() {
      return new dov(doy.b, cws.b.o(), cws.a.o(), dox.a(), pr.d(), List.of(), 63, true, false, false, false);
   }

   public doy f() {
      return this.j;
   }

   public djh g() {
      return this.k;
   }

   public djh h() {
      return this.l;
   }

   public dow i() {
      return this.m;
   }

   public dph.o j() {
      return this.n;
   }

   public List<cux.d> k() {
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
