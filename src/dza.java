import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record dza(dzd j, dta k, dta l, dzb m, dzm.o n, List<ded.d> o, int p, boolean q, boolean r, boolean s, boolean t) {
   public static final Codec<dza> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dzd.a.fieldOf("noise").forGetter(dza::f),
               dta.b.fieldOf("default_block").forGetter(dza::g),
               dta.b.fieldOf("default_fluid").forGetter(dza::h),
               dzb.a.fieldOf("noise_router").forGetter(dza::i),
               dzm.o.b.fieldOf("surface_rule").forGetter(dza::j),
               ded.d.a.listOf().fieldOf("spawn_target").forGetter(dza::k),
               Codec.INT.fieldOf("sea_level").forGetter(dza::l),
               Codec.BOOL.fieldOf("disable_mob_generation").forGetter(dza::a),
               Codec.BOOL.fieldOf("aquifers_enabled").forGetter(dza::b),
               Codec.BOOL.fieldOf("ore_veins_enabled").forGetter(dza::c),
               Codec.BOOL.fieldOf("legacy_random_source").forGetter(dza::n)
            )
            .apply($$0, dza::new)
   );
   public static final Codec<jm<dza>> b = akm.a(lu.aO, a);
   public static final akp<dza> c = akp.a(lu.aO, akq.b("overworld"));
   public static final akp<dza> d = akp.a(lu.aO, akq.b("large_biomes"));
   public static final akp<dza> e = akp.a(lu.aO, akq.b("amplified"));
   public static final akp<dza> f = akp.a(lu.aO, akq.b("nether"));
   public static final akp<dza> g = akp.a(lu.aO, akq.b("end"));
   public static final akp<dza> h = akp.a(lu.aO, akq.b("caves"));
   public static final akp<dza> i = akp.a(lu.aO, akq.b("floating_islands"));

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

   public dzu.a d() {
      return this.t ? dzu.a.a : dzu.a.b;
   }

   public static void a(qp<dza> $$0) {
      $$0.a(c, a($$0, false, false));
      $$0.a(d, a($$0, false, true));
      $$0.a(e, a($$0, true, false));
      $$0.a(f, c($$0));
      $$0.a(g, b($$0));
      $$0.a(h, d($$0));
      $$0.a(i, e($$0));
   }

   private static dza b(qp<?> $$0) {
      return new dza(dzd.d, dfy.fz.o(), dfy.a.o(), dzc.a($$0.a(lu.aJ)), rc.c(), List.of(), 0, true, false, false, true);
   }

   private static dza c(qp<?> $$0) {
      return new dza(dzd.c, dfy.dV.o(), dfy.H.o(), dzc.a($$0.a(lu.aJ), $$0.a(lu.aP)), rc.b(), List.of(), 32, false, false, false, true);
   }

   private static dza a(qp<?> $$0, boolean $$1, boolean $$2) {
      return new dza(dzd.b, dfy.b.o(), dfy.G.o(), dzc.a($$0.a(lu.aJ), $$0.a(lu.aP), $$2, $$1), rc.a(), new dek().a(), 63, false, true, true, false);
   }

   private static dza d(qp<?> $$0) {
      return new dza(dzd.e, dfy.b.o(), dfy.G.o(), dzc.b($$0.a(lu.aJ), $$0.a(lu.aP)), rc.a(false, true, true), List.of(), 32, false, false, false, true);
   }

   private static dza e(qp<?> $$0) {
      return new dza(dzd.f, dfy.b.o(), dfy.G.o(), dzc.c($$0.a(lu.aJ), $$0.a(lu.aP)), rc.a(false, false, false), List.of(), -64, false, false, false, true);
   }

   public static dza e() {
      return new dza(dzd.b, dfy.b.o(), dfy.a.o(), dzc.a(), rc.d(), List.of(), 63, true, false, false, false);
   }

   public dzd f() {
      return this.j;
   }

   public dta g() {
      return this.k;
   }

   public dta h() {
      return this.l;
   }

   public dzb i() {
      return this.m;
   }

   public dzm.o j() {
      return this.n;
   }

   public List<ded.d> k() {
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
