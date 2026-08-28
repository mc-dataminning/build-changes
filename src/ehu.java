import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record ehu(ehx j, ebq k, ebq l, ehv m, eig.o n, List<dlv.d> o, int p, boolean q, boolean r, boolean s, boolean t) {
   public static final Codec<ehu> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ehx.a.fieldOf("noise").forGetter(ehu::f),
               ebq.a.fieldOf("default_block").forGetter(ehu::g),
               ebq.a.fieldOf("default_fluid").forGetter(ehu::h),
               ehv.a.fieldOf("noise_router").forGetter(ehu::i),
               eig.o.b.fieldOf("surface_rule").forGetter(ehu::j),
               dlv.d.a.listOf().fieldOf("spawn_target").forGetter(ehu::k),
               Codec.INT.fieldOf("sea_level").forGetter(ehu::l),
               Codec.BOOL.fieldOf("disable_mob_generation").forGetter(ehu::a),
               Codec.BOOL.fieldOf("aquifers_enabled").forGetter(ehu::b),
               Codec.BOOL.fieldOf("ore_veins_enabled").forGetter(ehu::c),
               Codec.BOOL.fieldOf("legacy_random_source").forGetter(ehu::n)
            )
            .apply($$0, ehu::new)
   );
   public static final Codec<jg<ehu>> b = aln.a(mi.aX, a);
   public static final alq<ehu> c = alq.a(mi.aX, alr.b("overworld"));
   public static final alq<ehu> d = alq.a(mi.aX, alr.b("large_biomes"));
   public static final alq<ehu> e = alq.a(mi.aX, alr.b("amplified"));
   public static final alq<ehu> f = alq.a(mi.aX, alr.b("nether"));
   public static final alq<ehu> g = alq.a(mi.aX, alr.b("end"));
   public static final alq<ehu> h = alq.a(mi.aX, alr.b("caves"));
   public static final alq<ehu> i = alq.a(mi.aX, alr.b("floating_islands"));

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

   public eio.a d() {
      return this.t ? eio.a.a : eio.a.b;
   }

   public static void a(qi<ehu> $$0) {
      $$0.a(c, a($$0, false, false));
      $$0.a(d, a($$0, false, true));
      $$0.a(e, a($$0, true, false));
      $$0.a(f, c($$0));
      $$0.a(g, b($$0));
      $$0.a(h, d($$0));
      $$0.a(i, e($$0));
   }

   private static ehu b(qi<?> $$0) {
      return new ehu(ehx.d, dnq.fY.m(), dnq.a.m(), ehw.a($$0.a(mi.aO)), qv.c(), List.of(), 0, true, false, false, true);
   }

   private static ehu c(qi<?> $$0) {
      return new ehu(ehx.c, dnq.em.m(), dnq.K.m(), ehw.a($$0.a(mi.aO), $$0.a(mi.aY)), qv.b(), List.of(), 32, false, false, false, true);
   }

   private static ehu a(qi<?> $$0, boolean $$1, boolean $$2) {
      return new ehu(ehx.b, dnq.b.m(), dnq.J.m(), ehw.a($$0.a(mi.aO), $$0.a(mi.aY), $$2, $$1), qv.a(), new dmc().a(), 63, false, true, true, false);
   }

   private static ehu d(qi<?> $$0) {
      return new ehu(ehx.e, dnq.b.m(), dnq.J.m(), ehw.b($$0.a(mi.aO), $$0.a(mi.aY)), qv.a(false, true, true), List.of(), 32, false, false, false, true);
   }

   private static ehu e(qi<?> $$0) {
      return new ehu(ehx.f, dnq.b.m(), dnq.J.m(), ehw.c($$0.a(mi.aO), $$0.a(mi.aY)), qv.a(false, false, false), List.of(), -64, false, false, false, true);
   }

   public static ehu e() {
      return new ehu(ehx.b, dnq.b.m(), dnq.a.m(), ehw.a(), qv.d(), List.of(), 63, true, false, false, false);
   }

   public ehx f() {
      return this.j;
   }

   public ebq g() {
      return this.k;
   }

   public ebq h() {
      return this.l;
   }

   public ehv i() {
      return this.m;
   }

   public eig.o j() {
      return this.n;
   }

   public List<dlv.d> k() {
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
