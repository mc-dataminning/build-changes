import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record dks(dkv j, dfe k, dfe l, dkt m, dle.o n, List<cqx.d> o, int p, boolean q, boolean r, boolean s, boolean t) {
   public static final Codec<dks> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dkv.a.fieldOf("noise").forGetter(dks::f),
               dfe.b.fieldOf("default_block").forGetter(dks::g),
               dfe.b.fieldOf("default_fluid").forGetter(dks::h),
               dkt.a.fieldOf("noise_router").forGetter(dks::i),
               dle.o.b.fieldOf("surface_rule").forGetter(dks::j),
               cqx.d.a.listOf().fieldOf("spawn_target").forGetter(dks::k),
               Codec.INT.fieldOf("sea_level").forGetter(dks::l),
               Codec.BOOL.fieldOf("disable_mob_generation").forGetter(dks::a),
               Codec.BOOL.fieldOf("aquifers_enabled").forGetter(dks::b),
               Codec.BOOL.fieldOf("ore_veins_enabled").forGetter(dks::c),
               Codec.BOOL.fieldOf("legacy_random_source").forGetter(dks::n)
            )
            .apply($$0, dks::new)
   );
   public static final Codec<hg<dks>> b = aeq.a(je.aw, a);
   public static final aet<dks> c = aet.a(je.aw, new aeu("overworld"));
   public static final aet<dks> d = aet.a(je.aw, new aeu("large_biomes"));
   public static final aet<dks> e = aet.a(je.aw, new aeu("amplified"));
   public static final aet<dks> f = aet.a(je.aw, new aeu("nether"));
   public static final aet<dks> g = aet.a(je.aw, new aeu("end"));
   public static final aet<dks> h = aet.a(je.aw, new aeu("caves"));
   public static final aet<dks> i = aet.a(je.aw, new aeu("floating_islands"));

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

   public dlm.a d() {
      return this.t ? dlm.a.a : dlm.a.b;
   }

   public static void a(np<dks> $$0) {
      $$0.a(c, a($$0, false, false));
      $$0.a(d, a($$0, false, true));
      $$0.a(e, a($$0, true, false));
      $$0.a(f, c($$0));
      $$0.a(g, b($$0));
      $$0.a(h, d($$0));
      $$0.a(i, e($$0));
   }

   private static dks b(np<?> $$0) {
      return new dks(dkv.d, csr.fz.n(), csr.a.n(), dku.a($$0.a(je.at)), oc.c(), List.of(), 0, true, false, false, true);
   }

   private static dks c(np<?> $$0) {
      return new dks(dkv.c, csr.dW.n(), csr.H.n(), dku.a($$0.a(je.at), $$0.a(je.ax)), oc.b(), List.of(), 32, false, false, false, true);
   }

   private static dks a(np<?> $$0, boolean $$1, boolean $$2) {
      return new dks(dkv.b, csr.b.n(), csr.G.n(), dku.a($$0.a(je.at), $$0.a(je.ax), $$2, $$1), oc.a(), new cre().a(), 63, false, true, true, false);
   }

   private static dks d(np<?> $$0) {
      return new dks(dkv.e, csr.b.n(), csr.G.n(), dku.b($$0.a(je.at), $$0.a(je.ax)), oc.a(false, true, true), List.of(), 32, false, false, false, true);
   }

   private static dks e(np<?> $$0) {
      return new dks(dkv.f, csr.b.n(), csr.G.n(), dku.c($$0.a(je.at), $$0.a(je.ax)), oc.a(false, false, false), List.of(), -64, false, false, false, true);
   }

   public static dks e() {
      return new dks(dkv.b, csr.b.n(), csr.a.n(), dku.a(), oc.d(), List.of(), 63, true, false, false, false);
   }

   public dkv f() {
      return this.j;
   }

   public dfe g() {
      return this.k;
   }

   public dfe h() {
      return this.l;
   }

   public dkt i() {
      return this.m;
   }

   public dle.o j() {
      return this.n;
   }

   public List<cqx.d> k() {
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
