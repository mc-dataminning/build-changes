import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record dyb(dye j, dse k, dse l, dyc m, dyn.o n, List<ddi.d> o, int p, boolean q, boolean r, boolean s, boolean t) {
   public static final Codec<dyb> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dye.a.fieldOf("noise").forGetter(dyb::f),
               dse.b.fieldOf("default_block").forGetter(dyb::g),
               dse.b.fieldOf("default_fluid").forGetter(dyb::h),
               dyc.a.fieldOf("noise_router").forGetter(dyb::i),
               dyn.o.b.fieldOf("surface_rule").forGetter(dyb::j),
               ddi.d.a.listOf().fieldOf("spawn_target").forGetter(dyb::k),
               Codec.INT.fieldOf("sea_level").forGetter(dyb::l),
               Codec.BOOL.fieldOf("disable_mob_generation").forGetter(dyb::a),
               Codec.BOOL.fieldOf("aquifers_enabled").forGetter(dyb::b),
               Codec.BOOL.fieldOf("ore_veins_enabled").forGetter(dyb::c),
               Codec.BOOL.fieldOf("legacy_random_source").forGetter(dyb::n)
            )
            .apply($$0, dyb::new)
   );
   public static final Codec<ji<dyb>> b = alb.a(lq.aG, a);
   public static final ale<dyb> c = ale.a(lq.aG, new alf("overworld"));
   public static final ale<dyb> d = ale.a(lq.aG, new alf("large_biomes"));
   public static final ale<dyb> e = ale.a(lq.aG, new alf("amplified"));
   public static final ale<dyb> f = ale.a(lq.aG, new alf("nether"));
   public static final ale<dyb> g = ale.a(lq.aG, new alf("end"));
   public static final ale<dyb> h = ale.a(lq.aG, new alf("caves"));
   public static final ale<dyb> i = ale.a(lq.aG, new alf("floating_islands"));

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

   public dyv.a d() {
      return this.t ? dyv.a.a : dyv.a.b;
   }

   public static void a(rc<dyb> $$0) {
      $$0.a(c, a($$0, false, false));
      $$0.a(d, a($$0, false, true));
      $$0.a(e, a($$0, true, false));
      $$0.a(f, c($$0));
      $$0.a(g, b($$0));
      $$0.a(h, d($$0));
      $$0.a(i, e($$0));
   }

   private static dyb b(rc<?> $$0) {
      return new dyb(dye.d, dfd.fz.o(), dfd.a.o(), dyd.a($$0.a(lq.aD)), rp.c(), List.of(), 0, true, false, false, true);
   }

   private static dyb c(rc<?> $$0) {
      return new dyb(dye.c, dfd.dV.o(), dfd.H.o(), dyd.a($$0.a(lq.aD), $$0.a(lq.aH)), rp.b(), List.of(), 32, false, false, false, true);
   }

   private static dyb a(rc<?> $$0, boolean $$1, boolean $$2) {
      return new dyb(dye.b, dfd.b.o(), dfd.G.o(), dyd.a($$0.a(lq.aD), $$0.a(lq.aH), $$2, $$1), rp.a(), new ddp().a(), 63, false, true, true, false);
   }

   private static dyb d(rc<?> $$0) {
      return new dyb(dye.e, dfd.b.o(), dfd.G.o(), dyd.b($$0.a(lq.aD), $$0.a(lq.aH)), rp.a(false, true, true), List.of(), 32, false, false, false, true);
   }

   private static dyb e(rc<?> $$0) {
      return new dyb(dye.f, dfd.b.o(), dfd.G.o(), dyd.c($$0.a(lq.aD), $$0.a(lq.aH)), rp.a(false, false, false), List.of(), -64, false, false, false, true);
   }

   public static dyb e() {
      return new dyb(dye.b, dfd.b.o(), dfd.a.o(), dyd.a(), rp.d(), List.of(), 63, true, false, false, false);
   }

   public dye f() {
      return this.j;
   }

   public dse g() {
      return this.k;
   }

   public dse h() {
      return this.l;
   }

   public dyc i() {
      return this.m;
   }

   public dyn.o j() {
      return this.n;
   }

   public List<ddi.d> k() {
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
