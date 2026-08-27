import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Function;

public record dla(dkn b, dkn c, dkn d, dkn e, dkn f, dkn g, dkn h, dkn i, dkn j, dkn k, dkn l, dkn m, dkn n, dkn o, dkn p) {
   public static final Codec<dla> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               a("barrier", dla::a),
               a("fluid_level_floodedness", dla::b),
               a("fluid_level_spread", dla::c),
               a("lava", dla::d),
               a("temperature", dla::e),
               a("vegetation", dla::f),
               a("continents", dla::g),
               a("erosion", dla::h),
               a("depth", dla::i),
               a("ridges", dla::j),
               a("initial_density_without_jaggedness", dla::k),
               a("final_density", dla::l),
               a("vein_toggle", dla::m),
               a("vein_ridged", dla::n),
               a("vein_gap", dla::o)
            )
            .apply($$0, dla::new)
   );

   private static RecordCodecBuilder<dla, dkn> a(String $$0, Function<dla, dkn> $$1) {
      return dkn.d.fieldOf($$0).forGetter($$1);
   }

   public dla a(dkn.f $$0) {
      return new dla(
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

   public dkn a() {
      return this.b;
   }

   public dkn b() {
      return this.c;
   }

   public dkn c() {
      return this.d;
   }

   public dkn d() {
      return this.e;
   }

   public dkn e() {
      return this.f;
   }

   public dkn f() {
      return this.g;
   }

   public dkn g() {
      return this.h;
   }

   public dkn h() {
      return this.i;
   }

   public dkn i() {
      return this.j;
   }

   public dkn j() {
      return this.k;
   }

   public dkn k() {
      return this.l;
   }

   public dkn l() {
      return this.m;
   }

   public dkn m() {
      return this.n;
   }

   public dkn n() {
      return this.o;
   }

   public dkn o() {
      return this.p;
   }
}
