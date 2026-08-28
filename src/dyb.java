import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Function;

public record dyb(dxo b, dxo c, dxo d, dxo e, dxo f, dxo g, dxo h, dxo i, dxo j, dxo k, dxo l, dxo m, dxo n, dxo o, dxo p) {
   public static final Codec<dyb> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               a("barrier", dyb::a),
               a("fluid_level_floodedness", dyb::b),
               a("fluid_level_spread", dyb::c),
               a("lava", dyb::d),
               a("temperature", dyb::e),
               a("vegetation", dyb::f),
               a("continents", dyb::g),
               a("erosion", dyb::h),
               a("depth", dyb::i),
               a("ridges", dyb::j),
               a("initial_density_without_jaggedness", dyb::k),
               a("final_density", dyb::l),
               a("vein_toggle", dyb::m),
               a("vein_ridged", dyb::n),
               a("vein_gap", dyb::o)
            )
            .apply($$0, dyb::new)
   );

   private static RecordCodecBuilder<dyb, dxo> a(String $$0, Function<dyb, dxo> $$1) {
      return dxo.d.fieldOf($$0).forGetter($$1);
   }

   public dyb a(dxo.f $$0) {
      return new dyb(
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

   public dxo a() {
      return this.b;
   }

   public dxo b() {
      return this.c;
   }

   public dxo c() {
      return this.d;
   }

   public dxo d() {
      return this.e;
   }

   public dxo e() {
      return this.f;
   }

   public dxo f() {
      return this.g;
   }

   public dxo g() {
      return this.h;
   }

   public dxo h() {
      return this.i;
   }

   public dxo i() {
      return this.j;
   }

   public dxo j() {
      return this.k;
   }

   public dxo k() {
      return this.l;
   }

   public dxo l() {
      return this.m;
   }

   public dxo m() {
      return this.n;
   }

   public dxo n() {
      return this.o;
   }

   public dxo o() {
      return this.p;
   }
}
