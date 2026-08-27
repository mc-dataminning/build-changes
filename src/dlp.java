import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record dlp(dls j, dgb k, dgb l, dlq m, dmb.o n, List<csg.d> o, int p, boolean q, boolean r, boolean s, boolean t) {
   public static final Codec<dlp> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dls.a.fieldOf("noise").forGetter(dlp::f),
               dgb.b.fieldOf("default_block").forGetter(dlp::g),
               dgb.b.fieldOf("default_fluid").forGetter(dlp::h),
               dlq.a.fieldOf("noise_router").forGetter(dlp::i),
               dmb.o.b.fieldOf("surface_rule").forGetter(dlp::j),
               csg.d.a.listOf().fieldOf("spawn_target").forGetter(dlp::k),
               Codec.INT.fieldOf("sea_level").forGetter(dlp::l),
               Codec.BOOL.fieldOf("disable_mob_generation").forGetter(dlp::a),
               Codec.BOOL.fieldOf("aquifers_enabled").forGetter(dlp::b),
               Codec.BOOL.fieldOf("ore_veins_enabled").forGetter(dlp::c),
               Codec.BOOL.fieldOf("legacy_random_source").forGetter(dlp::n)
            )
            .apply($$0, dlp::new)
   );
   public static final Codec<ib<dlp>> b = afs.a(jz.ax, a);
   public static final afv<dlp> c = afv.a(jz.ax, new afw("overworld"));
   public static final afv<dlp> d = afv.a(jz.ax, new afw("large_biomes"));
   public static final afv<dlp> e = afv.a(jz.ax, new afw("amplified"));
   public static final afv<dlp> f = afv.a(jz.ax, new afw("nether"));
   public static final afv<dlp> g = afv.a(jz.ax, new afw("end"));
   public static final afv<dlp> h = afv.a(jz.ax, new afw("caves"));
   public static final afv<dlp> i = afv.a(jz.ax, new afw("floating_islands"));

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

   public dmj.a d() {
      return this.t ? dmj.a.a : dmj.a.b;
   }

   public static void a(oo<dlp> $$0) {
      $$0.a(c, a($$0, false, false));
      $$0.a(d, a($$0, false, true));
      $$0.a(e, a($$0, true, false));
      $$0.a(f, c($$0));
      $$0.a(g, b($$0));
      $$0.a(h, d($$0));
      $$0.a(i, e($$0));
   }

   private static dlp b(oo<?> $$0) {
      return new dlp(dls.d, cuc.fz.o(), cuc.a.o(), dlr.a($$0.a(jz.au)), pb.c(), List.of(), 0, true, false, false, true);
   }

   private static dlp c(oo<?> $$0) {
      return new dlp(dls.c, cuc.dV.o(), cuc.H.o(), dlr.a($$0.a(jz.au), $$0.a(jz.ay)), pb.b(), List.of(), 32, false, false, false, true);
   }

   private static dlp a(oo<?> $$0, boolean $$1, boolean $$2) {
      return new dlp(dls.b, cuc.b.o(), cuc.G.o(), dlr.a($$0.a(jz.au), $$0.a(jz.ay), $$2, $$1), pb.a(), new csn().a(), 63, false, true, true, false);
   }

   private static dlp d(oo<?> $$0) {
      return new dlp(dls.e, cuc.b.o(), cuc.G.o(), dlr.b($$0.a(jz.au), $$0.a(jz.ay)), pb.a(false, true, true), List.of(), 32, false, false, false, true);
   }

   private static dlp e(oo<?> $$0) {
      return new dlp(dls.f, cuc.b.o(), cuc.G.o(), dlr.c($$0.a(jz.au), $$0.a(jz.ay)), pb.a(false, false, false), List.of(), -64, false, false, false, true);
   }

   public static dlp e() {
      return new dlp(dls.b, cuc.b.o(), cuc.a.o(), dlr.a(), pb.d(), List.of(), 63, true, false, false, false);
   }

   public dls f() {
      return this.j;
   }

   public dgb g() {
      return this.k;
   }

   public dgb h() {
      return this.l;
   }

   public dlq i() {
      return this.m;
   }

   public dmb.o j() {
      return this.n;
   }

   public List<csg.d> k() {
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
