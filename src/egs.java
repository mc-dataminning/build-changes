import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record egs(egv j, eao k, eao l, egt m, ehe.o n, List<dkt.d> o, int p, boolean q, boolean r, boolean s, boolean t) {
   public static final Codec<egs> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               egv.a.fieldOf("noise").forGetter(egs::f),
               eao.a.fieldOf("default_block").forGetter(egs::g),
               eao.a.fieldOf("default_fluid").forGetter(egs::h),
               egt.a.fieldOf("noise_router").forGetter(egs::i),
               ehe.o.b.fieldOf("surface_rule").forGetter(egs::j),
               dkt.d.a.listOf().fieldOf("spawn_target").forGetter(egs::k),
               Codec.INT.fieldOf("sea_level").forGetter(egs::l),
               Codec.BOOL.fieldOf("disable_mob_generation").forGetter(egs::a),
               Codec.BOOL.fieldOf("aquifers_enabled").forGetter(egs::b),
               Codec.BOOL.fieldOf("ore_veins_enabled").forGetter(egs::c),
               Codec.BOOL.fieldOf("legacy_random_source").forGetter(egs::n)
            )
            .apply($$0, egs::new)
   );
   public static final Codec<jf<egs>> b = alc.a(mh.aX, a);
   public static final alf<egs> c = alf.a(mh.aX, alg.b("overworld"));
   public static final alf<egs> d = alf.a(mh.aX, alg.b("large_biomes"));
   public static final alf<egs> e = alf.a(mh.aX, alg.b("amplified"));
   public static final alf<egs> f = alf.a(mh.aX, alg.b("nether"));
   public static final alf<egs> g = alf.a(mh.aX, alg.b("end"));
   public static final alf<egs> h = alf.a(mh.aX, alg.b("caves"));
   public static final alf<egs> i = alf.a(mh.aX, alg.b("floating_islands"));

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

   public ehm.a d() {
      return this.t ? ehm.a.a : ehm.a.b;
   }

   public static void a(qh<egs> $$0) {
      $$0.a(c, a($$0, false, false));
      $$0.a(d, a($$0, false, true));
      $$0.a(e, a($$0, true, false));
      $$0.a(f, c($$0));
      $$0.a(g, b($$0));
      $$0.a(h, d($$0));
      $$0.a(i, e($$0));
   }

   private static egs b(qh<?> $$0) {
      return new egs(egv.d, dmo.fY.m(), dmo.a.m(), egu.a($$0.a(mh.aO)), qu.c(), List.of(), 0, true, false, false, true);
   }

   private static egs c(qh<?> $$0) {
      return new egs(egv.c, dmo.em.m(), dmo.K.m(), egu.a($$0.a(mh.aO), $$0.a(mh.aY)), qu.b(), List.of(), 32, false, false, false, true);
   }

   private static egs a(qh<?> $$0, boolean $$1, boolean $$2) {
      return new egs(egv.b, dmo.b.m(), dmo.J.m(), egu.a($$0.a(mh.aO), $$0.a(mh.aY), $$2, $$1), qu.a(), new dla().a(), 63, false, true, true, false);
   }

   private static egs d(qh<?> $$0) {
      return new egs(egv.e, dmo.b.m(), dmo.J.m(), egu.b($$0.a(mh.aO), $$0.a(mh.aY)), qu.a(false, true, true), List.of(), 32, false, false, false, true);
   }

   private static egs e(qh<?> $$0) {
      return new egs(egv.f, dmo.b.m(), dmo.J.m(), egu.c($$0.a(mh.aO), $$0.a(mh.aY)), qu.a(false, false, false), List.of(), -64, false, false, false, true);
   }

   public static egs e() {
      return new egs(egv.b, dmo.b.m(), dmo.a.m(), egu.a(), qu.d(), List.of(), 63, true, false, false, false);
   }

   public egv f() {
      return this.j;
   }

   public eao g() {
      return this.k;
   }

   public eao h() {
      return this.l;
   }

   public egt i() {
      return this.m;
   }

   public ehe.o j() {
      return this.n;
   }

   public List<dkt.d> k() {
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
