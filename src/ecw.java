import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record ecw(ecz j, dww k, dww l, ecx m, edi.o n, List<dhs.d> o, int p, boolean q, boolean r, boolean s, boolean t) {
   public static final Codec<ecw> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ecz.a.fieldOf("noise").forGetter(ecw::f),
               dww.a.fieldOf("default_block").forGetter(ecw::g),
               dww.a.fieldOf("default_fluid").forGetter(ecw::h),
               ecx.a.fieldOf("noise_router").forGetter(ecw::i),
               edi.o.b.fieldOf("surface_rule").forGetter(ecw::j),
               dhs.d.a.listOf().fieldOf("spawn_target").forGetter(ecw::k),
               Codec.INT.fieldOf("sea_level").forGetter(ecw::l),
               Codec.BOOL.fieldOf("disable_mob_generation").forGetter(ecw::a),
               Codec.BOOL.fieldOf("aquifers_enabled").forGetter(ecw::b),
               Codec.BOOL.fieldOf("ore_veins_enabled").forGetter(ecw::c),
               Codec.BOOL.fieldOf("legacy_random_source").forGetter(ecw::n)
            )
            .apply($$0, ecw::new)
   );
   public static final Codec<jr<ecw>> b = akr.a(mc.aR, a);
   public static final aku<ecw> c = aku.a(mc.aR, akv.b("overworld"));
   public static final aku<ecw> d = aku.a(mc.aR, akv.b("large_biomes"));
   public static final aku<ecw> e = aku.a(mc.aR, akv.b("amplified"));
   public static final aku<ecw> f = aku.a(mc.aR, akv.b("nether"));
   public static final aku<ecw> g = aku.a(mc.aR, akv.b("end"));
   public static final aku<ecw> h = aku.a(mc.aR, akv.b("caves"));
   public static final aku<ecw> i = aku.a(mc.aR, akv.b("floating_islands"));

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

   public edq.a d() {
      return this.t ? edq.a.a : edq.a.b;
   }

   public static void a(qe<ecw> $$0) {
      $$0.a(c, a($$0, false, false));
      $$0.a(d, a($$0, false, true));
      $$0.a(e, a($$0, true, false));
      $$0.a(f, c($$0));
      $$0.a(g, b($$0));
      $$0.a(h, d($$0));
      $$0.a(i, e($$0));
   }

   private static ecw b(qe<?> $$0) {
      return new ecw(ecz.d, djn.fU.m(), djn.a.m(), ecy.a($$0.a(mc.aM)), qr.c(), List.of(), 0, true, false, false, true);
   }

   private static ecw c(qe<?> $$0) {
      return new ecw(ecz.c, djn.ei.m(), djn.K.m(), ecy.a($$0.a(mc.aM), $$0.a(mc.aS)), qr.b(), List.of(), 32, false, false, false, true);
   }

   private static ecw a(qe<?> $$0, boolean $$1, boolean $$2) {
      return new ecw(ecz.b, djn.b.m(), djn.J.m(), ecy.a($$0.a(mc.aM), $$0.a(mc.aS), $$2, $$1), qr.a(), new dhz().a(), 63, false, true, true, false);
   }

   private static ecw d(qe<?> $$0) {
      return new ecw(ecz.e, djn.b.m(), djn.J.m(), ecy.b($$0.a(mc.aM), $$0.a(mc.aS)), qr.a(false, true, true), List.of(), 32, false, false, false, true);
   }

   private static ecw e(qe<?> $$0) {
      return new ecw(ecz.f, djn.b.m(), djn.J.m(), ecy.c($$0.a(mc.aM), $$0.a(mc.aS)), qr.a(false, false, false), List.of(), -64, false, false, false, true);
   }

   public static ecw e() {
      return new ecw(ecz.b, djn.b.m(), djn.a.m(), ecy.a(), qr.d(), List.of(), 63, true, false, false, false);
   }

   public ecz f() {
      return this.j;
   }

   public dww g() {
      return this.k;
   }

   public dww h() {
      return this.l;
   }

   public ecx i() {
      return this.m;
   }

   public edi.o j() {
      return this.n;
   }

   public List<dhs.d> k() {
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
