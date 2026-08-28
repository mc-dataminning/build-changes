import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record efs(efv j, dzo k, dzo l, eft m, ege.o n, List<dkb.d> o, int p, boolean q, boolean r, boolean s, boolean t) {
   public static final Codec<efs> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               efv.a.fieldOf("noise").forGetter(efs::f),
               dzo.a.fieldOf("default_block").forGetter(efs::g),
               dzo.a.fieldOf("default_fluid").forGetter(efs::h),
               eft.a.fieldOf("noise_router").forGetter(efs::i),
               ege.o.b.fieldOf("surface_rule").forGetter(efs::j),
               dkb.d.a.listOf().fieldOf("spawn_target").forGetter(efs::k),
               Codec.INT.fieldOf("sea_level").forGetter(efs::l),
               Codec.BOOL.fieldOf("disable_mob_generation").forGetter(efs::a),
               Codec.BOOL.fieldOf("aquifers_enabled").forGetter(efs::b),
               Codec.BOOL.fieldOf("ore_veins_enabled").forGetter(efs::c),
               Codec.BOOL.fieldOf("legacy_random_source").forGetter(efs::n)
            )
            .apply($$0, efs::new)
   );
   public static final Codec<je<efs>> b = ala.a(mg.aV, a);
   public static final ald<efs> c = ald.a(mg.aV, ale.b("overworld"));
   public static final ald<efs> d = ald.a(mg.aV, ale.b("large_biomes"));
   public static final ald<efs> e = ald.a(mg.aV, ale.b("amplified"));
   public static final ald<efs> f = ald.a(mg.aV, ale.b("nether"));
   public static final ald<efs> g = ald.a(mg.aV, ale.b("end"));
   public static final ald<efs> h = ald.a(mg.aV, ale.b("caves"));
   public static final ald<efs> i = ald.a(mg.aV, ale.b("floating_islands"));

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

   public egm.a d() {
      return this.t ? egm.a.a : egm.a.b;
   }

   public static void a(qh<efs> $$0) {
      $$0.a(c, a($$0, false, false));
      $$0.a(d, a($$0, false, true));
      $$0.a(e, a($$0, true, false));
      $$0.a(f, c($$0));
      $$0.a(g, b($$0));
      $$0.a(h, d($$0));
      $$0.a(i, e($$0));
   }

   private static efs b(qh<?> $$0) {
      return new efs(efv.d, dlw.fU.m(), dlw.a.m(), efu.a($$0.a(mg.aM)), qu.c(), List.of(), 0, true, false, false, true);
   }

   private static efs c(qh<?> $$0) {
      return new efs(efv.c, dlw.ei.m(), dlw.K.m(), efu.a($$0.a(mg.aM), $$0.a(mg.aW)), qu.b(), List.of(), 32, false, false, false, true);
   }

   private static efs a(qh<?> $$0, boolean $$1, boolean $$2) {
      return new efs(efv.b, dlw.b.m(), dlw.J.m(), efu.a($$0.a(mg.aM), $$0.a(mg.aW), $$2, $$1), qu.a(), new dki().a(), 63, false, true, true, false);
   }

   private static efs d(qh<?> $$0) {
      return new efs(efv.e, dlw.b.m(), dlw.J.m(), efu.b($$0.a(mg.aM), $$0.a(mg.aW)), qu.a(false, true, true), List.of(), 32, false, false, false, true);
   }

   private static efs e(qh<?> $$0) {
      return new efs(efv.f, dlw.b.m(), dlw.J.m(), efu.c($$0.a(mg.aM), $$0.a(mg.aW)), qu.a(false, false, false), List.of(), -64, false, false, false, true);
   }

   public static efs e() {
      return new efs(efv.b, dlw.b.m(), dlw.a.m(), efu.a(), qu.d(), List.of(), 63, true, false, false, false);
   }

   public efv f() {
      return this.j;
   }

   public dzo g() {
      return this.k;
   }

   public dzo h() {
      return this.l;
   }

   public eft i() {
      return this.m;
   }

   public ege.o j() {
      return this.n;
   }

   public List<dkb.d> k() {
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
