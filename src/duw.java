import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record duw(duz j, doz k, doz l, dux m, dvi.o n, List<daf.d> o, int p, boolean q, boolean r, boolean s, boolean t) {
   public static final Codec<duw> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               duz.a.fieldOf("noise").forGetter(duw::f),
               doz.b.fieldOf("default_block").forGetter(duw::g),
               doz.b.fieldOf("default_fluid").forGetter(duw::h),
               dux.a.fieldOf("noise_router").forGetter(duw::i),
               dvi.o.b.fieldOf("surface_rule").forGetter(duw::j),
               daf.d.a.listOf().fieldOf("spawn_target").forGetter(duw::k),
               Codec.INT.fieldOf("sea_level").forGetter(duw::l),
               Codec.BOOL.fieldOf("disable_mob_generation").forGetter(duw::a),
               Codec.BOOL.fieldOf("aquifers_enabled").forGetter(duw::b),
               Codec.BOOL.fieldOf("ore_veins_enabled").forGetter(duw::c),
               Codec.BOOL.fieldOf("legacy_random_source").forGetter(duw::n)
            )
            .apply($$0, duw::new)
   );
   public static final Codec<il<duw>> b = ajp.a(ks.aC, a);
   public static final ajs<duw> c = ajs.a(ks.aC, new ajt("overworld"));
   public static final ajs<duw> d = ajs.a(ks.aC, new ajt("large_biomes"));
   public static final ajs<duw> e = ajs.a(ks.aC, new ajt("amplified"));
   public static final ajs<duw> f = ajs.a(ks.aC, new ajt("nether"));
   public static final ajs<duw> g = ajs.a(ks.aC, new ajt("end"));
   public static final ajs<duw> h = ajs.a(ks.aC, new ajt("caves"));
   public static final ajs<duw> i = ajs.a(ks.aC, new ajt("floating_islands"));

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

   public dvq.a d() {
      return this.t ? dvq.a.a : dvq.a.b;
   }

   public static void a(px<duw> $$0) {
      $$0.a(c, a($$0, false, false));
      $$0.a(d, a($$0, false, true));
      $$0.a(e, a($$0, true, false));
      $$0.a(f, c($$0));
      $$0.a(g, b($$0));
      $$0.a(h, d($$0));
      $$0.a(i, e($$0));
   }

   private static duw b(px<?> $$0) {
      return new duw(duz.d, dca.fz.n(), dca.a.n(), duy.a($$0.a(ks.az)), qk.c(), List.of(), 0, true, false, false, true);
   }

   private static duw c(px<?> $$0) {
      return new duw(duz.c, dca.dV.n(), dca.H.n(), duy.a($$0.a(ks.az), $$0.a(ks.aD)), qk.b(), List.of(), 32, false, false, false, true);
   }

   private static duw a(px<?> $$0, boolean $$1, boolean $$2) {
      return new duw(duz.b, dca.b.n(), dca.G.n(), duy.a($$0.a(ks.az), $$0.a(ks.aD), $$2, $$1), qk.a(), new dam().a(), 63, false, true, true, false);
   }

   private static duw d(px<?> $$0) {
      return new duw(duz.e, dca.b.n(), dca.G.n(), duy.b($$0.a(ks.az), $$0.a(ks.aD)), qk.a(false, true, true), List.of(), 32, false, false, false, true);
   }

   private static duw e(px<?> $$0) {
      return new duw(duz.f, dca.b.n(), dca.G.n(), duy.c($$0.a(ks.az), $$0.a(ks.aD)), qk.a(false, false, false), List.of(), -64, false, false, false, true);
   }

   public static duw e() {
      return new duw(duz.b, dca.b.n(), dca.a.n(), duy.a(), qk.d(), List.of(), 63, true, false, false, false);
   }

   public duz f() {
      return this.j;
   }

   public doz g() {
      return this.k;
   }

   public doz h() {
      return this.l;
   }

   public dux i() {
      return this.m;
   }

   public dvi.o j() {
      return this.n;
   }

   public List<daf.d> k() {
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
