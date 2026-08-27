import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record dqt(dqw j, dlf k, dlf l, dqu m, drf.o n, List<cwv.d> o, int p, boolean q, boolean r, boolean s, boolean t) {
   public static final Codec<dqt> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dqw.a.fieldOf("noise").forGetter(dqt::f),
               dlf.b.fieldOf("default_block").forGetter(dqt::g),
               dlf.b.fieldOf("default_fluid").forGetter(dqt::h),
               dqu.a.fieldOf("noise_router").forGetter(dqt::i),
               drf.o.b.fieldOf("surface_rule").forGetter(dqt::j),
               cwv.d.a.listOf().fieldOf("spawn_target").forGetter(dqt::k),
               Codec.INT.fieldOf("sea_level").forGetter(dqt::l),
               Codec.BOOL.fieldOf("disable_mob_generation").forGetter(dqt::a),
               Codec.BOOL.fieldOf("aquifers_enabled").forGetter(dqt::b),
               Codec.BOOL.fieldOf("ore_veins_enabled").forGetter(dqt::c),
               Codec.BOOL.fieldOf("legacy_random_source").forGetter(dqt::n)
            )
            .apply($$0, dqt::new)
   );
   public static final Codec<ij<dqt>> b = aiu.a(kg.aA, a);
   public static final aix<dqt> c = aix.a(kg.aA, new aiy("overworld"));
   public static final aix<dqt> d = aix.a(kg.aA, new aiy("large_biomes"));
   public static final aix<dqt> e = aix.a(kg.aA, new aiy("amplified"));
   public static final aix<dqt> f = aix.a(kg.aA, new aiy("nether"));
   public static final aix<dqt> g = aix.a(kg.aA, new aiy("end"));
   public static final aix<dqt> h = aix.a(kg.aA, new aiy("caves"));
   public static final aix<dqt> i = aix.a(kg.aA, new aiy("floating_islands"));

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

   public drn.a d() {
      return this.t ? drn.a.a : drn.a.b;
   }

   public static void a(ph<dqt> $$0) {
      $$0.a(c, a($$0, false, false));
      $$0.a(d, a($$0, false, true));
      $$0.a(e, a($$0, true, false));
      $$0.a(f, c($$0));
      $$0.a(g, b($$0));
      $$0.a(h, d($$0));
      $$0.a(i, e($$0));
   }

   private static dqt b(ph<?> $$0) {
      return new dqt(dqw.d, cyq.fz.o(), cyq.a.o(), dqv.a($$0.a(kg.ax)), pu.c(), List.of(), 0, true, false, false, true);
   }

   private static dqt c(ph<?> $$0) {
      return new dqt(dqw.c, cyq.dV.o(), cyq.H.o(), dqv.a($$0.a(kg.ax), $$0.a(kg.aB)), pu.b(), List.of(), 32, false, false, false, true);
   }

   private static dqt a(ph<?> $$0, boolean $$1, boolean $$2) {
      return new dqt(dqw.b, cyq.b.o(), cyq.G.o(), dqv.a($$0.a(kg.ax), $$0.a(kg.aB), $$2, $$1), pu.a(), new cxc().a(), 63, false, true, true, false);
   }

   private static dqt d(ph<?> $$0) {
      return new dqt(dqw.e, cyq.b.o(), cyq.G.o(), dqv.b($$0.a(kg.ax), $$0.a(kg.aB)), pu.a(false, true, true), List.of(), 32, false, false, false, true);
   }

   private static dqt e(ph<?> $$0) {
      return new dqt(dqw.f, cyq.b.o(), cyq.G.o(), dqv.c($$0.a(kg.ax), $$0.a(kg.aB)), pu.a(false, false, false), List.of(), -64, false, false, false, true);
   }

   public static dqt e() {
      return new dqt(dqw.b, cyq.b.o(), cyq.a.o(), dqv.a(), pu.d(), List.of(), 63, true, false, false, false);
   }

   public dqw f() {
      return this.j;
   }

   public dlf g() {
      return this.k;
   }

   public dlf h() {
      return this.l;
   }

   public dqu i() {
      return this.m;
   }

   public drf.o j() {
      return this.n;
   }

   public List<cwv.d> k() {
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
