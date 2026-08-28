import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Function;

public record eer(eee b, eee c, eee d, eee e, eee f, eee g, eee h, eee i, eee j, eee k, eee l, eee m, eee n, eee o, eee p) {
   public static final Codec<eer> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               a("barrier", eer::a),
               a("fluid_level_floodedness", eer::b),
               a("fluid_level_spread", eer::c),
               a("lava", eer::d),
               a("temperature", eer::e),
               a("vegetation", eer::f),
               a("continents", eer::g),
               a("erosion", eer::h),
               a("depth", eer::i),
               a("ridges", eer::j),
               a("initial_density_without_jaggedness", eer::k),
               a("final_density", eer::l),
               a("vein_toggle", eer::m),
               a("vein_ridged", eer::n),
               a("vein_gap", eer::o)
            )
            .apply($$0, eer::new)
   );

   private static RecordCodecBuilder<eer, eee> a(String $$0, Function<eer, eee> $$1) {
      return eee.d.fieldOf($$0).forGetter($$1);
   }

   public eer a(eee.f $$0) {
      return new eer(
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

   public eee a() {
      return this.b;
   }

   public eee b() {
      return this.c;
   }

   public eee c() {
      return this.d;
   }

   public eee d() {
      return this.e;
   }

   public eee e() {
      return this.f;
   }

   public eee f() {
      return this.g;
   }

   public eee g() {
      return this.h;
   }

   public eee h() {
      return this.i;
   }

   public eee i() {
      return this.j;
   }

   public eee j() {
      return this.k;
   }

   public eee k() {
      return this.l;
   }

   public eee l() {
      return this.m;
   }

   public eee m() {
      return this.n;
   }

   public eee n() {
      return this.o;
   }

   public eee o() {
      return this.p;
   }
}
