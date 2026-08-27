import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Function;

public record dza(dyn b, dyn c, dyn d, dyn e, dyn f, dyn g, dyn h, dyn i, dyn j, dyn k, dyn l, dyn m, dyn n, dyn o, dyn p) {
   public static final Codec<dza> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               a("barrier", dza::a),
               a("fluid_level_floodedness", dza::b),
               a("fluid_level_spread", dza::c),
               a("lava", dza::d),
               a("temperature", dza::e),
               a("vegetation", dza::f),
               a("continents", dza::g),
               a("erosion", dza::h),
               a("depth", dza::i),
               a("ridges", dza::j),
               a("initial_density_without_jaggedness", dza::k),
               a("final_density", dza::l),
               a("vein_toggle", dza::m),
               a("vein_ridged", dza::n),
               a("vein_gap", dza::o)
            )
            .apply($$0, dza::new)
   );

   private static RecordCodecBuilder<dza, dyn> a(String $$0, Function<dza, dyn> $$1) {
      return dyn.d.fieldOf($$0).forGetter($$1);
   }

   public dza a(dyn.f $$0) {
      return new dza(
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

   public dyn a() {
      return this.b;
   }

   public dyn b() {
      return this.c;
   }

   public dyn c() {
      return this.d;
   }

   public dyn d() {
      return this.e;
   }

   public dyn e() {
      return this.f;
   }

   public dyn f() {
      return this.g;
   }

   public dyn g() {
      return this.h;
   }

   public dyn h() {
      return this.i;
   }

   public dyn i() {
      return this.j;
   }

   public dyn j() {
      return this.k;
   }

   public dyn k() {
      return this.l;
   }

   public dyn l() {
      return this.m;
   }

   public dyn m() {
      return this.n;
   }

   public dyn n() {
      return this.o;
   }

   public dyn o() {
      return this.p;
   }
}
