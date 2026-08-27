import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record dvv(dvy j, dpy k, dpy l, dvw m, dwh.o n, List<dbc.d> o, int p, boolean q, boolean r, boolean s, boolean t) {
   public static final Codec<dvv> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dvy.a.fieldOf("noise").forGetter(dvv::f),
               dpy.b.fieldOf("default_block").forGetter(dvv::g),
               dpy.b.fieldOf("default_fluid").forGetter(dvv::h),
               dvw.a.fieldOf("noise_router").forGetter(dvv::i),
               dwh.o.b.fieldOf("surface_rule").forGetter(dvv::j),
               dbc.d.a.listOf().fieldOf("spawn_target").forGetter(dvv::k),
               Codec.INT.fieldOf("sea_level").forGetter(dvv::l),
               Codec.BOOL.fieldOf("disable_mob_generation").forGetter(dvv::a),
               Codec.BOOL.fieldOf("aquifers_enabled").forGetter(dvv::b),
               Codec.BOOL.fieldOf("ore_veins_enabled").forGetter(dvv::c),
               Codec.BOOL.fieldOf("legacy_random_source").forGetter(dvv::n)
            )
            .apply($$0, dvv::new)
   );
   public static final Codec<iv<dvv>> b = akb.a(ld.aF, a);
   public static final ake<dvv> c = ake.a(ld.aF, new akf("overworld"));
   public static final ake<dvv> d = ake.a(ld.aF, new akf("large_biomes"));
   public static final ake<dvv> e = ake.a(ld.aF, new akf("amplified"));
   public static final ake<dvv> f = ake.a(ld.aF, new akf("nether"));
   public static final ake<dvv> g = ake.a(ld.aF, new akf("end"));
   public static final ake<dvv> h = ake.a(ld.aF, new akf("caves"));
   public static final ake<dvv> i = ake.a(ld.aF, new akf("floating_islands"));

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

   public dwp.a d() {
      return this.t ? dwp.a.a : dwp.a.b;
   }

   public static void a(qj<dvv> $$0) {
      $$0.a(c, a($$0, false, false));
      $$0.a(d, a($$0, false, true));
      $$0.a(e, a($$0, true, false));
      $$0.a(f, c($$0));
      $$0.a(g, b($$0));
      $$0.a(h, d($$0));
      $$0.a(i, e($$0));
   }

   private static dvv b(qj<?> $$0) {
      return new dvv(dvy.d, dcx.fz.n(), dcx.a.n(), dvx.a($$0.a(ld.aC)), qw.c(), List.of(), 0, true, false, false, true);
   }

   private static dvv c(qj<?> $$0) {
      return new dvv(dvy.c, dcx.dV.n(), dcx.H.n(), dvx.a($$0.a(ld.aC), $$0.a(ld.aG)), qw.b(), List.of(), 32, false, false, false, true);
   }

   private static dvv a(qj<?> $$0, boolean $$1, boolean $$2) {
      return new dvv(dvy.b, dcx.b.n(), dcx.G.n(), dvx.a($$0.a(ld.aC), $$0.a(ld.aG), $$2, $$1), qw.a(), new dbj().a(), 63, false, true, true, false);
   }

   private static dvv d(qj<?> $$0) {
      return new dvv(dvy.e, dcx.b.n(), dcx.G.n(), dvx.b($$0.a(ld.aC), $$0.a(ld.aG)), qw.a(false, true, true), List.of(), 32, false, false, false, true);
   }

   private static dvv e(qj<?> $$0) {
      return new dvv(dvy.f, dcx.b.n(), dcx.G.n(), dvx.c($$0.a(ld.aC), $$0.a(ld.aG)), qw.a(false, false, false), List.of(), -64, false, false, false, true);
   }

   public static dvv e() {
      return new dvv(dvy.b, dcx.b.n(), dcx.a.n(), dvx.a(), qw.d(), List.of(), 63, true, false, false, false);
   }

   public dvy f() {
      return this.j;
   }

   public dpy g() {
      return this.k;
   }

   public dpy h() {
      return this.l;
   }

   public dvw i() {
      return this.m;
   }

   public dwh.o j() {
      return this.n;
   }

   public List<dbc.d> k() {
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
