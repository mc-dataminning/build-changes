import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dcw(lp d, dcw.a e, dcw.a f, dcw.c g, dcw.c h, brg i) implements dcj {
   public static final MapCodec<dcw> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               lr.bf.fieldOf("particle").forGetter(dcw::c),
               dcw.a.a.fieldOf("horizontal_position").forGetter(dcw::d),
               dcw.a.a.fieldOf("vertical_position").forGetter(dcw::e),
               dcw.c.a.fieldOf("horizontal_velocity").forGetter(dcw::f),
               dcw.c.a.fieldOf("vertical_velocity").forGetter(dcw::g),
               brg.c.optionalFieldOf("speed", bre.a).forGetter(dcw::h)
            )
            .apply($$0, dcw::new)
   );

   public static dcw.a a(float $$0) {
      return new dcw.a(dcw.b.a, $$0, 1.0F);
   }

   public static dcw.a b() {
      return new dcw.a(dcw.b.b, 0.0F, 1.0F);
   }

   public static dcw.c b(float $$0) {
      return new dcw.c($$0, bre.a);
   }

   public static dcw.c a(brg $$0) {
      return new dcw.c(0.0F, $$0);
   }

   @Override
   public void a(arn $$0, int $$1, dbr $$2, bue $$3, ezn $$4) {
      azs $$5 = $$3.ea();
      ezn $$6 = $$3.ai();
      float $$7 = $$3.ds();
      float $$8 = $$3.dt();
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
   public MapCodec<dcw> a() {
      return a;
   }

   public lp c() {
      return this.d;
   }

   public dcw.a d() {
      return this.e;
   }

   public dcw.a e() {
      return this.f;
   }

   public dcw.c f() {
      return this.g;
   }

   public dcw.c g() {
      return this.h;
   }

   public brg h() {
      return this.i;
   }

   public static record a(dcw.b b, float c, float d) {
      public static final MapCodec<dcw.a> a = RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     dcw.b.c.fieldOf("type").forGetter(dcw.a::a),
                     Codec.FLOAT.optionalFieldOf("offset", 0.0F).forGetter(dcw.a::b),
                     ayt.o.optionalFieldOf("scale", 1.0F).forGetter(dcw.a::c)
                  )
                  .apply($$0, dcw.a::new)
         )
         .validate(
            $$0 -> $$0.a() == dcw.b.a && $$0.c() != 1.0F
                  ? DataResult.error(() -> "Cannot scale an entity position coordinate source")
                  : DataResult.success($$0)
         );

      public double a(double $$0, double $$1, float $$2, azs $$3) {
         return this.b.a($$0, $$1, $$2 * this.d, $$3) + (double)this.c;
      }

      public dcw.b a() {
         return this.b;
      }

      public float b() {
         return this.c;
      }

      public float c() {
         return this.d;
      }
   }

   public static enum b implements bag {
      a("entity_position", ($$0, $$1, $$2, $$3) -> $$0),
      b("in_bounding_box", ($$0, $$1, $$2, $$3) -> $$1 + ($$3.j() - 0.5) * (double)$$2);

      public static final Codec<dcw.b> c = bag.a(dcw.b::values);
      private final String d;
      private final dcw.b.a e;

      private b(final String $$0, final dcw.b.a $$1) {
         this.d = $$0;
         this.e = $$1;
      }

      public double a(double $$0, double $$1, float $$2, azs $$3) {
         return this.e.getCoordinate($$0, $$1, $$2, $$3);
      }

      @Override
      public String c() {
         return this.d;
      }

      @FunctionalInterface
      interface a {
         double getCoordinate(double var1, double var3, float var5, azs var6);
      }
   }

   public static record c(float b, brg c) {
      public static final MapCodec<dcw.c> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.FLOAT.optionalFieldOf("movement_scale", 0.0F).forGetter(dcw.c::a), brg.c.optionalFieldOf("base", bre.a).forGetter(dcw.c::b))
               .apply($$0, dcw.c::new)
      );

      public double a(double $$0, azs $$1) {
         return $$0 * (double)this.b + (double)this.c.a($$1);
      }

      public float a() {
         return this.b;
      }

      public brg b() {
         return this.c;
      }
   }
}
