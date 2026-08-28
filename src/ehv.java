import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Function;

public record ehv(ehi b, ehi c, ehi d, ehi e, ehi f, ehi g, ehi h, ehi i, ehi j, ehi k, ehi l, ehi m, ehi n, ehi o, ehi p) {
   public static final Codec<ehv> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               a("barrier", ehv::a),
               a("fluid_level_floodedness", ehv::b),
               a("fluid_level_spread", ehv::c),
               a("lava", ehv::d),
               a("temperature", ehv::e),
               a("vegetation", ehv::f),
               a("continents", ehv::g),
               a("erosion", ehv::h),
               a("depth", ehv::i),
               a("ridges", ehv::j),
               a("initial_density_without_jaggedness", ehv::k),
               a("final_density", ehv::l),
               a("vein_toggle", ehv::m),
               a("vein_ridged", ehv::n),
               a("vein_gap", ehv::o)
            )
            .apply($$0, ehv::new)
   );

   private static RecordCodecBuilder<ehv, ehi> a(String $$0, Function<ehv, ehi> $$1) {
      return ehi.d.fieldOf($$0).forGetter($$1);
   }

   public ehv a(ehi.f $$0) {
      return new ehv(
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

   public ehi a() {
      return this.b;
   }

   public ehi b() {
      return this.c;
   }

   public ehi c() {
      return this.d;
   }

   public ehi d() {
      return this.e;
   }

   public ehi e() {
      return this.f;
   }

   public ehi f() {
      return this.g;
   }

   public ehi g() {
      return this.h;
   }

   public ehi h() {
      return this.i;
   }

   public ehi i() {
      return this.j;
   }

   public ehi j() {
      return this.k;
   }

   public ehi k() {
      return this.l;
   }

   public ehi l() {
      return this.m;
   }

   public ehi m() {
      return this.n;
   }

   public ehi n() {
      return this.o;
   }

   public ehi o() {
      return this.p;
   }
}
