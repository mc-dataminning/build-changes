import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record dnb(dne j, dhn k, dhn l, dnc m, dnn.o n, List<ctm.d> o, int p, boolean q, boolean r, boolean s, boolean t) {
   public static final Codec<dnb> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dne.a.fieldOf("noise").forGetter(dnb::f),
               dhn.b.fieldOf("default_block").forGetter(dnb::g),
               dhn.b.fieldOf("default_fluid").forGetter(dnb::h),
               dnc.a.fieldOf("noise_router").forGetter(dnb::i),
               dnn.o.b.fieldOf("surface_rule").forGetter(dnb::j),
               ctm.d.a.listOf().fieldOf("spawn_target").forGetter(dnb::k),
               Codec.INT.fieldOf("sea_level").forGetter(dnb::l),
               Codec.BOOL.fieldOf("disable_mob_generation").forGetter(dnb::a),
               Codec.BOOL.fieldOf("aquifers_enabled").forGetter(dnb::b),
               Codec.BOOL.fieldOf("ore_veins_enabled").forGetter(dnb::c),
               Codec.BOOL.fieldOf("legacy_random_source").forGetter(dnb::n)
            )
            .apply($$0, dnb::new)
   );
   public static final Codec<ig<dnb>> b = agi.a(kd.ay, a);
   public static final agl<dnb> c = agl.a(kd.ay, new agm("overworld"));
   public static final agl<dnb> d = agl.a(kd.ay, new agm("large_biomes"));
   public static final agl<dnb> e = agl.a(kd.ay, new agm("amplified"));
   public static final agl<dnb> f = agl.a(kd.ay, new agm("nether"));
   public static final agl<dnb> g = agl.a(kd.ay, new agm("end"));
   public static final agl<dnb> h = agl.a(kd.ay, new agm("caves"));
   public static final agl<dnb> i = agl.a(kd.ay, new agm("floating_islands"));

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

   public dnv.a d() {
      return this.t ? dnv.a.a : dnv.a.b;
   }

   public static void a(oz<dnb> $$0) {
      $$0.a(c, a($$0, false, false));
      $$0.a(d, a($$0, false, true));
      $$0.a(e, a($$0, true, false));
      $$0.a(f, c($$0));
      $$0.a(g, b($$0));
      $$0.a(h, d($$0));
      $$0.a(i, e($$0));
   }

   private static dnb b(oz<?> $$0) {
      return new dnb(dne.d, cvh.fz.o(), cvh.a.o(), dnd.a($$0.a(kd.av)), pm.c(), List.of(), 0, true, false, false, true);
   }

   private static dnb c(oz<?> $$0) {
      return new dnb(dne.c, cvh.dV.o(), cvh.H.o(), dnd.a($$0.a(kd.av), $$0.a(kd.az)), pm.b(), List.of(), 32, false, false, false, true);
   }

   private static dnb a(oz<?> $$0, boolean $$1, boolean $$2) {
      return new dnb(dne.b, cvh.b.o(), cvh.G.o(), dnd.a($$0.a(kd.av), $$0.a(kd.az), $$2, $$1), pm.a(), new ctt().a(), 63, false, true, true, false);
   }

   private static dnb d(oz<?> $$0) {
      return new dnb(dne.e, cvh.b.o(), cvh.G.o(), dnd.b($$0.a(kd.av), $$0.a(kd.az)), pm.a(false, true, true), List.of(), 32, false, false, false, true);
   }

   private static dnb e(oz<?> $$0) {
      return new dnb(dne.f, cvh.b.o(), cvh.G.o(), dnd.c($$0.a(kd.av), $$0.a(kd.az)), pm.a(false, false, false), List.of(), -64, false, false, false, true);
   }

   public static dnb e() {
      return new dnb(dne.b, cvh.b.o(), cvh.a.o(), dnd.a(), pm.d(), List.of(), 63, true, false, false, false);
   }

   public dne f() {
      return this.j;
   }

   public dhn g() {
      return this.k;
   }

   public dhn h() {
      return this.l;
   }

   public dnc i() {
      return this.m;
   }

   public dnn.o j() {
      return this.n;
   }

   public List<ctm.d> k() {
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
