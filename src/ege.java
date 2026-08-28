import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Function;

public record ege(efr b, efr c, efr d, efr e, efr f, efr g, efr h, efr i, efr j, efr k, efr l, efr m, efr n, efr o, efr p) {
   public static final Codec<ege> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               a("barrier", ege::a),
               a("fluid_level_floodedness", ege::b),
               a("fluid_level_spread", ege::c),
               a("lava", ege::d),
               a("temperature", ege::e),
               a("vegetation", ege::f),
               a("continents", ege::g),
               a("erosion", ege::h),
               a("depth", ege::i),
               a("ridges", ege::j),
               a("initial_density_without_jaggedness", ege::k),
               a("final_density", ege::l),
               a("vein_toggle", ege::m),
               a("vein_ridged", ege::n),
               a("vein_gap", ege::o)
            )
            .apply($$0, ege::new)
   );

   private static RecordCodecBuilder<ege, efr> a(String $$0, Function<ege, efr> $$1) {
      return efr.d.fieldOf($$0).forGetter($$1);
   }

   public ege a(efr.f $$0) {
      return new ege(
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

   public efr a() {
      return this.b;
   }

   public efr b() {
      return this.c;
   }

   public efr c() {
      return this.d;
   }

   public efr d() {
      return this.e;
   }

   public efr e() {
      return this.f;
   }

   public efr f() {
      return this.g;
   }

   public efr g() {
      return this.h;
   }

   public efr h() {
      return this.i;
   }

   public efr i() {
      return this.j;
   }

   public efr j() {
      return this.k;
   }

   public efr k() {
      return this.l;
   }

   public efr l() {
      return this.m;
   }

   public efr m() {
      return this.n;
   }

   public efr n() {
      return this.o;
   }

   public efr o() {
      return this.p;
   }
}
