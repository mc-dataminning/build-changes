import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record egx(eha j, eat k, eat l, egy m, ehj.o n, List<dky.d> o, int p, boolean q, boolean r, boolean s, boolean t) {
   public static final Codec<egx> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               eha.a.fieldOf("noise").forGetter(egx::f),
               eat.a.fieldOf("default_block").forGetter(egx::g),
               eat.a.fieldOf("default_fluid").forGetter(egx::h),
               egy.a.fieldOf("noise_router").forGetter(egx::i),
               ehj.o.b.fieldOf("surface_rule").forGetter(egx::j),
               dky.d.a.listOf().fieldOf("spawn_target").forGetter(egx::k),
               Codec.INT.fieldOf("sea_level").forGetter(egx::l),
               Codec.BOOL.fieldOf("disable_mob_generation").forGetter(egx::a),
               Codec.BOOL.fieldOf("aquifers_enabled").forGetter(egx::b),
               Codec.BOOL.fieldOf("ore_veins_enabled").forGetter(egx::c),
               Codec.BOOL.fieldOf("legacy_random_source").forGetter(egx::n)
            )
            .apply($$0, egx::new)
   );
   public static final Codec<jf<egx>> b = alc.a(mh.aX, a);
   public static final alf<egx> c = alf.a(mh.aX, alg.b("overworld"));
   public static final alf<egx> d = alf.a(mh.aX, alg.b("large_biomes"));
   public static final alf<egx> e = alf.a(mh.aX, alg.b("amplified"));
   public static final alf<egx> f = alf.a(mh.aX, alg.b("nether"));
   public static final alf<egx> g = alf.a(mh.aX, alg.b("end"));
   public static final alf<egx> h = alf.a(mh.aX, alg.b("caves"));
   public static final alf<egx> i = alf.a(mh.aX, alg.b("floating_islands"));

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

   public ehr.a d() {
      return this.t ? ehr.a.a : ehr.a.b;
   }

   public static void a(qh<egx> $$0) {
      $$0.a(c, a($$0, false, false));
      $$0.a(d, a($$0, false, true));
      $$0.a(e, a($$0, true, false));
      $$0.a(f, c($$0));
      $$0.a(g, b($$0));
      $$0.a(h, d($$0));
      $$0.a(i, e($$0));
   }

   private static egx b(qh<?> $$0) {
      return new egx(eha.d, dmt.fY.m(), dmt.a.m(), egz.a($$0.a(mh.aO)), qu.c(), List.of(), 0, true, false, false, true);
   }

   private static egx c(qh<?> $$0) {
      return new egx(eha.c, dmt.em.m(), dmt.K.m(), egz.a($$0.a(mh.aO), $$0.a(mh.aY)), qu.b(), List.of(), 32, false, false, false, true);
   }

   private static egx a(qh<?> $$0, boolean $$1, boolean $$2) {
      return new egx(eha.b, dmt.b.m(), dmt.J.m(), egz.a($$0.a(mh.aO), $$0.a(mh.aY), $$2, $$1), qu.a(), new dlf().a(), 63, false, true, true, false);
   }

   private static egx d(qh<?> $$0) {
      return new egx(eha.e, dmt.b.m(), dmt.J.m(), egz.b($$0.a(mh.aO), $$0.a(mh.aY)), qu.a(false, true, true), List.of(), 32, false, false, false, true);
   }

   private static egx e(qh<?> $$0) {
      return new egx(eha.f, dmt.b.m(), dmt.J.m(), egz.c($$0.a(mh.aO), $$0.a(mh.aY)), qu.a(false, false, false), List.of(), -64, false, false, false, true);
   }

   public static egx e() {
      return new egx(eha.b, dmt.b.m(), dmt.a.m(), egz.a(), qu.d(), List.of(), 63, true, false, false, false);
   }

   public eha f() {
      return this.j;
   }

   public eat g() {
      return this.k;
   }

   public eat h() {
      return this.l;
   }

   public egy i() {
      return this.m;
   }

   public ehj.o j() {
      return this.n;
   }

   public List<dky.d> k() {
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
