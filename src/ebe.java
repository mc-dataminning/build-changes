import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record ebe(ebh j, dvd k, dvd l, ebf m, ebq.o n, List<dgf.d> o, int p, boolean q, boolean r, boolean s, boolean t) {
   public static final Codec<ebe> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ebh.a.fieldOf("noise").forGetter(ebe::f),
               dvd.a.fieldOf("default_block").forGetter(ebe::g),
               dvd.a.fieldOf("default_fluid").forGetter(ebe::h),
               ebf.a.fieldOf("noise_router").forGetter(ebe::i),
               ebq.o.b.fieldOf("surface_rule").forGetter(ebe::j),
               dgf.d.a.listOf().fieldOf("spawn_target").forGetter(ebe::k),
               Codec.INT.fieldOf("sea_level").forGetter(ebe::l),
               Codec.BOOL.fieldOf("disable_mob_generation").forGetter(ebe::a),
               Codec.BOOL.fieldOf("aquifers_enabled").forGetter(ebe::b),
               Codec.BOOL.fieldOf("ore_veins_enabled").forGetter(ebe::c),
               Codec.BOOL.fieldOf("legacy_random_source").forGetter(ebe::n)
            )
            .apply($$0, ebe::new)
   );
   public static final Codec<jp<ebe>> b = ald.a(ly.aP, a);
   public static final alg<ebe> c = alg.a(ly.aP, alh.b("overworld"));
   public static final alg<ebe> d = alg.a(ly.aP, alh.b("large_biomes"));
   public static final alg<ebe> e = alg.a(ly.aP, alh.b("amplified"));
   public static final alg<ebe> f = alg.a(ly.aP, alh.b("nether"));
   public static final alg<ebe> g = alg.a(ly.aP, alh.b("end"));
   public static final alg<ebe> h = alg.a(ly.aP, alh.b("caves"));
   public static final alg<ebe> i = alg.a(ly.aP, alh.b("floating_islands"));

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

   public eby.a d() {
      return this.t ? eby.a.a : eby.a.b;
   }

   public static void a(qx<ebe> $$0) {
      $$0.a(c, a($$0, false, false));
      $$0.a(d, a($$0, false, true));
      $$0.a(e, a($$0, true, false));
      $$0.a(f, c($$0));
      $$0.a(g, b($$0));
      $$0.a(h, d($$0));
      $$0.a(i, e($$0));
   }

   private static ebe b(qx<?> $$0) {
      return new ebe(ebh.d, dia.fz.m(), dia.a.m(), ebg.a($$0.a(ly.aK)), rk.c(), List.of(), 0, true, false, false, true);
   }

   private static ebe c(qx<?> $$0) {
      return new ebe(ebh.c, dia.dV.m(), dia.H.m(), ebg.a($$0.a(ly.aK), $$0.a(ly.aQ)), rk.b(), List.of(), 32, false, false, false, true);
   }

   private static ebe a(qx<?> $$0, boolean $$1, boolean $$2) {
      return new ebe(ebh.b, dia.b.m(), dia.G.m(), ebg.a($$0.a(ly.aK), $$0.a(ly.aQ), $$2, $$1), rk.a(), new dgm().a(), 63, false, true, true, false);
   }

   private static ebe d(qx<?> $$0) {
      return new ebe(ebh.e, dia.b.m(), dia.G.m(), ebg.b($$0.a(ly.aK), $$0.a(ly.aQ)), rk.a(false, true, true), List.of(), 32, false, false, false, true);
   }

   private static ebe e(qx<?> $$0) {
      return new ebe(ebh.f, dia.b.m(), dia.G.m(), ebg.c($$0.a(ly.aK), $$0.a(ly.aQ)), rk.a(false, false, false), List.of(), -64, false, false, false, true);
   }

   public static ebe e() {
      return new ebe(ebh.b, dia.b.m(), dia.a.m(), ebg.a(), rk.d(), List.of(), 63, true, false, false, false);
   }

   public ebh f() {
      return this.j;
   }

   public dvd g() {
      return this.k;
   }

   public dvd h() {
      return this.l;
   }

   public ebf i() {
      return this.m;
   }

   public ebq.o j() {
      return this.n;
   }

   public List<dgf.d> k() {
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
