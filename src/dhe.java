import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dhe(lw d, dhe.a e, dhe.a f, dhe.c g, dhe.c h, btj i) implements dgr {
   public static final MapCodec<dhe> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               ly.bk.fieldOf("particle").forGetter(dhe::c),
               dhe.a.a.fieldOf("horizontal_position").forGetter(dhe::d),
               dhe.a.a.fieldOf("vertical_position").forGetter(dhe::e),
               dhe.c.a.fieldOf("horizontal_velocity").forGetter(dhe::f),
               dhe.c.a.fieldOf("vertical_velocity").forGetter(dhe::g),
               btj.c.optionalFieldOf("speed", bth.a).forGetter(dhe::h)
            )
            .apply($$0, dhe::new)
   );

   public static dhe.a a(float $$0) {
      return new dhe.a(dhe.b.a, $$0, 1.0F);
   }

   public static dhe.a b() {
      return new dhe.a(dhe.b.b, 0.0F, 1.0F);
   }

   public static dhe.c b(float $$0) {
      return new dhe.c($$0, bth.a);
   }

   public static dhe.c a(btj $$0) {
      return new dhe.c(0.0F, $$0);
   }

   @Override
   public void a(arq $$0, int $$1, dfz $$2, bwi $$3, ffc $$4) {
      azv $$5 = $$3.dX();
      ffc $$6 = $$3.ae();
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
   public MapCodec<dhe> a() {
      return a;
   }

   public lw c() {
      return this.d;
   }

   public dhe.a d() {
      return this.e;
   }

   public dhe.a e() {
      return this.f;
   }

   public dhe.c f() {
      return this.g;
   }

   public dhe.c g() {
      return this.h;
   }

   public btj h() {
      return this.i;
   }

   public static record a(dhe.b b, float c, float d) {
      public static final MapCodec<dhe.a> a = RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     dhe.b.c.fieldOf("type").forGetter(dhe.a::a),
                     Codec.FLOAT.optionalFieldOf("offset", 0.0F).forGetter(dhe.a::b),
                     ayu.o.optionalFieldOf("scale", 1.0F).forGetter(dhe.a::c)
                  )
                  .apply($$0, dhe.a::new)
         )
         .validate(
            $$0 -> $$0.a() == dhe.b.a && $$0.c() != 1.0F
                  ? DataResult.error(() -> "Cannot scale an entity position coordinate source")
                  : DataResult.success($$0)
         );

      public double a(double $$0, double $$1, float $$2, azv $$3) {
         return this.b.a($$0, $$1, $$2 * this.d, $$3) + (double)this.c;
      }

      public dhe.b a() {
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

      public static final Codec<dhe.b> c = bak.a(dhe.b::values);
      private final String d;
      private final dhe.b.a e;

      private b(final String $$0, final dhe.b.a $$1) {
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
      public static final MapCodec<dhe.c> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.FLOAT.optionalFieldOf("movement_scale", 0.0F).forGetter(dhe.c::a), btj.c.optionalFieldOf("base", bth.a).forGetter(dhe.c::b))
               .apply($$0, dhe.c::new)
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
