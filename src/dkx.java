import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record dkx(dla j, dfj k, dfj l, dky m, dlj.o n, List<crc.d> o, int p, boolean q, boolean r, boolean s, boolean t) {
   public static final Codec<dkx> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dla.a.fieldOf("noise").forGetter(dkx::f),
               dfj.b.fieldOf("default_block").forGetter(dkx::g),
               dfj.b.fieldOf("default_fluid").forGetter(dkx::h),
               dky.a.fieldOf("noise_router").forGetter(dkx::i),
               dlj.o.b.fieldOf("surface_rule").forGetter(dkx::j),
               crc.d.a.listOf().fieldOf("spawn_target").forGetter(dkx::k),
               Codec.INT.fieldOf("sea_level").forGetter(dkx::l),
               Codec.BOOL.fieldOf("disable_mob_generation").forGetter(dkx::a),
               Codec.BOOL.fieldOf("aquifers_enabled").forGetter(dkx::b),
               Codec.BOOL.fieldOf("ore_veins_enabled").forGetter(dkx::c),
               Codec.BOOL.fieldOf("legacy_random_source").forGetter(dkx::n)
            )
            .apply($$0, dkx::new)
   );
   public static final Codec<he<dkx>> b = aes.a(jc.aw, a);
   public static final aev<dkx> c = aev.a(jc.aw, new aew("overworld"));
   public static final aev<dkx> d = aev.a(jc.aw, new aew("large_biomes"));
   public static final aev<dkx> e = aev.a(jc.aw, new aew("amplified"));
   public static final aev<dkx> f = aev.a(jc.aw, new aew("nether"));
   public static final aev<dkx> g = aev.a(jc.aw, new aew("end"));
   public static final aev<dkx> h = aev.a(jc.aw, new aew("caves"));
   public static final aev<dkx> i = aev.a(jc.aw, new aew("floating_islands"));

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

   public dlr.a d() {
      return this.t ? dlr.a.a : dlr.a.b;
   }

   public static void a(nr<dkx> $$0) {
      $$0.a(c, a($$0, false, false));
      $$0.a(d, a($$0, false, true));
      $$0.a(e, a($$0, true, false));
      $$0.a(f, c($$0));
      $$0.a(g, b($$0));
      $$0.a(h, d($$0));
      $$0.a(i, e($$0));
   }

   private static dkx b(nr<?> $$0) {
      return new dkx(dla.d, csw.fz.n(), csw.a.n(), dkz.a($$0.a(jc.at)), oe.c(), List.of(), 0, true, false, false, true);
   }

   private static dkx c(nr<?> $$0) {
      return new dkx(dla.c, csw.dW.n(), csw.H.n(), dkz.a($$0.a(jc.at), $$0.a(jc.ax)), oe.b(), List.of(), 32, false, false, false, true);
   }

   private static dkx a(nr<?> $$0, boolean $$1, boolean $$2) {
      return new dkx(dla.b, csw.b.n(), csw.G.n(), dkz.a($$0.a(jc.at), $$0.a(jc.ax), $$2, $$1), oe.a(), new crj().a(), 63, false, true, true, false);
   }

   private static dkx d(nr<?> $$0) {
      return new dkx(dla.e, csw.b.n(), csw.G.n(), dkz.b($$0.a(jc.at), $$0.a(jc.ax)), oe.a(false, true, true), List.of(), 32, false, false, false, true);
   }

   private static dkx e(nr<?> $$0) {
      return new dkx(dla.f, csw.b.n(), csw.G.n(), dkz.c($$0.a(jc.at), $$0.a(jc.ax)), oe.a(false, false, false), List.of(), -64, false, false, false, true);
   }

   public static dkx e() {
      return new dkx(dla.b, csw.b.n(), csw.a.n(), dkz.a(), oe.d(), List.of(), 63, true, false, false, false);
   }

   public dla f() {
      return this.j;
   }

   public dfj g() {
      return this.k;
   }

   public dfj h() {
      return this.l;
   }

   public dky i() {
      return this.m;
   }

   public dlj.o j() {
      return this.n;
   }

   public List<crc.d> k() {
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
