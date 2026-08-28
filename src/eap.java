import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record eap(eas j, duo k, duo l, eaq m, ebb.o n, List<dfq.d> o, int p, boolean q, boolean r, boolean s, boolean t) {
   public static final Codec<eap> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               eas.a.fieldOf("noise").forGetter(eap::f),
               duo.a.fieldOf("default_block").forGetter(eap::g),
               duo.a.fieldOf("default_fluid").forGetter(eap::h),
               eaq.a.fieldOf("noise_router").forGetter(eap::i),
               ebb.o.b.fieldOf("surface_rule").forGetter(eap::j),
               dfq.d.a.listOf().fieldOf("spawn_target").forGetter(eap::k),
               Codec.INT.fieldOf("sea_level").forGetter(eap::l),
               Codec.BOOL.fieldOf("disable_mob_generation").forGetter(eap::a),
               Codec.BOOL.fieldOf("aquifers_enabled").forGetter(eap::b),
               Codec.BOOL.fieldOf("ore_veins_enabled").forGetter(eap::c),
               Codec.BOOL.fieldOf("legacy_random_source").forGetter(eap::n)
            )
            .apply($$0, eap::new)
   );
   public static final Codec<jn<eap>> b = aky.a(lv.aP, a);
   public static final alb<eap> c = alb.a(lv.aP, alc.b("overworld"));
   public static final alb<eap> d = alb.a(lv.aP, alc.b("large_biomes"));
   public static final alb<eap> e = alb.a(lv.aP, alc.b("amplified"));
   public static final alb<eap> f = alb.a(lv.aP, alc.b("nether"));
   public static final alb<eap> g = alb.a(lv.aP, alc.b("end"));
   public static final alb<eap> h = alb.a(lv.aP, alc.b("caves"));
   public static final alb<eap> i = alb.a(lv.aP, alc.b("floating_islands"));

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

   public ebj.a d() {
      return this.t ? ebj.a.a : ebj.a.b;
   }

   public static void a(qt<eap> $$0) {
      $$0.a(c, a($$0, false, false));
      $$0.a(d, a($$0, false, true));
      $$0.a(e, a($$0, true, false));
      $$0.a(f, c($$0));
      $$0.a(g, b($$0));
      $$0.a(h, d($$0));
      $$0.a(i, e($$0));
   }

   private static eap b(qt<?> $$0) {
      return new eap(eas.d, dhl.fz.o(), dhl.a.o(), ear.a($$0.a(lv.aK)), rg.c(), List.of(), 0, true, false, false, true);
   }

   private static eap c(qt<?> $$0) {
      return new eap(eas.c, dhl.dV.o(), dhl.H.o(), ear.a($$0.a(lv.aK), $$0.a(lv.aQ)), rg.b(), List.of(), 32, false, false, false, true);
   }

   private static eap a(qt<?> $$0, boolean $$1, boolean $$2) {
      return new eap(eas.b, dhl.b.o(), dhl.G.o(), ear.a($$0.a(lv.aK), $$0.a(lv.aQ), $$2, $$1), rg.a(), new dfx().a(), 63, false, true, true, false);
   }

   private static eap d(qt<?> $$0) {
      return new eap(eas.e, dhl.b.o(), dhl.G.o(), ear.b($$0.a(lv.aK), $$0.a(lv.aQ)), rg.a(false, true, true), List.of(), 32, false, false, false, true);
   }

   private static eap e(qt<?> $$0) {
      return new eap(eas.f, dhl.b.o(), dhl.G.o(), ear.c($$0.a(lv.aK), $$0.a(lv.aQ)), rg.a(false, false, false), List.of(), -64, false, false, false, true);
   }

   public static eap e() {
      return new eap(eas.b, dhl.b.o(), dhl.a.o(), ear.a(), rg.d(), List.of(), 63, true, false, false, false);
   }

   public eas f() {
      return this.j;
   }

   public duo g() {
      return this.k;
   }

   public duo h() {
      return this.l;
   }

   public eaq i() {
      return this.m;
   }

   public ebb.o j() {
      return this.n;
   }

   public List<dfq.d> k() {
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
