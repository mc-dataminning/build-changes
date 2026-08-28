import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record dxy(dyb j, dsb k, dsb l, dxz m, dyk.o n, List<ddf.d> o, int p, boolean q, boolean r, boolean s, boolean t) {
   public static final Codec<dxy> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dyb.a.fieldOf("noise").forGetter(dxy::f),
               dsb.b.fieldOf("default_block").forGetter(dxy::g),
               dsb.b.fieldOf("default_fluid").forGetter(dxy::h),
               dxz.a.fieldOf("noise_router").forGetter(dxy::i),
               dyk.o.b.fieldOf("surface_rule").forGetter(dxy::j),
               ddf.d.a.listOf().fieldOf("spawn_target").forGetter(dxy::k),
               Codec.INT.fieldOf("sea_level").forGetter(dxy::l),
               Codec.BOOL.fieldOf("disable_mob_generation").forGetter(dxy::a),
               Codec.BOOL.fieldOf("aquifers_enabled").forGetter(dxy::b),
               Codec.BOOL.fieldOf("ore_veins_enabled").forGetter(dxy::c),
               Codec.BOOL.fieldOf("legacy_random_source").forGetter(dxy::n)
            )
            .apply($$0, dxy::new)
   );
   public static final Codec<ji<dxy>> b = ala.a(lq.aG, a);
   public static final ald<dxy> c = ald.a(lq.aG, new ale("overworld"));
   public static final ald<dxy> d = ald.a(lq.aG, new ale("large_biomes"));
   public static final ald<dxy> e = ald.a(lq.aG, new ale("amplified"));
   public static final ald<dxy> f = ald.a(lq.aG, new ale("nether"));
   public static final ald<dxy> g = ald.a(lq.aG, new ale("end"));
   public static final ald<dxy> h = ald.a(lq.aG, new ale("caves"));
   public static final ald<dxy> i = ald.a(lq.aG, new ale("floating_islands"));

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

   public dys.a d() {
      return this.t ? dys.a.a : dys.a.b;
   }

   public static void a(rc<dxy> $$0) {
      $$0.a(c, a($$0, false, false));
      $$0.a(d, a($$0, false, true));
      $$0.a(e, a($$0, true, false));
      $$0.a(f, c($$0));
      $$0.a(g, b($$0));
      $$0.a(h, d($$0));
      $$0.a(i, e($$0));
   }

   private static dxy b(rc<?> $$0) {
      return new dxy(dyb.d, dfa.fz.o(), dfa.a.o(), dya.a($$0.a(lq.aD)), rp.c(), List.of(), 0, true, false, false, true);
   }

   private static dxy c(rc<?> $$0) {
      return new dxy(dyb.c, dfa.dV.o(), dfa.H.o(), dya.a($$0.a(lq.aD), $$0.a(lq.aH)), rp.b(), List.of(), 32, false, false, false, true);
   }

   private static dxy a(rc<?> $$0, boolean $$1, boolean $$2) {
      return new dxy(dyb.b, dfa.b.o(), dfa.G.o(), dya.a($$0.a(lq.aD), $$0.a(lq.aH), $$2, $$1), rp.a(), new ddm().a(), 63, false, true, true, false);
   }

   private static dxy d(rc<?> $$0) {
      return new dxy(dyb.e, dfa.b.o(), dfa.G.o(), dya.b($$0.a(lq.aD), $$0.a(lq.aH)), rp.a(false, true, true), List.of(), 32, false, false, false, true);
   }

   private static dxy e(rc<?> $$0) {
      return new dxy(dyb.f, dfa.b.o(), dfa.G.o(), dya.c($$0.a(lq.aD), $$0.a(lq.aH)), rp.a(false, false, false), List.of(), -64, false, false, false, true);
   }

   public static dxy e() {
      return new dxy(dyb.b, dfa.b.o(), dfa.a.o(), dya.a(), rp.d(), List.of(), 63, true, false, false, false);
   }

   public dyb f() {
      return this.j;
   }

   public dsb g() {
      return this.k;
   }

   public dsb h() {
      return this.l;
   }

   public dxz i() {
      return this.m;
   }

   public dyk.o j() {
      return this.n;
   }

   public List<ddf.d> k() {
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
