import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record dzd(dzg j, dtc k, dtc l, dze m, dzp.o n, List<def.d> o, int p, boolean q, boolean r, boolean s, boolean t) {
   public static final Codec<dzd> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dzg.a.fieldOf("noise").forGetter(dzd::f),
               dtc.b.fieldOf("default_block").forGetter(dzd::g),
               dtc.b.fieldOf("default_fluid").forGetter(dzd::h),
               dze.a.fieldOf("noise_router").forGetter(dzd::i),
               dzp.o.b.fieldOf("surface_rule").forGetter(dzd::j),
               def.d.a.listOf().fieldOf("spawn_target").forGetter(dzd::k),
               Codec.INT.fieldOf("sea_level").forGetter(dzd::l),
               Codec.BOOL.fieldOf("disable_mob_generation").forGetter(dzd::a),
               Codec.BOOL.fieldOf("aquifers_enabled").forGetter(dzd::b),
               Codec.BOOL.fieldOf("ore_veins_enabled").forGetter(dzd::c),
               Codec.BOOL.fieldOf("legacy_random_source").forGetter(dzd::n)
            )
            .apply($$0, dzd::new)
   );
   public static final Codec<jm<dzd>> b = akn.a(lu.aO, a);
   public static final akq<dzd> c = akq.a(lu.aO, akr.b("overworld"));
   public static final akq<dzd> d = akq.a(lu.aO, akr.b("large_biomes"));
   public static final akq<dzd> e = akq.a(lu.aO, akr.b("amplified"));
   public static final akq<dzd> f = akq.a(lu.aO, akr.b("nether"));
   public static final akq<dzd> g = akq.a(lu.aO, akr.b("end"));
   public static final akq<dzd> h = akq.a(lu.aO, akr.b("caves"));
   public static final akq<dzd> i = akq.a(lu.aO, akr.b("floating_islands"));

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

   public dzx.a d() {
      return this.t ? dzx.a.a : dzx.a.b;
   }

   public static void a(qq<dzd> $$0) {
      $$0.a(c, a($$0, false, false));
      $$0.a(d, a($$0, false, true));
      $$0.a(e, a($$0, true, false));
      $$0.a(f, c($$0));
      $$0.a(g, b($$0));
      $$0.a(h, d($$0));
      $$0.a(i, e($$0));
   }

   private static dzd b(qq<?> $$0) {
      return new dzd(dzg.d, dga.fz.o(), dga.a.o(), dzf.a($$0.a(lu.aJ)), rd.c(), List.of(), 0, true, false, false, true);
   }

   private static dzd c(qq<?> $$0) {
      return new dzd(dzg.c, dga.dV.o(), dga.H.o(), dzf.a($$0.a(lu.aJ), $$0.a(lu.aP)), rd.b(), List.of(), 32, false, false, false, true);
   }

   private static dzd a(qq<?> $$0, boolean $$1, boolean $$2) {
      return new dzd(dzg.b, dga.b.o(), dga.G.o(), dzf.a($$0.a(lu.aJ), $$0.a(lu.aP), $$2, $$1), rd.a(), new dem().a(), 63, false, true, true, false);
   }

   private static dzd d(qq<?> $$0) {
      return new dzd(dzg.e, dga.b.o(), dga.G.o(), dzf.b($$0.a(lu.aJ), $$0.a(lu.aP)), rd.a(false, true, true), List.of(), 32, false, false, false, true);
   }

   private static dzd e(qq<?> $$0) {
      return new dzd(dzg.f, dga.b.o(), dga.G.o(), dzf.c($$0.a(lu.aJ), $$0.a(lu.aP)), rd.a(false, false, false), List.of(), -64, false, false, false, true);
   }

   public static dzd e() {
      return new dzd(dzg.b, dga.b.o(), dga.a.o(), dzf.a(), rd.d(), List.of(), 63, true, false, false, false);
   }

   public dzg f() {
      return this.j;
   }

   public dtc g() {
      return this.k;
   }

   public dtc h() {
      return this.l;
   }

   public dze i() {
      return this.m;
   }

   public dzp.o j() {
      return this.n;
   }

   public List<def.d> k() {
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
