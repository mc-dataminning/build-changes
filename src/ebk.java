import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record ebk(ebn j, dvj k, dvj l, ebl m, ebw.o n, List<dgl.d> o, int p, boolean q, boolean r, boolean s, boolean t) {
   public static final Codec<ebk> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ebn.a.fieldOf("noise").forGetter(ebk::f),
               dvj.a.fieldOf("default_block").forGetter(ebk::g),
               dvj.a.fieldOf("default_fluid").forGetter(ebk::h),
               ebl.a.fieldOf("noise_router").forGetter(ebk::i),
               ebw.o.b.fieldOf("surface_rule").forGetter(ebk::j),
               dgl.d.a.listOf().fieldOf("spawn_target").forGetter(ebk::k),
               Codec.INT.fieldOf("sea_level").forGetter(ebk::l),
               Codec.BOOL.fieldOf("disable_mob_generation").forGetter(ebk::a),
               Codec.BOOL.fieldOf("aquifers_enabled").forGetter(ebk::b),
               Codec.BOOL.fieldOf("ore_veins_enabled").forGetter(ebk::c),
               Codec.BOOL.fieldOf("legacy_random_source").forGetter(ebk::n)
            )
            .apply($$0, ebk::new)
   );
   public static final Codec<jq<ebk>> b = ale.a(lz.aP, a);
   public static final alh<ebk> c = alh.a(lz.aP, ali.b("overworld"));
   public static final alh<ebk> d = alh.a(lz.aP, ali.b("large_biomes"));
   public static final alh<ebk> e = alh.a(lz.aP, ali.b("amplified"));
   public static final alh<ebk> f = alh.a(lz.aP, ali.b("nether"));
   public static final alh<ebk> g = alh.a(lz.aP, ali.b("end"));
   public static final alh<ebk> h = alh.a(lz.aP, ali.b("caves"));
   public static final alh<ebk> i = alh.a(lz.aP, ali.b("floating_islands"));

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

   public ece.a d() {
      return this.t ? ece.a.a : ece.a.b;
   }

   public static void a(qy<ebk> $$0) {
      $$0.a(c, a($$0, false, false));
      $$0.a(d, a($$0, false, true));
      $$0.a(e, a($$0, true, false));
      $$0.a(f, c($$0));
      $$0.a(g, b($$0));
      $$0.a(h, d($$0));
      $$0.a(i, e($$0));
   }

   private static ebk b(qy<?> $$0) {
      return new ebk(ebn.d, dig.fz.m(), dig.a.m(), ebm.a($$0.a(lz.aK)), rl.c(), List.of(), 0, true, false, false, true);
   }

   private static ebk c(qy<?> $$0) {
      return new ebk(ebn.c, dig.dV.m(), dig.H.m(), ebm.a($$0.a(lz.aK), $$0.a(lz.aQ)), rl.b(), List.of(), 32, false, false, false, true);
   }

   private static ebk a(qy<?> $$0, boolean $$1, boolean $$2) {
      return new ebk(ebn.b, dig.b.m(), dig.G.m(), ebm.a($$0.a(lz.aK), $$0.a(lz.aQ), $$2, $$1), rl.a(), new dgs().a(), 63, false, true, true, false);
   }

   private static ebk d(qy<?> $$0) {
      return new ebk(ebn.e, dig.b.m(), dig.G.m(), ebm.b($$0.a(lz.aK), $$0.a(lz.aQ)), rl.a(false, true, true), List.of(), 32, false, false, false, true);
   }

   private static ebk e(qy<?> $$0) {
      return new ebk(ebn.f, dig.b.m(), dig.G.m(), ebm.c($$0.a(lz.aK), $$0.a(lz.aQ)), rl.a(false, false, false), List.of(), -64, false, false, false, true);
   }

   public static ebk e() {
      return new ebk(ebn.b, dig.b.m(), dig.a.m(), ebm.a(), rl.d(), List.of(), 63, true, false, false, false);
   }

   public ebn f() {
      return this.j;
   }

   public dvj g() {
      return this.k;
   }

   public dvj h() {
      return this.l;
   }

   public ebl i() {
      return this.m;
   }

   public ebw.o j() {
      return this.n;
   }

   public List<dgl.d> k() {
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
