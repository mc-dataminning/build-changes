import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Function;

public record doe(dnr b, dnr c, dnr d, dnr e, dnr f, dnr g, dnr h, dnr i, dnr j, dnr k, dnr l, dnr m, dnr n, dnr o, dnr p) {
   public static final Codec<doe> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               a("barrier", doe::a),
               a("fluid_level_floodedness", doe::b),
               a("fluid_level_spread", doe::c),
               a("lava", doe::d),
               a("temperature", doe::e),
               a("vegetation", doe::f),
               a("continents", doe::g),
               a("erosion", doe::h),
               a("depth", doe::i),
               a("ridges", doe::j),
               a("initial_density_without_jaggedness", doe::k),
               a("final_density", doe::l),
               a("vein_toggle", doe::m),
               a("vein_ridged", doe::n),
               a("vein_gap", doe::o)
            )
            .apply($$0, doe::new)
   );

   private static RecordCodecBuilder<doe, dnr> a(String $$0, Function<doe, dnr> $$1) {
      return dnr.d.fieldOf($$0).forGetter($$1);
   }

   public doe a(dnr.f $$0) {
      return new doe(
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

   public dnr a() {
      return this.b;
   }

   public dnr b() {
      return this.c;
   }

   public dnr c() {
      return this.d;
   }

   public dnr d() {
      return this.e;
   }

   public dnr e() {
      return this.f;
   }

   public dnr f() {
      return this.g;
   }

   public dnr g() {
      return this.h;
   }

   public dnr h() {
      return this.i;
   }

   public dnr i() {
      return this.j;
   }

   public dnr j() {
      return this.k;
   }

   public dnr k() {
      return this.l;
   }

   public dnr l() {
      return this.m;
   }

   public dnr m() {
      return this.n;
   }

   public dnr n() {
      return this.o;
   }

   public dnr o() {
      return this.p;
   }
}
