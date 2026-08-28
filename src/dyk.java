import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record dyk(dyn j, dsk k, dsk l, dyl m, dyw.o n, List<ddo.d> o, int p, boolean q, boolean r, boolean s, boolean t) {
   public static final Codec<dyk> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dyn.a.fieldOf("noise").forGetter(dyk::f),
               dsk.b.fieldOf("default_block").forGetter(dyk::g),
               dsk.b.fieldOf("default_fluid").forGetter(dyk::h),
               dyl.a.fieldOf("noise_router").forGetter(dyk::i),
               dyw.o.b.fieldOf("surface_rule").forGetter(dyk::j),
               ddo.d.a.listOf().fieldOf("spawn_target").forGetter(dyk::k),
               Codec.INT.fieldOf("sea_level").forGetter(dyk::l),
               Codec.BOOL.fieldOf("disable_mob_generation").forGetter(dyk::a),
               Codec.BOOL.fieldOf("aquifers_enabled").forGetter(dyk::b),
               Codec.BOOL.fieldOf("ore_veins_enabled").forGetter(dyk::c),
               Codec.BOOL.fieldOf("legacy_random_source").forGetter(dyk::n)
            )
            .apply($$0, dyk::new)
   );
   public static final Codec<jj<dyk>> b = akg.a(lr.aN, a);
   public static final akj<dyk> c = akj.a(lr.aN, new akk("overworld"));
   public static final akj<dyk> d = akj.a(lr.aN, new akk("large_biomes"));
   public static final akj<dyk> e = akj.a(lr.aN, new akk("amplified"));
   public static final akj<dyk> f = akj.a(lr.aN, new akk("nether"));
   public static final akj<dyk> g = akj.a(lr.aN, new akk("end"));
   public static final akj<dyk> h = akj.a(lr.aN, new akk("caves"));
   public static final akj<dyk> i = akj.a(lr.aN, new akk("floating_islands"));

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

   public dze.a d() {
      return this.t ? dze.a.a : dze.a.b;
   }

   public static void a(qm<dyk> $$0) {
      $$0.a(c, a($$0, false, false));
      $$0.a(d, a($$0, false, true));
      $$0.a(e, a($$0, true, false));
      $$0.a(f, c($$0));
      $$0.a(g, b($$0));
      $$0.a(h, d($$0));
      $$0.a(i, e($$0));
   }

   private static dyk b(qm<?> $$0) {
      return new dyk(dyn.d, dfj.fz.o(), dfj.a.o(), dym.a($$0.a(lr.aI)), qz.c(), List.of(), 0, true, false, false, true);
   }

   private static dyk c(qm<?> $$0) {
      return new dyk(dyn.c, dfj.dV.o(), dfj.H.o(), dym.a($$0.a(lr.aI), $$0.a(lr.aO)), qz.b(), List.of(), 32, false, false, false, true);
   }

   private static dyk a(qm<?> $$0, boolean $$1, boolean $$2) {
      return new dyk(dyn.b, dfj.b.o(), dfj.G.o(), dym.a($$0.a(lr.aI), $$0.a(lr.aO), $$2, $$1), qz.a(), new ddv().a(), 63, false, true, true, false);
   }

   private static dyk d(qm<?> $$0) {
      return new dyk(dyn.e, dfj.b.o(), dfj.G.o(), dym.b($$0.a(lr.aI), $$0.a(lr.aO)), qz.a(false, true, true), List.of(), 32, false, false, false, true);
   }

   private static dyk e(qm<?> $$0) {
      return new dyk(dyn.f, dfj.b.o(), dfj.G.o(), dym.c($$0.a(lr.aI), $$0.a(lr.aO)), qz.a(false, false, false), List.of(), -64, false, false, false, true);
   }

   public static dyk e() {
      return new dyk(dyn.b, dfj.b.o(), dfj.a.o(), dym.a(), qz.d(), List.of(), 63, true, false, false, false);
   }

   public dyn f() {
      return this.j;
   }

   public dsk g() {
      return this.k;
   }

   public dsk h() {
      return this.l;
   }

   public dyl i() {
      return this.m;
   }

   public dyw.o j() {
      return this.n;
   }

   public List<ddo.d> k() {
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
