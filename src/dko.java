import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Function;

public record dko(dkb b, dkb c, dkb d, dkb e, dkb f, dkb g, dkb h, dkb i, dkb j, dkb k, dkb l, dkb m, dkb n, dkb o, dkb p) {
   public static final Codec<dko> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               a("barrier", dko::a),
               a("fluid_level_floodedness", dko::b),
               a("fluid_level_spread", dko::c),
               a("lava", dko::d),
               a("temperature", dko::e),
               a("vegetation", dko::f),
               a("continents", dko::g),
               a("erosion", dko::h),
               a("depth", dko::i),
               a("ridges", dko::j),
               a("initial_density_without_jaggedness", dko::k),
               a("final_density", dko::l),
               a("vein_toggle", dko::m),
               a("vein_ridged", dko::n),
               a("vein_gap", dko::o)
            )
            .apply($$0, dko::new)
   );

   private static RecordCodecBuilder<dko, dkb> a(String $$0, Function<dko, dkb> $$1) {
      return dkb.d.fieldOf($$0).forGetter($$1);
   }

   public dko a(dkb.f $$0) {
      return new dko(
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

   public dkb a() {
      return this.b;
   }

   public dkb b() {
      return this.c;
   }

   public dkb c() {
      return this.d;
   }

   public dkb d() {
      return this.e;
   }

   public dkb e() {
      return this.f;
   }

   public dkb f() {
      return this.g;
   }

   public dkb g() {
      return this.h;
   }

   public dkb h() {
      return this.i;
   }

   public dkb i() {
      return this.j;
   }

   public dkb j() {
      return this.k;
   }

   public dkb k() {
      return this.l;
   }

   public dkb l() {
      return this.m;
   }

   public dkb m() {
      return this.n;
   }

   public dkb n() {
      return this.o;
   }

   public dkb o() {
      return this.p;
   }
}
