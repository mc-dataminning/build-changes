import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Function;

public record dyf(dxs b, dxs c, dxs d, dxs e, dxs f, dxs g, dxs h, dxs i, dxs j, dxs k, dxs l, dxs m, dxs n, dxs o, dxs p) {
   public static final Codec<dyf> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               a("barrier", dyf::a),
               a("fluid_level_floodedness", dyf::b),
               a("fluid_level_spread", dyf::c),
               a("lava", dyf::d),
               a("temperature", dyf::e),
               a("vegetation", dyf::f),
               a("continents", dyf::g),
               a("erosion", dyf::h),
               a("depth", dyf::i),
               a("ridges", dyf::j),
               a("initial_density_without_jaggedness", dyf::k),
               a("final_density", dyf::l),
               a("vein_toggle", dyf::m),
               a("vein_ridged", dyf::n),
               a("vein_gap", dyf::o)
            )
            .apply($$0, dyf::new)
   );

   private static RecordCodecBuilder<dyf, dxs> a(String $$0, Function<dyf, dxs> $$1) {
      return dxs.d.fieldOf($$0).forGetter($$1);
   }

   public dyf a(dxs.f $$0) {
      return new dyf(
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

   public dxs a() {
      return this.b;
   }

   public dxs b() {
      return this.c;
   }

   public dxs c() {
      return this.d;
   }

   public dxs d() {
      return this.e;
   }

   public dxs e() {
      return this.f;
   }

   public dxs f() {
      return this.g;
   }

   public dxs g() {
      return this.h;
   }

   public dxs h() {
      return this.i;
   }

   public dxs i() {
      return this.j;
   }

   public dxs j() {
      return this.k;
   }

   public dxs k() {
      return this.l;
   }

   public dxs l() {
      return this.m;
   }

   public dxs m() {
      return this.n;
   }

   public dxs n() {
      return this.o;
   }

   public dxs o() {
      return this.p;
   }
}
