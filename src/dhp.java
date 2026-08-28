import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dhp(lw d, dhp.a e, dhp.a f, dhp.c g, dhp.c h, btu i) implements dhc {
   public static final MapCodec<dhp> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               ly.bk.fieldOf("particle").forGetter(dhp::c),
               dhp.a.a.fieldOf("horizontal_position").forGetter(dhp::d),
               dhp.a.a.fieldOf("vertical_position").forGetter(dhp::e),
               dhp.c.a.fieldOf("horizontal_velocity").forGetter(dhp::f),
               dhp.c.a.fieldOf("vertical_velocity").forGetter(dhp::g),
               btu.c.optionalFieldOf("speed", bts.a).forGetter(dhp::h)
            )
            .apply($$0, dhp::new)
   );

   public static dhp.a a(float $$0) {
      return new dhp.a(dhp.b.a, $$0, 1.0F);
   }

   public static dhp.a b() {
      return new dhp.a(dhp.b.b, 0.0F, 1.0F);
   }

   public static dhp.c b(float $$0) {
      return new dhp.c($$0, bts.a);
   }

   public static dhp.c a(btu $$0) {
      return new dhp.c(0.0F, $$0);
   }

   @Override
   public void a(ars $$0, int $$1, dgk $$2, bwt $$3, ffq $$4) {
      azx $$5 = $$3.dY();
      ffq $$6 = $$3.ae();
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
   public MapCodec<dhp> a() {
      return a;
   }

   public lw c() {
      return this.d;
   }

   public dhp.a d() {
      return this.e;
   }

   public dhp.a e() {
      return this.f;
   }

   public dhp.c f() {
      return this.g;
   }

   public dhp.c g() {
      return this.h;
   }

   public btu h() {
      return this.i;
   }

   public static record a(dhp.b b, float c, float d) {
      public static final MapCodec<dhp.a> a = RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     dhp.b.c.fieldOf("type").forGetter(dhp.a::a),
                     Codec.FLOAT.optionalFieldOf("offset", 0.0F).forGetter(dhp.a::b),
                     ayw.o.optionalFieldOf("scale", 1.0F).forGetter(dhp.a::c)
                  )
                  .apply($$0, dhp.a::new)
         )
         .validate(
            $$0 -> $$0.a() == dhp.b.a && $$0.c() != 1.0F
                  ? DataResult.error(() -> "Cannot scale an entity position coordinate source")
                  : DataResult.success($$0)
         );

      public double a(double $$0, double $$1, float $$2, azx $$3) {
         return this.b.a($$0, $$1, $$2 * this.d, $$3) + (double)this.c;
      }

      public dhp.b a() {
         return this.b;
      }

      public float b() {
         return this.c;
      }

      public float c() {
         return this.d;
      }
   }

   public static enum b implements bam {
      a("entity_position", ($$0, $$1, $$2, $$3) -> $$0),
      b("in_bounding_box", ($$0, $$1, $$2, $$3) -> $$1 + ($$3.j() - 0.5) * (double)$$2);

      public static final Codec<dhp.b> c = bam.a(dhp.b::values);
      private final String d;
      private final dhp.b.a e;

      private b(final String $$0, final dhp.b.a $$1) {
         this.d = $$0;
         this.e = $$1;
      }

      public double a(double $$0, double $$1, float $$2, azx $$3) {
         return this.e.getCoordinate($$0, $$1, $$2, $$3);
      }

      @Override
      public String c() {
         return this.d;
      }

      @FunctionalInterface
      interface a {
         double getCoordinate(double var1, double var3, float var5, azx var6);
      }
   }

   public static record c(float b, btu c) {
      public static final MapCodec<dhp.c> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.FLOAT.optionalFieldOf("movement_scale", 0.0F).forGetter(dhp.c::a), btu.c.optionalFieldOf("base", bts.a).forGetter(dhp.c::b))
               .apply($$0, dhp.c::new)
      );

      public double a(double $$0, azx $$1) {
         return $$0 * (double)this.b + (double)this.c.a($$1);
      }

      public float a() {
         return this.b;
      }

      public btu b() {
         return this.c;
      }
   }
}
