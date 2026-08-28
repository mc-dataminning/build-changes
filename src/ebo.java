import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record ebo(ebr j, dvo k, dvo l, ebp m, eca.o n, List<dgq.d> o, int p, boolean q, boolean r, boolean s, boolean t) {
   public static final Codec<ebo> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ebr.a.fieldOf("noise").forGetter(ebo::f),
               dvo.a.fieldOf("default_block").forGetter(ebo::g),
               dvo.a.fieldOf("default_fluid").forGetter(ebo::h),
               ebp.a.fieldOf("noise_router").forGetter(ebo::i),
               eca.o.b.fieldOf("surface_rule").forGetter(ebo::j),
               dgq.d.a.listOf().fieldOf("spawn_target").forGetter(ebo::k),
               Codec.INT.fieldOf("sea_level").forGetter(ebo::l),
               Codec.BOOL.fieldOf("disable_mob_generation").forGetter(ebo::a),
               Codec.BOOL.fieldOf("aquifers_enabled").forGetter(ebo::b),
               Codec.BOOL.fieldOf("ore_veins_enabled").forGetter(ebo::c),
               Codec.BOOL.fieldOf("legacy_random_source").forGetter(ebo::n)
            )
            .apply($$0, ebo::new)
   );
   public static final Codec<jq<ebo>> b = alh.a(ma.aP, a);
   public static final alk<ebo> c = alk.a(ma.aP, all.b("overworld"));
   public static final alk<ebo> d = alk.a(ma.aP, all.b("large_biomes"));
   public static final alk<ebo> e = alk.a(ma.aP, all.b("amplified"));
   public static final alk<ebo> f = alk.a(ma.aP, all.b("nether"));
   public static final alk<ebo> g = alk.a(ma.aP, all.b("end"));
   public static final alk<ebo> h = alk.a(ma.aP, all.b("caves"));
   public static final alk<ebo> i = alk.a(ma.aP, all.b("floating_islands"));

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

   public eci.a d() {
      return this.t ? eci.a.a : eci.a.b;
   }

   public static void a(rb<ebo> $$0) {
      $$0.a(c, a($$0, false, false));
      $$0.a(d, a($$0, false, true));
      $$0.a(e, a($$0, true, false));
      $$0.a(f, c($$0));
      $$0.a(g, b($$0));
      $$0.a(h, d($$0));
      $$0.a(i, e($$0));
   }

   private static ebo b(rb<?> $$0) {
      return new ebo(ebr.d, dil.fz.m(), dil.a.m(), ebq.a($$0.a(ma.aK)), ro.c(), List.of(), 0, true, false, false, true);
   }

   private static ebo c(rb<?> $$0) {
      return new ebo(ebr.c, dil.dV.m(), dil.H.m(), ebq.a($$0.a(ma.aK), $$0.a(ma.aQ)), ro.b(), List.of(), 32, false, false, false, true);
   }

   private static ebo a(rb<?> $$0, boolean $$1, boolean $$2) {
      return new ebo(ebr.b, dil.b.m(), dil.G.m(), ebq.a($$0.a(ma.aK), $$0.a(ma.aQ), $$2, $$1), ro.a(), new dgx().a(), 63, false, true, true, false);
   }

   private static ebo d(rb<?> $$0) {
      return new ebo(ebr.e, dil.b.m(), dil.G.m(), ebq.b($$0.a(ma.aK), $$0.a(ma.aQ)), ro.a(false, true, true), List.of(), 32, false, false, false, true);
   }

   private static ebo e(rb<?> $$0) {
      return new ebo(ebr.f, dil.b.m(), dil.G.m(), ebq.c($$0.a(ma.aK), $$0.a(ma.aQ)), ro.a(false, false, false), List.of(), -64, false, false, false, true);
   }

   public static ebo e() {
      return new ebo(ebr.b, dil.b.m(), dil.a.m(), ebq.a(), ro.d(), List.of(), 63, true, false, false, false);
   }

   public ebr f() {
      return this.j;
   }

   public dvo g() {
      return this.k;
   }

   public dvo h() {
      return this.l;
   }

   public ebp i() {
      return this.m;
   }

   public eca.o j() {
      return this.n;
   }

   public List<dgq.d> k() {
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
