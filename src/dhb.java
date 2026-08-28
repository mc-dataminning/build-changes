import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dhb(lw d, dhb.a e, dhb.a f, dhb.c g, dhb.c h, btj i) implements dgo {
   public static final MapCodec<dhb> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               ly.bk.fieldOf("particle").forGetter(dhb::c),
               dhb.a.a.fieldOf("horizontal_position").forGetter(dhb::d),
               dhb.a.a.fieldOf("vertical_position").forGetter(dhb::e),
               dhb.c.a.fieldOf("horizontal_velocity").forGetter(dhb::f),
               dhb.c.a.fieldOf("vertical_velocity").forGetter(dhb::g),
               btj.c.optionalFieldOf("speed", bth.a).forGetter(dhb::h)
            )
            .apply($$0, dhb::new)
   );

   public static dhb.a a(float $$0) {
      return new dhb.a(dhb.b.a, $$0, 1.0F);
   }

   public static dhb.a b() {
      return new dhb.a(dhb.b.b, 0.0F, 1.0F);
   }

   public static dhb.c b(float $$0) {
      return new dhb.c($$0, bth.a);
   }

   public static dhb.c a(btj $$0) {
      return new dhb.c(0.0F, $$0);
   }

   @Override
   public void a(arq $$0, int $$1, dfw $$2, bwi $$3, fex $$4) {
      azv $$5 = $$3.dX();
      fex $$6 = $$3.ae();
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
   public MapCodec<dhb> a() {
      return a;
   }

   public lw c() {
      return this.d;
   }

   public dhb.a d() {
      return this.e;
   }

   public dhb.a e() {
      return this.f;
   }

   public dhb.c f() {
      return this.g;
   }

   public dhb.c g() {
      return this.h;
   }

   public btj h() {
      return this.i;
   }

   public static record a(dhb.b b, float c, float d) {
      public static final MapCodec<dhb.a> a = RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     dhb.b.c.fieldOf("type").forGetter(dhb.a::a),
                     Codec.FLOAT.optionalFieldOf("offset", 0.0F).forGetter(dhb.a::b),
                     ayu.o.optionalFieldOf("scale", 1.0F).forGetter(dhb.a::c)
                  )
                  .apply($$0, dhb.a::new)
         )
         .validate(
            $$0 -> $$0.a() == dhb.b.a && $$0.c() != 1.0F
                  ? DataResult.error(() -> "Cannot scale an entity position coordinate source")
                  : DataResult.success($$0)
         );

      public double a(double $$0, double $$1, float $$2, azv $$3) {
         return this.b.a($$0, $$1, $$2 * this.d, $$3) + (double)this.c;
      }

      public dhb.b a() {
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

      public static final Codec<dhb.b> c = bak.a(dhb.b::values);
      private final String d;
      private final dhb.b.a e;

      private b(final String $$0, final dhb.b.a $$1) {
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

   public static record c(float b, btj c) {
      public static final MapCodec<dhb.c> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.FLOAT.optionalFieldOf("movement_scale", 0.0F).forGetter(dhb.c::a), btj.c.optionalFieldOf("base", bth.a).forGetter(dhb.c::b))
               .apply($$0, dhb.c::new)
      );

      public double a(double $$0, azv $$1) {
         return $$0 * (double)this.b + (double)this.c.a($$1);
      }

      public float a() {
         return this.b;
      }

      public btj b() {
         return this.c;
      }
   }
}
