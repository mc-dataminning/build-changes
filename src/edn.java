import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record edn(edq j, dxn k, dxn l, edo m, edz.o n, List<dil.d> o, int p, boolean q, boolean r, boolean s, boolean t) {
   public static final Codec<edn> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               edq.a.fieldOf("noise").forGetter(edn::f),
               dxn.a.fieldOf("default_block").forGetter(edn::g),
               dxn.a.fieldOf("default_fluid").forGetter(edn::h),
               edo.a.fieldOf("noise_router").forGetter(edn::i),
               edz.o.b.fieldOf("surface_rule").forGetter(edn::j),
               dil.d.a.listOf().fieldOf("spawn_target").forGetter(edn::k),
               Codec.INT.fieldOf("sea_level").forGetter(edn::l),
               Codec.BOOL.fieldOf("disable_mob_generation").forGetter(edn::a),
               Codec.BOOL.fieldOf("aquifers_enabled").forGetter(edn::b),
               Codec.BOOL.fieldOf("ore_veins_enabled").forGetter(edn::c),
               Codec.BOOL.fieldOf("legacy_random_source").forGetter(edn::n)
            )
            .apply($$0, edn::new)
   );
   public static final Codec<jq<edn>> b = alv.a(mb.aQ, a);
   public static final aly<edn> c = aly.a(mb.aQ, alz.b("overworld"));
   public static final aly<edn> d = aly.a(mb.aQ, alz.b("large_biomes"));
   public static final aly<edn> e = aly.a(mb.aQ, alz.b("amplified"));
   public static final aly<edn> f = aly.a(mb.aQ, alz.b("nether"));
   public static final aly<edn> g = aly.a(mb.aQ, alz.b("end"));
   public static final aly<edn> h = aly.a(mb.aQ, alz.b("caves"));
   public static final aly<edn> i = aly.a(mb.aQ, alz.b("floating_islands"));

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

   public eeh.a d() {
      return this.t ? eeh.a.a : eeh.a.b;
   }

   public static void a(rk<edn> $$0) {
      $$0.a(c, a($$0, false, false));
      $$0.a(d, a($$0, false, true));
      $$0.a(e, a($$0, true, false));
      $$0.a(f, c($$0));
      $$0.a(g, b($$0));
      $$0.a(h, d($$0));
      $$0.a(i, e($$0));
   }

   private static edn b(rk<?> $$0) {
      return new edn(edq.d, dkg.fN.m(), dkg.a.m(), edp.a($$0.a(mb.aL)), rx.c(), List.of(), 0, true, false, false, true);
   }

   private static edn c(rk<?> $$0) {
      return new edn(edq.c, dkg.ei.m(), dkg.K.m(), edp.a($$0.a(mb.aL), $$0.a(mb.aR)), rx.b(), List.of(), 32, false, false, false, true);
   }

   private static edn a(rk<?> $$0, boolean $$1, boolean $$2) {
      return new edn(edq.b, dkg.b.m(), dkg.J.m(), edp.a($$0.a(mb.aL), $$0.a(mb.aR), $$2, $$1), rx.a(), new dis().a(), 63, false, true, true, false);
   }

   private static edn d(rk<?> $$0) {
      return new edn(edq.e, dkg.b.m(), dkg.J.m(), edp.b($$0.a(mb.aL), $$0.a(mb.aR)), rx.a(false, true, true), List.of(), 32, false, false, false, true);
   }

   private static edn e(rk<?> $$0) {
      return new edn(edq.f, dkg.b.m(), dkg.J.m(), edp.c($$0.a(mb.aL), $$0.a(mb.aR)), rx.a(false, false, false), List.of(), -64, false, false, false, true);
   }

   public static edn e() {
      return new edn(edq.b, dkg.b.m(), dkg.a.m(), edp.a(), rx.d(), List.of(), 63, true, false, false, false);
   }

   public edq f() {
      return this.j;
   }

   public dxn g() {
      return this.k;
   }

   public dxn h() {
      return this.l;
   }

   public edo i() {
      return this.m;
   }

   public edz.o j() {
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
