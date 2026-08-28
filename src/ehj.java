import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Function;

public record ehj(egw b, egw c, egw d, egw e, egw f, egw g, egw h, egw i, egw j, egw k, egw l, egw m, egw n, egw o, egw p) {
   public static final Codec<ehj> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               a("barrier", ehj::a),
               a("fluid_level_floodedness", ehj::b),
               a("fluid_level_spread", ehj::c),
               a("lava", ehj::d),
               a("temperature", ehj::e),
               a("vegetation", ehj::f),
               a("continents", ehj::g),
               a("erosion", ehj::h),
               a("depth", ehj::i),
               a("ridges", ehj::j),
               a("initial_density_without_jaggedness", ehj::k),
               a("final_density", ehj::l),
               a("vein_toggle", ehj::m),
               a("vein_ridged", ehj::n),
               a("vein_gap", ehj::o)
            )
            .apply($$0, ehj::new)
   );

   private static RecordCodecBuilder<ehj, egw> a(String $$0, Function<ehj, egw> $$1) {
      return egw.d.fieldOf($$0).forGetter($$1);
   }

   public ehj a(egw.f $$0) {
      return new ehj(
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

   public egw a() {
      return this.b;
   }

   public egw b() {
      return this.c;
   }

   public egw c() {
      return this.d;
   }

   public egw d() {
      return this.e;
   }

   public egw e() {
      return this.f;
   }

   public egw f() {
      return this.g;
   }

   public egw g() {
      return this.h;
   }

   public egw h() {
      return this.i;
   }

   public egw i() {
      return this.j;
   }

   public egw j() {
      return this.k;
   }

   public egw k() {
      return this.l;
   }

   public egw l() {
      return this.m;
   }

   public egw m() {
      return this.n;
   }

   public egw n() {
      return this.o;
   }

   public egw o() {
      return this.p;
   }
}
