import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record dkz(dlc j, dfl k, dfl l, dla m, dll.o n, List<cre.d> o, int p, boolean q, boolean r, boolean s, boolean t) {
   public static final Codec<dkz> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dlc.a.fieldOf("noise").forGetter(dkz::f),
               dfl.b.fieldOf("default_block").forGetter(dkz::g),
               dfl.b.fieldOf("default_fluid").forGetter(dkz::h),
               dla.a.fieldOf("noise_router").forGetter(dkz::i),
               dll.o.b.fieldOf("surface_rule").forGetter(dkz::j),
               cre.d.a.listOf().fieldOf("spawn_target").forGetter(dkz::k),
               Codec.INT.fieldOf("sea_level").forGetter(dkz::l),
               Codec.BOOL.fieldOf("disable_mob_generation").forGetter(dkz::a),
               Codec.BOOL.fieldOf("aquifers_enabled").forGetter(dkz::b),
               Codec.BOOL.fieldOf("ore_veins_enabled").forGetter(dkz::c),
               Codec.BOOL.fieldOf("legacy_random_source").forGetter(dkz::n)
            )
            .apply($$0, dkz::new)
   );
   public static final Codec<hg<dkz>> b = aeu.a(je.aw, a);
   public static final aex<dkz> c = aex.a(je.aw, new aey("overworld"));
   public static final aex<dkz> d = aex.a(je.aw, new aey("large_biomes"));
   public static final aex<dkz> e = aex.a(je.aw, new aey("amplified"));
   public static final aex<dkz> f = aex.a(je.aw, new aey("nether"));
   public static final aex<dkz> g = aex.a(je.aw, new aey("end"));
   public static final aex<dkz> h = aex.a(je.aw, new aey("caves"));
   public static final aex<dkz> i = aex.a(je.aw, new aey("floating_islands"));

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

   public dlt.a d() {
      return this.t ? dlt.a.a : dlt.a.b;
   }

   public static void a(nt<dkz> $$0) {
      $$0.a(c, a($$0, false, false));
      $$0.a(d, a($$0, false, true));
      $$0.a(e, a($$0, true, false));
      $$0.a(f, c($$0));
      $$0.a(g, b($$0));
      $$0.a(h, d($$0));
      $$0.a(i, e($$0));
   }

   private static dkz b(nt<?> $$0) {
      return new dkz(dlc.d, csy.fz.n(), csy.a.n(), dlb.a($$0.a(je.at)), og.c(), List.of(), 0, true, false, false, true);
   }

   private static dkz c(nt<?> $$0) {
      return new dkz(dlc.c, csy.dW.n(), csy.H.n(), dlb.a($$0.a(je.at), $$0.a(je.ax)), og.b(), List.of(), 32, false, false, false, true);
   }

   private static dkz a(nt<?> $$0, boolean $$1, boolean $$2) {
      return new dkz(dlc.b, csy.b.n(), csy.G.n(), dlb.a($$0.a(je.at), $$0.a(je.ax), $$2, $$1), og.a(), new crl().a(), 63, false, true, true, false);
   }

   private static dkz d(nt<?> $$0) {
      return new dkz(dlc.e, csy.b.n(), csy.G.n(), dlb.b($$0.a(je.at), $$0.a(je.ax)), og.a(false, true, true), List.of(), 32, false, false, false, true);
   }

   private static dkz e(nt<?> $$0) {
      return new dkz(dlc.f, csy.b.n(), csy.G.n(), dlb.c($$0.a(je.at), $$0.a(je.ax)), og.a(false, false, false), List.of(), -64, false, false, false, true);
   }

   public static dkz e() {
      return new dkz(dlc.b, csy.b.n(), csy.a.n(), dlb.a(), og.d(), List.of(), 63, true, false, false, false);
   }

   public dlc f() {
      return this.j;
   }

   public dfl g() {
      return this.k;
   }

   public dfl h() {
      return this.l;
   }

   public dla i() {
      return this.m;
   }

   public dll.o j() {
      return this.n;
   }

   public List<cre.d> k() {
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
