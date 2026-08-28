import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dee(lr d, dee.a e, dee.a f, dee.c g, dee.c h, bro i) implements ddr {
   public static final MapCodec<dee> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               lt.bi.fieldOf("particle").forGetter(dee::c),
               dee.a.a.fieldOf("horizontal_position").forGetter(dee::d),
               dee.a.a.fieldOf("vertical_position").forGetter(dee::e),
               dee.c.a.fieldOf("horizontal_velocity").forGetter(dee::f),
               dee.c.a.fieldOf("vertical_velocity").forGetter(dee::g),
               bro.c.optionalFieldOf("speed", brm.a).forGetter(dee::h)
            )
            .apply($$0, dee::new)
   );

   public static dee.a a(float $$0) {
      return new dee.a(dee.b.a, $$0, 1.0F);
   }

   public static dee.a b() {
      return new dee.a(dee.b.b, 0.0F, 1.0F);
   }

   public static dee.c b(float $$0) {
      return new dee.c($$0, brm.a);
   }

   public static dee.c a(bro $$0) {
      return new dee.c(0.0F, $$0);
   }

   @Override
   public void a(ard $$0, int $$1, dcz $$2, bum $$3, fbb $$4) {
      azh $$5 = $$3.dY();
      fbb $$6 = $$3.ah();
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
   public MapCodec<dee> a() {
      return a;
   }

   public lr c() {
      return this.d;
   }

   public dee.a d() {
      return this.e;
   }

   public dee.a e() {
      return this.f;
   }

   public dee.c f() {
      return this.g;
   }

   public dee.c g() {
      return this.h;
   }

   public bro h() {
      return this.i;
   }

   public static record a(dee.b b, float c, float d) {
      public static final MapCodec<dee.a> a = RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     dee.b.c.fieldOf("type").forGetter(dee.a::a),
                     Codec.FLOAT.optionalFieldOf("offset", 0.0F).forGetter(dee.a::b),
                     ayi.o.optionalFieldOf("scale", 1.0F).forGetter(dee.a::c)
                  )
                  .apply($$0, dee.a::new)
         )
         .validate(
            $$0 -> $$0.a() == dee.b.a && $$0.c() != 1.0F
                  ? DataResult.error(() -> "Cannot scale an entity position coordinate source")
                  : DataResult.success($$0)
         );

      public double a(double $$0, double $$1, float $$2, azh $$3) {
         return this.b.a($$0, $$1, $$2 * this.d, $$3) + (double)this.c;
      }

      public dee.b a() {
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

      public static final Codec<dee.b> c = azv.a(dee.b::values);
      private final String d;
      private final dee.b.a e;

      private b(final String $$0, final dee.b.a $$1) {
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

   public static record c(float b, bro c) {
      public static final MapCodec<dee.c> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.FLOAT.optionalFieldOf("movement_scale", 0.0F).forGetter(dee.c::a), bro.c.optionalFieldOf("base", brm.a).forGetter(dee.c::b))
               .apply($$0, dee.c::new)
      );

      public double a(double $$0, azh $$1) {
         return $$0 * (double)this.b + (double)this.c.a($$1);
      }

      public float a() {
         return this.b;
      }

      public bro b() {
         return this.c;
      }
   }
}
