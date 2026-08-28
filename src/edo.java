import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Function;

public record edo(edb b, edb c, edb d, edb e, edb f, edb g, edb h, edb i, edb j, edb k, edb l, edb m, edb n, edb o, edb p) {
   public static final Codec<edo> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               a("barrier", edo::a),
               a("fluid_level_floodedness", edo::b),
               a("fluid_level_spread", edo::c),
               a("lava", edo::d),
               a("temperature", edo::e),
               a("vegetation", edo::f),
               a("continents", edo::g),
               a("erosion", edo::h),
               a("depth", edo::i),
               a("ridges", edo::j),
               a("initial_density_without_jaggedness", edo::k),
               a("final_density", edo::l),
               a("vein_toggle", edo::m),
               a("vein_ridged", edo::n),
               a("vein_gap", edo::o)
            )
            .apply($$0, edo::new)
   );

   private static RecordCodecBuilder<edo, edb> a(String $$0, Function<edo, edb> $$1) {
      return edb.d.fieldOf($$0).forGetter($$1);
   }

   public edo a(edb.f $$0) {
      return new edo(
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

   public edb a() {
      return this.b;
   }

   public edb b() {
      return this.c;
   }

   public edb c() {
      return this.d;
   }

   public edb d() {
      return this.e;
   }

   public edb e() {
      return this.f;
   }

   public edb f() {
      return this.g;
   }

   public edb g() {
      return this.h;
   }

   public edb h() {
      return this.i;
   }

   public edb i() {
      return this.j;
   }

   public edb j() {
      return this.k;
   }

   public edb k() {
      return this.l;
   }

   public edb l() {
      return this.m;
   }

   public edb m() {
      return this.n;
   }

   public edb n() {
      return this.o;
   }

   public edb o() {
      return this.p;
   }
}
