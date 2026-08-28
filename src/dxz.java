import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record dxz(dyc j, dsc k, dsc l, dya m, dyl.o n, List<ddg.d> o, int p, boolean q, boolean r, boolean s, boolean t) {
   public static final Codec<dxz> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dyc.a.fieldOf("noise").forGetter(dxz::f),
               dsc.b.fieldOf("default_block").forGetter(dxz::g),
               dsc.b.fieldOf("default_fluid").forGetter(dxz::h),
               dya.a.fieldOf("noise_router").forGetter(dxz::i),
               dyl.o.b.fieldOf("surface_rule").forGetter(dxz::j),
               ddg.d.a.listOf().fieldOf("spawn_target").forGetter(dxz::k),
               Codec.INT.fieldOf("sea_level").forGetter(dxz::l),
               Codec.BOOL.fieldOf("disable_mob_generation").forGetter(dxz::a),
               Codec.BOOL.fieldOf("aquifers_enabled").forGetter(dxz::b),
               Codec.BOOL.fieldOf("ore_veins_enabled").forGetter(dxz::c),
               Codec.BOOL.fieldOf("legacy_random_source").forGetter(dxz::n)
            )
            .apply($$0, dxz::new)
   );
   public static final Codec<ji<dxz>> b = alb.a(lq.aG, a);
   public static final ale<dxz> c = ale.a(lq.aG, new alf("overworld"));
   public static final ale<dxz> d = ale.a(lq.aG, new alf("large_biomes"));
   public static final ale<dxz> e = ale.a(lq.aG, new alf("amplified"));
   public static final ale<dxz> f = ale.a(lq.aG, new alf("nether"));
   public static final ale<dxz> g = ale.a(lq.aG, new alf("end"));
   public static final ale<dxz> h = ale.a(lq.aG, new alf("caves"));
   public static final ale<dxz> i = ale.a(lq.aG, new alf("floating_islands"));

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

   public dyt.a d() {
      return this.t ? dyt.a.a : dyt.a.b;
   }

   public static void a(rc<dxz> $$0) {
      $$0.a(c, a($$0, false, false));
      $$0.a(d, a($$0, false, true));
      $$0.a(e, a($$0, true, false));
      $$0.a(f, c($$0));
      $$0.a(g, b($$0));
      $$0.a(h, d($$0));
      $$0.a(i, e($$0));
   }

   private static dxz b(rc<?> $$0) {
      return new dxz(dyc.d, dfb.fz.o(), dfb.a.o(), dyb.a($$0.a(lq.aD)), rp.c(), List.of(), 0, true, false, false, true);
   }

   private static dxz c(rc<?> $$0) {
      return new dxz(dyc.c, dfb.dV.o(), dfb.H.o(), dyb.a($$0.a(lq.aD), $$0.a(lq.aH)), rp.b(), List.of(), 32, false, false, false, true);
   }

   private static dxz a(rc<?> $$0, boolean $$1, boolean $$2) {
      return new dxz(dyc.b, dfb.b.o(), dfb.G.o(), dyb.a($$0.a(lq.aD), $$0.a(lq.aH), $$2, $$1), rp.a(), new ddn().a(), 63, false, true, true, false);
   }

   private static dxz d(rc<?> $$0) {
      return new dxz(dyc.e, dfb.b.o(), dfb.G.o(), dyb.b($$0.a(lq.aD), $$0.a(lq.aH)), rp.a(false, true, true), List.of(), 32, false, false, false, true);
   }

   private static dxz e(rc<?> $$0) {
      return new dxz(dyc.f, dfb.b.o(), dfb.G.o(), dyb.c($$0.a(lq.aD), $$0.a(lq.aH)), rp.a(false, false, false), List.of(), -64, false, false, false, true);
   }

   public static dxz e() {
      return new dxz(dyc.b, dfb.b.o(), dfb.a.o(), dyb.a(), rp.d(), List.of(), 63, true, false, false, false);
   }

   public dyc f() {
      return this.j;
   }

   public dsc g() {
      return this.k;
   }

   public dsc h() {
      return this.l;
   }

   public dya i() {
      return this.m;
   }

   public dyl.o j() {
      return this.n;
   }

   public List<ddg.d> k() {
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
