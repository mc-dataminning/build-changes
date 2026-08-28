import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record edo(edr j, dxo k, dxo l, edp m, eea.o n, List<dik.d> o, int p, boolean q, boolean r, boolean s, boolean t) {
   public static final Codec<edo> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               edr.a.fieldOf("noise").forGetter(edo::f),
               dxo.a.fieldOf("default_block").forGetter(edo::g),
               dxo.a.fieldOf("default_fluid").forGetter(edo::h),
               edp.a.fieldOf("noise_router").forGetter(edo::i),
               eea.o.b.fieldOf("surface_rule").forGetter(edo::j),
               dik.d.a.listOf().fieldOf("spawn_target").forGetter(edo::k),
               Codec.INT.fieldOf("sea_level").forGetter(edo::l),
               Codec.BOOL.fieldOf("disable_mob_generation").forGetter(edo::a),
               Codec.BOOL.fieldOf("aquifers_enabled").forGetter(edo::b),
               Codec.BOOL.fieldOf("ore_veins_enabled").forGetter(edo::c),
               Codec.BOOL.fieldOf("legacy_random_source").forGetter(edo::n)
            )
            .apply($$0, edo::new)
   );
   public static final Codec<jq<edo>> b = all.a(mb.aR, a);
   public static final alo<edo> c = alo.a(mb.aR, alp.b("overworld"));
   public static final alo<edo> d = alo.a(mb.aR, alp.b("large_biomes"));
   public static final alo<edo> e = alo.a(mb.aR, alp.b("amplified"));
   public static final alo<edo> f = alo.a(mb.aR, alp.b("nether"));
   public static final alo<edo> g = alo.a(mb.aR, alp.b("end"));
   public static final alo<edo> h = alo.a(mb.aR, alp.b("caves"));
   public static final alo<edo> i = alo.a(mb.aR, alp.b("floating_islands"));

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

   public eei.a d() {
      return this.t ? eei.a.a : eei.a.b;
   }

   public static void a(ra<edo> $$0) {
      $$0.a(c, a($$0, false, false));
      $$0.a(d, a($$0, false, true));
      $$0.a(e, a($$0, true, false));
      $$0.a(f, c($$0));
      $$0.a(g, b($$0));
      $$0.a(h, d($$0));
      $$0.a(i, e($$0));
   }

   private static edo b(ra<?> $$0) {
      return new edo(edr.d, dkf.fU.m(), dkf.a.m(), edq.a($$0.a(mb.aM)), rn.c(), List.of(), 0, true, false, false, true);
   }

   private static edo c(ra<?> $$0) {
      return new edo(edr.c, dkf.ei.m(), dkf.K.m(), edq.a($$0.a(mb.aM), $$0.a(mb.aS)), rn.b(), List.of(), 32, false, false, false, true);
   }

   private static edo a(ra<?> $$0, boolean $$1, boolean $$2) {
      return new edo(edr.b, dkf.b.m(), dkf.J.m(), edq.a($$0.a(mb.aM), $$0.a(mb.aS), $$2, $$1), rn.a(), new dir().a(), 63, false, true, true, false);
   }

   private static edo d(ra<?> $$0) {
      return new edo(edr.e, dkf.b.m(), dkf.J.m(), edq.b($$0.a(mb.aM), $$0.a(mb.aS)), rn.a(false, true, true), List.of(), 32, false, false, false, true);
   }

   private static edo e(ra<?> $$0) {
      return new edo(edr.f, dkf.b.m(), dkf.J.m(), edq.c($$0.a(mb.aM), $$0.a(mb.aS)), rn.a(false, false, false), List.of(), -64, false, false, false, true);
   }

   public static edo e() {
      return new edo(edr.b, dkf.b.m(), dkf.a.m(), edq.a(), rn.d(), List.of(), 63, true, false, false, false);
   }

   public edr f() {
      return this.j;
   }

   public dxo g() {
      return this.k;
   }

   public dxo h() {
      return this.l;
   }

   public edp i() {
      return this.m;
   }

   public eea.o j() {
      return this.n;
   }

   public List<dik.d> k() {
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
