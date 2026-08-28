import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Function;

public record ebp(ebc b, ebc c, ebc d, ebc e, ebc f, ebc g, ebc h, ebc i, ebc j, ebc k, ebc l, ebc m, ebc n, ebc o, ebc p) {
   public static final Codec<ebp> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               a("barrier", ebp::a),
               a("fluid_level_floodedness", ebp::b),
               a("fluid_level_spread", ebp::c),
               a("lava", ebp::d),
               a("temperature", ebp::e),
               a("vegetation", ebp::f),
               a("continents", ebp::g),
               a("erosion", ebp::h),
               a("depth", ebp::i),
               a("ridges", ebp::j),
               a("initial_density_without_jaggedness", ebp::k),
               a("final_density", ebp::l),
               a("vein_toggle", ebp::m),
               a("vein_ridged", ebp::n),
               a("vein_gap", ebp::o)
            )
            .apply($$0, ebp::new)
   );

   private static RecordCodecBuilder<ebp, ebc> a(String $$0, Function<ebp, ebc> $$1) {
      return ebc.d.fieldOf($$0).forGetter($$1);
   }

   public ebp a(ebc.f $$0) {
      return new ebp(
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

   public ebc a() {
      return this.b;
   }

   public ebc b() {
      return this.c;
   }

   public ebc c() {
      return this.d;
   }

   public ebc d() {
      return this.e;
   }

   public ebc e() {
      return this.f;
   }

   public ebc f() {
      return this.g;
   }

   public ebc g() {
      return this.h;
   }

   public ebc h() {
      return this.i;
   }

   public ebc i() {
      return this.j;
   }

   public ebc j() {
      return this.k;
   }

   public ebc k() {
      return this.l;
   }

   public ebc l() {
      return this.m;
   }

   public ebc m() {
      return this.n;
   }

   public ebc n() {
      return this.o;
   }

   public ebc o() {
      return this.p;
   }
}
