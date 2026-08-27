import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record dkn(dkq j, dez k, dez l, dko m, dkz.o n, List<cqs.d> o, int p, boolean q, boolean r, boolean s, boolean t) {
   public static final Codec<dkn> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dkq.a.fieldOf("noise").forGetter(dkn::f),
               dez.b.fieldOf("default_block").forGetter(dkn::g),
               dez.b.fieldOf("default_fluid").forGetter(dkn::h),
               dko.a.fieldOf("noise_router").forGetter(dkn::i),
               dkz.o.b.fieldOf("surface_rule").forGetter(dkn::j),
               cqs.d.a.listOf().fieldOf("spawn_target").forGetter(dkn::k),
               Codec.INT.fieldOf("sea_level").forGetter(dkn::l),
               Codec.BOOL.fieldOf("disable_mob_generation").forGetter(dkn::a),
               Codec.BOOL.fieldOf("aquifers_enabled").forGetter(dkn::b),
               Codec.BOOL.fieldOf("ore_veins_enabled").forGetter(dkn::c),
               Codec.BOOL.fieldOf("legacy_random_source").forGetter(dkn::n)
            )
            .apply($$0, dkn::new)
   );
   public static final Codec<he<dkn>> b = aen.a(jc.aw, a);
   public static final aeq<dkn> c = aeq.a(jc.aw, new aer("overworld"));
   public static final aeq<dkn> d = aeq.a(jc.aw, new aer("large_biomes"));
   public static final aeq<dkn> e = aeq.a(jc.aw, new aer("amplified"));
   public static final aeq<dkn> f = aeq.a(jc.aw, new aer("nether"));
   public static final aeq<dkn> g = aeq.a(jc.aw, new aer("end"));
   public static final aeq<dkn> h = aeq.a(jc.aw, new aer("caves"));
   public static final aeq<dkn> i = aeq.a(jc.aw, new aer("floating_islands"));

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

   public dlh.a d() {
      return this.t ? dlh.a.a : dlh.a.b;
   }

   public static void a(nm<dkn> $$0) {
      $$0.a(c, a($$0, false, false));
      $$0.a(d, a($$0, false, true));
      $$0.a(e, a($$0, true, false));
      $$0.a(f, c($$0));
      $$0.a(g, b($$0));
      $$0.a(h, d($$0));
      $$0.a(i, e($$0));
   }

   private static dkn b(nm<?> $$0) {
      return new dkn(dkq.d, csm.fz.n(), csm.a.n(), dkp.a($$0.a(jc.at)), nz.c(), List.of(), 0, true, false, false, true);
   }

   private static dkn c(nm<?> $$0) {
      return new dkn(dkq.c, csm.dW.n(), csm.H.n(), dkp.a($$0.a(jc.at), $$0.a(jc.ax)), nz.b(), List.of(), 32, false, false, false, true);
   }

   private static dkn a(nm<?> $$0, boolean $$1, boolean $$2) {
      return new dkn(dkq.b, csm.b.n(), csm.G.n(), dkp.a($$0.a(jc.at), $$0.a(jc.ax), $$2, $$1), nz.a(), new cqz().a(), 63, false, true, true, false);
   }

   private static dkn d(nm<?> $$0) {
      return new dkn(dkq.e, csm.b.n(), csm.G.n(), dkp.b($$0.a(jc.at), $$0.a(jc.ax)), nz.a(false, true, true), List.of(), 32, false, false, false, true);
   }

   private static dkn e(nm<?> $$0) {
      return new dkn(dkq.f, csm.b.n(), csm.G.n(), dkp.c($$0.a(jc.at), $$0.a(jc.ax)), nz.a(false, false, false), List.of(), -64, false, false, false, true);
   }

   public static dkn e() {
      return new dkn(dkq.b, csm.b.n(), csm.a.n(), dkp.a(), nz.d(), List.of(), 63, true, false, false, false);
   }

   public dkq f() {
      return this.j;
   }

   public dez g() {
      return this.k;
   }

   public dez h() {
      return this.l;
   }

   public dko i() {
      return this.m;
   }

   public dkz.o j() {
      return this.n;
   }

   public List<cqs.d> k() {
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
