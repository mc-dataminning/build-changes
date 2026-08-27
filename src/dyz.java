import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record dyz(dzc k, dtc l, dtc m, dza n, dzl.o o, List<ddi.d> p, int q, int r, boolean s, boolean t, boolean u, boolean v) {
   public static final Codec<dyz> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dzc.a.fieldOf("noise").forGetter(dyz::f),
               dtc.b.fieldOf("default_block").forGetter(dyz::g),
               dtc.b.fieldOf("default_fluid").forGetter(dyz::h),
               dza.a.fieldOf("noise_router").forGetter(dyz::i),
               dzl.o.b.fieldOf("surface_rule").forGetter(dyz::j),
               ddi.d.a.listOf().fieldOf("spawn_target").forGetter(dyz::k),
               Codec.INT.fieldOf("sea_level").forGetter(dyz::l),
               Codec.INT.fieldOf("bottom_generation_padding").forGetter(dyz::m),
               Codec.BOOL.fieldOf("disable_mob_generation").forGetter(dyz::a),
               Codec.BOOL.fieldOf("aquifers_enabled").forGetter(dyz::b),
               Codec.BOOL.fieldOf("ore_veins_enabled").forGetter(dyz::c),
               Codec.BOOL.fieldOf("legacy_random_source").forGetter(dyz::o)
            )
            .apply($$0, dyz::new)
   );
   public static final Codec<ja<dyz>> b = akp.a(li.aG, a);
   public static final aks<dyz> c = aks.a(li.aG, new akt("overworld"));
   public static final aks<dyz> d = aks.a(li.aG, new akt("large_biomes"));
   public static final aks<dyz> e = aks.a(li.aG, new akt("amplified"));
   public static final aks<dyz> f = aks.a(li.aG, new akt("nether"));
   public static final aks<dyz> g = aks.a(li.aG, new akt("end"));
   public static final aks<dyz> h = aks.a(li.aG, new akt("caves"));
   public static final aks<dyz> i = aks.a(li.aG, new akt("floating_islands"));
   public static final aks<dyz> j = aks.a(li.aG, new akt("potato"));

   @Deprecated
   public boolean a() {
      return this.s;
   }

   public boolean b() {
      return this.t;
   }

   public boolean c() {
      return this.u;
   }

   public dzt.a d() {
      return this.v ? dzt.a.a : dzt.a.b;
   }

   public static void a(qq<dyz> $$0) {
      $$0.a(c, a($$0, false, false));
      $$0.a(d, a($$0, false, true));
      $$0.a(e, a($$0, true, false));
      $$0.a(f, c($$0));
      $$0.a(g, b($$0));
      $$0.a(h, d($$0));
      $$0.a(i, e($$0));
      $$0.a(j, f($$0));
   }

   private static dyz b(qq<?> $$0) {
      return new dyz(dzc.d, dfe.gr.n(), dfe.a.n(), dzb.a($$0.a(li.aD)), rh.d(), List.of(), 0, 0, true, false, false, true);
   }

   private static dyz c(qq<?> $$0) {
      return new dyz(dzc.c, dfe.eJ.n(), dfe.am.n(), dzb.a($$0.a(li.aD), $$0.a(li.aH)), rh.c(), List.of(), 32, 0, false, false, false, true);
   }

   private static dyz a(qq<?> $$0, boolean $$1, boolean $$2) {
      return new dyz(dzc.b, dfe.b.n(), dfe.al.n(), dzb.a($$0.a(li.aD), $$0.a(li.aH), $$2, $$1), rh.a(), new ddp().a(), 63, 0, false, true, true, false);
   }

   private static dyz d(qq<?> $$0) {
      return new dyz(dzc.e, dfe.b.n(), dfe.al.n(), dzb.b($$0.a(li.aD), $$0.a(li.aH)), rh.a(false, true, true), List.of(), 32, 0, false, false, false, true);
   }

   private static dyz e(qq<?> $$0) {
      return new dyz(dzc.f, dfe.b.n(), dfe.al.n(), dzb.c($$0.a(li.aD), $$0.a(li.aH)), rh.a(false, false, false), List.of(), -64, 8, false, false, false, true);
   }

   private static dyz f(qq<?> $$0) {
      return new dyz(dzc.g, dfe.c.n(), dfe.al.n(), dzb.d($$0.a(li.aD), $$0.a(li.aH)), rh.b(), List.of(), 0, 8, false, false, false, true);
   }

   public static dyz e() {
      return new dyz(dzc.b, dfe.b.n(), dfe.a.n(), dzb.a(), rh.e(), List.of(), 63, 0, true, false, false, false);
   }

   public dzc f() {
      return this.k;
   }

   public dtc g() {
      return this.l;
   }

   public dtc h() {
      return this.m;
   }

   public dza i() {
      return this.n;
   }

   public dzl.o j() {
      return this.o;
   }

   public List<ddi.d> k() {
      return this.p;
   }

   public int l() {
      return this.q;
   }

   public int m() {
      return this.r;
   }

   public boolean n() {
      return this.t;
   }

   public boolean o() {
      return this.v;
   }
}
