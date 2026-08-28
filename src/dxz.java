import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Function;

public record dxz(dxm b, dxm c, dxm d, dxm e, dxm f, dxm g, dxm h, dxm i, dxm j, dxm k, dxm l, dxm m, dxm n, dxm o, dxm p) {
   public static final Codec<dxz> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               a("barrier", dxz::a),
               a("fluid_level_floodedness", dxz::b),
               a("fluid_level_spread", dxz::c),
               a("lava", dxz::d),
               a("temperature", dxz::e),
               a("vegetation", dxz::f),
               a("continents", dxz::g),
               a("erosion", dxz::h),
               a("depth", dxz::i),
               a("ridges", dxz::j),
               a("initial_density_without_jaggedness", dxz::k),
               a("final_density", dxz::l),
               a("vein_toggle", dxz::m),
               a("vein_ridged", dxz::n),
               a("vein_gap", dxz::o)
            )
            .apply($$0, dxz::new)
   );

   private static RecordCodecBuilder<dxz, dxm> a(String $$0, Function<dxz, dxm> $$1) {
      return dxm.d.fieldOf($$0).forGetter($$1);
   }

   public dxz a(dxm.f $$0) {
      return new dxz(
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

   public dxm a() {
      return this.b;
   }

   public dxm b() {
      return this.c;
   }

   public dxm c() {
      return this.d;
   }

   public dxm d() {
      return this.e;
   }

   public dxm e() {
      return this.f;
   }

   public dxm f() {
      return this.g;
   }

   public dxm g() {
      return this.h;
   }

   public dxm h() {
      return this.i;
   }

   public dxm i() {
      return this.j;
   }

   public dxm j() {
      return this.k;
   }

   public dxm k() {
      return this.l;
   }

   public dxm l() {
      return this.m;
   }

   public dxm m() {
      return this.n;
   }

   public dxm n() {
      return this.o;
   }

   public dxm o() {
      return this.p;
   }
}
