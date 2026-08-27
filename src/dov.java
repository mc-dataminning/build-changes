import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Function;

public record dov(doi b, doi c, doi d, doi e, doi f, doi g, doi h, doi i, doi j, doi k, doi l, doi m, doi n, doi o, doi p) {
   public static final Codec<dov> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               a("barrier", dov::a),
               a("fluid_level_floodedness", dov::b),
               a("fluid_level_spread", dov::c),
               a("lava", dov::d),
               a("temperature", dov::e),
               a("vegetation", dov::f),
               a("continents", dov::g),
               a("erosion", dov::h),
               a("depth", dov::i),
               a("ridges", dov::j),
               a("initial_density_without_jaggedness", dov::k),
               a("final_density", dov::l),
               a("vein_toggle", dov::m),
               a("vein_ridged", dov::n),
               a("vein_gap", dov::o)
            )
            .apply($$0, dov::new)
   );

   private static RecordCodecBuilder<dov, doi> a(String $$0, Function<dov, doi> $$1) {
      return doi.d.fieldOf($$0).forGetter($$1);
   }

   public dov a(doi.f $$0) {
      return new dov(
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

   public doi a() {
      return this.b;
   }

   public doi b() {
      return this.c;
   }

   public doi c() {
      return this.d;
   }

   public doi d() {
      return this.e;
   }

   public doi e() {
      return this.f;
   }

   public doi f() {
      return this.g;
   }

   public doi g() {
      return this.h;
   }

   public doi h() {
      return this.i;
   }

   public doi i() {
      return this.j;
   }

   public doi j() {
      return this.k;
   }

   public doi k() {
      return this.l;
   }

   public doi l() {
      return this.m;
   }

   public doi m() {
      return this.n;
   }

   public doi n() {
      return this.o;
   }

   public doi o() {
      return this.p;
   }
}
