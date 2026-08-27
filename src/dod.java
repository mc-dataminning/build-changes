import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record dod(dog j, dip k, dip l, doe m, dop.o n, List<cug.d> o, int p, boolean q, boolean r, boolean s, boolean t) {
   public static final Codec<dod> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dog.a.fieldOf("noise").forGetter(dod::f),
               dip.b.fieldOf("default_block").forGetter(dod::g),
               dip.b.fieldOf("default_fluid").forGetter(dod::h),
               doe.a.fieldOf("noise_router").forGetter(dod::i),
               dop.o.b.fieldOf("surface_rule").forGetter(dod::j),
               cug.d.a.listOf().fieldOf("spawn_target").forGetter(dod::k),
               Codec.INT.fieldOf("sea_level").forGetter(dod::l),
               Codec.BOOL.fieldOf("disable_mob_generation").forGetter(dod::a),
               Codec.BOOL.fieldOf("aquifers_enabled").forGetter(dod::b),
               Codec.BOOL.fieldOf("ore_veins_enabled").forGetter(dod::c),
               Codec.BOOL.fieldOf("legacy_random_source").forGetter(dod::n)
            )
            .apply($$0, dod::new)
   );
   public static final Codec<ie<dod>> b = agp.a(kc.az, a);
   public static final ags<dod> c = ags.a(kc.az, new agt("overworld"));
   public static final ags<dod> d = ags.a(kc.az, new agt("large_biomes"));
   public static final ags<dod> e = ags.a(kc.az, new agt("amplified"));
   public static final ags<dod> f = ags.a(kc.az, new agt("nether"));
   public static final ags<dod> g = ags.a(kc.az, new agt("end"));
   public static final ags<dod> h = ags.a(kc.az, new agt("caves"));
   public static final ags<dod> i = ags.a(kc.az, new agt("floating_islands"));

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

   public dox.a d() {
      return this.t ? dox.a.a : dox.a.b;
   }

   public static void a(pa<dod> $$0) {
      $$0.a(c, a($$0, false, false));
      $$0.a(d, a($$0, false, true));
      $$0.a(e, a($$0, true, false));
      $$0.a(f, c($$0));
      $$0.a(g, b($$0));
      $$0.a(h, d($$0));
      $$0.a(i, e($$0));
   }

   private static dod b(pa<?> $$0) {
      return new dod(dog.d, cwb.fz.o(), cwb.a.o(), dof.a($$0.a(kc.aw)), pn.c(), List.of(), 0, true, false, false, true);
   }

   private static dod c(pa<?> $$0) {
      return new dod(dog.c, cwb.dV.o(), cwb.H.o(), dof.a($$0.a(kc.aw), $$0.a(kc.aA)), pn.b(), List.of(), 32, false, false, false, true);
   }

   private static dod a(pa<?> $$0, boolean $$1, boolean $$2) {
      return new dod(dog.b, cwb.b.o(), cwb.G.o(), dof.a($$0.a(kc.aw), $$0.a(kc.aA), $$2, $$1), pn.a(), new cun().a(), 63, false, true, true, false);
   }

   private static dod d(pa<?> $$0) {
      return new dod(dog.e, cwb.b.o(), cwb.G.o(), dof.b($$0.a(kc.aw), $$0.a(kc.aA)), pn.a(false, true, true), List.of(), 32, false, false, false, true);
   }

   private static dod e(pa<?> $$0) {
      return new dod(dog.f, cwb.b.o(), cwb.G.o(), dof.c($$0.a(kc.aw), $$0.a(kc.aA)), pn.a(false, false, false), List.of(), -64, false, false, false, true);
   }

   public static dod e() {
      return new dod(dog.b, cwb.b.o(), cwb.a.o(), dof.a(), pn.d(), List.of(), 63, true, false, false, false);
   }

   public dog f() {
      return this.j;
   }

   public dip g() {
      return this.k;
   }

   public dip h() {
      return this.l;
   }

   public doe i() {
      return this.m;
   }

   public dop.o j() {
      return this.n;
   }

   public List<cug.d> k() {
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
