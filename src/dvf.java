import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record dvf(dvi j, dpi k, dpi l, dvg m, dvr.o n, List<dao.d> o, int p, boolean q, boolean r, boolean s, boolean t) {
   public static final Codec<dvf> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dvi.a.fieldOf("noise").forGetter(dvf::f),
               dpi.b.fieldOf("default_block").forGetter(dvf::g),
               dpi.b.fieldOf("default_fluid").forGetter(dvf::h),
               dvg.a.fieldOf("noise_router").forGetter(dvf::i),
               dvr.o.b.fieldOf("surface_rule").forGetter(dvf::j),
               dao.d.a.listOf().fieldOf("spawn_target").forGetter(dvf::k),
               Codec.INT.fieldOf("sea_level").forGetter(dvf::l),
               Codec.BOOL.fieldOf("disable_mob_generation").forGetter(dvf::a),
               Codec.BOOL.fieldOf("aquifers_enabled").forGetter(dvf::b),
               Codec.BOOL.fieldOf("ore_veins_enabled").forGetter(dvf::c),
               Codec.BOOL.fieldOf("legacy_random_source").forGetter(dvf::n)
            )
            .apply($$0, dvf::new)
   );
   public static final Codec<in<dvf>> b = ajr.a(ku.aD, a);
   public static final aju<dvf> c = aju.a(ku.aD, new ajv("overworld"));
   public static final aju<dvf> d = aju.a(ku.aD, new ajv("large_biomes"));
   public static final aju<dvf> e = aju.a(ku.aD, new ajv("amplified"));
   public static final aju<dvf> f = aju.a(ku.aD, new ajv("nether"));
   public static final aju<dvf> g = aju.a(ku.aD, new ajv("end"));
   public static final aju<dvf> h = aju.a(ku.aD, new ajv("caves"));
   public static final aju<dvf> i = aju.a(ku.aD, new ajv("floating_islands"));

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

   public dvz.a d() {
      return this.t ? dvz.a.a : dvz.a.b;
   }

   public static void a(pz<dvf> $$0) {
      $$0.a(c, a($$0, false, false));
      $$0.a(d, a($$0, false, true));
      $$0.a(e, a($$0, true, false));
      $$0.a(f, c($$0));
      $$0.a(g, b($$0));
      $$0.a(h, d($$0));
      $$0.a(i, e($$0));
   }

   private static dvf b(pz<?> $$0) {
      return new dvf(dvi.d, dcj.fz.n(), dcj.a.n(), dvh.a($$0.a(ku.aA)), qm.c(), List.of(), 0, true, false, false, true);
   }

   private static dvf c(pz<?> $$0) {
      return new dvf(dvi.c, dcj.dV.n(), dcj.H.n(), dvh.a($$0.a(ku.aA), $$0.a(ku.aE)), qm.b(), List.of(), 32, false, false, false, true);
   }

   private static dvf a(pz<?> $$0, boolean $$1, boolean $$2) {
      return new dvf(dvi.b, dcj.b.n(), dcj.G.n(), dvh.a($$0.a(ku.aA), $$0.a(ku.aE), $$2, $$1), qm.a(), new dav().a(), 63, false, true, true, false);
   }

   private static dvf d(pz<?> $$0) {
      return new dvf(dvi.e, dcj.b.n(), dcj.G.n(), dvh.b($$0.a(ku.aA), $$0.a(ku.aE)), qm.a(false, true, true), List.of(), 32, false, false, false, true);
   }

   private static dvf e(pz<?> $$0) {
      return new dvf(dvi.f, dcj.b.n(), dcj.G.n(), dvh.c($$0.a(ku.aA), $$0.a(ku.aE)), qm.a(false, false, false), List.of(), -64, false, false, false, true);
   }

   public static dvf e() {
      return new dvf(dvi.b, dcj.b.n(), dcj.a.n(), dvh.a(), qm.d(), List.of(), 63, true, false, false, false);
   }

   public dvi f() {
      return this.j;
   }

   public dpi g() {
      return this.k;
   }

   public dpi h() {
      return this.l;
   }

   public dvg i() {
      return this.m;
   }

   public dvr.o j() {
      return this.n;
   }

   public List<dao.d> k() {
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
