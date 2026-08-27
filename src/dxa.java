import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record dxa(dxd j, drd k, drd l, dxb m, dxm.o n, List<dch.d> o, int p, boolean q, boolean r, boolean s, boolean t) {
   public static final Codec<dxa> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dxd.a.fieldOf("noise").forGetter(dxa::f),
               drd.b.fieldOf("default_block").forGetter(dxa::g),
               drd.b.fieldOf("default_fluid").forGetter(dxa::h),
               dxb.a.fieldOf("noise_router").forGetter(dxa::i),
               dxm.o.b.fieldOf("surface_rule").forGetter(dxa::j),
               dch.d.a.listOf().fieldOf("spawn_target").forGetter(dxa::k),
               Codec.INT.fieldOf("sea_level").forGetter(dxa::l),
               Codec.BOOL.fieldOf("disable_mob_generation").forGetter(dxa::a),
               Codec.BOOL.fieldOf("aquifers_enabled").forGetter(dxa::b),
               Codec.BOOL.fieldOf("ore_veins_enabled").forGetter(dxa::c),
               Codec.BOOL.fieldOf("legacy_random_source").forGetter(dxa::n)
            )
            .apply($$0, dxa::new)
   );
   public static final Codec<ix<dxa>> b = akj.a(lf.aG, a);
   public static final akm<dxa> c = akm.a(lf.aG, new akn("overworld"));
   public static final akm<dxa> d = akm.a(lf.aG, new akn("large_biomes"));
   public static final akm<dxa> e = akm.a(lf.aG, new akn("amplified"));
   public static final akm<dxa> f = akm.a(lf.aG, new akn("nether"));
   public static final akm<dxa> g = akm.a(lf.aG, new akn("end"));
   public static final akm<dxa> h = akm.a(lf.aG, new akn("caves"));
   public static final akm<dxa> i = akm.a(lf.aG, new akn("floating_islands"));

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

   public dxu.a d() {
      return this.t ? dxu.a.a : dxu.a.b;
   }

   public static void a(qo<dxa> $$0) {
      $$0.a(c, a($$0, false, false));
      $$0.a(d, a($$0, false, true));
      $$0.a(e, a($$0, true, false));
      $$0.a(f, c($$0));
      $$0.a(g, b($$0));
      $$0.a(h, d($$0));
      $$0.a(i, e($$0));
   }

   private static dxa b(qo<?> $$0) {
      return new dxa(dxd.d, dec.fz.n(), dec.a.n(), dxc.a($$0.a(lf.aD)), rb.c(), List.of(), 0, true, false, false, true);
   }

   private static dxa c(qo<?> $$0) {
      return new dxa(dxd.c, dec.dV.n(), dec.H.n(), dxc.a($$0.a(lf.aD), $$0.a(lf.aH)), rb.b(), List.of(), 32, false, false, false, true);
   }

   private static dxa a(qo<?> $$0, boolean $$1, boolean $$2) {
      return new dxa(dxd.b, dec.b.n(), dec.G.n(), dxc.a($$0.a(lf.aD), $$0.a(lf.aH), $$2, $$1), rb.a(), new dco().a(), 63, false, true, true, false);
   }

   private static dxa d(qo<?> $$0) {
      return new dxa(dxd.e, dec.b.n(), dec.G.n(), dxc.b($$0.a(lf.aD), $$0.a(lf.aH)), rb.a(false, true, true), List.of(), 32, false, false, false, true);
   }

   private static dxa e(qo<?> $$0) {
      return new dxa(dxd.f, dec.b.n(), dec.G.n(), dxc.c($$0.a(lf.aD), $$0.a(lf.aH)), rb.a(false, false, false), List.of(), -64, false, false, false, true);
   }

   public static dxa e() {
      return new dxa(dxd.b, dec.b.n(), dec.a.n(), dxc.a(), rb.d(), List.of(), 63, true, false, false, false);
   }

   public dxd f() {
      return this.j;
   }

   public drd g() {
      return this.k;
   }

   public drd h() {
      return this.l;
   }

   public dxb i() {
      return this.m;
   }

   public dxm.o j() {
      return this.n;
   }

   public List<dch.d> k() {
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
