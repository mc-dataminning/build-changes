import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Function;

public record dks(dkf b, dkf c, dkf d, dkf e, dkf f, dkf g, dkf h, dkf i, dkf j, dkf k, dkf l, dkf m, dkf n, dkf o, dkf p) {
   public static final Codec<dks> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               a("barrier", dks::a),
               a("fluid_level_floodedness", dks::b),
               a("fluid_level_spread", dks::c),
               a("lava", dks::d),
               a("temperature", dks::e),
               a("vegetation", dks::f),
               a("continents", dks::g),
               a("erosion", dks::h),
               a("depth", dks::i),
               a("ridges", dks::j),
               a("initial_density_without_jaggedness", dks::k),
               a("final_density", dks::l),
               a("vein_toggle", dks::m),
               a("vein_ridged", dks::n),
               a("vein_gap", dks::o)
            )
            .apply($$0, dks::new)
   );

   private static RecordCodecBuilder<dks, dkf> a(String $$0, Function<dks, dkf> $$1) {
      return dkf.d.fieldOf($$0).forGetter($$1);
   }

   public dks a(dkf.f $$0) {
      return new dks(
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

   public dkf a() {
      return this.b;
   }

   public dkf b() {
      return this.c;
   }

   public dkf c() {
      return this.d;
   }

   public dkf d() {
      return this.e;
   }

   public dkf e() {
      return this.f;
   }

   public dkf f() {
      return this.g;
   }

   public dkf g() {
      return this.h;
   }

   public dkf h() {
      return this.i;
   }

   public dkf i() {
      return this.j;
   }

   public dkf j() {
      return this.k;
   }

   public dkf k() {
      return this.l;
   }

   public dkf l() {
      return this.m;
   }

   public dkf m() {
      return this.n;
   }

   public dkf n() {
      return this.o;
   }

   public dkf o() {
      return this.p;
   }
}
