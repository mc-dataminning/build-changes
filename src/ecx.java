import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Function;

public record ecx(eck b, eck c, eck d, eck e, eck f, eck g, eck h, eck i, eck j, eck k, eck l, eck m, eck n, eck o, eck p) {
   public static final Codec<ecx> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               a("barrier", ecx::a),
               a("fluid_level_floodedness", ecx::b),
               a("fluid_level_spread", ecx::c),
               a("lava", ecx::d),
               a("temperature", ecx::e),
               a("vegetation", ecx::f),
               a("continents", ecx::g),
               a("erosion", ecx::h),
               a("depth", ecx::i),
               a("ridges", ecx::j),
               a("initial_density_without_jaggedness", ecx::k),
               a("final_density", ecx::l),
               a("vein_toggle", ecx::m),
               a("vein_ridged", ecx::n),
               a("vein_gap", ecx::o)
            )
            .apply($$0, ecx::new)
   );

   private static RecordCodecBuilder<ecx, eck> a(String $$0, Function<ecx, eck> $$1) {
      return eck.d.fieldOf($$0).forGetter($$1);
   }

   public ecx a(eck.f $$0) {
      return new ecx(
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

   public eck a() {
      return this.b;
   }

   public eck b() {
      return this.c;
   }

   public eck c() {
      return this.d;
   }

   public eck d() {
      return this.e;
   }

   public eck e() {
      return this.f;
   }

   public eck f() {
      return this.g;
   }

   public eck g() {
      return this.h;
   }

   public eck h() {
      return this.i;
   }

   public eck i() {
      return this.j;
   }

   public eck j() {
      return this.k;
   }

   public eck k() {
      return this.l;
   }

   public eck l() {
      return this.m;
   }

   public eck m() {
      return this.n;
   }

   public eck n() {
      return this.o;
   }

   public eck o() {
      return this.p;
   }
}
