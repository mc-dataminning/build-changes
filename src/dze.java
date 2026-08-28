import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Function;

public record dze(dyr b, dyr c, dyr d, dyr e, dyr f, dyr g, dyr h, dyr i, dyr j, dyr k, dyr l, dyr m, dyr n, dyr o, dyr p) {
   public static final Codec<dze> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               a("barrier", dze::a),
               a("fluid_level_floodedness", dze::b),
               a("fluid_level_spread", dze::c),
               a("lava", dze::d),
               a("temperature", dze::e),
               a("vegetation", dze::f),
               a("continents", dze::g),
               a("erosion", dze::h),
               a("depth", dze::i),
               a("ridges", dze::j),
               a("initial_density_without_jaggedness", dze::k),
               a("final_density", dze::l),
               a("vein_toggle", dze::m),
               a("vein_ridged", dze::n),
               a("vein_gap", dze::o)
            )
            .apply($$0, dze::new)
   );

   private static RecordCodecBuilder<dze, dyr> a(String $$0, Function<dze, dyr> $$1) {
      return dyr.d.fieldOf($$0).forGetter($$1);
   }

   public dze a(dyr.f $$0) {
      return new dze(
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

   public dyr a() {
      return this.b;
   }

   public dyr b() {
      return this.c;
   }

   public dyr c() {
      return this.d;
   }

   public dyr d() {
      return this.e;
   }

   public dyr e() {
      return this.f;
   }

   public dyr f() {
      return this.g;
   }

   public dyr g() {
      return this.h;
   }

   public dyr h() {
      return this.i;
   }

   public dyr i() {
      return this.j;
   }

   public dyr j() {
      return this.k;
   }

   public dyr k() {
      return this.l;
   }

   public dyr l() {
      return this.m;
   }

   public dyr m() {
      return this.n;
   }

   public dyr n() {
      return this.o;
   }

   public dyr o() {
      return this.p;
   }
}
