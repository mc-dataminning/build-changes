import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Function;

public record eau(eah b, eah c, eah d, eah e, eah f, eah g, eah h, eah i, eah j, eah k, eah l, eah m, eah n, eah o, eah p) {
   public static final Codec<eau> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               a("barrier", eau::a),
               a("fluid_level_floodedness", eau::b),
               a("fluid_level_spread", eau::c),
               a("lava", eau::d),
               a("temperature", eau::e),
               a("vegetation", eau::f),
               a("continents", eau::g),
               a("erosion", eau::h),
               a("depth", eau::i),
               a("ridges", eau::j),
               a("initial_density_without_jaggedness", eau::k),
               a("final_density", eau::l),
               a("vein_toggle", eau::m),
               a("vein_ridged", eau::n),
               a("vein_gap", eau::o)
            )
            .apply($$0, eau::new)
   );

   private static RecordCodecBuilder<eau, eah> a(String $$0, Function<eau, eah> $$1) {
      return eah.d.fieldOf($$0).forGetter($$1);
   }

   public eau a(eah.f $$0) {
      return new eau(
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

   public eah a() {
      return this.b;
   }

   public eah b() {
      return this.c;
   }

   public eah c() {
      return this.d;
   }

   public eah d() {
      return this.e;
   }

   public eah e() {
      return this.f;
   }

   public eah f() {
      return this.g;
   }

   public eah g() {
      return this.h;
   }

   public eah h() {
      return this.i;
   }

   public eah i() {
      return this.j;
   }

   public eah j() {
      return this.k;
   }

   public eah k() {
      return this.l;
   }

   public eah l() {
      return this.m;
   }

   public eah m() {
      return this.n;
   }

   public eah n() {
      return this.o;
   }

   public eah o() {
      return this.p;
   }
}
