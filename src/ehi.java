import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record ehi(ehl j, ebe k, ebe l, ehj m, ehu.o n, List<dlj.d> o, int p, boolean q, boolean r, boolean s, boolean t) {
   public static final Codec<ehi> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ehl.a.fieldOf("noise").forGetter(ehi::f),
               ebe.a.fieldOf("default_block").forGetter(ehi::g),
               ebe.a.fieldOf("default_fluid").forGetter(ehi::h),
               ehj.a.fieldOf("noise_router").forGetter(ehi::i),
               ehu.o.b.fieldOf("surface_rule").forGetter(ehi::j),
               dlj.d.a.listOf().fieldOf("spawn_target").forGetter(ehi::k),
               Codec.INT.fieldOf("sea_level").forGetter(ehi::l),
               Codec.BOOL.fieldOf("disable_mob_generation").forGetter(ehi::a),
               Codec.BOOL.fieldOf("aquifers_enabled").forGetter(ehi::b),
               Codec.BOOL.fieldOf("ore_veins_enabled").forGetter(ehi::c),
               Codec.BOOL.fieldOf("legacy_random_source").forGetter(ehi::n)
            )
            .apply($$0, ehi::new)
   );
   public static final Codec<jf<ehi>> b = ale.a(mh.aX, a);
   public static final alh<ehi> c = alh.a(mh.aX, ali.b("overworld"));
   public static final alh<ehi> d = alh.a(mh.aX, ali.b("large_biomes"));
   public static final alh<ehi> e = alh.a(mh.aX, ali.b("amplified"));
   public static final alh<ehi> f = alh.a(mh.aX, ali.b("nether"));
   public static final alh<ehi> g = alh.a(mh.aX, ali.b("end"));
   public static final alh<ehi> h = alh.a(mh.aX, ali.b("caves"));
   public static final alh<ehi> i = alh.a(mh.aX, ali.b("floating_islands"));

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

   public eic.a d() {
      return this.t ? eic.a.a : eic.a.b;
   }

   public static void a(qh<ehi> $$0) {
      $$0.a(c, a($$0, false, false));
      $$0.a(d, a($$0, false, true));
      $$0.a(e, a($$0, true, false));
      $$0.a(f, c($$0));
      $$0.a(g, b($$0));
      $$0.a(h, d($$0));
      $$0.a(i, e($$0));
   }

   private static ehi b(qh<?> $$0) {
      return new ehi(ehl.d, dne.fY.m(), dne.a.m(), ehk.a($$0.a(mh.aO)), qu.c(), List.of(), 0, true, false, false, true);
   }

   private static ehi c(qh<?> $$0) {
      return new ehi(ehl.c, dne.em.m(), dne.K.m(), ehk.a($$0.a(mh.aO), $$0.a(mh.aY)), qu.b(), List.of(), 32, false, false, false, true);
   }

   private static ehi a(qh<?> $$0, boolean $$1, boolean $$2) {
      return new ehi(ehl.b, dne.b.m(), dne.J.m(), ehk.a($$0.a(mh.aO), $$0.a(mh.aY), $$2, $$1), qu.a(), new dlq().a(), 63, false, true, true, false);
   }

   private static ehi d(qh<?> $$0) {
      return new ehi(ehl.e, dne.b.m(), dne.J.m(), ehk.b($$0.a(mh.aO), $$0.a(mh.aY)), qu.a(false, true, true), List.of(), 32, false, false, false, true);
   }

   private static ehi e(qh<?> $$0) {
      return new ehi(ehl.f, dne.b.m(), dne.J.m(), ehk.c($$0.a(mh.aO), $$0.a(mh.aY)), qu.a(false, false, false), List.of(), -64, false, false, false, true);
   }

   public static ehi e() {
      return new ehi(ehl.b, dne.b.m(), dne.a.m(), ehk.a(), qu.d(), List.of(), 63, true, false, false, false);
   }

   public ehl f() {
      return this.j;
   }

   public ebe g() {
      return this.k;
   }

   public ebe h() {
      return this.l;
   }

   public ehj i() {
      return this.m;
   }

   public ehu.o j() {
      return this.n;
   }

   public List<dlj.d> k() {
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
