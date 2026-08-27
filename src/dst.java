import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record dst(dsw j, dnb k, dnb l, dsu m, dtf.o n, List<cyj.d> o, int p, boolean q, boolean r, boolean s, boolean t) {
   public static final Codec<dst> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dsw.a.fieldOf("noise").forGetter(dst::f),
               dnb.b.fieldOf("default_block").forGetter(dst::g),
               dnb.b.fieldOf("default_fluid").forGetter(dst::h),
               dsu.a.fieldOf("noise_router").forGetter(dst::i),
               dtf.o.b.fieldOf("surface_rule").forGetter(dst::j),
               cyj.d.a.listOf().fieldOf("spawn_target").forGetter(dst::k),
               Codec.INT.fieldOf("sea_level").forGetter(dst::l),
               Codec.BOOL.fieldOf("disable_mob_generation").forGetter(dst::a),
               Codec.BOOL.fieldOf("aquifers_enabled").forGetter(dst::b),
               Codec.BOOL.fieldOf("ore_veins_enabled").forGetter(dst::c),
               Codec.BOOL.fieldOf("legacy_random_source").forGetter(dst::n)
            )
            .apply($$0, dst::new)
   );
   public static final Codec<il<dst>> b = ajd.a(kj.aB, a);
   public static final ajg<dst> c = ajg.a(kj.aB, new ajh("overworld"));
   public static final ajg<dst> d = ajg.a(kj.aB, new ajh("large_biomes"));
   public static final ajg<dst> e = ajg.a(kj.aB, new ajh("amplified"));
   public static final ajg<dst> f = ajg.a(kj.aB, new ajh("nether"));
   public static final ajg<dst> g = ajg.a(kj.aB, new ajh("end"));
   public static final ajg<dst> h = ajg.a(kj.aB, new ajh("caves"));
   public static final ajg<dst> i = ajg.a(kj.aB, new ajh("floating_islands"));

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

   public dtn.a d() {
      return this.t ? dtn.a.a : dtn.a.b;
   }

   public static void a(pl<dst> $$0) {
      $$0.a(c, a($$0, false, false));
      $$0.a(d, a($$0, false, true));
      $$0.a(e, a($$0, true, false));
      $$0.a(f, c($$0));
      $$0.a(g, b($$0));
      $$0.a(h, d($$0));
      $$0.a(i, e($$0));
   }

   private static dst b(pl<?> $$0) {
      return new dst(dsw.d, dae.fz.o(), dae.a.o(), dsv.a($$0.a(kj.ay)), py.c(), List.of(), 0, true, false, false, true);
   }

   private static dst c(pl<?> $$0) {
      return new dst(dsw.c, dae.dV.o(), dae.H.o(), dsv.a($$0.a(kj.ay), $$0.a(kj.aC)), py.b(), List.of(), 32, false, false, false, true);
   }

   private static dst a(pl<?> $$0, boolean $$1, boolean $$2) {
      return new dst(dsw.b, dae.b.o(), dae.G.o(), dsv.a($$0.a(kj.ay), $$0.a(kj.aC), $$2, $$1), py.a(), new cyq().a(), 63, false, true, true, false);
   }

   private static dst d(pl<?> $$0) {
      return new dst(dsw.e, dae.b.o(), dae.G.o(), dsv.b($$0.a(kj.ay), $$0.a(kj.aC)), py.a(false, true, true), List.of(), 32, false, false, false, true);
   }

   private static dst e(pl<?> $$0) {
      return new dst(dsw.f, dae.b.o(), dae.G.o(), dsv.c($$0.a(kj.ay), $$0.a(kj.aC)), py.a(false, false, false), List.of(), -64, false, false, false, true);
   }

   public static dst e() {
      return new dst(dsw.b, dae.b.o(), dae.a.o(), dsv.a(), py.d(), List.of(), 63, true, false, false, false);
   }

   public dsw f() {
      return this.j;
   }

   public dnb g() {
      return this.k;
   }

   public dnb h() {
      return this.l;
   }

   public dsu i() {
      return this.m;
   }

   public dtf.o j() {
      return this.n;
   }

   public List<cyj.d> k() {
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
