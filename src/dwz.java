import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Function;

public record dwz(dwm b, dwm c, dwm d, dwm e, dwm f, dwm g, dwm h, dwm i, dwm j, dwm k, dwm l, dwm m, dwm n, dwm o, dwm p) {
   public static final Codec<dwz> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               a("barrier", dwz::a),
               a("fluid_level_floodedness", dwz::b),
               a("fluid_level_spread", dwz::c),
               a("lava", dwz::d),
               a("temperature", dwz::e),
               a("vegetation", dwz::f),
               a("continents", dwz::g),
               a("erosion", dwz::h),
               a("depth", dwz::i),
               a("ridges", dwz::j),
               a("initial_density_without_jaggedness", dwz::k),
               a("final_density", dwz::l),
               a("vein_toggle", dwz::m),
               a("vein_ridged", dwz::n),
               a("vein_gap", dwz::o)
            )
            .apply($$0, dwz::new)
   );

   private static RecordCodecBuilder<dwz, dwm> a(String $$0, Function<dwz, dwm> $$1) {
      return dwm.d.fieldOf($$0).forGetter($$1);
   }

   public dwz a(dwm.f $$0) {
      return new dwz(
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

   public dwm a() {
      return this.b;
   }

   public dwm b() {
      return this.c;
   }

   public dwm c() {
      return this.d;
   }

   public dwm d() {
      return this.e;
   }

   public dwm e() {
      return this.f;
   }

   public dwm f() {
      return this.g;
   }

   public dwm g() {
      return this.h;
   }

   public dwm h() {
      return this.i;
   }

   public dwm i() {
      return this.j;
   }

   public dwm j() {
      return this.k;
   }

   public dwm k() {
      return this.l;
   }

   public dwm l() {
      return this.m;
   }

   public dwm m() {
      return this.n;
   }

   public dwm n() {
      return this.o;
   }

   public dwm o() {
      return this.p;
   }
}
