import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record doo(dor j, dja k, dja l, dop m, dpa.o n, List<cuq.d> o, int p, boolean q, boolean r, boolean s, boolean t) {
   public static final Codec<doo> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dor.a.fieldOf("noise").forGetter(doo::f),
               dja.b.fieldOf("default_block").forGetter(doo::g),
               dja.b.fieldOf("default_fluid").forGetter(doo::h),
               dop.a.fieldOf("noise_router").forGetter(doo::i),
               dpa.o.b.fieldOf("surface_rule").forGetter(doo::j),
               cuq.d.a.listOf().fieldOf("spawn_target").forGetter(doo::k),
               Codec.INT.fieldOf("sea_level").forGetter(doo::l),
               Codec.BOOL.fieldOf("disable_mob_generation").forGetter(doo::a),
               Codec.BOOL.fieldOf("aquifers_enabled").forGetter(doo::b),
               Codec.BOOL.fieldOf("ore_veins_enabled").forGetter(doo::c),
               Codec.BOOL.fieldOf("legacy_random_source").forGetter(doo::n)
            )
            .apply($$0, doo::new)
   );
   public static final Codec<ih<doo>> b = agz.a(ke.aA, a);
   public static final ahc<doo> c = ahc.a(ke.aA, new ahd("overworld"));
   public static final ahc<doo> d = ahc.a(ke.aA, new ahd("large_biomes"));
   public static final ahc<doo> e = ahc.a(ke.aA, new ahd("amplified"));
   public static final ahc<doo> f = ahc.a(ke.aA, new ahd("nether"));
   public static final ahc<doo> g = ahc.a(ke.aA, new ahd("end"));
   public static final ahc<doo> h = ahc.a(ke.aA, new ahd("caves"));
   public static final ahc<doo> i = ahc.a(ke.aA, new ahd("floating_islands"));

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

   public dpi.a d() {
      return this.t ? dpi.a.a : dpi.a.b;
   }

   public static void a(pc<doo> $$0) {
      $$0.a(c, a($$0, false, false));
      $$0.a(d, a($$0, false, true));
      $$0.a(e, a($$0, true, false));
      $$0.a(f, c($$0));
      $$0.a(g, b($$0));
      $$0.a(h, d($$0));
      $$0.a(i, e($$0));
   }

   private static doo b(pc<?> $$0) {
      return new doo(dor.d, cwl.fz.o(), cwl.a.o(), doq.a($$0.a(ke.ax)), pp.c(), List.of(), 0, true, false, false, true);
   }

   private static doo c(pc<?> $$0) {
      return new doo(dor.c, cwl.dV.o(), cwl.H.o(), doq.a($$0.a(ke.ax), $$0.a(ke.aB)), pp.b(), List.of(), 32, false, false, false, true);
   }

   private static doo a(pc<?> $$0, boolean $$1, boolean $$2) {
      return new doo(dor.b, cwl.b.o(), cwl.G.o(), doq.a($$0.a(ke.ax), $$0.a(ke.aB), $$2, $$1), pp.a(), new cux().a(), 63, false, true, true, false);
   }

   private static doo d(pc<?> $$0) {
      return new doo(dor.e, cwl.b.o(), cwl.G.o(), doq.b($$0.a(ke.ax), $$0.a(ke.aB)), pp.a(false, true, true), List.of(), 32, false, false, false, true);
   }

   private static doo e(pc<?> $$0) {
      return new doo(dor.f, cwl.b.o(), cwl.G.o(), doq.c($$0.a(ke.ax), $$0.a(ke.aB)), pp.a(false, false, false), List.of(), -64, false, false, false, true);
   }

   public static doo e() {
      return new doo(dor.b, cwl.b.o(), cwl.a.o(), doq.a(), pp.d(), List.of(), 63, true, false, false, false);
   }

   public dor f() {
      return this.j;
   }

   public dja g() {
      return this.k;
   }

   public dja h() {
      return this.l;
   }

   public dop i() {
      return this.m;
   }

   public dpa.o j() {
      return this.n;
   }

   public List<cuq.d> k() {
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
