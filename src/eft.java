import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Function;

public record eft(efg b, efg c, efg d, efg e, efg f, efg g, efg h, efg i, efg j, efg k, efg l, efg m, efg n, efg o, efg p) {
   public static final Codec<eft> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               a("barrier", eft::a),
               a("fluid_level_floodedness", eft::b),
               a("fluid_level_spread", eft::c),
               a("lava", eft::d),
               a("temperature", eft::e),
               a("vegetation", eft::f),
               a("continents", eft::g),
               a("erosion", eft::h),
               a("depth", eft::i),
               a("ridges", eft::j),
               a("initial_density_without_jaggedness", eft::k),
               a("final_density", eft::l),
               a("vein_toggle", eft::m),
               a("vein_ridged", eft::n),
               a("vein_gap", eft::o)
            )
            .apply($$0, eft::new)
   );

   private static RecordCodecBuilder<eft, efg> a(String $$0, Function<eft, efg> $$1) {
      return efg.d.fieldOf($$0).forGetter($$1);
   }

   public eft a(efg.f $$0) {
      return new eft(
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

   public efg a() {
      return this.b;
   }

   public efg b() {
      return this.c;
   }

   public efg c() {
      return this.d;
   }

   public efg d() {
      return this.e;
   }

   public efg e() {
      return this.f;
   }

   public efg f() {
      return this.g;
   }

   public efg g() {
      return this.h;
   }

   public efg h() {
      return this.i;
   }

   public efg i() {
      return this.j;
   }

   public efg j() {
      return this.k;
   }

   public efg k() {
      return this.l;
   }

   public efg l() {
      return this.m;
   }

   public efg m() {
      return this.n;
   }

   public efg n() {
      return this.o;
   }

   public efg o() {
      return this.p;
   }
}
