import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dam(lh d, dam.a e, dam.a f, dam.c g, dam.c h, bpg i) implements czz {
   public static final MapCodec<dam> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               lj.bf.fieldOf("particle").forGetter(dam::c),
               dam.a.a.fieldOf("horizontal_position").forGetter(dam::d),
               dam.a.a.fieldOf("vertical_position").forGetter(dam::e),
               dam.c.a.fieldOf("horizontal_velocity").forGetter(dam::f),
               dam.c.a.fieldOf("vertical_velocity").forGetter(dam::g),
               bpg.c.optionalFieldOf("speed", bpe.a).forGetter(dam::h)
            )
            .apply($$0, dam::new)
   );

   public static dam.a a(float $$0) {
      return new dam.a(dam.b.a, $$0, 1.0F);
   }

   public static dam.a b() {
      return new dam.a(dam.b.b, 0.0F, 1.0F);
   }

   public static dam.c b(float $$0) {
      return new dam.c($$0, bpe.a);
   }

   public static dam.c a(bpg $$0) {
      return new dam.c(0.0F, $$0);
   }

   @Override
   public void a(aqk $$0, int $$1, czi $$2, bsd $$3, evz $$4) {
      aym $$5 = $$3.dS();
      evz $$6 = $$3.ds();
      float $$7 = $$3.dj();
      float $$8 = $$3.dk();
      $$0.a(
         this.d,
         this.e.a($$4.a(), $$7, $$5),
         this.f.a($$4.b(), $$8, $$5),
         this.e.a($$4.c(), $$7, $$5),
         0,
         this.g.a($$6.a(), $$5),
         this.h.a($$6.b(), $$5),
         this.g.a($$6.c(), $$5),
         (double)this.i.a($$5)
      );
   }

   @Override
   public MapCodec<dam> a() {
      return a;
   }

   public lh c() {
      return this.d;
   }

   public dam.a d() {
      return this.e;
   }

   public dam.a e() {
      return this.f;
   }

   public dam.c f() {
      return this.g;
   }

   public dam.c g() {
      return this.h;
   }

   public bpg h() {
      return this.i;
   }

   public static record a(dam.b b, float c, float d) {
      public static final MapCodec<dam.a> a = RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     dam.b.c.fieldOf("type").forGetter(dam.a::a),
                     Codec.FLOAT.optionalFieldOf("offset", 0.0F).forGetter(dam.a::b),
                     axm.m.optionalFieldOf("scale", 1.0F).forGetter(dam.a::c)
                  )
                  .apply($$0, dam.a::new)
         )
         .validate(
            $$0 -> $$0.a() == dam.b.a && $$0.c() != 1.0F
                  ? DataResult.error(() -> "Cannot scale an entity position coordinate source")
                  : DataResult.success($$0)
         );

      public double a(double $$0, float $$1, aym $$2) {
         return this.b.a($$0, $$1 * this.d, $$2) + (double)this.c;
      }

      public dam.b a() {
         return this.b;
      }

      public float b() {
         return this.c;
      }

      public float c() {
         return this.d;
      }
   }

   public static enum b implements ayz {
      a("entity_position", ($$0, $$1, $$2) -> $$0),
      b("in_bounding_box", ($$0, $$1, $$2) -> $$0 + ($$2.j() - 0.5) * (double)$$1);

      public static final Codec<dam.b> c = ayz.a(dam.b::values);
      private final String d;
      private final dam.b.a e;

      private b(final String $$0, final dam.b.a $$1) {
         this.d = $$0;
         this.e = $$1;
      }

      public double a(double $$0, float $$1, aym $$2) {
         return this.e.getCoordinate($$0, $$1, $$2);
      }

      @Override
      public String c() {
         return this.d;
      }

      @FunctionalInterface
      interface a {
         double getCoordinate(double var1, float var3, aym var4);
      }
   }

   public static record c(float b, bpg c) {
      public static final MapCodec<dam.c> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.FLOAT.optionalFieldOf("movement_scale", 0.0F).forGetter(dam.c::a), bpg.c.optionalFieldOf("base", bpe.a).forGetter(dam.c::b))
               .apply($$0, dam.c::new)
      );

      public double a(double $$0, aym $$1) {
         return $$0 * (double)this.b + (double)this.c.a($$1);
      }

      public float a() {
         return this.b;
      }

      public bpg b() {
         return this.c;
      }
   }
}
