import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Function;

public record edp(edc b, edc c, edc d, edc e, edc f, edc g, edc h, edc i, edc j, edc k, edc l, edc m, edc n, edc o, edc p) {
   public static final Codec<edp> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               a("barrier", edp::a),
               a("fluid_level_floodedness", edp::b),
               a("fluid_level_spread", edp::c),
               a("lava", edp::d),
               a("temperature", edp::e),
               a("vegetation", edp::f),
               a("continents", edp::g),
               a("erosion", edp::h),
               a("depth", edp::i),
               a("ridges", edp::j),
               a("initial_density_without_jaggedness", edp::k),
               a("final_density", edp::l),
               a("vein_toggle", edp::m),
               a("vein_ridged", edp::n),
               a("vein_gap", edp::o)
            )
            .apply($$0, edp::new)
   );

   private static RecordCodecBuilder<edp, edc> a(String $$0, Function<edp, edc> $$1) {
      return edc.d.fieldOf($$0).forGetter($$1);
   }

   public edp a(edc.f $$0) {
      return new edp(
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

   public edc a() {
      return this.b;
   }

   public edc b() {
      return this.c;
   }

   public edc c() {
      return this.d;
   }

   public edc d() {
      return this.e;
   }

   public edc e() {
      return this.f;
   }

   public edc f() {
      return this.g;
   }

   public edc g() {
      return this.h;
   }

   public edc h() {
      return this.i;
   }

   public edc i() {
      return this.j;
   }

   public edc j() {
      return this.k;
   }

   public edc k() {
      return this.l;
   }

   public edc l() {
      return this.m;
   }

   public edc m() {
      return this.n;
   }

   public edc n() {
      return this.o;
   }

   public edc o() {
      return this.p;
   }
}
