import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record dya(dyd j, dsd k, dsd l, dyb m, dym.o n, List<ddh.d> o, int p, boolean q, boolean r, boolean s, boolean t) {
   public static final Codec<dya> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dyd.a.fieldOf("noise").forGetter(dya::f),
               dsd.b.fieldOf("default_block").forGetter(dya::g),
               dsd.b.fieldOf("default_fluid").forGetter(dya::h),
               dyb.a.fieldOf("noise_router").forGetter(dya::i),
               dym.o.b.fieldOf("surface_rule").forGetter(dya::j),
               ddh.d.a.listOf().fieldOf("spawn_target").forGetter(dya::k),
               Codec.INT.fieldOf("sea_level").forGetter(dya::l),
               Codec.BOOL.fieldOf("disable_mob_generation").forGetter(dya::a),
               Codec.BOOL.fieldOf("aquifers_enabled").forGetter(dya::b),
               Codec.BOOL.fieldOf("ore_veins_enabled").forGetter(dya::c),
               Codec.BOOL.fieldOf("legacy_random_source").forGetter(dya::n)
            )
            .apply($$0, dya::new)
   );
   public static final Codec<ji<dya>> b = alb.a(lq.aG, a);
   public static final ale<dya> c = ale.a(lq.aG, new alf("overworld"));
   public static final ale<dya> d = ale.a(lq.aG, new alf("large_biomes"));
   public static final ale<dya> e = ale.a(lq.aG, new alf("amplified"));
   public static final ale<dya> f = ale.a(lq.aG, new alf("nether"));
   public static final ale<dya> g = ale.a(lq.aG, new alf("end"));
   public static final ale<dya> h = ale.a(lq.aG, new alf("caves"));
   public static final ale<dya> i = ale.a(lq.aG, new alf("floating_islands"));

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

   public dyu.a d() {
      return this.t ? dyu.a.a : dyu.a.b;
   }

   public static void a(rc<dya> $$0) {
      $$0.a(c, a($$0, false, false));
      $$0.a(d, a($$0, false, true));
      $$0.a(e, a($$0, true, false));
      $$0.a(f, c($$0));
      $$0.a(g, b($$0));
      $$0.a(h, d($$0));
      $$0.a(i, e($$0));
   }

   private static dya b(rc<?> $$0) {
      return new dya(dyd.d, dfc.fz.o(), dfc.a.o(), dyc.a($$0.a(lq.aD)), rp.c(), List.of(), 0, true, false, false, true);
   }

   private static dya c(rc<?> $$0) {
      return new dya(dyd.c, dfc.dV.o(), dfc.H.o(), dyc.a($$0.a(lq.aD), $$0.a(lq.aH)), rp.b(), List.of(), 32, false, false, false, true);
   }

   private static dya a(rc<?> $$0, boolean $$1, boolean $$2) {
      return new dya(dyd.b, dfc.b.o(), dfc.G.o(), dyc.a($$0.a(lq.aD), $$0.a(lq.aH), $$2, $$1), rp.a(), new ddo().a(), 63, false, true, true, false);
   }

   private static dya d(rc<?> $$0) {
      return new dya(dyd.e, dfc.b.o(), dfc.G.o(), dyc.b($$0.a(lq.aD), $$0.a(lq.aH)), rp.a(false, true, true), List.of(), 32, false, false, false, true);
   }

   private static dya e(rc<?> $$0) {
      return new dya(dyd.f, dfc.b.o(), dfc.G.o(), dyc.c($$0.a(lq.aD), $$0.a(lq.aH)), rp.a(false, false, false), List.of(), -64, false, false, false, true);
   }

   public static dya e() {
      return new dya(dyd.b, dfc.b.o(), dfc.a.o(), dyc.a(), rp.d(), List.of(), 63, true, false, false, false);
   }

   public dyd f() {
      return this.j;
   }

   public dsd g() {
      return this.k;
   }

   public dsd h() {
      return this.l;
   }

   public dyb i() {
      return this.m;
   }

   public dym.o j() {
      return this.n;
   }

   public List<ddh.d> k() {
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
