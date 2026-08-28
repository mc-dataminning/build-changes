import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record ecv(ecy j, dwv k, dwv l, ecw m, edh.o n, List<dhr.d> o, int p, boolean q, boolean r, boolean s, boolean t) {
   public static final Codec<ecv> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ecy.a.fieldOf("noise").forGetter(ecv::f),
               dwv.a.fieldOf("default_block").forGetter(ecv::g),
               dwv.a.fieldOf("default_fluid").forGetter(ecv::h),
               ecw.a.fieldOf("noise_router").forGetter(ecv::i),
               edh.o.b.fieldOf("surface_rule").forGetter(ecv::j),
               dhr.d.a.listOf().fieldOf("spawn_target").forGetter(ecv::k),
               Codec.INT.fieldOf("sea_level").forGetter(ecv::l),
               Codec.BOOL.fieldOf("disable_mob_generation").forGetter(ecv::a),
               Codec.BOOL.fieldOf("aquifers_enabled").forGetter(ecv::b),
               Codec.BOOL.fieldOf("ore_veins_enabled").forGetter(ecv::c),
               Codec.BOOL.fieldOf("legacy_random_source").forGetter(ecv::n)
            )
            .apply($$0, ecv::new)
   );
   public static final Codec<jr<ecv>> b = akq.a(mc.aR, a);
   public static final akt<ecv> c = akt.a(mc.aR, aku.b("overworld"));
   public static final akt<ecv> d = akt.a(mc.aR, aku.b("large_biomes"));
   public static final akt<ecv> e = akt.a(mc.aR, aku.b("amplified"));
   public static final akt<ecv> f = akt.a(mc.aR, aku.b("nether"));
   public static final akt<ecv> g = akt.a(mc.aR, aku.b("end"));
   public static final akt<ecv> h = akt.a(mc.aR, aku.b("caves"));
   public static final akt<ecv> i = akt.a(mc.aR, aku.b("floating_islands"));

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

   public edp.a d() {
      return this.t ? edp.a.a : edp.a.b;
   }

   public static void a(qe<ecv> $$0) {
      $$0.a(c, a($$0, false, false));
      $$0.a(d, a($$0, false, true));
      $$0.a(e, a($$0, true, false));
      $$0.a(f, c($$0));
      $$0.a(g, b($$0));
      $$0.a(h, d($$0));
      $$0.a(i, e($$0));
   }

   private static ecv b(qe<?> $$0) {
      return new ecv(ecy.d, djm.fU.m(), djm.a.m(), ecx.a($$0.a(mc.aM)), qr.c(), List.of(), 0, true, false, false, true);
   }

   private static ecv c(qe<?> $$0) {
      return new ecv(ecy.c, djm.ei.m(), djm.K.m(), ecx.a($$0.a(mc.aM), $$0.a(mc.aS)), qr.b(), List.of(), 32, false, false, false, true);
   }

   private static ecv a(qe<?> $$0, boolean $$1, boolean $$2) {
      return new ecv(ecy.b, djm.b.m(), djm.J.m(), ecx.a($$0.a(mc.aM), $$0.a(mc.aS), $$2, $$1), qr.a(), new dhy().a(), 63, false, true, true, false);
   }

   private static ecv d(qe<?> $$0) {
      return new ecv(ecy.e, djm.b.m(), djm.J.m(), ecx.b($$0.a(mc.aM), $$0.a(mc.aS)), qr.a(false, true, true), List.of(), 32, false, false, false, true);
   }

   private static ecv e(qe<?> $$0) {
      return new ecv(ecy.f, djm.b.m(), djm.J.m(), ecx.c($$0.a(mc.aM), $$0.a(mc.aS)), qr.a(false, false, false), List.of(), -64, false, false, false, true);
   }

   public static ecv e() {
      return new ecv(ecy.b, djm.b.m(), djm.a.m(), ecx.a(), qr.d(), List.of(), 63, true, false, false, false);
   }

   public ecy f() {
      return this.j;
   }

   public dwv g() {
      return this.k;
   }

   public dwv h() {
      return this.l;
   }

   public ecw i() {
      return this.m;
   }

   public edh.o j() {
      return this.n;
   }

   public List<dhr.d> k() {
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
