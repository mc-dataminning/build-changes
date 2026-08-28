import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Function;

public record ecz(ecm b, ecm c, ecm d, ecm e, ecm f, ecm g, ecm h, ecm i, ecm j, ecm k, ecm l, ecm m, ecm n, ecm o, ecm p) {
   public static final Codec<ecz> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               a("barrier", ecz::a),
               a("fluid_level_floodedness", ecz::b),
               a("fluid_level_spread", ecz::c),
               a("lava", ecz::d),
               a("temperature", ecz::e),
               a("vegetation", ecz::f),
               a("continents", ecz::g),
               a("erosion", ecz::h),
               a("depth", ecz::i),
               a("ridges", ecz::j),
               a("initial_density_without_jaggedness", ecz::k),
               a("final_density", ecz::l),
               a("vein_toggle", ecz::m),
               a("vein_ridged", ecz::n),
               a("vein_gap", ecz::o)
            )
            .apply($$0, ecz::new)
   );

   private static RecordCodecBuilder<ecz, ecm> a(String $$0, Function<ecz, ecm> $$1) {
      return ecm.d.fieldOf($$0).forGetter($$1);
   }

   public ecz a(ecm.f $$0) {
      return new ecz(
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

   public ecm a() {
      return this.b;
   }

   public ecm b() {
      return this.c;
   }

   public ecm c() {
      return this.d;
   }

   public ecm d() {
      return this.e;
   }

   public ecm e() {
      return this.f;
   }

   public ecm f() {
      return this.g;
   }

   public ecm g() {
      return this.h;
   }

   public ecm h() {
      return this.i;
   }

   public ecm i() {
      return this.j;
   }

   public ecm j() {
      return this.k;
   }

   public ecm k() {
      return this.l;
   }

   public ecm l() {
      return this.m;
   }

   public ecm m() {
      return this.n;
   }

   public ecm n() {
      return this.o;
   }

   public ecm o() {
      return this.p;
   }
}
