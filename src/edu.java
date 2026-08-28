import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Function;

public record edu(edh b, edh c, edh d, edh e, edh f, edh g, edh h, edh i, edh j, edh k, edh l, edh m, edh n, edh o, edh p) {
   public static final Codec<edu> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               a("barrier", edu::a),
               a("fluid_level_floodedness", edu::b),
               a("fluid_level_spread", edu::c),
               a("lava", edu::d),
               a("temperature", edu::e),
               a("vegetation", edu::f),
               a("continents", edu::g),
               a("erosion", edu::h),
               a("depth", edu::i),
               a("ridges", edu::j),
               a("initial_density_without_jaggedness", edu::k),
               a("final_density", edu::l),
               a("vein_toggle", edu::m),
               a("vein_ridged", edu::n),
               a("vein_gap", edu::o)
            )
            .apply($$0, edu::new)
   );

   private static RecordCodecBuilder<edu, edh> a(String $$0, Function<edu, edh> $$1) {
      return edh.d.fieldOf($$0).forGetter($$1);
   }

   public edu a(edh.f $$0) {
      return new edu(
         this.b.a($$0),
         this.c.a($$0),
         this.d.a($$0),
         this.e.a($$0),
         this.f.a($$0),
         this.g.a($$0),
         this.h.a($$0),
         this.i.a($$0),
         this.j.a($$0),
         this.k.a($$0),
         this.l.a($$0),
         this.m.a($$0),
         this.n.a($$0),
         this.o.a($$0),
         this.p.a($$0)
      );
   }

   public edh a() {
      return this.b;
   }

   public edh b() {
      return this.c;
   }

   public edh c() {
      return this.d;
   }

   public edh d() {
      return this.e;
   }

   public edh e() {
      return this.f;
   }

   public edh f() {
      return this.g;
   }

   public edh g() {
      return this.h;
   }

   public edh h() {
      return this.i;
   }

   public edh i() {
      return this.j;
   }

   public edh j() {
      return this.k;
   }

   public edh k() {
      return this.l;
   }

   public edh l() {
      return this.m;
   }

   public edh m() {
      return this.n;
   }

   public edh n() {
      return this.o;
   }

   public edh o() {
      return this.p;
   }
}
