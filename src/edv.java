import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Function;

public record edv(edi b, edi c, edi d, edi e, edi f, edi g, edi h, edi i, edi j, edi k, edi l, edi m, edi n, edi o, edi p) {
   public static final Codec<edv> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               a("barrier", edv::a),
               a("fluid_level_floodedness", edv::b),
               a("fluid_level_spread", edv::c),
               a("lava", edv::d),
               a("temperature", edv::e),
               a("vegetation", edv::f),
               a("continents", edv::g),
               a("erosion", edv::h),
               a("depth", edv::i),
               a("ridges", edv::j),
               a("initial_density_without_jaggedness", edv::k),
               a("final_density", edv::l),
               a("vein_toggle", edv::m),
               a("vein_ridged", edv::n),
               a("vein_gap", edv::o)
            )
            .apply($$0, edv::new)
   );

   private static RecordCodecBuilder<edv, edi> a(String $$0, Function<edv, edi> $$1) {
      return edi.d.fieldOf($$0).forGetter($$1);
   }

   public edv a(edi.f $$0) {
      return new edv(
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

   public edi a() {
      return this.b;
   }

   public edi b() {
      return this.c;
   }

   public edi c() {
      return this.d;
   }

   public edi d() {
      return this.e;
   }

   public edi e() {
      return this.f;
   }

   public edi f() {
      return this.g;
   }

   public edi g() {
      return this.h;
   }

   public edi h() {
      return this.i;
   }

   public edi i() {
      return this.j;
   }

   public edi j() {
      return this.k;
   }

   public edi k() {
      return this.l;
   }

   public edi l() {
      return this.m;
   }

   public edi m() {
      return this.n;
   }

   public edi n() {
      return this.o;
   }

   public edi o() {
      return this.p;
   }
}
