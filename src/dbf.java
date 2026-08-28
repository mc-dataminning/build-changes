import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dbf(lk d, dbf.a e, dbf.a f, dbf.c g, dbf.c h, bpu i) implements das {
   public static final MapCodec<dbf> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               lm.bf.fieldOf("particle").forGetter(dbf::c),
               dbf.a.a.fieldOf("horizontal_position").forGetter(dbf::d),
               dbf.a.a.fieldOf("vertical_position").forGetter(dbf::e),
               dbf.c.a.fieldOf("horizontal_velocity").forGetter(dbf::f),
               dbf.c.a.fieldOf("vertical_velocity").forGetter(dbf::g),
               bpu.c.optionalFieldOf("speed", bps.a).forGetter(dbf::h)
            )
            .apply($$0, dbf::new)
   );

   public static dbf.a a(float $$0) {
      return new dbf.a(dbf.b.a, $$0, 1.0F);
   }

   public static dbf.a b() {
      return new dbf.a(dbf.b.b, 0.0F, 1.0F);
   }

   public static dbf.c b(float $$0) {
      return new dbf.c($$0, bps.a);
   }

   public static dbf.c a(bpu $$0) {
      return new dbf.c(0.0F, $$0);
   }

   @Override
   public void a(aqu $$0, int $$1, dab $$2, bsr $$3, exc $$4) {
      ayw $$5 = $$3.dR();
      exc $$6 = $$3.ag();
      float $$7 = $$3.dj();
      float $$8 = $$3.dk();
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
   public MapCodec<dbf> a() {
      return a;
   }

   public lk c() {
      return this.d;
   }

   public dbf.a d() {
      return this.e;
   }

   public dbf.a e() {
      return this.f;
   }

   public dbf.c f() {
      return this.g;
   }

   public dbf.c g() {
      return this.h;
   }

   public bpu h() {
      return this.i;
   }

   public static record a(dbf.b b, float c, float d) {
      public static final MapCodec<dbf.a> a = RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                     dbf.b.c.fieldOf("type").forGetter(dbf.a::a),
                     Codec.FLOAT.optionalFieldOf("offset", 0.0F).forGetter(dbf.a::b),
                     axw.m.optionalFieldOf("scale", 1.0F).forGetter(dbf.a::c)
                  )
                  .apply($$0, dbf.a::new)
         )
         .validate(
            $$0 -> $$0.a() == dbf.b.a && $$0.c() != 1.0F
                  ? DataResult.error(() -> "Cannot scale an entity position coordinate source")
                  : DataResult.success($$0)
         );

      public double a(double $$0, double $$1, float $$2, ayw $$3) {
         return this.b.a($$0, $$1, $$2 * this.d, $$3) + (double)this.c;
      }

      public dbf.b a() {
         return this.b;
      }

      public float b() {
         return this.c;
      }

      public float c() {
         return this.d;
      }
   }

   public static enum b implements azk {
      a("entity_position", ($$0, $$1, $$2, $$3) -> $$0),
      b("in_bounding_box", ($$0, $$1, $$2, $$3) -> $$1 + ($$3.j() - 0.5) * (double)$$2);

      public static final Codec<dbf.b> c = azk.a(dbf.b::values);
      private final String d;
      private final dbf.b.a e;

      private b(final String $$0, final dbf.b.a $$1) {
         this.d = $$0;
         this.e = $$1;
      }

      public double a(double $$0, double $$1, float $$2, ayw $$3) {
         return this.e.getCoordinate($$0, $$1, $$2, $$3);
      }

      @Override
      public String c() {
         return this.d;
      }

      @FunctionalInterface
      interface a {
         double getCoordinate(double var1, double var3, float var5, ayw var6);
      }
   }

   public static record c(float b, bpu c) {
      public static final MapCodec<dbf.c> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.FLOAT.optionalFieldOf("movement_scale", 0.0F).forGetter(dbf.c::a), bpu.c.optionalFieldOf("base", bps.a).forGetter(dbf.c::b))
               .apply($$0, dbf.c::new)
      );

      public double a(double $$0, ayw $$1) {
         return $$0 * (double)this.b + (double)this.c.a($$1);
      }

      public float a() {
         return this.b;
      }

      public bpu b() {
         return this.c;
      }
   }
}
