import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Function;

public record egt(egg b, egg c, egg d, egg e, egg f, egg g, egg h, egg i, egg j, egg k, egg l, egg m, egg n, egg o, egg p) {
   public static final Codec<egt> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               a("barrier", egt::a),
               a("fluid_level_floodedness", egt::b),
               a("fluid_level_spread", egt::c),
               a("lava", egt::d),
               a("temperature", egt::e),
               a("vegetation", egt::f),
               a("continents", egt::g),
               a("erosion", egt::h),
               a("depth", egt::i),
               a("ridges", egt::j),
               a("initial_density_without_jaggedness", egt::k),
               a("final_density", egt::l),
               a("vein_toggle", egt::m),
               a("vein_ridged", egt::n),
               a("vein_gap", egt::o)
            )
            .apply($$0, egt::new)
   );

   private static RecordCodecBuilder<egt, egg> a(String $$0, Function<egt, egg> $$1) {
      return egg.d.fieldOf($$0).forGetter($$1);
   }

   public egt a(egg.f $$0) {
      return new egt(
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

   public egg a() {
      return this.b;
   }

   public egg b() {
      return this.c;
   }

   public egg c() {
      return this.d;
   }

   public egg d() {
      return this.e;
   }

   public egg e() {
      return this.f;
   }

   public egg f() {
      return this.g;
   }

   public egg g() {
      return this.h;
   }

   public egg h() {
      return this.i;
   }

   public egg i() {
      return this.j;
   }

   public egg j() {
      return this.k;
   }

   public egg k() {
      return this.l;
   }

   public egg l() {
      return this.m;
   }

   public egg m() {
      return this.n;
   }

   public egg n() {
      return this.o;
   }

   public egg o() {
      return this.p;
   }
}
