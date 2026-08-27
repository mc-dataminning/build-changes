import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Function;

public record dkt(dkg b, dkg c, dkg d, dkg e, dkg f, dkg g, dkg h, dkg i, dkg j, dkg k, dkg l, dkg m, dkg n, dkg o, dkg p) {
   public static final Codec<dkt> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               a("barrier", dkt::a),
               a("fluid_level_floodedness", dkt::b),
               a("fluid_level_spread", dkt::c),
               a("lava", dkt::d),
               a("temperature", dkt::e),
               a("vegetation", dkt::f),
               a("continents", dkt::g),
               a("erosion", dkt::h),
               a("depth", dkt::i),
               a("ridges", dkt::j),
               a("initial_density_without_jaggedness", dkt::k),
               a("final_density", dkt::l),
               a("vein_toggle", dkt::m),
               a("vein_ridged", dkt::n),
               a("vein_gap", dkt::o)
            )
            .apply($$0, dkt::new)
   );

   private static RecordCodecBuilder<dkt, dkg> a(String $$0, Function<dkt, dkg> $$1) {
      return dkg.d.fieldOf($$0).forGetter($$1);
   }

   public dkt a(dkg.f $$0) {
      return new dkt(
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

   public dkg a() {
      return this.b;
   }

   public dkg b() {
      return this.c;
   }

   public dkg c() {
      return this.d;
   }

   public dkg d() {
      return this.e;
   }

   public dkg e() {
      return this.f;
   }

   public dkg f() {
      return this.g;
   }

   public dkg g() {
      return this.h;
   }

   public dkg h() {
      return this.i;
   }

   public dkg i() {
      return this.j;
   }

   public dkg j() {
      return this.k;
   }

   public dkg k() {
      return this.l;
   }

   public dkg l() {
      return this.m;
   }

   public dkg m() {
      return this.n;
   }

   public dkg n() {
      return this.o;
   }

   public dkg o() {
      return this.p;
   }
}
