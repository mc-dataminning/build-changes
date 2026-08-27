import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Function;

public record dky(dkl b, dkl c, dkl d, dkl e, dkl f, dkl g, dkl h, dkl i, dkl j, dkl k, dkl l, dkl m, dkl n, dkl o, dkl p) {
   public static final Codec<dky> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               a("barrier", dky::a),
               a("fluid_level_floodedness", dky::b),
               a("fluid_level_spread", dky::c),
               a("lava", dky::d),
               a("temperature", dky::e),
               a("vegetation", dky::f),
               a("continents", dky::g),
               a("erosion", dky::h),
               a("depth", dky::i),
               a("ridges", dky::j),
               a("initial_density_without_jaggedness", dky::k),
               a("final_density", dky::l),
               a("vein_toggle", dky::m),
               a("vein_ridged", dky::n),
               a("vein_gap", dky::o)
            )
            .apply($$0, dky::new)
   );

   private static RecordCodecBuilder<dky, dkl> a(String $$0, Function<dky, dkl> $$1) {
      return dkl.d.fieldOf($$0).forGetter($$1);
   }

   public dky a(dkl.f $$0) {
      return new dky(
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

   public dkl a() {
      return this.b;
   }

   public dkl b() {
      return this.c;
   }

   public dkl c() {
      return this.d;
   }

   public dkl d() {
      return this.e;
   }

   public dkl e() {
      return this.f;
   }

   public dkl f() {
      return this.g;
   }

   public dkl g() {
      return this.h;
   }

   public dkl h() {
      return this.i;
   }

   public dkl i() {
      return this.j;
   }

   public dkl j() {
      return this.k;
   }

   public dkl k() {
      return this.l;
   }

   public dkl l() {
      return this.m;
   }

   public dkl m() {
      return this.n;
   }

   public dkl n() {
      return this.o;
   }

   public dkl o() {
      return this.p;
   }
}
