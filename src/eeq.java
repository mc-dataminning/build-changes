import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record eeq(eet j, dym k, dym l, eer m, efc.o n, List<djb.d> o, int p, boolean q, boolean r, boolean s, boolean t) {
   public static final Codec<eeq> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               eet.a.fieldOf("noise").forGetter(eeq::f),
               dym.a.fieldOf("default_block").forGetter(eeq::g),
               dym.a.fieldOf("default_fluid").forGetter(eeq::h),
               eer.a.fieldOf("noise_router").forGetter(eeq::i),
               efc.o.b.fieldOf("surface_rule").forGetter(eeq::j),
               djb.d.a.listOf().fieldOf("spawn_target").forGetter(eeq::k),
               Codec.INT.fieldOf("sea_level").forGetter(eeq::l),
               Codec.BOOL.fieldOf("disable_mob_generation").forGetter(eeq::a),
               Codec.BOOL.fieldOf("aquifers_enabled").forGetter(eeq::b),
               Codec.BOOL.fieldOf("ore_veins_enabled").forGetter(eeq::c),
               Codec.BOOL.fieldOf("legacy_random_source").forGetter(eeq::n)
            )
            .apply($$0, eeq::new)
   );
   public static final Codec<js<eeq>> b = akz.a(me.aV, a);
   public static final alc<eeq> c = alc.a(me.aV, ald.b("overworld"));
   public static final alc<eeq> d = alc.a(me.aV, ald.b("large_biomes"));
   public static final alc<eeq> e = alc.a(me.aV, ald.b("amplified"));
   public static final alc<eeq> f = alc.a(me.aV, ald.b("nether"));
   public static final alc<eeq> g = alc.a(me.aV, ald.b("end"));
   public static final alc<eeq> h = alc.a(me.aV, ald.b("caves"));
   public static final alc<eeq> i = alc.a(me.aV, ald.b("floating_islands"));

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

   public efk.a d() {
      return this.t ? efk.a.a : efk.a.b;
   }

   public static void a(qg<eeq> $$0) {
      $$0.a(c, a($$0, false, false));
      $$0.a(d, a($$0, false, true));
      $$0.a(e, a($$0, true, false));
      $$0.a(f, c($$0));
      $$0.a(g, b($$0));
      $$0.a(h, d($$0));
      $$0.a(i, e($$0));
   }

   private static eeq b(qg<?> $$0) {
      return new eeq(eet.d, dkw.fU.m(), dkw.a.m(), ees.a($$0.a(me.aQ)), qt.c(), List.of(), 0, true, false, false, true);
   }

   private static eeq c(qg<?> $$0) {
      return new eeq(eet.c, dkw.ei.m(), dkw.K.m(), ees.a($$0.a(me.aQ), $$0.a(me.aW)), qt.b(), List.of(), 32, false, false, false, true);
   }

   private static eeq a(qg<?> $$0, boolean $$1, boolean $$2) {
      return new eeq(eet.b, dkw.b.m(), dkw.J.m(), ees.a($$0.a(me.aQ), $$0.a(me.aW), $$2, $$1), qt.a(), new dji().a(), 63, false, true, true, false);
   }

   private static eeq d(qg<?> $$0) {
      return new eeq(eet.e, dkw.b.m(), dkw.J.m(), ees.b($$0.a(me.aQ), $$0.a(me.aW)), qt.a(false, true, true), List.of(), 32, false, false, false, true);
   }

   private static eeq e(qg<?> $$0) {
      return new eeq(eet.f, dkw.b.m(), dkw.J.m(), ees.c($$0.a(me.aQ), $$0.a(me.aW)), qt.a(false, false, false), List.of(), -64, false, false, false, true);
   }

   public static eeq e() {
      return new eeq(eet.b, dkw.b.m(), dkw.a.m(), ees.a(), qt.d(), List.of(), 63, true, false, false, false);
   }

   public eet f() {
      return this.j;
   }

   public dym g() {
      return this.k;
   }

   public dym h() {
      return this.l;
   }

   public eer i() {
      return this.m;
   }

   public efc.o j() {
      return this.n;
   }

   public List<djb.d> k() {
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
