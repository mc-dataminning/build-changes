import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Function;

public record dyc(dxp b, dxp c, dxp d, dxp e, dxp f, dxp g, dxp h, dxp i, dxp j, dxp k, dxp l, dxp m, dxp n, dxp o, dxp p) {
   public static final Codec<dyc> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               a("barrier", dyc::a),
               a("fluid_level_floodedness", dyc::b),
               a("fluid_level_spread", dyc::c),
               a("lava", dyc::d),
               a("temperature", dyc::e),
               a("vegetation", dyc::f),
               a("continents", dyc::g),
               a("erosion", dyc::h),
               a("depth", dyc::i),
               a("ridges", dyc::j),
               a("initial_density_without_jaggedness", dyc::k),
               a("final_density", dyc::l),
               a("vein_toggle", dyc::m),
               a("vein_ridged", dyc::n),
               a("vein_gap", dyc::o)
            )
            .apply($$0, dyc::new)
   );

   private static RecordCodecBuilder<dyc, dxp> a(String $$0, Function<dyc, dxp> $$1) {
      return dxp.d.fieldOf($$0).forGetter($$1);
   }

   public dyc a(dxp.f $$0) {
      return new dyc(
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

   public dxp a() {
      return this.b;
   }

   public dxp b() {
      return this.c;
   }

   public dxp c() {
      return this.d;
   }

   public dxp d() {
      return this.e;
   }

   public dxp e() {
      return this.f;
   }

   public dxp f() {
      return this.g;
   }

   public dxp g() {
      return this.h;
   }

   public dxp h() {
      return this.i;
   }

   public dxp i() {
      return this.j;
   }

   public dxp j() {
      return this.k;
   }

   public dxp k() {
      return this.l;
   }

   public dxp l() {
      return this.m;
   }

   public dxp m() {
      return this.n;
   }

   public dxp n() {
      return this.o;
   }

   public dxp o() {
      return this.p;
   }
}
