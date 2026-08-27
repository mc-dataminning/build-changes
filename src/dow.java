import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Function;

public record dow(doj b, doj c, doj d, doj e, doj f, doj g, doj h, doj i, doj j, doj k, doj l, doj m, doj n, doj o, doj p) {
   public static final Codec<dow> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               a("barrier", dow::a),
               a("fluid_level_floodedness", dow::b),
               a("fluid_level_spread", dow::c),
               a("lava", dow::d),
               a("temperature", dow::e),
               a("vegetation", dow::f),
               a("continents", dow::g),
               a("erosion", dow::h),
               a("depth", dow::i),
               a("ridges", dow::j),
               a("initial_density_without_jaggedness", dow::k),
               a("final_density", dow::l),
               a("vein_toggle", dow::m),
               a("vein_ridged", dow::n),
               a("vein_gap", dow::o)
            )
            .apply($$0, dow::new)
   );

   private static RecordCodecBuilder<dow, doj> a(String $$0, Function<dow, doj> $$1) {
      return doj.d.fieldOf($$0).forGetter($$1);
   }

   public dow a(doj.f $$0) {
      return new dow(
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

   public doj a() {
      return this.b;
   }

   public doj b() {
      return this.c;
   }

   public doj c() {
      return this.d;
   }

   public doj d() {
      return this.e;
   }

   public doj e() {
      return this.f;
   }

   public doj f() {
      return this.g;
   }

   public doj g() {
      return this.h;
   }

   public doj h() {
      return this.i;
   }

   public doj i() {
      return this.j;
   }

   public doj j() {
      return this.k;
   }

   public doj k() {
      return this.l;
   }

   public doj l() {
      return this.m;
   }

   public doj m() {
      return this.n;
   }

   public doj n() {
      return this.o;
   }

   public doj o() {
      return this.p;
   }
}
