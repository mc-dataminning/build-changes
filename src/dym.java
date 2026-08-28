import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Function;

public record dym(dxz b, dxz c, dxz d, dxz e, dxz f, dxz g, dxz h, dxz i, dxz j, dxz k, dxz l, dxz m, dxz n, dxz o, dxz p) {
   public static final Codec<dym> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               a("barrier", dym::a),
               a("fluid_level_floodedness", dym::b),
               a("fluid_level_spread", dym::c),
               a("lava", dym::d),
               a("temperature", dym::e),
               a("vegetation", dym::f),
               a("continents", dym::g),
               a("erosion", dym::h),
               a("depth", dym::i),
               a("ridges", dym::j),
               a("initial_density_without_jaggedness", dym::k),
               a("final_density", dym::l),
               a("vein_toggle", dym::m),
               a("vein_ridged", dym::n),
               a("vein_gap", dym::o)
            )
            .apply($$0, dym::new)
   );

   private static RecordCodecBuilder<dym, dxz> a(String $$0, Function<dym, dxz> $$1) {
      return dxz.d.fieldOf($$0).forGetter($$1);
   }

   public dym a(dxz.f $$0) {
      return new dym(
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

   public dxz a() {
      return this.b;
   }

   public dxz b() {
      return this.c;
   }

   public dxz c() {
      return this.d;
   }

   public dxz d() {
      return this.e;
   }

   public dxz e() {
      return this.f;
   }

   public dxz f() {
      return this.g;
   }

   public dxz g() {
      return this.h;
   }

   public dxz h() {
      return this.i;
   }

   public dxz i() {
      return this.j;
   }

   public dxz j() {
      return this.k;
   }

   public dxz k() {
      return this.l;
   }

   public dxz l() {
      return this.m;
   }

   public dxz m() {
      return this.n;
   }

   public dxz n() {
      return this.o;
   }

   public dxz o() {
      return this.p;
   }
}
