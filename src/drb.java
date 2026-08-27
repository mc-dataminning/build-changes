import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Function;

public record drb(dqo b, dqo c, dqo d, dqo e, dqo f, dqo g, dqo h, dqo i, dqo j, dqo k, dqo l, dqo m, dqo n, dqo o, dqo p) {
   public static final Codec<drb> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               a("barrier", drb::a),
               a("fluid_level_floodedness", drb::b),
               a("fluid_level_spread", drb::c),
               a("lava", drb::d),
               a("temperature", drb::e),
               a("vegetation", drb::f),
               a("continents", drb::g),
               a("erosion", drb::h),
               a("depth", drb::i),
               a("ridges", drb::j),
               a("initial_density_without_jaggedness", drb::k),
               a("final_density", drb::l),
               a("vein_toggle", drb::m),
               a("vein_ridged", drb::n),
               a("vein_gap", drb::o)
            )
            .apply($$0, drb::new)
   );

   private static RecordCodecBuilder<drb, dqo> a(String $$0, Function<drb, dqo> $$1) {
      return dqo.d.fieldOf($$0).forGetter($$1);
   }

   public drb a(dqo.f $$0) {
      return new drb(
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

   public dqo a() {
      return this.b;
   }

   public dqo b() {
      return this.c;
   }

   public dqo c() {
      return this.d;
   }

   public dqo d() {
      return this.e;
   }

   public dqo e() {
      return this.f;
   }

   public dqo f() {
      return this.g;
   }

   public dqo g() {
      return this.h;
   }

   public dqo h() {
      return this.i;
   }

   public dqo i() {
      return this.j;
   }

   public dqo j() {
      return this.k;
   }

   public dqo k() {
      return this.l;
   }

   public dqo l() {
      return this.m;
   }

   public dqo m() {
      return this.n;
   }

   public dqo n() {
      return this.o;
   }

   public dqo o() {
      return this.p;
   }
}
