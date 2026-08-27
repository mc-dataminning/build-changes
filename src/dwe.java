import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record dwe(dwh j, dqh k, dqh l, dwf m, dwq.o n, List<dbl.d> o, int p, boolean q, boolean r, boolean s, boolean t) {
   public static final Codec<dwe> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dwh.a.fieldOf("noise").forGetter(dwe::f),
               dqh.b.fieldOf("default_block").forGetter(dwe::g),
               dqh.b.fieldOf("default_fluid").forGetter(dwe::h),
               dwf.a.fieldOf("noise_router").forGetter(dwe::i),
               dwq.o.b.fieldOf("surface_rule").forGetter(dwe::j),
               dbl.d.a.listOf().fieldOf("spawn_target").forGetter(dwe::k),
               Codec.INT.fieldOf("sea_level").forGetter(dwe::l),
               Codec.BOOL.fieldOf("disable_mob_generation").forGetter(dwe::a),
               Codec.BOOL.fieldOf("aquifers_enabled").forGetter(dwe::b),
               Codec.BOOL.fieldOf("ore_veins_enabled").forGetter(dwe::c),
               Codec.BOOL.fieldOf("legacy_random_source").forGetter(dwe::n)
            )
            .apply($$0, dwe::new)
   );
   public static final Codec<iw<dwe>> b = akd.a(le.aG, a);
   public static final akg<dwe> c = akg.a(le.aG, new akh("overworld"));
   public static final akg<dwe> d = akg.a(le.aG, new akh("large_biomes"));
   public static final akg<dwe> e = akg.a(le.aG, new akh("amplified"));
   public static final akg<dwe> f = akg.a(le.aG, new akh("nether"));
   public static final akg<dwe> g = akg.a(le.aG, new akh("end"));
   public static final akg<dwe> h = akg.a(le.aG, new akh("caves"));
   public static final akg<dwe> i = akg.a(le.aG, new akh("floating_islands"));

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

   public dwy.a d() {
      return this.t ? dwy.a.a : dwy.a.b;
   }

   public static void a(ql<dwe> $$0) {
      $$0.a(c, a($$0, false, false));
      $$0.a(d, a($$0, false, true));
      $$0.a(e, a($$0, true, false));
      $$0.a(f, c($$0));
      $$0.a(g, b($$0));
      $$0.a(h, d($$0));
      $$0.a(i, e($$0));
   }

   private static dwe b(ql<?> $$0) {
      return new dwe(dwh.d, ddg.fz.n(), ddg.a.n(), dwg.a($$0.a(le.aD)), qy.c(), List.of(), 0, true, false, false, true);
   }

   private static dwe c(ql<?> $$0) {
      return new dwe(dwh.c, ddg.dV.n(), ddg.H.n(), dwg.a($$0.a(le.aD), $$0.a(le.aH)), qy.b(), List.of(), 32, false, false, false, true);
   }

   private static dwe a(ql<?> $$0, boolean $$1, boolean $$2) {
      return new dwe(dwh.b, ddg.b.n(), ddg.G.n(), dwg.a($$0.a(le.aD), $$0.a(le.aH), $$2, $$1), qy.a(), new dbs().a(), 63, false, true, true, false);
   }

   private static dwe d(ql<?> $$0) {
      return new dwe(dwh.e, ddg.b.n(), ddg.G.n(), dwg.b($$0.a(le.aD), $$0.a(le.aH)), qy.a(false, true, true), List.of(), 32, false, false, false, true);
   }

   private static dwe e(ql<?> $$0) {
      return new dwe(dwh.f, ddg.b.n(), ddg.G.n(), dwg.c($$0.a(le.aD), $$0.a(le.aH)), qy.a(false, false, false), List.of(), -64, false, false, false, true);
   }

   public static dwe e() {
      return new dwe(dwh.b, ddg.b.n(), ddg.a.n(), dwg.a(), qy.d(), List.of(), 63, true, false, false, false);
   }

   public dwh f() {
      return this.j;
   }

   public dqh g() {
      return this.k;
   }

   public dqh h() {
      return this.l;
   }

   public dwf i() {
      return this.m;
   }

   public dwq.o j() {
      return this.n;
   }

   public List<dbl.d> k() {
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
