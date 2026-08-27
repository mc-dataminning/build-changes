import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Function;

public record dhq(dhd b, dhd c, dhd d, dhd e, dhd f, dhd g, dhd h, dhd i, dhd j, dhd k, dhd l, dhd m, dhd n, dhd o, dhd p) {
   public static final Codec<dhq> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               a("barrier", dhq::a),
               a("fluid_level_floodedness", dhq::b),
               a("fluid_level_spread", dhq::c),
               a("lava", dhq::d),
               a("temperature", dhq::e),
               a("vegetation", dhq::f),
               a("continents", dhq::g),
               a("erosion", dhq::h),
               a("depth", dhq::i),
               a("ridges", dhq::j),
               a("initial_density_without_jaggedness", dhq::k),
               a("final_density", dhq::l),
               a("vein_toggle", dhq::m),
               a("vein_ridged", dhq::n),
               a("vein_gap", dhq::o)
            )
            .apply($$0, dhq::new)
   );

   private static RecordCodecBuilder<dhq, dhd> a(String $$0, Function<dhq, dhd> $$1) {
      return dhd.d.fieldOf($$0).forGetter($$1);
   }

   public dhq a(dhd.f $$0) {
      return new dhq(
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

   public dhd a() {
      return this.b;
   }

   public dhd b() {
      return this.c;
   }

   public dhd c() {
      return this.d;
   }

   public dhd d() {
      return this.e;
   }

   public dhd e() {
      return this.f;
   }

   public dhd f() {
      return this.g;
   }

   public dhd g() {
      return this.h;
   }

   public dhd h() {
      return this.i;
   }

   public dhd i() {
      return this.j;
   }

   public dhd j() {
      return this.k;
   }

   public dhd k() {
      return this.l;
   }

   public dhd l() {
      return this.m;
   }

   public dhd m() {
      return this.n;
   }

   public dhd n() {
      return this.o;
   }

   public dhd o() {
      return this.p;
   }
}
