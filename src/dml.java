import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Function;

public record dml(dly b, dly c, dly d, dly e, dly f, dly g, dly h, dly i, dly j, dly k, dly l, dly m, dly n, dly o, dly p) {
   public static final Codec<dml> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               a("barrier", dml::a),
               a("fluid_level_floodedness", dml::b),
               a("fluid_level_spread", dml::c),
               a("lava", dml::d),
               a("temperature", dml::e),
               a("vegetation", dml::f),
               a("continents", dml::g),
               a("erosion", dml::h),
               a("depth", dml::i),
               a("ridges", dml::j),
               a("initial_density_without_jaggedness", dml::k),
               a("final_density", dml::l),
               a("vein_toggle", dml::m),
               a("vein_ridged", dml::n),
               a("vein_gap", dml::o)
            )
            .apply($$0, dml::new)
   );

   private static RecordCodecBuilder<dml, dly> a(String $$0, Function<dml, dly> $$1) {
      return dly.d.fieldOf($$0).forGetter($$1);
   }

   public dml a(dly.f $$0) {
      return new dml(
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

   public dly a() {
      return this.b;
   }

   public dly b() {
      return this.c;
   }

   public dly c() {
      return this.d;
   }

   public dly d() {
      return this.e;
   }

   public dly e() {
      return this.f;
   }

   public dly f() {
      return this.g;
   }

   public dly g() {
      return this.h;
   }

   public dly h() {
      return this.i;
   }

   public dly i() {
      return this.j;
   }

   public dly j() {
      return this.k;
   }

   public dly k() {
      return this.l;
   }

   public dly l() {
      return this.m;
   }

   public dly m() {
      return this.n;
   }

   public dly n() {
      return this.o;
   }

   public dly o() {
      return this.p;
   }
}
