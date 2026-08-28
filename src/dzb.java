import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Function;

public record dzb(dyo b, dyo c, dyo d, dyo e, dyo f, dyo g, dyo h, dyo i, dyo j, dyo k, dyo l, dyo m, dyo n, dyo o, dyo p) {
   public static final Codec<dzb> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               a("barrier", dzb::a),
               a("fluid_level_floodedness", dzb::b),
               a("fluid_level_spread", dzb::c),
               a("lava", dzb::d),
               a("temperature", dzb::e),
               a("vegetation", dzb::f),
               a("continents", dzb::g),
               a("erosion", dzb::h),
               a("depth", dzb::i),
               a("ridges", dzb::j),
               a("initial_density_without_jaggedness", dzb::k),
               a("final_density", dzb::l),
               a("vein_toggle", dzb::m),
               a("vein_ridged", dzb::n),
               a("vein_gap", dzb::o)
            )
            .apply($$0, dzb::new)
   );

   private static RecordCodecBuilder<dzb, dyo> a(String $$0, Function<dzb, dyo> $$1) {
      return dyo.d.fieldOf($$0).forGetter($$1);
   }

   public dzb a(dyo.f $$0) {
      return new dzb(
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

   public dyo a() {
      return this.b;
   }

   public dyo b() {
      return this.c;
   }

   public dyo c() {
      return this.d;
   }

   public dyo d() {
      return this.e;
   }

   public dyo e() {
      return this.f;
   }

   public dyo f() {
      return this.g;
   }

   public dyo g() {
      return this.h;
   }

   public dyo h() {
      return this.i;
   }

   public dyo i() {
      return this.j;
   }

   public dyo j() {
      return this.k;
   }

   public dyo k() {
      return this.l;
   }

   public dyo l() {
      return this.m;
   }

   public dyo m() {
      return this.n;
   }

   public dyo n() {
      return this.o;
   }

   public dyo o() {
      return this.p;
   }
}
