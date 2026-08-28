import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dib(lx d, dib.a e, dib.a f, dib.c g, dib.c h, buf i) implements dho {
   public static final MapCodec<dib> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               lz.bk.fieldOf("particle").forGetter(dib::c),
               dib.a.a.fieldOf("horizontal_position").forGetter(dib::d),
               dib.a.a.fieldOf("vertical_position").forGetter(dib::e),
               dib.c.a.fieldOf("horizontal_velocity").forGetter(dib::f),
               dib.c.a.fieldOf("vertical_velocity").forGetter(dib::g),
               buf.c.optionalFieldOf("speed", bud.a).forGetter(dib::h)
            )
            .apply($$0, dib::new)
   );

   public static dib.a a(float $$0) {
      return new dib.a(dib.b.a, $$0, 1.0F);
   }

   public static dib.a b() {
      return new dib.a(dib.b.b, 0.0F, 1.0F);
   }

   public static dib.c b(float $$0) {
      return new dib.c($$0, bud.a);
   }

   public static dib.c a(buf $$0) {
      return new dib.c(0.0F, $$0);
   }

   @Override
   public void a(asb $$0, int $$1, dgw $$2, bxe $$3, fgc $$4) {
      bai $$5 = $$3.dY();
      fgc $$6 = $$3.ad();
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
   public MapCodec<dib> a() {
      return a;
   }

   public lx c() {
      return this.d;
   }

   public dib.a d() {
      return this.e;
   }

   public dib.a e() {
      return this.f;
   }

   public dib.c f() {
      return this.g;
   }

   public dib.c g() {
      return this.h;
   }

   public buf h() {
      return this.i;
   }

   public static record a(dib.b b, float c, float d) {
      public static final MapCodec<dib.a> a = RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     dib.b.c.fieldOf("type").forGetter(dib.a::a),
                     Codec.FLOAT.optionalFieldOf("offset", 0.0F).forGetter(dib.a::b),
                     azg.o.optionalFieldOf("scale", 1.0F).forGetter(dib.a::c)
                  )
                  .apply($$0, dib.a::new)
         )
         .validate(
            $$0 -> $$0.a() == dib.b.a && $$0.c() != 1.0F
                  ? DataResult.error(() -> "Cannot scale an entity position coordinate source")
                  : DataResult.success($$0)
         );

      public double a(double $$0, double $$1, float $$2, bai $$3) {
         return this.b.a($$0, $$1, $$2 * this.d, $$3) + (double)this.c;
      }

      public dib.b a() {
         return this.b;
      }

      public float b() {
         return this.c;
      }

      public float c() {
         return this.d;
      }
   }

   public static enum b implements bax {
      a("entity_position", ($$0, $$1, $$2, $$3) -> $$0),
      b("in_bounding_box", ($$0, $$1, $$2, $$3) -> $$1 + ($$3.j() - 0.5) * (double)$$2);

      public static final Codec<dib.b> c = bax.a(dib.b::values);
      private final String d;
      private final dib.b.a e;

      private b(final String $$0, final dib.b.a $$1) {
         this.d = $$0;
         this.e = $$1;
      }

      public double a(double $$0, double $$1, float $$2, bai $$3) {
         return this.e.getCoordinate($$0, $$1, $$2, $$3);
      }

      @Override
      public String c() {
         return this.d;
      }

      @FunctionalInterface
      interface a {
         double getCoordinate(double var1, double var3, float var5, bai var6);
      }
   }

   public static record c(float b, buf c) {
      public static final MapCodec<dib.c> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.FLOAT.optionalFieldOf("movement_scale", 0.0F).forGetter(dib.c::a), buf.c.optionalFieldOf("base", bud.a).forGetter(dib.c::b))
               .apply($$0, dib.c::new)
      );

      public double a(double $$0, bai $$1) {
         return $$0 * (double)this.b + (double)this.c.a($$1);
      }

      public float a() {
         return this.b;
      }

      public buf b() {
         return this.c;
      }
   }
}
