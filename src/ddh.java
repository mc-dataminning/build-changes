import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ddh(lq d, ddh.a e, ddh.a f, ddh.c g, ddh.c h, brn i) implements dcu {
   public static final MapCodec<ddh> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               ls.bf.fieldOf("particle").forGetter(ddh::c),
               ddh.a.a.fieldOf("horizontal_position").forGetter(ddh::d),
               ddh.a.a.fieldOf("vertical_position").forGetter(ddh::e),
               ddh.c.a.fieldOf("horizontal_velocity").forGetter(ddh::f),
               ddh.c.a.fieldOf("vertical_velocity").forGetter(ddh::g),
               brn.c.optionalFieldOf("speed", brl.a).forGetter(ddh::h)
            )
            .apply($$0, ddh::new)
   );

   public static ddh.a a(float $$0) {
      return new ddh.a(ddh.b.a, $$0, 1.0F);
   }

   public static ddh.a b() {
      return new ddh.a(ddh.b.b, 0.0F, 1.0F);
   }

   public static ddh.c b(float $$0) {
      return new ddh.c($$0, brl.a);
   }

   public static ddh.c a(brn $$0) {
      return new ddh.c(0.0F, $$0);
   }

   @Override
   public void a(arp $$0, int $$1, dcc $$2, bul $$3, ezy $$4) {
      azu $$5 = $$3.dY();
      ezy $$6 = $$3.ah();
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
   public MapCodec<ddh> a() {
      return a;
   }

   public lq c() {
      return this.d;
   }

   public ddh.a d() {
      return this.e;
   }

   public ddh.a e() {
      return this.f;
   }

   public ddh.c f() {
      return this.g;
   }

   public ddh.c g() {
      return this.h;
   }

   public brn h() {
      return this.i;
   }

   public static record a(ddh.b b, float c, float d) {
      public static final MapCodec<ddh.a> a = RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     ddh.b.c.fieldOf("type").forGetter(ddh.a::a),
                     Codec.FLOAT.optionalFieldOf("offset", 0.0F).forGetter(ddh.a::b),
                     ayv.o.optionalFieldOf("scale", 1.0F).forGetter(ddh.a::c)
                  )
                  .apply($$0, ddh.a::new)
         )
         .validate(
            $$0 -> $$0.a() == ddh.b.a && $$0.c() != 1.0F
                  ? DataResult.error(() -> "Cannot scale an entity position coordinate source")
                  : DataResult.success($$0)
         );

      public double a(double $$0, double $$1, float $$2, azu $$3) {
         return this.b.a($$0, $$1, $$2 * this.d, $$3) + (double)this.c;
      }

      public ddh.b a() {
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

      public static final Codec<ddh.b> c = bai.a(ddh.b::values);
      private final String d;
      private final ddh.b.a e;

      private b(final String $$0, final ddh.b.a $$1) {
         this.d = $$0;
         this.e = $$1;
      }

      public double a(double $$0, double $$1, float $$2, azu $$3) {
         return this.e.getCoordinate($$0, $$1, $$2, $$3);
      }

      @Override
      public String c() {
         return this.d;
      }

      @FunctionalInterface
      interface a {
         double getCoordinate(double var1, double var3, float var5, azu var6);
      }
   }

   public static record c(float b, brn c) {
      public static final MapCodec<ddh.c> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.FLOAT.optionalFieldOf("movement_scale", 0.0F).forGetter(ddh.c::a), brn.c.optionalFieldOf("base", brl.a).forGetter(ddh.c::b))
               .apply($$0, ddh.c::new)
      );

      public double a(double $$0, azu $$1) {
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
