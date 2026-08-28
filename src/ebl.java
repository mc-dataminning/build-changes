import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Function;

public record ebl(eay b, eay c, eay d, eay e, eay f, eay g, eay h, eay i, eay j, eay k, eay l, eay m, eay n, eay o, eay p) {
   public static final Codec<ebl> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               a("barrier", ebl::a),
               a("fluid_level_floodedness", ebl::b),
               a("fluid_level_spread", ebl::c),
               a("lava", ebl::d),
               a("temperature", ebl::e),
               a("vegetation", ebl::f),
               a("continents", ebl::g),
               a("erosion", ebl::h),
               a("depth", ebl::i),
               a("ridges", ebl::j),
               a("initial_density_without_jaggedness", ebl::k),
               a("final_density", ebl::l),
               a("vein_toggle", ebl::m),
               a("vein_ridged", ebl::n),
               a("vein_gap", ebl::o)
            )
            .apply($$0, ebl::new)
   );

   private static RecordCodecBuilder<ebl, eay> a(String $$0, Function<ebl, eay> $$1) {
      return eay.d.fieldOf($$0).forGetter($$1);
   }

   public ebl a(eay.f $$0) {
      return new ebl(
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

   public eay a() {
      return this.b;
   }

   public eay b() {
      return this.c;
   }

   public eay c() {
      return this.d;
   }

   public eay d() {
      return this.e;
   }

   public eay e() {
      return this.f;
   }

   public eay f() {
      return this.g;
   }

   public eay g() {
      return this.h;
   }

   public eay h() {
      return this.i;
   }

   public eay i() {
      return this.j;
   }

   public eay j() {
      return this.k;
   }

   public eay k() {
      return this.l;
   }

   public eay l() {
      return this.m;
   }

   public eay m() {
      return this.n;
   }

   public eay n() {
      return this.o;
   }

   public eay o() {
      return this.p;
   }
}
