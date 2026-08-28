import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record edu(edx j, dxu k, dxu l, edv m, eeg.o n, List<dis.d> o, int p, boolean q, boolean r, boolean s, boolean t) {
   public static final Codec<edu> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               edx.a.fieldOf("noise").forGetter(edu::f),
               dxu.a.fieldOf("default_block").forGetter(edu::g),
               dxu.a.fieldOf("default_fluid").forGetter(edu::h),
               edv.a.fieldOf("noise_router").forGetter(edu::i),
               eeg.o.b.fieldOf("surface_rule").forGetter(edu::j),
               dis.d.a.listOf().fieldOf("spawn_target").forGetter(edu::k),
               Codec.INT.fieldOf("sea_level").forGetter(edu::l),
               Codec.BOOL.fieldOf("disable_mob_generation").forGetter(edu::a),
               Codec.BOOL.fieldOf("aquifers_enabled").forGetter(edu::b),
               Codec.BOOL.fieldOf("ore_veins_enabled").forGetter(edu::c),
               Codec.BOOL.fieldOf("legacy_random_source").forGetter(edu::n)
            )
            .apply($$0, edu::new)
   );
   public static final Codec<jq<edu>> b = alv.a(mb.aR, a);
   public static final aly<edu> c = aly.a(mb.aR, alz.b("overworld"));
   public static final aly<edu> d = aly.a(mb.aR, alz.b("large_biomes"));
   public static final aly<edu> e = aly.a(mb.aR, alz.b("amplified"));
   public static final aly<edu> f = aly.a(mb.aR, alz.b("nether"));
   public static final aly<edu> g = aly.a(mb.aR, alz.b("end"));
   public static final aly<edu> h = aly.a(mb.aR, alz.b("caves"));
   public static final aly<edu> i = aly.a(mb.aR, alz.b("floating_islands"));

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

   public eeo.a d() {
      return this.t ? eeo.a.a : eeo.a.b;
   }

   public static void a(rk<edu> $$0) {
      $$0.a(c, a($$0, false, false));
      $$0.a(d, a($$0, false, true));
      $$0.a(e, a($$0, true, false));
      $$0.a(f, c($$0));
      $$0.a(g, b($$0));
      $$0.a(h, d($$0));
      $$0.a(i, e($$0));
   }

   private static edu b(rk<?> $$0) {
      return new edu(edx.d, dkn.fN.m(), dkn.a.m(), edw.a($$0.a(mb.aM)), rx.c(), List.of(), 0, true, false, false, true);
   }

   private static edu c(rk<?> $$0) {
      return new edu(edx.c, dkn.ei.m(), dkn.K.m(), edw.a($$0.a(mb.aM), $$0.a(mb.aS)), rx.b(), List.of(), 32, false, false, false, true);
   }

   private static edu a(rk<?> $$0, boolean $$1, boolean $$2) {
      return new edu(edx.b, dkn.b.m(), dkn.J.m(), edw.a($$0.a(mb.aM), $$0.a(mb.aS), $$2, $$1), rx.a(), new diz().a(), 63, false, true, true, false);
   }

   private static edu d(rk<?> $$0) {
      return new edu(edx.e, dkn.b.m(), dkn.J.m(), edw.b($$0.a(mb.aM), $$0.a(mb.aS)), rx.a(false, true, true), List.of(), 32, false, false, false, true);
   }

   private static edu e(rk<?> $$0) {
      return new edu(edx.f, dkn.b.m(), dkn.J.m(), edw.c($$0.a(mb.aM), $$0.a(mb.aS)), rx.a(false, false, false), List.of(), -64, false, false, false, true);
   }

   public static edu e() {
      return new edu(edx.b, dkn.b.m(), dkn.a.m(), edw.a(), rx.d(), List.of(), 63, true, false, false, false);
   }

   public edx f() {
      return this.j;
   }

   public dxu g() {
      return this.k;
   }

   public dxu h() {
      return this.l;
   }

   public edv i() {
      return this.m;
   }

   public eeg.o j() {
      return this.n;
   }

   public List<dis.d> k() {
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
