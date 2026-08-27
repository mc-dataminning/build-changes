import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Function;

public record drw(drj b, drj c, drj d, drj e, drj f, drj g, drj h, drj i, drj j, drj k, drj l, drj m, drj n, drj o, drj p) {
   public static final Codec<drw> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               a("barrier", drw::a),
               a("fluid_level_floodedness", drw::b),
               a("fluid_level_spread", drw::c),
               a("lava", drw::d),
               a("temperature", drw::e),
               a("vegetation", drw::f),
               a("continents", drw::g),
               a("erosion", drw::h),
               a("depth", drw::i),
               a("ridges", drw::j),
               a("initial_density_without_jaggedness", drw::k),
               a("final_density", drw::l),
               a("vein_toggle", drw::m),
               a("vein_ridged", drw::n),
               a("vein_gap", drw::o)
            )
            .apply($$0, drw::new)
   );

   private static RecordCodecBuilder<drw, drj> a(String $$0, Function<drw, drj> $$1) {
      return drj.d.fieldOf($$0).forGetter($$1);
   }

   public drw a(drj.f $$0) {
      return new drw(
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

   public drj a() {
      return this.b;
   }

   public drj b() {
      return this.c;
   }

   public drj c() {
      return this.d;
   }

   public drj d() {
      return this.e;
   }

   public drj e() {
      return this.f;
   }

   public drj f() {
      return this.g;
   }

   public drj g() {
      return this.h;
   }

   public drj h() {
      return this.i;
   }

   public drj i() {
      return this.j;
   }

   public drj j() {
      return this.k;
   }

   public drj k() {
      return this.l;
   }

   public drj l() {
      return this.m;
   }

   public drj m() {
      return this.n;
   }

   public drj n() {
      return this.o;
   }

   public drj o() {
      return this.p;
   }
}
