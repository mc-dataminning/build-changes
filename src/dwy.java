import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record dwy(dxb j, drb k, drb l, dwz m, dxk.o n, List<dcf.d> o, int p, boolean q, boolean r, boolean s, boolean t) {
   public static final Codec<dwy> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dxb.a.fieldOf("noise").forGetter(dwy::f),
               drb.b.fieldOf("default_block").forGetter(dwy::g),
               drb.b.fieldOf("default_fluid").forGetter(dwy::h),
               dwz.a.fieldOf("noise_router").forGetter(dwy::i),
               dxk.o.b.fieldOf("surface_rule").forGetter(dwy::j),
               dcf.d.a.listOf().fieldOf("spawn_target").forGetter(dwy::k),
               Codec.INT.fieldOf("sea_level").forGetter(dwy::l),
               Codec.BOOL.fieldOf("disable_mob_generation").forGetter(dwy::a),
               Codec.BOOL.fieldOf("aquifers_enabled").forGetter(dwy::b),
               Codec.BOOL.fieldOf("ore_veins_enabled").forGetter(dwy::c),
               Codec.BOOL.fieldOf("legacy_random_source").forGetter(dwy::n)
            )
            .apply($$0, dwy::new)
   );
   public static final Codec<ix<dwy>> b = aki.a(lf.aG, a);
   public static final akl<dwy> c = akl.a(lf.aG, new akm("overworld"));
   public static final akl<dwy> d = akl.a(lf.aG, new akm("large_biomes"));
   public static final akl<dwy> e = akl.a(lf.aG, new akm("amplified"));
   public static final akl<dwy> f = akl.a(lf.aG, new akm("nether"));
   public static final akl<dwy> g = akl.a(lf.aG, new akm("end"));
   public static final akl<dwy> h = akl.a(lf.aG, new akm("caves"));
   public static final akl<dwy> i = akl.a(lf.aG, new akm("floating_islands"));

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

   public dxs.a d() {
      return this.t ? dxs.a.a : dxs.a.b;
   }

   public static void a(qo<dwy> $$0) {
      $$0.a(c, a($$0, false, false));
      $$0.a(d, a($$0, false, true));
      $$0.a(e, a($$0, true, false));
      $$0.a(f, c($$0));
      $$0.a(g, b($$0));
      $$0.a(h, d($$0));
      $$0.a(i, e($$0));
   }

   private static dwy b(qo<?> $$0) {
      return new dwy(dxb.d, dea.fz.n(), dea.a.n(), dxa.a($$0.a(lf.aD)), rb.c(), List.of(), 0, true, false, false, true);
   }

   private static dwy c(qo<?> $$0) {
      return new dwy(dxb.c, dea.dV.n(), dea.H.n(), dxa.a($$0.a(lf.aD), $$0.a(lf.aH)), rb.b(), List.of(), 32, false, false, false, true);
   }

   private static dwy a(qo<?> $$0, boolean $$1, boolean $$2) {
      return new dwy(dxb.b, dea.b.n(), dea.G.n(), dxa.a($$0.a(lf.aD), $$0.a(lf.aH), $$2, $$1), rb.a(), new dcm().a(), 63, false, true, true, false);
   }

   private static dwy d(qo<?> $$0) {
      return new dwy(dxb.e, dea.b.n(), dea.G.n(), dxa.b($$0.a(lf.aD), $$0.a(lf.aH)), rb.a(false, true, true), List.of(), 32, false, false, false, true);
   }

   private static dwy e(qo<?> $$0) {
      return new dwy(dxb.f, dea.b.n(), dea.G.n(), dxa.c($$0.a(lf.aD), $$0.a(lf.aH)), rb.a(false, false, false), List.of(), -64, false, false, false, true);
   }

   public static dwy e() {
      return new dwy(dxb.b, dea.b.n(), dea.a.n(), dxa.a(), rb.d(), List.of(), 63, true, false, false, false);
   }

   public dxb f() {
      return this.j;
   }

   public drb g() {
      return this.k;
   }

   public drb h() {
      return this.l;
   }

   public dwz i() {
      return this.m;
   }

   public dxk.o j() {
      return this.n;
   }

   public List<dcf.d> k() {
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
