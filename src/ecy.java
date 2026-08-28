import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record ecy(edb j, dwy k, dwy l, ecz m, edk.o n, List<dhu.d> o, int p, boolean q, boolean r, boolean s, boolean t) {
   public static final Codec<ecy> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               edb.a.fieldOf("noise").forGetter(ecy::f),
               dwy.a.fieldOf("default_block").forGetter(ecy::g),
               dwy.a.fieldOf("default_fluid").forGetter(ecy::h),
               ecz.a.fieldOf("noise_router").forGetter(ecy::i),
               edk.o.b.fieldOf("surface_rule").forGetter(ecy::j),
               dhu.d.a.listOf().fieldOf("spawn_target").forGetter(ecy::k),
               Codec.INT.fieldOf("sea_level").forGetter(ecy::l),
               Codec.BOOL.fieldOf("disable_mob_generation").forGetter(ecy::a),
               Codec.BOOL.fieldOf("aquifers_enabled").forGetter(ecy::b),
               Codec.BOOL.fieldOf("ore_veins_enabled").forGetter(ecy::c),
               Codec.BOOL.fieldOf("legacy_random_source").forGetter(ecy::n)
            )
            .apply($$0, ecy::new)
   );
   public static final Codec<jr<ecy>> b = akr.a(mc.aR, a);
   public static final aku<ecy> c = aku.a(mc.aR, akv.b("overworld"));
   public static final aku<ecy> d = aku.a(mc.aR, akv.b("large_biomes"));
   public static final aku<ecy> e = aku.a(mc.aR, akv.b("amplified"));
   public static final aku<ecy> f = aku.a(mc.aR, akv.b("nether"));
   public static final aku<ecy> g = aku.a(mc.aR, akv.b("end"));
   public static final aku<ecy> h = aku.a(mc.aR, akv.b("caves"));
   public static final aku<ecy> i = aku.a(mc.aR, akv.b("floating_islands"));

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

   public eds.a d() {
      return this.t ? eds.a.a : eds.a.b;
   }

   public static void a(qe<ecy> $$0) {
      $$0.a(c, a($$0, false, false));
      $$0.a(d, a($$0, false, true));
      $$0.a(e, a($$0, true, false));
      $$0.a(f, c($$0));
      $$0.a(g, b($$0));
      $$0.a(h, d($$0));
      $$0.a(i, e($$0));
   }

   private static ecy b(qe<?> $$0) {
      return new ecy(edb.d, djp.fU.m(), djp.a.m(), eda.a($$0.a(mc.aM)), qr.c(), List.of(), 0, true, false, false, true);
   }

   private static ecy c(qe<?> $$0) {
      return new ecy(edb.c, djp.ei.m(), djp.K.m(), eda.a($$0.a(mc.aM), $$0.a(mc.aS)), qr.b(), List.of(), 32, false, false, false, true);
   }

   private static ecy a(qe<?> $$0, boolean $$1, boolean $$2) {
      return new ecy(edb.b, djp.b.m(), djp.J.m(), eda.a($$0.a(mc.aM), $$0.a(mc.aS), $$2, $$1), qr.a(), new dib().a(), 63, false, true, true, false);
   }

   private static ecy d(qe<?> $$0) {
      return new ecy(edb.e, djp.b.m(), djp.J.m(), eda.b($$0.a(mc.aM), $$0.a(mc.aS)), qr.a(false, true, true), List.of(), 32, false, false, false, true);
   }

   private static ecy e(qe<?> $$0) {
      return new ecy(edb.f, djp.b.m(), djp.J.m(), eda.c($$0.a(mc.aM), $$0.a(mc.aS)), qr.a(false, false, false), List.of(), -64, false, false, false, true);
   }

   public static ecy e() {
      return new ecy(edb.b, djp.b.m(), djp.a.m(), eda.a(), qr.d(), List.of(), 63, true, false, false, false);
   }

   public edb f() {
      return this.j;
   }

   public dwy g() {
      return this.k;
   }

   public dwy h() {
      return this.l;
   }

   public ecz i() {
      return this.m;
   }

   public edk.o j() {
      return this.n;
   }

   public List<dhu.d> k() {
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
