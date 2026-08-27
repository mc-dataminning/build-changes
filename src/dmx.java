import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Function;

public record dmx(dmk b, dmk c, dmk d, dmk e, dmk f, dmk g, dmk h, dmk i, dmk j, dmk k, dmk l, dmk m, dmk n, dmk o, dmk p) {
   public static final Codec<dmx> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               a("barrier", dmx::a),
               a("fluid_level_floodedness", dmx::b),
               a("fluid_level_spread", dmx::c),
               a("lava", dmx::d),
               a("temperature", dmx::e),
               a("vegetation", dmx::f),
               a("continents", dmx::g),
               a("erosion", dmx::h),
               a("depth", dmx::i),
               a("ridges", dmx::j),
               a("initial_density_without_jaggedness", dmx::k),
               a("final_density", dmx::l),
               a("vein_toggle", dmx::m),
               a("vein_ridged", dmx::n),
               a("vein_gap", dmx::o)
            )
            .apply($$0, dmx::new)
   );

   private static RecordCodecBuilder<dmx, dmk> a(String $$0, Function<dmx, dmk> $$1) {
      return dmk.d.fieldOf($$0).forGetter($$1);
   }

   public dmx a(dmk.f $$0) {
      return new dmx(
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

   public dmk a() {
      return this.b;
   }

   public dmk b() {
      return this.c;
   }

   public dmk c() {
      return this.d;
   }

   public dmk d() {
      return this.e;
   }

   public dmk e() {
      return this.f;
   }

   public dmk f() {
      return this.g;
   }

   public dmk g() {
      return this.h;
   }

   public dmk h() {
      return this.i;
   }

   public dmk i() {
      return this.j;
   }

   public dmk j() {
      return this.k;
   }

   public dmk k() {
      return this.l;
   }

   public dmk l() {
      return this.m;
   }

   public dmk m() {
      return this.n;
   }

   public dmk n() {
      return this.o;
   }

   public dmk o() {
      return this.p;
   }
}
