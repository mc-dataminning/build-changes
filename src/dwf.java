import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Function;

public record dwf(dvs b, dvs c, dvs d, dvs e, dvs f, dvs g, dvs h, dvs i, dvs j, dvs k, dvs l, dvs m, dvs n, dvs o, dvs p) {
   public static final Codec<dwf> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               a("barrier", dwf::a),
               a("fluid_level_floodedness", dwf::b),
               a("fluid_level_spread", dwf::c),
               a("lava", dwf::d),
               a("temperature", dwf::e),
               a("vegetation", dwf::f),
               a("continents", dwf::g),
               a("erosion", dwf::h),
               a("depth", dwf::i),
               a("ridges", dwf::j),
               a("initial_density_without_jaggedness", dwf::k),
               a("final_density", dwf::l),
               a("vein_toggle", dwf::m),
               a("vein_ridged", dwf::n),
               a("vein_gap", dwf::o)
            )
            .apply($$0, dwf::new)
   );

   private static RecordCodecBuilder<dwf, dvs> a(String $$0, Function<dwf, dvs> $$1) {
      return dvs.d.fieldOf($$0).forGetter($$1);
   }

   public dwf a(dvs.f $$0) {
      return new dwf(
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

   public dvs a() {
      return this.b;
   }

   public dvs b() {
      return this.c;
   }

   public dvs c() {
      return this.d;
   }

   public dvs d() {
      return this.e;
   }

   public dvs e() {
      return this.f;
   }

   public dvs f() {
      return this.g;
   }

   public dvs g() {
      return this.h;
   }

   public dvs h() {
      return this.i;
   }

   public dvs i() {
      return this.j;
   }

   public dvs j() {
      return this.k;
   }

   public dvs k() {
      return this.l;
   }

   public dvs l() {
      return this.m;
   }

   public dvs m() {
      return this.n;
   }

   public dvs n() {
      return this.o;
   }

   public dvs o() {
      return this.p;
   }
}
