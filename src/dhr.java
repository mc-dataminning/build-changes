import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dhr(lx d, dhr.a e, dhr.a f, dhr.c g, dhr.c h, btw i) implements dhe {
   public static final MapCodec<dhr> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               lz.bk.fieldOf("particle").forGetter(dhr::c),
               dhr.a.a.fieldOf("horizontal_position").forGetter(dhr::d),
               dhr.a.a.fieldOf("vertical_position").forGetter(dhr::e),
               dhr.c.a.fieldOf("horizontal_velocity").forGetter(dhr::f),
               dhr.c.a.fieldOf("vertical_velocity").forGetter(dhr::g),
               btw.c.optionalFieldOf("speed", btu.a).forGetter(dhr::h)
            )
            .apply($$0, dhr::new)
   );

   public static dhr.a a(float $$0) {
      return new dhr.a(dhr.b.a, $$0, 1.0F);
   }

   public static dhr.a b() {
      return new dhr.a(dhr.b.b, 0.0F, 1.0F);
   }

   public static dhr.c b(float $$0) {
      return new dhr.c($$0, btu.a);
   }

   public static dhr.c a(btw $$0) {
      return new dhr.c(0.0F, $$0);
   }

   @Override
   public void a(aru $$0, int $$1, dgm $$2, bwv $$3, ffs $$4) {
      azz $$5 = $$3.dY();
      ffs $$6 = $$3.ae();
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
   public MapCodec<dhr> a() {
      return a;
   }

   public lx c() {
      return this.d;
   }

   public dhr.a d() {
      return this.e;
   }

   public dhr.a e() {
      return this.f;
   }

   public dhr.c f() {
      return this.g;
   }

   public dhr.c g() {
      return this.h;
   }

   public btw h() {
      return this.i;
   }

   public static record a(dhr.b b, float c, float d) {
      public static final MapCodec<dhr.a> a = RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     dhr.b.c.fieldOf("type").forGetter(dhr.a::a),
                     Codec.FLOAT.optionalFieldOf("offset", 0.0F).forGetter(dhr.a::b),
                     ayy.o.optionalFieldOf("scale", 1.0F).forGetter(dhr.a::c)
                  )
                  .apply($$0, dhr.a::new)
         )
         .validate(
            $$0 -> $$0.a() == dhr.b.a && $$0.c() != 1.0F
                  ? DataResult.error(() -> "Cannot scale an entity position coordinate source")
                  : DataResult.success($$0)
         );

      public double a(double $$0, double $$1, float $$2, azz $$3) {
         return this.b.a($$0, $$1, $$2 * this.d, $$3) + (double)this.c;
      }

      public dhr.b a() {
         return this.b;
      }

      public float b() {
         return this.c;
      }

      public float c() {
         return this.d;
      }
   }

   public static enum b implements bao {
      a("entity_position", ($$0, $$1, $$2, $$3) -> $$0),
      b("in_bounding_box", ($$0, $$1, $$2, $$3) -> $$1 + ($$3.j() - 0.5) * (double)$$2);

      public static final Codec<dhr.b> c = bao.a(dhr.b::values);
      private final String d;
      private final dhr.b.a e;

      private b(final String $$0, final dhr.b.a $$1) {
         this.d = $$0;
         this.e = $$1;
      }

      public double a(double $$0, double $$1, float $$2, azz $$3) {
         return this.e.getCoordinate($$0, $$1, $$2, $$3);
      }

      @Override
      public String c() {
         return this.d;
      }

      @FunctionalInterface
      interface a {
         double getCoordinate(double var1, double var3, float var5, azz var6);
      }
   }

   public static record c(float b, btw c) {
      public static final MapCodec<dhr.c> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.FLOAT.optionalFieldOf("movement_scale", 0.0F).forGetter(dhr.c::a), btw.c.optionalFieldOf("base", btu.a).forGetter(dhr.c::b))
               .apply($$0, dhr.c::new)
      );

      public double a(double $$0, azz $$1) {
         return $$0 * (double)this.b + (double)this.c.a($$1);
      }

      public float a() {
         return this.b;
      }

      public btw b() {
         return this.c;
      }
   }
}
