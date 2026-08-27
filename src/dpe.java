import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Function;

public record dpe(dor b, dor c, dor d, dor e, dor f, dor g, dor h, dor i, dor j, dor k, dor l, dor m, dor n, dor o, dor p) {
   public static final Codec<dpe> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               a("barrier", dpe::a),
               a("fluid_level_floodedness", dpe::b),
               a("fluid_level_spread", dpe::c),
               a("lava", dpe::d),
               a("temperature", dpe::e),
               a("vegetation", dpe::f),
               a("continents", dpe::g),
               a("erosion", dpe::h),
               a("depth", dpe::i),
               a("ridges", dpe::j),
               a("initial_density_without_jaggedness", dpe::k),
               a("final_density", dpe::l),
               a("vein_toggle", dpe::m),
               a("vein_ridged", dpe::n),
               a("vein_gap", dpe::o)
            )
            .apply($$0, dpe::new)
   );

   private static RecordCodecBuilder<dpe, dor> a(String $$0, Function<dpe, dor> $$1) {
      return dor.d.fieldOf($$0).forGetter($$1);
   }

   public dpe a(dor.f $$0) {
      return new dpe(
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

   public dor a() {
      return this.b;
   }

   public dor b() {
      return this.c;
   }

   public dor c() {
      return this.d;
   }

   public dor d() {
      return this.e;
   }

   public dor e() {
      return this.f;
   }

   public dor f() {
      return this.g;
   }

   public dor g() {
      return this.h;
   }

   public dor h() {
      return this.i;
   }

   public dor i() {
      return this.j;
   }

   public dor j() {
      return this.k;
   }

   public dor k() {
      return this.l;
   }

   public dor l() {
      return this.m;
   }

   public dor m() {
      return this.n;
   }

   public dor n() {
      return this.o;
   }

   public dor o() {
      return this.p;
   }
}
