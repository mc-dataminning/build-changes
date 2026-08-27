import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Function;

public record dxb(dwo b, dwo c, dwo d, dwo e, dwo f, dwo g, dwo h, dwo i, dwo j, dwo k, dwo l, dwo m, dwo n, dwo o, dwo p) {
   public static final Codec<dxb> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               a("barrier", dxb::a),
               a("fluid_level_floodedness", dxb::b),
               a("fluid_level_spread", dxb::c),
               a("lava", dxb::d),
               a("temperature", dxb::e),
               a("vegetation", dxb::f),
               a("continents", dxb::g),
               a("erosion", dxb::h),
               a("depth", dxb::i),
               a("ridges", dxb::j),
               a("initial_density_without_jaggedness", dxb::k),
               a("final_density", dxb::l),
               a("vein_toggle", dxb::m),
               a("vein_ridged", dxb::n),
               a("vein_gap", dxb::o)
            )
            .apply($$0, dxb::new)
   );

   private static RecordCodecBuilder<dxb, dwo> a(String $$0, Function<dxb, dwo> $$1) {
      return dwo.d.fieldOf($$0).forGetter($$1);
   }

   public dxb a(dwo.f $$0) {
      return new dxb(
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

   public dwo a() {
      return this.b;
   }

   public dwo b() {
      return this.c;
   }

   public dwo c() {
      return this.d;
   }

   public dwo d() {
      return this.e;
   }

   public dwo e() {
      return this.f;
   }

   public dwo f() {
      return this.g;
   }

   public dwo g() {
      return this.h;
   }

   public dwo h() {
      return this.i;
   }

   public dwo i() {
      return this.j;
   }

   public dwo j() {
      return this.k;
   }

   public dwo k() {
      return this.l;
   }

   public dwo l() {
      return this.m;
   }

   public dwo m() {
      return this.n;
   }

   public dwo n() {
      return this.o;
   }

   public dwo o() {
      return this.p;
   }
}
