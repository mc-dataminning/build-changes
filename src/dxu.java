import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record dxu(dxx j, drx k, drx l, dxv m, dyg.o n, List<ddb.d> o, int p, boolean q, boolean r, boolean s, boolean t) {
   public static final Codec<dxu> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dxx.a.fieldOf("noise").forGetter(dxu::f),
               drx.b.fieldOf("default_block").forGetter(dxu::g),
               drx.b.fieldOf("default_fluid").forGetter(dxu::h),
               dxv.a.fieldOf("noise_router").forGetter(dxu::i),
               dyg.o.b.fieldOf("surface_rule").forGetter(dxu::j),
               ddb.d.a.listOf().fieldOf("spawn_target").forGetter(dxu::k),
               Codec.INT.fieldOf("sea_level").forGetter(dxu::l),
               Codec.BOOL.fieldOf("disable_mob_generation").forGetter(dxu::a),
               Codec.BOOL.fieldOf("aquifers_enabled").forGetter(dxu::b),
               Codec.BOOL.fieldOf("ore_veins_enabled").forGetter(dxu::c),
               Codec.BOOL.fieldOf("legacy_random_source").forGetter(dxu::n)
            )
            .apply($$0, dxu::new)
   );
   public static final Codec<ji<dxu>> b = akx.a(lq.aG, a);
   public static final ala<dxu> c = ala.a(lq.aG, new alb("overworld"));
   public static final ala<dxu> d = ala.a(lq.aG, new alb("large_biomes"));
   public static final ala<dxu> e = ala.a(lq.aG, new alb("amplified"));
   public static final ala<dxu> f = ala.a(lq.aG, new alb("nether"));
   public static final ala<dxu> g = ala.a(lq.aG, new alb("end"));
   public static final ala<dxu> h = ala.a(lq.aG, new alb("caves"));
   public static final ala<dxu> i = ala.a(lq.aG, new alb("floating_islands"));

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

   public dyo.a d() {
      return this.t ? dyo.a.a : dyo.a.b;
   }

   public static void a(rc<dxu> $$0) {
      $$0.a(c, a($$0, false, false));
      $$0.a(d, a($$0, false, true));
      $$0.a(e, a($$0, true, false));
      $$0.a(f, c($$0));
      $$0.a(g, b($$0));
      $$0.a(h, d($$0));
      $$0.a(i, e($$0));
   }

   private static dxu b(rc<?> $$0) {
      return new dxu(dxx.d, dew.fz.n(), dew.a.n(), dxw.a($$0.a(lq.aD)), rp.c(), List.of(), 0, true, false, false, true);
   }

   private static dxu c(rc<?> $$0) {
      return new dxu(dxx.c, dew.dV.n(), dew.H.n(), dxw.a($$0.a(lq.aD), $$0.a(lq.aH)), rp.b(), List.of(), 32, false, false, false, true);
   }

   private static dxu a(rc<?> $$0, boolean $$1, boolean $$2) {
      return new dxu(dxx.b, dew.b.n(), dew.G.n(), dxw.a($$0.a(lq.aD), $$0.a(lq.aH), $$2, $$1), rp.a(), new ddi().a(), 63, false, true, true, false);
   }

   private static dxu d(rc<?> $$0) {
      return new dxu(dxx.e, dew.b.n(), dew.G.n(), dxw.b($$0.a(lq.aD), $$0.a(lq.aH)), rp.a(false, true, true), List.of(), 32, false, false, false, true);
   }

   private static dxu e(rc<?> $$0) {
      return new dxu(dxx.f, dew.b.n(), dew.G.n(), dxw.c($$0.a(lq.aD), $$0.a(lq.aH)), rp.a(false, false, false), List.of(), -64, false, false, false, true);
   }

   public static dxu e() {
      return new dxu(dxx.b, dew.b.n(), dew.a.n(), dxw.a(), rp.d(), List.of(), 63, true, false, false, false);
   }

   public dxx f() {
      return this.j;
   }

   public drx g() {
      return this.k;
   }

   public drx h() {
      return this.l;
   }

   public dxv i() {
      return this.m;
   }

   public dyg.o j() {
      return this.n;
   }

   public List<ddb.d> k() {
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
