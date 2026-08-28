import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Function;

public record egm(efz b, efz c, efz d, efz e, efz f, efz g, efz h, efz i, efz j, efz k, efz l, efz m, efz n, efz o, efz p) {
   public static final Codec<egm> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               a("barrier", egm::a),
               a("fluid_level_floodedness", egm::b),
               a("fluid_level_spread", egm::c),
               a("lava", egm::d),
               a("temperature", egm::e),
               a("vegetation", egm::f),
               a("continents", egm::g),
               a("erosion", egm::h),
               a("depth", egm::i),
               a("ridges", egm::j),
               a("initial_density_without_jaggedness", egm::k),
               a("final_density", egm::l),
               a("vein_toggle", egm::m),
               a("vein_ridged", egm::n),
               a("vein_gap", egm::o)
            )
            .apply($$0, egm::new)
   );

   private static RecordCodecBuilder<egm, efz> a(String $$0, Function<egm, efz> $$1) {
      return efz.d.fieldOf($$0).forGetter($$1);
   }

   public egm a(efz.f $$0) {
      return new egm(
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

   public efz a() {
      return this.b;
   }

   public efz b() {
      return this.c;
   }

   public efz c() {
      return this.d;
   }

   public efz d() {
      return this.e;
   }

   public efz e() {
      return this.f;
   }

   public efz f() {
      return this.g;
   }

   public efz g() {
      return this.h;
   }

   public efz h() {
      return this.i;
   }

   public efz i() {
      return this.j;
   }

   public efz j() {
      return this.k;
   }

   public efz k() {
      return this.l;
   }

   public efz l() {
      return this.m;
   }

   public efz m() {
      return this.n;
   }

   public efz n() {
      return this.o;
   }

   public efz o() {
      return this.p;
   }
}
