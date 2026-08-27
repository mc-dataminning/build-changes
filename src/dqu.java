import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Function;

public record dqu(dqh b, dqh c, dqh d, dqh e, dqh f, dqh g, dqh h, dqh i, dqh j, dqh k, dqh l, dqh m, dqh n, dqh o, dqh p) {
   public static final Codec<dqu> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               a("barrier", dqu::a),
               a("fluid_level_floodedness", dqu::b),
               a("fluid_level_spread", dqu::c),
               a("lava", dqu::d),
               a("temperature", dqu::e),
               a("vegetation", dqu::f),
               a("continents", dqu::g),
               a("erosion", dqu::h),
               a("depth", dqu::i),
               a("ridges", dqu::j),
               a("initial_density_without_jaggedness", dqu::k),
               a("final_density", dqu::l),
               a("vein_toggle", dqu::m),
               a("vein_ridged", dqu::n),
               a("vein_gap", dqu::o)
            )
            .apply($$0, dqu::new)
   );

   private static RecordCodecBuilder<dqu, dqh> a(String $$0, Function<dqu, dqh> $$1) {
      return dqh.d.fieldOf($$0).forGetter($$1);
   }

   public dqu a(dqh.f $$0) {
      return new dqu(
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

   public dqh a() {
      return this.b;
   }

   public dqh b() {
      return this.c;
   }

   public dqh c() {
      return this.d;
   }

   public dqh d() {
      return this.e;
   }

   public dqh e() {
      return this.f;
   }

   public dqh f() {
      return this.g;
   }

   public dqh g() {
      return this.h;
   }

   public dqh h() {
      return this.i;
   }

   public dqh i() {
      return this.j;
   }

   public dqh j() {
      return this.k;
   }

   public dqh k() {
      return this.l;
   }

   public dqh l() {
      return this.m;
   }

   public dqh m() {
      return this.n;
   }

   public dqh n() {
      return this.o;
   }

   public dqh o() {
      return this.p;
   }
}
