import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Function;

public record dlq(dld b, dld c, dld d, dld e, dld f, dld g, dld h, dld i, dld j, dld k, dld l, dld m, dld n, dld o, dld p) {
   public static final Codec<dlq> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               a("barrier", dlq::a),
               a("fluid_level_floodedness", dlq::b),
               a("fluid_level_spread", dlq::c),
               a("lava", dlq::d),
               a("temperature", dlq::e),
               a("vegetation", dlq::f),
               a("continents", dlq::g),
               a("erosion", dlq::h),
               a("depth", dlq::i),
               a("ridges", dlq::j),
               a("initial_density_without_jaggedness", dlq::k),
               a("final_density", dlq::l),
               a("vein_toggle", dlq::m),
               a("vein_ridged", dlq::n),
               a("vein_gap", dlq::o)
            )
            .apply($$0, dlq::new)
   );

   private static RecordCodecBuilder<dlq, dld> a(String $$0, Function<dlq, dld> $$1) {
      return dld.d.fieldOf($$0).forGetter($$1);
   }

   public dlq a(dld.f $$0) {
      return new dlq(
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

   public dld a() {
      return this.b;
   }

   public dld b() {
      return this.c;
   }

   public dld c() {
      return this.d;
   }

   public dld d() {
      return this.e;
   }

   public dld e() {
      return this.f;
   }

   public dld f() {
      return this.g;
   }

   public dld g() {
      return this.h;
   }

   public dld h() {
      return this.i;
   }

   public dld i() {
      return this.j;
   }

   public dld j() {
      return this.k;
   }

   public dld k() {
      return this.l;
   }

   public dld l() {
      return this.m;
   }

   public dld m() {
      return this.n;
   }

   public dld n() {
      return this.o;
   }

   public dld o() {
      return this.p;
   }
}
