import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ded(lr d, ded.a e, ded.a f, ded.c g, ded.c h, brn i) implements ddq {
   public static final MapCodec<ded> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               lt.bi.fieldOf("particle").forGetter(ded::c),
               ded.a.a.fieldOf("horizontal_position").forGetter(ded::d),
               ded.a.a.fieldOf("vertical_position").forGetter(ded::e),
               ded.c.a.fieldOf("horizontal_velocity").forGetter(ded::f),
               ded.c.a.fieldOf("vertical_velocity").forGetter(ded::g),
               brn.c.optionalFieldOf("speed", brl.a).forGetter(ded::h)
            )
            .apply($$0, ded::new)
   );

   public static ded.a a(float $$0) {
      return new ded.a(ded.b.a, $$0, 1.0F);
   }

   public static ded.a b() {
      return new ded.a(ded.b.b, 0.0F, 1.0F);
   }

   public static ded.c b(float $$0) {
      return new ded.c($$0, brl.a);
   }

   public static ded.c a(brn $$0) {
      return new ded.c(0.0F, $$0);
   }

   @Override
   public void a(ard $$0, int $$1, dcy $$2, bul $$3, fba $$4) {
      azh $$5 = $$3.dY();
      fba $$6 = $$3.ah();
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
   public MapCodec<ded> a() {
      return a;
   }

   public lr c() {
      return this.d;
   }

   public ded.a d() {
      return this.e;
   }

   public ded.a e() {
      return this.f;
   }

   public ded.c f() {
      return this.g;
   }

   public ded.c g() {
      return this.h;
   }

   public brn h() {
      return this.i;
   }

   public static record a(ded.b b, float c, float d) {
      public static final MapCodec<ded.a> a = RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     ded.b.c.fieldOf("type").forGetter(ded.a::a),
                     Codec.FLOAT.optionalFieldOf("offset", 0.0F).forGetter(ded.a::b),
                     ayi.o.optionalFieldOf("scale", 1.0F).forGetter(ded.a::c)
                  )
                  .apply($$0, ded.a::new)
         )
         .validate(
            $$0 -> $$0.a() == ded.b.a && $$0.c() != 1.0F
                  ? DataResult.error(() -> "Cannot scale an entity position coordinate source")
                  : DataResult.success($$0)
         );

      public double a(double $$0, double $$1, float $$2, azh $$3) {
         return this.b.a($$0, $$1, $$2 * this.d, $$3) + (double)this.c;
      }

      public ded.b a() {
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

      public static final Codec<ded.b> c = azv.a(ded.b::values);
      private final String d;
      private final ded.b.a e;

      private b(final String $$0, final ded.b.a $$1) {
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

   public static record c(float b, brn c) {
      public static final MapCodec<ded.c> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.FLOAT.optionalFieldOf("movement_scale", 0.0F).forGetter(ded.c::a), brn.c.optionalFieldOf("base", brl.a).forGetter(ded.c::b))
               .apply($$0, ded.c::new)
      );

      public double a(double $$0, azh $$1) {
         return $$0 * (double)this.b + (double)this.c.a($$1);
      }

      public float a() {
         return this.b;
      }

      public brn b() {
         return this.c;
      }
   }
}
