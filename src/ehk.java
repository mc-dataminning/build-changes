import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record ehk(ehn j, ebg k, ebg l, ehl m, ehw.o n, List<dll.d> o, int p, boolean q, boolean r, boolean s, boolean t) {
   public static final Codec<ehk> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ehn.a.fieldOf("noise").forGetter(ehk::f),
               ebg.a.fieldOf("default_block").forGetter(ehk::g),
               ebg.a.fieldOf("default_fluid").forGetter(ehk::h),
               ehl.a.fieldOf("noise_router").forGetter(ehk::i),
               ehw.o.b.fieldOf("surface_rule").forGetter(ehk::j),
               dll.d.a.listOf().fieldOf("spawn_target").forGetter(ehk::k),
               Codec.INT.fieldOf("sea_level").forGetter(ehk::l),
               Codec.BOOL.fieldOf("disable_mob_generation").forGetter(ehk::a),
               Codec.BOOL.fieldOf("aquifers_enabled").forGetter(ehk::b),
               Codec.BOOL.fieldOf("ore_veins_enabled").forGetter(ehk::c),
               Codec.BOOL.fieldOf("legacy_random_source").forGetter(ehk::n)
            )
            .apply($$0, ehk::new)
   );
   public static final Codec<jg<ehk>> b = alg.a(mi.aX, a);
   public static final alj<ehk> c = alj.a(mi.aX, alk.b("overworld"));
   public static final alj<ehk> d = alj.a(mi.aX, alk.b("large_biomes"));
   public static final alj<ehk> e = alj.a(mi.aX, alk.b("amplified"));
   public static final alj<ehk> f = alj.a(mi.aX, alk.b("nether"));
   public static final alj<ehk> g = alj.a(mi.aX, alk.b("end"));
   public static final alj<ehk> h = alj.a(mi.aX, alk.b("caves"));
   public static final alj<ehk> i = alj.a(mi.aX, alk.b("floating_islands"));

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

   public eie.a d() {
      return this.t ? eie.a.a : eie.a.b;
   }

   public static void a(qi<ehk> $$0) {
      $$0.a(c, a($$0, false, false));
      $$0.a(d, a($$0, false, true));
      $$0.a(e, a($$0, true, false));
      $$0.a(f, c($$0));
      $$0.a(g, b($$0));
      $$0.a(h, d($$0));
      $$0.a(i, e($$0));
   }

   private static ehk b(qi<?> $$0) {
      return new ehk(ehn.d, dng.fY.m(), dng.a.m(), ehm.a($$0.a(mi.aO)), qv.c(), List.of(), 0, true, false, false, true);
   }

   private static ehk c(qi<?> $$0) {
      return new ehk(ehn.c, dng.em.m(), dng.K.m(), ehm.a($$0.a(mi.aO), $$0.a(mi.aY)), qv.b(), List.of(), 32, false, false, false, true);
   }

   private static ehk a(qi<?> $$0, boolean $$1, boolean $$2) {
      return new ehk(ehn.b, dng.b.m(), dng.J.m(), ehm.a($$0.a(mi.aO), $$0.a(mi.aY), $$2, $$1), qv.a(), new dls().a(), 63, false, true, true, false);
   }

   private static ehk d(qi<?> $$0) {
      return new ehk(ehn.e, dng.b.m(), dng.J.m(), ehm.b($$0.a(mi.aO), $$0.a(mi.aY)), qv.a(false, true, true), List.of(), 32, false, false, false, true);
   }

   private static ehk e(qi<?> $$0) {
      return new ehk(ehn.f, dng.b.m(), dng.J.m(), ehm.c($$0.a(mi.aO), $$0.a(mi.aY)), qv.a(false, false, false), List.of(), -64, false, false, false, true);
   }

   public static ehk e() {
      return new ehk(ehn.b, dng.b.m(), dng.a.m(), ehm.a(), qv.d(), List.of(), 63, true, false, false, false);
   }

   public ehn f() {
      return this.j;
   }

   public ebg g() {
      return this.k;
   }

   public ebg h() {
      return this.l;
   }

   public ehl i() {
      return this.m;
   }

   public ehw.o j() {
      return this.n;
   }

   public List<dll.d> k() {
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
