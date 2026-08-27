import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Function;

public record dkn(dka b, dka c, dka d, dka e, dka f, dka g, dka h, dka i, dka j, dka k, dka l, dka m, dka n, dka o, dka p) {
   public static final Codec<dkn> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               a("barrier", dkn::a),
               a("fluid_level_floodedness", dkn::b),
               a("fluid_level_spread", dkn::c),
               a("lava", dkn::d),
               a("temperature", dkn::e),
               a("vegetation", dkn::f),
               a("continents", dkn::g),
               a("erosion", dkn::h),
               a("depth", dkn::i),
               a("ridges", dkn::j),
               a("initial_density_without_jaggedness", dkn::k),
               a("final_density", dkn::l),
               a("vein_toggle", dkn::m),
               a("vein_ridged", dkn::n),
               a("vein_gap", dkn::o)
            )
            .apply($$0, dkn::new)
   );

   private static RecordCodecBuilder<dkn, dka> a(String $$0, Function<dkn, dka> $$1) {
      return dka.d.fieldOf($$0).forGetter($$1);
   }

   public dkn a(dka.f $$0) {
      return new dkn(
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

   public dka a() {
      return this.b;
   }

   public dka b() {
      return this.c;
   }

   public dka c() {
      return this.d;
   }

   public dka d() {
      return this.e;
   }

   public dka e() {
      return this.f;
   }

   public dka f() {
      return this.g;
   }

   public dka g() {
      return this.h;
   }

   public dka h() {
      return this.i;
   }

   public dka i() {
      return this.j;
   }

   public dka j() {
      return this.k;
   }

   public dka k() {
      return this.l;
   }

   public dka l() {
      return this.m;
   }

   public dka m() {
      return this.n;
   }

   public dka n() {
      return this.o;
   }

   public dka o() {
      return this.p;
   }
}
