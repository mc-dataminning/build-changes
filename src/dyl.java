import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record dyl(dyo j, dsl k, dsl l, dym m, dyx.o n, List<ddp.d> o, int p, boolean q, boolean r, boolean s, boolean t) {
   public static final Codec<dyl> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dyo.a.fieldOf("noise").forGetter(dyl::f),
               dsl.b.fieldOf("default_block").forGetter(dyl::g),
               dsl.b.fieldOf("default_fluid").forGetter(dyl::h),
               dym.a.fieldOf("noise_router").forGetter(dyl::i),
               dyx.o.b.fieldOf("surface_rule").forGetter(dyl::j),
               ddp.d.a.listOf().fieldOf("spawn_target").forGetter(dyl::k),
               Codec.INT.fieldOf("sea_level").forGetter(dyl::l),
               Codec.BOOL.fieldOf("disable_mob_generation").forGetter(dyl::a),
               Codec.BOOL.fieldOf("aquifers_enabled").forGetter(dyl::b),
               Codec.BOOL.fieldOf("ore_veins_enabled").forGetter(dyl::c),
               Codec.BOOL.fieldOf("legacy_random_source").forGetter(dyl::n)
            )
            .apply($$0, dyl::new)
   );
   public static final Codec<jj<dyl>> b = akg.a(lr.aN, a);
   public static final akj<dyl> c = akj.a(lr.aN, new akk("overworld"));
   public static final akj<dyl> d = akj.a(lr.aN, new akk("large_biomes"));
   public static final akj<dyl> e = akj.a(lr.aN, new akk("amplified"));
   public static final akj<dyl> f = akj.a(lr.aN, new akk("nether"));
   public static final akj<dyl> g = akj.a(lr.aN, new akk("end"));
   public static final akj<dyl> h = akj.a(lr.aN, new akk("caves"));
   public static final akj<dyl> i = akj.a(lr.aN, new akk("floating_islands"));

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

   public dzf.a d() {
      return this.t ? dzf.a.a : dzf.a.b;
   }

   public static void a(qm<dyl> $$0) {
      $$0.a(c, a($$0, false, false));
      $$0.a(d, a($$0, false, true));
      $$0.a(e, a($$0, true, false));
      $$0.a(f, c($$0));
      $$0.a(g, b($$0));
      $$0.a(h, d($$0));
      $$0.a(i, e($$0));
   }

   private static dyl b(qm<?> $$0) {
      return new dyl(dyo.d, dfk.fz.o(), dfk.a.o(), dyn.a($$0.a(lr.aI)), qz.c(), List.of(), 0, true, false, false, true);
   }

   private static dyl c(qm<?> $$0) {
      return new dyl(dyo.c, dfk.dV.o(), dfk.H.o(), dyn.a($$0.a(lr.aI), $$0.a(lr.aO)), qz.b(), List.of(), 32, false, false, false, true);
   }

   private static dyl a(qm<?> $$0, boolean $$1, boolean $$2) {
      return new dyl(dyo.b, dfk.b.o(), dfk.G.o(), dyn.a($$0.a(lr.aI), $$0.a(lr.aO), $$2, $$1), qz.a(), new ddw().a(), 63, false, true, true, false);
   }

   private static dyl d(qm<?> $$0) {
      return new dyl(dyo.e, dfk.b.o(), dfk.G.o(), dyn.b($$0.a(lr.aI), $$0.a(lr.aO)), qz.a(false, true, true), List.of(), 32, false, false, false, true);
   }

   private static dyl e(qm<?> $$0) {
      return new dyl(dyo.f, dfk.b.o(), dfk.G.o(), dyn.c($$0.a(lr.aI), $$0.a(lr.aO)), qz.a(false, false, false), List.of(), -64, false, false, false, true);
   }

   public static dyl e() {
      return new dyl(dyo.b, dfk.b.o(), dfk.a.o(), dyn.a(), qz.d(), List.of(), 63, true, false, false, false);
   }

   public dyo f() {
      return this.j;
   }

   public dsl g() {
      return this.k;
   }

   public dsl h() {
      return this.l;
   }

   public dym i() {
      return this.m;
   }

   public dyx.o j() {
      return this.n;
   }

   public List<ddp.d> k() {
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
