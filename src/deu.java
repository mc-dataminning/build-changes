import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record deu(lq d, deu.a e, deu.a f, deu.c g, deu.c h, bsd i) implements deh {
   public static final MapCodec<deu> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               ls.bi.fieldOf("particle").forGetter(deu::c),
               deu.a.a.fieldOf("horizontal_position").forGetter(deu::d),
               deu.a.a.fieldOf("vertical_position").forGetter(deu::e),
               deu.c.a.fieldOf("horizontal_velocity").forGetter(deu::f),
               deu.c.a.fieldOf("vertical_velocity").forGetter(deu::g),
               bsd.c.optionalFieldOf("speed", bsb.a).forGetter(deu::h)
            )
            .apply($$0, deu::new)
   );

   public static deu.a a(float $$0) {
      return new deu.a(deu.b.a, $$0, 1.0F);
   }

   public static deu.a b() {
      return new deu.a(deu.b.b, 0.0F, 1.0F);
   }

   public static deu.c b(float $$0) {
      return new deu.c($$0, bsb.a);
   }

   public static deu.c a(bsd $$0) {
      return new deu.c(0.0F, $$0);
   }

   @Override
   public void a(arx $$0, int $$1, ddp $$2, bvb $$3, fbr $$4) {
      bac $$5 = $$3.dZ();
      fbr $$6 = $$3.ah();
      float $$7 = $$3.dr();
      float $$8 = $$3.ds();
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
   public MapCodec<deu> a() {
      return a;
   }

   public lq c() {
      return this.d;
   }

   public deu.a d() {
      return this.e;
   }

   public deu.a e() {
      return this.f;
   }

   public deu.c f() {
      return this.g;
   }

   public deu.c g() {
      return this.h;
   }

   public bsd h() {
      return this.i;
   }

   public static record a(deu.b b, float c, float d) {
      public static final MapCodec<deu.a> a = RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     deu.b.c.fieldOf("type").forGetter(deu.a::a),
                     Codec.FLOAT.optionalFieldOf("offset", 0.0F).forGetter(deu.a::b),
                     azd.o.optionalFieldOf("scale", 1.0F).forGetter(deu.a::c)
                  )
                  .apply($$0, deu.a::new)
         )
         .validate(
            $$0 -> $$0.a() == deu.b.a && $$0.c() != 1.0F
                  ? DataResult.error(() -> "Cannot scale an entity position coordinate source")
                  : DataResult.success($$0)
         );

      public double a(double $$0, double $$1, float $$2, bac $$3) {
         return this.b.a($$0, $$1, $$2 * this.d, $$3) + (double)this.c;
      }

      public deu.b a() {
         return this.b;
      }

      public float b() {
         return this.c;
      }

      public float c() {
         return this.d;
      }
   }

   public static enum b implements baq {
      a("entity_position", ($$0, $$1, $$2, $$3) -> $$0),
      b("in_bounding_box", ($$0, $$1, $$2, $$3) -> $$1 + ($$3.j() - 0.5) * (double)$$2);

      public static final Codec<deu.b> c = baq.a(deu.b::values);
      private final String d;
      private final deu.b.a e;

      private b(final String $$0, final deu.b.a $$1) {
         this.d = $$0;
         this.e = $$1;
      }

      public double a(double $$0, double $$1, float $$2, bac $$3) {
         return this.e.getCoordinate($$0, $$1, $$2, $$3);
      }

      @Override
      public String c() {
         return this.d;
      }

      @FunctionalInterface
      interface a {
         double getCoordinate(double var1, double var3, float var5, bac var6);
      }
   }

   public static record c(float b, bsd c) {
      public static final MapCodec<deu.c> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.FLOAT.optionalFieldOf("movement_scale", 0.0F).forGetter(deu.c::a), bsd.c.optionalFieldOf("base", bsb.a).forGetter(deu.c::b))
               .apply($$0, deu.c::new)
      );

      public double a(double $$0, bac $$1) {
         return $$0 * (double)this.b + (double)this.c.a($$1);
      }

      public float a() {
         return this.b;
      }

      public bsd b() {
         return this.c;
      }
   }
}
