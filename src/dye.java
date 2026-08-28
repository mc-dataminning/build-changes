import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record dye(dyh j, dsh k, dsh l, dyf m, dyq.o n, List<ddm.d> o, int p, boolean q, boolean r, boolean s, boolean t) {
   public static final Codec<dye> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dyh.a.fieldOf("noise").forGetter(dye::f),
               dsh.b.fieldOf("default_block").forGetter(dye::g),
               dsh.b.fieldOf("default_fluid").forGetter(dye::h),
               dyf.a.fieldOf("noise_router").forGetter(dye::i),
               dyq.o.b.fieldOf("surface_rule").forGetter(dye::j),
               ddm.d.a.listOf().fieldOf("spawn_target").forGetter(dye::k),
               Codec.INT.fieldOf("sea_level").forGetter(dye::l),
               Codec.BOOL.fieldOf("disable_mob_generation").forGetter(dye::a),
               Codec.BOOL.fieldOf("aquifers_enabled").forGetter(dye::b),
               Codec.BOOL.fieldOf("ore_veins_enabled").forGetter(dye::c),
               Codec.BOOL.fieldOf("legacy_random_source").forGetter(dye::n)
            )
            .apply($$0, dye::new)
   );
   public static final Codec<jj<dye>> b = akg.a(lr.aN, a);
   public static final akj<dye> c = akj.a(lr.aN, new akk("overworld"));
   public static final akj<dye> d = akj.a(lr.aN, new akk("large_biomes"));
   public static final akj<dye> e = akj.a(lr.aN, new akk("amplified"));
   public static final akj<dye> f = akj.a(lr.aN, new akk("nether"));
   public static final akj<dye> g = akj.a(lr.aN, new akk("end"));
   public static final akj<dye> h = akj.a(lr.aN, new akk("caves"));
   public static final akj<dye> i = akj.a(lr.aN, new akk("floating_islands"));

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

   public dyy.a d() {
      return this.t ? dyy.a.a : dyy.a.b;
   }

   public static void a(qm<dye> $$0) {
      $$0.a(c, a($$0, false, false));
      $$0.a(d, a($$0, false, true));
      $$0.a(e, a($$0, true, false));
      $$0.a(f, c($$0));
      $$0.a(g, b($$0));
      $$0.a(h, d($$0));
      $$0.a(i, e($$0));
   }

   private static dye b(qm<?> $$0) {
      return new dye(dyh.d, dfh.fz.o(), dfh.a.o(), dyg.a($$0.a(lr.aI)), qz.c(), List.of(), 0, true, false, false, true);
   }

   private static dye c(qm<?> $$0) {
      return new dye(dyh.c, dfh.dV.o(), dfh.H.o(), dyg.a($$0.a(lr.aI), $$0.a(lr.aO)), qz.b(), List.of(), 32, false, false, false, true);
   }

   private static dye a(qm<?> $$0, boolean $$1, boolean $$2) {
      return new dye(dyh.b, dfh.b.o(), dfh.G.o(), dyg.a($$0.a(lr.aI), $$0.a(lr.aO), $$2, $$1), qz.a(), new ddt().a(), 63, false, true, true, false);
   }

   private static dye d(qm<?> $$0) {
      return new dye(dyh.e, dfh.b.o(), dfh.G.o(), dyg.b($$0.a(lr.aI), $$0.a(lr.aO)), qz.a(false, true, true), List.of(), 32, false, false, false, true);
   }

   private static dye e(qm<?> $$0) {
      return new dye(dyh.f, dfh.b.o(), dfh.G.o(), dyg.c($$0.a(lr.aI), $$0.a(lr.aO)), qz.a(false, false, false), List.of(), -64, false, false, false, true);
   }

   public static dye e() {
      return new dye(dyh.b, dfh.b.o(), dfh.a.o(), dyg.a(), qz.d(), List.of(), 63, true, false, false, false);
   }

   public dyh f() {
      return this.j;
   }

   public dsh g() {
      return this.k;
   }

   public dsh h() {
      return this.l;
   }

   public dyf i() {
      return this.m;
   }

   public dyq.o j() {
      return this.n;
   }

   public List<ddm.d> k() {
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
