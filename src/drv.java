import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record drv(dry j, dme k, dme l, drw m, dsh.o n, List<cxm.d> o, int p, boolean q, boolean r, boolean s, boolean t) {
   public static final Codec<drv> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dry.a.fieldOf("noise").forGetter(drv::f),
               dme.b.fieldOf("default_block").forGetter(drv::g),
               dme.b.fieldOf("default_fluid").forGetter(drv::h),
               drw.a.fieldOf("noise_router").forGetter(drv::i),
               dsh.o.b.fieldOf("surface_rule").forGetter(drv::j),
               cxm.d.a.listOf().fieldOf("spawn_target").forGetter(drv::k),
               Codec.INT.fieldOf("sea_level").forGetter(drv::l),
               Codec.BOOL.fieldOf("disable_mob_generation").forGetter(drv::a),
               Codec.BOOL.fieldOf("aquifers_enabled").forGetter(drv::b),
               Codec.BOOL.fieldOf("ore_veins_enabled").forGetter(drv::c),
               Codec.BOOL.fieldOf("legacy_random_source").forGetter(drv::n)
            )
            .apply($$0, drv::new)
   );
   public static final Codec<il<drv>> b = aiy.a(ki.aB, a);
   public static final ajb<drv> c = ajb.a(ki.aB, new ajc("overworld"));
   public static final ajb<drv> d = ajb.a(ki.aB, new ajc("large_biomes"));
   public static final ajb<drv> e = ajb.a(ki.aB, new ajc("amplified"));
   public static final ajb<drv> f = ajb.a(ki.aB, new ajc("nether"));
   public static final ajb<drv> g = ajb.a(ki.aB, new ajc("end"));
   public static final ajb<drv> h = ajb.a(ki.aB, new ajc("caves"));
   public static final ajb<drv> i = ajb.a(ki.aB, new ajc("floating_islands"));

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

   public dsp.a d() {
      return this.t ? dsp.a.a : dsp.a.b;
   }

   public static void a(pj<drv> $$0) {
      $$0.a(c, a($$0, false, false));
      $$0.a(d, a($$0, false, true));
      $$0.a(e, a($$0, true, false));
      $$0.a(f, c($$0));
      $$0.a(g, b($$0));
      $$0.a(h, d($$0));
      $$0.a(i, e($$0));
   }

   private static drv b(pj<?> $$0) {
      return new drv(dry.d, czh.fz.o(), czh.a.o(), drx.a($$0.a(ki.ay)), pw.c(), List.of(), 0, true, false, false, true);
   }

   private static drv c(pj<?> $$0) {
      return new drv(dry.c, czh.dV.o(), czh.H.o(), drx.a($$0.a(ki.ay), $$0.a(ki.aC)), pw.b(), List.of(), 32, false, false, false, true);
   }

   private static drv a(pj<?> $$0, boolean $$1, boolean $$2) {
      return new drv(dry.b, czh.b.o(), czh.G.o(), drx.a($$0.a(ki.ay), $$0.a(ki.aC), $$2, $$1), pw.a(), new cxt().a(), 63, false, true, true, false);
   }

   private static drv d(pj<?> $$0) {
      return new drv(dry.e, czh.b.o(), czh.G.o(), drx.b($$0.a(ki.ay), $$0.a(ki.aC)), pw.a(false, true, true), List.of(), 32, false, false, false, true);
   }

   private static drv e(pj<?> $$0) {
      return new drv(dry.f, czh.b.o(), czh.G.o(), drx.c($$0.a(ki.ay), $$0.a(ki.aC)), pw.a(false, false, false), List.of(), -64, false, false, false, true);
   }

   public static drv e() {
      return new drv(dry.b, czh.b.o(), czh.a.o(), drx.a(), pw.d(), List.of(), 63, true, false, false, false);
   }

   public dry f() {
      return this.j;
   }

   public dme g() {
      return this.k;
   }

   public dme h() {
      return this.l;
   }

   public drw i() {
      return this.m;
   }

   public dsh.o j() {
      return this.n;
   }

   public List<cxm.d> k() {
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
