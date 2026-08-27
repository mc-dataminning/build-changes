import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record dmw(dmz j, dhi k, dhi l, dmx m, dni.o n, List<cth.d> o, int p, boolean q, boolean r, boolean s, boolean t) {
   public static final Codec<dmw> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dmz.a.fieldOf("noise").forGetter(dmw::f),
               dhi.b.fieldOf("default_block").forGetter(dmw::g),
               dhi.b.fieldOf("default_fluid").forGetter(dmw::h),
               dmx.a.fieldOf("noise_router").forGetter(dmw::i),
               dni.o.b.fieldOf("surface_rule").forGetter(dmw::j),
               cth.d.a.listOf().fieldOf("spawn_target").forGetter(dmw::k),
               Codec.INT.fieldOf("sea_level").forGetter(dmw::l),
               Codec.BOOL.fieldOf("disable_mob_generation").forGetter(dmw::a),
               Codec.BOOL.fieldOf("aquifers_enabled").forGetter(dmw::b),
               Codec.BOOL.fieldOf("ore_veins_enabled").forGetter(dmw::c),
               Codec.BOOL.fieldOf("legacy_random_source").forGetter(dmw::n)
            )
            .apply($$0, dmw::new)
   );
   public static final Codec<ib<dmw>> b = age.a(jz.ay, a);
   public static final agh<dmw> c = agh.a(jz.ay, new agi("overworld"));
   public static final agh<dmw> d = agh.a(jz.ay, new agi("large_biomes"));
   public static final agh<dmw> e = agh.a(jz.ay, new agi("amplified"));
   public static final agh<dmw> f = agh.a(jz.ay, new agi("nether"));
   public static final agh<dmw> g = agh.a(jz.ay, new agi("end"));
   public static final agh<dmw> h = agh.a(jz.ay, new agi("caves"));
   public static final agh<dmw> i = agh.a(jz.ay, new agi("floating_islands"));

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

   public dnq.a d() {
      return this.t ? dnq.a.a : dnq.a.b;
   }

   public static void a(ov<dmw> $$0) {
      $$0.a(c, a($$0, false, false));
      $$0.a(d, a($$0, false, true));
      $$0.a(e, a($$0, true, false));
      $$0.a(f, c($$0));
      $$0.a(g, b($$0));
      $$0.a(h, d($$0));
      $$0.a(i, e($$0));
   }

   private static dmw b(ov<?> $$0) {
      return new dmw(dmz.d, cvc.fz.o(), cvc.a.o(), dmy.a($$0.a(jz.av)), pi.c(), List.of(), 0, true, false, false, true);
   }

   private static dmw c(ov<?> $$0) {
      return new dmw(dmz.c, cvc.dV.o(), cvc.H.o(), dmy.a($$0.a(jz.av), $$0.a(jz.az)), pi.b(), List.of(), 32, false, false, false, true);
   }

   private static dmw a(ov<?> $$0, boolean $$1, boolean $$2) {
      return new dmw(dmz.b, cvc.b.o(), cvc.G.o(), dmy.a($$0.a(jz.av), $$0.a(jz.az), $$2, $$1), pi.a(), new cto().a(), 63, false, true, true, false);
   }

   private static dmw d(ov<?> $$0) {
      return new dmw(dmz.e, cvc.b.o(), cvc.G.o(), dmy.b($$0.a(jz.av), $$0.a(jz.az)), pi.a(false, true, true), List.of(), 32, false, false, false, true);
   }

   private static dmw e(ov<?> $$0) {
      return new dmw(dmz.f, cvc.b.o(), cvc.G.o(), dmy.c($$0.a(jz.av), $$0.a(jz.az)), pi.a(false, false, false), List.of(), -64, false, false, false, true);
   }

   public static dmw e() {
      return new dmw(dmz.b, cvc.b.o(), cvc.a.o(), dmy.a(), pi.d(), List.of(), 63, true, false, false, false);
   }

   public dmz f() {
      return this.j;
   }

   public dhi g() {
      return this.k;
   }

   public dhi h() {
      return this.l;
   }

   public dmx i() {
      return this.m;
   }

   public dni.o j() {
      return this.n;
   }

   public List<cth.d> k() {
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
