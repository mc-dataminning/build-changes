import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record dpd(dpg j, djp k, djp l, dpe m, dpp.o n, List<cvf.d> o, int p, boolean q, boolean r, boolean s, boolean t) {
   public static final Codec<dpd> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dpg.a.fieldOf("noise").forGetter(dpd::f),
               djp.b.fieldOf("default_block").forGetter(dpd::g),
               djp.b.fieldOf("default_fluid").forGetter(dpd::h),
               dpe.a.fieldOf("noise_router").forGetter(dpd::i),
               dpp.o.b.fieldOf("surface_rule").forGetter(dpd::j),
               cvf.d.a.listOf().fieldOf("spawn_target").forGetter(dpd::k),
               Codec.INT.fieldOf("sea_level").forGetter(dpd::l),
               Codec.BOOL.fieldOf("disable_mob_generation").forGetter(dpd::a),
               Codec.BOOL.fieldOf("aquifers_enabled").forGetter(dpd::b),
               Codec.BOOL.fieldOf("ore_veins_enabled").forGetter(dpd::c),
               Codec.BOOL.fieldOf("legacy_random_source").forGetter(dpd::n)
            )
            .apply($$0, dpd::new)
   );
   public static final Codec<ih<dpd>> b = ahd.a(ke.aA, a);
   public static final ahg<dpd> c = ahg.a(ke.aA, new ahh("overworld"));
   public static final ahg<dpd> d = ahg.a(ke.aA, new ahh("large_biomes"));
   public static final ahg<dpd> e = ahg.a(ke.aA, new ahh("amplified"));
   public static final ahg<dpd> f = ahg.a(ke.aA, new ahh("nether"));
   public static final ahg<dpd> g = ahg.a(ke.aA, new ahh("end"));
   public static final ahg<dpd> h = ahg.a(ke.aA, new ahh("caves"));
   public static final ahg<dpd> i = ahg.a(ke.aA, new ahh("floating_islands"));

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

   public dpx.a d() {
      return this.t ? dpx.a.a : dpx.a.b;
   }

   public static void a(pf<dpd> $$0) {
      $$0.a(c, a($$0, false, false));
      $$0.a(d, a($$0, false, true));
      $$0.a(e, a($$0, true, false));
      $$0.a(f, c($$0));
      $$0.a(g, b($$0));
      $$0.a(h, d($$0));
      $$0.a(i, e($$0));
   }

   private static dpd b(pf<?> $$0) {
      return new dpd(dpg.d, cxa.fz.o(), cxa.a.o(), dpf.a($$0.a(ke.ax)), ps.c(), List.of(), 0, true, false, false, true);
   }

   private static dpd c(pf<?> $$0) {
      return new dpd(dpg.c, cxa.dV.o(), cxa.H.o(), dpf.a($$0.a(ke.ax), $$0.a(ke.aB)), ps.b(), List.of(), 32, false, false, false, true);
   }

   private static dpd a(pf<?> $$0, boolean $$1, boolean $$2) {
      return new dpd(dpg.b, cxa.b.o(), cxa.G.o(), dpf.a($$0.a(ke.ax), $$0.a(ke.aB), $$2, $$1), ps.a(), new cvm().a(), 63, false, true, true, false);
   }

   private static dpd d(pf<?> $$0) {
      return new dpd(dpg.e, cxa.b.o(), cxa.G.o(), dpf.b($$0.a(ke.ax), $$0.a(ke.aB)), ps.a(false, true, true), List.of(), 32, false, false, false, true);
   }

   private static dpd e(pf<?> $$0) {
      return new dpd(dpg.f, cxa.b.o(), cxa.G.o(), dpf.c($$0.a(ke.ax), $$0.a(ke.aB)), ps.a(false, false, false), List.of(), -64, false, false, false, true);
   }

   public static dpd e() {
      return new dpd(dpg.b, cxa.b.o(), cxa.a.o(), dpf.a(), ps.d(), List.of(), 63, true, false, false, false);
   }

   public dpg f() {
      return this.j;
   }

   public djp g() {
      return this.k;
   }

   public djp h() {
      return this.l;
   }

   public dpe i() {
      return this.m;
   }

   public dpp.o j() {
      return this.n;
   }

   public List<cvf.d> k() {
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
