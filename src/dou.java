import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record dou(dox j, djg k, djg l, dov m, dpg.o n, List<cuw.d> o, int p, boolean q, boolean r, boolean s, boolean t) {
   public static final Codec<dou> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dox.a.fieldOf("noise").forGetter(dou::f),
               djg.b.fieldOf("default_block").forGetter(dou::g),
               djg.b.fieldOf("default_fluid").forGetter(dou::h),
               dov.a.fieldOf("noise_router").forGetter(dou::i),
               dpg.o.b.fieldOf("surface_rule").forGetter(dou::j),
               cuw.d.a.listOf().fieldOf("spawn_target").forGetter(dou::k),
               Codec.INT.fieldOf("sea_level").forGetter(dou::l),
               Codec.BOOL.fieldOf("disable_mob_generation").forGetter(dou::a),
               Codec.BOOL.fieldOf("aquifers_enabled").forGetter(dou::b),
               Codec.BOOL.fieldOf("ore_veins_enabled").forGetter(dou::c),
               Codec.BOOL.fieldOf("legacy_random_source").forGetter(dou::n)
            )
            .apply($$0, dou::new)
   );
   public static final Codec<ih<dou>> b = ahc.a(ke.aA, a);
   public static final ahf<dou> c = ahf.a(ke.aA, new ahg("overworld"));
   public static final ahf<dou> d = ahf.a(ke.aA, new ahg("large_biomes"));
   public static final ahf<dou> e = ahf.a(ke.aA, new ahg("amplified"));
   public static final ahf<dou> f = ahf.a(ke.aA, new ahg("nether"));
   public static final ahf<dou> g = ahf.a(ke.aA, new ahg("end"));
   public static final ahf<dou> h = ahf.a(ke.aA, new ahg("caves"));
   public static final ahf<dou> i = ahf.a(ke.aA, new ahg("floating_islands"));

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

   public dpo.a d() {
      return this.t ? dpo.a.a : dpo.a.b;
   }

   public static void a(pe<dou> $$0) {
      $$0.a(c, a($$0, false, false));
      $$0.a(d, a($$0, false, true));
      $$0.a(e, a($$0, true, false));
      $$0.a(f, c($$0));
      $$0.a(g, b($$0));
      $$0.a(h, d($$0));
      $$0.a(i, e($$0));
   }

   private static dou b(pe<?> $$0) {
      return new dou(dox.d, cwr.fz.o(), cwr.a.o(), dow.a($$0.a(ke.ax)), pr.c(), List.of(), 0, true, false, false, true);
   }

   private static dou c(pe<?> $$0) {
      return new dou(dox.c, cwr.dV.o(), cwr.H.o(), dow.a($$0.a(ke.ax), $$0.a(ke.aB)), pr.b(), List.of(), 32, false, false, false, true);
   }

   private static dou a(pe<?> $$0, boolean $$1, boolean $$2) {
      return new dou(dox.b, cwr.b.o(), cwr.G.o(), dow.a($$0.a(ke.ax), $$0.a(ke.aB), $$2, $$1), pr.a(), new cvd().a(), 63, false, true, true, false);
   }

   private static dou d(pe<?> $$0) {
      return new dou(dox.e, cwr.b.o(), cwr.G.o(), dow.b($$0.a(ke.ax), $$0.a(ke.aB)), pr.a(false, true, true), List.of(), 32, false, false, false, true);
   }

   private static dou e(pe<?> $$0) {
      return new dou(dox.f, cwr.b.o(), cwr.G.o(), dow.c($$0.a(ke.ax), $$0.a(ke.aB)), pr.a(false, false, false), List.of(), -64, false, false, false, true);
   }

   public static dou e() {
      return new dou(dox.b, cwr.b.o(), cwr.a.o(), dow.a(), pr.d(), List.of(), 63, true, false, false, false);
   }

   public dox f() {
      return this.j;
   }

   public djg g() {
      return this.k;
   }

   public djg h() {
      return this.l;
   }

   public dov i() {
      return this.m;
   }

   public dpg.o j() {
      return this.n;
   }

   public List<cuw.d> k() {
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
