import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record eab(eae j, dua k, dua l, eac m, ean.o n, List<dfc.d> o, int p, boolean q, boolean r, boolean s, boolean t) {
   public static final Codec<eab> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               eae.a.fieldOf("noise").forGetter(eab::f),
               dua.a.fieldOf("default_block").forGetter(eab::g),
               dua.a.fieldOf("default_fluid").forGetter(eab::h),
               eac.a.fieldOf("noise_router").forGetter(eab::i),
               ean.o.b.fieldOf("surface_rule").forGetter(eab::j),
               dfc.d.a.listOf().fieldOf("spawn_target").forGetter(eab::k),
               Codec.INT.fieldOf("sea_level").forGetter(eab::l),
               Codec.BOOL.fieldOf("disable_mob_generation").forGetter(eab::a),
               Codec.BOOL.fieldOf("aquifers_enabled").forGetter(eab::b),
               Codec.BOOL.fieldOf("ore_veins_enabled").forGetter(eab::c),
               Codec.BOOL.fieldOf("legacy_random_source").forGetter(eab::n)
            )
            .apply($$0, eab::new)
   );
   public static final Codec<jn<eab>> b = akx.a(lv.aO, a);
   public static final ala<eab> c = ala.a(lv.aO, alb.b("overworld"));
   public static final ala<eab> d = ala.a(lv.aO, alb.b("large_biomes"));
   public static final ala<eab> e = ala.a(lv.aO, alb.b("amplified"));
   public static final ala<eab> f = ala.a(lv.aO, alb.b("nether"));
   public static final ala<eab> g = ala.a(lv.aO, alb.b("end"));
   public static final ala<eab> h = ala.a(lv.aO, alb.b("caves"));
   public static final ala<eab> i = ala.a(lv.aO, alb.b("floating_islands"));

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

   public eav.a d() {
      return this.t ? eav.a.a : eav.a.b;
   }

   public static void a(qt<eab> $$0) {
      $$0.a(c, a($$0, false, false));
      $$0.a(d, a($$0, false, true));
      $$0.a(e, a($$0, true, false));
      $$0.a(f, c($$0));
      $$0.a(g, b($$0));
      $$0.a(h, d($$0));
      $$0.a(i, e($$0));
   }

   private static eab b(qt<?> $$0) {
      return new eab(eae.d, dgx.fz.o(), dgx.a.o(), ead.a($$0.a(lv.aJ)), rg.c(), List.of(), 0, true, false, false, true);
   }

   private static eab c(qt<?> $$0) {
      return new eab(eae.c, dgx.dV.o(), dgx.H.o(), ead.a($$0.a(lv.aJ), $$0.a(lv.aP)), rg.b(), List.of(), 32, false, false, false, true);
   }

   private static eab a(qt<?> $$0, boolean $$1, boolean $$2) {
      return new eab(eae.b, dgx.b.o(), dgx.G.o(), ead.a($$0.a(lv.aJ), $$0.a(lv.aP), $$2, $$1), rg.a(), new dfj().a(), 63, false, true, true, false);
   }

   private static eab d(qt<?> $$0) {
      return new eab(eae.e, dgx.b.o(), dgx.G.o(), ead.b($$0.a(lv.aJ), $$0.a(lv.aP)), rg.a(false, true, true), List.of(), 32, false, false, false, true);
   }

   private static eab e(qt<?> $$0) {
      return new eab(eae.f, dgx.b.o(), dgx.G.o(), ead.c($$0.a(lv.aJ), $$0.a(lv.aP)), rg.a(false, false, false), List.of(), -64, false, false, false, true);
   }

   public static eab e() {
      return new eab(eae.b, dgx.b.o(), dgx.a.o(), ead.a(), rg.d(), List.of(), 63, true, false, false, false);
   }

   public eae f() {
      return this.j;
   }

   public dua g() {
      return this.k;
   }

   public dua h() {
      return this.l;
   }

   public eac i() {
      return this.m;
   }

   public ean.o j() {
      return this.n;
   }

   public List<dfc.d> k() {
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
