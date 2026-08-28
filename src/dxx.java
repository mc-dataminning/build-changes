import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record dxx(dya j, dsa k, dsa l, dxy m, dyj.o n, List<dde.d> o, int p, boolean q, boolean r, boolean s, boolean t) {
   public static final Codec<dxx> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dya.a.fieldOf("noise").forGetter(dxx::f),
               dsa.b.fieldOf("default_block").forGetter(dxx::g),
               dsa.b.fieldOf("default_fluid").forGetter(dxx::h),
               dxy.a.fieldOf("noise_router").forGetter(dxx::i),
               dyj.o.b.fieldOf("surface_rule").forGetter(dxx::j),
               dde.d.a.listOf().fieldOf("spawn_target").forGetter(dxx::k),
               Codec.INT.fieldOf("sea_level").forGetter(dxx::l),
               Codec.BOOL.fieldOf("disable_mob_generation").forGetter(dxx::a),
               Codec.BOOL.fieldOf("aquifers_enabled").forGetter(dxx::b),
               Codec.BOOL.fieldOf("ore_veins_enabled").forGetter(dxx::c),
               Codec.BOOL.fieldOf("legacy_random_source").forGetter(dxx::n)
            )
            .apply($$0, dxx::new)
   );
   public static final Codec<ji<dxx>> b = ala.a(lq.aG, a);
   public static final ald<dxx> c = ald.a(lq.aG, new ale("overworld"));
   public static final ald<dxx> d = ald.a(lq.aG, new ale("large_biomes"));
   public static final ald<dxx> e = ald.a(lq.aG, new ale("amplified"));
   public static final ald<dxx> f = ald.a(lq.aG, new ale("nether"));
   public static final ald<dxx> g = ald.a(lq.aG, new ale("end"));
   public static final ald<dxx> h = ald.a(lq.aG, new ale("caves"));
   public static final ald<dxx> i = ald.a(lq.aG, new ale("floating_islands"));

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

   public dyr.a d() {
      return this.t ? dyr.a.a : dyr.a.b;
   }

   public static void a(rc<dxx> $$0) {
      $$0.a(c, a($$0, false, false));
      $$0.a(d, a($$0, false, true));
      $$0.a(e, a($$0, true, false));
      $$0.a(f, c($$0));
      $$0.a(g, b($$0));
      $$0.a(h, d($$0));
      $$0.a(i, e($$0));
   }

   private static dxx b(rc<?> $$0) {
      return new dxx(dya.d, dez.fz.o(), dez.a.o(), dxz.a($$0.a(lq.aD)), rp.c(), List.of(), 0, true, false, false, true);
   }

   private static dxx c(rc<?> $$0) {
      return new dxx(dya.c, dez.dV.o(), dez.H.o(), dxz.a($$0.a(lq.aD), $$0.a(lq.aH)), rp.b(), List.of(), 32, false, false, false, true);
   }

   private static dxx a(rc<?> $$0, boolean $$1, boolean $$2) {
      return new dxx(dya.b, dez.b.o(), dez.G.o(), dxz.a($$0.a(lq.aD), $$0.a(lq.aH), $$2, $$1), rp.a(), new ddl().a(), 63, false, true, true, false);
   }

   private static dxx d(rc<?> $$0) {
      return new dxx(dya.e, dez.b.o(), dez.G.o(), dxz.b($$0.a(lq.aD), $$0.a(lq.aH)), rp.a(false, true, true), List.of(), 32, false, false, false, true);
   }

   private static dxx e(rc<?> $$0) {
      return new dxx(dya.f, dez.b.o(), dez.G.o(), dxz.c($$0.a(lq.aD), $$0.a(lq.aH)), rp.a(false, false, false), List.of(), -64, false, false, false, true);
   }

   public static dxx e() {
      return new dxx(dya.b, dez.b.o(), dez.a.o(), dxz.a(), rp.d(), List.of(), 63, true, false, false, false);
   }

   public dya f() {
      return this.j;
   }

   public dsa g() {
      return this.k;
   }

   public dsa h() {
      return this.l;
   }

   public dxy i() {
      return this.m;
   }

   public dyj.o j() {
      return this.n;
   }

   public List<dde.d> k() {
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
