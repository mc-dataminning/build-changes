import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record egd(egg j, dzz k, dzz l, ege m, egp.o n, List<dkh.d> o, int p, boolean q, boolean r, boolean s, boolean t) {
   public static final Codec<egd> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               egg.a.fieldOf("noise").forGetter(egd::f),
               dzz.a.fieldOf("default_block").forGetter(egd::g),
               dzz.a.fieldOf("default_fluid").forGetter(egd::h),
               ege.a.fieldOf("noise_router").forGetter(egd::i),
               egp.o.b.fieldOf("surface_rule").forGetter(egd::j),
               dkh.d.a.listOf().fieldOf("spawn_target").forGetter(egd::k),
               Codec.INT.fieldOf("sea_level").forGetter(egd::l),
               Codec.BOOL.fieldOf("disable_mob_generation").forGetter(egd::a),
               Codec.BOOL.fieldOf("aquifers_enabled").forGetter(egd::b),
               Codec.BOOL.fieldOf("ore_veins_enabled").forGetter(egd::c),
               Codec.BOOL.fieldOf("legacy_random_source").forGetter(egd::n)
            )
            .apply($$0, egd::new)
   );
   public static final Codec<je<egd>> b = alc.a(mg.aW, a);
   public static final alf<egd> c = alf.a(mg.aW, alg.b("overworld"));
   public static final alf<egd> d = alf.a(mg.aW, alg.b("large_biomes"));
   public static final alf<egd> e = alf.a(mg.aW, alg.b("amplified"));
   public static final alf<egd> f = alf.a(mg.aW, alg.b("nether"));
   public static final alf<egd> g = alf.a(mg.aW, alg.b("end"));
   public static final alf<egd> h = alf.a(mg.aW, alg.b("caves"));
   public static final alf<egd> i = alf.a(mg.aW, alg.b("floating_islands"));

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

   public egx.a d() {
      return this.t ? egx.a.a : egx.a.b;
   }

   public static void a(qh<egd> $$0) {
      $$0.a(c, a($$0, false, false));
      $$0.a(d, a($$0, false, true));
      $$0.a(e, a($$0, true, false));
      $$0.a(f, c($$0));
      $$0.a(g, b($$0));
      $$0.a(h, d($$0));
      $$0.a(i, e($$0));
   }

   private static egd b(qh<?> $$0) {
      return new egd(egg.d, dmc.fV.m(), dmc.a.m(), egf.a($$0.a(mg.aN)), qu.c(), List.of(), 0, true, false, false, true);
   }

   private static egd c(qh<?> $$0) {
      return new egd(egg.c, dmc.ej.m(), dmc.K.m(), egf.a($$0.a(mg.aN), $$0.a(mg.aX)), qu.b(), List.of(), 32, false, false, false, true);
   }

   private static egd a(qh<?> $$0, boolean $$1, boolean $$2) {
      return new egd(egg.b, dmc.b.m(), dmc.J.m(), egf.a($$0.a(mg.aN), $$0.a(mg.aX), $$2, $$1), qu.a(), new dko().a(), 63, false, true, true, false);
   }

   private static egd d(qh<?> $$0) {
      return new egd(egg.e, dmc.b.m(), dmc.J.m(), egf.b($$0.a(mg.aN), $$0.a(mg.aX)), qu.a(false, true, true), List.of(), 32, false, false, false, true);
   }

   private static egd e(qh<?> $$0) {
      return new egd(egg.f, dmc.b.m(), dmc.J.m(), egf.c($$0.a(mg.aN), $$0.a(mg.aX)), qu.a(false, false, false), List.of(), -64, false, false, false, true);
   }

   public static egd e() {
      return new egd(egg.b, dmc.b.m(), dmc.a.m(), egf.a(), qu.d(), List.of(), 63, true, false, false, false);
   }

   public egg f() {
      return this.j;
   }

   public dzz g() {
      return this.k;
   }

   public dzz h() {
      return this.l;
   }

   public ege i() {
      return this.m;
   }

   public egp.o j() {
      return this.n;
   }

   public List<dkh.d> k() {
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
