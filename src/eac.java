import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Function;

public record eac(dzp b, dzp c, dzp d, dzp e, dzp f, dzp g, dzp h, dzp i, dzp j, dzp k, dzp l, dzp m, dzp n, dzp o, dzp p) {
   public static final Codec<eac> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               a("barrier", eac::a),
               a("fluid_level_floodedness", eac::b),
               a("fluid_level_spread", eac::c),
               a("lava", eac::d),
               a("temperature", eac::e),
               a("vegetation", eac::f),
               a("continents", eac::g),
               a("erosion", eac::h),
               a("depth", eac::i),
               a("ridges", eac::j),
               a("initial_density_without_jaggedness", eac::k),
               a("final_density", eac::l),
               a("vein_toggle", eac::m),
               a("vein_ridged", eac::n),
               a("vein_gap", eac::o)
            )
            .apply($$0, eac::new)
   );

   private static RecordCodecBuilder<eac, dzp> a(String $$0, Function<eac, dzp> $$1) {
      return dzp.d.fieldOf($$0).forGetter($$1);
   }

   public eac a(dzp.f $$0) {
      return new eac(
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

   public dzp a() {
      return this.b;
   }

   public dzp b() {
      return this.c;
   }

   public dzp c() {
      return this.d;
   }

   public dzp d() {
      return this.e;
   }

   public dzp e() {
      return this.f;
   }

   public dzp f() {
      return this.g;
   }

   public dzp g() {
      return this.h;
   }

   public dzp h() {
      return this.i;
   }

   public dzp i() {
      return this.j;
   }

   public dzp j() {
      return this.k;
   }

   public dzp k() {
      return this.l;
   }

   public dzp l() {
      return this.m;
   }

   public dzp m() {
      return this.n;
   }

   public dzp n() {
      return this.o;
   }

   public dzp o() {
      return this.p;
   }
}
