import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Function;

public record edw(edj b, edj c, edj d, edj e, edj f, edj g, edj h, edj i, edj j, edj k, edj l, edj m, edj n, edj o, edj p) {
   public static final Codec<edw> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               a("barrier", edw::a),
               a("fluid_level_floodedness", edw::b),
               a("fluid_level_spread", edw::c),
               a("lava", edw::d),
               a("temperature", edw::e),
               a("vegetation", edw::f),
               a("continents", edw::g),
               a("erosion", edw::h),
               a("depth", edw::i),
               a("ridges", edw::j),
               a("initial_density_without_jaggedness", edw::k),
               a("final_density", edw::l),
               a("vein_toggle", edw::m),
               a("vein_ridged", edw::n),
               a("vein_gap", edw::o)
            )
            .apply($$0, edw::new)
   );

   private static RecordCodecBuilder<edw, edj> a(String $$0, Function<edw, edj> $$1) {
      return edj.d.fieldOf($$0).forGetter($$1);
   }

   public edw a(edj.f $$0) {
      return new edw(
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

   public edj a() {
      return this.b;
   }

   public edj b() {
      return this.c;
   }

   public edj c() {
      return this.d;
   }

   public edj d() {
      return this.e;
   }

   public edj e() {
      return this.f;
   }

   public edj f() {
      return this.g;
   }

   public edj g() {
      return this.h;
   }

   public edj h() {
      return this.i;
   }

   public edj i() {
      return this.j;
   }

   public edj j() {
      return this.k;
   }

   public edj k() {
      return this.l;
   }

   public edj l() {
      return this.m;
   }

   public edj m() {
      return this.n;
   }

   public edj n() {
      return this.o;
   }

   public edj o() {
      return this.p;
   }
}
