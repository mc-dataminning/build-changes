import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record eat(eaw j, dus k, dus l, eau m, ebf.o n, List<dft.d> o, int p, boolean q, boolean r, boolean s, boolean t) {
   public static final Codec<eat> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               eaw.a.fieldOf("noise").forGetter(eat::f),
               dus.a.fieldOf("default_block").forGetter(eat::g),
               dus.a.fieldOf("default_fluid").forGetter(eat::h),
               eau.a.fieldOf("noise_router").forGetter(eat::i),
               ebf.o.b.fieldOf("surface_rule").forGetter(eat::j),
               dft.d.a.listOf().fieldOf("spawn_target").forGetter(eat::k),
               Codec.INT.fieldOf("sea_level").forGetter(eat::l),
               Codec.BOOL.fieldOf("disable_mob_generation").forGetter(eat::a),
               Codec.BOOL.fieldOf("aquifers_enabled").forGetter(eat::b),
               Codec.BOOL.fieldOf("ore_veins_enabled").forGetter(eat::c),
               Codec.BOOL.fieldOf("legacy_random_source").forGetter(eat::n)
            )
            .apply($$0, eat::new)
   );
   public static final Codec<jo<eat>> b = ala.a(lw.aQ, a);
   public static final ald<eat> c = ald.a(lw.aQ, ale.b("overworld"));
   public static final ald<eat> d = ald.a(lw.aQ, ale.b("large_biomes"));
   public static final ald<eat> e = ald.a(lw.aQ, ale.b("amplified"));
   public static final ald<eat> f = ald.a(lw.aQ, ale.b("nether"));
   public static final ald<eat> g = ald.a(lw.aQ, ale.b("end"));
   public static final ald<eat> h = ald.a(lw.aQ, ale.b("caves"));
   public static final ald<eat> i = ald.a(lw.aQ, ale.b("floating_islands"));

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

   public ebn.a d() {
      return this.t ? ebn.a.a : ebn.a.b;
   }

   public static void a(qu<eat> $$0) {
      $$0.a(c, a($$0, false, false));
      $$0.a(d, a($$0, false, true));
      $$0.a(e, a($$0, true, false));
      $$0.a(f, c($$0));
      $$0.a(g, b($$0));
      $$0.a(h, d($$0));
      $$0.a(i, e($$0));
   }

   private static eat b(qu<?> $$0) {
      return new eat(eaw.d, dho.fz.n(), dho.a.n(), eav.a($$0.a(lw.aL)), rh.c(), List.of(), 0, true, false, false, true);
   }

   private static eat c(qu<?> $$0) {
      return new eat(eaw.c, dho.dV.n(), dho.H.n(), eav.a($$0.a(lw.aL), $$0.a(lw.aR)), rh.b(), List.of(), 32, false, false, false, true);
   }

   private static eat a(qu<?> $$0, boolean $$1, boolean $$2) {
      return new eat(eaw.b, dho.b.n(), dho.G.n(), eav.a($$0.a(lw.aL), $$0.a(lw.aR), $$2, $$1), rh.a(), new dga().a(), 63, false, true, true, false);
   }

   private static eat d(qu<?> $$0) {
      return new eat(eaw.e, dho.b.n(), dho.G.n(), eav.b($$0.a(lw.aL), $$0.a(lw.aR)), rh.a(false, true, true), List.of(), 32, false, false, false, true);
   }

   private static eat e(qu<?> $$0) {
      return new eat(eaw.f, dho.b.n(), dho.G.n(), eav.c($$0.a(lw.aL), $$0.a(lw.aR)), rh.a(false, false, false), List.of(), -64, false, false, false, true);
   }

   public static eat e() {
      return new eat(eaw.b, dho.b.n(), dho.a.n(), eav.a(), rh.d(), List.of(), 63, true, false, false, false);
   }

   public eaw f() {
      return this.j;
   }

   public dus g() {
      return this.k;
   }

   public dus h() {
      return this.l;
   }

   public eau i() {
      return this.m;
   }

   public ebf.o j() {
      return this.n;
   }

   public List<dft.d> k() {
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
