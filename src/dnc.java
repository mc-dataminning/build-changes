import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Function;

public record dnc(dmp b, dmp c, dmp d, dmp e, dmp f, dmp g, dmp h, dmp i, dmp j, dmp k, dmp l, dmp m, dmp n, dmp o, dmp p) {
   public static final Codec<dnc> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               a("barrier", dnc::a),
               a("fluid_level_floodedness", dnc::b),
               a("fluid_level_spread", dnc::c),
               a("lava", dnc::d),
               a("temperature", dnc::e),
               a("vegetation", dnc::f),
               a("continents", dnc::g),
               a("erosion", dnc::h),
               a("depth", dnc::i),
               a("ridges", dnc::j),
               a("initial_density_without_jaggedness", dnc::k),
               a("final_density", dnc::l),
               a("vein_toggle", dnc::m),
               a("vein_ridged", dnc::n),
               a("vein_gap", dnc::o)
            )
            .apply($$0, dnc::new)
   );

   private static RecordCodecBuilder<dnc, dmp> a(String $$0, Function<dnc, dmp> $$1) {
      return dmp.d.fieldOf($$0).forGetter($$1);
   }

   public dnc a(dmp.f $$0) {
      return new dnc(
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

   public dmp a() {
      return this.b;
   }

   public dmp b() {
      return this.c;
   }

   public dmp c() {
      return this.d;
   }

   public dmp d() {
      return this.e;
   }

   public dmp e() {
      return this.f;
   }

   public dmp f() {
      return this.g;
   }

   public dmp g() {
      return this.h;
   }

   public dmp h() {
      return this.i;
   }

   public dmp i() {
      return this.j;
   }

   public dmp j() {
      return this.k;
   }

   public dmp k() {
      return this.l;
   }

   public dmp l() {
      return this.m;
   }

   public dmp m() {
      return this.n;
   }

   public dmp n() {
      return this.o;
   }

   public dmp o() {
      return this.p;
   }
}
