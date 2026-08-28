import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dda(lq d, dda.a e, dda.a f, dda.c g, dda.c h, brk i) implements dcn {
   public static final MapCodec<dda> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               ls.bf.fieldOf("particle").forGetter(dda::c),
               dda.a.a.fieldOf("horizontal_position").forGetter(dda::d),
               dda.a.a.fieldOf("vertical_position").forGetter(dda::e),
               dda.c.a.fieldOf("horizontal_velocity").forGetter(dda::f),
               dda.c.a.fieldOf("vertical_velocity").forGetter(dda::g),
               brk.c.optionalFieldOf("speed", bri.a).forGetter(dda::h)
            )
            .apply($$0, dda::new)
   );

   public static dda.a a(float $$0) {
      return new dda.a(dda.b.a, $$0, 1.0F);
   }

   public static dda.a b() {
      return new dda.a(dda.b.b, 0.0F, 1.0F);
   }

   public static dda.c b(float $$0) {
      return new dda.c($$0, bri.a);
   }

   public static dda.c a(brk $$0) {
      return new dda.c(0.0F, $$0);
   }

   @Override
   public void a(arq $$0, int $$1, dbv $$2, bui $$3, ezr $$4) {
      azv $$5 = $$3.eb();
      ezr $$6 = $$3.ai();
      float $$7 = $$3.dt();
      float $$8 = $$3.du();
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
   public MapCodec<dda> a() {
      return a;
   }

   public lq c() {
      return this.d;
   }

   public dda.a d() {
      return this.e;
   }

   public dda.a e() {
      return this.f;
   }

   public dda.c f() {
      return this.g;
   }

   public dda.c g() {
      return this.h;
   }

   public brk h() {
      return this.i;
   }

   public static record a(dda.b b, float c, float d) {
      public static final MapCodec<dda.a> a = RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     dda.b.c.fieldOf("type").forGetter(dda.a::a),
                     Codec.FLOAT.optionalFieldOf("offset", 0.0F).forGetter(dda.a::b),
                     ayw.o.optionalFieldOf("scale", 1.0F).forGetter(dda.a::c)
                  )
                  .apply($$0, dda.a::new)
         )
         .validate(
            $$0 -> $$0.a() == dda.b.a && $$0.c() != 1.0F
                  ? DataResult.error(() -> "Cannot scale an entity position coordinate source")
                  : DataResult.success($$0)
         );

      public double a(double $$0, double $$1, float $$2, azv $$3) {
         return this.b.a($$0, $$1, $$2 * this.d, $$3) + (double)this.c;
      }

      public dda.b a() {
         return this.b;
      }

      public float b() {
         return this.c;
      }

      public float c() {
         return this.d;
      }
   }

   public static enum b implements baj {
      a("entity_position", ($$0, $$1, $$2, $$3) -> $$0),
      b("in_bounding_box", ($$0, $$1, $$2, $$3) -> $$1 + ($$3.j() - 0.5) * (double)$$2);

      public static final Codec<dda.b> c = baj.a(dda.b::values);
      private final String d;
      private final dda.b.a e;

      private b(final String $$0, final dda.b.a $$1) {
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

   public static record c(float b, brk c) {
      public static final MapCodec<dda.c> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.FLOAT.optionalFieldOf("movement_scale", 0.0F).forGetter(dda.c::a), brk.c.optionalFieldOf("base", bri.a).forGetter(dda.c::b))
               .apply($$0, dda.c::new)
      );

      public double a(double $$0, azv $$1) {
         return $$0 * (double)this.b + (double)this.c.a($$1);
      }

      public float a() {
         return this.b;
      }

      public brk b() {
         return this.c;
      }
   }
}
