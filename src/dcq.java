import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dcq(lo d, dcq.a e, dcq.a f, dcq.c g, dcq.c h, brb i) implements dcd {
   public static final MapCodec<dcq> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               lq.bf.fieldOf("particle").forGetter(dcq::c),
               dcq.a.a.fieldOf("horizontal_position").forGetter(dcq::d),
               dcq.a.a.fieldOf("vertical_position").forGetter(dcq::e),
               dcq.c.a.fieldOf("horizontal_velocity").forGetter(dcq::f),
               dcq.c.a.fieldOf("vertical_velocity").forGetter(dcq::g),
               brb.c.optionalFieldOf("speed", bqz.a).forGetter(dcq::h)
            )
            .apply($$0, dcq::new)
   );

   public static dcq.a a(float $$0) {
      return new dcq.a(dcq.b.a, $$0, 1.0F);
   }

   public static dcq.a b() {
      return new dcq.a(dcq.b.b, 0.0F, 1.0F);
   }

   public static dcq.c b(float $$0) {
      return new dcq.c($$0, bqz.a);
   }

   public static dcq.c a(brb $$0) {
      return new dcq.c(0.0F, $$0);
   }

   @Override
   public void a(arm $$0, int $$1, dbl $$2, btz $$3, ezh $$4) {
      azr $$5 = $$3.ea();
      ezh $$6 = $$3.ai();
      float $$7 = $$3.ds();
      float $$8 = $$3.dt();
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
   public MapCodec<dcq> a() {
      return a;
   }

   public lo c() {
      return this.d;
   }

   public dcq.a d() {
      return this.e;
   }

   public dcq.a e() {
      return this.f;
   }

   public dcq.c f() {
      return this.g;
   }

   public dcq.c g() {
      return this.h;
   }

   public brb h() {
      return this.i;
   }

   public static record a(dcq.b b, float c, float d) {
      public static final MapCodec<dcq.a> a = RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     dcq.b.c.fieldOf("type").forGetter(dcq.a::a),
                     Codec.FLOAT.optionalFieldOf("offset", 0.0F).forGetter(dcq.a::b),
                     ays.o.optionalFieldOf("scale", 1.0F).forGetter(dcq.a::c)
                  )
                  .apply($$0, dcq.a::new)
         )
         .validate(
            $$0 -> $$0.a() == dcq.b.a && $$0.c() != 1.0F
                  ? DataResult.error(() -> "Cannot scale an entity position coordinate source")
                  : DataResult.success($$0)
         );

      public double a(double $$0, double $$1, float $$2, azr $$3) {
         return this.b.a($$0, $$1, $$2 * this.d, $$3) + (double)this.c;
      }

      public dcq.b a() {
         return this.b;
      }

      public float b() {
         return this.c;
      }

      public float c() {
         return this.d;
      }
   }

   public static enum b implements baf {
      a("entity_position", ($$0, $$1, $$2, $$3) -> $$0),
      b("in_bounding_box", ($$0, $$1, $$2, $$3) -> $$1 + ($$3.j() - 0.5) * (double)$$2);

      public static final Codec<dcq.b> c = baf.a(dcq.b::values);
      private final String d;
      private final dcq.b.a e;

      private b(final String $$0, final dcq.b.a $$1) {
         this.d = $$0;
         this.e = $$1;
      }

      public double a(double $$0, double $$1, float $$2, azr $$3) {
         return this.e.getCoordinate($$0, $$1, $$2, $$3);
      }

      @Override
      public String c() {
         return this.d;
      }

      @FunctionalInterface
      interface a {
         double getCoordinate(double var1, double var3, float var5, azr var6);
      }
   }

   public static record c(float b, brb c) {
      public static final MapCodec<dcq.c> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.FLOAT.optionalFieldOf("movement_scale", 0.0F).forGetter(dcq.c::a), brb.c.optionalFieldOf("base", bqz.a).forGetter(dcq.c::b))
               .apply($$0, dcq.c::new)
      );

      public double a(double $$0, azr $$1) {
         return $$0 * (double)this.b + (double)this.c.a($$1);
      }

      public float a() {
         return this.b;
      }

      public brb b() {
         return this.c;
      }
   }
}
