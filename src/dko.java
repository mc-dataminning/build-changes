import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record dko(dkr j, dfa k, dfa l, dkp m, dla.o n, List<cqt.d> o, int p, boolean q, boolean r, boolean s, boolean t) {
   public static final Codec<dko> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dkr.a.fieldOf("noise").forGetter(dko::f),
               dfa.b.fieldOf("default_block").forGetter(dko::g),
               dfa.b.fieldOf("default_fluid").forGetter(dko::h),
               dkp.a.fieldOf("noise_router").forGetter(dko::i),
               dla.o.b.fieldOf("surface_rule").forGetter(dko::j),
               cqt.d.a.listOf().fieldOf("spawn_target").forGetter(dko::k),
               Codec.INT.fieldOf("sea_level").forGetter(dko::l),
               Codec.BOOL.fieldOf("disable_mob_generation").forGetter(dko::a),
               Codec.BOOL.fieldOf("aquifers_enabled").forGetter(dko::b),
               Codec.BOOL.fieldOf("ore_veins_enabled").forGetter(dko::c),
               Codec.BOOL.fieldOf("legacy_random_source").forGetter(dko::n)
            )
            .apply($$0, dko::new)
   );
   public static final Codec<he<dko>> b = aen.a(jc.aw, a);
   public static final aeq<dko> c = aeq.a(jc.aw, new aer("overworld"));
   public static final aeq<dko> d = aeq.a(jc.aw, new aer("large_biomes"));
   public static final aeq<dko> e = aeq.a(jc.aw, new aer("amplified"));
   public static final aeq<dko> f = aeq.a(jc.aw, new aer("nether"));
   public static final aeq<dko> g = aeq.a(jc.aw, new aer("end"));
   public static final aeq<dko> h = aeq.a(jc.aw, new aer("caves"));
   public static final aeq<dko> i = aeq.a(jc.aw, new aer("floating_islands"));

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

   public dli.a d() {
      return this.t ? dli.a.a : dli.a.b;
   }

   public static void a(nm<dko> $$0) {
      $$0.a(c, a($$0, false, false));
      $$0.a(d, a($$0, false, true));
      $$0.a(e, a($$0, true, false));
      $$0.a(f, c($$0));
      $$0.a(g, b($$0));
      $$0.a(h, d($$0));
      $$0.a(i, e($$0));
   }

   private static dko b(nm<?> $$0) {
      return new dko(dkr.d, csn.fz.n(), csn.a.n(), dkq.a($$0.a(jc.at)), nz.c(), List.of(), 0, true, false, false, true);
   }

   private static dko c(nm<?> $$0) {
      return new dko(dkr.c, csn.dW.n(), csn.H.n(), dkq.a($$0.a(jc.at), $$0.a(jc.ax)), nz.b(), List.of(), 32, false, false, false, true);
   }

   private static dko a(nm<?> $$0, boolean $$1, boolean $$2) {
      return new dko(dkr.b, csn.b.n(), csn.G.n(), dkq.a($$0.a(jc.at), $$0.a(jc.ax), $$2, $$1), nz.a(), new cra().a(), 63, false, true, true, false);
   }

   private static dko d(nm<?> $$0) {
      return new dko(dkr.e, csn.b.n(), csn.G.n(), dkq.b($$0.a(jc.at), $$0.a(jc.ax)), nz.a(false, true, true), List.of(), 32, false, false, false, true);
   }

   private static dko e(nm<?> $$0) {
      return new dko(dkr.f, csn.b.n(), csn.G.n(), dkq.c($$0.a(jc.at), $$0.a(jc.ax)), nz.a(false, false, false), List.of(), -64, false, false, false, true);
   }

   public static dko e() {
      return new dko(dkr.b, csn.b.n(), csn.a.n(), dkq.a(), nz.d(), List.of(), 63, true, false, false, false);
   }

   public dkr f() {
      return this.j;
   }

   public dfa g() {
      return this.k;
   }

   public dfa h() {
      return this.l;
   }

   public dkp i() {
      return this.m;
   }

   public dla.o j() {
      return this.n;
   }

   public List<cqt.d> k() {
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
