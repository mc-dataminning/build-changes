import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Function;

public record dvg(dut b, dut c, dut d, dut e, dut f, dut g, dut h, dut i, dut j, dut k, dut l, dut m, dut n, dut o, dut p) {
   public static final Codec<dvg> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               a("barrier", dvg::a),
               a("fluid_level_floodedness", dvg::b),
               a("fluid_level_spread", dvg::c),
               a("lava", dvg::d),
               a("temperature", dvg::e),
               a("vegetation", dvg::f),
               a("continents", dvg::g),
               a("erosion", dvg::h),
               a("depth", dvg::i),
               a("ridges", dvg::j),
               a("initial_density_without_jaggedness", dvg::k),
               a("final_density", dvg::l),
               a("vein_toggle", dvg::m),
               a("vein_ridged", dvg::n),
               a("vein_gap", dvg::o)
            )
            .apply($$0, dvg::new)
   );

   private static RecordCodecBuilder<dvg, dut> a(String $$0, Function<dvg, dut> $$1) {
      return dut.d.fieldOf($$0).forGetter($$1);
   }

   public dvg a(dut.f $$0) {
      return new dvg(
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

   public dut a() {
      return this.b;
   }

   public dut b() {
      return this.c;
   }

   public dut c() {
      return this.d;
   }

   public dut d() {
      return this.e;
   }

   public dut e() {
      return this.f;
   }

   public dut f() {
      return this.g;
   }

   public dut g() {
      return this.h;
   }

   public dut h() {
      return this.i;
   }

   public dut i() {
      return this.j;
   }

   public dut j() {
      return this.k;
   }

   public dut k() {
      return this.l;
   }

   public dut l() {
      return this.m;
   }

   public dut m() {
      return this.n;
   }

   public dut n() {
      return this.o;
   }

   public dut o() {
      return this.p;
   }
}
