import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Function;

public record dsu(dsh b, dsh c, dsh d, dsh e, dsh f, dsh g, dsh h, dsh i, dsh j, dsh k, dsh l, dsh m, dsh n, dsh o, dsh p) {
   public static final Codec<dsu> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               a("barrier", dsu::a),
               a("fluid_level_floodedness", dsu::b),
               a("fluid_level_spread", dsu::c),
               a("lava", dsu::d),
               a("temperature", dsu::e),
               a("vegetation", dsu::f),
               a("continents", dsu::g),
               a("erosion", dsu::h),
               a("depth", dsu::i),
               a("ridges", dsu::j),
               a("initial_density_without_jaggedness", dsu::k),
               a("final_density", dsu::l),
               a("vein_toggle", dsu::m),
               a("vein_ridged", dsu::n),
               a("vein_gap", dsu::o)
            )
            .apply($$0, dsu::new)
   );

   private static RecordCodecBuilder<dsu, dsh> a(String $$0, Function<dsu, dsh> $$1) {
      return dsh.d.fieldOf($$0).forGetter($$1);
   }

   public dsu a(dsh.f $$0) {
      return new dsu(
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

   public dsh a() {
      return this.b;
   }

   public dsh b() {
      return this.c;
   }

   public dsh c() {
      return this.d;
   }

   public dsh d() {
      return this.e;
   }

   public dsh e() {
      return this.f;
   }

   public dsh f() {
      return this.g;
   }

   public dsh g() {
      return this.h;
   }

   public dsh h() {
      return this.i;
   }

   public dsh i() {
      return this.j;
   }

   public dsh j() {
      return this.k;
   }

   public dsh k() {
      return this.l;
   }

   public dsh l() {
      return this.m;
   }

   public dsh m() {
      return this.n;
   }

   public dsh n() {
      return this.o;
   }

   public dsh o() {
      return this.p;
   }
}
