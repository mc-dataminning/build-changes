import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Function;

public record dop(doc b, doc c, doc d, doc e, doc f, doc g, doc h, doc i, doc j, doc k, doc l, doc m, doc n, doc o, doc p) {
   public static final Codec<dop> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               a("barrier", dop::a),
               a("fluid_level_floodedness", dop::b),
               a("fluid_level_spread", dop::c),
               a("lava", dop::d),
               a("temperature", dop::e),
               a("vegetation", dop::f),
               a("continents", dop::g),
               a("erosion", dop::h),
               a("depth", dop::i),
               a("ridges", dop::j),
               a("initial_density_without_jaggedness", dop::k),
               a("final_density", dop::l),
               a("vein_toggle", dop::m),
               a("vein_ridged", dop::n),
               a("vein_gap", dop::o)
            )
            .apply($$0, dop::new)
   );

   private static RecordCodecBuilder<dop, doc> a(String $$0, Function<dop, doc> $$1) {
      return doc.d.fieldOf($$0).forGetter($$1);
   }

   public dop a(doc.f $$0) {
      return new dop(
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

   public doc a() {
      return this.b;
   }

   public doc b() {
      return this.c;
   }

   public doc c() {
      return this.d;
   }

   public doc d() {
      return this.e;
   }

   public doc e() {
      return this.f;
   }

   public doc f() {
      return this.g;
   }

   public doc g() {
      return this.h;
   }

   public doc h() {
      return this.i;
   }

   public doc i() {
      return this.j;
   }

   public doc j() {
      return this.k;
   }

   public doc k() {
      return this.l;
   }

   public doc l() {
      return this.m;
   }

   public doc m() {
      return this.n;
   }

   public doc n() {
      return this.o;
   }

   public doc o() {
      return this.p;
   }
}
