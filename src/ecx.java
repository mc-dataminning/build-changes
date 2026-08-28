import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record ecx(eda j, dwx k, dwx l, ecy m, edj.o n, List<dht.d> o, int p, boolean q, boolean r, boolean s, boolean t) {
   public static final Codec<ecx> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               eda.a.fieldOf("noise").forGetter(ecx::f),
               dwx.a.fieldOf("default_block").forGetter(ecx::g),
               dwx.a.fieldOf("default_fluid").forGetter(ecx::h),
               ecy.a.fieldOf("noise_router").forGetter(ecx::i),
               edj.o.b.fieldOf("surface_rule").forGetter(ecx::j),
               dht.d.a.listOf().fieldOf("spawn_target").forGetter(ecx::k),
               Codec.INT.fieldOf("sea_level").forGetter(ecx::l),
               Codec.BOOL.fieldOf("disable_mob_generation").forGetter(ecx::a),
               Codec.BOOL.fieldOf("aquifers_enabled").forGetter(ecx::b),
               Codec.BOOL.fieldOf("ore_veins_enabled").forGetter(ecx::c),
               Codec.BOOL.fieldOf("legacy_random_source").forGetter(ecx::n)
            )
            .apply($$0, ecx::new)
   );
   public static final Codec<jr<ecx>> b = akq.a(mc.aR, a);
   public static final akt<ecx> c = akt.a(mc.aR, aku.b("overworld"));
   public static final akt<ecx> d = akt.a(mc.aR, aku.b("large_biomes"));
   public static final akt<ecx> e = akt.a(mc.aR, aku.b("amplified"));
   public static final akt<ecx> f = akt.a(mc.aR, aku.b("nether"));
   public static final akt<ecx> g = akt.a(mc.aR, aku.b("end"));
   public static final akt<ecx> h = akt.a(mc.aR, aku.b("caves"));
   public static final akt<ecx> i = akt.a(mc.aR, aku.b("floating_islands"));

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

   public edr.a d() {
      return this.t ? edr.a.a : edr.a.b;
   }

   public static void a(qe<ecx> $$0) {
      $$0.a(c, a($$0, false, false));
      $$0.a(d, a($$0, false, true));
      $$0.a(e, a($$0, true, false));
      $$0.a(f, c($$0));
      $$0.a(g, b($$0));
      $$0.a(h, d($$0));
      $$0.a(i, e($$0));
   }

   private static ecx b(qe<?> $$0) {
      return new ecx(eda.d, djo.fU.m(), djo.a.m(), ecz.a($$0.a(mc.aM)), qr.c(), List.of(), 0, true, false, false, true);
   }

   private static ecx c(qe<?> $$0) {
      return new ecx(eda.c, djo.ei.m(), djo.K.m(), ecz.a($$0.a(mc.aM), $$0.a(mc.aS)), qr.b(), List.of(), 32, false, false, false, true);
   }

   private static ecx a(qe<?> $$0, boolean $$1, boolean $$2) {
      return new ecx(eda.b, djo.b.m(), djo.J.m(), ecz.a($$0.a(mc.aM), $$0.a(mc.aS), $$2, $$1), qr.a(), new dia().a(), 63, false, true, true, false);
   }

   private static ecx d(qe<?> $$0) {
      return new ecx(eda.e, djo.b.m(), djo.J.m(), ecz.b($$0.a(mc.aM), $$0.a(mc.aS)), qr.a(false, true, true), List.of(), 32, false, false, false, true);
   }

   private static ecx e(qe<?> $$0) {
      return new ecx(eda.f, djo.b.m(), djo.J.m(), ecz.c($$0.a(mc.aM), $$0.a(mc.aS)), qr.a(false, false, false), List.of(), -64, false, false, false, true);
   }

   public static ecx e() {
      return new ecx(eda.b, djo.b.m(), djo.a.m(), ecz.a(), qr.d(), List.of(), 63, true, false, false, false);
   }

   public eda f() {
      return this.j;
   }

   public dwx g() {
      return this.k;
   }

   public dwx h() {
      return this.l;
   }

   public ecy i() {
      return this.m;
   }

   public edj.o j() {
      return this.n;
   }

   public List<dht.d> k() {
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
