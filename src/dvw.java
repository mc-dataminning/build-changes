import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Function;

public record dvw(dvj b, dvj c, dvj d, dvj e, dvj f, dvj g, dvj h, dvj i, dvj j, dvj k, dvj l, dvj m, dvj n, dvj o, dvj p) {
   public static final Codec<dvw> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               a("barrier", dvw::a),
               a("fluid_level_floodedness", dvw::b),
               a("fluid_level_spread", dvw::c),
               a("lava", dvw::d),
               a("temperature", dvw::e),
               a("vegetation", dvw::f),
               a("continents", dvw::g),
               a("erosion", dvw::h),
               a("depth", dvw::i),
               a("ridges", dvw::j),
               a("initial_density_without_jaggedness", dvw::k),
               a("final_density", dvw::l),
               a("vein_toggle", dvw::m),
               a("vein_ridged", dvw::n),
               a("vein_gap", dvw::o)
            )
            .apply($$0, dvw::new)
   );

   private static RecordCodecBuilder<dvw, dvj> a(String $$0, Function<dvw, dvj> $$1) {
      return dvj.d.fieldOf($$0).forGetter($$1);
   }

   public dvw a(dvj.f $$0) {
      return new dvw(
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

   public dvj a() {
      return this.b;
   }

   public dvj b() {
      return this.c;
   }

   public dvj c() {
      return this.d;
   }

   public dvj d() {
      return this.e;
   }

   public dvj e() {
      return this.f;
   }

   public dvj f() {
      return this.g;
   }

   public dvj g() {
      return this.h;
   }

   public dvj h() {
      return this.i;
   }

   public dvj i() {
      return this.j;
   }

   public dvj j() {
      return this.k;
   }

   public dvj k() {
      return this.l;
   }

   public dvj l() {
      return this.m;
   }

   public dvj m() {
      return this.n;
   }

   public dvj n() {
      return this.o;
   }

   public dvj o() {
      return this.p;
   }
}
