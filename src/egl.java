import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record egl(ego j, eah k, eah l, egm m, egx.o n, List<dkm.d> o, int p, boolean q, boolean r, boolean s, boolean t) {
   public static final Codec<egl> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ego.a.fieldOf("noise").forGetter(egl::f),
               eah.a.fieldOf("default_block").forGetter(egl::g),
               eah.a.fieldOf("default_fluid").forGetter(egl::h),
               egm.a.fieldOf("noise_router").forGetter(egl::i),
               egx.o.b.fieldOf("surface_rule").forGetter(egl::j),
               dkm.d.a.listOf().fieldOf("spawn_target").forGetter(egl::k),
               Codec.INT.fieldOf("sea_level").forGetter(egl::l),
               Codec.BOOL.fieldOf("disable_mob_generation").forGetter(egl::a),
               Codec.BOOL.fieldOf("aquifers_enabled").forGetter(egl::b),
               Codec.BOOL.fieldOf("ore_veins_enabled").forGetter(egl::c),
               Codec.BOOL.fieldOf("legacy_random_source").forGetter(egl::n)
            )
            .apply($$0, egl::new)
   );
   public static final Codec<je<egl>> b = alc.a(mg.aX, a);
   public static final alf<egl> c = alf.a(mg.aX, alg.b("overworld"));
   public static final alf<egl> d = alf.a(mg.aX, alg.b("large_biomes"));
   public static final alf<egl> e = alf.a(mg.aX, alg.b("amplified"));
   public static final alf<egl> f = alf.a(mg.aX, alg.b("nether"));
   public static final alf<egl> g = alf.a(mg.aX, alg.b("end"));
   public static final alf<egl> h = alf.a(mg.aX, alg.b("caves"));
   public static final alf<egl> i = alf.a(mg.aX, alg.b("floating_islands"));

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

   public ehf.a d() {
      return this.t ? ehf.a.a : ehf.a.b;
   }

   public static void a(qh<egl> $$0) {
      $$0.a(c, a($$0, false, false));
      $$0.a(d, a($$0, false, true));
      $$0.a(e, a($$0, true, false));
      $$0.a(f, c($$0));
      $$0.a(g, b($$0));
      $$0.a(h, d($$0));
      $$0.a(i, e($$0));
   }

   private static egl b(qh<?> $$0) {
      return new egl(ego.d, dmh.fY.m(), dmh.a.m(), egn.a($$0.a(mg.aO)), qu.c(), List.of(), 0, true, false, false, true);
   }

   private static egl c(qh<?> $$0) {
      return new egl(ego.c, dmh.em.m(), dmh.K.m(), egn.a($$0.a(mg.aO), $$0.a(mg.aY)), qu.b(), List.of(), 32, false, false, false, true);
   }

   private static egl a(qh<?> $$0, boolean $$1, boolean $$2) {
      return new egl(ego.b, dmh.b.m(), dmh.J.m(), egn.a($$0.a(mg.aO), $$0.a(mg.aY), $$2, $$1), qu.a(), new dkt().a(), 63, false, true, true, false);
   }

   private static egl d(qh<?> $$0) {
      return new egl(ego.e, dmh.b.m(), dmh.J.m(), egn.b($$0.a(mg.aO), $$0.a(mg.aY)), qu.a(false, true, true), List.of(), 32, false, false, false, true);
   }

   private static egl e(qh<?> $$0) {
      return new egl(ego.f, dmh.b.m(), dmh.J.m(), egn.c($$0.a(mg.aO), $$0.a(mg.aY)), qu.a(false, false, false), List.of(), -64, false, false, false, true);
   }

   public static egl e() {
      return new egl(ego.b, dmh.b.m(), dmh.a.m(), egn.a(), qu.d(), List.of(), 63, true, false, false, false);
   }

   public ego f() {
      return this.j;
   }

   public eah g() {
      return this.k;
   }

   public eah h() {
      return this.l;
   }

   public egm i() {
      return this.m;
   }

   public egx.o j() {
      return this.n;
   }

   public List<dkm.d> k() {
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
