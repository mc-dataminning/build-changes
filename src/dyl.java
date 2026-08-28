import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Function;

public record dyl(dxy b, dxy c, dxy d, dxy e, dxy f, dxy g, dxy h, dxy i, dxy j, dxy k, dxy l, dxy m, dxy n, dxy o, dxy p) {
   public static final Codec<dyl> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               a("barrier", dyl::a),
               a("fluid_level_floodedness", dyl::b),
               a("fluid_level_spread", dyl::c),
               a("lava", dyl::d),
               a("temperature", dyl::e),
               a("vegetation", dyl::f),
               a("continents", dyl::g),
               a("erosion", dyl::h),
               a("depth", dyl::i),
               a("ridges", dyl::j),
               a("initial_density_without_jaggedness", dyl::k),
               a("final_density", dyl::l),
               a("vein_toggle", dyl::m),
               a("vein_ridged", dyl::n),
               a("vein_gap", dyl::o)
            )
            .apply($$0, dyl::new)
   );

   private static RecordCodecBuilder<dyl, dxy> a(String $$0, Function<dyl, dxy> $$1) {
      return dxy.d.fieldOf($$0).forGetter($$1);
   }

   public dyl a(dxy.f $$0) {
      return new dyl(
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

   public dxy a() {
      return this.b;
   }

   public dxy b() {
      return this.c;
   }

   public dxy c() {
      return this.d;
   }

   public dxy d() {
      return this.e;
   }

   public dxy e() {
      return this.f;
   }

   public dxy f() {
      return this.g;
   }

   public dxy g() {
      return this.h;
   }

   public dxy h() {
      return this.i;
   }

   public dxy i() {
      return this.j;
   }

   public dxy j() {
      return this.k;
   }

   public dxy k() {
      return this.l;
   }

   public dxy l() {
      return this.m;
   }

   public dxy m() {
      return this.n;
   }

   public dxy n() {
      return this.o;
   }

   public dxy o() {
      return this.p;
   }
}
