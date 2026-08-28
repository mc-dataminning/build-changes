import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Function;

public record dxv(dxi b, dxi c, dxi d, dxi e, dxi f, dxi g, dxi h, dxi i, dxi j, dxi k, dxi l, dxi m, dxi n, dxi o, dxi p) {
   public static final Codec<dxv> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               a("barrier", dxv::a),
               a("fluid_level_floodedness", dxv::b),
               a("fluid_level_spread", dxv::c),
               a("lava", dxv::d),
               a("temperature", dxv::e),
               a("vegetation", dxv::f),
               a("continents", dxv::g),
               a("erosion", dxv::h),
               a("depth", dxv::i),
               a("ridges", dxv::j),
               a("initial_density_without_jaggedness", dxv::k),
               a("final_density", dxv::l),
               a("vein_toggle", dxv::m),
               a("vein_ridged", dxv::n),
               a("vein_gap", dxv::o)
            )
            .apply($$0, dxv::new)
   );

   private static RecordCodecBuilder<dxv, dxi> a(String $$0, Function<dxv, dxi> $$1) {
      return dxi.d.fieldOf($$0).forGetter($$1);
   }

   public dxv a(dxi.f $$0) {
      return new dxv(
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

   public dxi a() {
      return this.b;
   }

   public dxi b() {
      return this.c;
   }

   public dxi c() {
      return this.d;
   }

   public dxi d() {
      return this.e;
   }

   public dxi e() {
      return this.f;
   }

   public dxi f() {
      return this.g;
   }

   public dxi g() {
      return this.h;
   }

   public dxi h() {
      return this.i;
   }

   public dxi i() {
      return this.j;
   }

   public dxi j() {
      return this.k;
   }

   public dxi k() {
      return this.l;
   }

   public dxi l() {
      return this.m;
   }

   public dxi m() {
      return this.n;
   }

   public dxi n() {
      return this.o;
   }

   public dxi o() {
      return this.p;
   }
}
