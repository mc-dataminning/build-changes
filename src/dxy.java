import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Function;

public record dxy(dxl b, dxl c, dxl d, dxl e, dxl f, dxl g, dxl h, dxl i, dxl j, dxl k, dxl l, dxl m, dxl n, dxl o, dxl p) {
   public static final Codec<dxy> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               a("barrier", dxy::a),
               a("fluid_level_floodedness", dxy::b),
               a("fluid_level_spread", dxy::c),
               a("lava", dxy::d),
               a("temperature", dxy::e),
               a("vegetation", dxy::f),
               a("continents", dxy::g),
               a("erosion", dxy::h),
               a("depth", dxy::i),
               a("ridges", dxy::j),
               a("initial_density_without_jaggedness", dxy::k),
               a("final_density", dxy::l),
               a("vein_toggle", dxy::m),
               a("vein_ridged", dxy::n),
               a("vein_gap", dxy::o)
            )
            .apply($$0, dxy::new)
   );

   private static RecordCodecBuilder<dxy, dxl> a(String $$0, Function<dxy, dxl> $$1) {
      return dxl.d.fieldOf($$0).forGetter($$1);
   }

   public dxy a(dxl.f $$0) {
      return new dxy(
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

   public dxl a() {
      return this.b;
   }

   public dxl b() {
      return this.c;
   }

   public dxl c() {
      return this.d;
   }

   public dxl d() {
      return this.e;
   }

   public dxl e() {
      return this.f;
   }

   public dxl f() {
      return this.g;
   }

   public dxl g() {
      return this.h;
   }

   public dxl h() {
      return this.i;
   }

   public dxl i() {
      return this.j;
   }

   public dxl j() {
      return this.k;
   }

   public dxl k() {
      return this.l;
   }

   public dxl l() {
      return this.m;
   }

   public dxl m() {
      return this.n;
   }

   public dxl n() {
      return this.o;
   }

   public dxl o() {
      return this.p;
   }
}
