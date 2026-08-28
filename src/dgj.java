import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dgj(lv d, dgj.a e, dgj.a f, dgj.c g, dgj.c h, btb i) implements dfw {
   public static final MapCodec<dgj> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               lx.bj.fieldOf("particle").forGetter(dgj::c),
               dgj.a.a.fieldOf("horizontal_position").forGetter(dgj::d),
               dgj.a.a.fieldOf("vertical_position").forGetter(dgj::e),
               dgj.c.a.fieldOf("horizontal_velocity").forGetter(dgj::f),
               dgj.c.a.fieldOf("vertical_velocity").forGetter(dgj::g),
               btb.c.optionalFieldOf("speed", bsz.a).forGetter(dgj::h)
            )
            .apply($$0, dgj::new)
   );

   public static dgj.a a(float $$0) {
      return new dgj.a(dgj.b.a, $$0, 1.0F);
   }

   public static dgj.a b() {
      return new dgj.a(dgj.b.b, 0.0F, 1.0F);
   }

   public static dgj.c b(float $$0) {
      return new dgj.c($$0, bsz.a);
   }

   public static dgj.c a(btb $$0) {
      return new dgj.c(0.0F, $$0);
   }

   @Override
   public void a(aro $$0, int $$1, dfe $$2, bwa $$3, fdw $$4) {
      azt $$5 = $$3.dY();
      fdw $$6 = $$3.ah();
      float $$7 = $$3.dq();
      float $$8 = $$3.dr();
      $$0.a(
         this.d,
         this.e.a($$4.a(), $$4.a(), $$7, $$5),
         this.f.a($$4.b(), $$4.b() + (double)($$8 / 2.0F), $$8, $$5),
         this.e.a($$4.c(), $$4.c(), $$7, $$5),
         0,
         this.g.a($$6.a(), $$5),
         this.h.a($$6.b(), $$5),
         this.g.a($$6.c(), $$5),
         (double)this.i.a($$5)
      );
   }

   @Override
   public MapCodec<dgj> a() {
      return a;
   }

   public lv c() {
      return this.d;
   }

   public dgj.a d() {
      return this.e;
   }

   public dgj.a e() {
      return this.f;
   }

   public dgj.c f() {
      return this.g;
   }

   public dgj.c g() {
      return this.h;
   }

   public btb h() {
      return this.i;
   }

   public static record a(dgj.b b, float c, float d) {
      public static final MapCodec<dgj.a> a = RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     dgj.b.c.fieldOf("type").forGetter(dgj.a::a),
                     Codec.FLOAT.optionalFieldOf("offset", 0.0F).forGetter(dgj.a::b),
                     ays.o.optionalFieldOf("scale", 1.0F).forGetter(dgj.a::c)
                  )
                  .apply($$0, dgj.a::new)
         )
         .validate(
            $$0 -> $$0.a() == dgj.b.a && $$0.c() != 1.0F
                  ? DataResult.error(() -> "Cannot scale an entity position coordinate source")
                  : DataResult.success($$0)
         );

      public double a(double $$0, double $$1, float $$2, azt $$3) {
         return this.b.a($$0, $$1, $$2 * this.d, $$3) + (double)this.c;
      }

      public dgj.b a() {
         return this.b;
      }

      public float b() {
         return this.c;
      }

      public float c() {
         return this.d;
      }
   }

   public static enum b implements bai {
      a("entity_position", ($$0, $$1, $$2, $$3) -> $$0),
      b("in_bounding_box", ($$0, $$1, $$2, $$3) -> $$1 + ($$3.j() - 0.5) * (double)$$2);

      public static final Codec<dgj.b> c = bai.a(dgj.b::values);
      private final String d;
      private final dgj.b.a e;

      private b(final String $$0, final dgj.b.a $$1) {
         this.d = $$0;
         this.e = $$1;
      }

      public double a(double $$0, double $$1, float $$2, azt $$3) {
         return this.e.getCoordinate($$0, $$1, $$2, $$3);
      }

      @Override
      public String c() {
         return this.d;
      }

      @FunctionalInterface
      interface a {
         double getCoordinate(double var1, double var3, float var5, azt var6);
      }
   }

   public static record c(float b, btb c) {
      public static final MapCodec<dgj.c> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.FLOAT.optionalFieldOf("movement_scale", 0.0F).forGetter(dgj.c::a), btb.c.optionalFieldOf("base", bsz.a).forGetter(dgj.c::b))
               .apply($$0, dgj.c::new)
      );

      public double a(double $$0, azt $$1) {
         return $$0 * (double)this.b + (double)this.c.a($$1);
      }

      public float a() {
         return this.b;
      }

      public btb b() {
         return this.c;
      }
   }
}
