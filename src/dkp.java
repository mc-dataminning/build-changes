import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Function;

public record dkp(dkc b, dkc c, dkc d, dkc e, dkc f, dkc g, dkc h, dkc i, dkc j, dkc k, dkc l, dkc m, dkc n, dkc o, dkc p) {
   public static final Codec<dkp> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               a("barrier", dkp::a),
               a("fluid_level_floodedness", dkp::b),
               a("fluid_level_spread", dkp::c),
               a("lava", dkp::d),
               a("temperature", dkp::e),
               a("vegetation", dkp::f),
               a("continents", dkp::g),
               a("erosion", dkp::h),
               a("depth", dkp::i),
               a("ridges", dkp::j),
               a("initial_density_without_jaggedness", dkp::k),
               a("final_density", dkp::l),
               a("vein_toggle", dkp::m),
               a("vein_ridged", dkp::n),
               a("vein_gap", dkp::o)
            )
            .apply($$0, dkp::new)
   );

   private static RecordCodecBuilder<dkp, dkc> a(String $$0, Function<dkp, dkc> $$1) {
      return dkc.d.fieldOf($$0).forGetter($$1);
   }

   public dkp a(dkc.f $$0) {
      return new dkp(
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

   public dkc a() {
      return this.b;
   }

   public dkc b() {
      return this.c;
   }

   public dkc c() {
      return this.d;
   }

   public dkc d() {
      return this.e;
   }

   public dkc e() {
      return this.f;
   }

   public dkc f() {
      return this.g;
   }

   public dkc g() {
      return this.h;
   }

   public dkc h() {
      return this.i;
   }

   public dkc i() {
      return this.j;
   }

   public dkc j() {
      return this.k;
   }

   public dkc k() {
      return this.l;
   }

   public dkc l() {
      return this.m;
   }

   public dkc m() {
      return this.n;
   }

   public dkc n() {
      return this.o;
   }

   public dkc o() {
      return this.p;
   }
}
