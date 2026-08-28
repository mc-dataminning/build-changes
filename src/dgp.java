import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dgp(lv d, dgp.a e, dgp.a f, dgp.c g, dgp.c h, bte i) implements dgc {
   public static final MapCodec<dgp> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               lx.bk.fieldOf("particle").forGetter(dgp::c),
               dgp.a.a.fieldOf("horizontal_position").forGetter(dgp::d),
               dgp.a.a.fieldOf("vertical_position").forGetter(dgp::e),
               dgp.c.a.fieldOf("horizontal_velocity").forGetter(dgp::f),
               dgp.c.a.fieldOf("vertical_velocity").forGetter(dgp::g),
               bte.c.optionalFieldOf("speed", btc.a).forGetter(dgp::h)
            )
            .apply($$0, dgp::new)
   );

   public static dgp.a a(float $$0) {
      return new dgp.a(dgp.b.a, $$0, 1.0F);
   }

   public static dgp.a b() {
      return new dgp.a(dgp.b.b, 0.0F, 1.0F);
   }

   public static dgp.c b(float $$0) {
      return new dgp.c($$0, btc.a);
   }

   public static dgp.c a(bte $$0) {
      return new dgp.c(0.0F, $$0);
   }

   @Override
   public void a(arq $$0, int $$1, dfk $$2, bwd $$3, fei $$4) {
      azv $$5 = $$3.dY();
      fei $$6 = $$3.ah();
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
   public MapCodec<dgp> a() {
      return a;
   }

   public lv c() {
      return this.d;
   }

   public dgp.a d() {
      return this.e;
   }

   public dgp.a e() {
      return this.f;
   }

   public dgp.c f() {
      return this.g;
   }

   public dgp.c g() {
      return this.h;
   }

   public bte h() {
      return this.i;
   }

   public static record a(dgp.b b, float c, float d) {
      public static final MapCodec<dgp.a> a = RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     dgp.b.c.fieldOf("type").forGetter(dgp.a::a),
                     Codec.FLOAT.optionalFieldOf("offset", 0.0F).forGetter(dgp.a::b),
                     ayu.o.optionalFieldOf("scale", 1.0F).forGetter(dgp.a::c)
                  )
                  .apply($$0, dgp.a::new)
         )
         .validate(
            $$0 -> $$0.a() == dgp.b.a && $$0.c() != 1.0F
                  ? DataResult.error(() -> "Cannot scale an entity position coordinate source")
                  : DataResult.success($$0)
         );

      public double a(double $$0, double $$1, float $$2, azv $$3) {
         return this.b.a($$0, $$1, $$2 * this.d, $$3) + (double)this.c;
      }

      public dgp.b a() {
         return this.b;
      }

      public float b() {
         return this.c;
      }

      public float c() {
         return this.d;
      }
   }

   public static enum b implements bak {
      a("entity_position", ($$0, $$1, $$2, $$3) -> $$0),
      b("in_bounding_box", ($$0, $$1, $$2, $$3) -> $$1 + ($$3.j() - 0.5) * (double)$$2);

      public static final Codec<dgp.b> c = bak.a(dgp.b::values);
      private final String d;
      private final dgp.b.a e;

      private b(final String $$0, final dgp.b.a $$1) {
         this.d = $$0;
         this.e = $$1;
      }

      public double a(double $$0, double $$1, float $$2, azv $$3) {
         return this.e.getCoordinate($$0, $$1, $$2, $$3);
      }

      @Override
      public String c() {
         return this.d;
      }

      @FunctionalInterface
      interface a {
         double getCoordinate(double var1, double var3, float var5, azv var6);
      }
   }

   public static record c(float b, bte c) {
      public static final MapCodec<dgp.c> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.FLOAT.optionalFieldOf("movement_scale", 0.0F).forGetter(dgp.c::a), bte.c.optionalFieldOf("base", btc.a).forGetter(dgp.c::b))
               .apply($$0, dgp.c::new)
      );

      public double a(double $$0, azv $$1) {
         return $$0 * (double)this.b + (double)this.c.a($$1);
      }

      public float a() {
         return this.b;
      }

      public bte b() {
         return this.c;
      }
   }
}
