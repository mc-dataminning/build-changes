import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record edt(edw j, dxq k, dxq l, edu m, eef.o n, List<dil.d> o, int p, boolean q, boolean r, boolean s, boolean t) {
   public static final Codec<edt> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               edw.a.fieldOf("noise").forGetter(edt::f),
               dxq.a.fieldOf("default_block").forGetter(edt::g),
               dxq.a.fieldOf("default_fluid").forGetter(edt::h),
               edu.a.fieldOf("noise_router").forGetter(edt::i),
               eef.o.b.fieldOf("surface_rule").forGetter(edt::j),
               dil.d.a.listOf().fieldOf("spawn_target").forGetter(edt::k),
               Codec.INT.fieldOf("sea_level").forGetter(edt::l),
               Codec.BOOL.fieldOf("disable_mob_generation").forGetter(edt::a),
               Codec.BOOL.fieldOf("aquifers_enabled").forGetter(edt::b),
               Codec.BOOL.fieldOf("ore_veins_enabled").forGetter(edt::c),
               Codec.BOOL.fieldOf("legacy_random_source").forGetter(edt::n)
            )
            .apply($$0, edt::new)
   );
   public static final Codec<jr<edt>> b = akq.a(mc.aS, a);
   public static final akt<edt> c = akt.a(mc.aS, aku.b("overworld"));
   public static final akt<edt> d = akt.a(mc.aS, aku.b("large_biomes"));
   public static final akt<edt> e = akt.a(mc.aS, aku.b("amplified"));
   public static final akt<edt> f = akt.a(mc.aS, aku.b("nether"));
   public static final akt<edt> g = akt.a(mc.aS, aku.b("end"));
   public static final akt<edt> h = akt.a(mc.aS, aku.b("caves"));
   public static final akt<edt> i = akt.a(mc.aS, aku.b("floating_islands"));

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

   public een.a d() {
      return this.t ? een.a.a : een.a.b;
   }

   public static void a(qe<edt> $$0) {
      $$0.a(c, a($$0, false, false));
      $$0.a(d, a($$0, false, true));
      $$0.a(e, a($$0, true, false));
      $$0.a(f, c($$0));
      $$0.a(g, b($$0));
      $$0.a(h, d($$0));
      $$0.a(i, e($$0));
   }

   private static edt b(qe<?> $$0) {
      return new edt(edw.d, dkg.fU.m(), dkg.a.m(), edv.a($$0.a(mc.aN)), qr.c(), List.of(), 0, true, false, false, true);
   }

   private static edt c(qe<?> $$0) {
      return new edt(edw.c, dkg.ei.m(), dkg.K.m(), edv.a($$0.a(mc.aN), $$0.a(mc.aT)), qr.b(), List.of(), 32, false, false, false, true);
   }

   private static edt a(qe<?> $$0, boolean $$1, boolean $$2) {
      return new edt(edw.b, dkg.b.m(), dkg.J.m(), edv.a($$0.a(mc.aN), $$0.a(mc.aT), $$2, $$1), qr.a(), new dis().a(), 63, false, true, true, false);
   }

   private static edt d(qe<?> $$0) {
      return new edt(edw.e, dkg.b.m(), dkg.J.m(), edv.b($$0.a(mc.aN), $$0.a(mc.aT)), qr.a(false, true, true), List.of(), 32, false, false, false, true);
   }

   private static edt e(qe<?> $$0) {
      return new edt(edw.f, dkg.b.m(), dkg.J.m(), edv.c($$0.a(mc.aN), $$0.a(mc.aT)), qr.a(false, false, false), List.of(), -64, false, false, false, true);
   }

   public static edt e() {
      return new edt(edw.b, dkg.b.m(), dkg.a.m(), edv.a(), qr.d(), List.of(), 63, true, false, false, false);
   }

   public edw f() {
      return this.j;
   }

   public dxq g() {
      return this.k;
   }

   public dxq h() {
      return this.l;
   }

   public edu i() {
      return this.m;
   }

   public eef.o j() {
      return this.n;
   }

   public List<dil.d> k() {
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
