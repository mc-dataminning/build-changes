import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record dhp(dhs j, dcb k, dcb l, dhq m, dib.o n, List<cnt.d> o, int p, boolean q, boolean r, boolean s, boolean t) {
   public static final Codec<dhp> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dhs.a.fieldOf("noise").forGetter(dhp::f),
               dcb.b.fieldOf("default_block").forGetter(dhp::g),
               dcb.b.fieldOf("default_fluid").forGetter(dhp::h),
               dhq.a.fieldOf("noise_router").forGetter(dhp::i),
               dib.o.b.fieldOf("surface_rule").forGetter(dhp::j),
               cnt.d.a.listOf().fieldOf("spawn_target").forGetter(dhp::k),
               Codec.INT.fieldOf("sea_level").forGetter(dhp::l),
               Codec.BOOL.fieldOf("disable_mob_generation").forGetter(dhp::a),
               Codec.BOOL.fieldOf("aquifers_enabled").forGetter(dhp::b),
               Codec.BOOL.fieldOf("ore_veins_enabled").forGetter(dhp::c),
               Codec.BOOL.fieldOf("legacy_random_source").forGetter(dhp::n)
            )
            .apply($$0, dhp::new)
   );
   public static final Codec<he<dhp>> b = acm.a(jc.aw, a);
   public static final acp<dhp> c = acp.a(jc.aw, new acq("overworld"));
   public static final acp<dhp> d = acp.a(jc.aw, new acq("large_biomes"));
   public static final acp<dhp> e = acp.a(jc.aw, new acq("amplified"));
   public static final acp<dhp> f = acp.a(jc.aw, new acq("nether"));
   public static final acp<dhp> g = acp.a(jc.aw, new acq("end"));
   public static final acp<dhp> h = acp.a(jc.aw, new acq("caves"));
   public static final acp<dhp> i = acp.a(jc.aw, new acq("floating_islands"));

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

   public dij.a d() {
      return this.t ? dij.a.a : dij.a.b;
   }

   public static void a(nm<dhp> $$0) {
      $$0.a(c, a($$0, false, false));
      $$0.a(d, a($$0, false, true));
      $$0.a(e, a($$0, true, false));
      $$0.a(f, c($$0));
      $$0.a(g, b($$0));
      $$0.a(h, d($$0));
      $$0.a(i, e($$0));
   }

   private static dhp b(nm<?> $$0) {
      return new dhp(dhs.d, cpo.fz.n(), cpo.a.n(), dhr.a($$0.a(jc.at)), nz.c(), List.of(), 0, true, false, false, true);
   }

   private static dhp c(nm<?> $$0) {
      return new dhp(dhs.c, cpo.dW.n(), cpo.H.n(), dhr.a($$0.a(jc.at), $$0.a(jc.ax)), nz.b(), List.of(), 32, false, false, false, true);
   }

   private static dhp a(nm<?> $$0, boolean $$1, boolean $$2) {
      return new dhp(dhs.b, cpo.b.n(), cpo.G.n(), dhr.a($$0.a(jc.at), $$0.a(jc.ax), $$2, $$1), nz.a(), new coa().a(), 63, false, true, true, false);
   }

   private static dhp d(nm<?> $$0) {
      return new dhp(dhs.e, cpo.b.n(), cpo.G.n(), dhr.b($$0.a(jc.at), $$0.a(jc.ax)), nz.a(false, true, true), List.of(), 32, false, false, false, true);
   }

   private static dhp e(nm<?> $$0) {
      return new dhp(dhs.f, cpo.b.n(), cpo.G.n(), dhr.c($$0.a(jc.at), $$0.a(jc.ax)), nz.a(false, false, false), List.of(), -64, false, false, false, true);
   }

   public static dhp e() {
      return new dhp(dhs.b, cpo.b.n(), cpo.a.n(), dhr.a(), nz.d(), List.of(), 63, true, false, false, false);
   }

   public dhs f() {
      return this.j;
   }

   public dcb g() {
      return this.k;
   }

   public dcb h() {
      return this.l;
   }

   public dhq i() {
      return this.m;
   }

   public dib.o j() {
      return this.n;
   }

   public List<cnt.d> k() {
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
