import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Function;

public record ecy(ecl b, ecl c, ecl d, ecl e, ecl f, ecl g, ecl h, ecl i, ecl j, ecl k, ecl l, ecl m, ecl n, ecl o, ecl p) {
   public static final Codec<ecy> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               a("barrier", ecy::a),
               a("fluid_level_floodedness", ecy::b),
               a("fluid_level_spread", ecy::c),
               a("lava", ecy::d),
               a("temperature", ecy::e),
               a("vegetation", ecy::f),
               a("continents", ecy::g),
               a("erosion", ecy::h),
               a("depth", ecy::i),
               a("ridges", ecy::j),
               a("initial_density_without_jaggedness", ecy::k),
               a("final_density", ecy::l),
               a("vein_toggle", ecy::m),
               a("vein_ridged", ecy::n),
               a("vein_gap", ecy::o)
            )
            .apply($$0, ecy::new)
   );

   private static RecordCodecBuilder<ecy, ecl> a(String $$0, Function<ecy, ecl> $$1) {
      return ecl.d.fieldOf($$0).forGetter($$1);
   }

   public ecy a(ecl.f $$0) {
      return new ecy(
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

   public ecl a() {
      return this.b;
   }

   public ecl b() {
      return this.c;
   }

   public ecl c() {
      return this.d;
   }

   public ecl d() {
      return this.e;
   }

   public ecl e() {
      return this.f;
   }

   public ecl f() {
      return this.g;
   }

   public ecl g() {
      return this.h;
   }

   public ecl h() {
      return this.i;
   }

   public ecl i() {
      return this.j;
   }

   public ecl j() {
      return this.k;
   }

   public ecl k() {
      return this.l;
   }

   public ecl l() {
      return this.m;
   }

   public ecl m() {
      return this.n;
   }

   public ecl n() {
      return this.o;
   }

   public ecl o() {
      return this.p;
   }
}
