import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Function;

public record eaq(ead b, ead c, ead d, ead e, ead f, ead g, ead h, ead i, ead j, ead k, ead l, ead m, ead n, ead o, ead p) {
   public static final Codec<eaq> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               a("barrier", eaq::a),
               a("fluid_level_floodedness", eaq::b),
               a("fluid_level_spread", eaq::c),
               a("lava", eaq::d),
               a("temperature", eaq::e),
               a("vegetation", eaq::f),
               a("continents", eaq::g),
               a("erosion", eaq::h),
               a("depth", eaq::i),
               a("ridges", eaq::j),
               a("initial_density_without_jaggedness", eaq::k),
               a("final_density", eaq::l),
               a("vein_toggle", eaq::m),
               a("vein_ridged", eaq::n),
               a("vein_gap", eaq::o)
            )
            .apply($$0, eaq::new)
   );

   private static RecordCodecBuilder<eaq, ead> a(String $$0, Function<eaq, ead> $$1) {
      return ead.d.fieldOf($$0).forGetter($$1);
   }

   public eaq a(ead.f $$0) {
      return new eaq(
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

   public ead a() {
      return this.b;
   }

   public ead b() {
      return this.c;
   }

   public ead c() {
      return this.d;
   }

   public ead d() {
      return this.e;
   }

   public ead e() {
      return this.f;
   }

   public ead f() {
      return this.g;
   }

   public ead g() {
      return this.h;
   }

   public ead h() {
      return this.i;
   }

   public ead i() {
      return this.j;
   }

   public ead j() {
      return this.k;
   }

   public ead k() {
      return this.l;
   }

   public ead l() {
      return this.m;
   }

   public ead m() {
      return this.n;
   }

   public ead n() {
      return this.o;
   }

   public ead o() {
      return this.p;
   }
}
