import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Function;

public record dya(dxn b, dxn c, dxn d, dxn e, dxn f, dxn g, dxn h, dxn i, dxn j, dxn k, dxn l, dxn m, dxn n, dxn o, dxn p) {
   public static final Codec<dya> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               a("barrier", dya::a),
               a("fluid_level_floodedness", dya::b),
               a("fluid_level_spread", dya::c),
               a("lava", dya::d),
               a("temperature", dya::e),
               a("vegetation", dya::f),
               a("continents", dya::g),
               a("erosion", dya::h),
               a("depth", dya::i),
               a("ridges", dya::j),
               a("initial_density_without_jaggedness", dya::k),
               a("final_density", dya::l),
               a("vein_toggle", dya::m),
               a("vein_ridged", dya::n),
               a("vein_gap", dya::o)
            )
            .apply($$0, dya::new)
   );

   private static RecordCodecBuilder<dya, dxn> a(String $$0, Function<dya, dxn> $$1) {
      return dxn.d.fieldOf($$0).forGetter($$1);
   }

   public dya a(dxn.f $$0) {
      return new dya(
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

   public dxn a() {
      return this.b;
   }

   public dxn b() {
      return this.c;
   }

   public dxn c() {
      return this.d;
   }

   public dxn d() {
      return this.e;
   }

   public dxn e() {
      return this.f;
   }

   public dxn f() {
      return this.g;
   }

   public dxn g() {
      return this.h;
   }

   public dxn h() {
      return this.i;
   }

   public dxn i() {
      return this.j;
   }

   public dxn j() {
      return this.k;
   }

   public dxn k() {
      return this.l;
   }

   public dxn l() {
      return this.m;
   }

   public dxn m() {
      return this.n;
   }

   public dxn n() {
      return this.o;
   }

   public dxn o() {
      return this.p;
   }
}
