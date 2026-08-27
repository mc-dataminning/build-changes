import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record dsr(dsu j, dmz k, dmz l, dss m, dtd.o n, List<cyh.d> o, int p, boolean q, boolean r, boolean s, boolean t) {
   public static final Codec<dsr> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dsu.a.fieldOf("noise").forGetter(dsr::f),
               dmz.b.fieldOf("default_block").forGetter(dsr::g),
               dmz.b.fieldOf("default_fluid").forGetter(dsr::h),
               dss.a.fieldOf("noise_router").forGetter(dsr::i),
               dtd.o.b.fieldOf("surface_rule").forGetter(dsr::j),
               cyh.d.a.listOf().fieldOf("spawn_target").forGetter(dsr::k),
               Codec.INT.fieldOf("sea_level").forGetter(dsr::l),
               Codec.BOOL.fieldOf("disable_mob_generation").forGetter(dsr::a),
               Codec.BOOL.fieldOf("aquifers_enabled").forGetter(dsr::b),
               Codec.BOOL.fieldOf("ore_veins_enabled").forGetter(dsr::c),
               Codec.BOOL.fieldOf("legacy_random_source").forGetter(dsr::n)
            )
            .apply($$0, dsr::new)
   );
   public static final Codec<il<dsr>> b = ajd.a(kj.aB, a);
   public static final ajg<dsr> c = ajg.a(kj.aB, new ajh("overworld"));
   public static final ajg<dsr> d = ajg.a(kj.aB, new ajh("large_biomes"));
   public static final ajg<dsr> e = ajg.a(kj.aB, new ajh("amplified"));
   public static final ajg<dsr> f = ajg.a(kj.aB, new ajh("nether"));
   public static final ajg<dsr> g = ajg.a(kj.aB, new ajh("end"));
   public static final ajg<dsr> h = ajg.a(kj.aB, new ajh("caves"));
   public static final ajg<dsr> i = ajg.a(kj.aB, new ajh("floating_islands"));

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

   public dtl.a d() {
      return this.t ? dtl.a.a : dtl.a.b;
   }

   public static void a(pl<dsr> $$0) {
      $$0.a(c, a($$0, false, false));
      $$0.a(d, a($$0, false, true));
      $$0.a(e, a($$0, true, false));
      $$0.a(f, c($$0));
      $$0.a(g, b($$0));
      $$0.a(h, d($$0));
      $$0.a(i, e($$0));
   }

   private static dsr b(pl<?> $$0) {
      return new dsr(dsu.d, dac.fz.o(), dac.a.o(), dst.a($$0.a(kj.ay)), py.c(), List.of(), 0, true, false, false, true);
   }

   private static dsr c(pl<?> $$0) {
      return new dsr(dsu.c, dac.dV.o(), dac.H.o(), dst.a($$0.a(kj.ay), $$0.a(kj.aC)), py.b(), List.of(), 32, false, false, false, true);
   }

   private static dsr a(pl<?> $$0, boolean $$1, boolean $$2) {
      return new dsr(dsu.b, dac.b.o(), dac.G.o(), dst.a($$0.a(kj.ay), $$0.a(kj.aC), $$2, $$1), py.a(), new cyo().a(), 63, false, true, true, false);
   }

   private static dsr d(pl<?> $$0) {
      return new dsr(dsu.e, dac.b.o(), dac.G.o(), dst.b($$0.a(kj.ay), $$0.a(kj.aC)), py.a(false, true, true), List.of(), 32, false, false, false, true);
   }

   private static dsr e(pl<?> $$0) {
      return new dsr(dsu.f, dac.b.o(), dac.G.o(), dst.c($$0.a(kj.ay), $$0.a(kj.aC)), py.a(false, false, false), List.of(), -64, false, false, false, true);
   }

   public static dsr e() {
      return new dsr(dsu.b, dac.b.o(), dac.a.o(), dst.a(), py.d(), List.of(), 63, true, false, false, false);
   }

   public dsu f() {
      return this.j;
   }

   public dmz g() {
      return this.k;
   }

   public dmz h() {
      return this.l;
   }

   public dss i() {
      return this.m;
   }

   public dtd.o j() {
      return this.n;
   }

   public List<cyh.d> k() {
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
