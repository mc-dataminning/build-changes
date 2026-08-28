import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Function;

public record ehl(egy b, egy c, egy d, egy e, egy f, egy g, egy h, egy i, egy j, egy k, egy l, egy m, egy n, egy o, egy p) {
   public static final Codec<ehl> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               a("barrier", ehl::a),
               a("fluid_level_floodedness", ehl::b),
               a("fluid_level_spread", ehl::c),
               a("lava", ehl::d),
               a("temperature", ehl::e),
               a("vegetation", ehl::f),
               a("continents", ehl::g),
               a("erosion", ehl::h),
               a("depth", ehl::i),
               a("ridges", ehl::j),
               a("initial_density_without_jaggedness", ehl::k),
               a("final_density", ehl::l),
               a("vein_toggle", ehl::m),
               a("vein_ridged", ehl::n),
               a("vein_gap", ehl::o)
            )
            .apply($$0, ehl::new)
   );

   private static RecordCodecBuilder<ehl, egy> a(String $$0, Function<ehl, egy> $$1) {
      return egy.d.fieldOf($$0).forGetter($$1);
   }

   public ehl a(egy.f $$0) {
      return new ehl(
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

   public egy a() {
      return this.b;
   }

   public egy b() {
      return this.c;
   }

   public egy c() {
      return this.d;
   }

   public egy d() {
      return this.e;
   }

   public egy e() {
      return this.f;
   }

   public egy f() {
      return this.g;
   }

   public egy g() {
      return this.h;
   }

   public egy h() {
      return this.i;
   }

   public egy i() {
      return this.j;
   }

   public egy j() {
      return this.k;
   }

   public egy k() {
      return this.l;
   }

   public egy l() {
      return this.m;
   }

   public egy m() {
      return this.n;
   }

   public egy n() {
      return this.o;
   }

   public egy o() {
      return this.p;
   }
}
