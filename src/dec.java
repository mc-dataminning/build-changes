import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dec(lr d, dec.a e, dec.a f, dec.c g, dec.c h, brm i) implements ddp {
   public static final MapCodec<dec> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               lt.bi.fieldOf("particle").forGetter(dec::c),
               dec.a.a.fieldOf("horizontal_position").forGetter(dec::d),
               dec.a.a.fieldOf("vertical_position").forGetter(dec::e),
               dec.c.a.fieldOf("horizontal_velocity").forGetter(dec::f),
               dec.c.a.fieldOf("vertical_velocity").forGetter(dec::g),
               brm.c.optionalFieldOf("speed", brk.a).forGetter(dec::h)
            )
            .apply($$0, dec::new)
   );

   public static dec.a a(float $$0) {
      return new dec.a(dec.b.a, $$0, 1.0F);
   }

   public static dec.a b() {
      return new dec.a(dec.b.b, 0.0F, 1.0F);
   }

   public static dec.c b(float $$0) {
      return new dec.c($$0, brk.a);
   }

   public static dec.c a(brm $$0) {
      return new dec.c(0.0F, $$0);
   }

   @Override
   public void a(ard $$0, int $$1, dcx $$2, buk $$3, faz $$4) {
      azh $$5 = $$3.dY();
      faz $$6 = $$3.ah();
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
   public MapCodec<dec> a() {
      return a;
   }

   public lr c() {
      return this.d;
   }

   public dec.a d() {
      return this.e;
   }

   public dec.a e() {
      return this.f;
   }

   public dec.c f() {
      return this.g;
   }

   public dec.c g() {
      return this.h;
   }

   public brm h() {
      return this.i;
   }

   public static record a(dec.b b, float c, float d) {
      public static final MapCodec<dec.a> a = RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     dec.b.c.fieldOf("type").forGetter(dec.a::a),
                     Codec.FLOAT.optionalFieldOf("offset", 0.0F).forGetter(dec.a::b),
                     ayi.o.optionalFieldOf("scale", 1.0F).forGetter(dec.a::c)
                  )
                  .apply($$0, dec.a::new)
         )
         .validate(
            $$0 -> $$0.a() == dec.b.a && $$0.c() != 1.0F
                  ? DataResult.error(() -> "Cannot scale an entity position coordinate source")
                  : DataResult.success($$0)
         );

      public double a(double $$0, double $$1, float $$2, azh $$3) {
         return this.b.a($$0, $$1, $$2 * this.d, $$3) + (double)this.c;
      }

      public dec.b a() {
         return this.b;
      }

      public float b() {
         return this.c;
      }

      public float c() {
         return this.d;
      }
   }

   public static enum b implements azv {
      a("entity_position", ($$0, $$1, $$2, $$3) -> $$0),
      b("in_bounding_box", ($$0, $$1, $$2, $$3) -> $$1 + ($$3.j() - 0.5) * (double)$$2);

      public static final Codec<dec.b> c = azv.a(dec.b::values);
      private final String d;
      private final dec.b.a e;

      private b(final String $$0, final dec.b.a $$1) {
         this.d = $$0;
         this.e = $$1;
      }

      public double a(double $$0, double $$1, float $$2, azh $$3) {
         return this.e.getCoordinate($$0, $$1, $$2, $$3);
      }

      @Override
      public String c() {
         return this.d;
      }

      @FunctionalInterface
      interface a {
         double getCoordinate(double var1, double var3, float var5, azh var6);
      }
   }

   public static record c(float b, brm c) {
      public static final MapCodec<dec.c> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.FLOAT.optionalFieldOf("movement_scale", 0.0F).forGetter(dec.c::a), brm.c.optionalFieldOf("base", brk.a).forGetter(dec.c::b))
               .apply($$0, dec.c::new)
      );

      public double a(double $$0, azh $$1) {
         return $$0 * (double)this.b + (double)this.c.a($$1);
      }

      public float a() {
         return this.b;
      }

      public brm b() {
         return this.c;
      }
   }
}
