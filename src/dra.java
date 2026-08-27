import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record dra(drd j, dlj k, dlj l, drb m, drm.o n, List<cwz.d> o, int p, boolean q, boolean r, boolean s, boolean t) {
   public static final Codec<dra> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               drd.a.fieldOf("noise").forGetter(dra::f),
               dlj.b.fieldOf("default_block").forGetter(dra::g),
               dlj.b.fieldOf("default_fluid").forGetter(dra::h),
               drb.a.fieldOf("noise_router").forGetter(dra::i),
               drm.o.b.fieldOf("surface_rule").forGetter(dra::j),
               cwz.d.a.listOf().fieldOf("spawn_target").forGetter(dra::k),
               Codec.INT.fieldOf("sea_level").forGetter(dra::l),
               Codec.BOOL.fieldOf("disable_mob_generation").forGetter(dra::a),
               Codec.BOOL.fieldOf("aquifers_enabled").forGetter(dra::b),
               Codec.BOOL.fieldOf("ore_veins_enabled").forGetter(dra::c),
               Codec.BOOL.fieldOf("legacy_random_source").forGetter(dra::n)
            )
            .apply($$0, dra::new)
   );
   public static final Codec<ij<dra>> b = aiu.a(kg.aA, a);
   public static final aix<dra> c = aix.a(kg.aA, new aiy("overworld"));
   public static final aix<dra> d = aix.a(kg.aA, new aiy("large_biomes"));
   public static final aix<dra> e = aix.a(kg.aA, new aiy("amplified"));
   public static final aix<dra> f = aix.a(kg.aA, new aiy("nether"));
   public static final aix<dra> g = aix.a(kg.aA, new aiy("end"));
   public static final aix<dra> h = aix.a(kg.aA, new aiy("caves"));
   public static final aix<dra> i = aix.a(kg.aA, new aiy("floating_islands"));

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

   public dru.a d() {
      return this.t ? dru.a.a : dru.a.b;
   }

   public static void a(ph<dra> $$0) {
      $$0.a(c, a($$0, false, false));
      $$0.a(d, a($$0, false, true));
      $$0.a(e, a($$0, true, false));
      $$0.a(f, c($$0));
      $$0.a(g, b($$0));
      $$0.a(h, d($$0));
      $$0.a(i, e($$0));
   }

   private static dra b(ph<?> $$0) {
      return new dra(drd.d, cyu.fz.o(), cyu.a.o(), drc.a($$0.a(kg.ax)), pu.c(), List.of(), 0, true, false, false, true);
   }

   private static dra c(ph<?> $$0) {
      return new dra(drd.c, cyu.dV.o(), cyu.H.o(), drc.a($$0.a(kg.ax), $$0.a(kg.aB)), pu.b(), List.of(), 32, false, false, false, true);
   }

   private static dra a(ph<?> $$0, boolean $$1, boolean $$2) {
      return new dra(drd.b, cyu.b.o(), cyu.G.o(), drc.a($$0.a(kg.ax), $$0.a(kg.aB), $$2, $$1), pu.a(), new cxg().a(), 63, false, true, true, false);
   }

   private static dra d(ph<?> $$0) {
      return new dra(drd.e, cyu.b.o(), cyu.G.o(), drc.b($$0.a(kg.ax), $$0.a(kg.aB)), pu.a(false, true, true), List.of(), 32, false, false, false, true);
   }

   private static dra e(ph<?> $$0) {
      return new dra(drd.f, cyu.b.o(), cyu.G.o(), drc.c($$0.a(kg.ax), $$0.a(kg.aB)), pu.a(false, false, false), List.of(), -64, false, false, false, true);
   }

   public static dra e() {
      return new dra(drd.b, cyu.b.o(), cyu.a.o(), drc.a(), pu.d(), List.of(), 63, true, false, false, false);
   }

   public drd f() {
      return this.j;
   }

   public dlj g() {
      return this.k;
   }

   public dlj h() {
      return this.l;
   }

   public drb i() {
      return this.m;
   }

   public drm.o j() {
      return this.n;
   }

   public List<cwz.d> k() {
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
