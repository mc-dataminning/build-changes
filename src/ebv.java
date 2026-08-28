import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record ebv(eby j, dvv k, dvv l, ebw m, ech.o n, List<dgx.d> o, int p, boolean q, boolean r, boolean s, boolean t) {
   public static final Codec<ebv> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               eby.a.fieldOf("noise").forGetter(ebv::f),
               dvv.a.fieldOf("default_block").forGetter(ebv::g),
               dvv.a.fieldOf("default_fluid").forGetter(ebv::h),
               ebw.a.fieldOf("noise_router").forGetter(ebv::i),
               ech.o.b.fieldOf("surface_rule").forGetter(ebv::j),
               dgx.d.a.listOf().fieldOf("spawn_target").forGetter(ebv::k),
               Codec.INT.fieldOf("sea_level").forGetter(ebv::l),
               Codec.BOOL.fieldOf("disable_mob_generation").forGetter(ebv::a),
               Codec.BOOL.fieldOf("aquifers_enabled").forGetter(ebv::b),
               Codec.BOOL.fieldOf("ore_veins_enabled").forGetter(ebv::c),
               Codec.BOOL.fieldOf("legacy_random_source").forGetter(ebv::n)
            )
            .apply($$0, ebv::new)
   );
   public static final Codec<jq<ebv>> b = alf.a(ma.aP, a);
   public static final ali<ebv> c = ali.a(ma.aP, alj.b("overworld"));
   public static final ali<ebv> d = ali.a(ma.aP, alj.b("large_biomes"));
   public static final ali<ebv> e = ali.a(ma.aP, alj.b("amplified"));
   public static final ali<ebv> f = ali.a(ma.aP, alj.b("nether"));
   public static final ali<ebv> g = ali.a(ma.aP, alj.b("end"));
   public static final ali<ebv> h = ali.a(ma.aP, alj.b("caves"));
   public static final ali<ebv> i = ali.a(ma.aP, alj.b("floating_islands"));

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

   public ecp.a d() {
      return this.t ? ecp.a.a : ecp.a.b;
   }

   public static void a(qz<ebv> $$0) {
      $$0.a(c, a($$0, false, false));
      $$0.a(d, a($$0, false, true));
      $$0.a(e, a($$0, true, false));
      $$0.a(f, c($$0));
      $$0.a(g, b($$0));
      $$0.a(h, d($$0));
      $$0.a(i, e($$0));
   }

   private static ebv b(qz<?> $$0) {
      return new ebv(eby.d, dis.fz.m(), dis.a.m(), ebx.a($$0.a(ma.aK)), rm.c(), List.of(), 0, true, false, false, true);
   }

   private static ebv c(qz<?> $$0) {
      return new ebv(eby.c, dis.dV.m(), dis.H.m(), ebx.a($$0.a(ma.aK), $$0.a(ma.aQ)), rm.b(), List.of(), 32, false, false, false, true);
   }

   private static ebv a(qz<?> $$0, boolean $$1, boolean $$2) {
      return new ebv(eby.b, dis.b.m(), dis.G.m(), ebx.a($$0.a(ma.aK), $$0.a(ma.aQ), $$2, $$1), rm.a(), new dhe().a(), 63, false, true, true, false);
   }

   private static ebv d(qz<?> $$0) {
      return new ebv(eby.e, dis.b.m(), dis.G.m(), ebx.b($$0.a(ma.aK), $$0.a(ma.aQ)), rm.a(false, true, true), List.of(), 32, false, false, false, true);
   }

   private static ebv e(qz<?> $$0) {
      return new ebv(eby.f, dis.b.m(), dis.G.m(), ebx.c($$0.a(ma.aK), $$0.a(ma.aQ)), rm.a(false, false, false), List.of(), -64, false, false, false, true);
   }

   public static ebv e() {
      return new ebv(eby.b, dis.b.m(), dis.a.m(), ebx.a(), rm.d(), List.of(), 63, true, false, false, false);
   }

   public eby f() {
      return this.j;
   }

   public dvv g() {
      return this.k;
   }

   public dvv h() {
      return this.l;
   }

   public ebw i() {
      return this.m;
   }

   public ech.o j() {
      return this.n;
   }

   public List<dgx.d> k() {
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
