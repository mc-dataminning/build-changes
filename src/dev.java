import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dev(lr d, dev.a e, dev.a f, dev.c g, dev.c h, bsb i) implements dei {
   public static final MapCodec<dev> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               lt.bj.fieldOf("particle").forGetter(dev::c),
               dev.a.a.fieldOf("horizontal_position").forGetter(dev::d),
               dev.a.a.fieldOf("vertical_position").forGetter(dev::e),
               dev.c.a.fieldOf("horizontal_velocity").forGetter(dev::f),
               dev.c.a.fieldOf("vertical_velocity").forGetter(dev::g),
               bsb.c.optionalFieldOf("speed", brz.a).forGetter(dev::h)
            )
            .apply($$0, dev::new)
   );

   public static dev.a a(float $$0) {
      return new dev.a(dev.b.a, $$0, 1.0F);
   }

   public static dev.a b() {
      return new dev.a(dev.b.b, 0.0F, 1.0F);
   }

   public static dev.c b(float $$0) {
      return new dev.c($$0, brz.a);
   }

   public static dev.c a(bsb $$0) {
      return new dev.c(0.0F, $$0);
   }

   @Override
   public void a(ard $$0, int $$1, ddq $$2, bva $$3, fbx $$4) {
      azh $$5 = $$3.dX();
      fbx $$6 = $$3.ah();
      float $$7 = $$3.dp();
      float $$8 = $$3.dq();
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
   public MapCodec<dev> a() {
      return a;
   }

   public lr c() {
      return this.d;
   }

   public dev.a d() {
      return this.e;
   }

   public dev.a e() {
      return this.f;
   }

   public dev.c f() {
      return this.g;
   }

   public dev.c g() {
      return this.h;
   }

   public bsb h() {
      return this.i;
   }

   public static record a(dev.b b, float c, float d) {
      public static final MapCodec<dev.a> a = RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     dev.b.c.fieldOf("type").forGetter(dev.a::a),
                     Codec.FLOAT.optionalFieldOf("offset", 0.0F).forGetter(dev.a::b),
                     ayi.o.optionalFieldOf("scale", 1.0F).forGetter(dev.a::c)
                  )
                  .apply($$0, dev.a::new)
         )
         .validate(
            $$0 -> $$0.a() == dev.b.a && $$0.c() != 1.0F
                  ? DataResult.error(() -> "Cannot scale an entity position coordinate source")
                  : DataResult.success($$0)
         );

      public double a(double $$0, double $$1, float $$2, azh $$3) {
         return this.b.a($$0, $$1, $$2 * this.d, $$3) + (double)this.c;
      }

      public dev.b a() {
         return this.b;
      }

      public float b() {
         return this.c;
      }

      public float c() {
         return this.d;
      }
   }

   public static enum b implements azv {
      a("entity_position", ($$0, $$1, $$2, $$3) -> $$0),
      b("in_bounding_box", ($$0, $$1, $$2, $$3) -> $$1 + ($$3.j() - 0.5) * (double)$$2);

      public static final Codec<dev.b> c = azv.a(dev.b::values);
      private final String d;
      private final dev.b.a e;

      private b(final String $$0, final dev.b.a $$1) {
         this.d = $$0;
         this.e = $$1;
      }

      public double a(double $$0, double $$1, float $$2, azh $$3) {
         return this.e.getCoordinate($$0, $$1, $$2, $$3);
      }

      @Override
      public String c() {
         return this.d;
      }

      @FunctionalInterface
      interface a {
         double getCoordinate(double var1, double var3, float var5, azh var6);
      }
   }

   public static record c(float b, bsb c) {
      public static final MapCodec<dev.c> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.FLOAT.optionalFieldOf("movement_scale", 0.0F).forGetter(dev.c::a), bsb.c.optionalFieldOf("base", brz.a).forGetter(dev.c::b))
               .apply($$0, dev.c::new)
      );

      public double a(double $$0, azh $$1) {
         return $$0 * (double)this.b + (double)this.c.a($$1);
      }

      public float a() {
         return this.b;
      }

      public bsb b() {
         return this.c;
      }
   }
}
