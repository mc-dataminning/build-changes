import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Function;

public record dss(dsf b, dsf c, dsf d, dsf e, dsf f, dsf g, dsf h, dsf i, dsf j, dsf k, dsf l, dsf m, dsf n, dsf o, dsf p) {
   public static final Codec<dss> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               a("barrier", dss::a),
               a("fluid_level_floodedness", dss::b),
               a("fluid_level_spread", dss::c),
               a("lava", dss::d),
               a("temperature", dss::e),
               a("vegetation", dss::f),
               a("continents", dss::g),
               a("erosion", dss::h),
               a("depth", dss::i),
               a("ridges", dss::j),
               a("initial_density_without_jaggedness", dss::k),
               a("final_density", dss::l),
               a("vein_toggle", dss::m),
               a("vein_ridged", dss::n),
               a("vein_gap", dss::o)
            )
            .apply($$0, dss::new)
   );

   private static RecordCodecBuilder<dss, dsf> a(String $$0, Function<dss, dsf> $$1) {
      return dsf.d.fieldOf($$0).forGetter($$1);
   }

   public dss a(dsf.f $$0) {
      return new dss(
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

   public dsf a() {
      return this.b;
   }

   public dsf b() {
      return this.c;
   }

   public dsf c() {
      return this.d;
   }

   public dsf d() {
      return this.e;
   }

   public dsf e() {
      return this.f;
   }

   public dsf f() {
      return this.g;
   }

   public dsf g() {
      return this.h;
   }

   public dsf h() {
      return this.i;
   }

   public dsf i() {
      return this.j;
   }

   public dsf j() {
      return this.k;
   }

   public dsf k() {
      return this.l;
   }

   public dsf l() {
      return this.m;
   }

   public dsf m() {
      return this.n;
   }

   public dsf n() {
      return this.o;
   }

   public dsf o() {
      return this.p;
   }
}
