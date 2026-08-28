import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record edv(edy j, dxv k, dxv l, edw m, eeh.o n, List<dit.d> o, int p, boolean q, boolean r, boolean s, boolean t) {
   public static final Codec<edv> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               edy.a.fieldOf("noise").forGetter(edv::f),
               dxv.a.fieldOf("default_block").forGetter(edv::g),
               dxv.a.fieldOf("default_fluid").forGetter(edv::h),
               edw.a.fieldOf("noise_router").forGetter(edv::i),
               eeh.o.b.fieldOf("surface_rule").forGetter(edv::j),
               dit.d.a.listOf().fieldOf("spawn_target").forGetter(edv::k),
               Codec.INT.fieldOf("sea_level").forGetter(edv::l),
               Codec.BOOL.fieldOf("disable_mob_generation").forGetter(edv::a),
               Codec.BOOL.fieldOf("aquifers_enabled").forGetter(edv::b),
               Codec.BOOL.fieldOf("ore_veins_enabled").forGetter(edv::c),
               Codec.BOOL.fieldOf("legacy_random_source").forGetter(edv::n)
            )
            .apply($$0, edv::new)
   );
   public static final Codec<jq<edv>> b = alv.a(mb.aR, a);
   public static final aly<edv> c = aly.a(mb.aR, alz.b("overworld"));
   public static final aly<edv> d = aly.a(mb.aR, alz.b("large_biomes"));
   public static final aly<edv> e = aly.a(mb.aR, alz.b("amplified"));
   public static final aly<edv> f = aly.a(mb.aR, alz.b("nether"));
   public static final aly<edv> g = aly.a(mb.aR, alz.b("end"));
   public static final aly<edv> h = aly.a(mb.aR, alz.b("caves"));
   public static final aly<edv> i = aly.a(mb.aR, alz.b("floating_islands"));

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

   public eep.a d() {
      return this.t ? eep.a.a : eep.a.b;
   }

   public static void a(rk<edv> $$0) {
      $$0.a(c, a($$0, false, false));
      $$0.a(d, a($$0, false, true));
      $$0.a(e, a($$0, true, false));
      $$0.a(f, c($$0));
      $$0.a(g, b($$0));
      $$0.a(h, d($$0));
      $$0.a(i, e($$0));
   }

   private static edv b(rk<?> $$0) {
      return new edv(edy.d, dko.fN.m(), dko.a.m(), edx.a($$0.a(mb.aM)), rx.c(), List.of(), 0, true, false, false, true);
   }

   private static edv c(rk<?> $$0) {
      return new edv(edy.c, dko.ei.m(), dko.K.m(), edx.a($$0.a(mb.aM), $$0.a(mb.aS)), rx.b(), List.of(), 32, false, false, false, true);
   }

   private static edv a(rk<?> $$0, boolean $$1, boolean $$2) {
      return new edv(edy.b, dko.b.m(), dko.J.m(), edx.a($$0.a(mb.aM), $$0.a(mb.aS), $$2, $$1), rx.a(), new dja().a(), 63, false, true, true, false);
   }

   private static edv d(rk<?> $$0) {
      return new edv(edy.e, dko.b.m(), dko.J.m(), edx.b($$0.a(mb.aM), $$0.a(mb.aS)), rx.a(false, true, true), List.of(), 32, false, false, false, true);
   }

   private static edv e(rk<?> $$0) {
      return new edv(edy.f, dko.b.m(), dko.J.m(), edx.c($$0.a(mb.aM), $$0.a(mb.aS)), rx.a(false, false, false), List.of(), -64, false, false, false, true);
   }

   public static edv e() {
      return new edv(edy.b, dko.b.m(), dko.a.m(), edx.a(), rx.d(), List.of(), 63, true, false, false, false);
   }

   public edy f() {
      return this.j;
   }

   public dxv g() {
      return this.k;
   }

   public dxv h() {
      return this.l;
   }

   public edw i() {
      return this.m;
   }

   public eeh.o j() {
      return this.n;
   }

   public List<dit.d> k() {
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
