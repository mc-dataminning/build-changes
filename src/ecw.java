import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Function;

public record ecw(ecj b, ecj c, ecj d, ecj e, ecj f, ecj g, ecj h, ecj i, ecj j, ecj k, ecj l, ecj m, ecj n, ecj o, ecj p) {
   public static final Codec<ecw> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               a("barrier", ecw::a),
               a("fluid_level_floodedness", ecw::b),
               a("fluid_level_spread", ecw::c),
               a("lava", ecw::d),
               a("temperature", ecw::e),
               a("vegetation", ecw::f),
               a("continents", ecw::g),
               a("erosion", ecw::h),
               a("depth", ecw::i),
               a("ridges", ecw::j),
               a("initial_density_without_jaggedness", ecw::k),
               a("final_density", ecw::l),
               a("vein_toggle", ecw::m),
               a("vein_ridged", ecw::n),
               a("vein_gap", ecw::o)
            )
            .apply($$0, ecw::new)
   );

   private static RecordCodecBuilder<ecw, ecj> a(String $$0, Function<ecw, ecj> $$1) {
      return ecj.d.fieldOf($$0).forGetter($$1);
   }

   public ecw a(ecj.f $$0) {
      return new ecw(
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

   public ecj a() {
      return this.b;
   }

   public ecj b() {
      return this.c;
   }

   public ecj c() {
      return this.d;
   }

   public ecj d() {
      return this.e;
   }

   public ecj e() {
      return this.f;
   }

   public ecj f() {
      return this.g;
   }

   public ecj g() {
      return this.h;
   }

   public ecj h() {
      return this.i;
   }

   public ecj i() {
      return this.j;
   }

   public ecj j() {
      return this.k;
   }

   public ecj k() {
      return this.l;
   }

   public ecj l() {
      return this.m;
   }

   public ecj m() {
      return this.n;
   }

   public ecj n() {
      return this.o;
   }

   public ecj o() {
      return this.p;
   }
}
