import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Function;

public record ebw(ebj b, ebj c, ebj d, ebj e, ebj f, ebj g, ebj h, ebj i, ebj j, ebj k, ebj l, ebj m, ebj n, ebj o, ebj p) {
   public static final Codec<ebw> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               a("barrier", ebw::a),
               a("fluid_level_floodedness", ebw::b),
               a("fluid_level_spread", ebw::c),
               a("lava", ebw::d),
               a("temperature", ebw::e),
               a("vegetation", ebw::f),
               a("continents", ebw::g),
               a("erosion", ebw::h),
               a("depth", ebw::i),
               a("ridges", ebw::j),
               a("initial_density_without_jaggedness", ebw::k),
               a("final_density", ebw::l),
               a("vein_toggle", ebw::m),
               a("vein_ridged", ebw::n),
               a("vein_gap", ebw::o)
            )
            .apply($$0, ebw::new)
   );

   private static RecordCodecBuilder<ebw, ebj> a(String $$0, Function<ebw, ebj> $$1) {
      return ebj.d.fieldOf($$0).forGetter($$1);
   }

   public ebw a(ebj.f $$0) {
      return new ebw(
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

   public ebj a() {
      return this.b;
   }

   public ebj b() {
      return this.c;
   }

   public ebj c() {
      return this.d;
   }

   public ebj d() {
      return this.e;
   }

   public ebj e() {
      return this.f;
   }

   public ebj f() {
      return this.g;
   }

   public ebj g() {
      return this.h;
   }

   public ebj h() {
      return this.i;
   }

   public ebj i() {
      return this.j;
   }

   public ebj j() {
      return this.k;
   }

   public ebj k() {
      return this.l;
   }

   public ebj l() {
      return this.m;
   }

   public ebj m() {
      return this.n;
   }

   public ebj n() {
      return this.o;
   }

   public ebj o() {
      return this.p;
   }
}
