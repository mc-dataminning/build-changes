import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record dkm(dkp j, dey k, dey l, dkn m, dky.o n, List<cqr.d> o, int p, boolean q, boolean r, boolean s, boolean t) {
   public static final Codec<dkm> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dkp.a.fieldOf("noise").forGetter(dkm::f),
               dey.b.fieldOf("default_block").forGetter(dkm::g),
               dey.b.fieldOf("default_fluid").forGetter(dkm::h),
               dkn.a.fieldOf("noise_router").forGetter(dkm::i),
               dky.o.b.fieldOf("surface_rule").forGetter(dkm::j),
               cqr.d.a.listOf().fieldOf("spawn_target").forGetter(dkm::k),
               Codec.INT.fieldOf("sea_level").forGetter(dkm::l),
               Codec.BOOL.fieldOf("disable_mob_generation").forGetter(dkm::a),
               Codec.BOOL.fieldOf("aquifers_enabled").forGetter(dkm::b),
               Codec.BOOL.fieldOf("ore_veins_enabled").forGetter(dkm::c),
               Codec.BOOL.fieldOf("legacy_random_source").forGetter(dkm::n)
            )
            .apply($$0, dkm::new)
   );
   public static final Codec<hf<dkm>> b = ael.a(jd.aw, a);
   public static final aeo<dkm> c = aeo.a(jd.aw, new aep("overworld"));
   public static final aeo<dkm> d = aeo.a(jd.aw, new aep("large_biomes"));
   public static final aeo<dkm> e = aeo.a(jd.aw, new aep("amplified"));
   public static final aeo<dkm> f = aeo.a(jd.aw, new aep("nether"));
   public static final aeo<dkm> g = aeo.a(jd.aw, new aep("end"));
   public static final aeo<dkm> h = aeo.a(jd.aw, new aep("caves"));
   public static final aeo<dkm> i = aeo.a(jd.aw, new aep("floating_islands"));

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

   public dlg.a d() {
      return this.t ? dlg.a.a : dlg.a.b;
   }

   public static void a(nn<dkm> $$0) {
      $$0.a(c, a($$0, false, false));
      $$0.a(d, a($$0, false, true));
      $$0.a(e, a($$0, true, false));
      $$0.a(f, c($$0));
      $$0.a(g, b($$0));
      $$0.a(h, d($$0));
      $$0.a(i, e($$0));
   }

   private static dkm b(nn<?> $$0) {
      return new dkm(dkp.d, csl.fz.n(), csl.a.n(), dko.a($$0.a(jd.at)), oa.c(), List.of(), 0, true, false, false, true);
   }

   private static dkm c(nn<?> $$0) {
      return new dkm(dkp.c, csl.dW.n(), csl.H.n(), dko.a($$0.a(jd.at), $$0.a(jd.ax)), oa.b(), List.of(), 32, false, false, false, true);
   }

   private static dkm a(nn<?> $$0, boolean $$1, boolean $$2) {
      return new dkm(dkp.b, csl.b.n(), csl.G.n(), dko.a($$0.a(jd.at), $$0.a(jd.ax), $$2, $$1), oa.a(), new cqy().a(), 63, false, true, true, false);
   }

   private static dkm d(nn<?> $$0) {
      return new dkm(dkp.e, csl.b.n(), csl.G.n(), dko.b($$0.a(jd.at), $$0.a(jd.ax)), oa.a(false, true, true), List.of(), 32, false, false, false, true);
   }

   private static dkm e(nn<?> $$0) {
      return new dkm(dkp.f, csl.b.n(), csl.G.n(), dko.c($$0.a(jd.at), $$0.a(jd.ax)), oa.a(false, false, false), List.of(), -64, false, false, false, true);
   }

   public static dkm e() {
      return new dkm(dkp.b, csl.b.n(), csl.a.n(), dko.a(), oa.d(), List.of(), 63, true, false, false, false);
   }

   public dkp f() {
      return this.j;
   }

   public dey g() {
      return this.k;
   }

   public dey h() {
      return this.l;
   }

   public dkn i() {
      return this.m;
   }

   public dky.o j() {
      return this.n;
   }

   public List<cqr.d> k() {
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
