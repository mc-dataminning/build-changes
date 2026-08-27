import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Function;

public record dux(duk b, duk c, duk d, duk e, duk f, duk g, duk h, duk i, duk j, duk k, duk l, duk m, duk n, duk o, duk p) {
   public static final Codec<dux> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               a("barrier", dux::a),
               a("fluid_level_floodedness", dux::b),
               a("fluid_level_spread", dux::c),
               a("lava", dux::d),
               a("temperature", dux::e),
               a("vegetation", dux::f),
               a("continents", dux::g),
               a("erosion", dux::h),
               a("depth", dux::i),
               a("ridges", dux::j),
               a("initial_density_without_jaggedness", dux::k),
               a("final_density", dux::l),
               a("vein_toggle", dux::m),
               a("vein_ridged", dux::n),
               a("vein_gap", dux::o)
            )
            .apply($$0, dux::new)
   );

   private static RecordCodecBuilder<dux, duk> a(String $$0, Function<dux, duk> $$1) {
      return duk.d.fieldOf($$0).forGetter($$1);
   }

   public dux a(duk.f $$0) {
      return new dux(
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

   public duk a() {
      return this.b;
   }

   public duk b() {
      return this.c;
   }

   public duk c() {
      return this.d;
   }

   public duk d() {
      return this.e;
   }

   public duk e() {
      return this.f;
   }

   public duk f() {
      return this.g;
   }

   public duk g() {
      return this.h;
   }

   public duk h() {
      return this.i;
   }

   public duk i() {
      return this.j;
   }

   public duk j() {
      return this.k;
   }

   public duk k() {
      return this.l;
   }

   public duk l() {
      return this.m;
   }

   public duk m() {
      return this.n;
   }

   public duk n() {
      return this.o;
   }

   public duk o() {
      return this.p;
   }
}
