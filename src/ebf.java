import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Function;

public record ebf(eas b, eas c, eas d, eas e, eas f, eas g, eas h, eas i, eas j, eas k, eas l, eas m, eas n, eas o, eas p) {
   public static final Codec<ebf> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               a("barrier", ebf::a),
               a("fluid_level_floodedness", ebf::b),
               a("fluid_level_spread", ebf::c),
               a("lava", ebf::d),
               a("temperature", ebf::e),
               a("vegetation", ebf::f),
               a("continents", ebf::g),
               a("erosion", ebf::h),
               a("depth", ebf::i),
               a("ridges", ebf::j),
               a("initial_density_without_jaggedness", ebf::k),
               a("final_density", ebf::l),
               a("vein_toggle", ebf::m),
               a("vein_ridged", ebf::n),
               a("vein_gap", ebf::o)
            )
            .apply($$0, ebf::new)
   );

   private static RecordCodecBuilder<ebf, eas> a(String $$0, Function<ebf, eas> $$1) {
      return eas.d.fieldOf($$0).forGetter($$1);
   }

   public ebf a(eas.f $$0) {
      return new ebf(
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

   public eas a() {
      return this.b;
   }

   public eas b() {
      return this.c;
   }

   public eas c() {
      return this.d;
   }

   public eas d() {
      return this.e;
   }

   public eas e() {
      return this.f;
   }

   public eas f() {
      return this.g;
   }

   public eas g() {
      return this.h;
   }

   public eas h() {
      return this.i;
   }

   public eas i() {
      return this.j;
   }

   public eas j() {
      return this.k;
   }

   public eas k() {
      return this.l;
   }

   public eas l() {
      return this.m;
   }

   public eas m() {
      return this.n;
   }

   public eas n() {
      return this.o;
   }

   public eas o() {
      return this.p;
   }
}
