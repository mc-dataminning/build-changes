import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record dmk(dmn j, dgw k, dgw l, dml m, dmw.o n, List<csz.d> o, int p, boolean q, boolean r, boolean s, boolean t) {
   public static final Codec<dmk> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dmn.a.fieldOf("noise").forGetter(dmk::f),
               dgw.b.fieldOf("default_block").forGetter(dmk::g),
               dgw.b.fieldOf("default_fluid").forGetter(dmk::h),
               dml.a.fieldOf("noise_router").forGetter(dmk::i),
               dmw.o.b.fieldOf("surface_rule").forGetter(dmk::j),
               csz.d.a.listOf().fieldOf("spawn_target").forGetter(dmk::k),
               Codec.INT.fieldOf("sea_level").forGetter(dmk::l),
               Codec.BOOL.fieldOf("disable_mob_generation").forGetter(dmk::a),
               Codec.BOOL.fieldOf("aquifers_enabled").forGetter(dmk::b),
               Codec.BOOL.fieldOf("ore_veins_enabled").forGetter(dmk::c),
               Codec.BOOL.fieldOf("legacy_random_source").forGetter(dmk::n)
            )
            .apply($$0, dmk::new)
   );
   public static final Codec<ib<dmk>> b = agc.a(jz.ay, a);
   public static final agf<dmk> c = agf.a(jz.ay, new agg("overworld"));
   public static final agf<dmk> d = agf.a(jz.ay, new agg("large_biomes"));
   public static final agf<dmk> e = agf.a(jz.ay, new agg("amplified"));
   public static final agf<dmk> f = agf.a(jz.ay, new agg("nether"));
   public static final agf<dmk> g = agf.a(jz.ay, new agg("end"));
   public static final agf<dmk> h = agf.a(jz.ay, new agg("caves"));
   public static final agf<dmk> i = agf.a(jz.ay, new agg("floating_islands"));

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

   public dne.a d() {
      return this.t ? dne.a.a : dne.a.b;
   }

   public static void a(ou<dmk> $$0) {
      $$0.a(c, a($$0, false, false));
      $$0.a(d, a($$0, false, true));
      $$0.a(e, a($$0, true, false));
      $$0.a(f, c($$0));
      $$0.a(g, b($$0));
      $$0.a(h, d($$0));
      $$0.a(i, e($$0));
   }

   private static dmk b(ou<?> $$0) {
      return new dmk(dmn.d, cuv.fz.o(), cuv.a.o(), dmm.a($$0.a(jz.av)), ph.c(), List.of(), 0, true, false, false, true);
   }

   private static dmk c(ou<?> $$0) {
      return new dmk(dmn.c, cuv.dV.o(), cuv.H.o(), dmm.a($$0.a(jz.av), $$0.a(jz.az)), ph.b(), List.of(), 32, false, false, false, true);
   }

   private static dmk a(ou<?> $$0, boolean $$1, boolean $$2) {
      return new dmk(dmn.b, cuv.b.o(), cuv.G.o(), dmm.a($$0.a(jz.av), $$0.a(jz.az), $$2, $$1), ph.a(), new ctg().a(), 63, false, true, true, false);
   }

   private static dmk d(ou<?> $$0) {
      return new dmk(dmn.e, cuv.b.o(), cuv.G.o(), dmm.b($$0.a(jz.av), $$0.a(jz.az)), ph.a(false, true, true), List.of(), 32, false, false, false, true);
   }

   private static dmk e(ou<?> $$0) {
      return new dmk(dmn.f, cuv.b.o(), cuv.G.o(), dmm.c($$0.a(jz.av), $$0.a(jz.az)), ph.a(false, false, false), List.of(), -64, false, false, false, true);
   }

   public static dmk e() {
      return new dmk(dmn.b, cuv.b.o(), cuv.a.o(), dmm.a(), ph.d(), List.of(), 63, true, false, false, false);
   }

   public dmn f() {
      return this.j;
   }

   public dgw g() {
      return this.k;
   }

   public dgw h() {
      return this.l;
   }

   public dml i() {
      return this.m;
   }

   public dmw.o j() {
      return this.n;
   }

   public List<csz.d> k() {
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
