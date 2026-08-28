import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Function;

public record egy(egl b, egl c, egl d, egl e, egl f, egl g, egl h, egl i, egl j, egl k, egl l, egl m, egl n, egl o, egl p) {
   public static final Codec<egy> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               a("barrier", egy::a),
               a("fluid_level_floodedness", egy::b),
               a("fluid_level_spread", egy::c),
               a("lava", egy::d),
               a("temperature", egy::e),
               a("vegetation", egy::f),
               a("continents", egy::g),
               a("erosion", egy::h),
               a("depth", egy::i),
               a("ridges", egy::j),
               a("initial_density_without_jaggedness", egy::k),
               a("final_density", egy::l),
               a("vein_toggle", egy::m),
               a("vein_ridged", egy::n),
               a("vein_gap", egy::o)
            )
            .apply($$0, egy::new)
   );

   private static RecordCodecBuilder<egy, egl> a(String $$0, Function<egy, egl> $$1) {
      return egl.d.fieldOf($$0).forGetter($$1);
   }

   public egy a(egl.f $$0) {
      return new egy(
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

   public egl a() {
      return this.b;
   }

   public egl b() {
      return this.c;
   }

   public egl c() {
      return this.d;
   }

   public egl d() {
      return this.e;
   }

   public egl e() {
      return this.f;
   }

   public egl f() {
      return this.g;
   }

   public egl g() {
      return this.h;
   }

   public egl h() {
      return this.i;
   }

   public egl i() {
      return this.j;
   }

   public egl j() {
      return this.k;
   }

   public egl k() {
      return this.l;
   }

   public egl l() {
      return this.m;
   }

   public egl m() {
      return this.n;
   }

   public egl n() {
      return this.o;
   }

   public egl o() {
      return this.p;
   }
}
